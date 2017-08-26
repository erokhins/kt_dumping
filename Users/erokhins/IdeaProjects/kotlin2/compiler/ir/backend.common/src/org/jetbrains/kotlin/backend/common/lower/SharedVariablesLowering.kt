'SharedVariablesTransformer' @ [38:9] ==> public constructor SharedVariablesTransformer(irFunction: IrFunction) defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer[ClassConstructorDescriptorImpl]

'irFunction' @ [38:36] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.lower[ValueParameterDescriptorImpl]

'lowerSharedVariables' @ [38:48] ==> public final fun lowerSharedVariables(): Unit defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer[SimpleFunctionDescriptorImpl]

'HashSet' @ [42:31] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ValueDescriptor

'collectSharedVariables' @ [45:13] ==> private final fun collectSharedVariables(): Unit defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer[SimpleFunctionDescriptorImpl]

'sharedVariables' @ [46:17] ==> public final val sharedVariables: HashSet<ValueDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer[PropertyDescriptorImpl]

'isEmpty' @ [46:33] ==> public open fun isEmpty(): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'rewriteSharedVariables' @ [48:13] ==> private final fun rewriteSharedVariables(): Unit defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer[SimpleFunctionDescriptorImpl]

'irFunction' @ [52:13] ==> public final val irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer[PropertyDescriptorImpl]

