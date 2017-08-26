'RuntimeException' @ [26:55] ==> public final fun <init>(p0: (String..String?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'message' @ [26:72] ==> value-parameter message: String defined in org.jetbrains.eval4j.UnsupportedByteCodeException.<init>[ValueParameterDescriptorImpl]

'Interpreter<Value>' @ [49:62] ==> protected/*protected and package*/ constructor Interpreter<V : (Value..Value?)>(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.analysis.Interpreter[JavaClassConstructorDescriptor]
Inferred types:
    <V : (Value..Value?)> -> Value

'ASM5' @ [49:81] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'type' @ [51:13] ==> value-parameter type: Type? defined in org.jetbrains.eval4j.SingleInstructionInterpreter.newValue[ValueParameterDescriptorImpl]

'NOT_A_VALUE' @ [52:20] ==> public object NOT_A_VALUE : Value defined in org.jetbrains.eval4j in file values.kt[FakeCallableDescriptorForObject]

'makeNotInitializedValue' @ [55:16] ==> public fun makeNotInitializedValue(t: Type): Value? defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'type' @ [55:40] ==> value-parameter type: Type? defined in org.jetbrains.eval4j.SingleInstructionInterpreter.newValue[ValueParameterDescriptorImpl]

'when (insn.opcode) {
            ACONST_NULL -> {
                return NULL_VALUE
            }

            ICONST_M1 -> int(-1)
            ICONST_0 -> int(0)
            ICONST_1 -> int(1)
            ICONST_2 -> int(2)
            ICONST_3 -> int(3)
            ICONST_4 -> int(4)
            ICONST_5 -> int(5)

            LCONST_0 -> long(0)
            LCONST_1 -> long(1)

            FCONST_0 -> float(0.0f)
            FCONST_1 -> float(1.0f)
            FCONST_2 -> float(2.0f)

            DCONST_0 -> double(0.0)
            DCONST_1 -> double(1.0)

            BIPUSH, SIPUSH -> int((insn as IntInsnNode).operand)

            LDC -> {
                val cst = ((insn as LdcInsnNode)).cst
                when (cst) {
                    is Int -> int(cst)
                    is Float -> float(cst)
                    is Long -> long(cst)
                    is Double -> double(cst)
                    is String -> eval.loadString(cst)
                    is Type -> {
                        val sort = cst.sort
                        when (sort) {
                            Type.OBJECT, Type.ARRAY -> eval.loadClass(cst)
                            Type.METHOD -> throw UnsupportedByteCodeException("Mothod handles are not supported")
                            else -> throw UnsupportedByteCodeException("Illegal LDC constant " + cst)
                        }
                    }
                    is Handle -> throw UnsupportedByteCodeException("Method handles are not supported")
                    else -> throw UnsupportedByteCodeException("Illegal LDC constant " + cst)
                }
            }
            JSR -> LabelValue((insn as JumpInsnNode).label)
            GETSTATIC -> eval.getStaticField(FieldDescription(insn as FieldInsnNode))
            NEW -> eval.newInstance(Type.getObjectType((insn as TypeInsnNode).desc))
            else -> throw UnsupportedByteCodeException("$insn")
        }' @ [59:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Value?, entry1: Value?, entry2: Value?, entry3: Value?, entry4: Value?, entry5: Value?, entry6: Value?, entry7: Value?, entry8: Value?, entry9: Value?, entry10: Value?, entry11: Value?, entry12: Value?, entry13: Value?, entry14: Value?, entry15: Value?, entry16: Value?, entry17: Value?, entry18: Value?, entry19: Value?, entry20: Value?): Value?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Value?

'insn' @ [59:22] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.newOperation[ValueParameterDescriptorImpl]

'opcode' @ [59:27] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'ACONST_NULL' @ [60:13] ==> public const final val ACONST_NULL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'NULL_VALUE' @ [61:24] ==> public val NULL_VALUE: ObjectValue defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'ICONST_M1' @ [64:13] ==> public const final val ICONST_M1: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'int' @ [64:26] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'-' @ [64:30] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ICONST_0' @ [65:13] ==> public const final val ICONST_0: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'int' @ [65:25] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'ICONST_1' @ [66:13] ==> public const final val ICONST_1: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'int' @ [66:25] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'ICONST_2' @ [67:13] ==> public const final val ICONST_2: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'int' @ [67:25] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'ICONST_3' @ [68:13] ==> public const final val ICONST_3: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'int' @ [68:25] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'ICONST_4' @ [69:13] ==> public const final val ICONST_4: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'int' @ [69:25] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'ICONST_5' @ [70:13] ==> public const final val ICONST_5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'int' @ [70:25] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'LCONST_0' @ [72:13] ==> public const final val LCONST_0: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'long' @ [72:25] ==> public fun long(v: Long): LongValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'LCONST_1' @ [73:13] ==> public const final val LCONST_1: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'long' @ [73:25] ==> public fun long(v: Long): LongValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'FCONST_0' @ [75:13] ==> public const final val FCONST_0: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'float' @ [75:25] ==> public fun float(v: Float): FloatValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'FCONST_1' @ [76:13] ==> public const final val FCONST_1: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'float' @ [76:25] ==> public fun float(v: Float): FloatValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'FCONST_2' @ [77:13] ==> public const final val FCONST_2: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'float' @ [77:25] ==> public fun float(v: Float): FloatValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'DCONST_0' @ [79:13] ==> public const final val DCONST_0: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'double' @ [79:25] ==> public fun double(v: Double): DoubleValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'DCONST_1' @ [80:13] ==> public const final val DCONST_1: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'double' @ [80:25] ==> public fun double(v: Double): DoubleValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'BIPUSH' @ [82:13] ==> public const final val BIPUSH: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'SIPUSH' @ [82:21] ==> public const final val SIPUSH: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'int' @ [82:31] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'insn' @ [82:36] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.newOperation[ValueParameterDescriptorImpl]

'operand' @ [82:57] ==> public final var operand: Int defined in org.jetbrains.org.objectweb.asm.tree.IntInsnNode[JavaPropertyDescriptor]

'LDC' @ [84:13] ==> public const final val LDC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insn' @ [85:29] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.newOperation[ValueParameterDescriptorImpl]

'cst' @ [85:51] ==> public final var cst: (Any..Any?) defined in org.jetbrains.org.objectweb.asm.tree.LdcInsnNode[JavaPropertyDescriptor]

'when (cst) {
                    is Int -> int(cst)
                    is Float -> float(cst)
                    is Long -> long(cst)
                    is Double -> double(cst)
                    is String -> eval.loadString(cst)
                    is Type -> {
                        val sort = cst.sort
                        when (sort) {
                            Type.OBJECT, Type.ARRAY -> eval.loadClass(cst)
                            Type.METHOD -> throw UnsupportedByteCodeException("Mothod handles are not supported")
                            else -> throw UnsupportedByteCodeException("Illegal LDC constant " + cst)
                        }
                    }
                    is Handle -> throw UnsupportedByteCodeException("Method handles are not supported")
                    else -> throw UnsupportedByteCodeException("Illegal LDC constant " + cst)
                }' @ [86:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Value, entry1: Value, entry2: Value, entry3: Value, entry4: Value, entry5: Value, entry6: Value, entry7: Value): Value[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Value

'cst' @ [86:23] ==> val cst: (Any..Any?) defined in org.jetbrains.eval4j.SingleInstructionInterpreter.newOperation[LocalVariableDescriptor]

'int' @ [87:31] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'cst' @ [87:35] ==> val cst: (Any..Any?) defined in org.jetbrains.eval4j.SingleInstructionInterpreter.newOperation[LocalVariableDescriptor]

'float' @ [88:33] ==> public fun float(v: Float): FloatValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'cst' @ [88:39] ==> val cst: (Any..Any?) defined in org.jetbrains.eval4j.SingleInstructionInterpreter.newOperation[LocalVariableDescriptor]

'long' @ [89:32] ==> public fun long(v: Long): LongValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'cst' @ [89:37] ==> val cst: (Any..Any?) defined in org.jetbrains.eval4j.SingleInstructionInterpreter.newOperation[LocalVariableDescriptor]

'double' @ [90:34] ==> public fun double(v: Double): DoubleValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'cst' @ [90:41] ==> val cst: (Any..Any?) defined in org.jetbrains.eval4j.SingleInstructionInterpreter.newOperation[LocalVariableDescriptor]

'eval' @ [91:34] ==> private final val eval: Eval defined in org.jetbrains.eval4j.SingleInstructionInterpreter[PropertyDescriptorImpl]

'loadString' @ [91:39] ==> public abstract fun loadString(str: String): Value defined in org.jetbrains.eval4j.Eval[SimpleFunctionDescriptorImpl]

'cst' @ [91:50] ==> val cst: (Any..Any?) defined in org.jetbrains.eval4j.SingleInstructionInterpreter.newOperation[LocalVariableDescriptor]

'cst' @ [93:36] ==> val cst: (Any..Any?) defined in org.jetbrains.eval4j.SingleInstructionInterpreter.newOperation[LocalVariableDescriptor]

'sort' @ [93:40] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'when (sort) {
                            Type.OBJECT, Type.ARRAY -> eval.loadClass(cst)
                            Type.METHOD -> throw UnsupportedByteCodeException("Mothod handles are not supported")
                            else -> throw UnsupportedByteCodeException("Illegal LDC constant " + cst)
                        }' @ [94:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Value, entry1: Value, entry2: Value): Value[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Value

