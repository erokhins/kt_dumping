'exception' @ [32:48] ==> public final val exception: ObjectValue defined in org.jetbrains.eval4j.ExceptionThrown[PropertyDescriptorImpl]

'kind' @ [32:60] ==> public final val kind: ExceptionThrown.ExceptionKind defined in org.jetbrains.eval4j.ExceptionThrown[PropertyDescriptorImpl]

'result' @ [42:50] ==> public final val result: Value defined in org.jetbrains.eval4j.ValueReturned[PropertyDescriptorImpl]

'message' @ [46:64] ==> public final val message: String defined in org.jetbrains.eval4j.AbnormalTermination[PropertyDescriptorImpl]

'RuntimeException' @ [63:63] ==> public final fun <init>(p0: (Throwable..Throwable?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'cause' @ [63:80] ==> value-parameter cause: Throwable defined in org.jetbrains.eval4j.ThrownFromEvalExceptionBase.<init>[ValueParameterDescriptorImpl]

'cause' @ [64:63] ==> public open val cause: Throwable? defined in org.jetbrains.eval4j.ThrownFromEvalExceptionBase[DeserializedPropertyDescriptor]

'ThrownFromEvalExceptionBase' @ [67:37] ==> public constructor ThrownFromEvalExceptionBase(cause: Throwable) defined in org.jetbrains.eval4j.ThrownFromEvalExceptionBase[ClassConstructorDescriptorImpl]

'cause' @ [67:65] ==> value-parameter cause: Throwable defined in org.jetbrains.eval4j.BrokenCode.<init>[ValueParameterDescriptorImpl]

'ThrownFromEvalExceptionBase' @ [68:50] ==> public constructor ThrownFromEvalExceptionBase(cause: Throwable) defined in org.jetbrains.eval4j.ThrownFromEvalExceptionBase[ClassConstructorDescriptorImpl]

'cause' @ [68:78] ==> value-parameter cause: Throwable defined in org.jetbrains.eval4j.ThrownFromEvalException.<init>[ValueParameterDescriptorImpl]

'RuntimeException' @ [70:69] ==> public final fun <init>(): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'exception' @ [71:69] ==> public final val exception: ObjectValue defined in org.jetbrains.eval4j.ThrownFromEvaluatedCodeException[PropertyDescriptorImpl]

'NONE' @ [78:74] ==> public object NONE : InterpretationEventHandler defined in org.jetbrains.eval4j.InterpretationEventHandler[FakeCallableDescriptorForObject]

'm' @ [80:21] ==> value-parameter m: MethodNode defined in org.jetbrains.eval4j.interpreterLoop[ValueParameterDescriptorImpl]

'instructions' @ [80:23] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'first' @ [80:36] ==> public final val InsnList.first: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'firstInsn' @ [81:9] ==> val firstInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'IllegalArgumentException' @ [81:34] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'firstInsn' @ [83:23] ==> val firstInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'nextInsn' @ [86:13] ==> value-parameter nextInsn: AbstractInsnNode? defined in org.jetbrains.eval4j.interpreterLoop.goto[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [86:37] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'currentInsn' @ [87:9] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'nextInsn' @ [87:23] ==> value-parameter nextInsn: AbstractInsnNode? defined in org.jetbrains.eval4j.interpreterLoop.goto[ValueParameterDescriptorImpl]

'SingleInstructionInterpreter' @ [90:23] ==> public constructor SingleInstructionInterpreter(eval: Eval) defined in org.jetbrains.eval4j.SingleInstructionInterpreter[ClassConstructorDescriptorImpl]

'eval' @ [90:52] ==> value-parameter eval: Eval defined in org.jetbrains.eval4j.interpreterLoop[ValueParameterDescriptorImpl]

'Frame' @ [91:17] ==> public constructor Frame<V : (Value..Value?)>(p0: (Frame<out (Value..Value?)>..Frame<out (Value..Value?)>?)) defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaClassConstructorDescriptor]
Inferred types:
    <V : (Value..Value?)> -> (org.jetbrains.eval4j.Value..org.jetbrains.eval4j.Value?)

'initialState' @ [91:23] ==> value-parameter initialState: Frame<Value> defined in org.jetbrains.eval4j.interpreterLoop[ValueParameterDescriptorImpl]

'computeHandlers' @ [92:20] ==> public fun computeHandlers(m: MethodNode): Array<out List<TryCatchBlockNode>?> defined in org.jetbrains.eval4j in file interpreterLoop.kt[SimpleFunctionDescriptorImpl]

'm' @ [92:36] ==> value-parameter m: MethodNode defined in org.jetbrains.eval4j.interpreterLoop[ValueParameterDescriptorImpl]

'RuntimeException' @ [94:59] ==> public final fun <init>(): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'handlers' @ [97:27] ==> val handlers: Array<out List<TryCatchBlockNode>?> defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'm' @ [97:36] ==> value-parameter m: MethodNode defined in org.jetbrains.eval4j.interpreterLoop[ValueParameterDescriptorImpl]

'instructions' @ [97:38] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'indexOf' @ [97:51] ==> public open fun indexOf(p0: (AbstractInsnNode..AbstractInsnNode?)): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'currentInsn' @ [97:59] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'listOf' @ [97:76] ==> @InlineOnly public inline fun <T> listOf(): List<TryCatchBlockNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TryCatchBlockNode

'catchBlocks' @ [98:23] ==> val catchBlocks: List<TryCatchBlockNode> defined in org.jetbrains.eval4j.interpreterLoop.exceptionCaught[LocalVariableDescriptor]

'catch' @ [99:45] ==> val catch: TryCatchBlockNode defined in org.jetbrains.eval4j.interpreterLoop.exceptionCaught[LocalVariableDescriptor]

'type' @ [99:51] ==> public final var type: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'exceptionTypeInternalName' @ [100:17] ==> val exceptionTypeInternalName: (String..String?) defined in org.jetbrains.eval4j.interpreterLoop.exceptionCaught[LocalVariableDescriptor]

'getObjectType' @ [101:42] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'exceptionTypeInternalName' @ [101:56] ==> val exceptionTypeInternalName: (String..String?) defined in org.jetbrains.eval4j.interpreterLoop.exceptionCaught[LocalVariableDescriptor]

'invoke' @ [102:21] ==> public abstract operator fun invoke(p1: Type): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'exceptionType' @ [102:32] ==> val exceptionType: (Type..Type?) defined in org.jetbrains.eval4j.interpreterLoop.exceptionCaught[LocalVariableDescriptor]

'handler' @ [103:35] ==> value-parameter handler: InterpretationEventHandler = ... defined in org.jetbrains.eval4j.interpreterLoop[ValueParameterDescriptorImpl]

'exceptionCaught' @ [103:43] ==> public abstract fun exceptionCaught(currentState: Frame<Value>, currentInsn: AbstractInsnNode, exception: Value): InterpreterResult? defined in org.jetbrains.eval4j.InterpretationEventHandler[SimpleFunctionDescriptorImpl]

'frame' @ [103:59] ==> val frame: Frame<(Value..Value?)> defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'currentInsn' @ [103:66] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'exceptionValue' @ [103:79] ==> value-parameter exceptionValue: Value defined in org.jetbrains.eval4j.interpreterLoop.exceptionCaught[ValueParameterDescriptorImpl]

'handled' @ [104:25] ==> val handled: InterpreterResult? defined in org.jetbrains.eval4j.interpreterLoop.exceptionCaught[LocalVariableDescriptor]

'ResultException' @ [104:48] ==> public constructor ResultException(result: InterpreterResult) defined in org.jetbrains.eval4j.interpreterLoop.ResultException[ClassConstructorDescriptorImpl]

'handled' @ [104:64] ==> val handled: InterpreterResult? defined in org.jetbrains.eval4j.interpreterLoop.exceptionCaught[LocalVariableDescriptor]

'frame' @ [105:21] ==> val frame: Frame<(Value..Value?)> defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'clearStack' @ [105:27] ==> public open fun clearStack(): Unit defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaMethodDescriptor]

'frame' @ [106:21] ==> val frame: Frame<(Value..Value?)> defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'push' @ [106:27] ==> public open fun push(p0: (Value..Value?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaMethodDescriptor]

'exceptionValue' @ [106:32] ==> value-parameter exceptionValue: Value defined in org.jetbrains.eval4j.interpreterLoop.exceptionCaught[ValueParameterDescriptorImpl]

'goto' @ [107:21] ==> local final fun goto(nextInsn: AbstractInsnNode?): Unit defined in org.jetbrains.eval4j.interpreterLoop[SimpleFunctionDescriptorImpl]

'catch' @ [107:26] ==> val catch: TryCatchBlockNode defined in org.jetbrains.eval4j.interpreterLoop.exceptionCaught[LocalVariableDescriptor]

'handler' @ [107:32] ==> public final var handler: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'exceptionCaught' @ [115:59] ==> local final fun exceptionCaught(exceptionValue: Value, instanceOf: (Type) -> Boolean): Boolean defined in org.jetbrains.eval4j.interpreterLoop[SimpleFunctionDescriptorImpl]

'exceptionValue' @ [115:75] ==> value-parameter exceptionValue: Value defined in org.jetbrains.eval4j.interpreterLoop.exceptionCaught[ValueParameterDescriptorImpl]

'eval' @ [116:26] ==> value-parameter eval: Eval defined in org.jetbrains.eval4j.interpreterLoop[ValueParameterDescriptorImpl]

'isInstanceOf' @ [116:31] ==> public abstract fun isInstanceOf(value: Value, targetType: Type): Boolean defined in org.jetbrains.eval4j.Eval[SimpleFunctionDescriptorImpl]

'exceptionValue' @ [116:44] ==> value-parameter exceptionValue: Value defined in org.jetbrains.eval4j.interpreterLoop.exceptionCaught[ValueParameterDescriptorImpl]

'exceptionType' @ [116:60] ==> value-parameter exceptionType: Type defined in org.jetbrains.eval4j.interpreterLoop.exceptionCaught.<anonymous>[ValueParameterDescriptorImpl]

'exceptionCaught' @ [120:16] ==> local final fun exceptionCaught(exceptionValue: Value, instanceOf: (Type) -> Boolean): Boolean defined in org.jetbrains.eval4j.interpreterLoop[SimpleFunctionDescriptorImpl]

'exceptionValue' @ [120:32] ==> value-parameter exceptionValue: Value defined in org.jetbrains.eval4j.interpreterLoop.exceptionFromEvalCaught[ValueParameterDescriptorImpl]

'exception' @ [123:38] ==> value-parameter exception: Throwable defined in org.jetbrains.eval4j.interpreterLoop.exceptionFromEvalCaught[ValueParameterDescriptorImpl]

'java' @ [123:55] ==> public val <T> KClass<out Throwable>.java: Class<out Throwable> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Throwable)

'forName' @ [124:36] ==> @CallerSensitive public open fun forName(p0: (String..String?), p1: Boolean, p2: (ClassLoader..ClassLoader?)): (Class<*>..Class<*>?) defined in java.lang.Class[JavaMethodDescriptor]

'exceptionType' @ [125:25] ==> value-parameter exceptionType: Type defined in org.jetbrains.eval4j.interpreterLoop.exceptionFromEvalCaught.<anonymous>[ValueParameterDescriptorImpl]

'internalName' @ [125:39] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'replace' @ [125:52] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'exceptionClass' @ [127:25] ==> val exceptionClass: Class<out Throwable> defined in org.jetbrains.eval4j.interpreterLoop.exceptionFromEvalCaught.<anonymous>[LocalVariableDescriptor]

'classLoader' @ [127:40] ==> public final val <T : (Any..Any?)> Class<out Throwable>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out Throwable)

