'context' @ [39:25] ==> value-parameter context: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.<init>[ValueParameterDescriptorImpl]

'debugProcess' @ [39:33] ==> public final val EvaluationContextImpl.debugProcess: DebugProcessImpl[MyPropertyDescriptor]

'searchScope' @ [39:46] ==> public final val DebugProcessImpl.searchScope: GlobalSearchScope[MyPropertyDescriptor]

'context' @ [40:25] ==> value-parameter context: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.<init>[ValueParameterDescriptorImpl]

'frameProxy' @ [40:33] ==> public final val EvaluationContextImpl.frameProxy: StackFrameProxyImpl?[MyPropertyDescriptor]

'getType' @ [43:32] ==> public open fun getType(p0: (Class<*>..Class<*>?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'Any' @ [43:40] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'java' @ [43:51] ==> public val <T> KClass<Any>.java: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'frame' @ [47:13] ==> private final val frame: StackFrameProxyImpl? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[PropertyDescriptorImpl]

'when (name) {
                THIS_NAME -> {
                    val thisValue = findThis(asmType)
                    if (thisValue != null) {
                        return thisValue
                    }
                }
                else -> {
                    if (isInsideInlineFunctionBody(frame.visibleVariables())) {
                        val number = numberOfInlinedFunctions(frame.visibleVariables())
                        for (inlineFunctionIndex in number downTo 1) {
                            val inlineFunVar = findLocalVariableForInlineArgument(name, inlineFunctionIndex, asmType, true)
                            if (inlineFunVar != null) {
                                return inlineFunVar
                            }
                        }
                    }

                    if (isFunctionType(asmType)) {
                        val variableForLocalFun = findLocalVariableForLocalFun(name, asmType, checkType)
                        if (variableForLocalFun != null) {
                            return variableForLocalFun
                        }
                    }

                    val localVariable = findLocalVariable(name, asmType, checkType)

                    if (localVariable != null) {
                        return localVariable
                    }

                    val capturedValName = getCapturedFieldName(name)
                    val capturedVal = findCapturedLocalVariable(capturedValName, asmType, checkType)
                    if (capturedVal != null) {
                        return capturedVal
                    }
                }
            }' @ [50:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'name' @ [50:19] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[ValueParameterDescriptorImpl]

'THIS_NAME' @ [51:17] ==> internal val THIS_NAME: String defined in org.jetbrains.kotlin.idea.debugger.evaluate in file KotlinEvaluationBuilder.kt[PropertyDescriptorImpl]

'findThis' @ [52:37] ==> private final fun findThis(asmType: Type?): Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'asmType' @ [52:46] ==> value-parameter asmType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[ValueParameterDescriptorImpl]

'thisValue' @ [53:25] ==> val thisValue: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[LocalVariableDescriptor]

'thisValue' @ [54:32] ==> val thisValue: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[LocalVariableDescriptor]

'isInsideInlineFunctionBody' @ [58:25] ==> public fun isInsideInlineFunctionBody(visibleVariables: List<LocalVariableProxyImpl>): Boolean defined in org.jetbrains.kotlin.idea.debugger in file debuggerUtil.kt[SimpleFunctionDescriptorImpl]

'frame' @ [58:52] ==> private final val frame: StackFrameProxyImpl? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[PropertyDescriptorImpl]

'visibleVariables' @ [58:58] ==> @NotNull public open fun visibleVariables(): (MutableList<(LocalVariableProxyImpl..LocalVariableProxyImpl?)>..List<(LocalVariableProxyImpl..LocalVariableProxyImpl?)>) defined in com.intellij.debugger.jdi.StackFrameProxyImpl[JavaMethodDescriptor]

'numberOfInlinedFunctions' @ [59:38] ==> public fun numberOfInlinedFunctions(visibleVariables: List<LocalVariableProxyImpl>): Int defined in org.jetbrains.kotlin.idea.debugger in file debuggerUtil.kt[SimpleFunctionDescriptorImpl]

'frame' @ [59:63] ==> private final val frame: StackFrameProxyImpl? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[PropertyDescriptorImpl]

'visibleVariables' @ [59:69] ==> @NotNull public open fun visibleVariables(): (MutableList<(LocalVariableProxyImpl..LocalVariableProxyImpl?)>..List<(LocalVariableProxyImpl..LocalVariableProxyImpl?)>) defined in com.intellij.debugger.jdi.StackFrameProxyImpl[JavaMethodDescriptor]

'number' @ [60:53] ==> val number: Int defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[LocalVariableDescriptor]

'findLocalVariableForInlineArgument' @ [61:48] ==> private final fun findLocalVariableForInlineArgument(name: String, number: Int, asmType: Type?, checkType: Boolean): Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'name' @ [61:83] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[ValueParameterDescriptorImpl]

'inlineFunctionIndex' @ [61:89] ==> val inlineFunctionIndex: Int defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[LocalVariableDescriptor]

'asmType' @ [61:110] ==> value-parameter asmType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[ValueParameterDescriptorImpl]

'inlineFunVar' @ [62:33] ==> val inlineFunVar: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[LocalVariableDescriptor]

'inlineFunVar' @ [63:40] ==> val inlineFunVar: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[LocalVariableDescriptor]

'isFunctionType' @ [68:25] ==> private final fun isFunctionType(type: Type?): Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'asmType' @ [68:40] ==> value-parameter asmType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[ValueParameterDescriptorImpl]

'findLocalVariableForLocalFun' @ [69:51] ==> private final fun findLocalVariableForLocalFun(name: String, asmType: Type?, checkType: Boolean): Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'name' @ [69:80] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[ValueParameterDescriptorImpl]

'asmType' @ [69:86] ==> value-parameter asmType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[ValueParameterDescriptorImpl]

'checkType' @ [69:95] ==> value-parameter checkType: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[ValueParameterDescriptorImpl]

'variableForLocalFun' @ [70:29] ==> val variableForLocalFun: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[LocalVariableDescriptor]

'variableForLocalFun' @ [71:36] ==> val variableForLocalFun: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[LocalVariableDescriptor]

'findLocalVariable' @ [75:41] ==> private final fun findLocalVariable(name: String, asmType: Type?, checkType: Boolean): Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'name' @ [75:59] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[ValueParameterDescriptorImpl]

'asmType' @ [75:65] ==> value-parameter asmType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[ValueParameterDescriptorImpl]

'checkType' @ [75:74] ==> value-parameter checkType: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[ValueParameterDescriptorImpl]

'localVariable' @ [77:25] ==> val localVariable: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[LocalVariableDescriptor]

'localVariable' @ [78:32] ==> val localVariable: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[LocalVariableDescriptor]

'getCapturedFieldName' @ [81:43] ==> private final fun getCapturedFieldName(name: String): String defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'name' @ [81:64] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[ValueParameterDescriptorImpl]

'findCapturedLocalVariable' @ [82:39] ==> private final fun findCapturedLocalVariable(name: String, asmType: Type?, checkType: Boolean): Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'capturedValName' @ [82:65] ==> val capturedValName: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[LocalVariableDescriptor]

'asmType' @ [82:82] ==> value-parameter asmType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[ValueParameterDescriptorImpl]

'checkType' @ [82:91] ==> value-parameter checkType: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[ValueParameterDescriptorImpl]

'capturedVal' @ [83:25] ==> val capturedVal: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[LocalVariableDescriptor]

'capturedVal' @ [84:32] ==> val capturedVal: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[LocalVariableDescriptor]

'fail' @ [89:20] ==> private final fun fail(message: String, shouldFail: Boolean): Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'name' @ [89:62] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[ValueParameterDescriptorImpl]

'if (checkType) ", type = " + asmType.toString() else ""' @ [89:68] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'checkType' @ [89:72] ==> value-parameter checkType: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[ValueParameterDescriptorImpl]

'+' @ [89:83] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'asmType' @ [89:97] ==> value-parameter asmType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[ValueParameterDescriptorImpl]

'toString' @ [89:105] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

'failIfNotFound' @ [89:127] ==> value-parameter failIfNotFound: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[ValueParameterDescriptorImpl]

'createEvaluateException' @ [92:41] ==> public open fun createEvaluateException(p0: (String..String?)): (EvaluateException..EvaluateException?) defined in com.intellij.debugger.engine.evaluation.EvaluateExceptionUtil[JavaMethodDescriptor]

'name' @ [92:82] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findValue[ValueParameterDescriptorImpl]

'if (shouldFail) throw EvaluateExceptionUtil.createEvaluateException(message) else null' @ [97:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Value?, elseBranch: Value?): Value?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Value?

'shouldFail' @ [97:20] ==> value-parameter shouldFail: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.fail[ValueParameterDescriptorImpl]

'createEvaluateException' @ [97:60] ==> public open fun createEvaluateException(p0: (String..String?)): (EvaluateException..EvaluateException?) defined in com.intellij.debugger.engine.evaluation.EvaluateExceptionUtil[JavaMethodDescriptor]

'message' @ [97:84] ==> value-parameter message: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.fail[ValueParameterDescriptorImpl]

'isInsideInlineFunctionBody' @ [101:13] ==> public fun isInsideInlineFunctionBody(visibleVariables: List<LocalVariableProxyImpl>): Boolean defined in org.jetbrains.kotlin.idea.debugger in file debuggerUtil.kt[SimpleFunctionDescriptorImpl]

'frame' @ [101:40] ==> private final val frame: StackFrameProxyImpl? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[PropertyDescriptorImpl]

'visibleVariables' @ [101:48] ==> @NotNull public open fun visibleVariables(): (MutableList<(LocalVariableProxyImpl..LocalVariableProxyImpl?)>..List<(LocalVariableProxyImpl..LocalVariableProxyImpl?)>) defined in com.intellij.debugger.jdi.StackFrameProxyImpl[JavaMethodDescriptor]

'numberOfInlinedFunctions' @ [102:26] ==> public fun numberOfInlinedFunctions(visibleVariables: List<LocalVariableProxyImpl>): Int defined in org.jetbrains.kotlin.idea.debugger in file debuggerUtil.kt[SimpleFunctionDescriptorImpl]

'frame' @ [102:51] ==> private final val frame: StackFrameProxyImpl? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[PropertyDescriptorImpl]

'visibleVariables' @ [102:57] ==> @NotNull public open fun visibleVariables(): (MutableList<(LocalVariableProxyImpl..LocalVariableProxyImpl?)>..List<(LocalVariableProxyImpl..LocalVariableProxyImpl?)>) defined in com.intellij.debugger.jdi.StackFrameProxyImpl[JavaMethodDescriptor]

'findLocalVariableForInlineArgument' @ [103:32] ==> private final fun findLocalVariableForInlineArgument(name: String, number: Int, asmType: Type?, checkType: Boolean): Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'number' @ [103:76] ==> val number: Int defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findThis[LocalVariableDescriptor]

'asmType' @ [103:84] ==> value-parameter asmType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findThis[ValueParameterDescriptorImpl]

'inlineFunVar' @ [104:17] ==> val inlineFunVar: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findThis[LocalVariableDescriptor]

'inlineFunVar' @ [105:24] ==> val inlineFunVar: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findThis[LocalVariableDescriptor]

'frame' @ [109:26] ==> private final val frame: StackFrameProxyImpl? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[PropertyDescriptorImpl]

'thisObject' @ [109:32] ==> @Nullable public open fun thisObject(): ObjectReference? defined in com.intellij.debugger.jdi.StackFrameProxyImpl[JavaMethodDescriptor]

'thisObject' @ [110:13] ==> val thisObject: ObjectReference? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findThis[LocalVariableDescriptor]

'thisObject' @ [111:31] ==> val thisObject: ObjectReference? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findThis[LocalVariableDescriptor]

'asValue' @ [111:42] ==> public fun ObjectReference?.asValue(): ObjectValue defined in org.jetbrains.eval4j.jdi[DeserializedSimpleFunctionDescriptor]

'isValueOfCorrectType' @ [112:17] ==> private final fun isValueOfCorrectType(value: Value, asmType: Type?, shouldCheckType: Boolean): Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'eval4jValue' @ [112:38] ==> val eval4jValue: ObjectValue defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findThis[LocalVariableDescriptor]

'asmType' @ [112:51] ==> value-parameter asmType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findThis[ValueParameterDescriptorImpl]

'eval4jValue' @ [112:74] ==> val eval4jValue: ObjectValue defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findThis[LocalVariableDescriptor]

'findValue' @ [115:24] ==> public final fun findValue(name: String, asmType: Type?, checkType: Boolean, failIfNotFound: Boolean): Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'RECEIVER_NAME' @ [115:34] ==> internal val RECEIVER_NAME: String defined in org.jetbrains.kotlin.idea.debugger.evaluate in file KotlinEvaluationBuilder.kt[PropertyDescriptorImpl]

'asmType' @ [115:49] ==> value-parameter asmType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findThis[ValueParameterDescriptorImpl]

'receiver' @ [116:13] ==> val receiver: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findThis[LocalVariableDescriptor]

'receiver' @ [116:38] ==> val receiver: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findThis[LocalVariableDescriptor]

'findValue' @ [118:21] ==> public final fun findValue(name: String, asmType: Type?, checkType: Boolean, failIfNotFound: Boolean): Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'CAPTURED_THIS_FIELD' @ [118:39] ==> public const final val CAPTURED_THIS_FIELD: String defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaPropertyDescriptor]