'sort' @ [94:31] ==> val sort: Int defined in org.jetbrains.eval4j.SingleInstructionInterpreter.newOperation[LocalVariableDescriptor]

'OBJECT' @ [95:34] ==> public const final val OBJECT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'ARRAY' @ [95:47] ==> public const final val ARRAY: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'eval' @ [95:56] ==> private final val eval: Eval defined in org.jetbrains.eval4j.SingleInstructionInterpreter[PropertyDescriptorImpl]

'loadClass' @ [95:61] ==> public abstract fun loadClass(classType: Type): Value defined in org.jetbrains.eval4j.Eval[SimpleFunctionDescriptorImpl]

'cst' @ [95:71] ==> val cst: (Any..Any?) defined in org.jetbrains.eval4j.SingleInstructionInterpreter.newOperation[LocalVariableDescriptor]

'METHOD' @ [96:34] ==> public const final val METHOD: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'UnsupportedByteCodeException' @ [96:50] ==> public constructor UnsupportedByteCodeException(message: String) defined in org.jetbrains.eval4j.UnsupportedByteCodeException[ClassConstructorDescriptorImpl]

'UnsupportedByteCodeException' @ [97:43] ==> public constructor UnsupportedByteCodeException(message: String) defined in org.jetbrains.eval4j.UnsupportedByteCodeException[ClassConstructorDescriptorImpl]

'+' @ [97:72] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'cst' @ [97:98] ==> val cst: (Any..Any?) defined in org.jetbrains.eval4j.SingleInstructionInterpreter.newOperation[LocalVariableDescriptor]

'UnsupportedByteCodeException' @ [100:40] ==> public constructor UnsupportedByteCodeException(message: String) defined in org.jetbrains.eval4j.UnsupportedByteCodeException[ClassConstructorDescriptorImpl]

'UnsupportedByteCodeException' @ [101:35] ==> public constructor UnsupportedByteCodeException(message: String) defined in org.jetbrains.eval4j.UnsupportedByteCodeException[ClassConstructorDescriptorImpl]

'+' @ [101:64] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'cst' @ [101:90] ==> val cst: (Any..Any?) defined in org.jetbrains.eval4j.SingleInstructionInterpreter.newOperation[LocalVariableDescriptor]

'JSR' @ [104:13] ==> public const final val JSR: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'LabelValue' @ [104:20] ==> public constructor LabelValue(value: LabelNode) defined in org.jetbrains.eval4j.LabelValue[ClassConstructorDescriptorImpl]

'insn' @ [104:32] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.newOperation[ValueParameterDescriptorImpl]

'label' @ [104:54] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'GETSTATIC' @ [105:13] ==> public const final val GETSTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'eval' @ [105:26] ==> private final val eval: Eval defined in org.jetbrains.eval4j.SingleInstructionInterpreter[PropertyDescriptorImpl]

'getStaticField' @ [105:31] ==> public abstract fun getStaticField(fieldDesc: FieldDescription): Value defined in org.jetbrains.eval4j.Eval[SimpleFunctionDescriptorImpl]

'FieldDescription' @ [105:46] ==> public fun FieldDescription(insn: FieldInsnNode): FieldDescription defined in org.jetbrains.eval4j in file members.kt[SimpleFunctionDescriptorImpl]

'insn' @ [105:63] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.newOperation[ValueParameterDescriptorImpl]

'NEW' @ [106:13] ==> public const final val NEW: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'eval' @ [106:20] ==> private final val eval: Eval defined in org.jetbrains.eval4j.SingleInstructionInterpreter[PropertyDescriptorImpl]

'newInstance' @ [106:25] ==> public abstract fun newInstance(classType: Type): Value defined in org.jetbrains.eval4j.Eval[SimpleFunctionDescriptorImpl]

'getObjectType' @ [106:42] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'insn' @ [106:57] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.newOperation[ValueParameterDescriptorImpl]

'desc' @ [106:79] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.TypeInsnNode[JavaPropertyDescriptor]

'UnsupportedByteCodeException' @ [107:27] ==> public constructor UnsupportedByteCodeException(message: String) defined in org.jetbrains.eval4j.UnsupportedByteCodeException[ClassConstructorDescriptorImpl]

'insn' @ [107:58] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.newOperation[ValueParameterDescriptorImpl]

'value' @ [112:16] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.copyOperation[ValueParameterDescriptorImpl]

'when (insn.opcode) {
            INEG -> int(-value.int)
            IINC -> int(value.int + (insn as IincInsnNode).incr)
            L2I -> int(value.long.toInt())
            F2I -> int(value.float.toInt())
            D2I -> int(value.double.toInt())
            I2B -> byte(value.int.toByte())
            I2C -> char(value.int.toChar())
            I2S -> short(value.int.toShort())

            FNEG -> float(-value.float)
            I2F -> float(value.int.toFloat())
            L2F -> float(value.long.toFloat())
            D2F -> float(value.double.toFloat())

            LNEG -> long(-value.long)
            I2L -> long(value.int.toLong())
            F2L -> long(value.float.toLong())
            D2L -> long(value.double.toLong())

            DNEG -> double(-value.double)
            I2D -> double(value.int.toDouble())
            L2D -> double(value.long.toDouble())
            F2D -> double(value.float.toDouble())

            IFEQ, IFNE, IFLT, IFGE, IFGT, IFLE, IFNULL, IFNONNULL -> {
                // Handled by interpreter loop, see checkUnaryCondition()
                null
            }

            // TODO: switch
            TABLESWITCH,
            LOOKUPSWITCH -> throw UnsupportedByteCodeException("Switch is not supported yet")

            PUTSTATIC -> {
                eval.setStaticField(FieldDescription(insn as FieldInsnNode), value)
                null
            }

            GETFIELD -> eval.getField(value, FieldDescription(insn as FieldInsnNode))

            NEWARRAY -> {
                val typeStr = when ((insn as IntInsnNode).operand) {
                    T_BOOLEAN -> "[Z"
                    T_CHAR    -> "[C"
                    T_BYTE    -> "[B"
                    T_SHORT   -> "[S"
                    T_INT     -> "[I"
                    T_FLOAT   -> "[F"
                    T_DOUBLE  -> "[D"
                    T_LONG    -> "[J"
                    else -> throw AnalyzerException(insn, "Invalid array type")
                }
                eval.newArray(Type.getType(typeStr), value.int)
            }
            ANEWARRAY -> {
                val desc = (insn as TypeInsnNode).desc
                eval.newArray(Type.getType("[" + Type.getObjectType(desc)), value.int)
            }
            ARRAYLENGTH -> eval.getArrayLength(value)

            ATHROW -> {
                // Handled by interpreter loop
                null
            }

            CHECKCAST -> {
                val targetType = Type.getObjectType((insn as TypeInsnNode).desc)
                when {
                    value == NULL_VALUE -> NULL_VALUE
                    eval.isInstanceOf(value, targetType) -> ObjectValue(value.obj(), targetType)
                    else -> throwEvalException(ClassCastException("${value.asmType.className} cannot be cast to ${targetType.className}"))
                }
            }

            INSTANCEOF -> {
                val targetType = Type.getObjectType((insn as TypeInsnNode).desc)
                boolean(eval.isInstanceOf(value, targetType))
            }

            // TODO: maybe just do nothing?
            MONITORENTER, MONITOREXIT -> throw UnsupportedByteCodeException("Monitor instructions are not supported")

            else -> throw UnsupportedByteCodeException("$insn")
        }' @ [116:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Value?, entry1: Value?, entry2: Value?, entry3: Value?, entry4: Value?, entry5: Value?, entry6: Value?, entry7: Value?, entry8: Value?, entry9: Value?, entry10: Value?, entry11: Value?, entry12: Value?, entry13: Value?, entry14: Value?, entry15: Value?, entry16: Value?, entry17: Value?, entry18: Value?, entry19: Value?, entry20: Value?, entry21: Value?, entry22: Value?, entry23: Value?, entry24: Value?, entry25: Value?, entry26: Value?, entry27: Value?, entry28: Value?, entry29: Value?, entry30: Value?, entry31: Value?): Value?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Value?

