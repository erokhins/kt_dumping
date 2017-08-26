'OptimizationBasicInterpreter' @ [24:47] ==> public constructor OptimizationBasicInterpreter() defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaClassConstructorDescriptor]

'when {
                v is ProperTrackedReferenceValue && w is ProperTrackedReferenceValue ->
                    if (v.descriptor == w.descriptor)
                        v
                    else
                        createTaintedValue(v, w)

                v is TrackedReferenceValue && w is TrackedReferenceValue ->
                    createPossiblyMergedValue(v, w)

                v is TrackedReferenceValue || w is TrackedReferenceValue ->
                    createTaintedValue(v, w)

                else ->
                    super.merge(v, w)
            }' @ [26:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: BasicValue, entry1: BasicValue, entry2: BasicValue, entry3: BasicValue): BasicValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> BasicValue

'v' @ [27:17] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [27:53] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.merge[ValueParameterDescriptorImpl]

'if (v.descriptor == w.descriptor)
                        v
                    else
                        createTaintedValue(v, w)' @ [28:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TrackedReferenceValue, elseBranch: TrackedReferenceValue): TrackedReferenceValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TrackedReferenceValue

'v' @ [28:25] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.merge[ValueParameterDescriptorImpl]

'descriptor' @ [28:27] ==> public final val descriptor: ReferenceValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.common.ProperTrackedReferenceValue[PropertyDescriptorImpl]

'w' @ [28:41] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.merge[ValueParameterDescriptorImpl]

'descriptor' @ [28:43] ==> public final val descriptor: ReferenceValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.common.ProperTrackedReferenceValue[PropertyDescriptorImpl]

'v' @ [29:25] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.merge[ValueParameterDescriptorImpl]

'createTaintedValue' @ [31:25] ==> protected final fun createTaintedValue(v: BasicValue, w: BasicValue): TrackedReferenceValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter[SimpleFunctionDescriptorImpl]

'v' @ [31:44] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [31:47] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.merge[ValueParameterDescriptorImpl]

'v' @ [33:17] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [33:47] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.merge[ValueParameterDescriptorImpl]

'createPossiblyMergedValue' @ [34:21] ==> protected open fun createPossiblyMergedValue(v: TrackedReferenceValue, w: TrackedReferenceValue): TrackedReferenceValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter[SimpleFunctionDescriptorImpl]

'v' @ [34:47] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [34:50] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.merge[ValueParameterDescriptorImpl]

'v' @ [36:17] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [36:47] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.merge[ValueParameterDescriptorImpl]

'createTaintedValue' @ [37:21] ==> protected final fun createTaintedValue(v: BasicValue, w: BasicValue): TrackedReferenceValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter[SimpleFunctionDescriptorImpl]

'v' @ [37:40] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [37:43] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.merge[ValueParameterDescriptorImpl]

'super' @ [40:21] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter[LazyClassReceiverParameterDescriptor]

'merge' @ [40:27] ==> @NotNull @Override public open fun merge(@NotNull v: BasicValue, @NotNull w: BasicValue): BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaMethodDescriptor]

'v' @ [40:33] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [40:36] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.merge[ValueParameterDescriptorImpl]

'TaintedTrackedReferenceValue' @ [44:13] ==> public constructor TaintedTrackedReferenceValue(type: Type, descriptors: Set<ReferenceValueDescriptor>) defined in org.jetbrains.kotlin.codegen.optimization.common.TaintedTrackedReferenceValue[ClassConstructorDescriptorImpl]

'getMergedValueType' @ [45:21] ==> protected final fun getMergedValueType(type1: Type?, type2: Type?): Type defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter[SimpleFunctionDescriptorImpl]

'v' @ [45:40] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.createTaintedValue[ValueParameterDescriptorImpl]

'type' @ [45:42] ==> public final val BasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'w' @ [45:48] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.createTaintedValue[ValueParameterDescriptorImpl]

'type' @ [45:50] ==> public final val BasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'mergeDescriptors' @ [46:21] ==> private final fun mergeDescriptors(v: BasicValue, w: BasicValue): Set<ReferenceValueDescriptor> defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter[SimpleFunctionDescriptorImpl]

'v' @ [46:38] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.createTaintedValue[ValueParameterDescriptorImpl]

'w' @ [46:41] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.createTaintedValue[ValueParameterDescriptorImpl]

'also' @ [46:44] ==> @InlineOnly @SinceKotlin public inline fun <T> Set<ReferenceValueDescriptor>.also(block: (Set<ReferenceValueDescriptor>) -> Unit): Set<ReferenceValueDescriptor> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Set<ReferenceValueDescriptor>

