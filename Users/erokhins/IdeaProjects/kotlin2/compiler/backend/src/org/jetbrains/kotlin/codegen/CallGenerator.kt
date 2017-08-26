'if (!callDefault) {
                callableMethod.genInvokeInstruction(codegen.v)
            }
            else {
                (callableMethod as CallableMethod).genInvokeDefaultInstruction(codegen.v)
            }' @ [43:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [43:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'callDefault' @ [43:18] ==> value-parameter callDefault: Boolean defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.genCallInner[ValueParameterDescriptorImpl]

'callableMethod' @ [44:17] ==> value-parameter callableMethod: Callable defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.genCallInner[ValueParameterDescriptorImpl]

'genInvokeInstruction' @ [44:32] ==> public abstract fun genInvokeInstruction(v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.Callable[SimpleFunctionDescriptorImpl]

'codegen' @ [44:53] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.genCallInner[ValueParameterDescriptorImpl]

'v' @ [44:61] ==> public final val v: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaPropertyDescriptor]

'callableMethod' @ [47:18] ==> value-parameter callableMethod: Callable defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.genCallInner[ValueParameterDescriptorImpl]

'genInvokeDefaultInstruction' @ [47:52] ==> public final fun genInvokeDefaultInstruction(v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.CallableMethod[SimpleFunctionDescriptorImpl]

'codegen' @ [47:80] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.genCallInner[ValueParameterDescriptorImpl]

'v' @ [47:88] ==> public final val v: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaPropertyDescriptor]

'codegen' @ [64:25] ==> private final val codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator[PropertyDescriptorImpl]

'gen' @ [64:33] ==> public open fun gen(expr: (KtElement..KtElement?)): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'argumentExpression' @ [64:37] ==> value-parameter argumentExpression: KtExpression defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.genValueAndPut[ValueParameterDescriptorImpl]

'value' @ [65:13] ==> val value: (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.genValueAndPut[LocalVariableDescriptor]

'put' @ [65:19] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'parameterType' @ [65:23] ==> value-parameter parameterType: Type defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.genValueAndPut[ValueParameterDescriptorImpl]

'codegen' @ [65:38] ==> private final val codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator[PropertyDescriptorImpl]

'v' @ [65:46] ==> public final val v: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaPropertyDescriptor]

'stackValue' @ [70:13] ==> value-parameter stackValue: StackValue defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.putCapturedValueOnStack[ValueParameterDescriptorImpl]

'put' @ [70:24] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'stackValue' @ [70:28] ==> value-parameter stackValue: StackValue defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.putCapturedValueOnStack[ValueParameterDescriptorImpl]

'type' @ [70:39] ==> @NotNull public final val type: Type defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'codegen' @ [70:45] ==> private final val codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator[PropertyDescriptorImpl]

'v' @ [70:53] ==> public final val v: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaPropertyDescriptor]

'value' @ [74:13] ==> value-parameter value: StackValue defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.putValueIfNeeded[ValueParameterDescriptorImpl]

'put' @ [74:19] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'value' @ [74:23] ==> value-parameter value: StackValue defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.putValueIfNeeded[ValueParameterDescriptorImpl]

'type' @ [74:29] ==> @NotNull public final val type: Type defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'codegen' @ [74:35] ==> private final val codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator[PropertyDescriptorImpl]

'v' @ [74:43] ==> public final val v: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaPropertyDescriptor]

'codegen' @ [78:24] ==> private final val codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator[PropertyDescriptorImpl]

'myFrameMap' @ [78:32] ==> public final val myFrameMap: (FrameMap..FrameMap?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaPropertyDescriptor]

'mark' @ [78:43] ==> public open fun mark(): (FrameMap.Mark..FrameMap.Mark?) defined in org.jetbrains.kotlin.codegen.FrameMap[JavaMethodDescriptor]

'actualArgsWithDeclIndex' @ [79:29] ==> value-parameter actualArgsWithDeclIndex: List<ArgumentAndDeclIndex> defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.reorderArgumentsIfNeeded[ValueParameterDescriptorImpl]

'withIndex' @ [79:53] ==> public fun <T> Iterable<ArgumentAndDeclIndex>.withIndex(): Iterable<IndexedValue<ArgumentAndDeclIndex>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArgumentAndDeclIndex

'dropWhile' @ [79:65] ==> public inline fun <T> Iterable<IndexedValue<ArgumentAndDeclIndex>>.dropWhile(predicate: (IndexedValue<ArgumentAndDeclIndex>) -> Boolean): List<IndexedValue<ArgumentAndDeclIndex>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<ArgumentAndDeclIndex>