'_class' @ [129:17] ==> val _class: (Class<*>..Class<*>?) defined in org.jetbrains.eval4j.interpreterLoop.exceptionFromEvalCaught.<anonymous>[LocalVariableDescriptor]

'isAssignableFrom' @ [129:24] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'exceptionClass' @ [129:41] ==> val exceptionClass: Class<out Throwable> defined in org.jetbrains.eval4j.interpreterLoop.exceptionFromEvalCaught.<anonymous>[LocalVariableDescriptor]

'currentInsn' @ [140:30] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'opcode' @ [140:42] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'currentInsn' @ [141:28] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'type' @ [141:40] ==> public final val AbstractInsnNode.type: Int[MyPropertyDescriptor]

'when (insnType) {
                AbstractInsnNode.LABEL,
                AbstractInsnNode.FRAME,
                AbstractInsnNode.LINE -> {
                    // skip to the next instruction
                }

                else -> {
                    when (insnOpcode) {
                        GOTO -> {
                            goto((currentInsn as JumpInsnNode).label)
                            continue@loop
                        }

                        RET -> {
                            val varNode = currentInsn as VarInsnNode
                            val address = frame.getLocal(varNode.`var`)
                            goto((address as LabelValue).value)
                            continue@loop
                        }

                        // TODO: switch
                        LOOKUPSWITCH -> UnsupportedByteCodeException("LOOKUPSWITCH is not supported yet")
                        TABLESWITCH -> UnsupportedByteCodeException("TABLESWITCH is not supported yet")

                        IRETURN, LRETURN, FRETURN, DRETURN, ARETURN -> {
                            val value = frame.getStackTop()
                            val expectedType = Type.getReturnType(m.desc)
                            if (expectedType.sort == Type.OBJECT || expectedType.sort == Type.ARRAY) {
                                val coerced = if (value != NULL_VALUE && value.asmType != expectedType)
                                                    ObjectValue(value.obj(), expectedType)
                                              else value
                                return ValueReturned(coerced)
                            }
                            if (value.asmType != expectedType) {
                                assert(insnOpcode == IRETURN) { "Only ints should be coerced: ${Printer.OPCODES[insnOpcode]}" }

                                val coerced = when (expectedType.sort) {
                                    Type.BOOLEAN -> boolean(value.boolean)
                                    Type.BYTE -> byte(value.int.toByte())
                                    Type.SHORT -> short(value.int.toShort())
                                    Type.CHAR -> char(value.int.toChar())
                                    Type.INT -> int(value.int)
                                    else -> throw UnsupportedByteCodeException("Should not be coerced: $expectedType")
                                }
                                return ValueReturned(coerced)
                            }
                            return ValueReturned(value)
                        }
                        RETURN -> return ValueReturned(VOID_VALUE)
                        IFEQ, IFNE, IFLT, IFGE, IFGT, IFLE, IFNULL, IFNONNULL -> {
                            if (interpreter.checkUnaryCondition(frame.getStackTop(), insnOpcode)) {
                                frame.execute(currentInsn, interpreter)
                                goto((currentInsn as JumpInsnNode).label)
                                continue@loop
                            }
                        }
                        IF_ICMPEQ, IF_ICMPNE, IF_ICMPLT, IF_ICMPGE, IF_ICMPGT, IF_ICMPLE, IF_ACMPEQ, IF_ACMPNE -> {
                            if (interpreter.checkBinaryCondition(frame.getStackTop(1), frame.getStackTop(0), insnOpcode)) {
                                frame.execute(currentInsn, interpreter)
                                goto((currentInsn as JumpInsnNode).label)
                                continue@loop
                            }
                        }

                        ATHROW -> {
                            val exceptionValue = frame.getStackTop() as ObjectValue
                            val handled = handler.exceptionThrown(frame, currentInsn, exceptionValue)
                            if (handled != null) return handled
                            if (exceptionCaught(exceptionValue)) continue@loop
                            return ExceptionThrown(exceptionValue, ExceptionKind.FROM_EVALUATED_CODE)
                        }

                        // Workaround for a bug in Kotlin: NoPatterMatched exception is thrown otherwise!
                        else -> {}
                    }

                    try {
                        frame.execute(currentInsn, interpreter)
                    }
                    catch (e: ThrownFromEvalExceptionBase) {
                        val exception = e.cause!!
                        val exceptionValue = ObjectValue(exception, Type.getType(exception::class.java))
                        val handled = handler.exceptionThrown(frame, currentInsn,
                                exceptionValue)
                        if (handled != null) return handled
                        if (exceptionFromEvalCaught(exception, exceptionValue)) continue@loop

                        val exceptionType = if (e is BrokenCode) ExceptionKind.BROKEN_CODE else ExceptionKind.FROM_EVALUATOR
                        return ExceptionThrown(exceptionValue, exceptionType)
                    }
                    catch (e: ThrownFromEvaluatedCodeException) {
                        val handled = handler.exceptionThrown(frame, currentInsn, e.exception)
                        if (handled != null) return handled
                        if (exceptionCaught(e.exception)) continue@loop
                        return ExceptionThrown(e.exception, ExceptionKind.FROM_EVALUATED_CODE)
                    }
                }
            }' @ [143:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'insnType' @ [143:19] ==> val insnType: Int defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'LABEL' @ [144:34] ==> public const final val LABEL: Int defined in org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode[JavaPropertyDescriptor]