'assert' @ [47:25] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'it' @ [47:32] ==> value-parameter it: Set<ReferenceValueDescriptor> defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.createTaintedValue.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [47:35] ==> @InlineOnly public inline fun <T> Collection<ReferenceValueDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReferenceValueDescriptor

'v' @ [47:70] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.createTaintedValue[ValueParameterDescriptorImpl]

'w' @ [47:74] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.createTaintedValue[ValueParameterDescriptorImpl]

'if (v is TaintedTrackedReferenceValue || w is TaintedTrackedReferenceValue)
                createTaintedValue(v, w)
            else
                MergedTrackedReferenceValue(getMergedValueType(v.type, w.type), mergeDescriptors(v, w))' @ [52:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TrackedReferenceValue, elseBranch: TrackedReferenceValue): TrackedReferenceValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TrackedReferenceValue

'v' @ [52:17] ==> value-parameter v: TrackedReferenceValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.createMergedValue[ValueParameterDescriptorImpl]

'w' @ [52:54] ==> value-parameter w: TrackedReferenceValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.createMergedValue[ValueParameterDescriptorImpl]

'createTaintedValue' @ [53:17] ==> protected final fun createTaintedValue(v: BasicValue, w: BasicValue): TrackedReferenceValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter[SimpleFunctionDescriptorImpl]

'v' @ [53:36] ==> value-parameter v: TrackedReferenceValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.createMergedValue[ValueParameterDescriptorImpl]

'w' @ [53:39] ==> value-parameter w: TrackedReferenceValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.createMergedValue[ValueParameterDescriptorImpl]

'MergedTrackedReferenceValue' @ [55:17] ==> public constructor MergedTrackedReferenceValue(type: Type, descriptors: Set<ReferenceValueDescriptor>) defined in org.jetbrains.kotlin.codegen.optimization.common.MergedTrackedReferenceValue[ClassConstructorDescriptorImpl]

'getMergedValueType' @ [55:45] ==> protected final fun getMergedValueType(type1: Type?, type2: Type?): Type defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter[SimpleFunctionDescriptorImpl]

'v' @ [55:64] ==> value-parameter v: TrackedReferenceValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.createMergedValue[ValueParameterDescriptorImpl]

'type' @ [55:66] ==> public final val TrackedReferenceValue.type: (Type..Type?)[MyPropertyDescriptor]

'w' @ [55:72] ==> value-parameter w: TrackedReferenceValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.createMergedValue[ValueParameterDescriptorImpl]

'type' @ [55:74] ==> public final val TrackedReferenceValue.type: (Type..Type?)[MyPropertyDescriptor]

'mergeDescriptors' @ [55:81] ==> private final fun mergeDescriptors(v: BasicValue, w: BasicValue): Set<ReferenceValueDescriptor> defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter[SimpleFunctionDescriptorImpl]

'v' @ [55:98] ==> value-parameter v: TrackedReferenceValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.createMergedValue[ValueParameterDescriptorImpl]

'w' @ [55:101] ==> value-parameter w: TrackedReferenceValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.createMergedValue[ValueParameterDescriptorImpl]

'createTaintedValue' @ [58:13] ==> protected final fun createTaintedValue(v: BasicValue, w: BasicValue): TrackedReferenceValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter[SimpleFunctionDescriptorImpl]

'v' @ [58:32] ==> value-parameter v: TrackedReferenceValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.createPossiblyMergedValue[ValueParameterDescriptorImpl]

'w' @ [58:35] ==> value-parameter w: TrackedReferenceValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.createPossiblyMergedValue[ValueParameterDescriptorImpl]

'v' @ [61:13] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.mergeDescriptors[ValueParameterDescriptorImpl]

'referenceValueDescriptors' @ [61:15] ==> private final val BasicValue.referenceValueDescriptors: Set<ReferenceValueDescriptor> defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter[PropertyDescriptorImpl]

'w' @ [61:43] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.mergeDescriptors[ValueParameterDescriptorImpl]

'referenceValueDescriptors' @ [61:45] ==> private final val BasicValue.referenceValueDescriptors: Set<ReferenceValueDescriptor> defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter[PropertyDescriptorImpl]

'if (this is TrackedReferenceValue) this.descriptors else emptySet()' @ [64:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Set<ReferenceValueDescriptor>, elseBranch: Set<ReferenceValueDescriptor>): Set<ReferenceValueDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Set<ReferenceValueDescriptor>

'this' @ [64:21] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.referenceValueDescriptors[ReceiverParameterDescriptorImpl]

'this' @ [64:52] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.referenceValueDescriptors[ReceiverParameterDescriptorImpl]

