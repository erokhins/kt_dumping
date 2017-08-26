'atLocation' @ [47:40] ==> public open fun atLocation(p0: (DeclarationDescriptor..DeclarationDescriptor?)): (String..String?) defined in org.jetbrains.kotlin.diagnostics.DiagnosticUtils[JavaMethodDescriptor]

'callableDescriptor' @ [47:51] ==> public val CallInfo.callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[PropertyDescriptorImpl]

'callableDescriptor' @ [48:20] ==> public val CallInfo.callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfoExtensions.kt[PropertyDescriptorImpl]

'name' @ [48:39] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [48:44] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [49:38] ==> val name: String defined in org.jetbrains.kotlin.js.translate.callTranslator.AbstractCallInfo.toString[LocalVariableDescriptor]

'location' @ [49:47] ==> val location: (String..String?) defined in org.jetbrains.kotlin.js.translate.callTranslator.AbstractCallInfo.toString[LocalVariableDescriptor]

'dispatchReceiver' @ [49:76] ==> public abstract val dispatchReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.AbstractCallInfo[PropertyDescriptorImpl]

'extensionReceiver' @ [49:114] ==> public abstract val extensionReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.AbstractCallInfo[PropertyDescriptorImpl]

'AbstractCallInfo' @ [54:81] ==> public constructor AbstractCallInfo() defined in org.jetbrains.kotlin.js.translate.callTranslator.AbstractCallInfo[ClassConstructorDescriptorImpl]

'callInfo' @ [54:113] ==> value-parameter callInfo: CallInfo defined in org.jetbrains.kotlin.js.translate.callTranslator.VariableAccessInfo.<init>[ValueParameterDescriptorImpl]

'AbstractCallInfo' @ [59:5] ==> public constructor AbstractCallInfo() defined in org.jetbrains.kotlin.js.translate.callTranslator.AbstractCallInfo[ClassConstructorDescriptorImpl]

'callInfo' @ [59:37] ==> value-parameter callInfo: CallInfo defined in org.jetbrains.kotlin.js.translate.callTranslator.FunctionCallInfo.<init>[ValueParameterDescriptorImpl]

'createCallInfo' @ [74:12] ==> private fun TranslationContext.createCallInfo(resolvedCall: ResolvedCall<out CallableDescriptor>, explicitReceivers: ExplicitReceivers): CallInfo defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfo.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [74:27] ==> value-parameter resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.getCallInfo[ValueParameterDescriptorImpl]

'ExplicitReceivers' @ [74:41] ==> public constructor ExplicitReceivers(extensionOrDispatchReceiver: JsExpression?, extensionReceiver: JsExpression? = ...) defined in org.jetbrains.kotlin.js.translate.callTranslator.ExplicitReceivers[ClassConstructorDescriptorImpl]

'extensionOrDispatchReceiver' @ [74:59] ==> value-parameter extensionOrDispatchReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.getCallInfo[ValueParameterDescriptorImpl]

'JsBlock' @ [82:21] ==> public constructor JsBlock() defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'CallArgumentTranslator' @ [83:25] ==> public companion object defined in org.jetbrains.kotlin.js.translate.reference.CallArgumentTranslator[FakeCallableDescriptorForObject]

'translate' @ [83:48] ==> @JvmStatic public final fun translate(resolvedCall: ResolvedCall<*>, receiver: JsExpression?, context: TranslationContext, block: JsBlock): CallArgumentTranslator.ArgumentsInfo defined in org.jetbrains.kotlin.js.translate.reference.CallArgumentTranslator.Companion[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [83:58] ==> value-parameter resolvedCall: ResolvedCall<out FunctionDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.getCallInfo[ValueParameterDescriptorImpl]

'explicitReceivers' @ [83:72] ==> value-parameter explicitReceivers: ExplicitReceivers defined in org.jetbrains.kotlin.js.translate.callTranslator.getCallInfo[ValueParameterDescriptorImpl]

'extensionOrDispatchReceiver' @ [83:90] ==> public final val extensionOrDispatchReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.ExplicitReceivers[PropertyDescriptorImpl]

'this' @ [83:119] ==> <this> defined in org.jetbrains.kotlin.js.translate.callTranslator.getCallInfo[ReceiverParameterDescriptorImpl]

'argsBlock' @ [83:125] ==> val argsBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.callTranslator.getCallInfo[LocalVariableDescriptor]

'if (!argsBlock.isEmpty && explicitReceivers.extensionOrDispatchReceiver != null) {
                val receiverOrThisRef = cacheExpressionIfNeeded(explicitReceivers.extensionOrDispatchReceiver)
                var receiverRef = explicitReceivers.extensionReceiver
                if (receiverRef != null) {
                    receiverRef = defineTemporary(explicitReceivers.extensionReceiver!!)
                }
                ExplicitReceivers(receiverOrThisRef, receiverRef)
            }
            else {
                explicitReceivers
            }' @ [86:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ExplicitReceivers, elseBranch: ExplicitReceivers): ExplicitReceivers[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ExplicitReceivers