'acceptVoid' @ [52:24] ==> public fun IrElement.acceptVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'ArrayDeque' @ [53:41] ==> public constructor ArrayDeque<E : (Any..Any?)>() defined in java.util.ArrayDeque[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IrDeclaration

'declarationsStack' @ [55:29] ==> public final val declarationsStack: ArrayDeque<IrDeclaration> defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.collectSharedVariables.<no name provided>[PropertyDescriptorImpl]

'peek' @ [55:47] ==> public open fun peek(): (IrDeclaration..IrDeclaration?) defined in java.util.ArrayDeque[JavaMethodDescriptor]

'descriptor' @ [55:54] ==> public abstract val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrDeclaration[DeserializedPropertyDescriptor]

'HashSet' @ [57:36] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> VariableDescriptor

'element' @ [60:21] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.collectSharedVariables.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [60:29] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [60:48] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.collectSharedVariables.<no name provided>[LazyClassReceiverParameterDescriptor]

'declarationsStack' @ [64:21] ==> public final val declarationsStack: ArrayDeque<IrDeclaration> defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.collectSharedVariables.<no name provided>[PropertyDescriptorImpl]

'push' @ [64:39] ==> public open fun push(p0: (IrDeclaration..IrDeclaration?)): Unit defined in java.util.ArrayDeque[JavaMethodDescriptor]

'declaration' @ [64:44] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.collectSharedVariables.<no name provided>.visitFunction[ValueParameterDescriptorImpl]

'declaration' @ [65:21] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.collectSharedVariables.<no name provided>.visitFunction[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [65:33] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [65:52] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.collectSharedVariables.<no name provided>[LazyClassReceiverParameterDescriptor]

'declarationsStack' @ [66:21] ==> public final val declarationsStack: ArrayDeque<IrDeclaration> defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.collectSharedVariables.<no name provided>[PropertyDescriptorImpl]

'pop' @ [66:39] ==> public open fun pop(): (IrDeclaration..IrDeclaration?) defined in java.util.ArrayDeque[JavaMethodDescriptor]

'declaration' @ [70:21] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.collectSharedVariables.<no name provided>.visitVariable[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [70:33] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [70:52] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.collectSharedVariables.<no name provided>[LazyClassReceiverParameterDescriptor]

'declaration' @ [72:46] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.collectSharedVariables.<no name provided>.visitVariable[ValueParameterDescriptorImpl]

'descriptor' @ [72:58] ==> public abstract val descriptor: VariableDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'variableDescriptor' @ [73:25] ==> val variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.collectSharedVariables.<no name provided>.visitVariable[LocalVariableDescriptor]

'isVar' @ [73:44] ==> public final val VariableDescriptor.isVar: Boolean[MyPropertyDescriptor]

'relevantVars' @ [74:25] ==> public final val relevantVars: HashSet<VariableDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.collectSharedVariables.<no name provided>[PropertyDescriptorImpl]

'add' @ [74:38] ==> public open fun add(element: VariableDescriptor): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'variableDescriptor' @ [74:42] ==> val variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.collectSharedVariables.<no name provided>.visitVariable[LocalVariableDescriptor]

'expression' @ [79:21] ==> value-parameter expression: IrValueAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.collectSharedVariables.<no name provided>.visitVariableAccess[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [79:32] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [79:51] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.collectSharedVariables.<no name provided>[LazyClassReceiverParameterDescriptor]

'expression' @ [81:38] ==> value-parameter expression: IrValueAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.collectSharedVariables.<no name provided>.visitVariableAccess[ValueParameterDescriptorImpl]

'descriptor' @ [81:49] ==> public abstract val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrValueAccessExpression[DeserializedPropertyDescriptor]

'descriptor' @ [82:25] ==> val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.collectSharedVariables.<no name provided>.visitVariableAccess[LocalVariableDescriptor]

'relevantVars' @ [82:39] ==> public final val relevantVars: HashSet<VariableDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.collectSharedVariables.<no name provided>[PropertyDescriptorImpl]

'descriptor' @ [82:55] ==> val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.collectSharedVariables.<no name provided>.visitVariableAccess[LocalVariableDescriptor]

'containingDeclaration' @ [82:66] ==> public final val ValueDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'currentDeclaration' @ [82:91] ==> public final val currentDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.collectSharedVariables.<no name provided>[PropertyDescriptorImpl]

'sharedVariables' @ [83:25] ==> public final val sharedVariables: HashSet<ValueDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer[PropertyDescriptorImpl]

'add' @ [83:41] ==> public open fun add(element: ValueDescriptor): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'descriptor' @ [83:45] ==> val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.collectSharedVariables.<no name provided>.visitVariableAccess[LocalVariableDescriptor]

'HashMap' @ [90:42] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ValueDescriptor
    <V : (Any..Any?)> -> VariableDescriptor

'irFunction' @ [92:13] ==> public final val irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer[PropertyDescriptorImpl]

'transformChildrenVoid' @ [92:24] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'IrElementTransformerVoid' @ [92:55] ==> public constructor IrElementTransformerVoid() defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedClassConstructorDescriptor]

'declaration' @ [94:21] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>.visitVariable[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [94:33] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [94:55] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>[LazyClassReceiverParameterDescriptor]

'declaration' @ [96:41] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>.visitVariable[ValueParameterDescriptorImpl]

'descriptor' @ [96:53] ==> public abstract val descriptor: VariableDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'oldDescriptor' @ [97:25] ==> val oldDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>.visitVariable[LocalVariableDescriptor]

'sharedVariables' @ [97:43] ==> public final val sharedVariables: HashSet<ValueDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer[PropertyDescriptorImpl]

'declaration' @ [97:67] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>.visitVariable[ValueParameterDescriptorImpl]

'context' @ [99:41] ==> public final val context: BackendContext defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering[PropertyDescriptorImpl]

'sharedVariablesManager' @ [99:49] ==> public abstract val sharedVariablesManager: SharedVariablesManager defined in org.jetbrains.kotlin.backend.common.BackendContext[PropertyDescriptorImpl]

'createSharedVariableDescriptor' @ [99:72] ==> public abstract fun createSharedVariableDescriptor(variableDescriptor: VariableDescriptor): VariableDescriptor defined in org.jetbrains.kotlin.backend.common.descriptors.SharedVariablesManager[SimpleFunctionDescriptorImpl]

'oldDescriptor' @ [99:103] ==> val oldDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>.visitVariable[LocalVariableDescriptor]

'transformedDescriptors' @ [100:21] ==> val transformedDescriptors: HashMap<ValueDescriptor, VariableDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables[LocalVariableDescriptor]

'oldDescriptor' @ [100:44] ==> val oldDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>.visitVariable[LocalVariableDescriptor]

'newDescriptor' @ [100:61] ==> val newDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>.visitVariable[LocalVariableDescriptor]

'context' @ [102:28] ==> public final val context: BackendContext defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering[PropertyDescriptorImpl]

'sharedVariablesManager' @ [102:36] ==> public abstract val sharedVariablesManager: SharedVariablesManager defined in org.jetbrains.kotlin.backend.common.BackendContext[PropertyDescriptorImpl]

'defineSharedValue' @ [102:59] ==> public abstract fun defineSharedValue(sharedVariableDescriptor: VariableDescriptor, originalDeclaration: IrVariable): IrStatement defined in org.jetbrains.kotlin.backend.common.descriptors.SharedVariablesManager[SimpleFunctionDescriptorImpl]

'newDescriptor' @ [102:77] ==> val newDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>.visitVariable[LocalVariableDescriptor]

'declaration' @ [102:92] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>.visitVariable[ValueParameterDescriptorImpl]

'irFunction' @ [106:13] ==> public final val irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer[PropertyDescriptorImpl]

'transformChildrenVoid' @ [106:24] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'IrElementTransformerVoid' @ [106:55] ==> public constructor IrElementTransformerVoid() defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedClassConstructorDescriptor]

'expression' @ [108:21] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>.visitGetValue[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [108:32] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [108:54] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>[LazyClassReceiverParameterDescriptor]

'getTransformedDescriptor' @ [110:41] ==> private final fun getTransformedDescriptor(oldDescriptor: ValueDescriptor): VariableDescriptor? defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>[SimpleFunctionDescriptorImpl]

'expression' @ [110:66] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>.visitGetValue[ValueParameterDescriptorImpl]

'descriptor' @ [110:77] ==> public abstract val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[DeserializedPropertyDescriptor]

'expression' @ [110:99] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>.visitGetValue[ValueParameterDescriptorImpl]

'context' @ [112:28] ==> public final val context: BackendContext defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering[PropertyDescriptorImpl]

'sharedVariablesManager' @ [112:36] ==> public abstract val sharedVariablesManager: SharedVariablesManager defined in org.jetbrains.kotlin.backend.common.BackendContext[PropertyDescriptorImpl]

'getSharedValue' @ [112:59] ==> public abstract fun getSharedValue(sharedVariableDescriptor: VariableDescriptor, originalGet: IrGetValue): IrExpression defined in org.jetbrains.kotlin.backend.common.descriptors.SharedVariablesManager[SimpleFunctionDescriptorImpl]

'newDescriptor' @ [112:74] ==> val newDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>.visitGetValue[LocalVariableDescriptor]

'expression' @ [112:89] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>.visitGetValue[ValueParameterDescriptorImpl]

'expression' @ [116:21] ==> value-parameter expression: IrSetVariable defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>.visitSetVariable[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [116:32] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [116:54] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>[LazyClassReceiverParameterDescriptor]

'getTransformedDescriptor' @ [118:41] ==> private final fun getTransformedDescriptor(oldDescriptor: ValueDescriptor): VariableDescriptor? defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>[SimpleFunctionDescriptorImpl]

'expression' @ [118:66] ==> value-parameter expression: IrSetVariable defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>.visitSetVariable[ValueParameterDescriptorImpl]

'descriptor' @ [118:77] ==> public abstract val descriptor: VariableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrSetVariable[DeserializedPropertyDescriptor]

'expression' @ [118:99] ==> value-parameter expression: IrSetVariable defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>.visitSetVariable[ValueParameterDescriptorImpl]

'context' @ [120:28] ==> public final val context: BackendContext defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering[PropertyDescriptorImpl]

'sharedVariablesManager' @ [120:36] ==> public abstract val sharedVariablesManager: SharedVariablesManager defined in org.jetbrains.kotlin.backend.common.BackendContext[PropertyDescriptorImpl]

'setSharedValue' @ [120:59] ==> public abstract fun setSharedValue(sharedVariableDescriptor: VariableDescriptor, originalSet: IrSetVariable): IrExpression defined in org.jetbrains.kotlin.backend.common.descriptors.SharedVariablesManager[SimpleFunctionDescriptorImpl]

'newDescriptor' @ [120:74] ==> val newDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>.visitSetVariable[LocalVariableDescriptor]

'expression' @ [120:89] ==> value-parameter expression: IrSetVariable defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>.visitSetVariable[ValueParameterDescriptorImpl]

'transformedDescriptors' @ [124:25] ==> val transformedDescriptors: HashMap<ValueDescriptor, VariableDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables[LocalVariableDescriptor]

'getOrElse' @ [124:48] ==> @InlineOnly public inline fun <K, V> Map<ValueDescriptor, VariableDescriptor?>.getOrElse(key: ValueDescriptor, defaultValue: () -> VariableDescriptor?): VariableDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueDescriptor
    <V> -> VariableDescriptor?

'oldDescriptor' @ [124:58] ==> value-parameter oldDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>.getTransformedDescriptor[ValueParameterDescriptorImpl]

'assert' @ [125:29] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'oldDescriptor' @ [125:36] ==> value-parameter oldDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>.getTransformedDescriptor[ValueParameterDescriptorImpl]

'sharedVariables' @ [125:54] ==> public final val sharedVariables: HashSet<ValueDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer[PropertyDescriptorImpl]

'oldDescriptor' @ [126:71] ==> value-parameter oldDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.SharedVariablesLowering.SharedVariablesTransformer.rewriteSharedVariables.<no name provided>.getTransformedDescriptor[ValueParameterDescriptorImpl]

