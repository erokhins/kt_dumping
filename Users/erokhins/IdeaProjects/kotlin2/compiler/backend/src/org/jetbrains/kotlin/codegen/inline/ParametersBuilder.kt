'arrayListOf' @ [24:26] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<ParameterInfo> /* = ArrayList<ParameterInfo> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParameterInfo

'addParameter' @ [34:16] ==> private final fun <T : ParameterInfo> addParameter(info: ParameterInfo): ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ParameterInfo> -> ParameterInfo

'ParameterInfo' @ [34:29] ==> public constructor ParameterInfo(@NotNull type: Type, skipped: Boolean, index: Int, remapValue: Int, declarationIndex: Int) defined in org.jetbrains.kotlin.codegen.inline.ParameterInfo[JavaClassConstructorDescriptor]

'type' @ [34:43] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addThis[ValueParameterDescriptorImpl]

'skipped' @ [34:49] ==> value-parameter skipped: Boolean defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addThis[ValueParameterDescriptorImpl]

'nextParameterOffset' @ [34:58] ==> public final var nextParameterOffset: Int defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[PropertyDescriptorImpl]

'-' @ [34:79] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'nextValueParameterIndex' @ [34:83] ==> private final var nextValueParameterIndex: Int defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[PropertyDescriptorImpl]

'addParameter' @ [38:16] ==> private final fun <T : ParameterInfo> addParameter(info: ParameterInfo): ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ParameterInfo> -> ParameterInfo

'ParameterInfo' @ [38:29] ==> public constructor ParameterInfo(@NotNull type: Type, skipped: Boolean, index: Int, @Nullable remapValue: StackValue?, declarationIndex: Int) defined in org.jetbrains.kotlin.codegen.inline.ParameterInfo[JavaClassConstructorDescriptor]

'type' @ [38:43] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addNextParameter[ValueParameterDescriptorImpl]

'skipped' @ [38:49] ==> value-parameter skipped: Boolean defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addNextParameter[ValueParameterDescriptorImpl]

'nextParameterOffset' @ [38:58] ==> public final var nextParameterOffset: Int defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[PropertyDescriptorImpl]

'nextValueParameterIndex' @ [38:85] ==> private final var nextValueParameterIndex: Int defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[PropertyDescriptorImpl]

'addParameter' @ [42:16] ==> private final fun <T : ParameterInfo> addParameter(info: ParameterInfo): ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ParameterInfo> -> ParameterInfo

'ParameterInfo' @ [42:29] ==> public constructor ParameterInfo(@NotNull type: Type, skipped: Boolean, index: Int, @Nullable remapValue: StackValue?, declarationIndex: Int) defined in org.jetbrains.kotlin.codegen.inline.ParameterInfo[JavaClassConstructorDescriptor]

'type' @ [43:17] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addNextValueParameter[ValueParameterDescriptorImpl]

'skipped' @ [43:23] ==> value-parameter skipped: Boolean defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addNextValueParameter[ValueParameterDescriptorImpl]

'nextParameterOffset' @ [43:32] ==> public final var nextParameterOffset: Int defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[PropertyDescriptorImpl]

'remapValue' @ [43:53] ==> value-parameter remapValue: StackValue? defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addNextValueParameter[ValueParameterDescriptorImpl]

'if (parameterIndex == -1) nextValueParameterIndex else parameterIndex + valueParamFirstIndex' @ [44:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'parameterIndex' @ [44:21] ==> value-parameter parameterIndex: Int defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addNextValueParameter[ValueParameterDescriptorImpl]

'-' @ [44:39] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'nextValueParameterIndex' @ [44:43] ==> private final var nextValueParameterIndex: Int defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[PropertyDescriptorImpl]

'parameterIndex' @ [44:72] ==> value-parameter parameterIndex: Int defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addNextValueParameter[ValueParameterDescriptorImpl]

'valueParamFirstIndex' @ [44:89] ==> private final var valueParamFirstIndex: Int defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[PropertyDescriptorImpl]

'CapturedParamInfo' @ [49:20] ==> public constructor CapturedParamInfo(@NotNull desc: CapturedParamDesc, @NotNull newFieldName: String, skipped: Boolean, index: Int, remapIndex: Int) defined in org.jetbrains.kotlin.codegen.inline.CapturedParamInfo[JavaClassConstructorDescriptor]

'original' @ [49:38] ==> value-parameter original: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addCapturedParam[ValueParameterDescriptorImpl]

'desc' @ [49:47] ==> public final val desc: (CapturedParamDesc..CapturedParamDesc?) defined in org.jetbrains.kotlin.codegen.inline.CapturedParamInfo[JavaPropertyDescriptor]

'newFieldName' @ [49:53] ==> value-parameter newFieldName: String defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addCapturedParam[ValueParameterDescriptorImpl]

'original' @ [49:67] ==> value-parameter original: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addCapturedParam[ValueParameterDescriptorImpl]

'isSkipped' @ [49:76] ==> public final val isSkipped: Boolean defined in org.jetbrains.kotlin.codegen.inline.CapturedParamInfo[JavaPropertyDescriptor]

'nextParameterOffset' @ [49:87] ==> public final var nextParameterOffset: Int defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[PropertyDescriptorImpl]

'original' @ [49:108] ==> value-parameter original: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addCapturedParam[ValueParameterDescriptorImpl]

'index' @ [49:117] ==> public final val CapturedParamInfo.index: Int[MyPropertyDescriptor]

'info' @ [50:9] ==> val info: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addCapturedParam[LocalVariableDescriptor]

'lambda' @ [50:14] ==> public final var CapturedParamInfo.lambda: LambdaInfo?[MyPropertyDescriptor]

'original' @ [50:23] ==> value-parameter original: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addCapturedParam[ValueParameterDescriptorImpl]

'lambda' @ [50:32] ==> public final var CapturedParamInfo.lambda: LambdaInfo?[MyPropertyDescriptor]

'addParameter' @ [51:16] ==> private final fun <T : ParameterInfo> addParameter(info: CapturedParamInfo): CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ParameterInfo> -> CapturedParamInfo

'info' @ [51:29] ==> val info: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addCapturedParam[LocalVariableDescriptor]

'addParameter' @ [55:16] ==> private final fun <T : ParameterInfo> addParameter(info: CapturedParamInfo): CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ParameterInfo> -> CapturedParamInfo

'CapturedParamInfo' @ [55:29] ==> public constructor CapturedParamInfo(@NotNull desc: CapturedParamDesc, @NotNull newFieldName: String, skipped: Boolean, index: Int, @Nullable remapIndex: StackValue?, skipInConstructor: Boolean, declarationIndex: Int) defined in org.jetbrains.kotlin.codegen.inline.CapturedParamInfo[JavaClassConstructorDescriptor]

'desc' @ [55:47] ==> value-parameter desc: CapturedParamDesc defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addCapturedParam[ValueParameterDescriptorImpl]

'newFieldName' @ [55:53] ==> value-parameter newFieldName: String defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addCapturedParam[ValueParameterDescriptorImpl]

'nextParameterOffset' @ [55:74] ==> public final var nextParameterOffset: Int defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[PropertyDescriptorImpl]

'skipInConstructor' @ [55:101] ==> value-parameter skipInConstructor: Boolean defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addCapturedParam[ValueParameterDescriptorImpl]

'-' @ [55:120] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'addParameter' @ [59:16] ==> private final fun <T : ParameterInfo> addParameter(info: CapturedParamInfo): CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ParameterInfo> -> CapturedParamInfo

'copyFrom' @ [59:29] ==> value-parameter copyFrom: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addCapturedParamCopy[ValueParameterDescriptorImpl]

'cloneWithNewDeclarationIndex' @ [59:38] ==> @NotNull public open fun cloneWithNewDeclarationIndex(newDeclarationIndex: Int): CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.CapturedParamInfo[JavaMethodDescriptor]

'-' @ [59:67] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'CapturedParamInfo' @ [70:20] ==> public constructor CapturedParamInfo(@NotNull desc: CapturedParamDesc, @NotNull newFieldName: String, skipped: Boolean, index: Int, remapIndex: Int) defined in org.jetbrains.kotlin.codegen.inline.CapturedParamInfo[JavaClassConstructorDescriptor]

'CapturedParamDesc' @ [71:17] ==> public constructor CapturedParamDesc(@NotNull containingLambdaType: Type, @NotNull fieldName: String, @NotNull type: Type) defined in org.jetbrains.kotlin.codegen.inline.CapturedParamDesc[JavaClassConstructorDescriptor]

'containingLambdaType' @ [71:35] ==> value-parameter containingLambdaType: Type defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addCapturedParam[ValueParameterDescriptorImpl]

'fieldName' @ [71:57] ==> value-parameter fieldName: String defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addCapturedParam[ValueParameterDescriptorImpl]

'type' @ [71:68] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addCapturedParam[ValueParameterDescriptorImpl]

'newFieldName' @ [71:75] ==> value-parameter newFieldName: String defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addCapturedParam[ValueParameterDescriptorImpl]

'skipped' @ [71:89] ==> value-parameter skipped: Boolean defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addCapturedParam[ValueParameterDescriptorImpl]

'nextParameterOffset' @ [71:98] ==> public final var nextParameterOffset: Int defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[PropertyDescriptorImpl]

'original' @ [71:119] ==> value-parameter original: ParameterInfo? defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addCapturedParam[ValueParameterDescriptorImpl]

'index' @ [71:129] ==> public final val ParameterInfo.index: Int[MyPropertyDescriptor]

'-' @ [71:138] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'original' @ [73:13] ==> value-parameter original: ParameterInfo? defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addCapturedParam[ValueParameterDescriptorImpl]

'info' @ [74:13] ==> val info: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addCapturedParam[LocalVariableDescriptor]

'lambda' @ [74:18] ==> public final var CapturedParamInfo.lambda: LambdaInfo?[MyPropertyDescriptor]

'original' @ [74:27] ==> value-parameter original: ParameterInfo? defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addCapturedParam[ValueParameterDescriptorImpl]

'lambda' @ [74:36] ==> public final var ParameterInfo.lambda: LambdaInfo?[MyPropertyDescriptor]

'addParameter' @ [76:16] ==> private final fun <T : ParameterInfo> addParameter(info: CapturedParamInfo): CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ParameterInfo> -> CapturedParamInfo

'info' @ [76:29] ==> val info: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addCapturedParam[LocalVariableDescriptor]

'params' @ [80:9] ==> private final val params: ArrayList<ParameterInfo> /* = ArrayList<ParameterInfo> */ defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[PropertyDescriptorImpl]