'insn' @ [116:22] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'opcode' @ [116:27] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'INEG' @ [117:13] ==> public const final val INEG: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'int' @ [117:21] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'-' @ [117:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'value' @ [117:26] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'int' @ [117:32] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'IINC' @ [118:13] ==> public const final val IINC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'int' @ [118:21] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value' @ [118:25] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'int' @ [118:31] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'insn' @ [118:38] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'incr' @ [118:60] ==> public final var incr: Int defined in org.jetbrains.org.objectweb.asm.tree.IincInsnNode[JavaPropertyDescriptor]

'L2I' @ [119:13] ==> public const final val L2I: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'int' @ [119:20] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value' @ [119:24] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'long' @ [119:30] ==> public val Value.long: Long defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'toInt' @ [119:35] ==> public open fun toInt(): Int defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'F2I' @ [120:13] ==> public const final val F2I: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'int' @ [120:20] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value' @ [120:24] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'float' @ [120:30] ==> public val Value.float: Float defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'toInt' @ [120:36] ==> public open fun toInt(): Int defined in kotlin.Float[DeserializedSimpleFunctionDescriptor]

'D2I' @ [121:13] ==> public const final val D2I: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'int' @ [121:20] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value' @ [121:24] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'double' @ [121:30] ==> public val Value.double: Double defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'toInt' @ [121:37] ==> public open fun toInt(): Int defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'I2B' @ [122:13] ==> public const final val I2B: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'byte' @ [122:20] ==> public fun byte(v: Byte): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value' @ [122:25] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'int' @ [122:31] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'toByte' @ [122:35] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'I2C' @ [123:13] ==> public const final val I2C: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'char' @ [123:20] ==> public fun char(v: Char): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value' @ [123:25] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'int' @ [123:31] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'toChar' @ [123:35] ==> public open fun toChar(): Char defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'I2S' @ [124:13] ==> public const final val I2S: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'short' @ [124:20] ==> public fun short(v: Short): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value' @ [124:26] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'int' @ [124:32] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'toShort' @ [124:36] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'FNEG' @ [126:13] ==> public const final val FNEG: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'float' @ [126:21] ==> public fun float(v: Float): FloatValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'-' @ [126:27] ==> public final operator fun unaryMinus(): Float defined in kotlin.Float[DeserializedSimpleFunctionDescriptor]

'value' @ [126:28] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'float' @ [126:34] ==> public val Value.float: Float defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'I2F' @ [127:13] ==> public const final val I2F: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'float' @ [127:20] ==> public fun float(v: Float): FloatValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value' @ [127:26] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'int' @ [127:32] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'toFloat' @ [127:36] ==> public open fun toFloat(): Float defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'L2F' @ [128:13] ==> public const final val L2F: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'float' @ [128:20] ==> public fun float(v: Float): FloatValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value' @ [128:26] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'long' @ [128:32] ==> public val Value.long: Long defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'toFloat' @ [128:37] ==> public open fun toFloat(): Float defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'D2F' @ [129:13] ==> public const final val D2F: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'float' @ [129:20] ==> public fun float(v: Float): FloatValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value' @ [129:26] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'double' @ [129:32] ==> public val Value.double: Double defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'toFloat' @ [129:39] ==> public open fun toFloat(): Float defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'LNEG' @ [131:13] ==> public const final val LNEG: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'long' @ [131:21] ==> public fun long(v: Long): LongValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'-' @ [131:26] ==> public final operator fun unaryMinus(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'value' @ [131:27] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'long' @ [131:33] ==> public val Value.long: Long defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'I2L' @ [132:13] ==> public const final val I2L: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'long' @ [132:20] ==> public fun long(v: Long): LongValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value' @ [132:25] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'int' @ [132:31] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'toLong' @ [132:35] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'F2L' @ [133:13] ==> public const final val F2L: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'long' @ [133:20] ==> public fun long(v: Long): LongValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value' @ [133:25] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'float' @ [133:31] ==> public val Value.float: Float defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'toLong' @ [133:37] ==> public open fun toLong(): Long defined in kotlin.Float[DeserializedSimpleFunctionDescriptor]

'D2L' @ [134:13] ==> public const final val D2L: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'long' @ [134:20] ==> public fun long(v: Long): LongValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value' @ [134:25] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'double' @ [134:31] ==> public val Value.double: Double defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'toLong' @ [134:38] ==> public open fun toLong(): Long defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'DNEG' @ [136:13] ==> public const final val DNEG: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'double' @ [136:21] ==> public fun double(v: Double): DoubleValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'-' @ [136:28] ==> public final operator fun unaryMinus(): Double defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'value' @ [136:29] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'double' @ [136:35] ==> public val Value.double: Double defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'I2D' @ [137:13] ==> public const final val I2D: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'double' @ [137:20] ==> public fun double(v: Double): DoubleValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value' @ [137:27] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'int' @ [137:33] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'toDouble' @ [137:37] ==> public open fun toDouble(): Double defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'L2D' @ [138:13] ==> public const final val L2D: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'double' @ [138:20] ==> public fun double(v: Double): DoubleValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value' @ [138:27] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'long' @ [138:33] ==> public val Value.long: Long defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'toDouble' @ [138:38] ==> public open fun toDouble(): Double defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'F2D' @ [139:13] ==> public const final val F2D: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'double' @ [139:20] ==> public fun double(v: Double): DoubleValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value' @ [139:27] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'float' @ [139:33] ==> public val Value.float: Float defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'toDouble' @ [139:39] ==> public open fun toDouble(): Double defined in kotlin.Float[DeserializedSimpleFunctionDescriptor]

'IFEQ' @ [141:13] ==> public const final val IFEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IFNE' @ [141:19] ==> public const final val IFNE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IFLT' @ [141:25] ==> public const final val IFLT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IFGE' @ [141:31] ==> public const final val IFGE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IFGT' @ [141:37] ==> public const final val IFGT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IFLE' @ [141:43] ==> public const final val IFLE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IFNULL' @ [141:49] ==> public const final val IFNULL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IFNONNULL' @ [141:57] ==> public const final val IFNONNULL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'TABLESWITCH' @ [147:13] ==> public const final val TABLESWITCH: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'LOOKUPSWITCH' @ [148:13] ==> public const final val LOOKUPSWITCH: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'UnsupportedByteCodeException' @ [148:35] ==> public constructor UnsupportedByteCodeException(message: String) defined in org.jetbrains.eval4j.UnsupportedByteCodeException[ClassConstructorDescriptorImpl]

'PUTSTATIC' @ [150:13] ==> public const final val PUTSTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'eval' @ [151:17] ==> private final val eval: Eval defined in org.jetbrains.eval4j.SingleInstructionInterpreter[PropertyDescriptorImpl]

'setStaticField' @ [151:22] ==> public abstract fun setStaticField(fieldDesc: FieldDescription, newValue: Value): Unit defined in org.jetbrains.eval4j.Eval[SimpleFunctionDescriptorImpl]

'FieldDescription' @ [151:37] ==> public fun FieldDescription(insn: FieldInsnNode): FieldDescription defined in org.jetbrains.eval4j in file members.kt[SimpleFunctionDescriptorImpl]

'insn' @ [151:54] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'value' @ [151:78] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'GETFIELD' @ [155:13] ==> public const final val GETFIELD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'eval' @ [155:25] ==> private final val eval: Eval defined in org.jetbrains.eval4j.SingleInstructionInterpreter[PropertyDescriptorImpl]

'getField' @ [155:30] ==> public abstract fun getField(instance: Value, fieldDesc: FieldDescription): Value defined in org.jetbrains.eval4j.Eval[SimpleFunctionDescriptorImpl]

'value' @ [155:39] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'FieldDescription' @ [155:46] ==> public fun FieldDescription(insn: FieldInsnNode): FieldDescription defined in org.jetbrains.eval4j in file members.kt[SimpleFunctionDescriptorImpl]

'insn' @ [155:63] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'NEWARRAY' @ [157:13] ==> public const final val NEWARRAY: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'when ((insn as IntInsnNode).operand) {
                    T_BOOLEAN -> "[Z"
                    T_CHAR    -> "[C"
                    T_BYTE    -> "[B"
                    T_SHORT   -> "[S"
                    T_INT     -> "[I"
                    T_FLOAT   -> "[F"
                    T_DOUBLE  -> "[D"
                    T_LONG    -> "[J"
                    else -> throw AnalyzerException(insn, "Invalid array type")
                }' @ [158:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String, entry4: String, entry5: String, entry6: String, entry7: String, entry8: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'insn' @ [158:38] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'operand' @ [158:59] ==> public final var operand: Int defined in org.jetbrains.org.objectweb.asm.tree.IntInsnNode[JavaPropertyDescriptor]

