'!' @ [38:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'irFunction' @ [38:10] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls[ValueParameterDescriptorImpl]

'descriptor' @ [38:21] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'isTailrec' @ [38:32] ==> public final val FunctionDescriptor.isTailrec: Boolean[MyPropertyDescriptor]

'emptySet' @ [39:16] ==> public fun <T> emptySet(): Set<IrCall> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrCall

'mutableSetOf' @ [42:18] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<IrCall> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrCall

'NOT_SURE' @ [47:41] ==> enum entry NOT_SURE defined in org.jetbrains.kotlin.backend.common.ElementKind[FakeCallableDescriptorForObject]

'element' @ [48:13] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'acceptChildren' @ [48:21] ==> public abstract fun <D> acceptChildren(visitor: IrElementVisitor<Unit, ElementKind>, data: ElementKind): Unit defined in org.jetbrains.kotlin.ir.IrElement[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D> -> ElementKind

'this' @ [48:36] ==> <this> defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>[LazyClassReceiverParameterDescriptor]

'childKind' @ [48:42] ==> val childKind: ElementKind defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>.visitElement[LocalVariableDescriptor]

'if (expression.returnTarget == irFunction.descriptor) {
                ElementKind.TAIL_STATEMENT
            } else {
                ElementKind.NOT_SURE
            }' @ [65:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ElementKind, elseBranch: ElementKind): ElementKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ElementKind

'expression' @ [65:33] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>.visitReturn[ValueParameterDescriptorImpl]

'returnTarget' @ [65:44] ==> public abstract val returnTarget: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'irFunction' @ [65:60] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls[ValueParameterDescriptorImpl]

'descriptor' @ [65:71] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'TAIL_STATEMENT' @ [66:29] ==> enum entry TAIL_STATEMENT defined in org.jetbrains.kotlin.backend.common.ElementKind[FakeCallableDescriptorForObject]

'NOT_SURE' @ [68:29] ==> enum entry NOT_SURE defined in org.jetbrains.kotlin.backend.common.ElementKind[FakeCallableDescriptorForObject]

'expression' @ [70:13] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>.visitReturn[ValueParameterDescriptorImpl]

'value' @ [70:24] ==> public abstract var value: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'accept' @ [70:30] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, ElementKind>, data: ElementKind): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit
    <D> -> ElementKind

'this' @ [70:37] ==> <this> defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>[LazyClassReceiverParameterDescriptor]

'valueKind' @ [70:43] ==> val valueKind: ElementKind defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>.visitReturn[LocalVariableDescriptor]

'expression' @ [74:13] ==> value-parameter expression: IrContainerExpression defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>.visitContainerExpression[ValueParameterDescriptorImpl]

'statements' @ [74:24] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrContainerExpression[DeserializedPropertyDescriptor]

'forEachIndexed' @ [74:35] ==> public inline fun <T> Iterable<IrStatement>.forEachIndexed(action: (index: Int, IrStatement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatement

'if (index == expression.statements.lastIndex) {
                    // The last statement defines the result of the container expression, so it has the same kind.
                    data
                } else {
                    ElementKind.NOT_SURE
                }' @ [75:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ElementKind, elseBranch: ElementKind): ElementKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ElementKind

'index' @ [75:41] ==> value-parameter index: Int defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>.visitContainerExpression.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [75:50] ==> value-parameter expression: IrContainerExpression defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>.visitContainerExpression[ValueParameterDescriptorImpl]

'statements' @ [75:61] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrContainerExpression[DeserializedPropertyDescriptor]

'lastIndex' @ [75:72] ==> public val <T> List<IrStatement>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IrStatement

'data' @ [77:21] ==> value-parameter data: ElementKind defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>.visitContainerExpression[ValueParameterDescriptorImpl]

'NOT_SURE' @ [79:33] ==> enum entry NOT_SURE defined in org.jetbrains.kotlin.backend.common.ElementKind[FakeCallableDescriptorForObject]

'irStatement' @ [81:17] ==> value-parameter irStatement: IrStatement defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>.visitContainerExpression.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [81:29] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, ElementKind>, data: ElementKind): Unit defined in org.jetbrains.kotlin.ir.IrStatement[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit
    <D> -> ElementKind

'this' @ [81:36] ==> <this> defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>[LazyClassReceiverParameterDescriptor]

'statementKind' @ [81:42] ==> val statementKind: ElementKind defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>.visitContainerExpression.<anonymous>[LocalVariableDescriptor]

'expression' @ [86:13] ==> value-parameter expression: IrWhen defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>.visitWhen[ValueParameterDescriptorImpl]

'branches' @ [86:24] ==> public abstract val branches: MutableList<IrBranch> defined in org.jetbrains.kotlin.ir.expressions.IrWhen[DeserializedPropertyDescriptor]

'forEach' @ [86:33] ==> @HidesMembers public inline fun <T> Iterable<IrBranch>.forEach(action: (IrBranch) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrBranch

'it' @ [87:17] ==> value-parameter it: IrBranch defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>.visitWhen.<anonymous>[ValueParameterDescriptorImpl]

'condition' @ [87:20] ==> public abstract var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrBranch[DeserializedPropertyDescriptor]

'accept' @ [87:30] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, ElementKind>, data: ElementKind): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit
    <D> -> ElementKind

'this' @ [87:37] ==> <this> defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>[LazyClassReceiverParameterDescriptor]

'NOT_SURE' @ [87:55] ==> enum entry NOT_SURE defined in org.jetbrains.kotlin.backend.common.ElementKind[FakeCallableDescriptorForObject]

'it' @ [88:17] ==> value-parameter it: IrBranch defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>.visitWhen.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [88:20] ==> public abstract var result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrBranch[DeserializedPropertyDescriptor]

'accept' @ [88:27] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, ElementKind>, data: ElementKind): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit
    <D> -> ElementKind