'it' @ [80:17] ==> value-parameter it: IndexedValue<ArgumentAndDeclIndex> defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.reorderArgumentsIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [80:20] ==> public final val value: ArgumentAndDeclIndex defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'declIndex' @ [80:26] ==> public final val declIndex: Int defined in org.jetbrains.kotlin.codegen.ArgumentAndDeclIndex[PropertyDescriptorImpl]

'it' @ [80:39] ==> value-parameter it: IndexedValue<ArgumentAndDeclIndex> defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.reorderArgumentsIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [80:42] ==> public final val index: Int defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'reordered' @ [83:13] ==> val reordered: List<IndexedValue<ArgumentAndDeclIndex>> defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.reorderArgumentsIfNeeded[LocalVariableDescriptor]

'reversed' @ [83:23] ==> public fun <T> Iterable<IndexedValue<ArgumentAndDeclIndex>>.reversed(): List<IndexedValue<ArgumentAndDeclIndex>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<ArgumentAndDeclIndex>

'map' @ [83:34] ==> public inline fun <T, R> Iterable<IndexedValue<ArgumentAndDeclIndex>>.map(transform: (IndexedValue<ArgumentAndDeclIndex>) -> Pair<Int, StackValue.Local>): List<Pair<Int, StackValue.Local>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<ArgumentAndDeclIndex>
    <R> -> Pair<Int, Local>

'it' @ [84:44] ==> value-parameter it: IndexedValue<ArgumentAndDeclIndex> defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.reorderArgumentsIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [84:47] ==> public final val value: ArgumentAndDeclIndex defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'valueParameterTypes' @ [85:28] ==> value-parameter valueParameterTypes: List<Type> defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.reorderArgumentsIfNeeded[ValueParameterDescriptorImpl]

'get' @ [85:48] ==> public abstract operator fun get(index: Int): Type defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'argumentAndDeclIndex' @ [85:52] ==> val argumentAndDeclIndex: ArgumentAndDeclIndex defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.reorderArgumentsIfNeeded.<anonymous>[LocalVariableDescriptor]

'declIndex' @ [85:73] ==> public final val declIndex: Int defined in org.jetbrains.kotlin.codegen.ArgumentAndDeclIndex[PropertyDescriptorImpl]

'local' @ [86:45] ==> @NotNull public open fun local(index: Int, @NotNull type: Type): StackValue.Local defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'codegen' @ [86:51] ==> private final val codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator[PropertyDescriptorImpl]

'frameMap' @ [86:59] ==> public open val frameMap: FrameMap defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaPropertyDescriptor]

'enterTemp' @ [86:68] ==> public open fun enterTemp(type: (Type..Type?)): Int defined in org.jetbrains.kotlin.codegen.FrameMap[JavaMethodDescriptor]

'type' @ [86:78] ==> val type: Type defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.reorderArgumentsIfNeeded.<anonymous>[LocalVariableDescriptor]

'type' @ [86:85] ==> val type: Type defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.reorderArgumentsIfNeeded.<anonymous>[LocalVariableDescriptor]

'stackValue' @ [87:17] ==> val stackValue: StackValue.Local defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.reorderArgumentsIfNeeded.<anonymous>[LocalVariableDescriptor]

