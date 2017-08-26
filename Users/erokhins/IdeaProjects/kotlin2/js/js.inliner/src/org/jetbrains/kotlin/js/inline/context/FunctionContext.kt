'getFunctionDefinitionImpl' @ [33:16] ==> private final fun getFunctionDefinitionImpl(call: JsInvocation): JsFunction? defined in org.jetbrains.kotlin.js.inline.context.FunctionContext[SimpleFunctionDescriptorImpl]

'call' @ [33:42] ==> value-parameter call: JsInvocation defined in org.jetbrains.kotlin.js.inline.context.FunctionContext.getFunctionDefinition[ValueParameterDescriptorImpl]

'getFunctionDefinitionImpl' @ [37:16] ==> private final fun getFunctionDefinitionImpl(call: JsInvocation): JsFunction? defined in org.jetbrains.kotlin.js.inline.context.FunctionContext[SimpleFunctionDescriptorImpl]

'call' @ [37:42] ==> value-parameter call: JsInvocation defined in org.jetbrains.kotlin.js.inline.context.FunctionContext.hasFunctionDefinition[ValueParameterDescriptorImpl]

'call' @ [71:26] ==> value-parameter call: JsInvocation defined in org.jetbrains.kotlin.js.inline.context.FunctionContext.getFunctionDefinitionImpl[ValueParameterDescriptorImpl]

'descriptor' @ [71:31] ==> public var JsInvocation.descriptor: CallableDescriptor? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'descriptor' @ [72:13] ==> val descriptor: CallableDescriptor? defined in org.jetbrains.kotlin.js.inline.context.FunctionContext.getFunctionDefinitionImpl[LocalVariableDescriptor]

'descriptor' @ [73:17] ==> val descriptor: CallableDescriptor? defined in org.jetbrains.kotlin.js.inline.context.FunctionContext.getFunctionDefinitionImpl[LocalVariableDescriptor]

'functionReader' @ [73:31] ==> private final val functionReader: FunctionReader defined in org.jetbrains.kotlin.js.inline.context.FunctionContext[PropertyDescriptorImpl]

'functionReader' @ [73:54] ==> private final val functionReader: FunctionReader defined in org.jetbrains.kotlin.js.inline.context.FunctionContext[PropertyDescriptorImpl]

'descriptor' @ [73:69] ==> val descriptor: CallableDescriptor? defined in org.jetbrains.kotlin.js.inline.context.FunctionContext.getFunctionDefinitionImpl[LocalVariableDescriptor]

'lookUpStaticFunctionByTag' @ [74:13] ==> protected abstract fun lookUpStaticFunctionByTag(functionTag: String): JsFunction? defined in org.jetbrains.kotlin.js.inline.context.FunctionContext[SimpleFunctionDescriptorImpl]

'getFunctionTag' @ [74:45] ==> @NotNull public open fun getFunctionTag(@NotNull functionDescriptor: CallableDescriptor, @NotNull config: JsConfig): String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'descriptor' @ [74:60] ==> val descriptor: CallableDescriptor? defined in org.jetbrains.kotlin.js.inline.context.FunctionContext.getFunctionDefinitionImpl[LocalVariableDescriptor]

'config' @ [74:72] ==> private final val config: JsConfig defined in org.jetbrains.kotlin.js.inline.context.FunctionContext[PropertyDescriptorImpl]

'let' @ [74:82] ==> @InlineOnly public inline fun <T, R> JsFunction.let(block: (JsFunction) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsFunction
    <R> -> Nothing

'it' @ [74:95] ==> value-parameter it: JsFunction defined in org.jetbrains.kotlin.js.inline.context.FunctionContext.getFunctionDefinitionImpl.<anonymous>[ValueParameterDescriptorImpl]

'if (isCallInvocation(call)) {
            (call.qualifier as JsNameRef).qualifier!!
        }
        else {
            call.qualifier
        }' @ [78:43] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression, elseBranch: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression

'isCallInvocation' @ [78:47] ==> public fun isCallInvocation(invocation: JsInvocation): Boolean defined in org.jetbrains.kotlin.js.inline.util in file invocationUtils.kt[SimpleFunctionDescriptorImpl]

'call' @ [78:64] ==> value-parameter call: JsInvocation defined in org.jetbrains.kotlin.js.inline.context.FunctionContext.getFunctionDefinitionImpl[ValueParameterDescriptorImpl]

'!!' @ [79:13] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: JsExpression?): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> JsExpression

'call' @ [79:14] ==> value-parameter call: JsInvocation defined in org.jetbrains.kotlin.js.inline.context.FunctionContext.getFunctionDefinitionImpl[ValueParameterDescriptorImpl]

'qualifier' @ [79:19] ==> public final var JsInvocation.qualifier: JsExpression[MyPropertyDescriptor]

'qualifier' @ [79:43] ==> public final var JsNameRef.qualifier: JsExpression?[MyPropertyDescriptor]

'call' @ [82:13] ==> value-parameter call: JsInvocation defined in org.jetbrains.kotlin.js.inline.context.FunctionContext.getFunctionDefinitionImpl[ValueParameterDescriptorImpl]

'qualifier' @ [82:18] ==> public final var JsInvocation.qualifier: JsExpression[MyPropertyDescriptor]