'asmType' @ [118:60] ==> value-parameter asmType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findThis[ValueParameterDescriptorImpl]

'this0' @ [119:13] ==> val this0: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findThis[LocalVariableDescriptor]

'this0' @ [119:35] ==> val this0: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findThis[LocalVariableDescriptor]

'findValue' @ [121:23] ==> public final fun findValue(name: String, asmType: Type?, checkType: Boolean, failIfNotFound: Boolean): Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'asmType' @ [121:43] ==> value-parameter asmType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findThis[ValueParameterDescriptorImpl]

'`$this`' @ [122:13] ==> val `$this`: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findThis[LocalVariableDescriptor]

'`$this`' @ [122:37] ==> val `$this`: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findThis[LocalVariableDescriptor]

'findLocalVariable' @ [128:16] ==> private final fun findLocalVariable(name: String, asmType: Type?, checkType: Boolean): Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'name' @ [128:34] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findLocalVariableForLocalFun[ValueParameterDescriptorImpl]

'asmType' @ [128:46] ==> value-parameter asmType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findLocalVariableForLocalFun[ValueParameterDescriptorImpl]

'checkType' @ [128:55] ==> value-parameter checkType: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findLocalVariableForLocalFun[ValueParameterDescriptorImpl]

'findLocalVariable' @ [132:16] ==> private final fun findLocalVariable(name: String, asmType: Type?, checkType: Boolean): Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'name' @ [132:34] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findLocalVariableForInlineArgument[ValueParameterDescriptorImpl]