'T_BOOLEAN' @ [159:21] ==> public const final val T_BOOLEAN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'T_CHAR' @ [160:21] ==> public const final val T_CHAR: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'T_BYTE' @ [161:21] ==> public const final val T_BYTE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'T_SHORT' @ [162:21] ==> public const final val T_SHORT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'T_INT' @ [163:21] ==> public const final val T_INT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'T_FLOAT' @ [164:21] ==> public const final val T_FLOAT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'T_DOUBLE' @ [165:21] ==> public const final val T_DOUBLE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'T_LONG' @ [166:21] ==> public const final val T_LONG: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'AnalyzerException' @ [167:35] ==> public constructor AnalyzerException(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (String..String?)) defined in org.jetbrains.org.objectweb.asm.tree.analysis.AnalyzerException[JavaClassConstructorDescriptor]

'insn' @ [167:53] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'eval' @ [169:17] ==> private final val eval: Eval defined in org.jetbrains.eval4j.SingleInstructionInterpreter[PropertyDescriptorImpl]

'newArray' @ [169:22] ==> public abstract fun newArray(arrayType: Type, size: Int): Value defined in org.jetbrains.eval4j.Eval[SimpleFunctionDescriptorImpl]

'getType' @ [169:36] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'typeStr' @ [169:44] ==> val typeStr: String defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[LocalVariableDescriptor]

'value' @ [169:54] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'int' @ [169:60] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'ANEWARRAY' @ [171:13] ==> public const final val ANEWARRAY: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insn' @ [172:29] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'desc' @ [172:51] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.TypeInsnNode[JavaPropertyDescriptor]

'eval' @ [173:17] ==> private final val eval: Eval defined in org.jetbrains.eval4j.SingleInstructionInterpreter[PropertyDescriptorImpl]

'newArray' @ [173:22] ==> public abstract fun newArray(arrayType: Type, size: Int): Value defined in org.jetbrains.eval4j.Eval[SimpleFunctionDescriptorImpl]

'getType' @ [173:36] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'+' @ [173:44] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getObjectType' @ [173:55] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'desc' @ [173:69] ==> val desc: (String..String?) defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[LocalVariableDescriptor]

'value' @ [173:77] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'int' @ [173:83] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'ARRAYLENGTH' @ [175:13] ==> public const final val ARRAYLENGTH: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'eval' @ [175:28] ==> private final val eval: Eval defined in org.jetbrains.eval4j.SingleInstructionInterpreter[PropertyDescriptorImpl]

'getArrayLength' @ [175:33] ==> public abstract fun getArrayLength(array: Value): Value defined in org.jetbrains.eval4j.Eval[SimpleFunctionDescriptorImpl]

'value' @ [175:48] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'ATHROW' @ [177:13] ==> public const final val ATHROW: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'CHECKCAST' @ [182:13] ==> public const final val CHECKCAST: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'getObjectType' @ [183:39] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'insn' @ [183:54] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'desc' @ [183:76] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.TypeInsnNode[JavaPropertyDescriptor]

'when {
                    value == NULL_VALUE -> NULL_VALUE
                    eval.isInstanceOf(value, targetType) -> ObjectValue(value.obj(), targetType)
                    else -> throwEvalException(ClassCastException("${value.asmType.className} cannot be cast to ${targetType.className}"))
                }' @ [184:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ObjectValue, entry1: ObjectValue, entry2: ObjectValue): ObjectValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ObjectValue

'value' @ [185:21] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'NULL_VALUE' @ [185:30] ==> public val NULL_VALUE: ObjectValue defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'NULL_VALUE' @ [185:44] ==> public val NULL_VALUE: ObjectValue defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'eval' @ [186:21] ==> private final val eval: Eval defined in org.jetbrains.eval4j.SingleInstructionInterpreter[PropertyDescriptorImpl]

'isInstanceOf' @ [186:26] ==> public abstract fun isInstanceOf(value: Value, targetType: Type): Boolean defined in org.jetbrains.eval4j.Eval[SimpleFunctionDescriptorImpl]

'value' @ [186:39] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'targetType' @ [186:46] ==> val targetType: (Type..Type?) defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[LocalVariableDescriptor]

'ObjectValue' @ [186:61] ==> public constructor ObjectValue(value: Any?, asmType: Type) defined in org.jetbrains.eval4j.ObjectValue[ClassConstructorDescriptorImpl]

'value' @ [186:73] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'obj' @ [186:79] ==> public fun Value.obj(expectedType: Type = ...): Any? defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'targetType' @ [186:86] ==> val targetType: (Type..Type?) defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[LocalVariableDescriptor]

'throwEvalException' @ [187:29] ==> public fun throwEvalException(e: Throwable): Nothing defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'ClassCastException' @ [187:48] ==> public final fun <init>(p0: (String..String?)): ClassCastException /* = ClassCastException */ defined in kotlin.ClassCastException[TypeAliasConstructorDescriptorImpl]

'value' @ [187:70] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'asmType' @ [187:76] ==> public abstract val asmType: Type defined in org.jetbrains.eval4j.Value[PropertyDescriptorImpl]

'className' @ [187:84] ==> public final val Type.className: (String..String?)[MyPropertyDescriptor]

'targetType' @ [187:115] ==> val targetType: (Type..Type?) defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[LocalVariableDescriptor]

'className' @ [187:126] ==> public final val Type.className: (String..String?)[MyPropertyDescriptor]

'INSTANCEOF' @ [191:13] ==> public const final val INSTANCEOF: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'getObjectType' @ [192:39] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'insn' @ [192:54] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'desc' @ [192:76] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.TypeInsnNode[JavaPropertyDescriptor]

'boolean' @ [193:17] ==> public fun boolean(v: Boolean): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'eval' @ [193:25] ==> private final val eval: Eval defined in org.jetbrains.eval4j.SingleInstructionInterpreter[PropertyDescriptorImpl]

'isInstanceOf' @ [193:30] ==> public abstract fun isInstanceOf(value: Value, targetType: Type): Boolean defined in org.jetbrains.eval4j.Eval[SimpleFunctionDescriptorImpl]

'value' @ [193:43] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'targetType' @ [193:50] ==> val targetType: (Type..Type?) defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[LocalVariableDescriptor]

'MONITORENTER' @ [197:13] ==> public const final val MONITORENTER: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'MONITOREXIT' @ [197:27] ==> public const final val MONITOREXIT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'UnsupportedByteCodeException' @ [197:48] ==> public constructor UnsupportedByteCodeException(message: String) defined in org.jetbrains.eval4j.UnsupportedByteCodeException[ClassConstructorDescriptorImpl]

'UnsupportedByteCodeException' @ [199:27] ==> public constructor UnsupportedByteCodeException(message: String) defined in org.jetbrains.eval4j.UnsupportedByteCodeException[ClassConstructorDescriptorImpl]