'callQualifier' @ [86:25] ==> val callQualifier: JsExpression defined in org.jetbrains.kotlin.js.inline.context.FunctionContext.getFunctionDefinitionImpl[LocalVariableDescriptor]

'transitiveStaticRef' @ [86:39] ==> public val JsExpression.transitiveStaticRef: JsExpression defined in org.jetbrains.kotlin.js.inline.util in file invocationUtils.kt[PropertyDescriptorImpl]

'when (qualifier) {
            is JsInvocation -> {
                tryExtractCallableReference(qualifier) ?: getSimpleName(qualifier)?.let { simpleName ->
                    lookUpStaticFunction(simpleName)?.let { if (isFunctionCreator(it)) it else null }
                }
            }
            is JsNameRef -> lookUpStaticFunction(qualifier.name)
            is JsFunction -> qualifier
            else -> null
        }' @ [87:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsFunction?, entry1: JsFunction?, entry2: JsFunction?, entry3: JsFunction?): JsFunction?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsFunction?

'qualifier' @ [87:22] ==> val qualifier: JsExpression defined in org.jetbrains.kotlin.js.inline.context.FunctionContext.getFunctionDefinitionImpl[LocalVariableDescriptor]

'tryExtractCallableReference' @ [89:17] ==> private final fun tryExtractCallableReference(invocation: JsInvocation): JsFunction? defined in org.jetbrains.kotlin.js.inline.context.FunctionContext[SimpleFunctionDescriptorImpl]

'qualifier' @ [89:45] ==> val qualifier: JsExpression defined in org.jetbrains.kotlin.js.inline.context.FunctionContext.getFunctionDefinitionImpl[LocalVariableDescriptor]

'getSimpleName' @ [89:59] ==> public fun getSimpleName(call: JsInvocation): JsName? defined in org.jetbrains.kotlin.js.inline.util in file invocationUtils.kt[SimpleFunctionDescriptorImpl]

'qualifier' @ [89:73] ==> val qualifier: JsExpression defined in org.jetbrains.kotlin.js.inline.context.FunctionContext.getFunctionDefinitionImpl[LocalVariableDescriptor]

'let' @ [89:85] ==> @InlineOnly public inline fun <T, R> JsName.let(block: (JsName) -> JsFunction?): JsFunction? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName
    <R> -> JsFunction?

'lookUpStaticFunction' @ [90:21] ==> protected abstract fun lookUpStaticFunction(functionName: JsName?): JsFunction? defined in org.jetbrains.kotlin.js.inline.context.FunctionContext[SimpleFunctionDescriptorImpl]

'simpleName' @ [90:42] ==> value-parameter simpleName: JsName defined in org.jetbrains.kotlin.js.inline.context.FunctionContext.getFunctionDefinitionImpl.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [90:55] ==> @InlineOnly public inline fun <T, R> JsFunction.let(block: (JsFunction) -> JsFunction?): JsFunction? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsFunction
    <R> -> JsFunction?

'if (isFunctionCreator(it)) it else null' @ [90:61] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsFunction?, elseBranch: JsFunction?): JsFunction?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsFunction?

'isFunctionCreator' @ [90:65] ==> public fun isFunctionCreator(outer: JsFunction): Boolean defined in org.jetbrains.kotlin.js.inline.util in file functionUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [90:83] ==> value-parameter it: JsFunction defined in org.jetbrains.kotlin.js.inline.context.FunctionContext.getFunctionDefinitionImpl.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [90:88] ==> value-parameter it: JsFunction defined in org.jetbrains.kotlin.js.inline.context.FunctionContext.getFunctionDefinitionImpl.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'lookUpStaticFunction' @ [93:29] ==> protected abstract fun lookUpStaticFunction(functionName: JsName?): JsFunction? defined in org.jetbrains.kotlin.js.inline.context.FunctionContext[SimpleFunctionDescriptorImpl]

'qualifier' @ [93:50] ==> val qualifier: JsExpression defined in org.jetbrains.kotlin.js.inline.context.FunctionContext.getFunctionDefinitionImpl[LocalVariableDescriptor]

'name' @ [93:60] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'qualifier' @ [94:30] ==> val qualifier: JsExpression defined in org.jetbrains.kotlin.js.inline.context.FunctionContext.getFunctionDefinitionImpl[LocalVariableDescriptor]

'invocation' @ [100:13] ==> value-parameter invocation: JsInvocation defined in org.jetbrains.kotlin.js.inline.context.FunctionContext.tryExtractCallableReference[ValueParameterDescriptorImpl]

'isCallableReference' @ [100:24] ==> public var JsInvocation.isCallableReference: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'invocation' @ [101:23] ==> value-parameter invocation: JsInvocation defined in org.jetbrains.kotlin.js.inline.context.FunctionContext.tryExtractCallableReference[ValueParameterDescriptorImpl]

'arguments' @ [101:34] ==> public final val JsInvocation.arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)[MyPropertyDescriptor]

'arg' @ [102:17] ==> val arg: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.context.FunctionContext.tryExtractCallableReference[LocalVariableDescriptor]

'arg' @ [102:43] ==> val arg: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.context.FunctionContext.tryExtractCallableReference[LocalVariableDescriptor]

