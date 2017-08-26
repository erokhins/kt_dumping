'resultCode' @ [24:32] ==> public final val <D : CallableDescriptor> AbstractOverloadResolutionResults<D>.resultCode: OverloadResolutionResults.Code[MyPropertyDescriptor]
Inferred types:
    <D : CallableDescriptor> -> D

'isSuccess' @ [24:43] ==> public/*package*/ for synthetic extension final val OverloadResolutionResults.Code.isSuccess: Boolean[MyPropertyDescriptor]

'resultingCalls' @ [25:37] ==> public final val <D : CallableDescriptor> AbstractOverloadResolutionResults<D>.resultingCalls: (MutableCollection<out (ResolvedCall<(D..D?)>..ResolvedCall<(D..D?)>?)>..Collection<(ResolvedCall<(D..D?)>..ResolvedCall<(D..D?)>?)>)[MyPropertyDescriptor]
Inferred types:
    <D : CallableDescriptor> -> D

'size' @ [25:52] ==> public abstract val size: Int defined in kotlin.collections.MutableCollection[DeserializedPropertyDescriptor]

'resultCode' @ [25:65] ==> public final val <D : CallableDescriptor> AbstractOverloadResolutionResults<D>.resultCode: OverloadResolutionResults.Code[MyPropertyDescriptor]
Inferred types:
    <D : CallableDescriptor> -> D

'CANDIDATES_WITH_WRONG_RECEIVER' @ [25:110] ==> enum entry CANDIDATES_WITH_WRONG_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.results.OverloadResolutionResults.Code[FakeCallableDescriptorForObject]

'resultCode' @ [26:32] ==> public final val <D : CallableDescriptor> AbstractOverloadResolutionResults<D>.resultCode: OverloadResolutionResults.Code[MyPropertyDescriptor]
Inferred types:
    <D : CallableDescriptor> -> D

'NAME_NOT_FOUND' @ [26:77] ==> enum entry NAME_NOT_FOUND defined in org.jetbrains.kotlin.resolve.calls.results.OverloadResolutionResults.Code[FakeCallableDescriptorForObject]

'resultCode' @ [27:34] ==> public final val <D : CallableDescriptor> AbstractOverloadResolutionResults<D>.resultCode: OverloadResolutionResults.Code[MyPropertyDescriptor]
Inferred types:
    <D : CallableDescriptor> -> D

'AMBIGUITY' @ [27:79] ==> enum entry AMBIGUITY defined in org.jetbrains.kotlin.resolve.calls.results.OverloadResolutionResults.Code[FakeCallableDescriptorForObject]

'resultCode' @ [28:35] ==> public final val <D : CallableDescriptor> AbstractOverloadResolutionResults<D>.resultCode: OverloadResolutionResults.Code[MyPropertyDescriptor]
Inferred types:
    <D : CallableDescriptor> -> D

'INCOMPLETE_TYPE_INFERENCE' @ [28:80] ==> enum entry INCOMPLETE_TYPE_INFERENCE defined in org.jetbrains.kotlin.resolve.calls.results.OverloadResolutionResults.Code[FakeCallableDescriptorForObject]

