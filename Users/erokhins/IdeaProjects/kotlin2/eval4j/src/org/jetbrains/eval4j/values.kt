'asmType' @ [25:35] ==> public abstract val asmType: Type defined in org.jetbrains.eval4j.Value[PropertyDescriptorImpl]

'size' @ [25:43] ==> public final val Type.size: Int[MyPropertyDescriptor]

'getType' @ [31:33] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'VOID_TYPE' @ [39:39] ==> public final val VOID_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'when (t.sort) {
        Type.VOID -> null
        else -> NotInitialized(t)
    }' @ [45:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Value?, entry1: Value?): Value?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Value?

't' @ [45:18] ==> value-parameter t: Type defined in org.jetbrains.eval4j.makeNotInitializedValue[ValueParameterDescriptorImpl]

'sort' @ [45:20] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'VOID' @ [46:14] ==> public const final val VOID: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'NotInitialized' @ [47:17] ==> public constructor NotInitialized(asmType: Type) defined in org.jetbrains.eval4j.NotInitialized[ClassConstructorDescriptorImpl]

't' @ [47:32] ==> value-parameter t: Type defined in org.jetbrains.eval4j.makeNotInitializedValue[ValueParameterDescriptorImpl]

'asmType' @ [53:49] ==> public open val asmType: Type defined in org.jetbrains.eval4j.NotInitialized[PropertyDescriptorImpl]

'value' @ [62:33] ==> public abstract val value: V defined in org.jetbrains.eval4j.AbstractValueBase[PropertyDescriptorImpl]

'asmType' @ [62:41] ==> public open val asmType: Type defined in org.jetbrains.eval4j.AbstractValueBase[PropertyDescriptorImpl]

'other' @ [65:13] ==> value-parameter other: Any? defined in org.jetbrains.eval4j.AbstractValueBase.equals[ValueParameterDescriptorImpl]

'value' @ [67:16] ==> public abstract val value: V defined in org.jetbrains.eval4j.AbstractValueBase[PropertyDescriptorImpl]

'other' @ [67:25] ==> value-parameter other: Any? defined in org.jetbrains.eval4j.AbstractValueBase.equals[ValueParameterDescriptorImpl]

'value' @ [67:31] ==> public open val value: Any? defined in org.jetbrains.eval4j.AbstractValue[PropertyDescriptorImpl]

'asmType' @ [67:40] ==> public open val asmType: Type defined in org.jetbrains.eval4j.AbstractValueBase[PropertyDescriptorImpl]

'other' @ [67:51] ==> value-parameter other: Any? defined in org.jetbrains.eval4j.AbstractValueBase.equals[ValueParameterDescriptorImpl]

'asmType' @ [67:57] ==> public open val asmType: Type defined in org.jetbrains.eval4j.AbstractValue[PropertyDescriptorImpl]

'value' @ [71:16] ==> public abstract val value: V defined in org.jetbrains.eval4j.AbstractValueBase[PropertyDescriptorImpl]

'hashCode' @ [71:24] ==> public open fun hashCode(): Int defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'*' @ [71:37] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'asmType' @ [71:42] ==> public open val asmType: Type defined in org.jetbrains.eval4j.AbstractValueBase[PropertyDescriptorImpl]

'hashCode' @ [71:50] ==> public open fun hashCode(): Int defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'AbstractValueBase<V>' @ [78:5] ==> public constructor AbstractValueBase<out V>(asmType: Type) defined in org.jetbrains.eval4j.AbstractValueBase[ClassConstructorDescriptorImpl]
Inferred types:
    <out V> -> V

'asmType' @ [78:26] ==> value-parameter asmType: Type defined in org.jetbrains.eval4j.AbstractValue.<init>[ValueParameterDescriptorImpl]

'AbstractValue<Int>' @ [80:44] ==> public constructor AbstractValue<V>(value: Int, asmType: Type) defined in org.jetbrains.eval4j.AbstractValue[ClassConstructorDescriptorImpl]
Inferred types:
    <V> -> Int

'value' @ [80:63] ==> value-parameter value: Int defined in org.jetbrains.eval4j.IntValue.<init>[ValueParameterDescriptorImpl]