'add' @ [80:16] ==> public open fun add(element: ParameterInfo): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'info' @ [80:20] ==> value-parameter info: T defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addParameter[ValueParameterDescriptorImpl]

'nextParameterOffset' @ [81:9] ==> public final var nextParameterOffset: Int defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[PropertyDescriptorImpl]

'info' @ [81:32] ==> value-parameter info: T defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addParameter[ValueParameterDescriptorImpl]

'getType' @ [81:37] ==> @NotNull public open fun getType(): Type defined in org.jetbrains.kotlin.codegen.inline.ParameterInfo[JavaMethodDescriptor]

'size' @ [81:47] ==> public final val Type.size: Int[MyPropertyDescriptor]

'info' @ [82:13] ==> value-parameter info: T defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addParameter[ValueParameterDescriptorImpl]

'nextValueParameterIndex' @ [83:13] ==> private final var nextValueParameterIndex: Int defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[PropertyDescriptorImpl]

'info' @ [85:16] ==> value-parameter info: T defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.addParameter[ValueParameterDescriptorImpl]

'this' @ [89:9] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[LazyClassReceiverParameterDescriptor]

'valueParamFirstIndex' @ [89:14] ==> private final var valueParamFirstIndex: Int defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[PropertyDescriptorImpl]

'params' @ [89:37] ==> private final val params: ArrayList<ParameterInfo> /* = ArrayList<ParameterInfo> */ defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[PropertyDescriptorImpl]

