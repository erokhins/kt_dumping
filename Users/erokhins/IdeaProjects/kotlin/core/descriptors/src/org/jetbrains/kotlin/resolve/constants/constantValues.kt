'value' @ [32:31] ==> public open val value: T defined in org.jetbrains.kotlin.resolve.constants.ConstantValue[PropertyDescriptorImpl]

'toString' @ [32:37] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

'ConstantValue<T>' @ [35:78] ==> public constructor ConstantValue<out T>(value: T) defined in org.jetbrains.kotlin.resolve.constants.ConstantValue[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> T

'value' @ [35:95] ==> value-parameter value: T defined in org.jetbrains.kotlin.resolve.constants.IntegerValueConstant.<init>[ValueParameterDescriptorImpl]

'ConstantValue<AnnotationDescriptor>' @ [37:54] ==> public constructor ConstantValue<out T>(value: AnnotationDescriptor) defined in org.jetbrains.kotlin.resolve.constants.ConstantValue[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> AnnotationDescriptor

'value' @ [37:90] ==> value-parameter value: AnnotationDescriptor defined in org.jetbrains.kotlin.resolve.constants.AnnotationValue.<init>[ValueParameterDescriptorImpl]

'value' @ [40:17] ==> public open val value: AnnotationDescriptor defined in org.jetbrains.kotlin.resolve.constants.AnnotationValue[PropertyDescriptorImpl]

'type' @ [40:23] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[PropertyDescriptorImpl]

'visitor' @ [42:85] ==> value-parameter visitor: AnnotationArgumentVisitor<R, D> defined in org.jetbrains.kotlin.resolve.constants.AnnotationValue.accept[ValueParameterDescriptorImpl]

'visitAnnotationValue' @ [42:93] ==> public abstract fun visitAnnotationValue(value: (AnnotationValue..AnnotationValue?), data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationArgumentVisitor[JavaMethodDescriptor]

'this' @ [42:114] ==> <this> defined in org.jetbrains.kotlin.resolve.constants.AnnotationValue[LazyClassReceiverParameterDescriptor]

'data' @ [42:120] ==> value-parameter data: D defined in org.jetbrains.kotlin.resolve.constants.AnnotationValue.accept[ValueParameterDescriptorImpl]

'value' @ [43:31] ==> public open val value: AnnotationDescriptor defined in org.jetbrains.kotlin.resolve.constants.AnnotationValue[PropertyDescriptorImpl]

'toString' @ [43:37] ==> public open fun toString(): String defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedSimpleFunctionDescriptor]

'ConstantValue<List<ConstantValue<*>>>' @ [50:5] ==> public constructor ConstantValue<out T>(value: List<ConstantValue<*>>) defined in org.jetbrains.kotlin.resolve.constants.ConstantValue[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> List<ConstantValue<*>>

'value' @ [50:43] ==> value-parameter value: List<ConstantValue<*>> defined in org.jetbrains.kotlin.resolve.constants.ArrayValue.<init>[ValueParameterDescriptorImpl]

'assert' @ [53:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'isArray' @ [53:31] ==> public open fun isArray(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [53:39] ==> public open val type: KotlinType defined in org.jetbrains.kotlin.resolve.constants.ArrayValue[PropertyDescriptorImpl]

'isPrimitiveArray' @ [53:63] ==> public open fun isPrimitiveArray(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [53:80] ==> public open val type: KotlinType defined in org.jetbrains.kotlin.resolve.constants.ArrayValue[PropertyDescriptorImpl]

'+' @ [53:89] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'type' @ [53:127] ==> public open val type: KotlinType defined in org.jetbrains.kotlin.resolve.constants.ArrayValue[PropertyDescriptorImpl]

'value' @ [53:141] ==> value-parameter value: List<ConstantValue<*>> defined in org.jetbrains.kotlin.resolve.constants.ArrayValue.<init>[ValueParameterDescriptorImpl]

'visitor' @ [56:85] ==> value-parameter visitor: AnnotationArgumentVisitor<R, D> defined in org.jetbrains.kotlin.resolve.constants.ArrayValue.accept[ValueParameterDescriptorImpl]

'visitArrayValue' @ [56:93] ==> public abstract fun visitArrayValue(value: (ArrayValue..ArrayValue?), data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationArgumentVisitor[JavaMethodDescriptor]

'this' @ [56:109] ==> <this> defined in org.jetbrains.kotlin.resolve.constants.ArrayValue[LazyClassReceiverParameterDescriptor]

'data' @ [56:115] ==> value-parameter data: D defined in org.jetbrains.kotlin.resolve.constants.ArrayValue.accept[ValueParameterDescriptorImpl]

'builtIns' @ [59:17] ==> private final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.constants.ArrayValue[PropertyDescriptorImpl]

'getArrayElementType' @ [59:26] ==> @NotNull public open fun getArrayElementType(@NotNull arrayType: KotlinType): KotlinType defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [59:46] ==> public open val type: KotlinType defined in org.jetbrains.kotlin.resolve.constants.ArrayValue[PropertyDescriptorImpl]

'this' @ [62:13] ==> <this> defined in org.jetbrains.kotlin.resolve.constants.ArrayValue[LazyClassReceiverParameterDescriptor]

'other' @ [62:22] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.resolve.constants.ArrayValue.equals[ValueParameterDescriptorImpl]

'other' @ [63:13] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.resolve.constants.ArrayValue.equals[ValueParameterDescriptorImpl]

'other' @ [63:30] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.resolve.constants.ArrayValue.equals[ValueParameterDescriptorImpl]

'java' @ [63:43] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Any)

'this' @ [63:51] ==> <this> defined in org.jetbrains.kotlin.resolve.constants.ArrayValue[LazyClassReceiverParameterDescriptor]

'java' @ [63:63] ==> public val <T> KClass<out ArrayValue>.java: Class<out ArrayValue> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out ArrayValue)

'value' @ [65:16] ==> public open val value: List<ConstantValue<*>> defined in org.jetbrains.kotlin.resolve.constants.ArrayValue[PropertyDescriptorImpl]

'other' @ [65:26] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.resolve.constants.ArrayValue.equals[ValueParameterDescriptorImpl]

'value' @ [65:47] ==> public open val value: List<ConstantValue<*>> defined in org.jetbrains.kotlin.resolve.constants.ArrayValue[PropertyDescriptorImpl]

'value' @ [68:31] ==> public open val value: List<ConstantValue<*>> defined in org.jetbrains.kotlin.resolve.constants.ArrayValue[PropertyDescriptorImpl]

'hashCode' @ [68:37] ==> public open fun hashCode(): Int defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'ConstantValue<Boolean>' @ [74:5] ==> public constructor ConstantValue<out T>(value: Boolean) defined in org.jetbrains.kotlin.resolve.constants.ConstantValue[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Boolean

'value' @ [74:28] ==> value-parameter value: Boolean defined in org.jetbrains.kotlin.resolve.constants.BooleanValue.<init>[ValueParameterDescriptorImpl]

'builtIns' @ [76:25] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.constants.BooleanValue.<init>[ValueParameterDescriptorImpl]

'booleanType' @ [76:34] ==> public final val KotlinBuiltIns.booleanType: SimpleType[MyPropertyDescriptor]

'visitor' @ [77:85] ==> value-parameter visitor: AnnotationArgumentVisitor<R, D> defined in org.jetbrains.kotlin.resolve.constants.BooleanValue.accept[ValueParameterDescriptorImpl]

'visitBooleanValue' @ [77:93] ==> public abstract fun visitBooleanValue(value: (BooleanValue..BooleanValue?), data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationArgumentVisitor[JavaMethodDescriptor]

'this' @ [77:111] ==> <this> defined in org.jetbrains.kotlin.resolve.constants.BooleanValue[LazyClassReceiverParameterDescriptor]

'data' @ [77:117] ==> value-parameter data: D defined in org.jetbrains.kotlin.resolve.constants.BooleanValue.accept[ValueParameterDescriptorImpl]

'IntegerValueConstant<Byte>' @ [84:5] ==> protected constructor IntegerValueConstant<out T>(value: Byte) defined in org.jetbrains.kotlin.resolve.constants.IntegerValueConstant[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Byte

'value' @ [84:32] ==> value-parameter value: Byte defined in org.jetbrains.kotlin.resolve.constants.ByteValue.<init>[ValueParameterDescriptorImpl]

'builtIns' @ [86:25] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.constants.ByteValue.<init>[ValueParameterDescriptorImpl]

'byteType' @ [86:34] ==> public final val KotlinBuiltIns.byteType: SimpleType[MyPropertyDescriptor]

'visitor' @ [88:85] ==> value-parameter visitor: AnnotationArgumentVisitor<R, D> defined in org.jetbrains.kotlin.resolve.constants.ByteValue.accept[ValueParameterDescriptorImpl]

'visitByteValue' @ [88:93] ==> public abstract fun visitByteValue(value: (ByteValue..ByteValue?), data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationArgumentVisitor[JavaMethodDescriptor]

'this' @ [88:108] ==> <this> defined in org.jetbrains.kotlin.resolve.constants.ByteValue[LazyClassReceiverParameterDescriptor]

'data' @ [88:114] ==> value-parameter data: D defined in org.jetbrains.kotlin.resolve.constants.ByteValue.accept[ValueParameterDescriptorImpl]

'value' @ [89:41] ==> public open val value: Byte defined in org.jetbrains.kotlin.resolve.constants.ByteValue[PropertyDescriptorImpl]

'IntegerValueConstant<Char>' @ [95:5] ==> protected constructor IntegerValueConstant<out T>(value: Char) defined in org.jetbrains.kotlin.resolve.constants.IntegerValueConstant[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Char

'value' @ [95:32] ==> value-parameter value: Char defined in org.jetbrains.kotlin.resolve.constants.CharValue.<init>[ValueParameterDescriptorImpl]

'builtIns' @ [97:25] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.constants.CharValue.<init>[ValueParameterDescriptorImpl]

'charType' @ [97:34] ==> public final val KotlinBuiltIns.charType: SimpleType[MyPropertyDescriptor]

'visitor' @ [99:85] ==> value-parameter visitor: AnnotationArgumentVisitor<R, D> defined in org.jetbrains.kotlin.resolve.constants.CharValue.accept[ValueParameterDescriptorImpl]

'visitCharValue' @ [99:93] ==> public abstract fun visitCharValue(value: (CharValue..CharValue?), data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationArgumentVisitor[JavaMethodDescriptor]

'this' @ [99:108] ==> <this> defined in org.jetbrains.kotlin.resolve.constants.CharValue[LazyClassReceiverParameterDescriptor]

'data' @ [99:114] ==> value-parameter data: D defined in org.jetbrains.kotlin.resolve.constants.CharValue.accept[ValueParameterDescriptorImpl]

'format' @ [101:48] ==> @InlineOnly public inline fun String.format(vararg args: Any?): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'value' @ [101:55] ==> public open val value: Char defined in org.jetbrains.kotlin.resolve.constants.CharValue[PropertyDescriptorImpl]

'toInt' @ [101:61] ==> public final fun toInt(): Int defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'getPrintablePart' @ [101:70] ==> private final fun getPrintablePart(c: Char): String defined in org.jetbrains.kotlin.resolve.constants.CharValue[SimpleFunctionDescriptorImpl]

'value' @ [101:87] ==> public open val value: Char defined in org.jetbrains.kotlin.resolve.constants.CharValue[PropertyDescriptorImpl]

'when (c) {
        '\b' -> "\\b"
        '\t' -> "\\t"
        '\n' -> "\\n"
    //TODO: KT-8507
        12.toChar() -> "\\f"
        '\r' -> "\\r"
        else -> if (isPrintableUnicode(c)) Character.toString(c) else "?"
    }' @ [103:53] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String, entry4: String, entry5: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'c' @ [103:59] ==> value-parameter c: Char defined in org.jetbrains.kotlin.resolve.constants.CharValue.getPrintablePart[ValueParameterDescriptorImpl]

'toChar' @ [108:12] ==> public open fun toChar(): Char defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'if (isPrintableUnicode(c)) Character.toString(c) else "?"' @ [110:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'isPrintableUnicode' @ [110:21] ==> private final fun isPrintableUnicode(c: Char): Boolean defined in org.jetbrains.kotlin.resolve.constants.CharValue[SimpleFunctionDescriptorImpl]

'c' @ [110:40] ==> value-parameter c: Char defined in org.jetbrains.kotlin.resolve.constants.CharValue.getPrintablePart[ValueParameterDescriptorImpl]

'toString' @ [110:54] ==> public open fun toString(p0: Char): (String..String?) defined in java.lang.Character[JavaMethodDescriptor]

'c' @ [110:63] ==> value-parameter c: Char defined in org.jetbrains.kotlin.resolve.constants.CharValue.getPrintablePart[ValueParameterDescriptorImpl]

'getType' @ [114:27] ==> public open fun getType(p0: Char): Int defined in java.lang.Character[JavaMethodDescriptor]

'c' @ [114:35] ==> value-parameter c: Char defined in org.jetbrains.kotlin.resolve.constants.CharValue.isPrintableUnicode[ValueParameterDescriptorImpl]

'toByte' @ [114:38] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

't' @ [115:16] ==> val t: Byte defined in org.jetbrains.kotlin.resolve.constants.CharValue.isPrintableUnicode[LocalVariableDescriptor]

'UNASSIGNED' @ [115:31] ==> public const final val UNASSIGNED: Byte defined in java.lang.Character[JavaPropertyDescriptor]

't' @ [116:16] ==> val t: Byte defined in org.jetbrains.kotlin.resolve.constants.CharValue.isPrintableUnicode[LocalVariableDescriptor]

'LINE_SEPARATOR' @ [116:31] ==> public const final val LINE_SEPARATOR: Byte defined in java.lang.Character[JavaPropertyDescriptor]

't' @ [117:16] ==> val t: Byte defined in org.jetbrains.kotlin.resolve.constants.CharValue.isPrintableUnicode[LocalVariableDescriptor]

'PARAGRAPH_SEPARATOR' @ [117:31] ==> public const final val PARAGRAPH_SEPARATOR: Byte defined in java.lang.Character[JavaPropertyDescriptor]

't' @ [118:16] ==> val t: Byte defined in org.jetbrains.kotlin.resolve.constants.CharValue.isPrintableUnicode[LocalVariableDescriptor]

'CONTROL' @ [118:31] ==> public const final val CONTROL: Byte defined in java.lang.Character[JavaPropertyDescriptor]

't' @ [119:16] ==> val t: Byte defined in org.jetbrains.kotlin.resolve.constants.CharValue.isPrintableUnicode[LocalVariableDescriptor]

'FORMAT' @ [119:31] ==> public const final val FORMAT: Byte defined in java.lang.Character[JavaPropertyDescriptor]

't' @ [120:16] ==> val t: Byte defined in org.jetbrains.kotlin.resolve.constants.CharValue.isPrintableUnicode[LocalVariableDescriptor]

'PRIVATE_USE' @ [120:31] ==> public const final val PRIVATE_USE: Byte defined in java.lang.Character[JavaPropertyDescriptor]

't' @ [121:16] ==> val t: Byte defined in org.jetbrains.kotlin.resolve.constants.CharValue.isPrintableUnicode[LocalVariableDescriptor]

'SURROGATE' @ [121:31] ==> public const final val SURROGATE: Byte defined in java.lang.Character[JavaPropertyDescriptor]

'ConstantValue<Double>' @ [128:5] ==> public constructor ConstantValue<out T>(value: Double) defined in org.jetbrains.kotlin.resolve.constants.ConstantValue[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Double

'value' @ [128:27] ==> value-parameter value: Double defined in org.jetbrains.kotlin.resolve.constants.DoubleValue.<init>[ValueParameterDescriptorImpl]

'builtIns' @ [129:25] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.constants.DoubleValue.<init>[ValueParameterDescriptorImpl]

'doubleType' @ [129:34] ==> public final val KotlinBuiltIns.doubleType: SimpleType[MyPropertyDescriptor]

'visitor' @ [131:85] ==> value-parameter visitor: AnnotationArgumentVisitor<R, D> defined in org.jetbrains.kotlin.resolve.constants.DoubleValue.accept[ValueParameterDescriptorImpl]

'visitDoubleValue' @ [131:93] ==> public abstract fun visitDoubleValue(value: (DoubleValue..DoubleValue?), data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationArgumentVisitor[JavaMethodDescriptor]

'this' @ [131:110] ==> <this> defined in org.jetbrains.kotlin.resolve.constants.DoubleValue[LazyClassReceiverParameterDescriptor]

'data' @ [131:116] ==> value-parameter data: D defined in org.jetbrains.kotlin.resolve.constants.DoubleValue.accept[ValueParameterDescriptorImpl]

'value' @ [133:33] ==> public open val value: Double defined in org.jetbrains.kotlin.resolve.constants.DoubleValue[PropertyDescriptorImpl]

'ConstantValue<ClassDescriptor>' @ [138:5] ==> public constructor ConstantValue<out T>(value: ClassDescriptor) defined in org.jetbrains.kotlin.resolve.constants.ConstantValue[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> ClassDescriptor

'value' @ [138:36] ==> value-parameter value: ClassDescriptor defined in org.jetbrains.kotlin.resolve.constants.EnumValue.<init>[ValueParameterDescriptorImpl]

'value' @ [141:17] ==> public open val value: ClassDescriptor defined in org.jetbrains.kotlin.resolve.constants.EnumValue[PropertyDescriptorImpl]

'classValueType' @ [141:23] ==> public val ClassDescriptor.classValueType: KotlinType? defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'createErrorType' @ [141:52] ==> @NotNull public open fun createErrorType(@NotNull debugMessage: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'value' @ [141:120] ==> public open val value: ClassDescriptor defined in org.jetbrains.kotlin.resolve.constants.EnumValue[PropertyDescriptorImpl]

'visitor' @ [143:85] ==> value-parameter visitor: AnnotationArgumentVisitor<R, D> defined in org.jetbrains.kotlin.resolve.constants.EnumValue.accept[ValueParameterDescriptorImpl]

'visitEnumValue' @ [143:93] ==> public abstract fun visitEnumValue(value: (EnumValue..EnumValue?), data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationArgumentVisitor[JavaMethodDescriptor]

'this' @ [143:108] ==> <this> defined in org.jetbrains.kotlin.resolve.constants.EnumValue[LazyClassReceiverParameterDescriptor]

'data' @ [143:114] ==> value-parameter data: D defined in org.jetbrains.kotlin.resolve.constants.EnumValue.accept[ValueParameterDescriptorImpl]

'type' @ [145:33] ==> public open val type: KotlinType defined in org.jetbrains.kotlin.resolve.constants.EnumValue[PropertyDescriptorImpl]

'value' @ [145:40] ==> public open val value: ClassDescriptor defined in org.jetbrains.kotlin.resolve.constants.EnumValue[PropertyDescriptorImpl]

'name' @ [145:46] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'this' @ [148:13] ==> <this> defined in org.jetbrains.kotlin.resolve.constants.EnumValue[LazyClassReceiverParameterDescriptor]

'other' @ [148:22] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.resolve.constants.EnumValue.equals[ValueParameterDescriptorImpl]

'other' @ [149:13] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.resolve.constants.EnumValue.equals[ValueParameterDescriptorImpl]

'other' @ [149:30] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.resolve.constants.EnumValue.equals[ValueParameterDescriptorImpl]

'java' @ [149:43] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Any)

'this' @ [149:51] ==> <this> defined in org.jetbrains.kotlin.resolve.constants.EnumValue[LazyClassReceiverParameterDescriptor]

'java' @ [149:63] ==> public val <T> KClass<out EnumValue>.java: Class<out EnumValue> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out EnumValue)

'value' @ [151:16] ==> public open val value: ClassDescriptor defined in org.jetbrains.kotlin.resolve.constants.EnumValue[PropertyDescriptorImpl]

'other' @ [151:26] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.resolve.constants.EnumValue.equals[ValueParameterDescriptorImpl]

'value' @ [151:46] ==> public open val value: ClassDescriptor defined in org.jetbrains.kotlin.resolve.constants.EnumValue[PropertyDescriptorImpl]

'value' @ [154:31] ==> public open val value: ClassDescriptor defined in org.jetbrains.kotlin.resolve.constants.EnumValue[PropertyDescriptorImpl]

'hashCode' @ [154:37] ==> public open fun hashCode(): Int defined in org.jetbrains.kotlin.descriptors.ClassDescriptor[DeserializedSimpleFunctionDescriptor]

'ConstantValue<Unit>' @ [157:29] ==> public constructor ConstantValue<out T>(value: Unit) defined in org.jetbrains.kotlin.resolve.constants.ConstantValue[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Unit

'Unit' @ [157:49] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'Deprecated' @ [159:5] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'UnsupportedOperationException' @ [161:23] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'visitor' @ [163:85] ==> value-parameter visitor: AnnotationArgumentVisitor<R, D> defined in org.jetbrains.kotlin.resolve.constants.ErrorValue.accept[ValueParameterDescriptorImpl]

'visitErrorValue' @ [163:93] ==> public abstract fun visitErrorValue(value: (ErrorValue..ErrorValue?), data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationArgumentVisitor[JavaMethodDescriptor]

'this' @ [163:109] ==> <this> defined in org.jetbrains.kotlin.resolve.constants.ErrorValue[LazyClassReceiverParameterDescriptor]

'data' @ [163:115] ==> value-parameter data: D defined in org.jetbrains.kotlin.resolve.constants.ErrorValue.accept[ValueParameterDescriptorImpl]

'ErrorValue' @ [165:56] ==> public constructor ErrorValue() defined in org.jetbrains.kotlin.resolve.constants.ErrorValue[ClassConstructorDescriptorImpl]

'createErrorType' @ [167:40] ==> @NotNull public open fun createErrorType(@NotNull debugMessage: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'message' @ [167:56] ==> public final val message: String defined in org.jetbrains.kotlin.resolve.constants.ErrorValue.ErrorValueWithMessage[PropertyDescriptorImpl]

'message' @ [169:35] ==> public final val message: String defined in org.jetbrains.kotlin.resolve.constants.ErrorValue.ErrorValueWithMessage[PropertyDescriptorImpl]

'ErrorValueWithMessage' @ [174:20] ==> public constructor ErrorValueWithMessage(message: String) defined in org.jetbrains.kotlin.resolve.constants.ErrorValue.ErrorValueWithMessage[ClassConstructorDescriptorImpl]

'message' @ [174:42] ==> value-parameter message: String defined in org.jetbrains.kotlin.resolve.constants.ErrorValue.Companion.create[ValueParameterDescriptorImpl]

'ConstantValue<Float>' @ [182:5] ==> public constructor ConstantValue<out T>(value: Float) defined in org.jetbrains.kotlin.resolve.constants.ConstantValue[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Float

'value' @ [182:26] ==> value-parameter value: Float defined in org.jetbrains.kotlin.resolve.constants.FloatValue.<init>[ValueParameterDescriptorImpl]

'builtIns' @ [183:25] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.constants.FloatValue.<init>[ValueParameterDescriptorImpl]

'floatType' @ [183:34] ==> public final val KotlinBuiltIns.floatType: SimpleType[MyPropertyDescriptor]

'visitor' @ [185:85] ==> value-parameter visitor: AnnotationArgumentVisitor<R, D> defined in org.jetbrains.kotlin.resolve.constants.FloatValue.accept[ValueParameterDescriptorImpl]

'visitFloatValue' @ [185:93] ==> public abstract fun visitFloatValue(value: (FloatValue..FloatValue?), data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationArgumentVisitor[JavaMethodDescriptor]

'this' @ [185:109] ==> <this> defined in org.jetbrains.kotlin.resolve.constants.FloatValue[LazyClassReceiverParameterDescriptor]

'data' @ [185:115] ==> value-parameter data: D defined in org.jetbrains.kotlin.resolve.constants.FloatValue.accept[ValueParameterDescriptorImpl]

'value' @ [187:33] ==> public open val value: Float defined in org.jetbrains.kotlin.resolve.constants.FloatValue[PropertyDescriptorImpl]

'IntegerValueConstant<Int>' @ [193:5] ==> protected constructor IntegerValueConstant<out T>(value: Int) defined in org.jetbrains.kotlin.resolve.constants.IntegerValueConstant[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Int

'value' @ [193:31] ==> value-parameter value: Int defined in org.jetbrains.kotlin.resolve.constants.IntValue.<init>[ValueParameterDescriptorImpl]

'builtIns' @ [195:25] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.constants.IntValue.<init>[ValueParameterDescriptorImpl]

'intType' @ [195:34] ==> public final val KotlinBuiltIns.intType: SimpleType[MyPropertyDescriptor]

'visitor' @ [197:85] ==> value-parameter visitor: AnnotationArgumentVisitor<R, D> defined in org.jetbrains.kotlin.resolve.constants.IntValue.accept[ValueParameterDescriptorImpl]

'visitIntValue' @ [197:93] ==> public abstract fun visitIntValue(value: (IntValue..IntValue?), data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationArgumentVisitor[JavaMethodDescriptor]

'this' @ [197:107] ==> <this> defined in org.jetbrains.kotlin.resolve.constants.IntValue[LazyClassReceiverParameterDescriptor]

'data' @ [197:113] ==> value-parameter data: D defined in org.jetbrains.kotlin.resolve.constants.IntValue.accept[ValueParameterDescriptorImpl]

'this' @ [200:13] ==> <this> defined in org.jetbrains.kotlin.resolve.constants.IntValue[LazyClassReceiverParameterDescriptor]

'other' @ [200:22] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.resolve.constants.IntValue.equals[ValueParameterDescriptorImpl]

'other' @ [201:13] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.resolve.constants.IntValue.equals[ValueParameterDescriptorImpl]

'other' @ [201:30] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.resolve.constants.IntValue.equals[ValueParameterDescriptorImpl]

'java' @ [201:43] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Any)

'this' @ [201:51] ==> <this> defined in org.jetbrains.kotlin.resolve.constants.IntValue[LazyClassReceiverParameterDescriptor]

'java' @ [201:63] ==> public val <T> KClass<out IntValue>.java: Class<out IntValue> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out IntValue)

'other' @ [203:24] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.resolve.constants.IntValue.equals[ValueParameterDescriptorImpl]

'value' @ [205:16] ==> public open val value: Int defined in org.jetbrains.kotlin.resolve.constants.IntValue[PropertyDescriptorImpl]

'intValue' @ [205:25] ==> val intValue: IntValue defined in org.jetbrains.kotlin.resolve.constants.IntValue.equals[LocalVariableDescriptor]

'value' @ [205:34] ==> public open val value: Int defined in org.jetbrains.kotlin.resolve.constants.IntValue[PropertyDescriptorImpl]

'value' @ [208:31] ==> public open val value: Int defined in org.jetbrains.kotlin.resolve.constants.IntValue[PropertyDescriptorImpl]

'ConstantValue<KotlinType>' @ [212:9] ==> public constructor ConstantValue<out T>(value: KotlinType) defined in org.jetbrains.kotlin.resolve.constants.ConstantValue[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> KotlinType

'type' @ [212:35] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.constants.KClassValue.<init>[ValueParameterDescriptorImpl]

'type' @ [214:17] ==> public open val type: KotlinType defined in org.jetbrains.kotlin.resolve.constants.KClassValue[PropertyDescriptorImpl]

'arguments' @ [214:22] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'single' @ [214:32] ==> public fun <T> List<TypeProjection>.single(): TypeProjection defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'type' @ [214:41] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'visitor' @ [216:85] ==> value-parameter visitor: AnnotationArgumentVisitor<R, D> defined in org.jetbrains.kotlin.resolve.constants.KClassValue.accept[ValueParameterDescriptorImpl]

'visitKClassValue' @ [216:93] ==> public abstract fun visitKClassValue(value: (KClassValue..KClassValue?), data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationArgumentVisitor[JavaMethodDescriptor]

'this' @ [216:110] ==> <this> defined in org.jetbrains.kotlin.resolve.constants.KClassValue[LazyClassReceiverParameterDescriptor]

'data' @ [216:116] ==> value-parameter data: D defined in org.jetbrains.kotlin.resolve.constants.KClassValue.accept[ValueParameterDescriptorImpl]

'IntegerValueConstant<Long>' @ [222:5] ==> protected constructor IntegerValueConstant<out T>(value: Long) defined in org.jetbrains.kotlin.resolve.constants.IntegerValueConstant[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Long

'value' @ [222:32] ==> value-parameter value: Long defined in org.jetbrains.kotlin.resolve.constants.LongValue.<init>[ValueParameterDescriptorImpl]

'builtIns' @ [224:25] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.constants.LongValue.<init>[ValueParameterDescriptorImpl]

'longType' @ [224:34] ==> public final val KotlinBuiltIns.longType: SimpleType[MyPropertyDescriptor]

'visitor' @ [226:85] ==> value-parameter visitor: AnnotationArgumentVisitor<R, D> defined in org.jetbrains.kotlin.resolve.constants.LongValue.accept[ValueParameterDescriptorImpl]

'visitLongValue' @ [226:93] ==> public abstract fun visitLongValue(@NotNull value: LongValue, data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationArgumentVisitor[JavaMethodDescriptor]

'this' @ [226:108] ==> <this> defined in org.jetbrains.kotlin.resolve.constants.LongValue[LazyClassReceiverParameterDescriptor]

'data' @ [226:114] ==> value-parameter data: D defined in org.jetbrains.kotlin.resolve.constants.LongValue.accept[ValueParameterDescriptorImpl]

'value' @ [228:33] ==> public open val value: Long defined in org.jetbrains.kotlin.resolve.constants.LongValue[PropertyDescriptorImpl]

'ConstantValue<Void?>' @ [233:5] ==> public constructor ConstantValue<out T>(value: Void?) defined in org.jetbrains.kotlin.resolve.constants.ConstantValue[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Void?

'builtIns' @ [235:25] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.constants.NullValue.<init>[ValueParameterDescriptorImpl]

'nullableNothingType' @ [235:34] ==> public final val KotlinBuiltIns.nullableNothingType: SimpleType[MyPropertyDescriptor]

'visitor' @ [237:85] ==> value-parameter visitor: AnnotationArgumentVisitor<R, D> defined in org.jetbrains.kotlin.resolve.constants.NullValue.accept[ValueParameterDescriptorImpl]

'visitNullValue' @ [237:93] ==> public abstract fun visitNullValue(value: (NullValue..NullValue?), data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationArgumentVisitor[JavaMethodDescriptor]

'this' @ [237:108] ==> <this> defined in org.jetbrains.kotlin.resolve.constants.NullValue[LazyClassReceiverParameterDescriptor]

'data' @ [237:114] ==> value-parameter data: D defined in org.jetbrains.kotlin.resolve.constants.NullValue.accept[ValueParameterDescriptorImpl]

'IntegerValueConstant<Short>' @ [245:5] ==> protected constructor IntegerValueConstant<out T>(value: Short) defined in org.jetbrains.kotlin.resolve.constants.IntegerValueConstant[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Short

'value' @ [245:33] ==> value-parameter value: Short defined in org.jetbrains.kotlin.resolve.constants.ShortValue.<init>[ValueParameterDescriptorImpl]

'builtIns' @ [247:25] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.constants.ShortValue.<init>[ValueParameterDescriptorImpl]

'shortType' @ [247:34] ==> public final val KotlinBuiltIns.shortType: SimpleType[MyPropertyDescriptor]

'visitor' @ [249:85] ==> value-parameter visitor: AnnotationArgumentVisitor<R, D> defined in org.jetbrains.kotlin.resolve.constants.ShortValue.accept[ValueParameterDescriptorImpl]

'visitShortValue' @ [249:93] ==> public abstract fun visitShortValue(value: (ShortValue..ShortValue?), data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationArgumentVisitor[JavaMethodDescriptor]

'this' @ [249:109] ==> <this> defined in org.jetbrains.kotlin.resolve.constants.ShortValue[LazyClassReceiverParameterDescriptor]

'data' @ [249:115] ==> value-parameter data: D defined in org.jetbrains.kotlin.resolve.constants.ShortValue.accept[ValueParameterDescriptorImpl]

'value' @ [251:33] ==> public open val value: Short defined in org.jetbrains.kotlin.resolve.constants.ShortValue[PropertyDescriptorImpl]

'ConstantValue<String>' @ [257:5] ==> public constructor ConstantValue<out T>(value: String) defined in org.jetbrains.kotlin.resolve.constants.ConstantValue[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> String

'value' @ [257:27] ==> value-parameter value: String defined in org.jetbrains.kotlin.resolve.constants.StringValue.<init>[ValueParameterDescriptorImpl]

'builtIns' @ [258:25] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.constants.StringValue.<init>[ValueParameterDescriptorImpl]

'stringType' @ [258:34] ==> public final val KotlinBuiltIns.stringType: SimpleType[MyPropertyDescriptor]

'visitor' @ [260:85] ==> value-parameter visitor: AnnotationArgumentVisitor<R, D> defined in org.jetbrains.kotlin.resolve.constants.StringValue.accept[ValueParameterDescriptorImpl]

'visitStringValue' @ [260:93] ==> public abstract fun visitStringValue(value: (StringValue..StringValue?), data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationArgumentVisitor[JavaMethodDescriptor]

'this' @ [260:110] ==> <this> defined in org.jetbrains.kotlin.resolve.constants.StringValue[LazyClassReceiverParameterDescriptor]

'data' @ [260:116] ==> value-parameter data: D defined in org.jetbrains.kotlin.resolve.constants.StringValue.accept[ValueParameterDescriptorImpl]

'value' @ [262:35] ==> public open val value: String defined in org.jetbrains.kotlin.resolve.constants.StringValue[PropertyDescriptorImpl]

'this' @ [265:13] ==> <this> defined in org.jetbrains.kotlin.resolve.constants.StringValue[LazyClassReceiverParameterDescriptor]

'other' @ [265:22] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.resolve.constants.StringValue.equals[ValueParameterDescriptorImpl]

'other' @ [266:13] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.resolve.constants.StringValue.equals[ValueParameterDescriptorImpl]

'other' @ [266:30] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.resolve.constants.StringValue.equals[ValueParameterDescriptorImpl]

'java' @ [266:43] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Any)

'this' @ [266:51] ==> <this> defined in org.jetbrains.kotlin.resolve.constants.StringValue[LazyClassReceiverParameterDescriptor]

'java' @ [266:63] ==> public val <T> KClass<out StringValue>.java: Class<out StringValue> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out StringValue)

'value' @ [268:16] ==> public open val value: String defined in org.jetbrains.kotlin.resolve.constants.StringValue[PropertyDescriptorImpl]

'other' @ [268:26] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.resolve.constants.StringValue.equals[ValueParameterDescriptorImpl]

'value' @ [268:48] ==> public open val value: String defined in org.jetbrains.kotlin.resolve.constants.StringValue[PropertyDescriptorImpl]

'value' @ [271:31] ==> public open val value: String defined in org.jetbrains.kotlin.resolve.constants.StringValue[PropertyDescriptorImpl]

'hashCode' @ [271:37] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

