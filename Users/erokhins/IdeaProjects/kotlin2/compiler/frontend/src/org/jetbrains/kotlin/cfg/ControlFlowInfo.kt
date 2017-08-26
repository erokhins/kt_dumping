'empty' @ [27:83] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> empty(): (HashMap<(VariableDescriptor..VariableDescriptor?), (D..D?)>..HashMap<(VariableDescriptor..VariableDescriptor?), (D..D?)>?) defined in javaslang.collection.HashMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)
    <V : (Any..Any?)> -> (D..D?)

'map' @ [28:44] ==> value-parameter map: ImmutableMap<VariableDescriptor, D> /* = Map<VariableDescriptor, D> */ = ... defined in org.jetbrains.kotlin.cfg.ControlFlowInfo.<init>[ValueParameterDescriptorImpl]

'put' @ [31:62] ==> public final fun put(key: VariableDescriptor, value: D, oldValue: D?): S defined in org.jetbrains.kotlin.cfg.ControlFlowInfo[SimpleFunctionDescriptorImpl]

'key' @ [31:66] ==> value-parameter key: VariableDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInfo.put[ValueParameterDescriptorImpl]

'value' @ [31:71] ==> value-parameter value: D defined in org.jetbrains.kotlin.cfg.ControlFlowInfo.put[ValueParameterDescriptorImpl]

'this' @ [31:78] ==> <this> defined in org.jetbrains.kotlin.cfg.ControlFlowInfo[LazyClassReceiverParameterDescriptor]

'key' @ [31:83] ==> value-parameter key: VariableDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInfo.put[ValueParameterDescriptorImpl]

'getOrElse' @ [31:88] ==> public open fun getOrElse(p0: (D..D?)): (D..D?) defined in javaslang.control.Option[JavaMethodDescriptor]

'Suppress' @ [38:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'value' @ [40:13] ==> value-parameter value: D defined in org.jetbrains.kotlin.cfg.ControlFlowInfo.put[ValueParameterDescriptorImpl]

'oldValue' @ [40:22] ==> value-parameter oldValue: D? defined in org.jetbrains.kotlin.cfg.ControlFlowInfo.put[ValueParameterDescriptorImpl]

'this' @ [40:39] ==> <this> defined in org.jetbrains.kotlin.cfg.ControlFlowInfo[LazyClassReceiverParameterDescriptor]

'copy' @ [41:16] ==> protected abstract fun copy(newMap: ImmutableMap<VariableDescriptor, D> /* = Map<VariableDescriptor, D> */): S defined in org.jetbrains.kotlin.cfg.ControlFlowInfo[SimpleFunctionDescriptorImpl]

'map' @ [41:21] ==> protected final val map: ImmutableMap<VariableDescriptor, D> /* = Map<VariableDescriptor, D> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInfo[PropertyDescriptorImpl]

'put' @ [41:25] ==> public abstract fun put(p0: (VariableDescriptor..VariableDescriptor?), p1: (D..D?)): (Map<(VariableDescriptor..VariableDescriptor?), (D..D?)>..Map<(VariableDescriptor..VariableDescriptor?), (D..D?)>?) defined in javaslang.collection.Map[JavaMethodDescriptor]

'key' @ [41:29] ==> value-parameter key: VariableDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInfo.put[ValueParameterDescriptorImpl]

'value' @ [41:34] ==> value-parameter value: D defined in org.jetbrains.kotlin.cfg.ControlFlowInfo.put[ValueParameterDescriptorImpl]

'copy' @ [44:68] ==> protected abstract fun copy(newMap: ImmutableMap<VariableDescriptor, D> /* = Map<VariableDescriptor, D> */): S defined in org.jetbrains.kotlin.cfg.ControlFlowInfo[SimpleFunctionDescriptorImpl]