'AbstractOverloadResolutionResults<D>' @ [31:92] ==> public constructor AbstractOverloadResolutionResults<D : CallableDescriptor>() defined in org.jetbrains.kotlin.resolve.calls.results.AbstractOverloadResolutionResults[ClassConstructorDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'listOf' @ [33:69] ==> public fun <T> listOf(element: ResolvedCall<D>): List<ResolvedCall<D>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<D>

'result' @ [33:76] ==> public final val result: ResolvedCall<D> defined in org.jetbrains.kotlin.resolve.calls.results.SingleOverloadResolutionResult[PropertyDescriptorImpl]

'result' @ [34:39] ==> public final val result: ResolvedCall<D> defined in org.jetbrains.kotlin.resolve.calls.results.SingleOverloadResolutionResult[PropertyDescriptorImpl]

'result' @ [36:48] ==> public final val result: ResolvedCall<D> defined in org.jetbrains.kotlin.resolve.calls.results.SingleOverloadResolutionResult[PropertyDescriptorImpl]

'resultingDescriptor' @ [36:55] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<D>.resultingDescriptor: D[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'when (result.status) {
        ResolutionStatus.SUCCESS -> Code.SUCCESS
        ResolutionStatus.RECEIVER_TYPE_ERROR -> Code.CANDIDATES_WITH_WRONG_RECEIVER
        ResolutionStatus.INCOMPLETE_TYPE_INFERENCE -> Code.INCOMPLETE_TYPE_INFERENCE
        else -> Code.SINGLE_CANDIDATE_ARGUMENT_MISMATCH
    }' @ [38:42] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: OverloadResolutionResults.Code, entry1: OverloadResolutionResults.Code, entry2: OverloadResolutionResults.Code, entry3: OverloadResolutionResults.Code): OverloadResolutionResults.Code[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Code

'result' @ [38:48] ==> public final val result: ResolvedCall<D> defined in org.jetbrains.kotlin.resolve.calls.results.SingleOverloadResolutionResult[PropertyDescriptorImpl]

'status' @ [38:55] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<D>.status: ResolutionStatus[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'SUCCESS' @ [39:26] ==> enum entry SUCCESS defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'SUCCESS' @ [39:42] ==> enum entry SUCCESS defined in org.jetbrains.kotlin.resolve.calls.results.OverloadResolutionResults.Code[FakeCallableDescriptorForObject]

'RECEIVER_TYPE_ERROR' @ [40:26] ==> enum entry RECEIVER_TYPE_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'CANDIDATES_WITH_WRONG_RECEIVER' @ [40:54] ==> enum entry CANDIDATES_WITH_WRONG_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.results.OverloadResolutionResults.Code[FakeCallableDescriptorForObject]

'INCOMPLETE_TYPE_INFERENCE' @ [41:26] ==> enum entry INCOMPLETE_TYPE_INFERENCE defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'INCOMPLETE_TYPE_INFERENCE' @ [41:60] ==> enum entry INCOMPLETE_TYPE_INFERENCE defined in org.jetbrains.kotlin.resolve.calls.results.OverloadResolutionResults.Code[FakeCallableDescriptorForObject]

'SINGLE_CANDIDATE_ARGUMENT_MISMATCH' @ [42:22] ==> enum entry SINGLE_CANDIDATE_ARGUMENT_MISMATCH defined in org.jetbrains.kotlin.resolve.calls.results.OverloadResolutionResults.Code[FakeCallableDescriptorForObject]

'AbstractOverloadResolutionResults<D>' @ [46:67] ==> public constructor AbstractOverloadResolutionResults<D : CallableDescriptor>() defined in org.jetbrains.kotlin.resolve.calls.results.AbstractOverloadResolutionResults[ClassConstructorDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'emptyList' @ [48:69] ==> public fun <T> emptyList(): List<ResolvedCall<D>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<D>

'error' @ [49:39] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'error' @ [50:45] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'NAME_NOT_FOUND' @ [51:41] ==> enum entry NAME_NOT_FOUND defined in org.jetbrains.kotlin.resolve.calls.results.OverloadResolutionResults.Code[FakeCallableDescriptorForObject]

'AbstractOverloadResolutionResults<D>' @ [56:5] ==> public constructor AbstractOverloadResolutionResults<D : CallableDescriptor>() defined in org.jetbrains.kotlin.resolve.calls.results.AbstractOverloadResolutionResults[ClassConstructorDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'candidates' @ [58:69] ==> public final val candidates: Collection<ResolvedCall<D>> defined in org.jetbrains.kotlin.resolve.calls.results.ManyCandidates[PropertyDescriptorImpl]

'error' @ [59:39] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'error' @ [60:45] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'when(candidates.first().status) {
                ResolutionStatus.RECEIVER_TYPE_ERROR -> Code.CANDIDATES_WITH_WRONG_RECEIVER
                ResolutionStatus.SUCCESS -> Code.AMBIGUITY
                ResolutionStatus.INCOMPLETE_TYPE_INFERENCE -> Code.INCOMPLETE_TYPE_INFERENCE
                else -> Code.MANY_FAILED_CANDIDATES
            }' @ [62:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: OverloadResolutionResults.Code, entry1: OverloadResolutionResults.Code, entry2: OverloadResolutionResults.Code, entry3: OverloadResolutionResults.Code): OverloadResolutionResults.Code[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Code

'candidates' @ [62:18] ==> public final val candidates: Collection<ResolvedCall<D>> defined in org.jetbrains.kotlin.resolve.calls.results.ManyCandidates[PropertyDescriptorImpl]

'first' @ [62:29] ==> public fun <T> Iterable<ResolvedCall<D>>.first(): ResolvedCall<D> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<D>

'status' @ [62:37] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<D>.status: ResolutionStatus[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'RECEIVER_TYPE_ERROR' @ [63:34] ==> enum entry RECEIVER_TYPE_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'CANDIDATES_WITH_WRONG_RECEIVER' @ [63:62] ==> enum entry CANDIDATES_WITH_WRONG_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.results.OverloadResolutionResults.Code[FakeCallableDescriptorForObject]

'SUCCESS' @ [64:34] ==> enum entry SUCCESS defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'AMBIGUITY' @ [64:50] ==> enum entry AMBIGUITY defined in org.jetbrains.kotlin.resolve.calls.results.OverloadResolutionResults.Code[FakeCallableDescriptorForObject]

'INCOMPLETE_TYPE_INFERENCE' @ [65:34] ==> enum entry INCOMPLETE_TYPE_INFERENCE defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'INCOMPLETE_TYPE_INFERENCE' @ [65:68] ==> enum entry INCOMPLETE_TYPE_INFERENCE defined in org.jetbrains.kotlin.resolve.calls.results.OverloadResolutionResults.Code[FakeCallableDescriptorForObject]

'MANY_FAILED_CANDIDATES' @ [66:30] ==> enum entry MANY_FAILED_CANDIDATES defined in org.jetbrains.kotlin.resolve.calls.results.OverloadResolutionResults.Code[FakeCallableDescriptorForObject]

'NameNotFoundResolutionResult<D>' @ [72:103] ==> public constructor NameNotFoundResolutionResult<D : CallableDescriptor>() defined in org.jetbrains.kotlin.resolve.calls.results.NameNotFoundResolutionResult[ClassConstructorDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'allCandidates' @ [73:39] ==> private final val allCandidates: Collection<ResolvedCall<D>> defined in org.jetbrains.kotlin.resolve.calls.results.AllCandidates[PropertyDescriptorImpl]

