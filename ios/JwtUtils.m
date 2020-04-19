
#import "JwtUtils.h"

@implementation JwtUtils

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(verify: (NSString*)token
                       x: (NSString*)x
                       y: (NSString*)y
                resolver: (RCTPromiseResolveBlock)resolve
                rejecter: (RCTPromiseRejectBlock)reject)
{
    resolve(true);
}

@end
  