'insn' @ [199:58] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'when (opcode) {
            IFEQ -> value.int == 0
            IFNE -> value.int != 0
            IFLT -> value.int < 0
            IFGT -> value.int > 0
            IFLE -> value.int <= 0
            IFGE -> value.int >= 0
            IFNULL -> value.obj() == null
            IFNONNULL -> value.obj() != null
            else -> throw UnsupportedByteCodeException("Unknown opcode: $opcode")
        }' @ [204:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean, entry4: Boolean, entry5: Boolean, entry6: Boolean, entry7: Boolean, entry8: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'opcode' @ [204:22] ==> value-parameter opcode: Int defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkUnaryCondition[ValueParameterDescriptorImpl]

'IFEQ' @ [205:13] ==> public const final val IFEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value' @ [205:21] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkUnaryCondition[ValueParameterDescriptorImpl]

'int' @ [205:27] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'IFNE' @ [206:13] ==> public const final val IFNE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value' @ [206:21] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkUnaryCondition[ValueParameterDescriptorImpl]

'int' @ [206:27] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'IFLT' @ [207:13] ==> public const final val IFLT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value' @ [207:21] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkUnaryCondition[ValueParameterDescriptorImpl]

'int' @ [207:27] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'IFGT' @ [208:13] ==> public const final val IFGT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value' @ [208:21] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkUnaryCondition[ValueParameterDescriptorImpl]

'int' @ [208:27] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'IFLE' @ [209:13] ==> public const final val IFLE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value' @ [209:21] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkUnaryCondition[ValueParameterDescriptorImpl]

'int' @ [209:27] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'IFGE' @ [210:13] ==> public const final val IFGE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value' @ [210:21] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkUnaryCondition[ValueParameterDescriptorImpl]

'int' @ [210:27] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'IFNULL' @ [211:13] ==> public const final val IFNULL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value' @ [211:23] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkUnaryCondition[ValueParameterDescriptorImpl]

'obj' @ [211:29] ==> public fun Value.obj(expectedType: Type = ...): Any? defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'IFNONNULL' @ [212:13] ==> public const final val IFNONNULL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value' @ [212:26] ==> value-parameter value: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkUnaryCondition[ValueParameterDescriptorImpl]

'obj' @ [212:32] ==> public fun Value.obj(expectedType: Type = ...): Any? defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'UnsupportedByteCodeException' @ [213:27] ==> public constructor UnsupportedByteCodeException(message: String) defined in org.jetbrains.eval4j.UnsupportedByteCodeException[ClassConstructorDescriptorImpl]

'opcode' @ [213:74] ==> value-parameter opcode: Int defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkUnaryCondition[ValueParameterDescriptorImpl]

'when (insn.opcode) {
            IALOAD, BALOAD, CALOAD, SALOAD,
            FALOAD, LALOAD, DALOAD,
            AALOAD -> eval.getArrayElement(value1, value2)

            IADD -> int(value1.int + value2.int)
            ISUB -> int(value1.int - value2.int)
            IMUL -> int(value1.int * value2.int)
            IDIV -> int(value1.int / value2.int)
            IREM -> int(value1.int % value2.int)
            ISHL -> int(value1.int shl value2.int)
            ISHR -> int(value1.int shr value2.int)
            IUSHR -> int(value1.int ushr value2.int)
            IAND -> int(value1.int and value2.int)
            IOR -> int(value1.int or value2.int)
            IXOR -> int(value1.int xor value2.int)

            LADD -> long(value1.long + value2.long)
            LSUB -> long(value1.long - value2.long)
            LMUL -> long(value1.long * value2.long)
            LDIV -> long(value1.long / value2.long)
            LREM -> long(value1.long % value2.long)
            LSHL -> long(value1.long shl value2.int)
            LSHR -> long(value1.long shr value2.int)
            LUSHR -> long(value1.long ushr value2.int)
            LAND -> long(value1.long and value2.long)
            LOR -> long(value1.long or value2.long)
            LXOR -> long(value1.long xor value2.long)

            FADD -> float(value1.float + value2.float)
            FSUB -> float(value1.float - value2.float)
            FMUL -> float(value1.float * value2.float)
            FDIV -> float(value1.float / value2.float)
            FREM -> float(value1.float % value2.float)

            DADD -> double(value1.double + value2.double)
            DSUB -> double(value1.double - value2.double)
            DMUL -> double(value1.double * value2.double)
            DDIV -> double(value1.double / value2.double)
            DREM -> double(value1.double % value2.double)

            LCMP -> {
                val l1 = value1.long
                val l2 = value2.long

                int(when {
                    l1 > l2 -> 1
                    l1 == l2 -> 0
                    else -> -1
                })
            }

            FCMPL,
            FCMPG -> {
                val l1 = value1.float
                val l2 = value2.float

                int(when {
                    l1 > l2 -> 1
                    l1 == l2 -> 0
                    l1 < l2 -> -1
                    // one of them is NaN
                    else -> if (insn.opcode == FCMPG) 1 else -1
                })
            }

            DCMPL,
            DCMPG -> {
                val l1 = value1.double
                val l2 = value2.double

                int(when {
                    l1 > l2 -> 1
                    l1 == l2 -> 0
                    l1 < l2 -> -1
                    // one of them is NaN
                    else -> if (insn.opcode == DCMPG) 1 else -1
                })
            }

            IF_ICMPEQ, IF_ICMPNE, IF_ICMPLT, IF_ICMPGE, IF_ICMPGT, IF_ICMPLE, IF_ACMPEQ, IF_ACMPNE -> {
                // Handled by interpreter loop, see checkBinaryCondition()
                null
            }

            PUTFIELD -> {
                eval.setField(value1, FieldDescription(insn as FieldInsnNode), value2)
                null
            }

            else -> throw UnsupportedByteCodeException("$insn")
        }' @ [218:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Value?, entry1: Value?, entry2: Value?, entry3: Value?, entry4: Value?, entry5: Value?, entry6: Value?, entry7: Value?, entry8: Value?, entry9: Value?, entry10: Value?, entry11: Value?, entry12: Value?, entry13: Value?, entry14: Value?, entry15: Value?, entry16: Value?, entry17: Value?, entry18: Value?, entry19: Value?, entry20: Value?, entry21: Value?, entry22: Value?, entry23: Value?, entry24: Value?, entry25: Value?, entry26: Value?, entry27: Value?, entry28: Value?, entry29: Value?, entry30: Value?, entry31: Value?, entry32: Value?, entry33: Value?, entry34: Value?, entry35: Value?, entry36: Value?, entry37: Value?, entry38: Value?): Value?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Value?

'insn' @ [218:22] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'opcode' @ [218:27] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'IALOAD' @ [219:13] ==> public const final val IALOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'BALOAD' @ [219:21] ==> public const final val BALOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'CALOAD' @ [219:29] ==> public const final val CALOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'SALOAD' @ [219:37] ==> public const final val SALOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'FALOAD' @ [220:13] ==> public const final val FALOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'LALOAD' @ [220:21] ==> public const final val LALOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'DALOAD' @ [220:29] ==> public const final val DALOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'AALOAD' @ [221:13] ==> public const final val AALOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'eval' @ [221:23] ==> private final val eval: Eval defined in org.jetbrains.eval4j.SingleInstructionInterpreter[PropertyDescriptorImpl]

'getArrayElement' @ [221:28] ==> public abstract fun getArrayElement(array: Value, index: Value): Value defined in org.jetbrains.eval4j.Eval[SimpleFunctionDescriptorImpl]