'store' @ [87:28] ==> public open fun store(@NotNull value: StackValue, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue.Local[JavaMethodDescriptor]

'onStack' @ [87:45] ==> @NotNull public open fun onStack(@NotNull type: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'type' @ [87:53] ==> val type: Type defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.reorderArgumentsIfNeeded.<anonymous>[LocalVariableDescriptor]

'codegen' @ [87:60] ==> private final val codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator[PropertyDescriptorImpl]

'v' @ [87:68] ==> public final val v: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaPropertyDescriptor]

'Pair' @ [88:17] ==> public constructor Pair<out A, out B>(first: Int, second: StackValue.Local) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Int
    <out B> -> Local

'argumentAndDeclIndex' @ [88:22] ==> val argumentAndDeclIndex: ArgumentAndDeclIndex defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.reorderArgumentsIfNeeded.<anonymous>[LocalVariableDescriptor]

'declIndex' @ [88:43] ==> public final val declIndex: Int defined in org.jetbrains.kotlin.codegen.ArgumentAndDeclIndex[PropertyDescriptorImpl]

'stackValue' @ [88:54] ==> val stackValue: StackValue.Local defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.reorderArgumentsIfNeeded.<anonymous>[LocalVariableDescriptor]

'sortedBy' @ [89:15] ==> public inline fun <T, R : Comparable<Int>> Iterable<Pair<Int, StackValue.Local>>.sortedBy(crossinline selector: (Pair<Int, StackValue.Local>) -> Int?): List<Pair<Int, StackValue.Local>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Int, Local>
    <R : Comparable<R>> -> Int

'it' @ [90:17] ==> value-parameter it: Pair<Int, StackValue.Local> defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.reorderArgumentsIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [90:20] ==> public final val first: Int defined in kotlin.Pair[DeserializedPropertyDescriptor]

'forEach' @ [91:15] ==> @HidesMembers public inline fun <T> Iterable<Pair<Int, StackValue.Local>>.forEach(action: (Pair<Int, StackValue.Local>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Int, Local>

'it' @ [92:17] ==> value-parameter it: Pair<Int, StackValue.Local> defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.reorderArgumentsIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [92:20] ==> public final val second: StackValue.Local defined in kotlin.Pair[DeserializedPropertyDescriptor]

'put' @ [92:27] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue.Local[JavaMethodDescriptor]

'valueParameterTypes' @ [92:31] ==> value-parameter valueParameterTypes: List<Type> defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.reorderArgumentsIfNeeded[ValueParameterDescriptorImpl]

'get' @ [92:51] ==> public abstract operator fun get(index: Int): Type defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'it' @ [92:55] ==> value-parameter it: Pair<Int, StackValue.Local> defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.reorderArgumentsIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [92:58] ==> public final val first: Int defined in kotlin.Pair[DeserializedPropertyDescriptor]

'codegen' @ [92:66] ==> private final val codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator[PropertyDescriptorImpl]

'v' @ [92:74] ==> public final val v: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaPropertyDescriptor]

'mark' @ [94:13] ==> val mark: (FrameMap.Mark..FrameMap.Mark?) defined in org.jetbrains.kotlin.codegen.CallGenerator.DefaultCallGenerator.reorderArgumentsIfNeeded[LocalVariableDescriptor]

'dropTo' @ [94:18] ==> public open fun dropTo(): Unit defined in org.jetbrains.kotlin.codegen.FrameMap.Mark[JavaMethodDescriptor]

'resolvedCall' @ [99:13] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.codegen.CallGenerator.genCall[ValueParameterDescriptorImpl]

'resolvedCall' @ [100:36] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.codegen.CallGenerator.genCall[ValueParameterDescriptorImpl]

'call' @ [100:49] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'calleeExpression' @ [100:54] ==> public final val Call.calleeExpression: KtExpression?[MyPropertyDescriptor]

'calleeExpression' @ [101:17] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.codegen.CallGenerator.genCall[LocalVariableDescriptor]

'codegen' @ [102:17] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.CallGenerator.genCall[ValueParameterDescriptorImpl]

'markStartLineNumber' @ [102:25] ==> public open fun markStartLineNumber(@NotNull element: KtElement): Unit defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'calleeExpression' @ [102:45] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.codegen.CallGenerator.genCall[LocalVariableDescriptor]

'genCallInner' @ [106:9] ==> public abstract fun genCallInner(callableMethod: Callable, resolvedCall: ResolvedCall<*>?, callDefault: Boolean, codegen: ExpressionCodegen): Unit defined in org.jetbrains.kotlin.codegen.CallGenerator[SimpleFunctionDescriptorImpl]

'callableMethod' @ [106:22] ==> value-parameter callableMethod: Callable defined in org.jetbrains.kotlin.codegen.CallGenerator.genCall[ValueParameterDescriptorImpl]

'resolvedCall' @ [106:38] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.codegen.CallGenerator.genCall[ValueParameterDescriptorImpl]

'callDefault' @ [106:52] ==> value-parameter callDefault: Boolean defined in org.jetbrains.kotlin.codegen.CallGenerator.genCall[ValueParameterDescriptorImpl]

'codegen' @ [106:65] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.CallGenerator.genCall[ValueParameterDescriptorImpl]

'putValueIfNeeded' @ [120:9] ==> public abstract fun putValueIfNeeded(parameterType: Type, value: StackValue, kind: ValueKind = ..., parameterIndex: Int = ...): Unit defined in org.jetbrains.kotlin.codegen.CallGenerator[SimpleFunctionDescriptorImpl]

'parameterType' @ [120:26] ==> value-parameter parameterType: Type defined in org.jetbrains.kotlin.codegen.CallGenerator.putValueIfNeeded[ValueParameterDescriptorImpl]

'value' @ [120:41] ==> value-parameter value: StackValue defined in org.jetbrains.kotlin.codegen.CallGenerator.putValueIfNeeded[ValueParameterDescriptorImpl]

'GENERAL' @ [120:58] ==> enum entry GENERAL defined in org.jetbrains.kotlin.codegen.ValueKind[FakeCallableDescriptorForObject]

'GENERAL' @ [126:41] ==> enum entry GENERAL defined in org.jetbrains.kotlin.codegen.ValueKind[FakeCallableDescriptorForObject]

'-' @ [127:35] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

