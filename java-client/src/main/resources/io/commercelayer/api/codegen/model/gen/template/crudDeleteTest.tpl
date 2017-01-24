// DELETE

${DeleteOperation} delOp = ApiOperations.${DeleteOperation}();
delOp.setId(res.getId());

ApiRequest<${DeleteOperation}> delReq = new ApiRequest<>(delOp);

ApiResponse<${ResourceType}> delRes = test(delReq, caller);

// GET

${GetOperation} getOp = ApiOperations.${GetOperation}();
getOp.setId(res.getId());

ApiRequest<${GetOperation}> getReq = new ApiRequest<>(getOp);

ApiResponse<${ResourceType}> getRes = null;

try {
	getRes = test(getReq, caller, false);
}
catch (TestException te) {
	if (te.causedByApiError()) {
		Assert.assertTrue(te.getError().getHttpErrorCode() == 404);
		Assert.assertNull(getRes);
	}
	else throw te;
}


return delRes;