'value1' @ [221:44] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'value2' @ [221:52] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'IADD' @ [223:13] ==> public const final val IADD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'int' @ [223:21] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [223:25] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'int' @ [223:32] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [223:38] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'int' @ [223:45] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'ISUB' @ [224:13] ==> public const final val ISUB: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'int' @ [224:21] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [224:25] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'int' @ [224:32] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [224:38] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'int' @ [224:45] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'IMUL' @ [225:13] ==> public const final val IMUL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'int' @ [225:21] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [225:25] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'int' @ [225:32] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [225:38] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'int' @ [225:45] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'IDIV' @ [226:13] ==> public const final val IDIV: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'int' @ [226:21] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [226:25] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'int' @ [226:32] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [226:38] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'int' @ [226:45] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'IREM' @ [227:13] ==> public const final val IREM: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'int' @ [227:21] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [227:25] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'int' @ [227:32] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [227:38] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'int' @ [227:45] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'ISHL' @ [228:13] ==> public const final val ISHL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'int' @ [228:21] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [228:25] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'int' @ [228:32] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [228:40] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'int' @ [228:47] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'ISHR' @ [229:13] ==> public const final val ISHR: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'int' @ [229:21] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [229:25] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'int' @ [229:32] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [229:40] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'int' @ [229:47] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'IUSHR' @ [230:13] ==> public const final val IUSHR: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'int' @ [230:22] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [230:26] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'int' @ [230:33] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [230:42] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'int' @ [230:49] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'IAND' @ [231:13] ==> public const final val IAND: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'int' @ [231:21] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [231:25] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'int' @ [231:32] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [231:40] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'int' @ [231:47] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'IOR' @ [232:13] ==> public const final val IOR: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'int' @ [232:20] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [232:24] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'int' @ [232:31] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [232:38] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'int' @ [232:45] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'IXOR' @ [233:13] ==> public const final val IXOR: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'int' @ [233:21] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [233:25] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'int' @ [233:32] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [233:40] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'int' @ [233:47] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'LADD' @ [235:13] ==> public const final val LADD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'long' @ [235:21] ==> public fun long(v: Long): LongValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [235:26] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'long' @ [235:33] ==> public val Value.long: Long defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [235:40] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'long' @ [235:47] ==> public val Value.long: Long defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'LSUB' @ [236:13] ==> public const final val LSUB: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'long' @ [236:21] ==> public fun long(v: Long): LongValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [236:26] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'long' @ [236:33] ==> public val Value.long: Long defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [236:40] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'long' @ [236:47] ==> public val Value.long: Long defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'LMUL' @ [237:13] ==> public const final val LMUL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'long' @ [237:21] ==> public fun long(v: Long): LongValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [237:26] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'long' @ [237:33] ==> public val Value.long: Long defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [237:40] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'long' @ [237:47] ==> public val Value.long: Long defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'LDIV' @ [238:13] ==> public const final val LDIV: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'long' @ [238:21] ==> public fun long(v: Long): LongValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [238:26] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'long' @ [238:33] ==> public val Value.long: Long defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [238:40] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'long' @ [238:47] ==> public val Value.long: Long defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'LREM' @ [239:13] ==> public const final val LREM: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'long' @ [239:21] ==> public fun long(v: Long): LongValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [239:26] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'long' @ [239:33] ==> public val Value.long: Long defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [239:40] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'long' @ [239:47] ==> public val Value.long: Long defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'LSHL' @ [240:13] ==> public const final val LSHL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'long' @ [240:21] ==> public fun long(v: Long): LongValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [240:26] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'long' @ [240:33] ==> public val Value.long: Long defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [240:42] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'int' @ [240:49] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'LSHR' @ [241:13] ==> public const final val LSHR: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'long' @ [241:21] ==> public fun long(v: Long): LongValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [241:26] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'long' @ [241:33] ==> public val Value.long: Long defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [241:42] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'int' @ [241:49] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'LUSHR' @ [242:13] ==> public const final val LUSHR: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'long' @ [242:22] ==> public fun long(v: Long): LongValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [242:27] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'long' @ [242:34] ==> public val Value.long: Long defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [242:44] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'int' @ [242:51] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'LAND' @ [243:13] ==> public const final val LAND: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'long' @ [243:21] ==> public fun long(v: Long): LongValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [243:26] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'long' @ [243:33] ==> public val Value.long: Long defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [243:42] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'long' @ [243:49] ==> public val Value.long: Long defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'LOR' @ [244:13] ==> public const final val LOR: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'long' @ [244:20] ==> public fun long(v: Long): LongValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [244:25] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'long' @ [244:32] ==> public val Value.long: Long defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [244:40] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'long' @ [244:47] ==> public val Value.long: Long defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'LXOR' @ [245:13] ==> public const final val LXOR: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'long' @ [245:21] ==> public fun long(v: Long): LongValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [245:26] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'long' @ [245:33] ==> public val Value.long: Long defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [245:42] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'long' @ [245:49] ==> public val Value.long: Long defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'FADD' @ [247:13] ==> public const final val FADD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'float' @ [247:21] ==> public fun float(v: Float): FloatValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [247:27] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'float' @ [247:34] ==> public val Value.float: Float defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [247:42] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'float' @ [247:49] ==> public val Value.float: Float defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'FSUB' @ [248:13] ==> public const final val FSUB: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'float' @ [248:21] ==> public fun float(v: Float): FloatValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [248:27] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'float' @ [248:34] ==> public val Value.float: Float defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [248:42] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'float' @ [248:49] ==> public val Value.float: Float defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'FMUL' @ [249:13] ==> public const final val FMUL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'float' @ [249:21] ==> public fun float(v: Float): FloatValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [249:27] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'float' @ [249:34] ==> public val Value.float: Float defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [249:42] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'float' @ [249:49] ==> public val Value.float: Float defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'FDIV' @ [250:13] ==> public const final val FDIV: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'float' @ [250:21] ==> public fun float(v: Float): FloatValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [250:27] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'float' @ [250:34] ==> public val Value.float: Float defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [250:42] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'float' @ [250:49] ==> public val Value.float: Float defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'FREM' @ [251:13] ==> public const final val FREM: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'float' @ [251:21] ==> public fun float(v: Float): FloatValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [251:27] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'float' @ [251:34] ==> public val Value.float: Float defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [251:42] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'float' @ [251:49] ==> public val Value.float: Float defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'DADD' @ [253:13] ==> public const final val DADD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'double' @ [253:21] ==> public fun double(v: Double): DoubleValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [253:28] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'double' @ [253:35] ==> public val Value.double: Double defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [253:44] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'double' @ [253:51] ==> public val Value.double: Double defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'DSUB' @ [254:13] ==> public const final val DSUB: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'double' @ [254:21] ==> public fun double(v: Double): DoubleValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [254:28] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'double' @ [254:35] ==> public val Value.double: Double defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [254:44] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'double' @ [254:51] ==> public val Value.double: Double defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'DMUL' @ [255:13] ==> public const final val DMUL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'double' @ [255:21] ==> public fun double(v: Double): DoubleValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [255:28] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'double' @ [255:35] ==> public val Value.double: Double defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [255:44] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'double' @ [255:51] ==> public val Value.double: Double defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'DDIV' @ [256:13] ==> public const final val DDIV: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'double' @ [256:21] ==> public fun double(v: Double): DoubleValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [256:28] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'double' @ [256:35] ==> public val Value.double: Double defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [256:44] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'double' @ [256:51] ==> public val Value.double: Double defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'DREM' @ [257:13] ==> public const final val DREM: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'double' @ [257:21] ==> public fun double(v: Double): DoubleValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value1' @ [257:28] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'double' @ [257:35] ==> public val Value.double: Double defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [257:44] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'double' @ [257:51] ==> public val Value.double: Double defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'LCMP' @ [259:13] ==> public const final val LCMP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value1' @ [260:26] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'long' @ [260:33] ==> public val Value.long: Long defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [261:26] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'long' @ [261:33] ==> public val Value.long: Long defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'int' @ [263:17] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'when {
                    l1 > l2 -> 1
                    l1 == l2 -> 0
                    else -> -1
                }' @ [263:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'l1' @ [264:21] ==> val l1: Long defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[LocalVariableDescriptor]

'l2' @ [264:26] ==> val l2: Long defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[LocalVariableDescriptor]

'l1' @ [265:21] ==> val l1: Long defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[LocalVariableDescriptor]

'l2' @ [265:27] ==> val l2: Long defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[LocalVariableDescriptor]

'-' @ [266:29] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'FCMPL' @ [270:13] ==> public const final val FCMPL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'FCMPG' @ [271:13] ==> public const final val FCMPG: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value1' @ [272:26] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'float' @ [272:33] ==> public val Value.float: Float defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [273:26] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'float' @ [273:33] ==> public val Value.float: Float defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'int' @ [275:17] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'when {
                    l1 > l2 -> 1
                    l1 == l2 -> 0
                    l1 < l2 -> -1
                    // one of them is NaN
                    else -> if (insn.opcode == FCMPG) 1 else -1
                }' @ [275:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int, entry3: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'l1' @ [276:21] ==> val l1: Float defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[LocalVariableDescriptor]

'l2' @ [276:26] ==> val l2: Float defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[LocalVariableDescriptor]

'l1' @ [277:21] ==> val l1: Float defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[LocalVariableDescriptor]