'descriptors' @ [64:57] ==> public abstract val descriptors: Set<ReferenceValueDescriptor> defined in org.jetbrains.kotlin.codegen.optimization.common.TrackedReferenceValue[PropertyDescriptorImpl]

'emptySet' @ [64:74] ==> public fun <T> emptySet(): Set<ReferenceValueDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReferenceValueDescriptor

'when {
                type1 == null || type2 == null -> AsmTypes.OBJECT_TYPE
                type1 == type2 -> type1
                else -> AsmTypes.OBJECT_TYPE
            }' @ [67:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Type, entry1: Type, entry2: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Type

'type1' @ [68:17] ==> value-parameter type1: Type? defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.getMergedValueType[ValueParameterDescriptorImpl]

'type2' @ [68:34] ==> value-parameter type2: Type? defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.getMergedValueType[ValueParameterDescriptorImpl]

'OBJECT_TYPE' @ [68:60] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'type1' @ [69:17] ==> value-parameter type1: Type? defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.getMergedValueType[ValueParameterDescriptorImpl]

'type2' @ [69:26] ==> value-parameter type2: Type? defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.getMergedValueType[ValueParameterDescriptorImpl]

'type1' @ [69:35] ==> value-parameter type1: Type? defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.getMergedValueType[ValueParameterDescriptorImpl]

'OBJECT_TYPE' @ [70:34] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'if (value is TrackedReferenceValue) {
                checkRefValuesUsages(insn, listOf(value))
                value
            }
            else {
                super.copyOperation(insn, value)
            }' @ [74:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BasicValue?, elseBranch: BasicValue?): BasicValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BasicValue?

'value' @ [74:17] ==> value-parameter value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.copyOperation[ValueParameterDescriptorImpl]

'checkRefValuesUsages' @ [75:17] ==> protected open fun checkRefValuesUsages(insn: AbstractInsnNode, values: List<BasicValue>): Unit defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter[SimpleFunctionDescriptorImpl]

'insn' @ [75:38] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.copyOperation[ValueParameterDescriptorImpl]

'listOf' @ [75:44] ==> public fun <T> listOf(element: TrackedReferenceValue): List<TrackedReferenceValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TrackedReferenceValue

'value' @ [75:51] ==> value-parameter value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.copyOperation[ValueParameterDescriptorImpl]

'value' @ [76:17] ==> value-parameter value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.copyOperation[ValueParameterDescriptorImpl]

'super' @ [79:17] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter[LazyClassReceiverParameterDescriptor]

'copyOperation' @ [79:23] ==> @Override public open fun copyOperation(@NotNull insn: AbstractInsnNode, value: (BasicValue..BasicValue?)): (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaMethodDescriptor]

'insn' @ [79:37] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.copyOperation[ValueParameterDescriptorImpl]

'value' @ [79:43] ==> value-parameter value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.copyOperation[ValueParameterDescriptorImpl]

'checkRefValuesUsages' @ [83:9] ==> protected open fun checkRefValuesUsages(insn: AbstractInsnNode, values: List<BasicValue>): Unit defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter[SimpleFunctionDescriptorImpl]

'insn' @ [83:30] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'listOf' @ [83:36] ==> public fun <T> listOf(element: BasicValue): List<BasicValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicValue

'value' @ [83:43] ==> value-parameter value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'super' @ [84:16] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter[LazyClassReceiverParameterDescriptor]

'unaryOperation' @ [84:22] ==> @Override public open fun unaryOperation(insn: (AbstractInsnNode..AbstractInsnNode?), value: (BasicValue..BasicValue?)): (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaMethodDescriptor]

'insn' @ [84:37] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'value' @ [84:43] ==> value-parameter value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'checkRefValuesUsages' @ [88:9] ==> protected open fun checkRefValuesUsages(insn: AbstractInsnNode, values: List<BasicValue>): Unit defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter[SimpleFunctionDescriptorImpl]

'insn' @ [88:30] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'listOf' @ [88:36] ==> public fun <T> listOf(vararg elements: BasicValue): List<BasicValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicValue

'value1' @ [88:43] ==> value-parameter value1: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'value2' @ [88:51] ==> value-parameter value2: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'super' @ [89:16] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter[LazyClassReceiverParameterDescriptor]

'binaryOperation' @ [89:22] ==> @Override public open fun binaryOperation(@NotNull insn: AbstractInsnNode, @NotNull value1: BasicValue, @NotNull value2: BasicValue): (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaMethodDescriptor]

'insn' @ [89:38] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'value1' @ [89:44] ==> value-parameter value1: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'value2' @ [89:52] ==> value-parameter value2: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.binaryOperation[ValueParameterDescriptorImpl]

