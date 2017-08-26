'hashMapOf' @ [25:73] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<ParameterInfo, Int> /* = HashMap<ParameterInfo, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ParameterInfo
    <V> -> Int

'parameters' @ [27:27] ==> public final val parameters: List<ParameterInfo> defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'sumBy' @ [27:38] ==> public inline fun <T> Iterable<ParameterInfo>.sumBy(selector: (ParameterInfo) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParameterInfo

'it' @ [27:46] ==> value-parameter it: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.Parameters.argsSizeOnStack.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [27:49] ==> public final val type: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.ParameterInfo[JavaPropertyDescriptor]

'size' @ [27:54] ==> public final val Type.size: Int[MyPropertyDescriptor]

'argsSizeOnStack' @ [30:17] ==> public final val argsSizeOnStack: Int defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'capturedParametersSizeOnStack' @ [30:35] ==> public final val capturedParametersSizeOnStack: Int defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'getValue' @ [32:42] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'captured' @ [33:9] ==> public final val captured: List<CapturedParamInfo> defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'sumBy' @ [33:18] ==> public inline fun <T> Iterable<CapturedParamInfo>.sumBy(selector: (CapturedParamInfo) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CapturedParamInfo

'it' @ [33:26] ==> value-parameter it: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.Parameters.capturedParametersSizeOnStack.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [33:29] ==> public final val type: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.CapturedParamInfo[JavaPropertyDescriptor]

'size' @ [33:34] ==> public final val Type.size: Int[MyPropertyDescriptor]

'getValue' @ [36:21] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'parameters' @ [37:9] ==> public final val parameters: List<ParameterInfo> defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'filterIsInstance' @ [37:20] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<CapturedParamInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> CapturedParamInfo

'arrayOfNulls' @ [41:35] ==> public fun <reified @PureReifiable T> arrayOfNulls(size: Int): Array<Int?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Int

'argsSizeOnStack' @ [41:53] ==> public final val argsSizeOnStack: Int defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'withIndex' @ [42:9] ==> public fun <T> Iterable<ParameterInfo>.withIndex(): Iterable<IndexedValue<ParameterInfo>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParameterInfo

'forEach' @ [42:21] ==> @HidesMembers public inline fun <T> Iterable<IndexedValue<ParameterInfo>>.forEach(action: (IndexedValue<ParameterInfo>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<ParameterInfo>

'declIndexesToActual' @ [43:13] ==> val declIndexesToActual: Array<Int?> defined in org.jetbrains.kotlin.codegen.inline.Parameters.<init>[LocalVariableDescriptor]

'it' @ [43:33] ==> value-parameter it: IndexedValue<ParameterInfo> defined in org.jetbrains.kotlin.codegen.inline.Parameters.<init>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [43:36] ==> public final val value: ParameterInfo defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'declarationIndex' @ [43:42] ==> public final val declarationIndex: Int defined in org.jetbrains.kotlin.codegen.inline.ParameterInfo[JavaPropertyDescriptor]

'it' @ [43:62] ==> value-parameter it: IndexedValue<ParameterInfo> defined in org.jetbrains.kotlin.codegen.inline.Parameters.<init>.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [43:65] ==> public final val index: Int defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'actualDeclShifts' @ [46:9] ==> private final val actualDeclShifts: Array<ParameterInfo?> defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'arrayOfNulls' @ [46:28] ==> public fun <reified @PureReifiable T> arrayOfNulls(size: Int): Array<ParameterInfo?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> ParameterInfo

'argsSizeOnStack' @ [46:56] ==> public final val argsSizeOnStack: Int defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'declIndexesToActual' @ [48:19] ==> val declIndexesToActual: Array<Int?> defined in org.jetbrains.kotlin.codegen.inline.Parameters.<init>[LocalVariableDescriptor]

'indices' @ [48:39] ==> public val <T> Array<out Int?>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Int?

'get' @ [49:38] ==> private final fun get(index: Int): ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.Parameters[SimpleFunctionDescriptorImpl]

'declIndexesToActual' @ [49:42] ==> val declIndexesToActual: Array<Int?> defined in org.jetbrains.kotlin.codegen.inline.Parameters.<init>[LocalVariableDescriptor]

'i' @ [49:62] ==> val i: Int defined in org.jetbrains.kotlin.codegen.inline.Parameters.<init>[LocalVariableDescriptor]

'actualDeclShifts' @ [50:13] ==> private final val actualDeclShifts: Array<ParameterInfo?> defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'realSize' @ [50:30] ==> var realSize: Int defined in org.jetbrains.kotlin.codegen.inline.Parameters.<init>[LocalVariableDescriptor]

'byDeclarationIndex' @ [50:42] ==> val byDeclarationIndex: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.Parameters.<init>[LocalVariableDescriptor]

'paramToDeclByteCodeIndex' @ [51:13] ==> private final val paramToDeclByteCodeIndex: HashMap<ParameterInfo, Int> defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'put' @ [51:38] ==> public open fun put(key: ParameterInfo, value: Int): Int? defined in java.util.HashMap[JavaMethodDescriptor]

'byDeclarationIndex' @ [51:42] ==> val byDeclarationIndex: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.Parameters.<init>[LocalVariableDescriptor]

'realSize' @ [51:62] ==> var realSize: Int defined in org.jetbrains.kotlin.codegen.inline.Parameters.<init>[LocalVariableDescriptor]

'realSize' @ [52:13] ==> var realSize: Int defined in org.jetbrains.kotlin.codegen.inline.Parameters.<init>[LocalVariableDescriptor]

'byDeclarationIndex' @ [52:25] ==> val byDeclarationIndex: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.Parameters.<init>[LocalVariableDescriptor]

'type' @ [52:44] ==> public final val type: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.ParameterInfo[JavaPropertyDescriptor]

'size' @ [52:49] ==> public final val Type.size: Int[MyPropertyDescriptor]

'paramToDeclByteCodeIndex' @ [57:16] ==> private final val paramToDeclByteCodeIndex: HashMap<ParameterInfo, Int> defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'info' @ [57:41] ==> value-parameter info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.Parameters.getDeclarationSlot[ValueParameterDescriptorImpl]

'actualDeclShifts' @ [61:16] ==> private final val actualDeclShifts: Array<ParameterInfo?> defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'index' @ [61:33] ==> value-parameter index: Int defined in org.jetbrains.kotlin.codegen.inline.Parameters.getParameterByDeclarationSlot[ValueParameterDescriptorImpl]

'parameters' @ [65:16] ==> public final val parameters: List<ParameterInfo> defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'index' @ [65:27] ==> value-parameter index: Int defined in org.jetbrains.kotlin.codegen.inline.Parameters.get[ValueParameterDescriptorImpl]

'parameters' @ [69:16] ==> public final val parameters: List<ParameterInfo> defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'iterator' @ [69:27] ==> public abstract fun iterator(): Iterator<ParameterInfo> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'captured' @ [73:17] ==> public final val captured: List<CapturedParamInfo> defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'map' @ [73:26] ==> public inline fun <T, R> Iterable<CapturedParamInfo>.map(transform: (CapturedParamInfo) -> Type): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CapturedParamInfo
    <R> -> Type

'getType' @ [73:49] ==> @NotNull public open fun getType(): Type defined in org.jetbrains.kotlin.codegen.inline.CapturedParamInfo[JavaMethodDescriptor]