'asmType' @ [80:70] ==> value-parameter asmType: Type defined in org.jetbrains.eval4j.IntValue.<init>[ValueParameterDescriptorImpl]

'AbstractValue<Long>' @ [81:31] ==> public constructor AbstractValue<V>(value: Long, asmType: Type) defined in org.jetbrains.eval4j.AbstractValue[ClassConstructorDescriptorImpl]
Inferred types:
    <V> -> Long

'value' @ [81:51] ==> value-parameter value: Long defined in org.jetbrains.eval4j.LongValue.<init>[ValueParameterDescriptorImpl]

'LONG_TYPE' @ [81:63] ==> public final val LONG_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'AbstractValue<Float>' @ [82:33] ==> public constructor AbstractValue<V>(value: Float, asmType: Type) defined in org.jetbrains.eval4j.AbstractValue[ClassConstructorDescriptorImpl]
Inferred types:
    <V> -> Float

'value' @ [82:54] ==> value-parameter value: Float defined in org.jetbrains.eval4j.FloatValue.<init>[ValueParameterDescriptorImpl]

'FLOAT_TYPE' @ [82:66] ==> public final val FLOAT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'AbstractValue<Double>' @ [83:35] ==> public constructor AbstractValue<V>(value: Double, asmType: Type) defined in org.jetbrains.eval4j.AbstractValue[ClassConstructorDescriptorImpl]
Inferred types:
    <V> -> Double

'value' @ [83:57] ==> value-parameter value: Double defined in org.jetbrains.eval4j.DoubleValue.<init>[ValueParameterDescriptorImpl]

'DOUBLE_TYPE' @ [83:69] ==> public final val DOUBLE_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'AbstractValue<Any?>' @ [84:53] ==> public constructor AbstractValue<V>(value: Any?, asmType: Type) defined in org.jetbrains.eval4j.AbstractValue[ClassConstructorDescriptorImpl]
Inferred types:
    <V> -> Any?

'value' @ [84:73] ==> value-parameter value: Any? defined in org.jetbrains.eval4j.ObjectValue.<init>[ValueParameterDescriptorImpl]

'asmType' @ [84:80] ==> value-parameter asmType: Type defined in org.jetbrains.eval4j.ObjectValue.<init>[ValueParameterDescriptorImpl]

'ObjectValue' @ [85:38] ==> public constructor ObjectValue(value: Any?, asmType: Type) defined in org.jetbrains.eval4j.ObjectValue[ClassConstructorDescriptorImpl]

'asmType' @ [85:56] ==> value-parameter asmType: Type defined in org.jetbrains.eval4j.NewObjectValue.<init>[ValueParameterDescriptorImpl]

'field' @ [88:20] ==> var field: Any? defined in org.jetbrains.eval4j.NewObjectValue.<get-value>[SyntheticFieldDescriptor]

'IllegalStateException' @ [88:35] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'this' @ [88:99] ==> <this> defined in org.jetbrains.eval4j.NewObjectValue[LazyClassReceiverParameterDescriptor]

'AbstractValue<LabelNode>' @ [92:37] ==> public constructor AbstractValue<V>(value: LabelNode, asmType: Type) defined in org.jetbrains.eval4j.AbstractValue[ClassConstructorDescriptorImpl]
Inferred types:
    <V> -> LabelNode

'value' @ [92:62] ==> value-parameter value: LabelNode defined in org.jetbrains.eval4j.LabelValue.<init>[ValueParameterDescriptorImpl]

'VOID_TYPE' @ [92:74] ==> public final val VOID_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'IntValue' @ [94:27] ==> public constructor IntValue(value: Int, asmType: Type) defined in org.jetbrains.eval4j.IntValue[ClassConstructorDescriptorImpl]