'INLINE_FUN_VAR_SUFFIX' @ [132:41] ==> public const val INLINE_FUN_VAR_SUFFIX: String defined in org.jetbrains.kotlin.codegen.inline[DeserializedPropertyDescriptor]

'repeat' @ [132:63] ==> public fun CharSequence.repeat(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'number' @ [132:70] ==> value-parameter number: Int defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findLocalVariableForInlineArgument[ValueParameterDescriptorImpl]

'asmType' @ [132:79] ==> value-parameter asmType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findLocalVariableForInlineArgument[ValueParameterDescriptorImpl]

'checkType' @ [132:88] ==> value-parameter checkType: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findLocalVariableForInlineArgument[ValueParameterDescriptorImpl]

'type' @ [136:16] ==> value-parameter type: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isFunctionType[ValueParameterDescriptorImpl]

'sort' @ [136:22] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'OBJECT' @ [136:35] ==> public const final val OBJECT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'type' @ [137:16] ==> value-parameter type: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isFunctionType[ValueParameterDescriptorImpl]

'internalName' @ [137:21] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'startsWith' @ [137:34] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'NUMBERED_FUNCTION_PREFIX' @ [137:45] ==> public const val NUMBERED_FUNCTION_PREFIX: String defined in org.jetbrains.kotlin.codegen.inline[DeserializedPropertyDescriptor]

'frame' @ [141:29] ==> private final val frame: StackFrameProxyImpl? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[PropertyDescriptorImpl]

'visibleVariableByName' @ [141:37] ==> public open fun visibleVariableByName(p0: (String..String?)): (LocalVariableProxyImpl..LocalVariableProxyImpl?) defined in com.intellij.debugger.jdi.StackFrameProxyImpl[JavaMethodDescriptor]

'name' @ [141:59] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findLocalVariable[ValueParameterDescriptorImpl]

'frame' @ [143:27] ==> private final val frame: StackFrameProxyImpl? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[PropertyDescriptorImpl]

'getValue' @ [143:33] ==> public open fun getValue(p0: (LocalVariableProxyImpl..LocalVariableProxyImpl?)): (Value..Value?) defined in com.intellij.debugger.jdi.StackFrameProxyImpl[JavaMethodDescriptor]

'localVariable' @ [143:42] ==> val localVariable: LocalVariableProxyImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findLocalVariable[LocalVariableDescriptor]

'asValue' @ [143:57] ==> public fun Value?.asValue(): Value defined in org.jetbrains.eval4j.jdi[DeserializedSimpleFunctionDescriptor]

'getValueIfSharedVar' @ [144:30] ==> public final fun getValueIfSharedVar(value: Value, expectedType: Type?, checkType: Boolean): Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'eval4jValue' @ [144:50] ==> val eval4jValue: Value defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findLocalVariable[LocalVariableDescriptor]

'asmType' @ [144:63] ==> value-parameter asmType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findLocalVariable[ValueParameterDescriptorImpl]

'checkType' @ [144:72] ==> value-parameter checkType: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findLocalVariable[ValueParameterDescriptorImpl]

'sharedVarValue' @ [145:13] ==> val sharedVarValue: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findLocalVariable[LocalVariableDescriptor]

'sharedVarValue' @ [146:20] ==> val sharedVarValue: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findLocalVariable[LocalVariableDescriptor]

'isValueOfCorrectType' @ [149:13] ==> private final fun isValueOfCorrectType(value: Value, asmType: Type?, shouldCheckType: Boolean): Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'eval4jValue' @ [149:34] ==> val eval4jValue: Value defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findLocalVariable[LocalVariableDescriptor]

'asmType' @ [149:47] ==> value-parameter asmType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findLocalVariable[ValueParameterDescriptorImpl]

'checkType' @ [149:56] ==> value-parameter checkType: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findLocalVariable[ValueParameterDescriptorImpl]

'eval4jValue' @ [150:20] ==> val eval4jValue: Value defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findLocalVariable[LocalVariableDescriptor]

'frame' @ [157:26] ==> private final val frame: StackFrameProxyImpl? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[PropertyDescriptorImpl]

'thisObject' @ [157:33] ==> @Nullable public open fun thisObject(): ObjectReference? defined in com.intellij.debugger.jdi.StackFrameProxyImpl[JavaMethodDescriptor]

'thisObject' @ [159:31] ==> val thisObject: ObjectReference defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findCapturedLocalVariable[LocalVariableDescriptor]

'asValue' @ [159:42] ==> public fun ObjectReference?.asValue(): ObjectValue defined in org.jetbrains.eval4j.jdi[DeserializedSimpleFunctionDescriptor]

'capturedVal' @ [161:16] ==> var capturedVal: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findCapturedLocalVariable[LocalVariableDescriptor]

'thisObj' @ [161:39] ==> var thisObj: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findCapturedLocalVariable[LocalVariableDescriptor]

'capturedVal' @ [162:13] ==> var capturedVal: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findCapturedLocalVariable[LocalVariableDescriptor]

'getField' @ [162:27] ==> private final fun getField(owner: Value, name: String, asmType: Type?, checkType: Boolean): Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'thisObj' @ [162:36] ==> var thisObj: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findCapturedLocalVariable[LocalVariableDescriptor]

'name' @ [162:45] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findCapturedLocalVariable[ValueParameterDescriptorImpl]

'asmType' @ [162:51] ==> value-parameter asmType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findCapturedLocalVariable[ValueParameterDescriptorImpl]

'checkType' @ [162:60] ==> value-parameter checkType: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findCapturedLocalVariable[ValueParameterDescriptorImpl]

'capturedVal' @ [163:17] ==> var capturedVal: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findCapturedLocalVariable[LocalVariableDescriptor]

'thisObj' @ [164:17] ==> var thisObj: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findCapturedLocalVariable[LocalVariableDescriptor]

'getField' @ [164:27] ==> private final fun getField(owner: Value, name: String, asmType: Type?, checkType: Boolean): Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'thisObj' @ [164:36] ==> var thisObj: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findCapturedLocalVariable[LocalVariableDescriptor]

'CAPTURED_THIS_FIELD' @ [164:53] ==> public const final val CAPTURED_THIS_FIELD: String defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaPropertyDescriptor]