'map' @ [44:73] ==> protected final val map: ImmutableMap<VariableDescriptor, D> /* = Map<VariableDescriptor, D> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInfo[PropertyDescriptorImpl]

'removeAll' @ [44:77] ==> public abstract fun removeAll(p0: (MutableIterable<(VariableDescriptor..VariableDescriptor?)>..Iterable<(VariableDescriptor..VariableDescriptor?)>?)): (Map<(VariableDescriptor..VariableDescriptor?), (D..D?)>..Map<(VariableDescriptor..VariableDescriptor?), (D..D?)>?) defined in javaslang.collection.Map[JavaMethodDescriptor]

'map' @ [44:87] ==> protected final val map: ImmutableMap<VariableDescriptor, D> /* = Map<VariableDescriptor, D> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInfo[PropertyDescriptorImpl]

'keySet' @ [44:91] ==> public abstract fun keySet(): (Set<(VariableDescriptor..VariableDescriptor?)>..Set<(VariableDescriptor..VariableDescriptor?)>?) defined in javaslang.collection.Map[JavaMethodDescriptor]

'filterNot' @ [44:100] ==> public inline fun <T> Iterable<(VariableDescriptor..VariableDescriptor?)>.filterNot(predicate: ((VariableDescriptor..VariableDescriptor?)) -> Boolean): List<(VariableDescriptor..VariableDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)

'predicate' @ [44:110] ==> value-parameter predicate: (VariableDescriptor) -> Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInfo.retainAll[ValueParameterDescriptorImpl]

'map' @ [46:40] ==> protected final val map: ImmutableMap<VariableDescriptor, D> /* = Map<VariableDescriptor, D> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInfo[PropertyDescriptorImpl]

'other' @ [46:48] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.cfg.ControlFlowInfo.equals[ValueParameterDescriptorImpl]

'map' @ [46:82] ==> protected final val map: Map<VariableDescriptor, out Any?> defined in org.jetbrains.kotlin.cfg.ControlFlowInfo[PropertyDescriptorImpl]

'map' @ [48:31] ==> protected final val map: ImmutableMap<VariableDescriptor, D> /* = Map<VariableDescriptor, D> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInfo[PropertyDescriptorImpl]

'hashCode' @ [48:35] ==> public open fun hashCode(): Int defined in javaslang.collection.Map[DeserializedSimpleFunctionDescriptor]

'map' @ [50:31] ==> protected final val map: ImmutableMap<VariableDescriptor, D> /* = Map<VariableDescriptor, D> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInfo[PropertyDescriptorImpl]

'toString' @ [50:35] ==> public open fun toString(): String defined in javaslang.collection.Map[DeserializedSimpleFunctionDescriptor]

'_1' @ [53:49] ==> public open fun _1(): (T..T?) defined in javaslang.Tuple2[JavaMethodDescriptor]

'_2' @ [54:49] ==> public open fun _2(): (T..T?) defined in javaslang.Tuple2[JavaMethodDescriptor]

'this' @ [56:53] ==> <this> defined in org.jetbrains.kotlin.cfg.getOrNull[ReceiverParameterDescriptorImpl]

'k' @ [56:58] ==> value-parameter k: K defined in org.jetbrains.kotlin.cfg.getOrNull[ValueParameterDescriptorImpl]

'getOrElse' @ [56:61] ==> public open fun getOrElse(p0: (V..V?)): (V..V?) defined in javaslang.control.Option[JavaMethodDescriptor]

'empty' @ [58:110] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> empty(): (HashMap<(VariableDescriptor..VariableDescriptor?), (VariableControlFlowState..VariableControlFlowState?)>..HashMap<(VariableDescriptor..VariableDescriptor?), (VariableControlFlowState..VariableControlFlowState?)>?) defined in javaslang.collection.HashMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.cfg.VariableControlFlowState..org.jetbrains.kotlin.cfg.VariableControlFlowState?)

'ControlFlowInfo<InitControlFlowInfo, VariableControlFlowState>' @ [59:9] ==> internal constructor ControlFlowInfo<S : ControlFlowInfo<InitControlFlowInfo, VariableControlFlowState>, D>(map: ImmutableMap<VariableDescriptor, VariableControlFlowState> /* = Map<VariableDescriptor, VariableControlFlowState> */ = ...) defined in org.jetbrains.kotlin.cfg.ControlFlowInfo[ClassConstructorDescriptorImpl]
Inferred types:
    <S : ControlFlowInfo<S, D>> -> InitControlFlowInfo
    <D> -> VariableControlFlowState

