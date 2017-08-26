'element' @ [34:9] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints[ValueParameterDescriptorImpl]

'valueArguments' @ [34:17] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'none' @ [34:32] ==> public inline fun <T> Iterable<(KtValueArgument..KtValueArgument?)>.none(predicate: ((KtValueArgument..KtValueArgument?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'it' @ [34:39] ==> value-parameter it: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [34:42] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'isUnclearExpression' @ [34:67] ==> private fun KtExpression.isUnclearExpression(): Boolean defined in org.jetbrains.kotlin.idea.parameterInfo in file ArgumentNameHints.kt[SimpleFunctionDescriptorImpl]

'emptyList' @ [34:107] ==> public fun <T> emptyList(): List<InlayInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InlayInfo

'element' @ [35:15] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints[ValueParameterDescriptorImpl]

'analyze' @ [35:23] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [35:47] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'element' @ [36:16] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints[ValueParameterDescriptorImpl]

'getCall' @ [36:24] ==> public fun KtElement.getCall(context: BindingContext): Call? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'ctx' @ [36:32] ==> val ctx: BindingContext defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints[LocalVariableDescriptor]

'emptyList' @ [36:47] ==> public fun <T> emptyList(): List<InlayInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InlayInfo

'call' @ [37:24] ==> val call: Call defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints[LocalVariableDescriptor]

'getResolvedCall' @ [37:29] ==> public fun Call?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'ctx' @ [37:45] ==> val ctx: BindingContext defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints[LocalVariableDescriptor]

'resolvedCall' @ [38:9] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints[LocalVariableDescriptor]

'getParameterInfoForCallCandidate' @ [39:16] ==> private fun getParameterInfoForCallCandidate(resolvedCall: ResolvedCall<out CallableDescriptor>): List<InlayInfo> defined in org.jetbrains.kotlin.idea.parameterInfo in file ArgumentNameHints.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [39:49] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints[LocalVariableDescriptor]

'call' @ [41:22] ==> val call: Call defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints[LocalVariableDescriptor]

'resolveCandidates' @ [41:27] ==> public fun Call.resolveCandidates(bindingContext: BindingContext, resolutionFacade: ResolutionFacade, expectedType: KotlinType = ..., filterOutWrongReceiver: Boolean = ..., filterOutByVisibility: Boolean = ...): Collection<ResolvedCall<FunctionDescriptor>> defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'ctx' @ [41:45] ==> val ctx: BindingContext defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints[LocalVariableDescriptor]

'element' @ [41:50] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [41:58] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'candidates' @ [42:9] ==> val candidates: Collection<ResolvedCall<FunctionDescriptor>> defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints[LocalVariableDescriptor]

'isEmpty' @ [42:20] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [42:38] ==> public fun <T> emptyList(): List<InlayInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InlayInfo

'candidates' @ [43:5] ==> val candidates: Collection<ResolvedCall<FunctionDescriptor>> defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints[LocalVariableDescriptor]

'singleOrNull' @ [43:16] ==> public fun <T> Iterable<ResolvedCall<FunctionDescriptor>>.singleOrNull(): ResolvedCall<FunctionDescriptor>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<FunctionDescriptor>

'let' @ [43:32] ==> @InlineOnly public inline fun <T, R> ResolvedCall<FunctionDescriptor>.let(block: (ResolvedCall<FunctionDescriptor>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<FunctionDescriptor>
    <R> -> Nothing

'getParameterInfoForCallCandidate' @ [43:45] ==> private fun getParameterInfoForCallCandidate(resolvedCall: ResolvedCall<out CallableDescriptor>): List<InlayInfo> defined in org.jetbrains.kotlin.idea.parameterInfo in file ArgumentNameHints.kt[SimpleFunctionDescriptorImpl]

'it' @ [43:78] ==> value-parameter it: ResolvedCall<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints.<anonymous>[ValueParameterDescriptorImpl]

'candidates' @ [44:12] ==> val candidates: Collection<ResolvedCall<FunctionDescriptor>> defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints[LocalVariableDescriptor]

'map' @ [44:23] ==> public inline fun <T, R> Iterable<ResolvedCall<FunctionDescriptor>>.map(transform: (ResolvedCall<FunctionDescriptor>) -> List<InlayInfo>): List<List<InlayInfo>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<FunctionDescriptor>
    <R> -> List<InlayInfo>

'getParameterInfoForCallCandidate' @ [44:29] ==> private fun getParameterInfoForCallCandidate(resolvedCall: ResolvedCall<out CallableDescriptor>): List<InlayInfo> defined in org.jetbrains.kotlin.idea.parameterInfo in file ArgumentNameHints.kt[SimpleFunctionDescriptorImpl]

'it' @ [44:62] ==> value-parameter it: ResolvedCall<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints.<anonymous>[ValueParameterDescriptorImpl]

'reduce' @ [44:68] ==> public inline fun <S, T : List<InlayInfo>> Iterable<List<InlayInfo>>.reduce(operation: (acc: List<InlayInfo>, List<InlayInfo>) -> List<InlayInfo>): List<InlayInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> List<InlayInfo>
    <T : S> -> List<InlayInfo>

'infos1' @ [45:23] ==> value-parameter infos1: List<InlayInfo> defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints.<anonymous>[ValueParameterDescriptorImpl]

'indices' @ [45:30] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'index' @ [46:17] ==> val index: Int defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints.<anonymous>[LocalVariableDescriptor]

'infos2' @ [46:26] ==> value-parameter infos2: List<InlayInfo> defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [46:33] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'infos1' @ [46:41] ==> value-parameter infos1: List<InlayInfo> defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [46:48] ==> val index: Int defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints.<anonymous>[LocalVariableDescriptor]

'infos2' @ [46:58] ==> value-parameter infos2: List<InlayInfo> defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [46:65] ==> val index: Int defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints.<anonymous>[LocalVariableDescriptor]

'infos1' @ [47:31] ==> value-parameter infos1: List<InlayInfo> defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints.<anonymous>[ValueParameterDescriptorImpl]

'subList' @ [47:38] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): List<InlayInfo> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'index' @ [47:49] ==> val index: Int defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints.<anonymous>[LocalVariableDescriptor]

'infos1' @ [50:9] ==> value-parameter infos1: List<InlayInfo> defined in org.jetbrains.kotlin.idea.parameterInfo.provideArgumentNameHints.<anonymous>[ValueParameterDescriptorImpl]

'resolvedCall' @ [55:12] ==> value-parameter resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.parameterInfo.getParameterInfoForCallCandidate[ValueParameterDescriptorImpl]

'valueArguments' @ [55:25] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.valueArguments: (MutableMap<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>..Map<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'mapNotNull' @ [55:40] ==> public inline fun <K, V, R : Any> Map<out (ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>.mapNotNull(transform: (Map.Entry<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>) -> InlayInfo?): List<InlayInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <V> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument..org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument?)
    <R : Any> -> InlayInfo

'component1' @ [55:54] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>.component1(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <V> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument..org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument?)

'component2' @ [55:92] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>.component2(): (ResolvedValueArgument..ResolvedValueArgument?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <V> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument..org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument?)

'resolvedArg' @ [56:9] ==> val resolvedArg: (ResolvedValueArgument..ResolvedValueArgument?) defined in org.jetbrains.kotlin.idea.parameterInfo.getParameterInfoForCallCandidate.<anonymous>[LocalVariableDescriptor]

'arguments' @ [56:21] ==> public final val ResolvedValueArgument.arguments: (MutableList<(ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'firstOrNull' @ [56:31] ==> public fun <T> List<(ValueArgument..ValueArgument?)>.firstOrNull(): ValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'let' @ [56:46] ==> @InlineOnly public inline fun <T, R> ValueArgument.let(block: (ValueArgument) -> Unit?): Unit? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueArgument
    <R> -> Unit?

'arg' @ [57:13] ==> value-parameter arg: ValueArgument defined in org.jetbrains.kotlin.idea.parameterInfo.getParameterInfoForCallCandidate.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [57:17] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'let' @ [57:42] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Unit

'!' @ [58:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'arg' @ [58:22] ==> value-parameter arg: ValueArgument defined in org.jetbrains.kotlin.idea.parameterInfo.getParameterInfoForCallCandidate.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isNamed' @ [58:26] ==> public abstract fun isNamed(): Boolean defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'!' @ [58:39] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'valueParam' @ [58:40] ==> val valueParam: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.parameterInfo.getParameterInfoForCallCandidate.<anonymous>[LocalVariableDescriptor]

'name' @ [58:51] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'isSpecial' @ [58:56] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'argExp' @ [58:69] ==> value-parameter argExp: KtExpression defined in org.jetbrains.kotlin.idea.parameterInfo.getParameterInfoForCallCandidate.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isUnclearExpression' @ [58:76] ==> private fun KtExpression.isUnclearExpression(): Boolean defined in org.jetbrains.kotlin.idea.parameterInfo in file ArgumentNameHints.kt[SimpleFunctionDescriptorImpl]

'if (valueParam.varargElementType != null) "..." else ""' @ [59:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'valueParam' @ [59:38] ==> val valueParam: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.parameterInfo.getParameterInfoForCallCandidate.<anonymous>[LocalVariableDescriptor]

'varargElementType' @ [59:49] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'InlayInfo' @ [60:39] ==> public constructor InlayInfo(text: String, offset: Int) defined in com.intellij.codeInsight.hints.InlayInfo[DeserializedClassConstructorDescriptor]

'prefix' @ [60:49] ==> val prefix: String defined in org.jetbrains.kotlin.idea.parameterInfo.getParameterInfoForCallCandidate.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'valueParam' @ [60:58] ==> val valueParam: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.parameterInfo.getParameterInfoForCallCandidate.<anonymous>[LocalVariableDescriptor]

'name' @ [60:69] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'identifier' @ [60:74] ==> public final val Name.identifier: String[MyPropertyDescriptor]

'argExp' @ [60:86] ==> value-parameter argExp: KtExpression defined in org.jetbrains.kotlin.idea.parameterInfo.getParameterInfoForCallCandidate.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startOffset' @ [60:93] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'when(this) {
    is KtConstantExpression, is KtThisExpression, is KtBinaryExpression, is KtStringTemplateExpression -> true
    is KtPrefixExpression -> baseExpression is KtConstantExpression && (operationToken == KtTokens.PLUS || operationToken == KtTokens.MINUS)
    else -> false
}' @ [68:50] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [68:55] ==> <this> defined in org.jetbrains.kotlin.idea.parameterInfo.isUnclearExpression[ReceiverParameterDescriptorImpl]

'baseExpression' @ [70:30] ==> public final val KtPrefixExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'operationToken' @ [70:73] ==> public final val KtPrefixExpression.operationToken: (IElementType..IElementType?)[MyPropertyDescriptor]

'PLUS' @ [70:100] ==> public final val PLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'operationToken' @ [70:108] ==> public final val KtPrefixExpression.operationToken: (IElementType..IElementType?)[MyPropertyDescriptor]

'MINUS' @ [70:135] ==> public final val MINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

