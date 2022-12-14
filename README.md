# gRPC - Remote Procedure Call

- Developed by Google
- Inspired by Stubby
- Released in 2016

## Why gRPC ?

- HTTP 1.0 request involve 3 calls before establising connection - an overhead - Its an Request & Response protocol
- HTTP is a stateless 
    - contains headers in every request
    - carries info like cookie
    - plain text - relatively large in size
    - cannot be compressed
- Serialization and deserialization overhead 
- Client SDK - required for every language in case of serialization and deseriali

### HTTP 2
- binary communication
- header compression
- Flow control - backpressure
- Multiplexing - multiple request in one request

## gRPC

- HTTP2 is default protocal in gRPC
- Non-blocking, Streaming bindings
- Protobuf
  - Strict Typing
  - DTO
  - Service definitions
  - Language agnostics
  - Auto generated bidings for multiple languages
- Good for Mobile apps

## gRPC vs REST

- REST - Resource oriented 
- gRPC - Action oriented

## Protocol Buffers (protobuf)

- IDL(Iterface Description Language) for API
- Platform Neutral
- Language Neutral
- used of Serial/deserial structured data
- Very Fast/Optimized for interservice communication
- Provide client lib for many languages

## Generate proto objects in diff language

- Use protoc binary and call cmd - `protoc --js_out=./ *.proto ` where the proto files are present
- you can generate in almost all language js_out is javascript similarly you have python,c,c++ ... etc
- [https://github.com/protocolbuffers/protobuf/releases/tag/v21.1]() - protoc binary

## proto types - example

| Java        | proto       | Default value |
| ----------- | ----------- | ------------- |
| int         | int32       | 0             |
| long        | int64       | 0             |
| float       | float       | 0             |
| double      | double      | 0             |
| boolean     | bool        | false         |
| String      | string      | empty string  |
| byte[]      | bytes       |               |
| Collection  | repeated    | empty list    |
| Map         | map         | empty map     |
| enum        | enum        | first value   |

## Note
> protobuff - doesnt return null value - its either default or empty 

## proto OneOf

## proto wrapper type - `import google/protobuf/wrappers.proto`

## proto tags - 

## Note
> reserved key word is used for making sure the tag/name isnt used in message updates

# RPC - Types
 
- Unary 
- Server Streaming
- Client Streaming 
- Bidirectional Streaming