'l2' @ [277:27] ==> val l2: Float defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[LocalVariableDescriptor]

'l1' @ [278:21] ==> val l1: Float defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[LocalVariableDescriptor]

'l2' @ [278:26] ==> val l2: Float defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[LocalVariableDescriptor]

'-' @ [278:32] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'if (insn.opcode == FCMPG) 1 else -1' @ [280:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'insn' @ [280:33] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'opcode' @ [280:38] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'FCMPG' @ [280:48] ==> public const final val FCMPG: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'-' @ [280:62] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'DCMPL' @ [284:13] ==> public const final val DCMPL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'DCMPG' @ [285:13] ==> public const final val DCMPG: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value1' @ [286:26] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'double' @ [286:33] ==> public val Value.double: Double defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [287:26] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'double' @ [287:33] ==> public val Value.double: Double defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'int' @ [289:17] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'when {
                    l1 > l2 -> 1
                    l1 == l2 -> 0
                    l1 < l2 -> -1
                    // one of them is NaN
                    else -> if (insn.opcode == DCMPG) 1 else -1
                }' @ [289:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int, entry3: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'l1' @ [290:21] ==> val l1: Double defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[LocalVariableDescriptor]

'l2' @ [290:26] ==> val l2: Double defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[LocalVariableDescriptor]

'l1' @ [291:21] ==> val l1: Double defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[LocalVariableDescriptor]

'l2' @ [291:27] ==> val l2: Double defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[LocalVariableDescriptor]

'l1' @ [292:21] ==> val l1: Double defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[LocalVariableDescriptor]

'l2' @ [292:26] ==> val l2: Double defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[LocalVariableDescriptor]

'-' @ [292:32] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'if (insn.opcode == DCMPG) 1 else -1' @ [294:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'insn' @ [294:33] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'opcode' @ [294:38] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'DCMPG' @ [294:48] ==> public const final val DCMPG: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'-' @ [294:62] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'IF_ICMPEQ' @ [298:13] ==> public const final val IF_ICMPEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IF_ICMPNE' @ [298:24] ==> public const final val IF_ICMPNE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IF_ICMPLT' @ [298:35] ==> public const final val IF_ICMPLT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IF_ICMPGE' @ [298:46] ==> public const final val IF_ICMPGE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IF_ICMPGT' @ [298:57] ==> public const final val IF_ICMPGT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IF_ICMPLE' @ [298:68] ==> public const final val IF_ICMPLE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IF_ACMPEQ' @ [298:79] ==> public const final val IF_ACMPEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IF_ACMPNE' @ [298:90] ==> public const final val IF_ACMPNE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'PUTFIELD' @ [303:13] ==> public const final val PUTFIELD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'eval' @ [304:17] ==> private final val eval: Eval defined in org.jetbrains.eval4j.SingleInstructionInterpreter[PropertyDescriptorImpl]

'setField' @ [304:22] ==> public abstract fun setField(instance: Value, fieldDesc: FieldDescription, newValue: Value): Unit defined in org.jetbrains.eval4j.Eval[SimpleFunctionDescriptorImpl]

'value1' @ [304:31] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'FieldDescription' @ [304:39] ==> public fun FieldDescription(insn: FieldInsnNode): FieldDescription defined in org.jetbrains.eval4j in file members.kt[SimpleFunctionDescriptorImpl]

'insn' @ [304:56] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'value2' @ [304:80] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'UnsupportedByteCodeException' @ [308:27] ==> public constructor UnsupportedByteCodeException(message: String) defined in org.jetbrains.eval4j.UnsupportedByteCodeException[ClassConstructorDescriptorImpl]

'insn' @ [308:58] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'when (opcode) {
            IF_ICMPEQ -> value1.int == value2.int
            IF_ICMPNE -> value1.int != value2.int
            IF_ICMPLT -> value1.int < value2.int
            IF_ICMPGT -> value1.int > value2.int
            IF_ICMPLE -> value1.int <= value2.int
            IF_ICMPGE -> value1.int >= value2.int

            IF_ACMPEQ -> value1.obj() == value2.obj()
            IF_ACMPNE -> value1.obj() != value2.obj()
            else -> throw UnsupportedByteCodeException("Unknown opcode: $opcode")
        }' @ [313:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean, entry4: Boolean, entry5: Boolean, entry6: Boolean, entry7: Boolean, entry8: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'opcode' @ [313:22] ==> value-parameter opcode: Int defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkBinaryCondition[ValueParameterDescriptorImpl]

'IF_ICMPEQ' @ [314:13] ==> public const final val IF_ICMPEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value1' @ [314:26] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkBinaryCondition[ValueParameterDescriptorImpl]

'int' @ [314:33] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [314:40] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkBinaryCondition[ValueParameterDescriptorImpl]

'int' @ [314:47] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'IF_ICMPNE' @ [315:13] ==> public const final val IF_ICMPNE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value1' @ [315:26] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkBinaryCondition[ValueParameterDescriptorImpl]

'int' @ [315:33] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [315:40] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkBinaryCondition[ValueParameterDescriptorImpl]

'int' @ [315:47] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'IF_ICMPLT' @ [316:13] ==> public const final val IF_ICMPLT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value1' @ [316:26] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkBinaryCondition[ValueParameterDescriptorImpl]

'int' @ [316:33] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [316:39] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkBinaryCondition[ValueParameterDescriptorImpl]

'int' @ [316:46] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'IF_ICMPGT' @ [317:13] ==> public const final val IF_ICMPGT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value1' @ [317:26] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkBinaryCondition[ValueParameterDescriptorImpl]

'int' @ [317:33] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [317:39] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkBinaryCondition[ValueParameterDescriptorImpl]

'int' @ [317:46] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'IF_ICMPLE' @ [318:13] ==> public const final val IF_ICMPLE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value1' @ [318:26] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkBinaryCondition[ValueParameterDescriptorImpl]

'int' @ [318:33] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [318:40] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkBinaryCondition[ValueParameterDescriptorImpl]

'int' @ [318:47] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'IF_ICMPGE' @ [319:13] ==> public const final val IF_ICMPGE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value1' @ [319:26] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkBinaryCondition[ValueParameterDescriptorImpl]

'int' @ [319:33] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'value2' @ [319:40] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkBinaryCondition[ValueParameterDescriptorImpl]

'int' @ [319:47] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'IF_ACMPEQ' @ [321:13] ==> public const final val IF_ACMPEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value1' @ [321:26] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkBinaryCondition[ValueParameterDescriptorImpl]

'obj' @ [321:33] ==> public fun Value.obj(expectedType: Type = ...): Any? defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value2' @ [321:42] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkBinaryCondition[ValueParameterDescriptorImpl]

'obj' @ [321:49] ==> public fun Value.obj(expectedType: Type = ...): Any? defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'IF_ACMPNE' @ [322:13] ==> public const final val IF_ACMPNE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value1' @ [322:26] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkBinaryCondition[ValueParameterDescriptorImpl]

'obj' @ [322:33] ==> public fun Value.obj(expectedType: Type = ...): Any? defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'value2' @ [322:42] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkBinaryCondition[ValueParameterDescriptorImpl]

'obj' @ [322:49] ==> public fun Value.obj(expectedType: Type = ...): Any? defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'UnsupportedByteCodeException' @ [323:27] ==> public constructor UnsupportedByteCodeException(message: String) defined in org.jetbrains.eval4j.UnsupportedByteCodeException[ClassConstructorDescriptorImpl]

'opcode' @ [323:74] ==> value-parameter opcode: Int defined in org.jetbrains.eval4j.SingleInstructionInterpreter.checkBinaryCondition[ValueParameterDescriptorImpl]

'when (insn.opcode) {
            IASTORE, LASTORE, FASTORE, DASTORE, AASTORE, BASTORE, CASTORE, SASTORE -> {
                eval.setArrayElement(value1, value2, value3)
                null
            }
            else -> throw UnsupportedByteCodeException("$insn")
        }' @ [328:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Value?, entry1: Value?): Value?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Value?

'insn' @ [328:22] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.ternaryOperation[ValueParameterDescriptorImpl]