'FRAME' @ [145:34] ==> public const final val FRAME: Int defined in org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode[JavaPropertyDescriptor]

'LINE' @ [146:34] ==> public const final val LINE: Int defined in org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode[JavaPropertyDescriptor]

'when (insnOpcode) {
                        GOTO -> {
                            goto((currentInsn as JumpInsnNode).label)
                            continue@loop
                        }

                        RET -> {
                            val varNode = currentInsn as VarInsnNode
                            val address = frame.getLocal(varNode.`var`)
                            goto((address as LabelValue).value)
                            continue@loop
                        }

                        // TODO: switch
                        LOOKUPSWITCH -> UnsupportedByteCodeException("LOOKUPSWITCH is not supported yet")
                        TABLESWITCH -> UnsupportedByteCodeException("TABLESWITCH is not supported yet")

                        IRETURN, LRETURN, FRETURN, DRETURN, ARETURN -> {
                            val value = frame.getStackTop()
                            val expectedType = Type.getReturnType(m.desc)
                            if (expectedType.sort == Type.OBJECT || expectedType.sort == Type.ARRAY) {
                                val coerced = if (value != NULL_VALUE && value.asmType != expectedType)
                                                    ObjectValue(value.obj(), expectedType)
                                              else value
                                return ValueReturned(coerced)
                            }
                            if (value.asmType != expectedType) {
                                assert(insnOpcode == IRETURN) { "Only ints should be coerced: ${Printer.OPCODES[insnOpcode]}" }

                                val coerced = when (expectedType.sort) {
                                    Type.BOOLEAN -> boolean(value.boolean)
                                    Type.BYTE -> byte(value.int.toByte())
                                    Type.SHORT -> short(value.int.toShort())
                                    Type.CHAR -> char(value.int.toChar())
                                    Type.INT -> int(value.int)
                                    else -> throw UnsupportedByteCodeException("Should not be coerced: $expectedType")
                                }
                                return ValueReturned(coerced)
                            }
                            return ValueReturned(value)
                        }
                        RETURN -> return ValueReturned(VOID_VALUE)
                        IFEQ, IFNE, IFLT, IFGE, IFGT, IFLE, IFNULL, IFNONNULL -> {
                            if (interpreter.checkUnaryCondition(frame.getStackTop(), insnOpcode)) {
                                frame.execute(currentInsn, interpreter)
                                goto((currentInsn as JumpInsnNode).label)
                                continue@loop
                            }
                        }
                        IF_ICMPEQ, IF_ICMPNE, IF_ICMPLT, IF_ICMPGE, IF_ICMPGT, IF_ICMPLE, IF_ACMPEQ, IF_ACMPNE -> {
                            if (interpreter.checkBinaryCondition(frame.getStackTop(1), frame.getStackTop(0), insnOpcode)) {
                                frame.execute(currentInsn, interpreter)
                                goto((currentInsn as JumpInsnNode).label)
                                continue@loop
                            }
                        }

                        ATHROW -> {
                            val exceptionValue = frame.getStackTop() as ObjectValue
                            val handled = handler.exceptionThrown(frame, currentInsn, exceptionValue)
                            if (handled != null) return handled
                            if (exceptionCaught(exceptionValue)) continue@loop
                            return ExceptionThrown(exceptionValue, ExceptionKind.FROM_EVALUATED_CODE)
                        }

                        // Workaround for a bug in Kotlin: NoPatterMatched exception is thrown otherwise!
                        else -> {}
                    }' @ [151:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any, entry3: Any, entry4: Any, entry5: Any, entry6: Any, entry7: Any, entry8: Any, entry9: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'insnOpcode' @ [151:27] ==> val insnOpcode: Int defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'GOTO' @ [152:25] ==> public const final val GOTO: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'goto' @ [153:29] ==> local final fun goto(nextInsn: AbstractInsnNode?): Unit defined in org.jetbrains.eval4j.interpreterLoop[SimpleFunctionDescriptorImpl]