'size' @ [89:44] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'this' @ [90:9] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[LazyClassReceiverParameterDescriptor]

'nextValueParameterIndex' @ [90:14] ==> private final var nextValueParameterIndex: Int defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[PropertyDescriptorImpl]

'valueParamFirstIndex' @ [90:40] ==> private final var valueParamFirstIndex: Int defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[PropertyDescriptorImpl]

'params' @ [94:16] ==> private final val params: ArrayList<ParameterInfo> /* = ArrayList<ParameterInfo> */ defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[PropertyDescriptorImpl]

'filterIsInstance' @ [94:23] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<CapturedParamInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> CapturedParamInfo

'params' @ [99:16] ==> private final val params: ArrayList<ParameterInfo> /* = ArrayList<ParameterInfo> */ defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[PropertyDescriptorImpl]

'+' @ [103:36] ==> public final operator fun plus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'params' @ [103:37] ==> private final val params: ArrayList<ParameterInfo> /* = ArrayList<ParameterInfo> */ defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[PropertyDescriptorImpl]

'maxBy' @ [103:44] ==> public inline fun <T, R : Comparable<Int>> Iterable<ParameterInfo>.maxBy(selector: (ParameterInfo) -> Int): ParameterInfo? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParameterInfo
    <R : Comparable<R>> -> Int