'this' @ [88:34] ==> <this> defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>[LazyClassReceiverParameterDescriptor]

'data' @ [88:40] ==> value-parameter data: ElementKind defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>.visitWhen[ValueParameterDescriptorImpl]

'expression' @ [93:13] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'acceptChildren' @ [93:24] ==> public abstract fun <D> acceptChildren(visitor: IrElementVisitor<Unit, ElementKind>, data: ElementKind): Unit defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D> -> ElementKind

'this' @ [93:39] ==> <this> defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>[LazyClassReceiverParameterDescriptor]

'NOT_SURE' @ [93:57] ==> enum entry NOT_SURE defined in org.jetbrains.kotlin.backend.common.ElementKind[FakeCallableDescriptorForObject]

'data' @ [96:17] ==> value-parameter data: ElementKind defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'TAIL_STATEMENT' @ [96:37] ==> enum entry TAIL_STATEMENT defined in org.jetbrains.kotlin.backend.common.ElementKind[FakeCallableDescriptorForObject]

'expression' @ [101:17] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'descriptor' @ [101:28] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'original' @ [101:39] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'irFunction' @ [101:51] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls[ValueParameterDescriptorImpl]

'descriptor' @ [101:62] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'isOverride' @ [106:33] ==> public open fun isOverride(@NotNull p0: CallableMemberDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'irFunction' @ [106:44] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls[ValueParameterDescriptorImpl]

'descriptor' @ [106:55] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'expression' @ [106:70] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'usesDefaultArguments' @ [106:81] ==> public fun IrCall.usesDefaultArguments(): Boolean defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[SimpleFunctionDescriptorImpl]

'expression' @ [111:13] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [111:24] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'let' @ [111:42] ==> @InlineOnly public inline fun <T, R> IrExpression.let(block: (IrExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpression
    <R> -> Unit

'it' @ [112:21] ==> value-parameter it: IrExpression defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>.visitCall.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [112:42] ==> value-parameter it: IrExpression defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>.visitCall.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [112:45] ==> public abstract val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[DeserializedPropertyDescriptor]

'irFunction' @ [112:59] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls[ValueParameterDescriptorImpl]

'descriptor' @ [112:70] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'dispatchReceiverParameter' @ [112:81] ==> public final val FunctionDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'result' @ [123:13] ==> val result: MutableSet<IrCall> defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls[LocalVariableDescriptor]

'add' @ [123:20] ==> public abstract fun add(element: IrCall): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'expression' @ [123:24] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'irFunction' @ [129:16] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls[ValueParameterDescriptorImpl]

'body' @ [129:27] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'body' @ [130:9] ==> val body: IrBody? defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls[LocalVariableDescriptor]

'emptySet' @ [131:16] ==> public fun <T> emptySet(): Set<IrCall> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrCall

'body' @ [134:5] ==> val body: IrBody? defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls[LocalVariableDescriptor]

'statements' @ [134:10] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlockBody[DeserializedPropertyDescriptor]

'forEachIndexed' @ [134:21] ==> public inline fun <T> Iterable<IrStatement>.forEachIndexed(action: (index: Int, IrStatement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatement

'if (index == body.statements.lastIndex && irFunction.descriptor.returnType?.isUnit() == true) {
            ElementKind.TAIL_STATEMENT
        } else {
            ElementKind.NOT_SURE
        }' @ [135:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ElementKind, elseBranch: ElementKind): ElementKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ElementKind

'index' @ [135:24] ==> value-parameter index: Int defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [135:33] ==> val body: IrBody? defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls[LocalVariableDescriptor]

'statements' @ [135:38] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlockBody[DeserializedPropertyDescriptor]

'lastIndex' @ [135:49] ==> public val <T> List<IrStatement>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IrStatement

'irFunction' @ [135:62] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls[ValueParameterDescriptorImpl]

'descriptor' @ [135:73] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'returnType' @ [135:84] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'isUnit' @ [135:96] ==> public fun KotlinType.isUnit(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'TAIL_STATEMENT' @ [136:25] ==> enum entry TAIL_STATEMENT defined in org.jetbrains.kotlin.backend.common.ElementKind[FakeCallableDescriptorForObject]

'NOT_SURE' @ [138:25] ==> enum entry NOT_SURE defined in org.jetbrains.kotlin.backend.common.ElementKind[FakeCallableDescriptorForObject]

'irStatement' @ [140:9] ==> value-parameter irStatement: IrStatement defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [140:21] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, ElementKind>, data: ElementKind): Unit defined in org.jetbrains.kotlin.ir.IrStatement[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit
    <D> -> ElementKind

'visitor' @ [140:28] ==> val visitor: <no name provided> defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls[LocalVariableDescriptor]

'kind' @ [140:37] ==> val kind: ElementKind defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls.<anonymous>[LocalVariableDescriptor]

'result' @ [143:12] ==> val result: MutableSet<IrCall> defined in org.jetbrains.kotlin.backend.common.collectTailRecursionCalls[LocalVariableDescriptor]

