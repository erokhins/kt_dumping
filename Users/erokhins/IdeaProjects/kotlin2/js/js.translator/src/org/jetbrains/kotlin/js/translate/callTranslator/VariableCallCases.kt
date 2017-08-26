'VariableAccessCase' @ [39:35] ==> public constructor VariableAccessCase() defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessCase[ClassConstructorDescriptorImpl]

'constructAccessExpression' @ [41:16] ==> public fun VariableAccessInfo.constructAccessExpression(ref: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[SimpleFunctionDescriptorImpl]

'JsNameRef' @ [41:42] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'variableName' @ [41:52] ==> public val VariableAccessInfo.variableName: JsName defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[PropertyDescriptorImpl]

'extensionReceiver' @ [41:66] ==> public open val extensionReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'resolvedCall' @ [45:26] ==> public open val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'resultingDescriptor' @ [45:39] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'if (descriptor is PropertyDescriptor && TranslationUtils.shouldAccessViaFunctions(descriptor)) {
            val methodRef = context.getNameForDescriptor(getAccessDescriptorIfNeeded())
            JsInvocation(pureFqn(methodRef, dispatchReceiver!!), *additionalArguments.toTypedArray())
        }
        else {
            constructAccessExpression(JsNameRef(variableName, dispatchReceiver!!))
        }' @ [46:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression, elseBranch: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression

'descriptor' @ [46:20] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.NativeVariableAccessCase.dispatchReceiver[LocalVariableDescriptor]

