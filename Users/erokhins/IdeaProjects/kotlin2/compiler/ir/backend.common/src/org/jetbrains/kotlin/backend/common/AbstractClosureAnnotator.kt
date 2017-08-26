'mutableSetOf' @ [38:30] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<ValueDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueDescriptor

'Closure' @ [40:30] ==> public constructor Closure(capturedValues: List<ValueDescriptor>) defined in org.jetbrains.kotlin.backend.common.Closure[ClassConstructorDescriptorImpl]

'capturedValues' @ [40:38] ==> public final val capturedValues: MutableSet<ValueDescriptor> defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.ClosureBuilder[PropertyDescriptorImpl]

'toList' @ [40:53] ==> public fun <T> Iterable<ValueDescriptor>.toList(): List<ValueDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueDescriptor

'fillInNestedClosure' @ [43:13] ==> private final fun <T : CallableDescriptor> fillInNestedClosure(destination: MutableSet<ValueDescriptor>, nested: List<ValueDescriptor>): Unit defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.ClosureBuilder[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : CallableDescriptor> -> ValueDescriptor

'capturedValues' @ [43:33] ==> public final val capturedValues: MutableSet<ValueDescriptor> defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.ClosureBuilder[PropertyDescriptorImpl]

'closure' @ [43:49] ==> value-parameter closure: Closure defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.ClosureBuilder.addNested[ValueParameterDescriptorImpl]

'capturedValues' @ [43:57] ==> public final val capturedValues: List<ValueDescriptor> defined in org.jetbrains.kotlin.backend.common.Closure[PropertyDescriptorImpl]

'nested' @ [47:13] ==> value-parameter nested: List<T> defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.ClosureBuilder.fillInNestedClosure[ValueParameterDescriptorImpl]

'filterTo' @ [47:20] ==> public inline fun <T, C : MutableCollection<in T>> Iterable<T>.filterTo(destination: MutableSet<T>, predicate: (T) -> Boolean): MutableSet<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T
    <C : MutableCollection<in T>> -> MutableSet<T>

'destination' @ [47:29] ==> value-parameter destination: MutableSet<T> defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.ClosureBuilder.fillInNestedClosure[ValueParameterDescriptorImpl]

'it' @ [48:17] ==> value-parameter it: T defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.ClosureBuilder.fillInNestedClosure.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [48:20] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'owner' @ [48:45] ==> public final val owner: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.ClosureBuilder[PropertyDescriptorImpl]

'ArrayDeque' @ [53:33] ==> public constructor ArrayDeque<E : (Any..Any?)>() defined in java.util.ArrayDeque[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ClosureBuilder

'element' @ [56:9] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitElement[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [56:17] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [56:36] ==> <this> defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator[LazyClassReceiverParameterDescriptor]

'declaration' @ [60:31] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitClass[ValueParameterDescriptorImpl]

'descriptor' @ [60:43] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'ClosureBuilder' @ [61:30] ==> public constructor ClosureBuilder(owner: DeclarationDescriptor) defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.ClosureBuilder[ClassConstructorDescriptorImpl]

'classDescriptor' @ [61:45] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitClass[LocalVariableDescriptor]

'closuresStack' @ [63:9] ==> private final val closuresStack: ArrayDeque<AbstractClosureAnnotator.ClosureBuilder> defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator[PropertyDescriptorImpl]

'push' @ [63:23] ==> public open fun push(p0: (AbstractClosureAnnotator.ClosureBuilder..AbstractClosureAnnotator.ClosureBuilder?)): Unit defined in java.util.ArrayDeque[JavaMethodDescriptor]

'closureBuilder' @ [63:28] ==> val closureBuilder: AbstractClosureAnnotator.ClosureBuilder defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitClass[LocalVariableDescriptor]

'declaration' @ [64:9] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitClass[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [64:21] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [64:40] ==> <this> defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator[LazyClassReceiverParameterDescriptor]

'closuresStack' @ [65:9] ==> private final val closuresStack: ArrayDeque<AbstractClosureAnnotator.ClosureBuilder> defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator[PropertyDescriptorImpl]

'pop' @ [65:23] ==> public open fun pop(): (AbstractClosureAnnotator.ClosureBuilder..AbstractClosureAnnotator.ClosureBuilder?) defined in java.util.ArrayDeque[JavaMethodDescriptor]

'closureBuilder' @ [67:23] ==> val closureBuilder: AbstractClosureAnnotator.ClosureBuilder defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitClass[LocalVariableDescriptor]

'buildClosure' @ [67:38] ==> public final fun buildClosure(): Closure defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.ClosureBuilder[SimpleFunctionDescriptorImpl]

'isLocal' @ [69:29] ==> public open fun isLocal(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [69:37] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitClass[LocalVariableDescriptor]

'recordClassClosure' @ [70:13] ==> protected abstract fun recordClassClosure(classDescriptor: ClassDescriptor, closure: Closure): Unit defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [70:32] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitClass[LocalVariableDescriptor]

'closure' @ [70:49] ==> val closure: Closure defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitClass[LocalVariableDescriptor]

'closuresStack' @ [73:9] ==> private final val closuresStack: ArrayDeque<AbstractClosureAnnotator.ClosureBuilder> defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator[PropertyDescriptorImpl]

'peek' @ [73:23] ==> public open fun peek(): (AbstractClosureAnnotator.ClosureBuilder..AbstractClosureAnnotator.ClosureBuilder?) defined in java.util.ArrayDeque[JavaMethodDescriptor]

'addNested' @ [73:31] ==> public final fun addNested(closure: Closure): Unit defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.ClosureBuilder[SimpleFunctionDescriptorImpl]

'closure' @ [73:41] ==> val closure: Closure defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitClass[LocalVariableDescriptor]

'declaration' @ [77:34] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitFunction[ValueParameterDescriptorImpl]

'descriptor' @ [77:46] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'ClosureBuilder' @ [78:30] ==> public constructor ClosureBuilder(owner: DeclarationDescriptor) defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.ClosureBuilder[ClassConstructorDescriptorImpl]

'functionDescriptor' @ [78:45] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitFunction[LocalVariableDescriptor]

'closuresStack' @ [80:9] ==> private final val closuresStack: ArrayDeque<AbstractClosureAnnotator.ClosureBuilder> defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator[PropertyDescriptorImpl]

'push' @ [80:23] ==> public open fun push(p0: (AbstractClosureAnnotator.ClosureBuilder..AbstractClosureAnnotator.ClosureBuilder?)): Unit defined in java.util.ArrayDeque[JavaMethodDescriptor]

'closureBuilder' @ [80:28] ==> val closureBuilder: AbstractClosureAnnotator.ClosureBuilder defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitFunction[LocalVariableDescriptor]

'declaration' @ [81:9] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitFunction[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [81:21] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [81:40] ==> <this> defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator[LazyClassReceiverParameterDescriptor]

'closuresStack' @ [82:9] ==> private final val closuresStack: ArrayDeque<AbstractClosureAnnotator.ClosureBuilder> defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator[PropertyDescriptorImpl]

'pop' @ [82:23] ==> public open fun pop(): (AbstractClosureAnnotator.ClosureBuilder..AbstractClosureAnnotator.ClosureBuilder?) defined in java.util.ArrayDeque[JavaMethodDescriptor]

'closureBuilder' @ [84:23] ==> val closureBuilder: AbstractClosureAnnotator.ClosureBuilder defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitFunction[LocalVariableDescriptor]

'buildClosure' @ [84:38] ==> public final fun buildClosure(): Closure defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.ClosureBuilder[SimpleFunctionDescriptorImpl]

'isLocal' @ [86:29] ==> public open fun isLocal(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'functionDescriptor' @ [86:37] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitFunction[LocalVariableDescriptor]

'recordFunctionClosure' @ [87:13] ==> protected abstract fun recordFunctionClosure(functionDescriptor: FunctionDescriptor, closure: Closure): Unit defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [87:35] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitFunction[LocalVariableDescriptor]

'closure' @ [87:55] ==> val closure: Closure defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitFunction[LocalVariableDescriptor]

'closuresStack' @ [90:9] ==> private final val closuresStack: ArrayDeque<AbstractClosureAnnotator.ClosureBuilder> defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator[PropertyDescriptorImpl]

'peek' @ [90:23] ==> public open fun peek(): (AbstractClosureAnnotator.ClosureBuilder..AbstractClosureAnnotator.ClosureBuilder?) defined in java.util.ArrayDeque[JavaMethodDescriptor]

'addNested' @ [90:31] ==> public final fun addNested(closure: Closure): Unit defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.ClosureBuilder[SimpleFunctionDescriptorImpl]

'closure' @ [90:41] ==> val closure: Closure defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitFunction[LocalVariableDescriptor]

'declaration' @ [95:9] ==> value-parameter declaration: IrLocalDelegatedProperty defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitLocalDelegatedProperty[ValueParameterDescriptorImpl]

'delegate' @ [95:21] ==> public abstract var delegate: IrVariable defined in org.jetbrains.kotlin.ir.declarations.IrLocalDelegatedProperty[DeserializedPropertyDescriptor]

'initializer' @ [95:30] ==> public abstract var initializer: IrExpression? defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'acceptVoid' @ [95:43] ==> public fun IrElement.acceptVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [95:54] ==> <this> defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator[LazyClassReceiverParameterDescriptor]

'closuresStack' @ [99:30] ==> private final val closuresStack: ArrayDeque<AbstractClosureAnnotator.ClosureBuilder> defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator[PropertyDescriptorImpl]

'peek' @ [99:44] ==> public open fun peek(): (AbstractClosureAnnotator.ClosureBuilder..AbstractClosureAnnotator.ClosureBuilder?) defined in java.util.ArrayDeque[JavaMethodDescriptor]

'expression' @ [101:34] ==> value-parameter expression: IrValueAccessExpression defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitVariableAccess[ValueParameterDescriptorImpl]

'descriptor' @ [101:45] ==> public abstract val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrValueAccessExpression[DeserializedPropertyDescriptor]

'variableDescriptor' @ [102:13] ==> val variableDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitVariableAccess[LocalVariableDescriptor]

'containingDeclaration' @ [102:32] ==> public final val ValueDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'closureBuilder' @ [102:57] ==> val closureBuilder: AbstractClosureAnnotator.ClosureBuilder defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitVariableAccess[LocalVariableDescriptor]

'owner' @ [102:72] ==> public final val owner: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.ClosureBuilder[PropertyDescriptorImpl]

'closureBuilder' @ [103:13] ==> val closureBuilder: AbstractClosureAnnotator.ClosureBuilder defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitVariableAccess[LocalVariableDescriptor]

'capturedValues' @ [103:28] ==> public final val capturedValues: MutableSet<ValueDescriptor> defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.ClosureBuilder[PropertyDescriptorImpl]

'add' @ [103:43] ==> public abstract fun add(element: ValueDescriptor): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'variableDescriptor' @ [103:47] ==> val variableDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitVariableAccess[LocalVariableDescriptor]

'expression' @ [106:9] ==> value-parameter expression: IrValueAccessExpression defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator.visitVariableAccess[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [106:20] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [106:39] ==> <this> defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator[LazyClassReceiverParameterDescriptor]