'capturedVal' @ [168:13] ==> var capturedVal: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findCapturedLocalVariable[LocalVariableDescriptor]

'getValueIfSharedVar' @ [169:34] ==> public final fun getValueIfSharedVar(value: Value, expectedType: Type?, checkType: Boolean): Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'capturedVal' @ [169:54] ==> var capturedVal: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findCapturedLocalVariable[LocalVariableDescriptor]

'asmType' @ [169:67] ==> value-parameter asmType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findCapturedLocalVariable[ValueParameterDescriptorImpl]

'checkType' @ [169:76] ==> value-parameter checkType: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findCapturedLocalVariable[ValueParameterDescriptorImpl]

'sharedVarValue' @ [170:17] ==> val sharedVarValue: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findCapturedLocalVariable[LocalVariableDescriptor]

'sharedVarValue' @ [171:24] ==> val sharedVarValue: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findCapturedLocalVariable[LocalVariableDescriptor]

'capturedVal' @ [173:20] ==> var capturedVal: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.findCapturedLocalVariable[LocalVariableDescriptor]

'!' @ [180:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'shouldCheckType' @ [180:14] ==> value-parameter shouldCheckType: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isValueOfCorrectType[ValueParameterDescriptorImpl]

'asmType' @ [180:33] ==> value-parameter asmType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isValueOfCorrectType[ValueParameterDescriptorImpl]

'value' @ [180:52] ==> value-parameter value: Value defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isValueOfCorrectType[ValueParameterDescriptorImpl]

'asmType' @ [180:58] ==> public abstract val asmType: Type defined in org.jetbrains.eval4j.Value[DeserializedPropertyDescriptor]

'asmType' @ [180:69] ==> value-parameter asmType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isValueOfCorrectType[ValueParameterDescriptorImpl]

'asmType' @ [182:13] ==> value-parameter asmType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isValueOfCorrectType[ValueParameterDescriptorImpl]

'OBJECT_TYPE' @ [182:24] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.Companion[PropertyDescriptorImpl]

'value' @ [184:14] ==> value-parameter value: Value defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isValueOfCorrectType[ValueParameterDescriptorImpl]

'obj' @ [184:20] ==> public fun Value.obj(expectedType: Type = ...): Any? defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'referenceType' @ [184:60] ==> public abstract fun referenceType(): (ReferenceType..ReferenceType?) defined in com.sun.jdi.ObjectReference[JavaMethodDescriptor]

'isSubclass' @ [184:76] ==> private final fun Type?.isSubclass(superClassName: String): Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'asmType' @ [184:87] ==> value-parameter asmType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isValueOfCorrectType[ValueParameterDescriptorImpl]

'className' @ [184:95] ==> public final val Type.className: (String..String?)[MyPropertyDescriptor]

'value' @ [188:24] ==> value-parameter value: Value defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isValueOfCorrectType[ValueParameterDescriptorImpl]

'asmType' @ [188:30] ==> public abstract val asmType: Type defined in org.jetbrains.eval4j.Value[DeserializedPropertyDescriptor]

'getClassDescriptor' @ [188:38] ==> public fun Type.getClassDescriptor(scope: GlobalSearchScope): ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate in file KotlinEvaluationBuilder.kt[SimpleFunctionDescriptorImpl]

'scope' @ [188:57] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[PropertyDescriptorImpl]

'asmType' @ [189:23] ==> value-parameter asmType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isValueOfCorrectType[ValueParameterDescriptorImpl]

'getClassDescriptor' @ [189:31] ==> public fun Type.getClassDescriptor(scope: GlobalSearchScope): ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate in file KotlinEvaluationBuilder.kt[SimpleFunctionDescriptorImpl]

'scope' @ [189:50] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[PropertyDescriptorImpl]

'thisDesc' @ [190:16] ==> val thisDesc: ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isValueOfCorrectType[LocalVariableDescriptor]

'expDesc' @ [190:36] ==> val expDesc: ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isValueOfCorrectType[LocalVariableDescriptor]

'runReadAction' @ [190:55] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'isSubclass' @ [190:87] ==> public open fun isSubclass(@NotNull p0: ClassDescriptor, @NotNull p1: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'thisDesc' @ [190:98] ==> val thisDesc: ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isValueOfCorrectType[LocalVariableDescriptor]

'expDesc' @ [190:108] ==> val expDesc: ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isValueOfCorrectType[LocalVariableDescriptor]

'owner' @ [195:23] ==> value-parameter owner: Value defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.getField[ValueParameterDescriptorImpl]

'asJdiValue' @ [195:29] ==> public fun Value.asJdiValue(vm: VirtualMachine, expectedType: Type): Value? defined in org.jetbrains.eval4j.jdi[DeserializedSimpleFunctionDescriptor]

'frame' @ [195:40] ==> private final val frame: StackFrameProxyImpl? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[PropertyDescriptorImpl]

'virtualMachine' @ [195:48] ==> public final val StackFrameProxyImpl.virtualMachine: VirtualMachineProxyImpl[MyPropertyDescriptor]

'virtualMachine' @ [195:63] ==> public final val VirtualMachineProxyImpl.virtualMachine: VirtualMachine[MyPropertyDescriptor]

'owner' @ [195:79] ==> value-parameter owner: Value defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.getField[ValueParameterDescriptorImpl]

'asmType' @ [195:85] ==> public abstract val asmType: Type defined in org.jetbrains.eval4j.Value[DeserializedPropertyDescriptor]

'obj' @ [196:17] ==> val obj: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.getField[LocalVariableDescriptor]

'obj' @ [198:26] ==> val obj: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.getField[LocalVariableDescriptor]

'referenceType' @ [198:30] ==> public abstract fun referenceType(): (ReferenceType..ReferenceType?) defined in com.sun.jdi.ObjectReference[JavaMethodDescriptor]

'_class' @ [199:25] ==> val _class: (ReferenceType..ReferenceType?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.getField[LocalVariableDescriptor]

'fieldByName' @ [199:32] ==> public abstract fun fieldByName(p0: (String..String?)): (Field..Field?) defined in com.sun.jdi.ReferenceType[JavaMethodDescriptor]

'name' @ [199:44] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.getField[ValueParameterDescriptorImpl]

'obj' @ [201:30] ==> val obj: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.getField[LocalVariableDescriptor]

'getValue' @ [201:34] ==> public abstract fun getValue(p0: (Field..Field?)): (Value..Value?) defined in com.sun.jdi.ObjectReference[JavaMethodDescriptor]

'field' @ [201:43] ==> val field: Field defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.getField[LocalVariableDescriptor]

'asValue' @ [201:50] ==> public fun Value?.asValue(): Value defined in org.jetbrains.eval4j.jdi[DeserializedSimpleFunctionDescriptor]

'isValueOfCorrectType' @ [202:17] ==> private final fun isValueOfCorrectType(value: Value, asmType: Type?, shouldCheckType: Boolean): Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'fieldValue' @ [202:38] ==> val fieldValue: Value defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.getField[LocalVariableDescriptor]

'asmType' @ [202:50] ==> value-parameter asmType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.getField[ValueParameterDescriptorImpl]

'checkType' @ [202:59] ==> value-parameter checkType: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.getField[ValueParameterDescriptorImpl]

'fieldValue' @ [202:78] ==> val fieldValue: Value defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.getField[LocalVariableDescriptor]

'this' @ [211:16] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isSharedVar[ReceiverParameterDescriptorImpl]

'asmType' @ [211:21] ==> public abstract val asmType: Type defined in org.jetbrains.eval4j.Value[DeserializedPropertyDescriptor]

'sort' @ [211:29] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'OBJECT' @ [211:42] ==> public const final val OBJECT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'this' @ [211:52] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isSharedVar[ReceiverParameterDescriptorImpl]

'asmType' @ [211:57] ==> public abstract val asmType: Type defined in org.jetbrains.eval4j.Value[DeserializedPropertyDescriptor]

'internalName' @ [211:65] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'startsWith' @ [211:78] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'REF_TYPE_PREFIX' @ [211:98] ==> public const final val REF_TYPE_PREFIX: String defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'!' @ [215:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'value' @ [215:14] ==> value-parameter value: Value defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.getValueIfSharedVar[ValueParameterDescriptorImpl]

'isSharedVar' @ [215:20] ==> private final fun Value.isSharedVar(): Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'getField' @ [217:30] ==> private final fun getField(owner: Value, name: String, asmType: Type?, checkType: Boolean): Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'value' @ [217:39] ==> value-parameter value: Value defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.getValueIfSharedVar[ValueParameterDescriptorImpl]

'expectedType' @ [217:57] ==> value-parameter expectedType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.getValueIfSharedVar[ValueParameterDescriptorImpl]

'checkType' @ [217:71] ==> value-parameter checkType: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.getValueIfSharedVar[ValueParameterDescriptorImpl]

'sharedVarValue' @ [218:13] ==> val sharedVarValue: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.getValueIfSharedVar[LocalVariableDescriptor]

'isValueOfCorrectType' @ [218:39] ==> private final fun isValueOfCorrectType(value: Value, asmType: Type?, shouldCheckType: Boolean): Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor[SimpleFunctionDescriptorImpl]

'sharedVarValue' @ [218:60] ==> val sharedVarValue: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.getValueIfSharedVar[LocalVariableDescriptor]

'expectedType' @ [218:76] ==> value-parameter expectedType: Type? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.getValueIfSharedVar[ValueParameterDescriptorImpl]

'checkType' @ [218:90] ==> value-parameter checkType: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.getValueIfSharedVar[ValueParameterDescriptorImpl]

'sharedVarValue' @ [219:20] ==> val sharedVarValue: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.getValueIfSharedVar[LocalVariableDescriptor]

'when (name) {
        RECEIVER_NAME -> AsmUtil.CAPTURED_RECEIVER_FIELD
        THIS_NAME -> AsmUtil.CAPTURED_THIS_FIELD
        AsmUtil.CAPTURED_RECEIVER_FIELD -> name
        AsmUtil.CAPTURED_THIS_FIELD -> name
        else -> "$$name"
    }' @ [224:54] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String, entry4: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'name' @ [224:60] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.getCapturedFieldName[ValueParameterDescriptorImpl]

'RECEIVER_NAME' @ [225:9] ==> internal val RECEIVER_NAME: String defined in org.jetbrains.kotlin.idea.debugger.evaluate in file KotlinEvaluationBuilder.kt[PropertyDescriptorImpl]

'CAPTURED_RECEIVER_FIELD' @ [225:34] ==> public const final val CAPTURED_RECEIVER_FIELD: String defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaPropertyDescriptor]

'THIS_NAME' @ [226:9] ==> internal val THIS_NAME: String defined in org.jetbrains.kotlin.idea.debugger.evaluate in file KotlinEvaluationBuilder.kt[PropertyDescriptorImpl]

'CAPTURED_THIS_FIELD' @ [226:30] ==> public const final val CAPTURED_THIS_FIELD: String defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaPropertyDescriptor]

'CAPTURED_RECEIVER_FIELD' @ [227:17] ==> public const final val CAPTURED_RECEIVER_FIELD: String defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaPropertyDescriptor]