'if (v) 1 else 0' @ [94:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'v' @ [94:40] ==> value-parameter v: Boolean defined in org.jetbrains.eval4j.boolean[ValueParameterDescriptorImpl]

'BOOLEAN_TYPE' @ [94:58] ==> public final val BOOLEAN_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'IntValue' @ [95:21] ==> public constructor IntValue(value: Int, asmType: Type) defined in org.jetbrains.eval4j.IntValue[ClassConstructorDescriptorImpl]

'v' @ [95:30] ==> value-parameter v: Byte defined in org.jetbrains.eval4j.byte[ValueParameterDescriptorImpl]

'toInt' @ [95:32] ==> public open fun toInt(): Int defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'BYTE_TYPE' @ [95:46] ==> public final val BYTE_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'IntValue' @ [96:23] ==> public constructor IntValue(value: Int, asmType: Type) defined in org.jetbrains.eval4j.IntValue[ClassConstructorDescriptorImpl]

'v' @ [96:32] ==> value-parameter v: Short defined in org.jetbrains.eval4j.short[ValueParameterDescriptorImpl]

'toInt' @ [96:34] ==> public open fun toInt(): Int defined in kotlin.Short[DeserializedSimpleFunctionDescriptor]

'SHORT_TYPE' @ [96:48] ==> public final val SHORT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'IntValue' @ [97:21] ==> public constructor IntValue(value: Int, asmType: Type) defined in org.jetbrains.eval4j.IntValue[ClassConstructorDescriptorImpl]

'v' @ [97:30] ==> value-parameter v: Char defined in org.jetbrains.eval4j.char[ValueParameterDescriptorImpl]

'toInt' @ [97:32] ==> public final fun toInt(): Int defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'CHAR_TYPE' @ [97:46] ==> public final val CHAR_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'IntValue' @ [98:19] ==> public constructor IntValue(value: Int, asmType: Type) defined in org.jetbrains.eval4j.IntValue[ClassConstructorDescriptorImpl]

'v' @ [98:28] ==> value-parameter v: Int defined in org.jetbrains.eval4j.int[ValueParameterDescriptorImpl]

'INT_TYPE' @ [98:36] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'LongValue' @ [99:21] ==> public constructor LongValue(value: Long) defined in org.jetbrains.eval4j.LongValue[ClassConstructorDescriptorImpl]

'v' @ [99:31] ==> value-parameter v: Long defined in org.jetbrains.eval4j.long[ValueParameterDescriptorImpl]

'FloatValue' @ [100:23] ==> public constructor FloatValue(value: Float) defined in org.jetbrains.eval4j.FloatValue[ClassConstructorDescriptorImpl]

'v' @ [100:34] ==> value-parameter v: Float defined in org.jetbrains.eval4j.float[ValueParameterDescriptorImpl]

'DoubleValue' @ [101:25] ==> public constructor DoubleValue(value: Double) defined in org.jetbrains.eval4j.DoubleValue[ClassConstructorDescriptorImpl]

'v' @ [101:37] ==> value-parameter v: Double defined in org.jetbrains.eval4j.double[ValueParameterDescriptorImpl]

'ObjectValue' @ [104:18] ==> public constructor ObjectValue(value: Any?, asmType: Type) defined in org.jetbrains.eval4j.ObjectValue[ClassConstructorDescriptorImpl]

'getObjectType' @ [104:41] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'==' @ [106:36] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'this' @ [106:37] ==> <this> defined in org.jetbrains.eval4j.boolean[ReceiverParameterDescriptorImpl]

'value' @ [106:55] ==> public open val value: Int defined in org.jetbrains.eval4j.IntValue[PropertyDescriptorImpl]

'this' @ [107:29] ==> <this> defined in org.jetbrains.eval4j.int[ReceiverParameterDescriptorImpl]

'value' @ [107:47] ==> public open val value: Int defined in org.jetbrains.eval4j.IntValue[PropertyDescriptorImpl]

'this' @ [108:31] ==> <this> defined in org.jetbrains.eval4j.long[ReceiverParameterDescriptorImpl]

'value' @ [108:50] ==> public open val value: Long defined in org.jetbrains.eval4j.LongValue[PropertyDescriptorImpl]

'this' @ [109:33] ==> <this> defined in org.jetbrains.eval4j.float[ReceiverParameterDescriptorImpl]

'value' @ [109:53] ==> public open val value: Float defined in org.jetbrains.eval4j.FloatValue[PropertyDescriptorImpl]

'this' @ [110:35] ==> <this> defined in org.jetbrains.eval4j.double[ReceiverParameterDescriptorImpl]

'value' @ [110:56] ==> public open val value: Double defined in org.jetbrains.eval4j.DoubleValue[PropertyDescriptorImpl]

'asmType' @ [111:36] ==> public abstract val asmType: Type defined in org.jetbrains.eval4j.Value[PropertyDescriptorImpl]

'when {
        expectedType == Type.BOOLEAN_TYPE -> this.boolean
        expectedType == Type.SHORT_TYPE -> (this as IntValue).int.toShort()
        expectedType == Type.BYTE_TYPE -> (this as IntValue).int.toByte()
        expectedType == Type.CHAR_TYPE -> (this as IntValue).int.toChar()
        else -> (this as AbstractValue<*>).value
    }' @ [112:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any?, entry1: Any?, entry2: Any?, entry3: Any?, entry4: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any?