'currentInsn' @ [153:35] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'label' @ [153:64] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'RET' @ [157:25] ==> public const final val RET: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'currentInsn' @ [158:43] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'frame' @ [159:43] ==> val frame: Frame<(Value..Value?)> defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'getLocal' @ [159:49] ==> public open fun getLocal(p0: Int): (Value..Value?) defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaMethodDescriptor]

'varNode' @ [159:58] ==> val varNode: VarInsnNode defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'`var`' @ [159:66] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaPropertyDescriptor]

'goto' @ [160:29] ==> local final fun goto(nextInsn: AbstractInsnNode?): Unit defined in org.jetbrains.eval4j.interpreterLoop[SimpleFunctionDescriptorImpl]

'address' @ [160:35] ==> val address: (Value..Value?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'value' @ [160:58] ==> public open val value: LabelNode defined in org.jetbrains.eval4j.LabelValue[PropertyDescriptorImpl]

'LOOKUPSWITCH' @ [165:25] ==> public const final val LOOKUPSWITCH: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'UnsupportedByteCodeException' @ [165:41] ==> public constructor UnsupportedByteCodeException(message: String) defined in org.jetbrains.eval4j.UnsupportedByteCodeException[ClassConstructorDescriptorImpl]

'TABLESWITCH' @ [166:25] ==> public const final val TABLESWITCH: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'UnsupportedByteCodeException' @ [166:40] ==> public constructor UnsupportedByteCodeException(message: String) defined in org.jetbrains.eval4j.UnsupportedByteCodeException[ClassConstructorDescriptorImpl]

'IRETURN' @ [168:25] ==> public const final val IRETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'LRETURN' @ [168:34] ==> public const final val LRETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'FRETURN' @ [168:43] ==> public const final val FRETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'DRETURN' @ [168:52] ==> public const final val DRETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ARETURN' @ [168:61] ==> public const final val ARETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'frame' @ [169:41] ==> val frame: Frame<(Value..Value?)> defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'getStackTop' @ [169:47] ==> private fun <T : Value> Frame<(Value..Value?)>.getStackTop(i: Int = ...): (Value..Value?) defined in org.jetbrains.eval4j[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Value> -> (org.jetbrains.eval4j.Value..org.jetbrains.eval4j.Value?)

'getReturnType' @ [170:53] ==> public open fun getReturnType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'm' @ [170:67] ==> value-parameter m: MethodNode defined in org.jetbrains.eval4j.interpreterLoop[ValueParameterDescriptorImpl]

'desc' @ [170:69] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'expectedType' @ [171:33] ==> val expectedType: (Type..Type?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'sort' @ [171:46] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'OBJECT' @ [171:59] ==> public const final val OBJECT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'expectedType' @ [171:69] ==> val expectedType: (Type..Type?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'sort' @ [171:82] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'ARRAY' @ [171:95] ==> public const final val ARRAY: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'if (value != NULL_VALUE && value.asmType != expectedType)
                                                    ObjectValue(value.obj(), expectedType)
                                              else value' @ [172:47] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Value..Value?), elseBranch: (Value..Value?)): (Value..Value?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.eval4j.Value..org.jetbrains.eval4j.Value?)

'value' @ [172:51] ==> val value: (Value..Value?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'NULL_VALUE' @ [172:60] ==> public val NULL_VALUE: ObjectValue defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value' @ [172:74] ==> val value: (Value..Value?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'asmType' @ [172:80] ==> public abstract val asmType: Type defined in org.jetbrains.eval4j.Value[PropertyDescriptorImpl]

'expectedType' @ [172:91] ==> val expectedType: (Type..Type?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'ObjectValue' @ [173:53] ==> public constructor ObjectValue(value: Any?, asmType: Type) defined in org.jetbrains.eval4j.ObjectValue[ClassConstructorDescriptorImpl]

'value' @ [173:65] ==> val value: (Value..Value?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'obj' @ [173:71] ==> public fun Value.obj(expectedType: Type = ...): Any? defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'expectedType' @ [173:78] ==> val expectedType: (Type..Type?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'value' @ [174:52] ==> val value: (Value..Value?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'ValueReturned' @ [175:40] ==> public constructor ValueReturned(result: Value) defined in org.jetbrains.eval4j.ValueReturned[ClassConstructorDescriptorImpl]

'coerced' @ [175:54] ==> val coerced: (Value..Value?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'value' @ [177:33] ==> val value: (Value..Value?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'asmType' @ [177:39] ==> public abstract val asmType: Type defined in org.jetbrains.eval4j.Value[PropertyDescriptorImpl]

'expectedType' @ [177:50] ==> val expectedType: (Type..Type?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'assert' @ [178:33] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'insnOpcode' @ [178:40] ==> val insnOpcode: Int defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'IRETURN' @ [178:54] ==> public const final val IRETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'Printer.OPCODES[insnOpcode]' @ [178:97] ==> public final operator fun get(index: Int): (String..String?) defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'OPCODES' @ [178:105] ==> public final val OPCODES: (Array<(String..String?)>..Array<out (String..String?)>?) defined in org.jetbrains.org.objectweb.asm.util.Printer[JavaPropertyDescriptor]

'insnOpcode' @ [178:113] ==> val insnOpcode: Int defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'when (expectedType.sort) {
                                    Type.BOOLEAN -> boolean(value.boolean)
                                    Type.BYTE -> byte(value.int.toByte())
                                    Type.SHORT -> short(value.int.toShort())
                                    Type.CHAR -> char(value.int.toChar())
                                    Type.INT -> int(value.int)
                                    else -> throw UnsupportedByteCodeException("Should not be coerced: $expectedType")
                                }' @ [180:47] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IntValue, entry1: IntValue, entry2: IntValue, entry3: IntValue, entry4: IntValue, entry5: IntValue): IntValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IntValue

'expectedType' @ [180:53] ==> val expectedType: (Type..Type?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'sort' @ [180:66] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'BOOLEAN' @ [181:42] ==> public const final val BOOLEAN: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'boolean' @ [181:53] ==> public fun boolean(v: Boolean): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value' @ [181:61] ==> val value: (Value..Value?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'boolean' @ [181:67] ==> public val Value.boolean: Boolean defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'BYTE' @ [182:42] ==> public const final val BYTE: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'byte' @ [182:50] ==> public fun byte(v: Byte): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value' @ [182:55] ==> val value: (Value..Value?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'int' @ [182:61] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'toByte' @ [182:65] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'SHORT' @ [183:42] ==> public const final val SHORT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'short' @ [183:51] ==> public fun short(v: Short): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value' @ [183:57] ==> val value: (Value..Value?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'int' @ [183:63] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'toShort' @ [183:67] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'CHAR' @ [184:42] ==> public const final val CHAR: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'char' @ [184:50] ==> public fun char(v: Char): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value' @ [184:55] ==> val value: (Value..Value?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'int' @ [184:61] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'toChar' @ [184:65] ==> public open fun toChar(): Char defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'INT' @ [185:42] ==> public const final val INT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'int' @ [185:49] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value' @ [185:53] ==> val value: (Value..Value?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'int' @ [185:59] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'UnsupportedByteCodeException' @ [186:51] ==> public constructor UnsupportedByteCodeException(message: String) defined in org.jetbrains.eval4j.UnsupportedByteCodeException[ClassConstructorDescriptorImpl]

'expectedType' @ [186:105] ==> val expectedType: (Type..Type?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'ValueReturned' @ [188:40] ==> public constructor ValueReturned(result: Value) defined in org.jetbrains.eval4j.ValueReturned[ClassConstructorDescriptorImpl]

'coerced' @ [188:54] ==> val coerced: IntValue defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'ValueReturned' @ [190:36] ==> public constructor ValueReturned(result: Value) defined in org.jetbrains.eval4j.ValueReturned[ClassConstructorDescriptorImpl]

'value' @ [190:50] ==> val value: (Value..Value?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'RETURN' @ [192:25] ==> public const final val RETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ValueReturned' @ [192:42] ==> public constructor ValueReturned(result: Value) defined in org.jetbrains.eval4j.ValueReturned[ClassConstructorDescriptorImpl]

'VOID_VALUE' @ [192:56] ==> public object VOID_VALUE : Value defined in org.jetbrains.eval4j in file values.kt[FakeCallableDescriptorForObject]

'IFEQ' @ [193:25] ==> public const final val IFEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IFNE' @ [193:31] ==> public const final val IFNE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IFLT' @ [193:37] ==> public const final val IFLT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IFGE' @ [193:43] ==> public const final val IFGE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IFGT' @ [193:49] ==> public const final val IFGT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IFLE' @ [193:55] ==> public const final val IFLE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IFNULL' @ [193:61] ==> public const final val IFNULL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IFNONNULL' @ [193:69] ==> public const final val IFNONNULL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'interpreter' @ [194:33] ==> val interpreter: SingleInstructionInterpreter defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'checkUnaryCondition' @ [194:45] ==> public final fun checkUnaryCondition(value: Value, opcode: Int): Boolean defined in org.jetbrains.eval4j.SingleInstructionInterpreter[SimpleFunctionDescriptorImpl]

'frame' @ [194:65] ==> val frame: Frame<(Value..Value?)> defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'getStackTop' @ [194:71] ==> private fun <T : Value> Frame<(Value..Value?)>.getStackTop(i: Int = ...): (Value..Value?) defined in org.jetbrains.eval4j[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Value> -> (org.jetbrains.eval4j.Value..org.jetbrains.eval4j.Value?)

'insnOpcode' @ [194:86] ==> val insnOpcode: Int defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'frame' @ [195:33] ==> val frame: Frame<(Value..Value?)> defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'execute' @ [195:39] ==> public open fun execute(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (Interpreter<(Value..Value?)>..Interpreter<(Value..Value?)>?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaMethodDescriptor]

'currentInsn' @ [195:47] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'interpreter' @ [195:60] ==> val interpreter: SingleInstructionInterpreter defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'goto' @ [196:33] ==> local final fun goto(nextInsn: AbstractInsnNode?): Unit defined in org.jetbrains.eval4j.interpreterLoop[SimpleFunctionDescriptorImpl]

'currentInsn' @ [196:39] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'label' @ [196:68] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'IF_ICMPEQ' @ [200:25] ==> public const final val IF_ICMPEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IF_ICMPNE' @ [200:36] ==> public const final val IF_ICMPNE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IF_ICMPLT' @ [200:47] ==> public const final val IF_ICMPLT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IF_ICMPGE' @ [200:58] ==> public const final val IF_ICMPGE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IF_ICMPGT' @ [200:69] ==> public const final val IF_ICMPGT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IF_ICMPLE' @ [200:80] ==> public const final val IF_ICMPLE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IF_ACMPEQ' @ [200:91] ==> public const final val IF_ACMPEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IF_ACMPNE' @ [200:102] ==> public const final val IF_ACMPNE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'interpreter' @ [201:33] ==> val interpreter: SingleInstructionInterpreter defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'checkBinaryCondition' @ [201:45] ==> public final fun checkBinaryCondition(value1: Value, value2: Value, opcode: Int): Boolean defined in org.jetbrains.eval4j.SingleInstructionInterpreter[SimpleFunctionDescriptorImpl]

'frame' @ [201:66] ==> val frame: Frame<(Value..Value?)> defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'getStackTop' @ [201:72] ==> private fun <T : Value> Frame<(Value..Value?)>.getStackTop(i: Int = ...): (Value..Value?) defined in org.jetbrains.eval4j[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Value> -> (org.jetbrains.eval4j.Value..org.jetbrains.eval4j.Value?)

'frame' @ [201:88] ==> val frame: Frame<(Value..Value?)> defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'getStackTop' @ [201:94] ==> private fun <T : Value> Frame<(Value..Value?)>.getStackTop(i: Int = ...): (Value..Value?) defined in org.jetbrains.eval4j[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Value> -> (org.jetbrains.eval4j.Value..org.jetbrains.eval4j.Value?)

'insnOpcode' @ [201:110] ==> val insnOpcode: Int defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'frame' @ [202:33] ==> val frame: Frame<(Value..Value?)> defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'execute' @ [202:39] ==> public open fun execute(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (Interpreter<(Value..Value?)>..Interpreter<(Value..Value?)>?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaMethodDescriptor]

'currentInsn' @ [202:47] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'interpreter' @ [202:60] ==> val interpreter: SingleInstructionInterpreter defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'goto' @ [203:33] ==> local final fun goto(nextInsn: AbstractInsnNode?): Unit defined in org.jetbrains.eval4j.interpreterLoop[SimpleFunctionDescriptorImpl]

'currentInsn' @ [203:39] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'label' @ [203:68] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'ATHROW' @ [208:25] ==> public const final val ATHROW: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'frame' @ [209:50] ==> val frame: Frame<(Value..Value?)> defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'getStackTop' @ [209:56] ==> private fun <T : Value> Frame<(Value..Value?)>.getStackTop(i: Int = ...): (Value..Value?) defined in org.jetbrains.eval4j[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Value> -> (org.jetbrains.eval4j.Value..org.jetbrains.eval4j.Value?)

'handler' @ [210:43] ==> value-parameter handler: InterpretationEventHandler = ... defined in org.jetbrains.eval4j.interpreterLoop[ValueParameterDescriptorImpl]

'exceptionThrown' @ [210:51] ==> public abstract fun exceptionThrown(currentState: Frame<Value>, currentInsn: AbstractInsnNode, exception: Value): InterpreterResult? defined in org.jetbrains.eval4j.InterpretationEventHandler[SimpleFunctionDescriptorImpl]

'frame' @ [210:67] ==> val frame: Frame<(Value..Value?)> defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'currentInsn' @ [210:74] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'exceptionValue' @ [210:87] ==> val exceptionValue: ObjectValue defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'handled' @ [211:33] ==> val handled: InterpreterResult? defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'handled' @ [211:57] ==> val handled: InterpreterResult? defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'exceptionCaught' @ [212:33] ==> local final fun exceptionCaught(exceptionValue: Value): Boolean defined in org.jetbrains.eval4j.interpreterLoop[SimpleFunctionDescriptorImpl]

'exceptionValue' @ [212:49] ==> val exceptionValue: ObjectValue defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'ExceptionThrown' @ [213:36] ==> public constructor ExceptionThrown(exception: ObjectValue, kind: ExceptionThrown.ExceptionKind) defined in org.jetbrains.eval4j.ExceptionThrown[ClassConstructorDescriptorImpl]

'exceptionValue' @ [213:52] ==> val exceptionValue: ObjectValue defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'FROM_EVALUATED_CODE' @ [213:82] ==> enum entry FROM_EVALUATED_CODE defined in org.jetbrains.eval4j.ExceptionThrown.ExceptionKind[FakeCallableDescriptorForObject]

'frame' @ [221:25] ==> val frame: Frame<(Value..Value?)> defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'execute' @ [221:31] ==> public open fun execute(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (Interpreter<(Value..Value?)>..Interpreter<(Value..Value?)>?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaMethodDescriptor]

'currentInsn' @ [221:39] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'interpreter' @ [221:52] ==> val interpreter: SingleInstructionInterpreter defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'e' @ [224:41] ==> val e: ThrownFromEvalExceptionBase defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'cause' @ [224:43] ==> public open val cause: Throwable? defined in org.jetbrains.eval4j.ThrownFromEvalExceptionBase[DeserializedPropertyDescriptor]

'ObjectValue' @ [225:46] ==> public constructor ObjectValue(value: Any?, asmType: Type) defined in org.jetbrains.eval4j.ObjectValue[ClassConstructorDescriptorImpl]

'exception' @ [225:58] ==> val exception: Throwable defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'getType' @ [225:74] ==> public open fun getType(p0: (Class<*>..Class<*>?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'exception' @ [225:82] ==> val exception: Throwable defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'java' @ [225:99] ==> public val <T> KClass<out Throwable>.java: Class<out Throwable> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Throwable)

'handler' @ [226:39] ==> value-parameter handler: InterpretationEventHandler = ... defined in org.jetbrains.eval4j.interpreterLoop[ValueParameterDescriptorImpl]

'exceptionThrown' @ [226:47] ==> public abstract fun exceptionThrown(currentState: Frame<Value>, currentInsn: AbstractInsnNode, exception: Value): InterpreterResult? defined in org.jetbrains.eval4j.InterpretationEventHandler[SimpleFunctionDescriptorImpl]

'frame' @ [226:63] ==> val frame: Frame<(Value..Value?)> defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'currentInsn' @ [226:70] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'exceptionValue' @ [227:33] ==> val exceptionValue: ObjectValue defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'handled' @ [228:29] ==> val handled: InterpreterResult? defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'handled' @ [228:53] ==> val handled: InterpreterResult? defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'exceptionFromEvalCaught' @ [229:29] ==> local final fun exceptionFromEvalCaught(exception: Throwable, exceptionValue: Value): Boolean defined in org.jetbrains.eval4j.interpreterLoop[SimpleFunctionDescriptorImpl]

'exception' @ [229:53] ==> val exception: Throwable defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'exceptionValue' @ [229:64] ==> val exceptionValue: ObjectValue defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'if (e is BrokenCode) ExceptionKind.BROKEN_CODE else ExceptionKind.FROM_EVALUATOR' @ [231:45] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ExceptionThrown.ExceptionKind, elseBranch: ExceptionThrown.ExceptionKind): ExceptionThrown.ExceptionKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ExceptionKind

'e' @ [231:49] ==> val e: ThrownFromEvalExceptionBase defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'BROKEN_CODE' @ [231:80] ==> enum entry BROKEN_CODE defined in org.jetbrains.eval4j.ExceptionThrown.ExceptionKind[FakeCallableDescriptorForObject]

'FROM_EVALUATOR' @ [231:111] ==> enum entry FROM_EVALUATOR defined in org.jetbrains.eval4j.ExceptionThrown.ExceptionKind[FakeCallableDescriptorForObject]

'ExceptionThrown' @ [232:32] ==> public constructor ExceptionThrown(exception: ObjectValue, kind: ExceptionThrown.ExceptionKind) defined in org.jetbrains.eval4j.ExceptionThrown[ClassConstructorDescriptorImpl]

'exceptionValue' @ [232:48] ==> val exceptionValue: ObjectValue defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'exceptionType' @ [232:64] ==> val exceptionType: ExceptionThrown.ExceptionKind defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'handler' @ [235:39] ==> value-parameter handler: InterpretationEventHandler = ... defined in org.jetbrains.eval4j.interpreterLoop[ValueParameterDescriptorImpl]

'exceptionThrown' @ [235:47] ==> public abstract fun exceptionThrown(currentState: Frame<Value>, currentInsn: AbstractInsnNode, exception: Value): InterpreterResult? defined in org.jetbrains.eval4j.InterpretationEventHandler[SimpleFunctionDescriptorImpl]

'frame' @ [235:63] ==> val frame: Frame<(Value..Value?)> defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'currentInsn' @ [235:70] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'e' @ [235:83] ==> val e: ThrownFromEvaluatedCodeException defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'exception' @ [235:85] ==> public final val exception: ObjectValue defined in org.jetbrains.eval4j.ThrownFromEvaluatedCodeException[PropertyDescriptorImpl]

'handled' @ [236:29] ==> val handled: InterpreterResult? defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'handled' @ [236:53] ==> val handled: InterpreterResult? defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'exceptionCaught' @ [237:29] ==> local final fun exceptionCaught(exceptionValue: Value): Boolean defined in org.jetbrains.eval4j.interpreterLoop[SimpleFunctionDescriptorImpl]

'e' @ [237:45] ==> val e: ThrownFromEvaluatedCodeException defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'exception' @ [237:47] ==> public final val exception: ObjectValue defined in org.jetbrains.eval4j.ThrownFromEvaluatedCodeException[PropertyDescriptorImpl]

'ExceptionThrown' @ [238:32] ==> public constructor ExceptionThrown(exception: ObjectValue, kind: ExceptionThrown.ExceptionKind) defined in org.jetbrains.eval4j.ExceptionThrown[ClassConstructorDescriptorImpl]

'e' @ [238:48] ==> val e: ThrownFromEvaluatedCodeException defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'exception' @ [238:50] ==> public final val exception: ObjectValue defined in org.jetbrains.eval4j.ThrownFromEvaluatedCodeException[PropertyDescriptorImpl]

'FROM_EVALUATED_CODE' @ [238:75] ==> enum entry FROM_EVALUATED_CODE defined in org.jetbrains.eval4j.ExceptionThrown.ExceptionKind[FakeCallableDescriptorForObject]

'handler' @ [243:27] ==> value-parameter handler: InterpretationEventHandler = ... defined in org.jetbrains.eval4j.interpreterLoop[ValueParameterDescriptorImpl]

'instructionProcessed' @ [243:35] ==> public abstract fun instructionProcessed(insn: AbstractInsnNode): InterpreterResult? defined in org.jetbrains.eval4j.InterpretationEventHandler[SimpleFunctionDescriptorImpl]

'currentInsn' @ [243:56] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'handled' @ [244:17] ==> val handled: InterpreterResult? defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'handled' @ [244:41] ==> val handled: InterpreterResult? defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'goto' @ [246:13] ==> local final fun goto(nextInsn: AbstractInsnNode?): Unit defined in org.jetbrains.eval4j.interpreterLoop[SimpleFunctionDescriptorImpl]

'currentInsn' @ [246:18] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'next' @ [246:30] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'e' @ [250:16] ==> val e: ResultException defined in org.jetbrains.eval4j.interpreterLoop[LocalVariableDescriptor]

'result' @ [250:18] ==> public final val result: InterpreterResult defined in org.jetbrains.eval4j.interpreterLoop.ResultException[PropertyDescriptorImpl]

'this' @ [254:59] ==> <this> defined in org.jetbrains.eval4j.getStackTop[ReceiverParameterDescriptorImpl]

'getStack' @ [254:64] ==> public open fun getStack(p0: Int): (T..T?) defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaMethodDescriptor]

'this' @ [254:73] ==> <this> defined in org.jetbrains.eval4j.getStackTop[ReceiverParameterDescriptorImpl]

'stackSize' @ [254:78] ==> public final val <V : (Value..Value?)> Frame<T>.stackSize: Int[MyPropertyDescriptor]
Inferred types:
    <V : (Value..Value?)> -> T

'i' @ [254:94] ==> value-parameter i: Int = ... defined in org.jetbrains.eval4j.getStackTop[ValueParameterDescriptorImpl]

'throwBrokenCodeException' @ [254:100] ==> public fun throwBrokenCodeException(e: Throwable): Nothing defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'IllegalArgumentException' @ [254:125] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'i' @ [254:184] ==> value-parameter i: Int = ... defined in org.jetbrains.eval4j.getStackTop[ValueParameterDescriptorImpl]

'm' @ [258:17] ==> value-parameter m: MethodNode defined in org.jetbrains.eval4j.computeHandlers[ValueParameterDescriptorImpl]

'instructions' @ [258:19] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'Array' @ [259:20] ==> public constructor Array<T>(size: Int, init: (Int) -> MutableList<TryCatchBlockNode>?) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> MutableList<TryCatchBlockNode>?

'insns' @ [259:59] ==> val insns: (InsnList..InsnList?) defined in org.jetbrains.eval4j.computeHandlers[LocalVariableDescriptor]

'size' @ [259:65] ==> public open fun size(): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'm' @ [260:17] ==> value-parameter m: MethodNode defined in org.jetbrains.eval4j.computeHandlers[ValueParameterDescriptorImpl]

'tryCatchBlocks' @ [260:19] ==> public final var tryCatchBlocks: (MutableList<(TryCatchBlockNode..TryCatchBlockNode?)>..List<(TryCatchBlockNode..TryCatchBlockNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'insns' @ [261:21] ==> val insns: (InsnList..InsnList?) defined in org.jetbrains.eval4j.computeHandlers[LocalVariableDescriptor]

'indexOf' @ [261:27] ==> public open fun indexOf(p0: (AbstractInsnNode..AbstractInsnNode?)): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'tcb' @ [261:35] ==> val tcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.eval4j.computeHandlers[LocalVariableDescriptor]

'start' @ [261:39] ==> public final var start: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'insns' @ [262:19] ==> val insns: (InsnList..InsnList?) defined in org.jetbrains.eval4j.computeHandlers[LocalVariableDescriptor]

'indexOf' @ [262:25] ==> public open fun indexOf(p0: (AbstractInsnNode..AbstractInsnNode?)): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'tcb' @ [262:33] ==> val tcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.eval4j.computeHandlers[LocalVariableDescriptor]

'end' @ [262:37] ==> public final var end: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'begin' @ [263:19] ==> val begin: Int defined in org.jetbrains.eval4j.computeHandlers[LocalVariableDescriptor]

'end' @ [263:26] ==> val end: Int defined in org.jetbrains.eval4j.computeHandlers[LocalVariableDescriptor]

'handlers' @ [264:32] ==> val handlers: Array<MutableList<TryCatchBlockNode>?> defined in org.jetbrains.eval4j.computeHandlers[LocalVariableDescriptor]

'i' @ [264:41] ==> val i: Int defined in org.jetbrains.eval4j.computeHandlers[LocalVariableDescriptor]

'ArrayList' @ [264:47] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TryCatchBlockNode

'handlers' @ [265:13] ==> val handlers: Array<MutableList<TryCatchBlockNode>?> defined in org.jetbrains.eval4j.computeHandlers[LocalVariableDescriptor]

'i' @ [265:22] ==> val i: Int defined in org.jetbrains.eval4j.computeHandlers[LocalVariableDescriptor]

'insnHandlers' @ [265:27] ==> val insnHandlers: MutableList<(TryCatchBlockNode..TryCatchBlockNode?)> defined in org.jetbrains.eval4j.computeHandlers[LocalVariableDescriptor]

'insnHandlers' @ [267:13] ==> val insnHandlers: MutableList<(TryCatchBlockNode..TryCatchBlockNode?)> defined in org.jetbrains.eval4j.computeHandlers[LocalVariableDescriptor]

'add' @ [267:26] ==> public abstract fun add(element: (TryCatchBlockNode..TryCatchBlockNode?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'tcb' @ [267:30] ==> val tcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.eval4j.computeHandlers[LocalVariableDescriptor]

'handlers' @ [271:12] ==> val handlers: Array<MutableList<TryCatchBlockNode>?> defined in org.jetbrains.eval4j.computeHandlers[LocalVariableDescriptor]