'it' @ [103:52] ==> value-parameter it: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.buildParameters.<anonymous>[ValueParameterDescriptorImpl]

'declarationIndex' @ [103:55] ==> public final val declarationIndex: Int defined in org.jetbrains.kotlin.codegen.inline.ParameterInfo[JavaPropertyDescriptor]

'declarationIndex' @ [103:75] ==> public final val declarationIndex: Int defined in org.jetbrains.kotlin.codegen.inline.ParameterInfo[JavaPropertyDescriptor]

'-' @ [103:95] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'Parameters' @ [105:16] ==> public constructor Parameters(parameters: List<ParameterInfo>) defined in org.jetbrains.kotlin.codegen.inline.Parameters[ClassConstructorDescriptorImpl]

'params' @ [105:27] ==> private final val params: ArrayList<ParameterInfo> /* = ArrayList<ParameterInfo> */ defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[PropertyDescriptorImpl]

'map' @ [105:34] ==> public inline fun <T, R> Iterable<ParameterInfo>.map(transform: (ParameterInfo) -> ParameterInfo): List<ParameterInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParameterInfo
    <R> -> ParameterInfo

'if (param is CapturedParamInfo) {
                param.cloneWithNewDeclarationIndex(nextDeclarationIndex++)
            }
            else {
                param
            }' @ [106:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ParameterInfo, elseBranch: ParameterInfo): ParameterInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ParameterInfo

'param' @ [106:17] ==> value-parameter param: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.buildParameters.<anonymous>[ValueParameterDescriptorImpl]

'param' @ [107:17] ==> value-parameter param: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.buildParameters.<anonymous>[ValueParameterDescriptorImpl]

'cloneWithNewDeclarationIndex' @ [107:23] ==> @NotNull public open fun cloneWithNewDeclarationIndex(newDeclarationIndex: Int): CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.CapturedParamInfo[JavaMethodDescriptor]

'nextDeclarationIndex' @ [107:52] ==> var nextDeclarationIndex: Int defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.buildParameters[LocalVariableDescriptor]

'param' @ [110:17] ==> value-parameter param: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.buildParameters.<anonymous>[ValueParameterDescriptorImpl]

'JvmStatic' @ [116:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'ParametersBuilder' @ [118:20] ==> private constructor ParametersBuilder() defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[ClassConstructorDescriptorImpl]

'JvmOverloads' @ [121:9] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'JvmStatic' @ [122:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'newBuilder' @ [126:27] ==> @JvmStatic public final fun newBuilder(): ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.Companion[SimpleFunctionDescriptorImpl]

'builder' @ [128:13] ==> val builder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.Companion.initializeBuilderFrom[LocalVariableDescriptor]

'addThis' @ [128:21] ==> public final fun addThis(type: Type, skipped: Boolean): ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'objectType' @ [128:29] ==> value-parameter objectType: Type defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.Companion.initializeBuilderFrom[ValueParameterDescriptorImpl]

'inlineLambda' @ [128:41] ==> value-parameter inlineLambda: LambdaInfo? = ... defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.Companion.initializeBuilderFrom[ValueParameterDescriptorImpl]

'lambda' @ [128:63] ==> public final var ParameterInfo.lambda: LambdaInfo?[MyPropertyDescriptor]

'inlineLambda' @ [128:72] ==> value-parameter inlineLambda: LambdaInfo? = ... defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.Companion.initializeBuilderFrom[ValueParameterDescriptorImpl]

'iterator' @ [130:26] ==> public final operator fun iterator(): Iterator<(Type..Type?)> defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'getArgumentTypes' @ [130:31] ==> public open fun getArgumentTypes(p0: (String..String?)): (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'descriptor' @ [130:48] ==> value-parameter descriptor: String defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.Companion.initializeBuilderFrom[ValueParameterDescriptorImpl]

'builder' @ [131:17] ==> val builder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.Companion.initializeBuilderFrom[LocalVariableDescriptor]

'addNextParameter' @ [131:25] ==> public final fun addNextParameter(type: Type, skipped: Boolean): ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'type' @ [131:42] ==> val type: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.Companion.initializeBuilderFrom[LocalVariableDescriptor]

'builder' @ [133:20] ==> val builder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.Companion.initializeBuilderFrom[LocalVariableDescriptor]