'map' @ [59:72] ==> value-parameter map: ImmutableMap<VariableDescriptor, VariableControlFlowState> /* = Map<VariableDescriptor, VariableControlFlowState> */ = ... defined in org.jetbrains.kotlin.cfg.InitControlFlowInfo.<init>[ValueParameterDescriptorImpl]

'InitControlFlowInfo' @ [60:93] ==> public constructor InitControlFlowInfo(map: ImmutableMap<VariableDescriptor, VariableControlFlowState> /* = Map<VariableDescriptor, VariableControlFlowState> */ = ...) defined in org.jetbrains.kotlin.cfg.InitControlFlowInfo[ClassConstructorDescriptorImpl]

'newMap' @ [60:113] ==> value-parameter newMap: ImmutableMap<VariableDescriptor, VariableControlFlowState> /* = Map<VariableDescriptor, VariableControlFlowState> */ defined in org.jetbrains.kotlin.cfg.InitControlFlowInfo.copy[ValueParameterDescriptorImpl]

'component1' @ [66:15] ==> public operator fun <T> Tuple2<(VariableDescriptor..VariableDescriptor?), *>.component1(): (VariableDescriptor..VariableDescriptor?) defined in org.jetbrains.kotlin.cfg[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)

'component2' @ [66:20] ==> public operator fun <T> Tuple2<*, (VariableControlFlowState..VariableControlFlowState?)>.component2(): (VariableControlFlowState..VariableControlFlowState?) defined in org.jetbrains.kotlin.cfg[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (org.jetbrains.kotlin.cfg.VariableControlFlowState..org.jetbrains.kotlin.cfg.VariableControlFlowState?)

'iterator' @ [66:30] ==> public open fun iterator(): Iterator<(Tuple2<(VariableDescriptor..VariableDescriptor?), (VariableControlFlowState..VariableControlFlowState?)>..Tuple2<(VariableDescriptor..VariableDescriptor?), (VariableControlFlowState..VariableControlFlowState?)>?)> defined in org.jetbrains.kotlin.cfg.InitControlFlowInfo[JavaMethodDescriptor]

'value' @ [67:17] ==> val value: (VariableControlFlowState..VariableControlFlowState?) defined in org.jetbrains.kotlin.cfg.InitControlFlowInfo.checkDefiniteInitializationInWhen[LocalVariableDescriptor]

'initState' @ [67:23] ==> public final val initState: InitState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[PropertyDescriptorImpl]

'INITIALIZED_EXHAUSTIVELY' @ [67:46] ==> enum entry INITIALIZED_EXHAUSTIVELY defined in org.jetbrains.kotlin.cfg.InitState[FakeCallableDescriptorForObject]

'merge' @ [68:17] ==> value-parameter merge: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.InitControlFlowInfo.checkDefiniteInitializationInWhen[ValueParameterDescriptorImpl]

'getOrNull' @ [68:23] ==> public fun <K, V> ImmutableMap<VariableDescriptor, VariableControlFlowState> /* = Map<VariableDescriptor, VariableControlFlowState> */.getOrNull(k: VariableDescriptor): VariableControlFlowState? defined in org.jetbrains.kotlin.cfg[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> VariableDescriptor
    <V> -> VariableControlFlowState

'key' @ [68:33] ==> val key: (VariableDescriptor..VariableDescriptor?) defined in org.jetbrains.kotlin.cfg.InitControlFlowInfo.checkDefiniteInitializationInWhen[LocalVariableDescriptor]

'initState' @ [68:39] ==> public final val initState: InitState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[PropertyDescriptorImpl]

'INITIALIZED' @ [68:62] ==> enum entry INITIALIZED defined in org.jetbrains.kotlin.cfg.InitState[FakeCallableDescriptorForObject]

'empty' @ [76:101] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> empty(): (HashMap<(VariableDescriptor..VariableDescriptor?), (VariableUseState..VariableUseState?)>..HashMap<(VariableDescriptor..VariableDescriptor?), (VariableUseState..VariableUseState?)>?) defined in javaslang.collection.HashMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.cfg.VariableUseState..org.jetbrains.kotlin.cfg.VariableUseState?)

'ControlFlowInfo<UseControlFlowInfo, VariableUseState>' @ [77:9] ==> internal constructor ControlFlowInfo<S : ControlFlowInfo<UseControlFlowInfo, VariableUseState>, D>(map: ImmutableMap<VariableDescriptor, VariableUseState> /* = Map<VariableDescriptor, VariableUseState> */ = ...) defined in org.jetbrains.kotlin.cfg.ControlFlowInfo[ClassConstructorDescriptorImpl]
Inferred types:
    <S : ControlFlowInfo<S, D>> -> UseControlFlowInfo
    <D> -> VariableUseState

'map' @ [77:63] ==> value-parameter map: ImmutableMap<VariableDescriptor, VariableUseState> /* = Map<VariableDescriptor, VariableUseState> */ = ... defined in org.jetbrains.kotlin.cfg.UseControlFlowInfo.<init>[ValueParameterDescriptorImpl]

'UseControlFlowInfo' @ [78:85] ==> public constructor UseControlFlowInfo(map: ImmutableMap<VariableDescriptor, VariableUseState> /* = Map<VariableDescriptor, VariableUseState> */ = ...) defined in org.jetbrains.kotlin.cfg.UseControlFlowInfo[ClassConstructorDescriptorImpl]

'newMap' @ [78:104] ==> value-parameter newMap: ImmutableMap<VariableDescriptor, VariableUseState> /* = Map<VariableDescriptor, VariableUseState> */ defined in org.jetbrains.kotlin.cfg.UseControlFlowInfo.copy[ValueParameterDescriptorImpl]

'' @ [83:16] ==> private constructor InitState(s: String) defined in org.jetbrains.kotlin.cfg.InitState[ClassConstructorDescriptorImpl]

'' @ [85:29] ==> private constructor InitState(s: String) defined in org.jetbrains.kotlin.cfg.InitState[ClassConstructorDescriptorImpl]

'' @ [87:12] ==> private constructor InitState(s: String) defined in org.jetbrains.kotlin.cfg.InitState[ClassConstructorDescriptorImpl]

'' @ [89:20] ==> private constructor InitState(s: String) defined in org.jetbrains.kotlin.cfg.InitState[ClassConstructorDescriptorImpl]

'this' @ [95:13] ==> <this> defined in org.jetbrains.kotlin.cfg.InitState[LazyClassReceiverParameterDescriptor]

'other' @ [95:21] ==> value-parameter other: InitState defined in org.jetbrains.kotlin.cfg.InitState.merge[ValueParameterDescriptorImpl]

'other' @ [95:30] ==> value-parameter other: InitState defined in org.jetbrains.kotlin.cfg.InitState.merge[ValueParameterDescriptorImpl]

'INITIALIZED_EXHAUSTIVELY' @ [95:39] ==> enum entry INITIALIZED_EXHAUSTIVELY defined in org.jetbrains.kotlin.cfg.InitState[FakeCallableDescriptorForObject]

'this' @ [95:72] ==> <this> defined in org.jetbrains.kotlin.cfg.InitState[LazyClassReceiverParameterDescriptor]

'this' @ [96:13] ==> <this> defined in org.jetbrains.kotlin.cfg.InitState[LazyClassReceiverParameterDescriptor]

'INITIALIZED_EXHAUSTIVELY' @ [96:21] ==> enum entry INITIALIZED_EXHAUSTIVELY defined in org.jetbrains.kotlin.cfg.InitState[FakeCallableDescriptorForObject]

'other' @ [96:54] ==> value-parameter other: InitState defined in org.jetbrains.kotlin.cfg.InitState.merge[ValueParameterDescriptorImpl]

'UNKNOWN' @ [97:16] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.cfg.InitState[FakeCallableDescriptorForObject]

's' @ [100:31] ==> private final val s: String defined in org.jetbrains.kotlin.cfg.InitState[PropertyDescriptorImpl]

'initState' @ [105:44] ==> public final val initState: InitState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[PropertyDescriptorImpl]

'INITIALIZED' @ [105:67] ==> enum entry INITIALIZED defined in org.jetbrains.kotlin.cfg.InitState[FakeCallableDescriptorForObject]

'initState' @ [107:39] ==> public final val initState: InitState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[PropertyDescriptorImpl]

'NOT_INITIALIZED' @ [107:62] ==> enum entry NOT_INITIALIZED defined in org.jetbrains.kotlin.cfg.InitState[FakeCallableDescriptorForObject]

'initState' @ [110:13] ==> public final val initState: InitState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[PropertyDescriptorImpl]

'NOT_INITIALIZED' @ [110:36] ==> enum entry NOT_INITIALIZED defined in org.jetbrains.kotlin.cfg.InitState[FakeCallableDescriptorForObject]

'!' @ [110:55] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isDeclared' @ [110:56] ==> public final val isDeclared: Boolean defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[PropertyDescriptorImpl]

'initState' @ [111:18] ==> public final val initState: InitState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[PropertyDescriptorImpl]

'if (isDeclared) "D" else ""' @ [111:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isDeclared' @ [111:33] ==> public final val isDeclared: Boolean defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[PropertyDescriptorImpl]

'VariableControlFlowState' @ [116:29] ==> private constructor VariableControlFlowState(initState: InitState, isDeclared: Boolean) defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[ClassConstructorDescriptorImpl]

'INITIALIZED' @ [116:64] ==> enum entry INITIALIZED defined in org.jetbrains.kotlin.cfg.InitState[FakeCallableDescriptorForObject]

'VariableControlFlowState' @ [117:29] ==> private constructor VariableControlFlowState(initState: InitState, isDeclared: Boolean) defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[ClassConstructorDescriptorImpl]

'INITIALIZED' @ [117:64] ==> enum entry INITIALIZED defined in org.jetbrains.kotlin.cfg.InitState[FakeCallableDescriptorForObject]

'VariableControlFlowState' @ [118:29] ==> private constructor VariableControlFlowState(initState: InitState, isDeclared: Boolean) defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[ClassConstructorDescriptorImpl]

'INITIALIZED_EXHAUSTIVELY' @ [118:64] ==> enum entry INITIALIZED_EXHAUSTIVELY defined in org.jetbrains.kotlin.cfg.InitState[FakeCallableDescriptorForObject]

'VariableControlFlowState' @ [119:29] ==> private constructor VariableControlFlowState(initState: InitState, isDeclared: Boolean) defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[ClassConstructorDescriptorImpl]

'INITIALIZED_EXHAUSTIVELY' @ [119:64] ==> enum entry INITIALIZED_EXHAUSTIVELY defined in org.jetbrains.kotlin.cfg.InitState[FakeCallableDescriptorForObject]

'VariableControlFlowState' @ [120:29] ==> private constructor VariableControlFlowState(initState: InitState, isDeclared: Boolean) defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[ClassConstructorDescriptorImpl]

'UNKNOWN' @ [120:64] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.cfg.InitState[FakeCallableDescriptorForObject]

'VariableControlFlowState' @ [121:29] ==> private constructor VariableControlFlowState(initState: InitState, isDeclared: Boolean) defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[ClassConstructorDescriptorImpl]

'UNKNOWN' @ [121:64] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.cfg.InitState[FakeCallableDescriptorForObject]

'VariableControlFlowState' @ [122:29] ==> private constructor VariableControlFlowState(initState: InitState, isDeclared: Boolean) defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[ClassConstructorDescriptorImpl]

'NOT_INITIALIZED' @ [122:64] ==> enum entry NOT_INITIALIZED defined in org.jetbrains.kotlin.cfg.InitState[FakeCallableDescriptorForObject]

'VariableControlFlowState' @ [123:29] ==> private constructor VariableControlFlowState(initState: InitState, isDeclared: Boolean) defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[ClassConstructorDescriptorImpl]

'NOT_INITIALIZED' @ [123:64] ==> enum entry NOT_INITIALIZED defined in org.jetbrains.kotlin.cfg.InitState[FakeCallableDescriptorForObject]

'when (initState) {
                InitState.INITIALIZED -> if (isDeclared) VS_IT else VS_IF
                InitState.INITIALIZED_EXHAUSTIVELY -> if (isDeclared) VS_ET else VS_EF
                InitState.UNKNOWN -> if (isDeclared) VS_UT else VS_UF
                InitState.NOT_INITIALIZED -> if (isDeclared) VS_NT else VS_NF
            }' @ [126:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: VariableControlFlowState, entry1: VariableControlFlowState, entry2: VariableControlFlowState, entry3: VariableControlFlowState): VariableControlFlowState[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> VariableControlFlowState

'initState' @ [126:19] ==> value-parameter initState: InitState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion.create[ValueParameterDescriptorImpl]

'INITIALIZED' @ [127:27] ==> enum entry INITIALIZED defined in org.jetbrains.kotlin.cfg.InitState[FakeCallableDescriptorForObject]

'if (isDeclared) VS_IT else VS_IF' @ [127:42] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: VariableControlFlowState, elseBranch: VariableControlFlowState): VariableControlFlowState[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> VariableControlFlowState

'isDeclared' @ [127:46] ==> value-parameter isDeclared: Boolean defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion.create[ValueParameterDescriptorImpl]

'VS_IT' @ [127:58] ==> private final val VS_IT: VariableControlFlowState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion[PropertyDescriptorImpl]

'VS_IF' @ [127:69] ==> private final val VS_IF: VariableControlFlowState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion[PropertyDescriptorImpl]

'INITIALIZED_EXHAUSTIVELY' @ [128:27] ==> enum entry INITIALIZED_EXHAUSTIVELY defined in org.jetbrains.kotlin.cfg.InitState[FakeCallableDescriptorForObject]

'if (isDeclared) VS_ET else VS_EF' @ [128:55] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: VariableControlFlowState, elseBranch: VariableControlFlowState): VariableControlFlowState[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> VariableControlFlowState

'isDeclared' @ [128:59] ==> value-parameter isDeclared: Boolean defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion.create[ValueParameterDescriptorImpl]

'VS_ET' @ [128:71] ==> private final val VS_ET: VariableControlFlowState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion[PropertyDescriptorImpl]

'VS_EF' @ [128:82] ==> private final val VS_EF: VariableControlFlowState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion[PropertyDescriptorImpl]

'UNKNOWN' @ [129:27] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.cfg.InitState[FakeCallableDescriptorForObject]

'if (isDeclared) VS_UT else VS_UF' @ [129:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: VariableControlFlowState, elseBranch: VariableControlFlowState): VariableControlFlowState[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> VariableControlFlowState

'isDeclared' @ [129:42] ==> value-parameter isDeclared: Boolean defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion.create[ValueParameterDescriptorImpl]

'VS_UT' @ [129:54] ==> private final val VS_UT: VariableControlFlowState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion[PropertyDescriptorImpl]

'VS_UF' @ [129:65] ==> private final val VS_UF: VariableControlFlowState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion[PropertyDescriptorImpl]

'NOT_INITIALIZED' @ [130:27] ==> enum entry NOT_INITIALIZED defined in org.jetbrains.kotlin.cfg.InitState[FakeCallableDescriptorForObject]

'if (isDeclared) VS_NT else VS_NF' @ [130:46] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: VariableControlFlowState, elseBranch: VariableControlFlowState): VariableControlFlowState[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> VariableControlFlowState

'isDeclared' @ [130:50] ==> value-parameter isDeclared: Boolean defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion.create[ValueParameterDescriptorImpl]

'VS_NT' @ [130:62] ==> private final val VS_NT: VariableControlFlowState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion[PropertyDescriptorImpl]

'VS_NF' @ [130:73] ==> private final val VS_NF: VariableControlFlowState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion[PropertyDescriptorImpl]

'create' @ [134:17] ==> public final fun create(initState: InitState, isDeclared: Boolean): VariableControlFlowState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion[SimpleFunctionDescriptorImpl]

'INITIALIZED_EXHAUSTIVELY' @ [134:34] ==> enum entry INITIALIZED_EXHAUSTIVELY defined in org.jetbrains.kotlin.cfg.InitState[FakeCallableDescriptorForObject]

'isDeclared' @ [134:60] ==> value-parameter isDeclared: Boolean defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion.createInitializedExhaustively[ValueParameterDescriptorImpl]

'create' @ [137:17] ==> public final fun create(initState: InitState, isDeclared: Boolean): VariableControlFlowState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion[SimpleFunctionDescriptorImpl]

'if (isInitialized) InitState.INITIALIZED else InitState.NOT_INITIALIZED' @ [137:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: InitState, elseBranch: InitState): InitState[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> InitState

'isInitialized' @ [137:28] ==> value-parameter isInitialized: Boolean defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion.create[ValueParameterDescriptorImpl]

'INITIALIZED' @ [137:53] ==> enum entry INITIALIZED defined in org.jetbrains.kotlin.cfg.InitState[FakeCallableDescriptorForObject]

'NOT_INITIALIZED' @ [137:80] ==> enum entry NOT_INITIALIZED defined in org.jetbrains.kotlin.cfg.InitState[FakeCallableDescriptorForObject]

'isDeclared' @ [137:97] ==> value-parameter isDeclared: Boolean = ... defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion.create[ValueParameterDescriptorImpl]

'create' @ [140:17] ==> public final fun create(isInitialized: Boolean, isDeclared: Boolean = ...): VariableControlFlowState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion[SimpleFunctionDescriptorImpl]

'isDeclaredHere' @ [140:30] ==> value-parameter isDeclaredHere: Boolean defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion.create[ValueParameterDescriptorImpl]

'mergedEdgesData' @ [140:48] ==> value-parameter mergedEdgesData: VariableControlFlowState? defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion.create[ValueParameterDescriptorImpl]

'mergedEdgesData' @ [140:75] ==> value-parameter mergedEdgesData: VariableControlFlowState? defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion.create[ValueParameterDescriptorImpl]

'isDeclared' @ [140:91] ==> public final val isDeclared: Boolean defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[PropertyDescriptorImpl]

'' @ [145:9] ==> private constructor VariableUseState(priority: Int) defined in org.jetbrains.kotlin.cfg.VariableUseState[ClassConstructorDescriptorImpl]

'' @ [146:23] ==> private constructor VariableUseState(priority: Int) defined in org.jetbrains.kotlin.cfg.VariableUseState[ClassConstructorDescriptorImpl]

'' @ [147:28] ==> private constructor VariableUseState(priority: Int) defined in org.jetbrains.kotlin.cfg.VariableUseState[ClassConstructorDescriptorImpl]

'' @ [148:11] ==> private constructor VariableUseState(priority: Int) defined in org.jetbrains.kotlin.cfg.VariableUseState[ClassConstructorDescriptorImpl]

'variableUseState' @ [151:13] ==> value-parameter variableUseState: VariableUseState? defined in org.jetbrains.kotlin.cfg.VariableUseState.merge[ValueParameterDescriptorImpl]

'priority' @ [151:41] ==> private final val priority: Int defined in org.jetbrains.kotlin.cfg.VariableUseState[PropertyDescriptorImpl]

'variableUseState' @ [151:52] ==> value-parameter variableUseState: VariableUseState? defined in org.jetbrains.kotlin.cfg.VariableUseState.merge[ValueParameterDescriptorImpl]

'priority' @ [151:69] ==> private final val priority: Int defined in org.jetbrains.kotlin.cfg.VariableUseState[PropertyDescriptorImpl]

'this' @ [151:86] ==> <this> defined in org.jetbrains.kotlin.cfg.VariableUseState[LazyClassReceiverParameterDescriptor]

'variableUseState' @ [152:16] ==> value-parameter variableUseState: VariableUseState? defined in org.jetbrains.kotlin.cfg.VariableUseState.merge[ValueParameterDescriptorImpl]

'JvmStatic' @ [157:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'variableUseState' @ [158:68] ==> value-parameter variableUseState: VariableUseState? defined in org.jetbrains.kotlin.cfg.VariableUseState.Companion.isUsed[ValueParameterDescriptorImpl]

'variableUseState' @ [158:96] ==> value-parameter variableUseState: VariableUseState? defined in org.jetbrains.kotlin.cfg.VariableUseState.Companion.isUsed[ValueParameterDescriptorImpl]

'UNUSED' @ [158:116] ==> enum entry UNUSED defined in org.jetbrains.kotlin.cfg.VariableUseState[FakeCallableDescriptorForObject]