'name' @ [227:44] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.getCapturedFieldName[ValueParameterDescriptorImpl]

'CAPTURED_THIS_FIELD' @ [228:17] ==> public const final val CAPTURED_THIS_FIELD: String defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaPropertyDescriptor]

'name' @ [228:40] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.getCapturedFieldName[ValueParameterDescriptorImpl]

'name' @ [229:20] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.getCapturedFieldName[ValueParameterDescriptorImpl]

'this' @ [233:13] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isSubclass[ReceiverParameterDescriptorImpl]

'allInterfaces' @ [234:13] ==> public abstract fun allInterfaces(): (MutableList<(InterfaceType..InterfaceType?)>..List<(InterfaceType..InterfaceType?)>?) defined in com.sun.jdi.ClassType[JavaMethodDescriptor]

'any' @ [234:29] ==> public inline fun <T> Iterable<(InterfaceType..InterfaceType?)>.any(predicate: ((InterfaceType..InterfaceType?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.jdi.InterfaceType..com.sun.jdi.InterfaceType?)

'it' @ [234:35] ==> value-parameter it: (InterfaceType..InterfaceType?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isSubclass.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [234:38] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.InterfaceType[JavaMethodDescriptor]

'superClassName' @ [234:48] ==> value-parameter superClassName: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isSubclass[ValueParameterDescriptorImpl]

'this' @ [238:26] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isSubclass[ReceiverParameterDescriptorImpl]

'superclass' @ [238:31] ==> public abstract fun superclass(): (ClassType..ClassType?) defined in com.sun.jdi.ClassType[JavaMethodDescriptor]

'superClass' @ [239:16] ==> var superClass: (ClassType..ClassType?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isSubclass[LocalVariableDescriptor]

'superClass' @ [240:17] ==> var superClass: (ClassType..ClassType?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isSubclass[LocalVariableDescriptor]

'name' @ [240:28] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.ClassType[JavaMethodDescriptor]

'superClassName' @ [240:38] ==> value-parameter superClassName: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isSubclass[ValueParameterDescriptorImpl]

'superClass' @ [243:13] ==> var superClass: (ClassType..ClassType?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isSubclass[LocalVariableDescriptor]

'superClass' @ [243:26] ==> var superClass: (ClassType..ClassType?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.FrameVisitor.isSubclass[LocalVariableDescriptor]

'superclass' @ [243:37] ==> public abstract fun superclass(): (ClassType..ClassType?) defined in com.sun.jdi.ClassType[JavaMethodDescriptor]