'checkRefValuesUsages' @ [93:9] ==> protected open fun checkRefValuesUsages(insn: AbstractInsnNode, values: List<BasicValue>): Unit defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter[SimpleFunctionDescriptorImpl]

'insn' @ [93:30] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.ternaryOperation[ValueParameterDescriptorImpl]

'listOf' @ [93:36] ==> public fun <T> listOf(vararg elements: BasicValue): List<BasicValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicValue

'value1' @ [93:43] ==> value-parameter value1: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.ternaryOperation[ValueParameterDescriptorImpl]

'value2' @ [93:51] ==> value-parameter value2: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.ternaryOperation[ValueParameterDescriptorImpl]

'value3' @ [93:59] ==> value-parameter value3: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.ternaryOperation[ValueParameterDescriptorImpl]

'super' @ [94:16] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter[LazyClassReceiverParameterDescriptor]

'ternaryOperation' @ [94:22] ==> @Override public open fun ternaryOperation(insn: (AbstractInsnNode..AbstractInsnNode?), value1: (BasicValue..BasicValue?), value2: (BasicValue..BasicValue?), value3: (BasicValue..BasicValue?)): (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaMethodDescriptor]

'insn' @ [94:39] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.ternaryOperation[ValueParameterDescriptorImpl]

'value1' @ [94:45] ==> value-parameter value1: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.ternaryOperation[ValueParameterDescriptorImpl]

'value2' @ [94:53] ==> value-parameter value2: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.ternaryOperation[ValueParameterDescriptorImpl]

'value3' @ [94:61] ==> value-parameter value3: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.ternaryOperation[ValueParameterDescriptorImpl]

'checkRefValuesUsages' @ [98:9] ==> protected open fun checkRefValuesUsages(insn: AbstractInsnNode, values: List<BasicValue>): Unit defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter[SimpleFunctionDescriptorImpl]

'insn' @ [98:30] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'values' @ [98:36] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'super' @ [99:16] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter[LazyClassReceiverParameterDescriptor]

'naryOperation' @ [99:22] ==> @Override public open fun naryOperation(insn: (AbstractInsnNode..AbstractInsnNode?), values: (MutableList<out (BasicValue..BasicValue?)>..List<(BasicValue..BasicValue?)>?)): (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaMethodDescriptor]

'insn' @ [99:36] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'values' @ [99:42] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'values' @ [103:9] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.checkRefValuesUsages[ValueParameterDescriptorImpl]

'forEach' @ [103:16] ==> @HidesMembers public inline fun <T> Iterable<BasicValue>.forEach(action: (BasicValue) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicValue

'value' @ [104:17] ==> value-parameter value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.checkRefValuesUsages.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [105:17] ==> value-parameter value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.checkRefValuesUsages.<anonymous>[ValueParameterDescriptorImpl]

'descriptors' @ [105:23] ==> public open val descriptors: Set<ReferenceValueDescriptor> defined in org.jetbrains.kotlin.codegen.optimization.common.TaintedTrackedReferenceValue[PropertyDescriptorImpl]

'forEach' @ [105:35] ==> @HidesMembers public inline fun <T> Iterable<ReferenceValueDescriptor>.forEach(action: (ReferenceValueDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReferenceValueDescriptor

'it' @ [105:45] ==> value-parameter it: ReferenceValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.checkRefValuesUsages.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'onUseAsTainted' @ [105:48] ==> public abstract fun onUseAsTainted(): Unit defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceValueDescriptor[SimpleFunctionDescriptorImpl]

'values' @ [109:9] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.checkRefValuesUsages[ValueParameterDescriptorImpl]

'forEachIndexed' @ [109:16] ==> public inline fun <T> Iterable<BasicValue>.forEachIndexed(action: (index: Int, BasicValue) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicValue

'value' @ [110:17] ==> value-parameter value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.checkRefValuesUsages.<anonymous>[ValueParameterDescriptorImpl]

'processRefValueUsage' @ [111:17] ==> protected abstract fun processRefValueUsage(value: TrackedReferenceValue, insn: AbstractInsnNode, position: Int): Unit defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter[SimpleFunctionDescriptorImpl]

'value' @ [111:38] ==> value-parameter value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.checkRefValuesUsages.<anonymous>[ValueParameterDescriptorImpl]

'insn' @ [111:45] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.checkRefValuesUsages[ValueParameterDescriptorImpl]

'pos' @ [111:51] ==> value-parameter pos: Int defined in org.jetbrains.kotlin.codegen.optimization.common.ReferenceTrackingInterpreter.checkRefValuesUsages.<anonymous>[ValueParameterDescriptorImpl]