'opcode' @ [328:27] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'IASTORE' @ [329:13] ==> public const final val IASTORE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'LASTORE' @ [329:22] ==> public const final val LASTORE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'FASTORE' @ [329:31] ==> public const final val FASTORE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'DASTORE' @ [329:40] ==> public const final val DASTORE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'AASTORE' @ [329:49] ==> public const final val AASTORE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'BASTORE' @ [329:58] ==> public const final val BASTORE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'CASTORE' @ [329:67] ==> public const final val CASTORE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'SASTORE' @ [329:76] ==> public const final val SASTORE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'eval' @ [330:17] ==> private final val eval: Eval defined in org.jetbrains.eval4j.SingleInstructionInterpreter[PropertyDescriptorImpl]

'setArrayElement' @ [330:22] ==> public abstract fun setArrayElement(array: Value, index: Value, newValue: Value): Unit defined in org.jetbrains.eval4j.Eval[SimpleFunctionDescriptorImpl]

'value1' @ [330:38] ==> value-parameter value1: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.ternaryOperation[ValueParameterDescriptorImpl]

'value2' @ [330:46] ==> value-parameter value2: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.ternaryOperation[ValueParameterDescriptorImpl]

'value3' @ [330:54] ==> value-parameter value3: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.ternaryOperation[ValueParameterDescriptorImpl]

'UnsupportedByteCodeException' @ [333:27] ==> public constructor UnsupportedByteCodeException(message: String) defined in org.jetbrains.eval4j.UnsupportedByteCodeException[ClassConstructorDescriptorImpl]

'insn' @ [333:58] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.ternaryOperation[ValueParameterDescriptorImpl]

'when (insn.opcode) {
            MULTIANEWARRAY -> {
                val node = insn as MultiANewArrayInsnNode
                eval.newMultiDimensionalArray(Type.getType(node.desc), values.map(Value::int))
            }

            INVOKEVIRTUAL, INVOKESPECIAL, INVOKEINTERFACE -> {
                eval.invokeMethod(
                        values[0],
                        MethodDescription(insn as MethodInsnNode),
                        values.subList(1, values.size),
                        insn.opcode == INVOKESPECIAL
                )
            }

            INVOKESTATIC -> eval.invokeStaticMethod(MethodDescription(insn as MethodInsnNode), values)

            INVOKEDYNAMIC -> throw UnsupportedByteCodeException("INVOKEDYNAMIC is not supported")
            else -> throw UnsupportedByteCodeException("$insn")
        }' @ [338:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Value, entry1: Value, entry2: Value, entry3: Value, entry4: Value): Value[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Value

'insn' @ [338:22] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.naryOperation[ValueParameterDescriptorImpl]

'opcode' @ [338:27] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'MULTIANEWARRAY' @ [339:13] ==> public const final val MULTIANEWARRAY: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insn' @ [340:28] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.naryOperation[ValueParameterDescriptorImpl]

'eval' @ [341:17] ==> private final val eval: Eval defined in org.jetbrains.eval4j.SingleInstructionInterpreter[PropertyDescriptorImpl]

'newMultiDimensionalArray' @ [341:22] ==> public abstract fun newMultiDimensionalArray(arrayType: Type, dimensionSizes: List<Int>): Value defined in org.jetbrains.eval4j.Eval[SimpleFunctionDescriptorImpl]

'getType' @ [341:52] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'node' @ [341:60] ==> val node: MultiANewArrayInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.naryOperation[LocalVariableDescriptor]

'desc' @ [341:65] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MultiANewArrayInsnNode[JavaPropertyDescriptor]

'values' @ [341:72] ==> value-parameter values: List<Value> defined in org.jetbrains.eval4j.SingleInstructionInterpreter.naryOperation[ValueParameterDescriptorImpl]

'map' @ [341:79] ==> public inline fun <T, R> Iterable<Value>.map(transform: (Value) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Value
    <R> -> Int

'int' @ [341:90] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'INVOKEVIRTUAL' @ [344:13] ==> public const final val INVOKEVIRTUAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'INVOKESPECIAL' @ [344:28] ==> public const final val INVOKESPECIAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'INVOKEINTERFACE' @ [344:43] ==> public const final val INVOKEINTERFACE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'eval' @ [345:17] ==> private final val eval: Eval defined in org.jetbrains.eval4j.SingleInstructionInterpreter[PropertyDescriptorImpl]

'invokeMethod' @ [345:22] ==> public abstract fun invokeMethod(instance: Value, methodDesc: MethodDescription, arguments: List<Value>, invokespecial: Boolean = ...): Value defined in org.jetbrains.eval4j.Eval[SimpleFunctionDescriptorImpl]

'values' @ [346:25] ==> value-parameter values: List<Value> defined in org.jetbrains.eval4j.SingleInstructionInterpreter.naryOperation[ValueParameterDescriptorImpl]

'MethodDescription' @ [347:25] ==> public fun MethodDescription(insn: MethodInsnNode): MethodDescription defined in org.jetbrains.eval4j in file members.kt[SimpleFunctionDescriptorImpl]

'insn' @ [347:43] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.naryOperation[ValueParameterDescriptorImpl]

'values' @ [348:25] ==> value-parameter values: List<Value> defined in org.jetbrains.eval4j.SingleInstructionInterpreter.naryOperation[ValueParameterDescriptorImpl]

'subList' @ [348:32] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): List<Value> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'values' @ [348:43] ==> value-parameter values: List<Value> defined in org.jetbrains.eval4j.SingleInstructionInterpreter.naryOperation[ValueParameterDescriptorImpl]

'size' @ [348:50] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'insn' @ [349:25] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.naryOperation[ValueParameterDescriptorImpl]

'opcode' @ [349:30] ==> public final var MethodInsnNode.opcode: Int[MyPropertyDescriptor]

'INVOKESPECIAL' @ [349:40] ==> public const final val INVOKESPECIAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'INVOKESTATIC' @ [353:13] ==> public const final val INVOKESTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'eval' @ [353:29] ==> private final val eval: Eval defined in org.jetbrains.eval4j.SingleInstructionInterpreter[PropertyDescriptorImpl]

'invokeStaticMethod' @ [353:34] ==> public abstract fun invokeStaticMethod(methodDesc: MethodDescription, arguments: List<Value>): Value defined in org.jetbrains.eval4j.Eval[SimpleFunctionDescriptorImpl]

'MethodDescription' @ [353:53] ==> public fun MethodDescription(insn: MethodInsnNode): MethodDescription defined in org.jetbrains.eval4j in file members.kt[SimpleFunctionDescriptorImpl]

'insn' @ [353:71] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.naryOperation[ValueParameterDescriptorImpl]

'values' @ [353:96] ==> value-parameter values: List<Value> defined in org.jetbrains.eval4j.SingleInstructionInterpreter.naryOperation[ValueParameterDescriptorImpl]

'INVOKEDYNAMIC' @ [355:13] ==> public const final val INVOKEDYNAMIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'UnsupportedByteCodeException' @ [355:36] ==> public constructor UnsupportedByteCodeException(message: String) defined in org.jetbrains.eval4j.UnsupportedByteCodeException[ClassConstructorDescriptorImpl]

'UnsupportedByteCodeException' @ [356:27] ==> public constructor UnsupportedByteCodeException(message: String) defined in org.jetbrains.eval4j.UnsupportedByteCodeException[ClassConstructorDescriptorImpl]

'insn' @ [356:58] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.naryOperation[ValueParameterDescriptorImpl]

'when (insn.opcode) {
            IRETURN, LRETURN, FRETURN, DRETURN, ARETURN -> {
                // Handled by interpreter loop
            }

            else -> throw UnsupportedByteCodeException("$insn")
        }' @ [362:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'insn' @ [362:15] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.returnOperation[ValueParameterDescriptorImpl]

'opcode' @ [362:20] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'IRETURN' @ [363:13] ==> public const final val IRETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'LRETURN' @ [363:22] ==> public const final val LRETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'FRETURN' @ [363:31] ==> public const final val FRETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'DRETURN' @ [363:40] ==> public const final val DRETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ARETURN' @ [363:49] ==> public const final val ARETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'UnsupportedByteCodeException' @ [367:27] ==> public constructor UnsupportedByteCodeException(message: String) defined in org.jetbrains.eval4j.UnsupportedByteCodeException[ClassConstructorDescriptorImpl]

'insn' @ [367:58] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.eval4j.SingleInstructionInterpreter.returnOperation[ValueParameterDescriptorImpl]

'w' @ [373:16] ==> value-parameter w: Value defined in org.jetbrains.eval4j.SingleInstructionInterpreter.merge[ValueParameterDescriptorImpl]

