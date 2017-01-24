// POST

${PostOperation} postOp = ApiOperations.${PostOperation}();

${ResourceType} res = new ${ResourceType}();

${PayloadData}

postOp.setPayload(res);


ApiRequest<${PostOperation}> postReq = new ApiRequest<>(postOp);

ApiResponse<${ResourceType}> postRes = test(postReq, caller);


${TestAssertions}


return postRes;