'expectedType' @ [113:9] ==> value-parameter expectedType: Type = ... defined in org.jetbrains.eval4j.obj[ValueParameterDescriptorImpl]

'BOOLEAN_TYPE' @ [113:30] ==> public final val BOOLEAN_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'this' @ [113:46] ==> <this> defined in org.jetbrains.eval4j.obj[ReceiverParameterDescriptorImpl]

'boolean' @ [113:51] ==> public val Value.boolean: Boolean defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'expectedType' @ [114:9] ==> value-parameter expectedType: Type = ... defined in org.jetbrains.eval4j.obj[ValueParameterDescriptorImpl]

'SHORT_TYPE' @ [114:30] ==> public final val SHORT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'this' @ [114:45] ==> <this> defined in org.jetbrains.eval4j.obj[ReceiverParameterDescriptorImpl]

'int' @ [114:63] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'toShort' @ [114:67] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'expectedType' @ [115:9] ==> value-parameter expectedType: Type = ... defined in org.jetbrains.eval4j.obj[ValueParameterDescriptorImpl]

'BYTE_TYPE' @ [115:30] ==> public final val BYTE_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'this' @ [115:44] ==> <this> defined in org.jetbrains.eval4j.obj[ReceiverParameterDescriptorImpl]

'int' @ [115:62] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'toByte' @ [115:66] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'expectedType' @ [116:9] ==> value-parameter expectedType: Type = ... defined in org.jetbrains.eval4j.obj[ValueParameterDescriptorImpl]

'CHAR_TYPE' @ [116:30] ==> public final val CHAR_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'this' @ [116:44] ==> <this> defined in org.jetbrains.eval4j.obj[ReceiverParameterDescriptorImpl]

'int' @ [116:62] ==> public val Value.int: Int defined in org.jetbrains.eval4j in file values.kt[PropertyDescriptorImpl]

'toChar' @ [116:66] ==> public open fun toChar(): Char defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'this' @ [117:18] ==> <this> defined in org.jetbrains.eval4j.obj[ReceiverParameterDescriptorImpl]

'value' @ [117:44] ==> public open val value: Any? defined in org.jetbrains.eval4j.AbstractValue[PropertyDescriptorImpl]

'this' @ [122:9] ==> <this> defined in org.jetbrains.eval4j.checkNull[ReceiverParameterDescriptorImpl]

'throwEvalException' @ [123:9] ==> public fun throwEvalException(e: Throwable): Nothing defined in org.jetbrains.eval4j in file values.kt[SimpleFunctionDescriptorImpl]

'NullPointerException' @ [123:28] ==> public final fun <init>(): NullPointerException /* = NullPointerException */ defined in kotlin.NullPointerException[TypeAliasConstructorDescriptorImpl]

'this' @ [125:12] ==> <this> defined in org.jetbrains.eval4j.checkNull[ReceiverParameterDescriptorImpl]

'ThrownFromEvalException' @ [129:11] ==> public constructor ThrownFromEvalException(cause: Throwable) defined in org.jetbrains.eval4j.ThrownFromEvalException[ClassConstructorDescriptorImpl]

'e' @ [129:35] ==> value-parameter e: Throwable defined in org.jetbrains.eval4j.throwEvalException[ValueParameterDescriptorImpl]

'BrokenCode' @ [133:11] ==> public constructor BrokenCode(cause: Throwable) defined in org.jetbrains.eval4j.BrokenCode[ClassConstructorDescriptorImpl]

'e' @ [133:22] ==> value-parameter e: Throwable defined in org.jetbrains.eval4j.throwBrokenCodeException[ValueParameterDescriptorImpl]