'shouldAccessViaFunctions' @ [46:73] ==> public open fun shouldAccessViaFunctions(@NotNull descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.TranslationUtils[JavaMethodDescriptor]

'descriptor' @ [46:98] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.NativeVariableAccessCase.dispatchReceiver[LocalVariableDescriptor]

'context' @ [47:29] ==> public open val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'getNameForDescriptor' @ [47:37] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'getAccessDescriptorIfNeeded' @ [47:58] ==> public fun VariableAccessInfo.getAccessDescriptorIfNeeded(): CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[SimpleFunctionDescriptorImpl]

'JsInvocation' @ [48:13] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'pureFqn' @ [48:26] ==> @NotNull public open fun pureFqn(@NotNull identifier: JsName, @Nullable qualifier: JsExpression?): JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'methodRef' @ [48:34] ==> val methodRef: JsName defined in org.jetbrains.kotlin.js.translate.callTranslator.NativeVariableAccessCase.dispatchReceiver[LocalVariableDescriptor]

'dispatchReceiver' @ [48:45] ==> public open val dispatchReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'additionalArguments' @ [48:67] ==> private val VariableAccessInfo.additionalArguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.callTranslator in file VariableCallCases.kt[PropertyDescriptorImpl]

'toTypedArray' @ [48:87] ==> public inline fun <reified T> Collection<JsExpression>.toTypedArray(): Array<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> JsExpression

'constructAccessExpression' @ [51:13] ==> public fun VariableAccessInfo.constructAccessExpression(ref: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[SimpleFunctionDescriptorImpl]

'JsNameRef' @ [51:39] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'variableName' @ [51:49] ==> public val VariableAccessInfo.variableName: JsName defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[PropertyDescriptorImpl]

'dispatchReceiver' @ [51:63] ==> public open val dispatchReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'resolvedCall' @ [56:26] ==> public open val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'resultingDescriptor' @ [56:39] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'if (descriptor is PropertyDescriptor && TranslationUtils.shouldAccessViaFunctions(descriptor)) {
            val methodRef = ReferenceTranslator.translateAsValueReference(getAccessDescriptorIfNeeded(), context)
            JsInvocation(methodRef, *additionalArguments.toTypedArray())
        }
        else {
            constructAccessExpression(context.getQualifiedReference(callableDescriptor))
        }' @ [57:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression, elseBranch: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression

'descriptor' @ [57:20] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.NativeVariableAccessCase.noReceivers[LocalVariableDescriptor]

'shouldAccessViaFunctions' @ [57:73] ==> public open fun shouldAccessViaFunctions(@NotNull descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.TranslationUtils[JavaMethodDescriptor]

'descriptor' @ [57:98] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.NativeVariableAccessCase.noReceivers[LocalVariableDescriptor]

'translateAsValueReference' @ [58:49] ==> @NotNull public open fun translateAsValueReference(@NotNull descriptor: DeclarationDescriptor, @NotNull context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.ReferenceTranslator[JavaMethodDescriptor]

'getAccessDescriptorIfNeeded' @ [58:75] ==> public fun VariableAccessInfo.getAccessDescriptorIfNeeded(): CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[SimpleFunctionDescriptorImpl]

'context' @ [58:106] ==> public open val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'JsInvocation' @ [59:13] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'methodRef' @ [59:26] ==> val methodRef: JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.NativeVariableAccessCase.noReceivers[LocalVariableDescriptor]

'additionalArguments' @ [59:38] ==> private val VariableAccessInfo.additionalArguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.callTranslator in file VariableCallCases.kt[PropertyDescriptorImpl]

'toTypedArray' @ [59:58] ==> public inline fun <reified T> Collection<JsExpression>.toTypedArray(): Array<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> JsExpression

'constructAccessExpression' @ [62:13] ==> public fun VariableAccessInfo.constructAccessExpression(ref: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[SimpleFunctionDescriptorImpl]

'context' @ [62:39] ==> public open val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'getQualifiedReference' @ [62:47] ==> @NotNull public open fun getQualifiedReference(@NotNull descriptor: DeclarationDescriptor): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'callableDescriptor' @ [62:69] ==> public val CallInfo.callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[PropertyDescriptorImpl]

'VariableAccessCase' @ [67:36] ==> public constructor VariableAccessCase() defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessCase[ClassConstructorDescriptorImpl]

'this' @ [69:34] ==> <this> defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[ReceiverParameterDescriptorImpl]

'variableDescriptor' @ [69:39] ==> public val VariableAccessInfo.variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[PropertyDescriptorImpl]

'variableDescriptor' @ [71:13] ==> val variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'!' @ [72:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSimpleFinalProperty' @ [72:32] ==> public open fun isSimpleFinalProperty(@NotNull propertyDescriptor: PropertyDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.JsDescriptorUtils[JavaMethodDescriptor]

'variableDescriptor' @ [72:54] ==> val variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'context' @ [73:13] ==> public open val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'isFromCurrentModule' @ [73:21] ==> public open fun isFromCurrentModule(@NotNull descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'variableDescriptor' @ [73:41] ==> val variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'context' @ [75:29] ==> public open val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'getInnerReference' @ [75:37] ==> @NotNull public open fun getInnerReference(@NotNull descriptor: DeclarationDescriptor): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'getAccessDescriptor' @ [75:55] ==> public fun VariableAccessInfo.getAccessDescriptor(): PropertyAccessorDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[SimpleFunctionDescriptorImpl]

'JsInvocation' @ [76:20] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'methodRef' @ [76:33] ==> val methodRef: JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'additionalArguments' @ [76:45] ==> private val VariableAccessInfo.additionalArguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.callTranslator in file VariableCallCases.kt[PropertyDescriptorImpl]

'toTypedArray' @ [76:65] ==> public inline fun <reified T> Collection<JsExpression>.toTypedArray(): Array<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> JsExpression

'resolvedCall' @ [79:26] ==> public open val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'resultingDescriptor' @ [79:39] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'descriptor' @ [80:13] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'shouldAccessViaFunctions' @ [80:66] ==> public open fun shouldAccessViaFunctions(@NotNull descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.TranslationUtils[JavaMethodDescriptor]

'descriptor' @ [80:91] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'translateAsValueReference' @ [81:49] ==> @NotNull public open fun translateAsValueReference(@NotNull descriptor: DeclarationDescriptor, @NotNull context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.ReferenceTranslator[JavaMethodDescriptor]

'getAccessDescriptorIfNeeded' @ [81:75] ==> public fun VariableAccessInfo.getAccessDescriptorIfNeeded(): CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[SimpleFunctionDescriptorImpl]

'context' @ [81:106] ==> public open val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'JsInvocation' @ [82:20] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'methodRef' @ [82:33] ==> val methodRef: JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'additionalArguments' @ [82:45] ==> private val VariableAccessInfo.additionalArguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.callTranslator in file VariableCallCases.kt[PropertyDescriptorImpl]

'toTypedArray' @ [82:65] ==> public inline fun <reified T> Collection<JsExpression>.toTypedArray(): Array<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> JsExpression

'descriptor' @ [85:13] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'translateAsValueReference' @ [86:40] ==> @NotNull public open fun translateAsValueReference(@NotNull descriptor: DeclarationDescriptor, @NotNull context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.ReferenceTranslator[JavaMethodDescriptor]

'descriptor' @ [86:66] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'getReferencedObject' @ [86:77] ==> public final fun getReferencedObject(): ClassDescriptor defined in org.jetbrains.kotlin.resolve.calls.util.FakeCallableDescriptorForObject[DeserializedSimpleFunctionDescriptor]

'context' @ [86:100] ==> public open val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'translateAsValueReference' @ [89:47] ==> @NotNull public open fun translateAsValueReference(@NotNull descriptor: DeclarationDescriptor, @NotNull context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.ReferenceTranslator[JavaMethodDescriptor]

'callableDescriptor' @ [89:73] ==> public val CallInfo.callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[PropertyDescriptorImpl]

'context' @ [89:93] ==> public open val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'if (isVarCapturedInClosure(context.bindingContext(), callableDescriptor)) {
            getCapturedVarAccessor(functionRef)
        }
        else {
            functionRef.apply {
                if (isGetAccess()) {
                    sideEffects = SideEffectKind.DEPENDS_ON_STATE
                }
            }
        }' @ [90:19] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression, elseBranch: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression

'isVarCapturedInClosure' @ [90:23] ==> public open fun isVarCapturedInClosure(p0: (BindingContext..BindingContext?), p1: (DeclarationDescriptor..DeclarationDescriptor?)): Boolean defined in org.jetbrains.kotlin.resolve.BindingContextUtils[JavaMethodDescriptor]

'context' @ [90:46] ==> public open val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'bindingContext' @ [90:54] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'callableDescriptor' @ [90:72] ==> public val CallInfo.callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[PropertyDescriptorImpl]

'getCapturedVarAccessor' @ [91:13] ==> @NotNull public open fun getCapturedVarAccessor(@NotNull ref: JsExpression): JsNameRef defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'functionRef' @ [91:36] ==> val functionRef: JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'functionRef' @ [94:13] ==> val functionRef: JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'apply' @ [94:25] ==> @InlineOnly public inline fun <T> JsExpression.apply(block: (JsExpression).() -> Unit): JsExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression

'isGetAccess' @ [95:21] ==> public fun VariableAccessInfo.isGetAccess(): Boolean defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[SimpleFunctionDescriptorImpl]

'sideEffects' @ [96:21] ==> public var HasMetadata.sideEffects: SideEffectKind defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'DEPENDS_ON_STATE' @ [96:50] ==> enum entry DEPENDS_ON_STATE defined in org.jetbrains.kotlin.js.backend.ast.metadata.SideEffectKind[FakeCallableDescriptorForObject]

'resolvedCall' @ [101:39] ==> public open val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'resultingDescriptor' @ [101:52] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'if (isGetAccess()) localVariableDescriptor?.getter else localVariableDescriptor?.setter' @ [102:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: LocalVariableAccessorDescriptor?, elseBranch: LocalVariableAccessorDescriptor?): LocalVariableAccessorDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> LocalVariableAccessorDescriptor?

'isGetAccess' @ [102:38] ==> public fun VariableAccessInfo.isGetAccess(): Boolean defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[SimpleFunctionDescriptorImpl]

'localVariableDescriptor' @ [102:53] ==> val localVariableDescriptor: LocalVariableDescriptor? defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'getter' @ [102:78] ==> public open val getter: LocalVariableAccessorDescriptor.Getter? defined in org.jetbrains.kotlin.descriptors.impl.LocalVariableDescriptor[JavaPropertyDescriptor]

'localVariableDescriptor' @ [102:90] ==> val localVariableDescriptor: LocalVariableDescriptor? defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'setter' @ [102:115] ==> public open val setter: LocalVariableAccessorDescriptor.Setter? defined in org.jetbrains.kotlin.descriptors.impl.LocalVariableDescriptor[JavaPropertyDescriptor]

'accessorDescriptor' @ [103:29] ==> val accessorDescriptor: LocalVariableAccessorDescriptor? defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'let' @ [103:49] ==> @InlineOnly public inline fun <T, R> LocalVariableAccessorDescriptor.let(block: (LocalVariableAccessorDescriptor) -> ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?): ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalVariableAccessorDescriptor
    <R> -> ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?

'context' @ [103:55] ==> public open val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'bindingContext' @ [103:63] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'DELEGATED_PROPERTY_RESOLVED_CALL' @ [103:95] ==> public final val DELEGATED_PROPERTY_RESOLVED_CALL: (WritableSlice<(VariableAccessorDescriptor..VariableAccessorDescriptor?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(VariableAccessorDescriptor..VariableAccessorDescriptor?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [103:129] ==> value-parameter it: LocalVariableAccessorDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers.<anonymous>[ValueParameterDescriptorImpl]

'delegatedCall' @ [104:13] ==> val delegatedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'context' @ [105:35] ==> public open val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'contextWithPropertyMetadataCreationIntrinsified' @ [105:43] ==> public fun TranslationContext.contextWithPropertyMetadataCreationIntrinsified(delegatedCall: ResolvedCall<FunctionDescriptor>, property: VariableDescriptorWithAccessors, host: JsExpression): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration[SimpleFunctionDescriptorImpl]

'delegatedCall' @ [106:21] ==> val delegatedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'localVariableDescriptor' @ [106:36] ==> val localVariableDescriptor: LocalVariableDescriptor? defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'JsNullLiteral' @ [106:63] ==> public constructor JsNullLiteral() defined in org.jetbrains.kotlin.js.backend.ast.JsNullLiteral[JavaClassConstructorDescriptor]

'if (!isGetAccess()) {
                val valueArg = delegatedCall.valueArgumentsByIndex!![2].arguments[0].getArgumentExpression()
                delegateContext.innerContextWithAliasesForExpressions(mapOf(valueArg to value!!))
            }
            else {
                delegateContext
            }' @ [107:43] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TranslationContext, elseBranch: TranslationContext): TranslationContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TranslationContext

'!' @ [107:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isGetAccess' @ [107:48] ==> public fun VariableAccessInfo.isGetAccess(): Boolean defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[SimpleFunctionDescriptorImpl]

'delegatedCall' @ [108:32] ==> val delegatedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'valueArgumentsByIndex' @ [108:46] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>.valueArgumentsByIndex: (MutableList<(ResolvedValueArgument..ResolvedValueArgument?)>?..List<(ResolvedValueArgument..ResolvedValueArgument?)>?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'arguments' @ [108:73] ==> public final val ResolvedValueArgument.arguments: (MutableList<(ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'getArgumentExpression' @ [108:86] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'delegateContext' @ [109:17] ==> val delegateContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'innerContextWithAliasesForExpressions' @ [109:33] ==> @NotNull public open fun innerContextWithAliasesForExpressions(@NotNull aliases: (MutableMap<(KtExpression..KtExpression?), (JsExpression..JsExpression?)>..Map<(KtExpression..KtExpression?), (JsExpression..JsExpression?)>)): TranslationContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'mapOf' @ [109:71] ==> public fun <K, V> mapOf(pair: Pair<(KtExpression..KtExpression?), JsExpression>): Map<(KtExpression..KtExpression?), JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V> -> JsExpression

'valueArg' @ [109:77] ==> val valueArg: KtExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'value' @ [109:89] ==> public final val value: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'delegateContext' @ [112:17] ==> val delegateContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'context' @ [114:36] ==> public open val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'getAliasForDescriptor' @ [114:44] ==> @Nullable public open fun getAliasForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsExpression? defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'localVariableDescriptor' @ [114:66] ==> val localVariableDescriptor: LocalVariableDescriptor? defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'pureFqn' @ [115:47] ==> @NotNull public open fun pureFqn(@NotNull identifier: JsName, @Nullable qualifier: JsExpression?): JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'context' @ [115:55] ==> public open val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'getNameForDescriptor' @ [115:63] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'localVariableDescriptor' @ [115:84] ==> val localVariableDescriptor: LocalVariableDescriptor? defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'CallTranslator' @ [116:20] ==> public object CallTranslator defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallTranslator.kt[FakeCallableDescriptorForObject]

'translate' @ [116:35] ==> @JvmOverloads @JvmStatic public final fun translate(context: TranslationContext, resolvedCall: ResolvedCall<out FunctionDescriptor>, extensionOrDispatchReceiver: JsExpression? = ...): JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.CallTranslator[SimpleFunctionDescriptorImpl]

'delegateContextWithArgs' @ [116:45] ==> val delegateContextWithArgs: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'delegatedCall' @ [116:70] ==> val delegatedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'localVariableRef' @ [116:85] ==> val localVariableRef: JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'constructAccessExpression' @ [119:16] ==> public fun VariableAccessInfo.constructAccessExpression(ref: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[SimpleFunctionDescriptorImpl]

'ref' @ [119:42] ==> val ref: JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.noReceivers[LocalVariableDescriptor]

'resolvedCall' @ [123:26] ==> public open val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'resultingDescriptor' @ [123:39] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'if (descriptor is PropertyDescriptor && TranslationUtils.shouldAccessViaFunctions(descriptor)) {
            val callExpr = pureFqn(context.getNameForDescriptor(getAccessDescriptorIfNeeded()), dispatchReceiver!!)
            JsInvocation(callExpr, *additionalArguments.toTypedArray())
        }
        else {
            val accessor = JsNameRef(variableName, dispatchReceiver!!)
            if (descriptor is PropertyDescriptor && !JsDescriptorUtils.sideEffectsPossibleOnRead(descriptor)) {
                accessor.sideEffects = SideEffectKind.DEPENDS_ON_STATE
            }
            constructAccessExpression(accessor)
        }' @ [124:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression, elseBranch: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression

'descriptor' @ [124:20] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.dispatchReceiver[LocalVariableDescriptor]

'shouldAccessViaFunctions' @ [124:73] ==> public open fun shouldAccessViaFunctions(@NotNull descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.TranslationUtils[JavaMethodDescriptor]

'descriptor' @ [124:98] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.dispatchReceiver[LocalVariableDescriptor]

'pureFqn' @ [125:28] ==> @NotNull public open fun pureFqn(@NotNull identifier: JsName, @Nullable qualifier: JsExpression?): JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'context' @ [125:36] ==> public open val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'getNameForDescriptor' @ [125:44] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'getAccessDescriptorIfNeeded' @ [125:65] ==> public fun VariableAccessInfo.getAccessDescriptorIfNeeded(): CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[SimpleFunctionDescriptorImpl]

'dispatchReceiver' @ [125:97] ==> public open val dispatchReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'JsInvocation' @ [126:13] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'callExpr' @ [126:26] ==> val callExpr: JsNameRef defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.dispatchReceiver[LocalVariableDescriptor]

'additionalArguments' @ [126:37] ==> private val VariableAccessInfo.additionalArguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.callTranslator in file VariableCallCases.kt[PropertyDescriptorImpl]

'toTypedArray' @ [126:57] ==> public inline fun <reified T> Collection<JsExpression>.toTypedArray(): Array<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> JsExpression

'JsNameRef' @ [129:28] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'variableName' @ [129:38] ==> public val VariableAccessInfo.variableName: JsName defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[PropertyDescriptorImpl]

'dispatchReceiver' @ [129:52] ==> public open val dispatchReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'descriptor' @ [130:17] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.dispatchReceiver[LocalVariableDescriptor]

'!' @ [130:53] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'sideEffectsPossibleOnRead' @ [130:72] ==> public open fun sideEffectsPossibleOnRead(@NotNull property: PropertyDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.JsDescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [130:98] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.dispatchReceiver[LocalVariableDescriptor]

'accessor' @ [131:17] ==> val accessor: JsNameRef defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.dispatchReceiver[LocalVariableDescriptor]

'sideEffects' @ [131:26] ==> public var HasMetadata.sideEffects: SideEffectKind defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'DEPENDS_ON_STATE' @ [131:55] ==> enum entry DEPENDS_ON_STATE defined in org.jetbrains.kotlin.js.backend.ast.metadata.SideEffectKind[FakeCallableDescriptorForObject]

'constructAccessExpression' @ [133:13] ==> public fun VariableAccessInfo.constructAccessExpression(ref: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[SimpleFunctionDescriptorImpl]

'accessor' @ [133:39] ==> val accessor: JsNameRef defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.dispatchReceiver[LocalVariableDescriptor]

'translateAsValueReference' @ [138:47] ==> @NotNull public open fun translateAsValueReference(@NotNull descriptor: DeclarationDescriptor, @NotNull context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.ReferenceTranslator[JavaMethodDescriptor]

'getAccessDescriptorIfNeeded' @ [138:73] ==> public fun VariableAccessInfo.getAccessDescriptorIfNeeded(): CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[SimpleFunctionDescriptorImpl]

'context' @ [138:104] ==> public open val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'resolvedCall' @ [139:36] ==> public open val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'typeArguments' @ [139:49] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.typeArguments: (MutableMap<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>..Map<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'buildReifiedTypeArgs' @ [139:63] ==> public fun Map<TypeParameterDescriptor, KotlinType>.buildReifiedTypeArgs(context: TranslationContext): List<JsExpression> defined in org.jetbrains.kotlin.js.translate.reference[SimpleFunctionDescriptorImpl]

'context' @ [139:84] ==> public open val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'JsInvocation' @ [140:17] ==> public constructor JsInvocation(@NotNull p0: JsExpression, @NotNull p1: (MutableList<out (JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'functionRef' @ [140:30] ==> val functionRef: JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.extensionReceiver[LocalVariableDescriptor]

'reifiedTypeArguments' @ [140:43] ==> val reifiedTypeArguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.extensionReceiver[LocalVariableDescriptor]

'listOf' @ [140:66] ==> public fun <T> listOf(element: JsExpression): List<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression

'extensionReceiver' @ [140:73] ==> public open val extensionReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'additionalArguments' @ [140:96] ==> private val VariableAccessInfo.additionalArguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.callTranslator in file VariableCallCases.kt[PropertyDescriptorImpl]

'pureFqn' @ [144:33] ==> @NotNull public open fun pureFqn(@NotNull identifier: JsName, @Nullable qualifier: JsExpression?): JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'context' @ [144:41] ==> public open val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'getNameForDescriptor' @ [144:49] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'getAccessDescriptorIfNeeded' @ [144:70] ==> public fun VariableAccessInfo.getAccessDescriptorIfNeeded(): CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[SimpleFunctionDescriptorImpl]

'dispatchReceiver' @ [144:102] ==> public open val dispatchReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'JsInvocation' @ [145:16] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'funRef' @ [145:29] ==> val funRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase.bothReceivers[LocalVariableDescriptor]

'extensionReceiver' @ [145:37] ==> public open val extensionReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'additionalArguments' @ [145:59] ==> private val VariableAccessInfo.additionalArguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.callTranslator in file VariableCallCases.kt[PropertyDescriptorImpl]

'toTypedArray' @ [145:79] ==> public inline fun <reified T> Collection<JsExpression>.toTypedArray(): Array<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> JsExpression

'variableDescriptor' @ [151:12] ==> public val VariableAccessInfo.variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[PropertyDescriptorImpl]

'isGetAccess' @ [152:20] ==> public fun VariableAccessInfo.isGetAccess(): Boolean defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [152:38] ==> public val VariableAccessInfo.variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[PropertyDescriptorImpl]

'isVar' @ [152:80] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'if (isGetAccess())
            Collections.emptyList<JsExpression>()
        else
            Collections.singletonList(value!!)' @ [158:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<JsExpression>, elseBranch: List<JsExpression>): List<JsExpression>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<JsExpression>

'isGetAccess' @ [158:20] ==> public fun VariableAccessInfo.isGetAccess(): Boolean defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[SimpleFunctionDescriptorImpl]

'emptyList' @ [159:25] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JsExpression

'singletonList' @ [161:25] ==> public open fun <T : (Any..Any?)> singletonList(p0: (JsExpression..JsExpression?)): (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JsExpression

'value' @ [161:39] ==> public final val value: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'variableDescriptor' @ [165:34] ==> public val VariableAccessInfo.variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[PropertyDescriptorImpl]

'if (isGetAccess()) {
            propertyDescriptor.getter!!
        } else {
            propertyDescriptor.setter!!
        }' @ [166:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CallableDescriptor, elseBranch: CallableDescriptor): CallableDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CallableDescriptor

'isGetAccess' @ [166:20] ==> public fun VariableAccessInfo.isGetAccess(): Boolean defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[SimpleFunctionDescriptorImpl]

'propertyDescriptor' @ [167:13] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.DelegatePropertyAccessIntrinsic.getDescriptor[LocalVariableDescriptor]

'getter' @ [167:32] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'propertyDescriptor' @ [169:13] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.DelegatePropertyAccessIntrinsic.getDescriptor[LocalVariableDescriptor]

'setter' @ [169:32] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'VariableAccessCase' @ [174:34] ==> public constructor VariableAccessCase() defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessCase[ClassConstructorDescriptorImpl]

'JsStringLiteral' @ [176:28] ==> public constructor JsStringLiteral(p0: (String..String?)) defined in org.jetbrains.kotlin.js.backend.ast.JsStringLiteral[JavaClassConstructorDescriptor]

'this' @ [176:44] ==> <this> defined in org.jetbrains.kotlin.js.translate.callTranslator.SuperPropertyAccessCase.dispatchReceiver[ReceiverParameterDescriptorImpl]

'variableName' @ [176:49] ==> public val VariableAccessInfo.variableName: JsName defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[PropertyDescriptorImpl]

'ident' @ [176:62] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'resolvedCall' @ [177:26] ==> public open val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'resultingDescriptor' @ [177:39] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'if (descriptor is PropertyDescriptor && TranslationUtils.shouldAccessViaFunctions(descriptor)) {
            val accessor = getAccessDescriptorIfNeeded()
            val containingRef = ReferenceTranslator.translateAsValueReference(descriptor.containingDeclaration, context)
            val prototype = pureFqn(Namer.getPrototypeName(), containingRef)
            val funRef = Namer.getFunctionCallRef(pureFqn(context.getNameForDescriptor(accessor), prototype))
            val arguments = listOf(dispatchReceiver!!) + additionalArguments
            JsInvocation(funRef, *arguments.toTypedArray())
        }
        else {
            val callExpr = if (isGetAccess()) context.namer().callGetProperty else context.namer().callSetProperty
            val arguments = listOf(dispatchReceiver!!, JsAstUtils.prototypeOf(calleeOwner), variableName) + additionalArguments
            JsInvocation(callExpr, *arguments.toTypedArray())
        }' @ [179:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression, elseBranch: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression

'descriptor' @ [179:20] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.SuperPropertyAccessCase.dispatchReceiver[LocalVariableDescriptor]

'shouldAccessViaFunctions' @ [179:73] ==> public open fun shouldAccessViaFunctions(@NotNull descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.TranslationUtils[JavaMethodDescriptor]

'descriptor' @ [179:98] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.SuperPropertyAccessCase.dispatchReceiver[LocalVariableDescriptor]

'getAccessDescriptorIfNeeded' @ [180:28] ==> public fun VariableAccessInfo.getAccessDescriptorIfNeeded(): CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[SimpleFunctionDescriptorImpl]

'translateAsValueReference' @ [181:53] ==> @NotNull public open fun translateAsValueReference(@NotNull descriptor: DeclarationDescriptor, @NotNull context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.ReferenceTranslator[JavaMethodDescriptor]

'descriptor' @ [181:79] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.SuperPropertyAccessCase.dispatchReceiver[LocalVariableDescriptor]

'containingDeclaration' @ [181:90] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'context' @ [181:113] ==> public open val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'pureFqn' @ [182:29] ==> @NotNull public open fun pureFqn(@NotNull identifier: String, @Nullable qualifier: JsExpression?): JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'getPrototypeName' @ [182:43] ==> @NotNull public open fun getPrototypeName(): String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'containingRef' @ [182:63] ==> val containingRef: JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.SuperPropertyAccessCase.dispatchReceiver[LocalVariableDescriptor]

'getFunctionCallRef' @ [183:32] ==> @NotNull public open fun getFunctionCallRef(@NotNull functionExpression: JsExpression): JsNameRef defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'pureFqn' @ [183:51] ==> @NotNull public open fun pureFqn(@NotNull identifier: JsName, @Nullable qualifier: JsExpression?): JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'context' @ [183:59] ==> public open val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'getNameForDescriptor' @ [183:67] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'accessor' @ [183:88] ==> val accessor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.SuperPropertyAccessCase.dispatchReceiver[LocalVariableDescriptor]

'prototype' @ [183:99] ==> val prototype: JsNameRef defined in org.jetbrains.kotlin.js.translate.callTranslator.SuperPropertyAccessCase.dispatchReceiver[LocalVariableDescriptor]

'listOf' @ [184:29] ==> public fun <T> listOf(element: JsExpression): List<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression

'dispatchReceiver' @ [184:36] ==> public open val dispatchReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'additionalArguments' @ [184:58] ==> private val VariableAccessInfo.additionalArguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.callTranslator in file VariableCallCases.kt[PropertyDescriptorImpl]

'JsInvocation' @ [185:13] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'funRef' @ [185:26] ==> val funRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.callTranslator.SuperPropertyAccessCase.dispatchReceiver[LocalVariableDescriptor]

'arguments' @ [185:35] ==> val arguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.callTranslator.SuperPropertyAccessCase.dispatchReceiver[LocalVariableDescriptor]

'toTypedArray' @ [185:45] ==> public inline fun <reified T> Collection<JsExpression>.toTypedArray(): Array<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> JsExpression

'if (isGetAccess()) context.namer().callGetProperty else context.namer().callSetProperty' @ [188:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression, elseBranch: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression

'isGetAccess' @ [188:32] ==> public fun VariableAccessInfo.isGetAccess(): Boolean defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[SimpleFunctionDescriptorImpl]

'context' @ [188:47] ==> public open val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'namer' @ [188:55] ==> @NotNull public open fun namer(): Namer defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'callGetProperty' @ [188:63] ==> public final val Namer.callGetProperty: JsExpression[MyPropertyDescriptor]

'context' @ [188:84] ==> public open val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'namer' @ [188:92] ==> @NotNull public open fun namer(): Namer defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'callSetProperty' @ [188:100] ==> public final val Namer.callSetProperty: JsExpression[MyPropertyDescriptor]

'listOf' @ [189:29] ==> public fun <T> listOf(vararg elements: JsExpression): List<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression

'dispatchReceiver' @ [189:36] ==> public open val dispatchReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'prototypeOf' @ [189:67] ==> @NotNull public open fun prototypeOf(@NotNull expression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'calleeOwner' @ [189:79] ==> public val CallInfo.calleeOwner: JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[PropertyDescriptorImpl]

'variableName' @ [189:93] ==> val variableName: JsStringLiteral defined in org.jetbrains.kotlin.js.translate.callTranslator.SuperPropertyAccessCase.dispatchReceiver[LocalVariableDescriptor]

'additionalArguments' @ [189:109] ==> private val VariableAccessInfo.additionalArguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.callTranslator in file VariableCallCases.kt[PropertyDescriptorImpl]

'JsInvocation' @ [190:13] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'callExpr' @ [190:26] ==> val callExpr: JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.SuperPropertyAccessCase.dispatchReceiver[LocalVariableDescriptor]

'arguments' @ [190:37] ==> val arguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.callTranslator.SuperPropertyAccessCase.dispatchReceiver[LocalVariableDescriptor]

'toTypedArray' @ [190:47] ==> public inline fun <reified T> Collection<JsExpression>.toTypedArray(): Array<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> JsExpression

'value' @ [195:80] ==> public final val value: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo[PropertyDescriptorImpl]

'let' @ [195:87] ==> @InlineOnly public inline fun <T, R> JsExpression.let(block: (JsExpression) -> List<JsExpression>): List<JsExpression> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression
    <R> -> List<JsExpression>

'listOf' @ [195:93] ==> public fun <T> listOf(element: JsExpression): List<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression

'it' @ [195:100] ==> value-parameter it: JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.<get-additionalArguments>.<anonymous>[ValueParameterDescriptorImpl]

'orEmpty' @ [195:106] ==> @InlineOnly public inline fun <T> List<JsExpression>?.orEmpty(): List<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression

'DelegatePropertyAccessIntrinsic' @ [198:21] ==> public object DelegatePropertyAccessIntrinsic : DelegateIntrinsic<VariableAccessInfo> defined in org.jetbrains.kotlin.js.translate.callTranslator in file VariableCallCases.kt[FakeCallableDescriptorForObject]

'intrinsic' @ [198:53] ==> public open fun intrinsic(callInfo: VariableAccessInfo): JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.DelegatePropertyAccessIntrinsic[SimpleFunctionDescriptorImpl]

'this' @ [198:63] ==> <this> defined in org.jetbrains.kotlin.js.translate.callTranslator.translateVariableAccess[ReceiverParameterDescriptorImpl]

'when {
        intrinsic != null ->
            intrinsic
        isSuperInvocation() ->
            SuperPropertyAccessCase.translate(this)
        isNative() ->
            NativeVariableAccessCase.translate(this)
        else ->
            DefaultVariableAccessCase.translate(this)
    }' @ [200:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsExpression, entry1: JsExpression, entry2: JsExpression, entry3: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsExpression

'intrinsic' @ [201:9] ==> val intrinsic: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.translateVariableAccess[LocalVariableDescriptor]

'intrinsic' @ [202:13] ==> val intrinsic: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.translateVariableAccess[LocalVariableDescriptor]

'isSuperInvocation' @ [203:9] ==> public fun CallInfo.isSuperInvocation(): Boolean defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[SimpleFunctionDescriptorImpl]

'SuperPropertyAccessCase' @ [204:13] ==> public object SuperPropertyAccessCase : VariableAccessCase defined in org.jetbrains.kotlin.js.translate.callTranslator in file VariableCallCases.kt[FakeCallableDescriptorForObject]

'translate' @ [204:37] ==> public final fun translate(callInfo: VariableAccessInfo): JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.SuperPropertyAccessCase[SimpleFunctionDescriptorImpl]

'this' @ [204:47] ==> <this> defined in org.jetbrains.kotlin.js.translate.callTranslator.translateVariableAccess[ReceiverParameterDescriptorImpl]

'isNative' @ [205:9] ==> public fun CallInfo.isNative(): Boolean defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[SimpleFunctionDescriptorImpl]

'NativeVariableAccessCase' @ [206:13] ==> public object NativeVariableAccessCase : VariableAccessCase defined in org.jetbrains.kotlin.js.translate.callTranslator in file VariableCallCases.kt[FakeCallableDescriptorForObject]

'translate' @ [206:38] ==> public final fun translate(callInfo: VariableAccessInfo): JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.NativeVariableAccessCase[SimpleFunctionDescriptorImpl]

'this' @ [206:48] ==> <this> defined in org.jetbrains.kotlin.js.translate.callTranslator.translateVariableAccess[ReceiverParameterDescriptorImpl]

'DefaultVariableAccessCase' @ [208:13] ==> public object DefaultVariableAccessCase : VariableAccessCase defined in org.jetbrains.kotlin.js.translate.callTranslator in file VariableCallCases.kt[FakeCallableDescriptorForObject]

'translate' @ [208:39] ==> public final fun translate(callInfo: VariableAccessInfo): JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.DefaultVariableAccessCase[SimpleFunctionDescriptorImpl]

'this' @ [208:49] ==> <this> defined in org.jetbrains.kotlin.js.translate.callTranslator.translateVariableAccess[ReceiverParameterDescriptorImpl]

