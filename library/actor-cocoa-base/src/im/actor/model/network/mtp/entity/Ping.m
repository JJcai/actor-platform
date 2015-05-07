//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: /Users/ex3ndr/Develop/actor-model/library/actor-cocoa-base/build/java/im/actor/model/network/mtp/entity/Ping.java
//


#include "IOSClass.h"
#include "J2ObjC_source.h"
#include "im/actor/model/droidkit/bser/DataInput.h"
#include "im/actor/model/droidkit/bser/DataOutput.h"
#include "im/actor/model/network/mtp/entity/Ping.h"
#include "im/actor/model/network/mtp/entity/ProtoStruct.h"
#include "java/io/IOException.h"

@interface MTPing () {
 @public
  jlong randomId_;
}

@end

@implementation MTPing

- (instancetype)initWithBSDataInput:(BSDataInput *)stream {
  MTPing_initWithBSDataInput_(self, stream);
  return self;
}

- (instancetype)initWithLong:(jlong)randomId {
  MTPing_initWithLong_(self, randomId);
  return self;
}

- (jlong)getRandomId {
  return randomId_;
}

- (jbyte)getHeader {
  return MTPing_HEADER;
}

- (void)writeBodyWithBSDataOutput:(BSDataOutput *)bs {
  [((BSDataOutput *) nil_chk(bs)) writeLongWithLong:randomId_];
}

- (void)readBodyWithBSDataInput:(BSDataInput *)bs {
  randomId_ = [((BSDataInput *) nil_chk(bs)) readLong];
}

- (NSString *)description {
  return JreStrcat("$JC", @"Ping{", randomId_, '}');
}

@end

void MTPing_initWithBSDataInput_(MTPing *self, BSDataInput *stream) {
  (void) MTProtoStruct_initWithBSDataInput_(self, stream);
}

MTPing *new_MTPing_initWithBSDataInput_(BSDataInput *stream) {
  MTPing *self = [MTPing alloc];
  MTPing_initWithBSDataInput_(self, stream);
  return self;
}

void MTPing_initWithLong_(MTPing *self, jlong randomId) {
  (void) MTProtoStruct_init(self);
  self->randomId_ = randomId;
}

MTPing *new_MTPing_initWithLong_(jlong randomId) {
  MTPing *self = [MTPing alloc];
  MTPing_initWithLong_(self, randomId);
  return self;
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(MTPing)