'!' @ [86:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'argsBlock' @ [86:18] ==> val argsBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.callTranslator.getCallInfo[LocalVariableDescriptor]

'isEmpty' @ [86:28] ==> public final val JsBlock.isEmpty: Boolean[MyPropertyDescriptor]

'explicitReceivers' @ [86:39] ==> value-parameter explicitReceivers: ExplicitReceivers defined in org.jetbrains.kotlin.js.translate.callTranslator.getCallInfo[ValueParameterDescriptorImpl]

'extensionOrDispatchReceiver' @ [86:57] ==> public final val extensionOrDispatchReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.ExplicitReceivers[PropertyDescriptorImpl]

'cacheExpressionIfNeeded' @ [87:41] ==> @NotNull public open fun cacheExpressionIfNeeded(@NotNull expression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'explicitReceivers' @ [87:65] ==> value-parameter explicitReceivers: ExplicitReceivers defined in org.jetbrains.kotlin.js.translate.callTranslator.getCallInfo[ValueParameterDescriptorImpl]

'extensionOrDispatchReceiver' @ [87:83] ==> public final val extensionOrDispatchReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.ExplicitReceivers[PropertyDescriptorImpl]

'explicitReceivers' @ [88:35] ==> value-parameter explicitReceivers: ExplicitReceivers defined in org.jetbrains.kotlin.js.translate.callTranslator.getCallInfo[ValueParameterDescriptorImpl]

'extensionReceiver' @ [88:53] ==> public final val extensionReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.ExplicitReceivers[PropertyDescriptorImpl]

'receiverRef' @ [89:21] ==> var receiverRef: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.getCallInfo[LocalVariableDescriptor]

'receiverRef' @ [90:21] ==> var receiverRef: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.getCallInfo[LocalVariableDescriptor]

'defineTemporary' @ [90:35] ==> @NotNull public open fun defineTemporary(@NotNull initExpression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'explicitReceivers' @ [90:51] ==> value-parameter explicitReceivers: ExplicitReceivers defined in org.jetbrains.kotlin.js.translate.callTranslator.getCallInfo[ValueParameterDescriptorImpl]

'extensionReceiver' @ [90:69] ==> public final val extensionReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.ExplicitReceivers[PropertyDescriptorImpl]

'ExplicitReceivers' @ [92:17] ==> public constructor ExplicitReceivers(extensionOrDispatchReceiver: JsExpression?, extensionReceiver: JsExpression? = ...) defined in org.jetbrains.kotlin.js.translate.callTranslator.ExplicitReceivers[ClassConstructorDescriptorImpl]

'receiverOrThisRef' @ [92:35] ==> val receiverOrThisRef: JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.getCallInfo[LocalVariableDescriptor]

'receiverRef' @ [92:54] ==> var receiverRef: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.getCallInfo[LocalVariableDescriptor]

'explicitReceivers' @ [95:17] ==> value-parameter explicitReceivers: ExplicitReceivers defined in org.jetbrains.kotlin.js.translate.callTranslator.getCallInfo[ValueParameterDescriptorImpl]

'this' @ [97:5] ==> <this> defined in org.jetbrains.kotlin.js.translate.callTranslator.getCallInfo[ReceiverParameterDescriptorImpl]

'addStatementsToCurrentBlockFrom' @ [97:10] ==> public open fun addStatementsToCurrentBlockFrom(@NotNull block: JsBlock): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'argsBlock' @ [97:42] ==> val argsBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.callTranslator.getCallInfo[LocalVariableDescriptor]

'createCallInfo' @ [98:20] ==> private fun TranslationContext.createCallInfo(resolvedCall: ResolvedCall<out CallableDescriptor>, explicitReceivers: ExplicitReceivers): CallInfo defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfo.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [98:35] ==> value-parameter resolvedCall: ResolvedCall<out FunctionDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.getCallInfo[ValueParameterDescriptorImpl]

'explicitReceiversCorrected' @ [98:49] ==> val explicitReceiversCorrected: ExplicitReceivers defined in org.jetbrains.kotlin.js.translate.callTranslator.getCallInfo[LocalVariableDescriptor]

'FunctionCallInfo' @ [99:12] ==> public constructor FunctionCallInfo(callInfo: CallInfo, argumentsInfo: CallArgumentTranslator.ArgumentsInfo) defined in org.jetbrains.kotlin.js.translate.callTranslator.FunctionCallInfo[ClassConstructorDescriptorImpl]

'callInfo' @ [99:29] ==> val callInfo: CallInfo defined in org.jetbrains.kotlin.js.translate.callTranslator.getCallInfo[LocalVariableDescriptor]

'argumentsInfo' @ [99:39] ==> val argumentsInfo: CallArgumentTranslator.ArgumentsInfo defined in org.jetbrains.kotlin.js.translate.callTranslator.getCallInfo[LocalVariableDescriptor]

'r' @ [103:12] ==> value-parameter r: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.boxIfNeedeed[ValueParameterDescriptorImpl]

'let' @ [103:15] ==> @InlineOnly public inline fun <T, R> JsExpression.let(block: (JsExpression) -> JsExpression): JsExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression
    <R> -> JsExpression

'boxCastIfNeeded' @ [103:38] ==> @NotNull public open fun boxCastIfNeeded(@NotNull e: JsExpression, @Nullable castFrom: KotlinType?, @Nullable castTo: KotlinType?): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TranslationUtils[JavaMethodDescriptor]

'it' @ [103:54] ==> value-parameter it: JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.boxIfNeedeed.<anonymous>[ValueParameterDescriptorImpl]

'v' @ [103:58] ==> value-parameter v: ReceiverValue? defined in org.jetbrains.kotlin.js.translate.callTranslator.boxIfNeedeed[ValueParameterDescriptorImpl]

'type' @ [103:61] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'd' @ [103:67] ==> value-parameter d: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.js.translate.callTranslator.boxIfNeedeed[ValueParameterDescriptorImpl]

'type' @ [103:70] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'getDispatchReceiver' @ [107:12] ==> @NotNull public open fun getDispatchReceiver(@NotNull descriptor: ReceiverParameterDescriptor): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'getReceiverParameterForReceiver' @ [107:32] ==> @NotNull public open fun getReceiverParameterForReceiver(@NotNull receiverParameter: ReceiverValue): ReceiverParameterDescriptor defined in org.jetbrains.kotlin.js.translate.utils.JsDescriptorUtils[JavaMethodDescriptor]

'receiverValue' @ [107:64] ==> value-parameter receiverValue: ReceiverValue defined in org.jetbrains.kotlin.js.translate.callTranslator.getDispatchReceiver[ValueParameterDescriptorImpl]

'resolvedCall' @ [114:24] ==> value-parameter resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[ValueParameterDescriptorImpl]

'explicitReceiverKind' @ [114:37] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.explicitReceiverKind: ExplicitReceiverKind[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'resolvedCall' @ [120:29] ==> value-parameter resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [120:42] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'when (receiverKind) {
            DISPATCH_RECEIVER, BOTH_RECEIVERS -> explicitReceivers.extensionOrDispatchReceiver
            else -> getDispatchReceiver(receiverValue)
        }' @ [121:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsExpression?, entry1: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsExpression?

'receiverKind' @ [121:22] ==> val receiverKind: ExplicitReceiverKind defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[LocalVariableDescriptor]

'DISPATCH_RECEIVER' @ [122:13] ==> enum entry DISPATCH_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'BOTH_RECEIVERS' @ [122:32] ==> enum entry BOTH_RECEIVERS defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'explicitReceivers' @ [122:50] ==> value-parameter explicitReceivers: ExplicitReceivers defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[ValueParameterDescriptorImpl]

'extensionOrDispatchReceiver' @ [122:68] ==> public final val extensionOrDispatchReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.ExplicitReceivers[PropertyDescriptorImpl]

'getDispatchReceiver' @ [123:21] ==> private fun TranslationContext.getDispatchReceiver(receiverValue: ReceiverValue): JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfo.kt[SimpleFunctionDescriptorImpl]

'receiverValue' @ [123:41] ==> val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo.getDispatchReceiver[LocalVariableDescriptor]

'resolvedCall' @ [128:29] ==> value-parameter resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[ValueParameterDescriptorImpl]

'extensionReceiver' @ [128:42] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'when (receiverKind) {
            EXTENSION_RECEIVER -> explicitReceivers.extensionOrDispatchReceiver
            BOTH_RECEIVERS -> explicitReceivers.extensionReceiver
            else -> getDispatchReceiver(receiverValue)
        }' @ [129:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsExpression?, entry1: JsExpression?, entry2: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsExpression?

'receiverKind' @ [129:22] ==> val receiverKind: ExplicitReceiverKind defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[LocalVariableDescriptor]

'EXTENSION_RECEIVER' @ [130:13] ==> enum entry EXTENSION_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'explicitReceivers' @ [130:35] ==> value-parameter explicitReceivers: ExplicitReceivers defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[ValueParameterDescriptorImpl]

'extensionOrDispatchReceiver' @ [130:53] ==> public final val extensionOrDispatchReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.ExplicitReceivers[PropertyDescriptorImpl]

'BOTH_RECEIVERS' @ [131:13] ==> enum entry BOTH_RECEIVERS defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'explicitReceivers' @ [131:31] ==> value-parameter explicitReceivers: ExplicitReceivers defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[ValueParameterDescriptorImpl]

'extensionReceiver' @ [131:49] ==> public final val extensionReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.ExplicitReceivers[PropertyDescriptorImpl]

'getDispatchReceiver' @ [132:21] ==> private fun TranslationContext.getDispatchReceiver(receiverValue: ReceiverValue): JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfo.kt[SimpleFunctionDescriptorImpl]

'receiverValue' @ [132:41] ==> val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo.getExtensionReceiver[LocalVariableDescriptor]

'getDispatchReceiver' @ [136:28] ==> local final fun getDispatchReceiver(): JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[SimpleFunctionDescriptorImpl]

'getExtensionReceiver' @ [137:29] ==> local final fun getExtensionReceiver(): JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [140:9] ==> value-parameter resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[ValueParameterDescriptorImpl]

'call' @ [140:22] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'isSafeCall' @ [140:27] ==> public fun Call.isSafeCall(): Boolean defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'when (resolvedCall.explicitReceiverKind) {
            BOTH_RECEIVERS, EXTENSION_RECEIVER -> {
                notNullConditional = TranslationUtils.notNullConditional(extensionReceiver!!, JsNullLiteral(), this)
                extensionReceiver = notNullConditional.thenExpression
            }
            else -> {
                notNullConditional = TranslationUtils.notNullConditional(dispatchReceiver!!, JsNullLiteral(), this)
                dispatchReceiver = notNullConditional.thenExpression
            }
        }' @ [141:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'resolvedCall' @ [141:15] ==> value-parameter resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[ValueParameterDescriptorImpl]

'explicitReceiverKind' @ [141:28] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.explicitReceiverKind: ExplicitReceiverKind[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'BOTH_RECEIVERS' @ [142:13] ==> enum entry BOTH_RECEIVERS defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'EXTENSION_RECEIVER' @ [142:29] ==> enum entry EXTENSION_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'notNullConditional' @ [143:17] ==> var notNullConditional: JsConditional? defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[LocalVariableDescriptor]

'notNullConditional' @ [143:55] ==> @NotNull public open fun notNullConditional(@NotNull expression: JsExpression, @NotNull elseExpression: JsExpression, @NotNull context: TranslationContext): JsConditional defined in org.jetbrains.kotlin.js.translate.utils.TranslationUtils[JavaMethodDescriptor]

'extensionReceiver' @ [143:74] ==> var extensionReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[LocalVariableDescriptor]

'JsNullLiteral' @ [143:95] ==> public constructor JsNullLiteral() defined in org.jetbrains.kotlin.js.backend.ast.JsNullLiteral[JavaClassConstructorDescriptor]

'this' @ [143:112] ==> <this> defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[ReceiverParameterDescriptorImpl]

'extensionReceiver' @ [144:17] ==> var extensionReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[LocalVariableDescriptor]

'notNullConditional' @ [144:37] ==> var notNullConditional: JsConditional? defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[LocalVariableDescriptor]

'thenExpression' @ [144:56] ==> public final var JsConditional.thenExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'notNullConditional' @ [147:17] ==> var notNullConditional: JsConditional? defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[LocalVariableDescriptor]

'notNullConditional' @ [147:55] ==> @NotNull public open fun notNullConditional(@NotNull expression: JsExpression, @NotNull elseExpression: JsExpression, @NotNull context: TranslationContext): JsConditional defined in org.jetbrains.kotlin.js.translate.utils.TranslationUtils[JavaMethodDescriptor]

'dispatchReceiver' @ [147:74] ==> var dispatchReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[LocalVariableDescriptor]

'JsNullLiteral' @ [147:94] ==> public constructor JsNullLiteral() defined in org.jetbrains.kotlin.js.backend.ast.JsNullLiteral[JavaClassConstructorDescriptor]

'this' @ [147:111] ==> <this> defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[ReceiverParameterDescriptorImpl]

'dispatchReceiver' @ [148:17] ==> var dispatchReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[LocalVariableDescriptor]

'notNullConditional' @ [148:36] ==> var notNullConditional: JsConditional? defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[LocalVariableDescriptor]

'thenExpression' @ [148:55] ==> public final var JsConditional.thenExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'dispatchReceiver' @ [153:9] ==> var dispatchReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[LocalVariableDescriptor]

'resolvedCall' @ [154:25] ==> value-parameter resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [154:38] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'containingDeclaration' @ [154:58] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'isObject' @ [155:29] ==> public open fun isObject(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'container' @ [155:38] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[LocalVariableDescriptor]

'dispatchReceiver' @ [156:13] ==> var dispatchReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[LocalVariableDescriptor]

'translateAsValueReference' @ [156:52] ==> @NotNull public open fun translateAsValueReference(@NotNull descriptor: DeclarationDescriptor, @NotNull context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.ReferenceTranslator[JavaMethodDescriptor]

'container' @ [156:78] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[LocalVariableDescriptor]

'this' @ [156:89] ==> <this> defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[ReceiverParameterDescriptorImpl]

'dispatchReceiver' @ [160:5] ==> var dispatchReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[LocalVariableDescriptor]

'boxIfNeedeed' @ [160:24] ==> private fun boxIfNeedeed(v: ReceiverValue?, d: ReceiverParameterDescriptor?, r: JsExpression?): JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfo.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [160:37] ==> value-parameter resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [160:50] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'resolvedCall' @ [161:37] ==> value-parameter resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [161:50] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.candidateDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'dispatchReceiverParameter' @ [161:70] ==> public final val CallableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'dispatchReceiver' @ [162:37] ==> var dispatchReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[LocalVariableDescriptor]

'extensionReceiver' @ [164:5] ==> var extensionReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[LocalVariableDescriptor]

'boxIfNeedeed' @ [164:25] ==> private fun boxIfNeedeed(v: ReceiverValue?, d: ReceiverParameterDescriptor?, r: JsExpression?): JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallInfo.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [164:38] ==> value-parameter resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[ValueParameterDescriptorImpl]

'extensionReceiver' @ [164:51] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'resolvedCall' @ [165:38] ==> value-parameter resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [165:51] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.candidateDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'extensionReceiverParameter' @ [165:71] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'extensionReceiver' @ [166:38] ==> var extensionReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[LocalVariableDescriptor]

'AbstractCallInfo' @ [169:21] ==> public constructor AbstractCallInfo() defined in org.jetbrains.kotlin.js.translate.callTranslator.AbstractCallInfo[ClassConstructorDescriptorImpl]

'this@createCallInfo' @ [170:52] ==> <this> defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[ReceiverParameterDescriptorImpl]

'resolvedCall' @ [171:75] ==> value-parameter resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [172:56] ==> var dispatchReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[LocalVariableDescriptor]

'extensionReceiver' @ [173:57] ==> var extensionReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[LocalVariableDescriptor]

'notNullConditional' @ [175:61] ==> var notNullConditional: JsConditional? defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo[LocalVariableDescriptor]

'if (notNullConditionalForSafeCall == null) {
                result
            }
            else {
                notNullConditionalForSafeCall.thenExpression = result
                notNullConditionalForSafeCall
            }' @ [178:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression, elseBranch: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression

'notNullConditionalForSafeCall' @ [178:24] ==> public final val notNullConditionalForSafeCall: JsConditional? defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo.<no name provided>[PropertyDescriptorImpl]

'result' @ [179:17] ==> value-parameter result: JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo.<no name provided>.constructSafeCallIfNeeded[ValueParameterDescriptorImpl]

'notNullConditionalForSafeCall' @ [182:17] ==> public final val notNullConditionalForSafeCall: JsConditional? defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo.<no name provided>[PropertyDescriptorImpl]

'thenExpression' @ [182:47] ==> public final var JsConditional.thenExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'result' @ [182:64] ==> value-parameter result: JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo.<no name provided>.constructSafeCallIfNeeded[ValueParameterDescriptorImpl]

'notNullConditionalForSafeCall' @ [183:17] ==> public final val notNullConditionalForSafeCall: JsConditional? defined in org.jetbrains.kotlin.js.translate.callTranslator.createCallInfo.<no name provided>[PropertyDescriptorImpl]

