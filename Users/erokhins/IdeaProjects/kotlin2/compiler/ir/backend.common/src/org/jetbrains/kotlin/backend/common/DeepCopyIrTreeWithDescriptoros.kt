'mutableMapOf' @ [42:101] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> DeclarationDescriptor
    <V> -> DeclarationDescriptor

'this' @ [49:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[LazyClassReceiverParameterDescriptor]

'typeSubstitutor' @ [49:14] ==> private final var typeSubstitutor: TypeSubstitutor? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'typeSubstitutor' @ [49:32] ==> value-parameter typeSubstitutor: TypeSubstitutor? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.copy[ValueParameterDescriptorImpl]

'irElement' @ [50:9] ==> value-parameter irElement: IrElement defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.copy[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [50:19] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'DescriptorCollector' @ [50:38] ==> public constructor DescriptorCollector() defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector[ClassConstructorDescriptorImpl]

'irElement' @ [51:16] ==> value-parameter irElement: IrElement defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.copy[ValueParameterDescriptorImpl]

'accept' @ [51:26] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<IrElement, Nothing?>, data: Nothing?): IrElement defined in org.jetbrains.kotlin.ir.IrElement[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> IrElement
    <D> -> Nothing?

'InlineCopyIr' @ [51:33] ==> public constructor InlineCopyIr() defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr[ClassConstructorDescriptorImpl]

'element' @ [59:13] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitElement[ValueParameterDescriptorImpl]

'acceptChildren' @ [59:21] ==> public abstract fun <D> acceptChildren(visitor: IrElementVisitor<Unit, Nothing?>, data: Nothing?): Unit defined in org.jetbrains.kotlin.ir.IrElement[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D> -> Nothing?

'this' @ [59:36] ==> <this> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector[LazyClassReceiverParameterDescriptor]

'declaration' @ [66:33] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitClass[ValueParameterDescriptorImpl]

'descriptor' @ [66:45] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'copyClassDescriptor' @ [67:33] ==> private final fun copyClassDescriptor(oldDescriptor: ClassDescriptor): ClassDescriptorImpl defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector[SimpleFunctionDescriptorImpl]

'oldDescriptor' @ [67:53] ==> val oldDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitClass[LocalVariableDescriptor]

'descriptorSubstituteMap' @ [68:13] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'oldDescriptor' @ [68:37] ==> val oldDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitClass[LocalVariableDescriptor]

'newDescriptor' @ [68:54] ==> val newDescriptor: ClassDescriptorImpl defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitClass[LocalVariableDescriptor]

'descriptorSubstituteMap' @ [69:13] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'oldDescriptor' @ [69:37] ==> val oldDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitClass[LocalVariableDescriptor]

'thisAsReceiverParameter' @ [69:51] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'newDescriptor' @ [69:78] ==> val newDescriptor: ClassDescriptorImpl defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitClass[LocalVariableDescriptor]

'thisAsReceiverParameter' @ [69:92] ==> public final val ClassDescriptorImpl.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'super' @ [71:13] ==> <this> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector[LazyClassReceiverParameterDescriptor]

'visitClass' @ [71:19] ==> public open fun visitClass(declaration: IrClass): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [71:30] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitClass[ValueParameterDescriptorImpl]

'oldDescriptor' @ [73:32] ==> val oldDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitClass[LocalVariableDescriptor]

'constructors' @ [73:46] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'map' @ [73:59] ==> public inline fun <T, R> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.map(transform: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> ClassConstructorDescriptor): List<ClassConstructorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)
    <R> -> ClassConstructorDescriptor

'descriptorSubstituteMap' @ [74:17] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'oldConstructorDescriptor' @ [74:41] ==> value-parameter oldConstructorDescriptor: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitClass.<anonymous>[ValueParameterDescriptorImpl]

'toSet' @ [75:15] ==> public fun <T> Iterable<ClassConstructorDescriptor>.toSet(): Set<ClassConstructorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassConstructorDescriptor

'oldDescriptor' @ [77:41] ==> val oldDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitClass[LocalVariableDescriptor]

'unsubstitutedPrimaryConstructor' @ [77:55] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'oldPrimaryConstructor' @ [78:38] ==> val oldPrimaryConstructor: ClassConstructorDescriptor? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitClass[LocalVariableDescriptor]

'let' @ [78:61] ==> @InlineOnly public inline fun <T, R> ClassConstructorDescriptor.let(block: (ClassConstructorDescriptor) -> ClassConstructorDescriptor): ClassConstructorDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassConstructorDescriptor
    <R> -> ClassConstructorDescriptor

'descriptorSubstituteMap' @ [78:67] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'it' @ [78:91] ==> value-parameter it: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitClass.<anonymous>[ValueParameterDescriptorImpl]

'oldDescriptor' @ [80:42] ==> val oldDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitClass[LocalVariableDescriptor]

'unsubstitutedMemberScope' @ [80:56] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'getContributedDescriptors' @ [81:22] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'map' @ [82:22] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.map(transform: (DeclarationDescriptor) -> DeclarationDescriptor): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> DeclarationDescriptor

'descriptorSubstituteMap' @ [83:25] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'it' @ [83:49] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitClass.<anonymous>[ValueParameterDescriptorImpl]

'newDescriptor' @ [85:13] ==> val newDescriptor: ClassDescriptorImpl defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitClass[LocalVariableDescriptor]

'initialize' @ [85:27] ==> public final fun initialize(@NotNull p0: MemberScope, @NotNull p1: (MutableSet<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>..Set<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>), @Nullable p2: ClassConstructorDescriptor?): Unit defined in org.jetbrains.kotlin.descriptors.impl.ClassDescriptorImpl[JavaMethodDescriptor]

'SimpleMemberScope' @ [86:21] ==> public constructor SimpleMemberScope(members: List<DeclarationDescriptor>) defined in org.jetbrains.kotlin.backend.common.lower.SimpleMemberScope[ClassConstructorDescriptorImpl]

'contributedDescriptors' @ [86:39] ==> val contributedDescriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitClass[LocalVariableDescriptor]

'constructors' @ [87:21] ==> val constructors: Set<ClassConstructorDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitClass[LocalVariableDescriptor]

'primaryConstructor' @ [88:21] ==> val primaryConstructor: ClassConstructorDescriptor? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitClass[LocalVariableDescriptor]

'copyPropertyOrField' @ [96:13] ==> private final fun copyPropertyOrField(oldDescriptor: PropertyDescriptor): Unit defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector[SimpleFunctionDescriptorImpl]

'declaration' @ [96:33] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitProperty[ValueParameterDescriptorImpl]

'descriptor' @ [96:45] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrProperty[DeserializedPropertyDescriptor]

'super' @ [97:13] ==> <this> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector[LazyClassReceiverParameterDescriptor]

'visitProperty' @ [97:19] ==> public open fun visitProperty(declaration: IrProperty): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [97:33] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitProperty[ValueParameterDescriptorImpl]

'declaration' @ [104:33] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitField[ValueParameterDescriptorImpl]

'descriptor' @ [104:45] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'descriptorSubstituteMap' @ [105:17] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'oldDescriptor' @ [105:41] ==> val oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitField[LocalVariableDescriptor]

'copyPropertyOrField' @ [106:17] ==> private final fun copyPropertyOrField(oldDescriptor: PropertyDescriptor): Unit defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector[SimpleFunctionDescriptorImpl]

'oldDescriptor' @ [106:37] ==> val oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitField[LocalVariableDescriptor]

'super' @ [108:13] ==> <this> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector[LazyClassReceiverParameterDescriptor]

'visitField' @ [108:19] ==> public open fun visitField(declaration: IrField): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [108:30] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitField[ValueParameterDescriptorImpl]

'declaration' @ [115:33] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitFunction[ValueParameterDescriptorImpl]

'descriptor' @ [115:45] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'oldDescriptor' @ [116:17] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitFunction[LocalVariableDescriptor]

'copyFunctionDescriptor' @ [117:37] ==> private final fun copyFunctionDescriptor(oldDescriptor: CallableDescriptor): CallableDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector[SimpleFunctionDescriptorImpl]

'oldDescriptor' @ [117:60] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitFunction[LocalVariableDescriptor]

'descriptorSubstituteMap' @ [118:17] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'oldDescriptor' @ [118:41] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitFunction[LocalVariableDescriptor]

'newDescriptor' @ [118:58] ==> val newDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitFunction[LocalVariableDescriptor]

'oldDescriptor' @ [119:17] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitFunction[LocalVariableDescriptor]

'extensionReceiverParameter' @ [119:31] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'let' @ [119:59] ==> @InlineOnly public inline fun <T, R> ReceiverParameterDescriptor.let(block: (ReceiverParameterDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor
    <R> -> Unit

'descriptorSubstituteMap' @ [120:21] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'it' @ [120:45] ==> value-parameter it: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitFunction.<anonymous>[ValueParameterDescriptorImpl]

'newDescriptor' @ [120:51] ==> val newDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitFunction[LocalVariableDescriptor]

'extensionReceiverParameter' @ [120:65] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'super' @ [123:13] ==> <this> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector[LazyClassReceiverParameterDescriptor]

'visitFunction' @ [123:19] ==> public open fun visitFunction(declaration: IrFunction): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [123:33] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitFunction[ValueParameterDescriptorImpl]

'declaration' @ [130:33] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitVariable[ValueParameterDescriptorImpl]

'descriptor' @ [130:45] ==> public abstract val descriptor: VariableDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'oldDescriptor' @ [131:44] ==> val oldDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitVariable[LocalVariableDescriptor]

'containingDeclaration' @ [131:58] ==> public final val VariableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'descriptorSubstituteMap' @ [132:44] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [132:68] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'oldContainingDeclaration' @ [132:81] ==> val oldContainingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitVariable[LocalVariableDescriptor]

'oldContainingDeclaration' @ [132:107] ==> val oldContainingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitVariable[LocalVariableDescriptor]

'IrTemporaryVariableDescriptorImpl' @ [133:33] ==> public constructor IrTemporaryVariableDescriptorImpl(containingDeclaration: DeclarationDescriptor, name: Name, outType: KotlinType, isMutable: Boolean = ...) defined in org.jetbrains.kotlin.ir.descriptors.IrTemporaryVariableDescriptorImpl[DeserializedClassConstructorDescriptor]

'newContainingDeclaration' @ [134:41] ==> val newContainingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitVariable[LocalVariableDescriptor]

'generateCopyName' @ [135:41] ==> private final fun generateCopyName(name: Name): Name defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector[SimpleFunctionDescriptorImpl]

'oldDescriptor' @ [135:58] ==> val oldDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitVariable[LocalVariableDescriptor]

'name' @ [135:72] ==> public final val VariableDescriptor.name: Name[MyPropertyDescriptor]

'substituteType' @ [136:41] ==> private final fun substituteType(oldType: KotlinType?): KotlinType? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[SimpleFunctionDescriptorImpl]

'oldDescriptor' @ [136:56] ==> val oldDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitVariable[LocalVariableDescriptor]

'type' @ [136:70] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'oldDescriptor' @ [137:41] ==> val oldDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitVariable[LocalVariableDescriptor]

'isVar' @ [137:55] ==> public final val VariableDescriptor.isVar: Boolean[MyPropertyDescriptor]

'descriptorSubstituteMap' @ [138:13] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'oldDescriptor' @ [138:37] ==> val oldDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitVariable[LocalVariableDescriptor]

'newDescriptor' @ [138:54] ==> val newDescriptor: IrTemporaryVariableDescriptorImpl defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitVariable[LocalVariableDescriptor]

'super' @ [140:13] ==> <this> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector[LazyClassReceiverParameterDescriptor]

'visitVariable' @ [140:19] ==> public open fun visitVariable(declaration: IrVariable): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [140:33] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitVariable[ValueParameterDescriptorImpl]

'aCatch' @ [146:33] ==> value-parameter aCatch: IrCatch defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitCatch[ValueParameterDescriptorImpl]

'parameter' @ [146:40] ==> public abstract val parameter: VariableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrCatch[DeserializedPropertyDescriptor]

'oldDescriptor' @ [147:44] ==> val oldDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitCatch[LocalVariableDescriptor]

'containingDeclaration' @ [147:58] ==> public final val VariableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'descriptorSubstituteMap' @ [148:44] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [148:68] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'oldContainingDeclaration' @ [148:81] ==> val oldContainingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitCatch[LocalVariableDescriptor]

'oldContainingDeclaration' @ [148:107] ==> val oldContainingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitCatch[LocalVariableDescriptor]

'IrTemporaryVariableDescriptorImpl' @ [149:33] ==> public constructor IrTemporaryVariableDescriptorImpl(containingDeclaration: DeclarationDescriptor, name: Name, outType: KotlinType, isMutable: Boolean = ...) defined in org.jetbrains.kotlin.ir.descriptors.IrTemporaryVariableDescriptorImpl[DeserializedClassConstructorDescriptor]

'newContainingDeclaration' @ [150:45] ==> val newContainingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitCatch[LocalVariableDescriptor]

'generateCopyName' @ [151:45] ==> private final fun generateCopyName(name: Name): Name defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector[SimpleFunctionDescriptorImpl]

'oldDescriptor' @ [151:62] ==> val oldDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitCatch[LocalVariableDescriptor]

'name' @ [151:76] ==> public final val VariableDescriptor.name: Name[MyPropertyDescriptor]

'substituteType' @ [152:45] ==> private final fun substituteType(oldType: KotlinType?): KotlinType? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[SimpleFunctionDescriptorImpl]

'oldDescriptor' @ [152:60] ==> val oldDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitCatch[LocalVariableDescriptor]

'type' @ [152:74] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'oldDescriptor' @ [153:45] ==> val oldDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitCatch[LocalVariableDescriptor]

'isVar' @ [153:59] ==> public final val VariableDescriptor.isVar: Boolean[MyPropertyDescriptor]

'descriptorSubstituteMap' @ [154:13] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'oldDescriptor' @ [154:37] ==> val oldDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitCatch[LocalVariableDescriptor]

'newDescriptor' @ [154:54] ==> val newDescriptor: IrTemporaryVariableDescriptorImpl defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitCatch[LocalVariableDescriptor]

'super' @ [156:13] ==> <this> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector[LazyClassReceiverParameterDescriptor]

'visitCatch' @ [156:19] ==> public open fun visitCatch(aCatch: IrCatch): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'aCatch' @ [156:30] ==> value-parameter aCatch: IrCatch defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.visitCatch[ValueParameterDescriptorImpl]

'name' @ [163:35] ==> value-parameter name: Name defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.generateCopyName[ValueParameterDescriptorImpl]

'toString' @ [163:40] ==> public open fun toString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'nameIndex' @ [164:36] ==> private final var nameIndex: Int defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'toString' @ [164:49] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'identifier' @ [165:25] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'declarationName' @ [165:36] ==> val declarationName: String defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.generateCopyName[LocalVariableDescriptor]

'indexStr' @ [165:60] ==> val indexStr: String defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.generateCopyName[LocalVariableDescriptor]

'when (oldDescriptor) {
                is ConstructorDescriptor    -> copyConstructorDescriptor(oldDescriptor)
                is SimpleFunctionDescriptor -> copySimpleFunctionDescriptor(oldDescriptor)
                else -> TODO("Unsupported FunctionDescriptor subtype: $oldDescriptor")
            }' @ [172:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CallableDescriptor, entry1: CallableDescriptor, entry2: CallableDescriptor): CallableDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CallableDescriptor

'oldDescriptor' @ [172:26] ==> value-parameter oldDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyFunctionDescriptor[ValueParameterDescriptorImpl]

'copyConstructorDescriptor' @ [173:48] ==> private final fun copyConstructorDescriptor(oldDescriptor: ConstructorDescriptor): FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector[SimpleFunctionDescriptorImpl]

'oldDescriptor' @ [173:74] ==> value-parameter oldDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyFunctionDescriptor[ValueParameterDescriptorImpl]

'copySimpleFunctionDescriptor' @ [174:48] ==> private final fun copySimpleFunctionDescriptor(oldDescriptor: SimpleFunctionDescriptor): FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector[SimpleFunctionDescriptorImpl]

'oldDescriptor' @ [174:77] ==> value-parameter oldDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyFunctionDescriptor[ValueParameterDescriptorImpl]

'TODO' @ [175:25] ==> @InlineOnly public inline fun TODO(reason: String): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'oldDescriptor' @ [175:72] ==> value-parameter oldDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyFunctionDescriptor[ValueParameterDescriptorImpl]

'oldDescriptor' @ [183:44] ==> value-parameter oldDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor[ValueParameterDescriptorImpl]

'containingDeclaration' @ [183:58] ==> public final val SimpleFunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'descriptorSubstituteMap' @ [184:44] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [184:68] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'oldContainingDeclaration' @ [184:81] ==> val oldContainingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor[LocalVariableDescriptor]

'oldContainingDeclaration' @ [184:107] ==> val oldContainingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor[LocalVariableDescriptor]

'create' @ [185:49] ==> @NotNull public open fun create(@NotNull p0: DeclarationDescriptor, @NotNull p1: Annotations, @NotNull p2: Name, @NotNull p3: CallableMemberDescriptor.Kind, @NotNull p4: SourceElement): SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl[JavaMethodDescriptor]

'newContainingDeclaration' @ [186:47] ==> val newContainingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor[LocalVariableDescriptor]

'oldDescriptor' @ [187:47] ==> value-parameter oldDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor[ValueParameterDescriptorImpl]

'annotations' @ [187:61] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor[DeserializedPropertyDescriptor]

'generateCopyName' @ [188:47] ==> private final fun generateCopyName(name: Name): Name defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector[SimpleFunctionDescriptorImpl]

'oldDescriptor' @ [188:64] ==> value-parameter oldDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor[ValueParameterDescriptorImpl]

'name' @ [188:78] ==> public final val SimpleFunctionDescriptor.name: Name[MyPropertyDescriptor]

'oldDescriptor' @ [189:47] ==> value-parameter oldDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor[ValueParameterDescriptorImpl]

'kind' @ [189:61] ==> public final val SimpleFunctionDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'oldDescriptor' @ [190:47] ==> value-parameter oldDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor[ValueParameterDescriptorImpl]

'source' @ [190:61] ==> public final val SimpleFunctionDescriptor.source: SourceElement[MyPropertyDescriptor]

'apply' @ [191:15] ==> @InlineOnly public inline fun <T> SimpleFunctionDescriptorImpl.apply(block: (SimpleFunctionDescriptorImpl).() -> Unit): SimpleFunctionDescriptorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptorImpl

'oldDescriptor' @ [193:52] ==> value-parameter oldDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [193:66] ==> public final val SimpleFunctionDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'oldDispatchReceiverParameter' @ [194:52] ==> val oldDispatchReceiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor.<anonymous>[LocalVariableDescriptor]

'let' @ [194:82] ==> @InlineOnly public inline fun <T, R> ReceiverParameterDescriptor.let(block: (ReceiverParameterDescriptor) -> ReceiverParameterDescriptor): ReceiverParameterDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor
    <R> -> ReceiverParameterDescriptor

'descriptorSubstituteMap' @ [194:88] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [194:112] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'it' @ [194:125] ==> value-parameter it: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [194:129] ==> value-parameter it: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'oldDescriptor' @ [195:52] ==> value-parameter oldDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor[ValueParameterDescriptorImpl]

'typeParameters' @ [195:66] ==> public final val SimpleFunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'copyValueParameters' @ [196:52] ==> private final fun copyValueParameters(oldValueParameters: List<ValueParameterDescriptor>, containingDeclaration: CallableDescriptor): List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[SimpleFunctionDescriptorImpl]

'oldDescriptor' @ [196:72] ==> value-parameter oldDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor[ValueParameterDescriptorImpl]

'valueParameters' @ [196:86] ==> public final val SimpleFunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'this' @ [196:103] ==> <this> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor.<anonymous>[ReceiverParameterDescriptorImpl]

'substituteType' @ [197:52] ==> private final fun substituteType(oldType: KotlinType?): KotlinType? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[SimpleFunctionDescriptorImpl]

'oldDescriptor' @ [197:67] ==> value-parameter oldDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [197:81] ==> public final val SimpleFunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [197:109] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'substituteType' @ [198:52] ==> private final fun substituteType(oldType: KotlinType?): KotlinType? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[SimpleFunctionDescriptorImpl]

'oldDescriptor' @ [198:67] ==> value-parameter oldDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor[ValueParameterDescriptorImpl]

'returnType' @ [198:81] ==> public final val SimpleFunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'initialize' @ [200:17] ==> @NotNull public open fun initialize(@Nullable p0: KotlinType?, @Nullable p1: ReceiverParameterDescriptor?, @NotNull p2: (MutableList<out (TypeParameterDescriptor..TypeParameterDescriptor?)>..List<(TypeParameterDescriptor..TypeParameterDescriptor?)>), @NotNull p3: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>), @Nullable p4: KotlinType?, @Nullable p5: Modality?, @NotNull p6: Visibility): SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl[JavaMethodDescriptor]

'newReceiverParameterType' @ [201:58] ==> val newReceiverParameterType: KotlinType? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor.<anonymous>[LocalVariableDescriptor]

'newDispatchReceiverParameter' @ [202:58] ==> val newDispatchReceiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor.<anonymous>[LocalVariableDescriptor]

'newTypeParameters' @ [203:58] ==> val newTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor.<anonymous>[LocalVariableDescriptor]

'newValueParameters' @ [204:58] ==> val newValueParameters: List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor.<anonymous>[LocalVariableDescriptor]

'newReturnType' @ [205:58] ==> val newReturnType: KotlinType? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor.<anonymous>[LocalVariableDescriptor]

'oldDescriptor' @ [206:58] ==> value-parameter oldDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor[ValueParameterDescriptorImpl]

'modality' @ [206:72] ==> public final val SimpleFunctionDescriptor.modality: Modality[MyPropertyDescriptor]

'oldDescriptor' @ [207:58] ==> value-parameter oldDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor[ValueParameterDescriptorImpl]

'visibility' @ [207:72] ==> public final val SimpleFunctionDescriptor.visibility: Visibility[MyPropertyDescriptor]

'isTailrec' @ [209:17] ==> public final var SimpleFunctionDescriptorImpl.isTailrec: Boolean[MyPropertyDescriptor]

'oldDescriptor' @ [209:42] ==> value-parameter oldDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor[ValueParameterDescriptorImpl]

'isTailrec' @ [209:56] ==> public final val SimpleFunctionDescriptor.isTailrec: Boolean[MyPropertyDescriptor]

'isSuspend' @ [210:17] ==> public final var SimpleFunctionDescriptorImpl.isSuspend: Boolean[MyPropertyDescriptor]

'oldDescriptor' @ [210:42] ==> value-parameter oldDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor[ValueParameterDescriptorImpl]

'isSuspend' @ [210:56] ==> public final val SimpleFunctionDescriptor.isSuspend: Boolean[MyPropertyDescriptor]

'overriddenDescriptors' @ [211:17] ==> public final var SimpleFunctionDescriptorImpl.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'oldDescriptor' @ [211:42] ==> value-parameter oldDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copySimpleFunctionDescriptor[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [211:56] ==> public final var SimpleFunctionDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'oldDescriptor' @ [219:44] ==> value-parameter oldDescriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyConstructorDescriptor[ValueParameterDescriptorImpl]

'containingDeclaration' @ [219:58] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'descriptorSubstituteMap' @ [220:44] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [220:68] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'oldContainingDeclaration' @ [220:81] ==> val oldContainingDeclaration: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyConstructorDescriptor[LocalVariableDescriptor]

'oldContainingDeclaration' @ [220:107] ==> val oldContainingDeclaration: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyConstructorDescriptor[LocalVariableDescriptor]

'create' @ [221:51] ==> @NotNull public open fun create(@NotNull p0: ClassDescriptor, @NotNull p1: Annotations, p2: Boolean, @NotNull p3: SourceElement): ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.ClassConstructorDescriptorImpl[JavaMethodDescriptor]

'newContainingDeclaration' @ [222:47] ==> val newContainingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyConstructorDescriptor[LocalVariableDescriptor]

'oldDescriptor' @ [223:47] ==> value-parameter oldDescriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyConstructorDescriptor[ValueParameterDescriptorImpl]

'annotations' @ [223:61] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.ConstructorDescriptor[DeserializedPropertyDescriptor]

'oldDescriptor' @ [224:47] ==> value-parameter oldDescriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyConstructorDescriptor[ValueParameterDescriptorImpl]

'isPrimary' @ [224:61] ==> public final val ConstructorDescriptor.isPrimary: Boolean[MyPropertyDescriptor]

'oldDescriptor' @ [225:47] ==> value-parameter oldDescriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyConstructorDescriptor[ValueParameterDescriptorImpl]

'source' @ [225:61] ==> public final val ConstructorDescriptor.source: SourceElement[MyPropertyDescriptor]

'apply' @ [226:15] ==> @InlineOnly public inline fun <T> ClassConstructorDescriptorImpl.apply(block: (ClassConstructorDescriptorImpl).() -> Unit): ClassConstructorDescriptorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassConstructorDescriptorImpl

'oldDescriptor' @ [228:45] ==> value-parameter oldDescriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyConstructorDescriptor[ValueParameterDescriptorImpl]

'typeParameters' @ [228:59] ==> public final val ConstructorDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'copyValueParameters' @ [229:45] ==> private final fun copyValueParameters(oldValueParameters: List<ValueParameterDescriptor>, containingDeclaration: CallableDescriptor): List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[SimpleFunctionDescriptorImpl]

'oldDescriptor' @ [229:65] ==> value-parameter oldDescriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyConstructorDescriptor[ValueParameterDescriptorImpl]

'valueParameters' @ [229:79] ==> public final val ConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'this' @ [229:96] ==> <this> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyConstructorDescriptor.<anonymous>[ReceiverParameterDescriptorImpl]

'substituteType' @ [230:45] ==> private final fun substituteType(oldType: KotlinType?): KotlinType? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[SimpleFunctionDescriptorImpl]

'oldDescriptor' @ [230:60] ==> value-parameter oldDescriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyConstructorDescriptor[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [230:74] ==> public final val ConstructorDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [230:101] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'substituteType' @ [231:45] ==> private final fun substituteType(oldType: KotlinType?): KotlinType? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[SimpleFunctionDescriptorImpl]

'oldDescriptor' @ [231:60] ==> value-parameter oldDescriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyConstructorDescriptor[ValueParameterDescriptorImpl]

'returnType' @ [231:74] ==> public final val ConstructorDescriptor.returnType: KotlinType[MyPropertyDescriptor]

'initialize' @ [233:17] ==> @NotNull public open fun initialize(@Nullable p0: KotlinType?, @Nullable p1: ReceiverParameterDescriptor?, @NotNull p2: (MutableList<out (TypeParameterDescriptor..TypeParameterDescriptor?)>..List<(TypeParameterDescriptor..TypeParameterDescriptor?)>), @NotNull p3: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>), @Nullable p4: KotlinType?, @Nullable p5: Modality?, @NotNull p6: Visibility): FunctionDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.ClassConstructorDescriptorImpl[JavaMethodDescriptor]

'receiverParameterType' @ [234:58] ==> val receiverParameterType: KotlinType? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyConstructorDescriptor.<anonymous>[LocalVariableDescriptor]

'newTypeParameters' @ [236:58] ==> val newTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyConstructorDescriptor.<anonymous>[LocalVariableDescriptor]

'newValueParameters' @ [237:58] ==> val newValueParameters: List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyConstructorDescriptor.<anonymous>[LocalVariableDescriptor]

'returnType' @ [238:58] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyConstructorDescriptor.<anonymous>[LocalVariableDescriptor]

'oldDescriptor' @ [239:58] ==> value-parameter oldDescriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyConstructorDescriptor[ValueParameterDescriptorImpl]

'modality' @ [239:72] ==> public final val ConstructorDescriptor.modality: Modality[MyPropertyDescriptor]

'oldDescriptor' @ [240:58] ==> value-parameter oldDescriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyConstructorDescriptor[ValueParameterDescriptorImpl]

'visibility' @ [240:72] ==> public final val ConstructorDescriptor.visibility: Visibility[MyPropertyDescriptor]

'copyPropertyDescriptor' @ [249:33] ==> private final fun copyPropertyDescriptor(oldDescriptor: PropertyDescriptor): PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector[SimpleFunctionDescriptorImpl]

'oldDescriptor' @ [249:56] ==> value-parameter oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyOrField[ValueParameterDescriptorImpl]

'descriptorSubstituteMap' @ [250:13] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'oldDescriptor' @ [250:37] ==> value-parameter oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyOrField[ValueParameterDescriptorImpl]

'newDescriptor' @ [250:54] ==> val newDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyOrField[LocalVariableDescriptor]

'oldDescriptor' @ [251:13] ==> value-parameter oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyOrField[ValueParameterDescriptorImpl]

'getter' @ [251:27] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'let' @ [251:35] ==> @InlineOnly public inline fun <T, R> PropertyGetterDescriptor.let(block: (PropertyGetterDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyGetterDescriptor
    <R> -> Unit

'descriptorSubstituteMap' @ [252:17] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'it' @ [252:41] ==> value-parameter it: PropertyGetterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyOrField.<anonymous>[ValueParameterDescriptorImpl]

'newDescriptor' @ [252:47] ==> val newDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyOrField[LocalVariableDescriptor]

'getter' @ [252:61] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'oldDescriptor' @ [254:13] ==> value-parameter oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyOrField[ValueParameterDescriptorImpl]

'setter' @ [254:27] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'let' @ [254:35] ==> @InlineOnly public inline fun <T, R> PropertySetterDescriptor.let(block: (PropertySetterDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertySetterDescriptor
    <R> -> Unit

'descriptorSubstituteMap' @ [255:17] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'it' @ [255:41] ==> value-parameter it: PropertySetterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyOrField.<anonymous>[ValueParameterDescriptorImpl]

'newDescriptor' @ [255:47] ==> val newDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyOrField[LocalVariableDescriptor]

'setter' @ [255:61] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'oldDescriptor' @ [257:13] ==> value-parameter oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyOrField[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [257:27] ==> public final val PropertyDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'let' @ [257:55] ==> @InlineOnly public inline fun <T, R> ReceiverParameterDescriptor.let(block: (ReceiverParameterDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor
    <R> -> Unit

'descriptorSubstituteMap' @ [258:17] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'it' @ [258:41] ==> value-parameter it: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyOrField.<anonymous>[ValueParameterDescriptorImpl]

'newDescriptor' @ [258:47] ==> val newDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyOrField[LocalVariableDescriptor]

'extensionReceiverParameter' @ [258:61] ==> public final val PropertyDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'oldDescriptor' @ [267:44] ==> value-parameter oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor[ValueParameterDescriptorImpl]

'containingDeclaration' @ [267:58] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'descriptorSubstituteMap' @ [268:44] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [268:68] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'oldContainingDeclaration' @ [268:81] ==> val oldContainingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor[LocalVariableDescriptor]

'oldContainingDeclaration' @ [268:107] ==> val oldContainingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor[LocalVariableDescriptor]

'create' @ [269:43] ==> @NotNull public open fun create(@NotNull p0: DeclarationDescriptor, @NotNull p1: Annotations, @NotNull p2: Modality, @NotNull p3: Visibility, p4: Boolean, @NotNull p5: Name, @NotNull p6: CallableMemberDescriptor.Kind, @NotNull p7: SourceElement, p8: Boolean, p9: Boolean, p10: Boolean, p11: Boolean, p12: Boolean, p13: Boolean): PropertyDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.PropertyDescriptorImpl[JavaMethodDescriptor]

'newContainingDeclaration' @ [270:47] ==> val newContainingDeclaration: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor[LocalVariableDescriptor]

'oldDescriptor' @ [271:47] ==> value-parameter oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor[ValueParameterDescriptorImpl]

'annotations' @ [271:61] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[DeserializedPropertyDescriptor]

'oldDescriptor' @ [272:47] ==> value-parameter oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor[ValueParameterDescriptorImpl]

'modality' @ [272:61] ==> public final val PropertyDescriptor.modality: Modality[MyPropertyDescriptor]

'oldDescriptor' @ [273:47] ==> value-parameter oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor[ValueParameterDescriptorImpl]

'visibility' @ [273:61] ==> public final val PropertyDescriptor.visibility: Visibility[MyPropertyDescriptor]

'oldDescriptor' @ [274:47] ==> value-parameter oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor[ValueParameterDescriptorImpl]

'isVar' @ [274:61] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'oldDescriptor' @ [275:47] ==> value-parameter oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor[ValueParameterDescriptorImpl]

'name' @ [275:61] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'oldDescriptor' @ [276:47] ==> value-parameter oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor[ValueParameterDescriptorImpl]

'kind' @ [276:61] ==> public final val PropertyDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'oldDescriptor' @ [277:47] ==> value-parameter oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor[ValueParameterDescriptorImpl]

'source' @ [277:61] ==> public final val PropertyDescriptor.source: SourceElement[MyPropertyDescriptor]

'oldDescriptor' @ [278:47] ==> value-parameter oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor[ValueParameterDescriptorImpl]

'isLateInit' @ [278:61] ==> public final val PropertyDescriptor.isLateInit: Boolean[MyPropertyDescriptor]

'oldDescriptor' @ [279:47] ==> value-parameter oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor[ValueParameterDescriptorImpl]

'isConst' @ [279:61] ==> public final val PropertyDescriptor.isConst: Boolean[MyPropertyDescriptor]

'oldDescriptor' @ [280:47] ==> value-parameter oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor[ValueParameterDescriptorImpl]

'isHeader' @ [280:61] ==> public final val PropertyDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'oldDescriptor' @ [281:47] ==> value-parameter oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor[ValueParameterDescriptorImpl]

'isImpl' @ [281:61] ==> public final val PropertyDescriptor.isImpl: Boolean[MyPropertyDescriptor]

'oldDescriptor' @ [282:47] ==> value-parameter oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor[ValueParameterDescriptorImpl]

'isExternal' @ [282:61] ==> public final val PropertyDescriptor.isExternal: Boolean[MyPropertyDescriptor]

'oldDescriptor' @ [283:47] ==> value-parameter oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor[ValueParameterDescriptorImpl]

'isDelegated' @ [283:61] ==> @Deprecated public abstract val isDelegated: Boolean defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[DeserializedPropertyDescriptor]

'apply' @ [284:15] ==> @InlineOnly public inline fun <T> PropertyDescriptorImpl.apply(block: (PropertyDescriptorImpl).() -> Unit): PropertyDescriptorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptorImpl

'setType' @ [286:17] ==> public open fun setType(@NotNull p0: KotlinType, @ReadOnly @NotNull p1: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>, @Nullable p2: ReceiverParameterDescriptor?, @Nullable p3: KotlinType?): Unit defined in org.jetbrains.kotlin.descriptors.impl.PropertyDescriptorImpl[JavaMethodDescriptor]

'oldDescriptor' @ [287:55] ==> value-parameter oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor[ValueParameterDescriptorImpl]

'type' @ [287:69] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'oldDescriptor' @ [288:55] ==> value-parameter oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor[ValueParameterDescriptorImpl]

'typeParameters' @ [288:69] ==> public final val PropertyDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'newContainingDeclaration' @ [289:55] ==> val newContainingDeclaration: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor[LocalVariableDescriptor]

'thisAsReceiverParameter' @ [289:80] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'oldDescriptor' @ [290:55] ==> value-parameter oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [290:69] ==> public final val PropertyDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [290:97] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'initialize' @ [292:17] ==> public open fun initialize(@Nullable p0: PropertyGetterDescriptorImpl?, @Nullable p1: PropertySetterDescriptor?): Unit defined in org.jetbrains.kotlin.descriptors.impl.PropertyDescriptorImpl[JavaMethodDescriptor]

'oldDescriptor' @ [293:36] ==> value-parameter oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor[ValueParameterDescriptorImpl]

'getter' @ [293:50] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'let' @ [293:58] ==> @InlineOnly public inline fun <T, R> PropertyGetterDescriptor.let(block: (PropertyGetterDescriptor) -> PropertyGetterDescriptorImpl): PropertyGetterDescriptorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyGetterDescriptor
    <R> -> PropertyGetterDescriptorImpl

'copyPropertyGetterDescriptor' @ [293:64] ==> private final fun copyPropertyGetterDescriptor(oldDescriptor: PropertyGetterDescriptor, newPropertyDescriptor: PropertyDescriptor): PropertyGetterDescriptorImpl defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector[SimpleFunctionDescriptorImpl]

'it' @ [293:93] ==> value-parameter it: PropertyGetterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [293:97] ==> <this> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor.<anonymous>[ReceiverParameterDescriptorImpl]

'oldDescriptor' @ [294:36] ==> value-parameter oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor[ValueParameterDescriptorImpl]

'setter' @ [294:50] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'let' @ [294:58] ==> @InlineOnly public inline fun <T, R> PropertySetterDescriptor.let(block: (PropertySetterDescriptor) -> PropertySetterDescriptorImpl): PropertySetterDescriptorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertySetterDescriptor
    <R> -> PropertySetterDescriptorImpl

'copyPropertySetterDescriptor' @ [294:64] ==> private final fun copyPropertySetterDescriptor(oldDescriptor: PropertySetterDescriptor, newPropertyDescriptor: PropertyDescriptor): PropertySetterDescriptorImpl defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector[SimpleFunctionDescriptorImpl]

'it' @ [294:93] ==> value-parameter it: PropertySetterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [294:97] ==> <this> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor.<anonymous>[ReceiverParameterDescriptorImpl]

'overriddenDescriptors' @ [296:17] ==> public final var PropertyDescriptorImpl.overriddenDescriptors: (MutableCollection<out (PropertyDescriptor..PropertyDescriptor?)>..Collection<(PropertyDescriptor..PropertyDescriptor?)>)[MyPropertyDescriptor]

'oldDescriptor' @ [296:42] ==> value-parameter oldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyDescriptor[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [296:56] ==> public final var PropertyDescriptor.overriddenDescriptors: (MutableCollection<out (PropertyDescriptor..PropertyDescriptor?)>..Collection<(PropertyDescriptor..PropertyDescriptor?)>)[MyPropertyDescriptor]

'PropertyGetterDescriptorImpl' @ [305:20] ==> public constructor PropertyGetterDescriptorImpl(@NotNull p0: PropertyDescriptor, @NotNull p1: Annotations, @NotNull p2: Modality, @NotNull p3: Visibility, p4: Boolean, p5: Boolean, p6: Boolean, @NotNull p7: CallableMemberDescriptor.Kind, @Nullable p8: PropertyGetterDescriptor?, @NotNull p9: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.PropertyGetterDescriptorImpl[JavaClassConstructorDescriptor]

'newPropertyDescriptor' @ [306:47] ==> value-parameter newPropertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyGetterDescriptor[ValueParameterDescriptorImpl]

'oldDescriptor' @ [307:47] ==> value-parameter oldDescriptor: PropertyGetterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyGetterDescriptor[ValueParameterDescriptorImpl]

'annotations' @ [307:61] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.PropertyGetterDescriptor[DeserializedPropertyDescriptor]

'oldDescriptor' @ [308:47] ==> value-parameter oldDescriptor: PropertyGetterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyGetterDescriptor[ValueParameterDescriptorImpl]

'modality' @ [308:61] ==> public final val PropertyGetterDescriptor.modality: Modality[MyPropertyDescriptor]

'oldDescriptor' @ [309:47] ==> value-parameter oldDescriptor: PropertyGetterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyGetterDescriptor[ValueParameterDescriptorImpl]

'visibility' @ [309:61] ==> public final val PropertyGetterDescriptor.visibility: Visibility[MyPropertyDescriptor]

'oldDescriptor' @ [310:47] ==> value-parameter oldDescriptor: PropertyGetterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyGetterDescriptor[ValueParameterDescriptorImpl]

'isDefault' @ [310:61] ==> public final val PropertyGetterDescriptor.isDefault: Boolean[MyPropertyDescriptor]

'oldDescriptor' @ [311:47] ==> value-parameter oldDescriptor: PropertyGetterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyGetterDescriptor[ValueParameterDescriptorImpl]

'isExternal' @ [311:61] ==> public final val PropertyGetterDescriptor.isExternal: Boolean[MyPropertyDescriptor]

'oldDescriptor' @ [312:47] ==> value-parameter oldDescriptor: PropertyGetterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyGetterDescriptor[ValueParameterDescriptorImpl]

'isInline' @ [312:61] ==> public final val PropertyGetterDescriptor.isInline: Boolean[MyPropertyDescriptor]

'oldDescriptor' @ [313:47] ==> value-parameter oldDescriptor: PropertyGetterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyGetterDescriptor[ValueParameterDescriptorImpl]

'kind' @ [313:61] ==> public final val PropertyGetterDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'oldDescriptor' @ [315:47] ==> value-parameter oldDescriptor: PropertyGetterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyGetterDescriptor[ValueParameterDescriptorImpl]

'source' @ [315:61] ==> public final val PropertyGetterDescriptor.source: SourceElement[MyPropertyDescriptor]

'apply' @ [315:69] ==> @InlineOnly public inline fun <T> PropertyGetterDescriptorImpl.apply(block: PropertyGetterDescriptorImpl.() -> Unit): PropertyGetterDescriptorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyGetterDescriptorImpl

'initialize' @ [316:17] ==> public open fun initialize(p0: (KotlinType..KotlinType?)): Unit defined in org.jetbrains.kotlin.descriptors.impl.PropertyGetterDescriptorImpl[JavaMethodDescriptor]

'oldDescriptor' @ [316:28] ==> value-parameter oldDescriptor: PropertyGetterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertyGetterDescriptor[ValueParameterDescriptorImpl]

'returnType' @ [316:42] ==> public final val PropertyGetterDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'PropertySetterDescriptorImpl' @ [325:20] ==> public constructor PropertySetterDescriptorImpl(@NotNull p0: PropertyDescriptor, @NotNull p1: Annotations, @NotNull p2: Modality, @NotNull p3: Visibility, p4: Boolean, p5: Boolean, p6: Boolean, @NotNull p7: CallableMemberDescriptor.Kind, @Nullable p8: PropertySetterDescriptor?, @NotNull p9: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.PropertySetterDescriptorImpl[JavaClassConstructorDescriptor]

'newPropertyDescriptor' @ [326:47] ==> value-parameter newPropertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertySetterDescriptor[ValueParameterDescriptorImpl]

'oldDescriptor' @ [327:47] ==> value-parameter oldDescriptor: PropertySetterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertySetterDescriptor[ValueParameterDescriptorImpl]

'annotations' @ [327:61] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.PropertySetterDescriptor[DeserializedPropertyDescriptor]

'oldDescriptor' @ [328:47] ==> value-parameter oldDescriptor: PropertySetterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertySetterDescriptor[ValueParameterDescriptorImpl]

'modality' @ [328:61] ==> public final val PropertySetterDescriptor.modality: Modality[MyPropertyDescriptor]

'oldDescriptor' @ [329:47] ==> value-parameter oldDescriptor: PropertySetterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertySetterDescriptor[ValueParameterDescriptorImpl]

'visibility' @ [329:61] ==> public final val PropertySetterDescriptor.visibility: Visibility[MyPropertyDescriptor]

'oldDescriptor' @ [330:47] ==> value-parameter oldDescriptor: PropertySetterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertySetterDescriptor[ValueParameterDescriptorImpl]

'isDefault' @ [330:61] ==> public final val PropertySetterDescriptor.isDefault: Boolean[MyPropertyDescriptor]

'oldDescriptor' @ [331:47] ==> value-parameter oldDescriptor: PropertySetterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertySetterDescriptor[ValueParameterDescriptorImpl]

'isExternal' @ [331:61] ==> public final val PropertySetterDescriptor.isExternal: Boolean[MyPropertyDescriptor]

'oldDescriptor' @ [332:47] ==> value-parameter oldDescriptor: PropertySetterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertySetterDescriptor[ValueParameterDescriptorImpl]

'isInline' @ [332:61] ==> public final val PropertySetterDescriptor.isInline: Boolean[MyPropertyDescriptor]

'oldDescriptor' @ [333:47] ==> value-parameter oldDescriptor: PropertySetterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertySetterDescriptor[ValueParameterDescriptorImpl]

'kind' @ [333:61] ==> public final val PropertySetterDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'oldDescriptor' @ [335:47] ==> value-parameter oldDescriptor: PropertySetterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertySetterDescriptor[ValueParameterDescriptorImpl]

'source' @ [335:61] ==> public final val PropertySetterDescriptor.source: SourceElement[MyPropertyDescriptor]

'apply' @ [335:69] ==> @InlineOnly public inline fun <T> PropertySetterDescriptorImpl.apply(block: PropertySetterDescriptorImpl.() -> Unit): PropertySetterDescriptorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertySetterDescriptorImpl

'initialize' @ [336:17] ==> public open fun initialize(@NotNull p0: ValueParameterDescriptor): Unit defined in org.jetbrains.kotlin.descriptors.impl.PropertySetterDescriptorImpl[JavaMethodDescriptor]

'copyValueParameters' @ [336:28] ==> private final fun copyValueParameters(oldValueParameters: List<ValueParameterDescriptor>, containingDeclaration: CallableDescriptor): List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[SimpleFunctionDescriptorImpl]

'oldDescriptor' @ [336:48] ==> value-parameter oldDescriptor: PropertySetterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertySetterDescriptor[ValueParameterDescriptorImpl]

'valueParameters' @ [336:62] ==> public final val PropertySetterDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'this' @ [336:79] ==> <this> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyPropertySetterDescriptor.<anonymous>[ReceiverParameterDescriptorImpl]

'single' @ [336:85] ==> public fun <T> List<ValueParameterDescriptor>.single(): ValueParameterDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor

'oldDescriptor' @ [344:33] ==> value-parameter oldDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyClassDescriptor[ValueParameterDescriptorImpl]

'getSuperClassOrAny' @ [344:47] ==> public fun ClassDescriptor.getSuperClassOrAny(): ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'descriptorSubstituteMap' @ [345:33] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [345:57] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'oldSuperClass' @ [345:70] ==> val oldSuperClass: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyClassDescriptor[LocalVariableDescriptor]

'oldSuperClass' @ [345:85] ==> val oldSuperClass: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyClassDescriptor[LocalVariableDescriptor]

'oldDescriptor' @ [346:44] ==> value-parameter oldDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyClassDescriptor[ValueParameterDescriptorImpl]

'containingDeclaration' @ [346:58] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'descriptorSubstituteMap' @ [347:44] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [347:68] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'oldContainingDeclaration' @ [347:81] ==> val oldContainingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyClassDescriptor[LocalVariableDescriptor]

'oldContainingDeclaration' @ [347:107] ==> val oldContainingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyClassDescriptor[LocalVariableDescriptor]

'if (DescriptorUtils.isAnonymousObject(oldDescriptor))      // Anonymous objects are identified by their name.
                oldDescriptor.name                                                   // We need to preserve it for LocalDeclarationsLowering.
            else
                generateCopyName(oldDescriptor.name)' @ [348:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Name, elseBranch: Name): Name[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Name

'isAnonymousObject' @ [348:47] ==> public open fun isAnonymousObject(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'oldDescriptor' @ [348:65] ==> value-parameter oldDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyClassDescriptor[ValueParameterDescriptorImpl]

'oldDescriptor' @ [349:17] ==> value-parameter oldDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyClassDescriptor[ValueParameterDescriptorImpl]

'name' @ [349:31] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'generateCopyName' @ [351:17] ==> private final fun generateCopyName(name: Name): Name defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector[SimpleFunctionDescriptorImpl]

'oldDescriptor' @ [351:34] ==> value-parameter oldDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyClassDescriptor[ValueParameterDescriptorImpl]

'name' @ [351:48] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'ClassDescriptorImpl' @ [352:20] ==> public constructor ClassDescriptorImpl(@NotNull p0: DeclarationDescriptor, @NotNull p1: Name, @NotNull p2: Modality, @NotNull p3: ClassKind, @NotNull p4: (MutableCollection<(KotlinType..KotlinType?)>..Collection<(KotlinType..KotlinType?)>), @NotNull p5: SourceElement, p6: Boolean) defined in org.jetbrains.kotlin.descriptors.impl.ClassDescriptorImpl[JavaClassConstructorDescriptor]

'newContainingDeclaration' @ [353:47] ==> val newContainingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyClassDescriptor[LocalVariableDescriptor]

'newName' @ [354:47] ==> val newName: Name defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyClassDescriptor[LocalVariableDescriptor]

'oldDescriptor' @ [355:47] ==> value-parameter oldDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyClassDescriptor[ValueParameterDescriptorImpl]

'modality' @ [355:61] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'oldDescriptor' @ [356:47] ==> value-parameter oldDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyClassDescriptor[ValueParameterDescriptorImpl]

'kind' @ [356:61] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'listOf' @ [357:47] ==> public fun <T> listOf(element: SimpleType): List<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'newSuperClass' @ [357:54] ==> val newSuperClass: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyClassDescriptor[LocalVariableDescriptor]

'defaultType' @ [357:68] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'oldDescriptor' @ [358:47] ==> value-parameter oldDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyClassDescriptor[ValueParameterDescriptorImpl]

'source' @ [358:61] ==> public final val ClassDescriptor.source: SourceElement[MyPropertyDescriptor]

'oldDescriptor' @ [359:47] ==> value-parameter oldDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.DescriptorCollector.copyClassDescriptor[ValueParameterDescriptorImpl]

'isExternal' @ [359:61] ==> public final val ClassDescriptor.isExternal: Boolean[MyPropertyDescriptor]

'DeepCopyIrTree' @ [366:32] ==> public constructor DeepCopyIrTree() defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTree[DeserializedClassConstructorDescriptor]

'descriptorSubstituteMap' @ [368:101] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [368:125] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [368:138] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapClassDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [368:150] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapClassDeclaration[ValueParameterDescriptorImpl]

'descriptorSubstituteMap' @ [369:101] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [369:125] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [369:138] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapTypeAliasDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [369:150] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapTypeAliasDeclaration[ValueParameterDescriptorImpl]

'descriptorSubstituteMap' @ [370:101] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [370:125] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [370:138] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapFunctionDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [370:150] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapFunctionDeclaration[ValueParameterDescriptorImpl]

'descriptorSubstituteMap' @ [371:101] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [371:125] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [371:138] ==> value-parameter descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapConstructorDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [371:150] ==> value-parameter descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapConstructorDeclaration[ValueParameterDescriptorImpl]

'descriptorSubstituteMap' @ [372:101] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [372:125] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [372:138] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapPropertyDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [372:150] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapPropertyDeclaration[ValueParameterDescriptorImpl]

'descriptorSubstituteMap' @ [373:101] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [373:125] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [373:138] ==> value-parameter descriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapLocalPropertyDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [373:150] ==> value-parameter descriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapLocalPropertyDeclaration[ValueParameterDescriptorImpl]

'descriptorSubstituteMap' @ [374:101] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [374:125] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [374:138] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapEnumEntryDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [374:150] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapEnumEntryDeclaration[ValueParameterDescriptorImpl]

'descriptorSubstituteMap' @ [375:101] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [375:125] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [375:138] ==> value-parameter descriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapVariableDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [375:150] ==> value-parameter descriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapVariableDeclaration[ValueParameterDescriptorImpl]

'descriptorSubstituteMap' @ [376:101] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [376:125] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [376:138] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapErrorDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [376:150] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapErrorDeclaration[ValueParameterDescriptorImpl]

'descriptorSubstituteMap' @ [378:101] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [378:125] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [378:138] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapClassReference[ValueParameterDescriptorImpl]

'descriptor' @ [378:150] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapClassReference[ValueParameterDescriptorImpl]

'descriptorSubstituteMap' @ [379:101] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [379:125] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [379:138] ==> value-parameter descriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapValueReference[ValueParameterDescriptorImpl]

'descriptor' @ [379:150] ==> value-parameter descriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapValueReference[ValueParameterDescriptorImpl]

'descriptorSubstituteMap' @ [380:101] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [380:125] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [380:138] ==> value-parameter descriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapVariableReference[ValueParameterDescriptorImpl]

'descriptor' @ [380:150] ==> value-parameter descriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapVariableReference[ValueParameterDescriptorImpl]

'descriptorSubstituteMap' @ [381:101] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [381:125] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [381:138] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapPropertyReference[ValueParameterDescriptorImpl]

'descriptor' @ [381:150] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapPropertyReference[ValueParameterDescriptorImpl]

'descriptorSubstituteMap' @ [382:101] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [382:125] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [382:138] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapCallee[ValueParameterDescriptorImpl]

'descriptor' @ [382:150] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapCallee[ValueParameterDescriptorImpl]

'descriptorSubstituteMap' @ [383:101] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [383:125] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [383:138] ==> value-parameter descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapDelegatedConstructorCallee[ValueParameterDescriptorImpl]

'descriptor' @ [383:150] ==> value-parameter descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapDelegatedConstructorCallee[ValueParameterDescriptorImpl]

'descriptorSubstituteMap' @ [384:101] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [384:125] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [384:138] ==> value-parameter descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapEnumConstructorCallee[ValueParameterDescriptorImpl]

'descriptor' @ [384:150] ==> value-parameter descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapEnumConstructorCallee[ValueParameterDescriptorImpl]

'descriptorSubstituteMap' @ [385:101] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [385:125] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [385:138] ==> value-parameter descriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapLocalPropertyReference[ValueParameterDescriptorImpl]

'descriptor' @ [385:150] ==> value-parameter descriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapLocalPropertyReference[ValueParameterDescriptorImpl]

'descriptorSubstituteMap' @ [386:101] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [386:125] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [386:138] ==> value-parameter descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapClassifierReference[ValueParameterDescriptorImpl]

'descriptor' @ [386:150] ==> value-parameter descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapClassifierReference[ValueParameterDescriptorImpl]

'descriptorSubstituteMap' @ [387:101] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [387:125] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [387:138] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapReturnTarget[ValueParameterDescriptorImpl]

'descriptor' @ [387:150] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapReturnTarget[ValueParameterDescriptorImpl]

'qualifier' @ [392:17] ==> value-parameter qualifier: ClassDescriptor? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapSuperQualifier[ValueParameterDescriptorImpl]

'descriptorSubstituteMap' @ [393:20] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'getOrDefault' @ [393:44] ==> @SinceKotlin @PlatformDependent public open fun getOrDefault(key: DeclarationDescriptor, defaultValue: DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'qualifier' @ [393:57] ==> value-parameter qualifier: ClassDescriptor? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapSuperQualifier[ValueParameterDescriptorImpl]

'qualifier' @ [393:69] ==> value-parameter qualifier: ClassDescriptor? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.mapSuperQualifier[ValueParameterDescriptorImpl]

'expression' @ [399:17] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitCall[ValueParameterDescriptorImpl]

'super' @ [399:51] ==> <this> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr[LazyClassReceiverParameterDescriptor]

'visitCall' @ [399:57] ==> public open fun visitCall(expression: IrCall): IrCall defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTree[DeserializedSimpleFunctionDescriptor]

'expression' @ [399:67] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitCall[ValueParameterDescriptorImpl]

'mapCallee' @ [400:33] ==> protected open fun mapCallee(descriptor: FunctionDescriptor): FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr[SimpleFunctionDescriptorImpl]

'expression' @ [400:43] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitCall[ValueParameterDescriptorImpl]

'descriptor' @ [400:54] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'IrCallImpl' @ [401:20] ==> @Deprecated public constructor IrCallImpl(startOffset: Int, endOffset: Int, type: KotlinType, calleeDescriptor: FunctionDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>? = ..., origin: IrStatementOrigin? = ..., superQualifierDescriptor: ClassDescriptor? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedClassConstructorDescriptor]

'expression' @ [402:34] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitCall[ValueParameterDescriptorImpl]

'startOffset' @ [402:45] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'expression' @ [403:34] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitCall[ValueParameterDescriptorImpl]

'endOffset' @ [403:45] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'newDescriptor' @ [404:34] ==> val newDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitCall[LocalVariableDescriptor]

'returnType' @ [404:48] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'newDescriptor' @ [405:36] ==> val newDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitCall[LocalVariableDescriptor]

'substituteTypeArguments' @ [406:34] ==> private final fun substituteTypeArguments(oldTypeArguments: Map<TypeParameterDescriptor, KotlinType>?): Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[SimpleFunctionDescriptorImpl]

'expression' @ [406:58] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitCall[ValueParameterDescriptorImpl]

'transformTypeArguments' @ [406:69] ==> protected final fun IrMemberAccessExpression.transformTypeArguments(newCallee: CallableDescriptor): Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr[DeserializedSimpleFunctionDescriptor]

'newDescriptor' @ [406:92] ==> val newDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitCall[LocalVariableDescriptor]

'expression' @ [407:34] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitCall[ValueParameterDescriptorImpl]

'origin' @ [407:45] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'mapSuperQualifier' @ [408:44] ==> protected open fun mapSuperQualifier(qualifier: ClassDescriptor?): ClassDescriptor? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr[SimpleFunctionDescriptorImpl]

'expression' @ [408:62] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitCall[ValueParameterDescriptorImpl]

'superQualifier' @ [408:73] ==> public abstract val superQualifier: ClassDescriptor? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'transformValueArguments' @ [409:15] ==> protected final fun <T : IrMemberAccessExpression> IrCallImpl.transformValueArguments(original: IrMemberAccessExpression): IrCallImpl defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrMemberAccessExpression> -> IrCallImpl

'expression' @ [409:39] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitCall[ValueParameterDescriptorImpl]

'IrFunctionImpl' @ [415:13] ==> public constructor IrFunctionImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: FunctionDescriptor, body: IrBody?) defined in org.jetbrains.kotlin.ir.declarations.impl.IrFunctionImpl[DeserializedClassConstructorDescriptor]

'declaration' @ [416:31] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitFunction[ValueParameterDescriptorImpl]

'startOffset' @ [416:43] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'declaration' @ [417:31] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitFunction[ValueParameterDescriptorImpl]

'endOffset' @ [417:43] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'mapDeclarationOrigin' @ [418:31] ==> protected open fun mapDeclarationOrigin(declarationOrigin: IrDeclarationOrigin): IrDeclarationOrigin defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr[DeserializedSimpleFunctionDescriptor]

'declaration' @ [418:52] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitFunction[ValueParameterDescriptorImpl]

'origin' @ [418:64] ==> public abstract val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'mapFunctionDeclaration' @ [419:31] ==> protected open fun mapFunctionDeclaration(descriptor: FunctionDescriptor): FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr[SimpleFunctionDescriptorImpl]

'declaration' @ [419:54] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitFunction[ValueParameterDescriptorImpl]

'descriptor' @ [419:66] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'declaration' @ [420:31] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitFunction[ValueParameterDescriptorImpl]

'body' @ [420:43] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'transform' @ [420:49] ==> public open fun <D> transform(transformer: IrElementTransformer<Nothing?>, data: Nothing?): IrBody defined in org.jetbrains.kotlin.ir.expressions.IrBody[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D> -> Nothing?

'this' @ [420:59] ==> <this> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr[LazyClassReceiverParameterDescriptor]

'transformParameters' @ [421:15] ==> protected final fun <T : IrFunction> IrFunction.transformParameters(original: IrFunction): IrFunction defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrFunction> -> IrFunction

'declaration' @ [421:35] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitFunction[ValueParameterDescriptorImpl]

'original' @ [426:44] ==> value-parameter original: T defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.transformDefaults[ValueParameterDescriptorImpl]

'descriptor' @ [426:53] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'valueParameters' @ [426:64] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'descriptor' @ [427:38] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'valueParameters' @ [427:49] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'originalValueParameter' @ [427:65] ==> val originalValueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.transformDefaults[LocalVariableDescriptor]

'index' @ [427:88] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'original' @ [428:17] ==> value-parameter original: T defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.transformDefaults[ValueParameterDescriptorImpl]

'getDefault' @ [428:26] ==> public fun IrFunction.getDefault(parameter: ValueParameterDescriptor): IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations[DeserializedSimpleFunctionDescriptor]

'originalValueParameter' @ [428:37] ==> val originalValueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.transformDefaults[LocalVariableDescriptor]

'let' @ [428:62] ==> @InlineOnly public inline fun <T, R> IrExpressionBody.let(block: (IrExpressionBody) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpressionBody
    <R> -> Unit

'putDefault' @ [429:21] ==> public fun IrFunction.putDefault(parameter: ValueParameterDescriptor, expressionBody: IrExpressionBody): Unit defined in org.jetbrains.kotlin.ir.declarations[DeserializedSimpleFunctionDescriptor]

'valueParameter' @ [429:32] ==> val valueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.transformDefaults[LocalVariableDescriptor]

'irDefaultParameterValue' @ [429:48] ==> value-parameter irDefaultParameterValue: IrExpressionBody defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.transformDefaults.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [429:72] ==> public open fun <D> transform(transformer: IrElementTransformer<Nothing?>, data: Nothing?): IrExpressionBody defined in org.jetbrains.kotlin.ir.expressions.IrExpressionBody[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D> -> Nothing?

'this@InlineCopyIr' @ [429:82] ==> <this> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr[LazyClassReceiverParameterDescriptor]

'this' @ [432:20] ==> <this> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.transformDefaults[ReceiverParameterDescriptorImpl]

'when (operator) {
                IrTypeOperator.CAST,
                IrTypeOperator.IMPLICIT_CAST,
                IrTypeOperator.IMPLICIT_NOTNULL,
                IrTypeOperator.IMPLICIT_COERCION_TO_UNIT,
                IrTypeOperator.IMPLICIT_INTEGER_COERCION    -> type
                IrTypeOperator.SAFE_CAST                    -> type.makeNullable()
                IrTypeOperator.INSTANCEOF,
                IrTypeOperator.NOT_INSTANCEOF               -> context.builtIns.booleanType
            }' @ [438:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinType, entry1: KotlinType, entry2: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinType

'operator' @ [438:26] ==> value-parameter operator: IrTypeOperator defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.getTypeOperatorReturnType[ValueParameterDescriptorImpl]

'CAST' @ [439:32] ==> enum entry CAST defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'IMPLICIT_CAST' @ [440:32] ==> enum entry IMPLICIT_CAST defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'IMPLICIT_NOTNULL' @ [441:32] ==> enum entry IMPLICIT_NOTNULL defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'IMPLICIT_COERCION_TO_UNIT' @ [442:32] ==> enum entry IMPLICIT_COERCION_TO_UNIT defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'IMPLICIT_INTEGER_COERCION' @ [443:32] ==> enum entry IMPLICIT_INTEGER_COERCION defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'type' @ [443:64] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.getTypeOperatorReturnType[ValueParameterDescriptorImpl]

'SAFE_CAST' @ [444:32] ==> enum entry SAFE_CAST defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'type' @ [444:64] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.getTypeOperatorReturnType[ValueParameterDescriptorImpl]

'makeNullable' @ [444:69] ==> public fun KotlinType.makeNullable(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'INSTANCEOF' @ [445:32] ==> enum entry INSTANCEOF defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'NOT_INSTANCEOF' @ [446:32] ==> enum entry NOT_INSTANCEOF defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'context' @ [446:64] ==> public final val context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'builtIns' @ [446:72] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CommonBackendContext[PropertyDescriptorImpl]

'booleanType' @ [446:81] ==> public final val KotlinBuiltIns.booleanType: SimpleType[MyPropertyDescriptor]

'substituteType' @ [453:31] ==> private final fun substituteType(oldType: KotlinType?): KotlinType? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[SimpleFunctionDescriptorImpl]

'expression' @ [453:46] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitTypeOperator[ValueParameterDescriptorImpl]

'typeOperand' @ [453:57] ==> public abstract val typeOperand: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[DeserializedPropertyDescriptor]

'getTypeOperatorReturnType' @ [454:30] ==> public final fun getTypeOperatorReturnType(operator: IrTypeOperator, type: KotlinType): KotlinType defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr[SimpleFunctionDescriptorImpl]

'expression' @ [454:56] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitTypeOperator[ValueParameterDescriptorImpl]

'operator' @ [454:67] ==> public abstract val operator: IrTypeOperator defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[DeserializedPropertyDescriptor]

'typeOperand' @ [454:77] ==> val typeOperand: KotlinType defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitTypeOperator[LocalVariableDescriptor]

'IrTypeOperatorCallImpl' @ [455:20] ==> public constructor IrTypeOperatorCallImpl(startOffset: Int, endOffset: Int, type: KotlinType, operator: IrTypeOperator, typeOperand: KotlinType, argument: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrTypeOperatorCallImpl[DeserializedClassConstructorDescriptor]

'expression' @ [456:31] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitTypeOperator[ValueParameterDescriptorImpl]

'startOffset' @ [456:42] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[DeserializedPropertyDescriptor]

'expression' @ [457:31] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitTypeOperator[ValueParameterDescriptorImpl]

'endOffset' @ [457:42] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[DeserializedPropertyDescriptor]

'returnType' @ [458:31] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitTypeOperator[LocalVariableDescriptor]

'expression' @ [459:31] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitTypeOperator[ValueParameterDescriptorImpl]

'operator' @ [459:42] ==> public abstract val operator: IrTypeOperator defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[DeserializedPropertyDescriptor]

'typeOperand' @ [460:31] ==> val typeOperand: KotlinType defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitTypeOperator[LocalVariableDescriptor]

'expression' @ [461:31] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitTypeOperator[ValueParameterDescriptorImpl]

'argument' @ [461:42] ==> public abstract var argument: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[DeserializedPropertyDescriptor]

'transform' @ [461:51] ==> public open fun <D> transform(transformer: IrElementTransformer<Nothing?>, data: Nothing?): IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D> -> Nothing?

'this' @ [461:61] ==> <this> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr[LazyClassReceiverParameterDescriptor]

'IrReturnImpl' @ [468:13] ==> @Deprecated public constructor IrReturnImpl(startOffset: Int, endOffset: Int, type: KotlinType, returnTargetDescriptor: FunctionDescriptor, value: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnImpl[DeserializedClassConstructorDescriptor]

'expression' @ [469:32] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitReturn[ValueParameterDescriptorImpl]

'startOffset' @ [469:43] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'expression' @ [470:32] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitReturn[ValueParameterDescriptorImpl]

'endOffset' @ [470:43] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'substituteType' @ [471:32] ==> private final fun substituteType(oldType: KotlinType?): KotlinType? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[SimpleFunctionDescriptorImpl]

'expression' @ [471:47] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitReturn[ValueParameterDescriptorImpl]

'type' @ [471:58] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'mapReturnTarget' @ [472:42] ==> protected open fun mapReturnTarget(descriptor: FunctionDescriptor): FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr[SimpleFunctionDescriptorImpl]

'expression' @ [472:58] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitReturn[ValueParameterDescriptorImpl]

'returnTarget' @ [472:69] ==> public abstract val returnTarget: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'expression' @ [473:32] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitReturn[ValueParameterDescriptorImpl]

'value' @ [473:43] ==> public abstract var value: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'transform' @ [473:49] ==> public open fun <D> transform(transformer: IrElementTransformer<Nothing?>, data: Nothing?): IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D> -> Nothing?

'this' @ [473:59] ==> <this> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr[LazyClassReceiverParameterDescriptor]

'if (expression is IrReturnableBlock) {
                IrReturnableBlockImpl(
                    startOffset    = expression.startOffset,
                    endOffset      = expression.endOffset,
                    type           = expression.type,
                    descriptor     = expression.descriptor,
                    origin         = mapStatementOrigin(expression.origin),
                    statements     = expression.statements.map { it.transform(this, null) },
                    sourceFileName = expression.sourceFileName
                )
            } else {
                super.visitBlock(expression)
            }' @ [479:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrBlock, elseBranch: IrBlock): IrBlock[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrBlock

'expression' @ [479:24] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitBlock[ValueParameterDescriptorImpl]

'IrReturnableBlockImpl' @ [480:17] ==> public constructor IrReturnableBlockImpl(startOffset: Int, endOffset: Int, type: KotlinType, descriptor: FunctionDescriptor, origin: IrStatementOrigin?, statements: List<IrStatement>, sourceFileName: String = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl[DeserializedClassConstructorDescriptor]

'expression' @ [481:38] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitBlock[ValueParameterDescriptorImpl]

'startOffset' @ [481:49] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrBlock[DeserializedPropertyDescriptor]

'expression' @ [482:38] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitBlock[ValueParameterDescriptorImpl]

'endOffset' @ [482:49] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrBlock[DeserializedPropertyDescriptor]

'expression' @ [483:38] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitBlock[ValueParameterDescriptorImpl]

'type' @ [483:49] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrBlock[DeserializedPropertyDescriptor]

'expression' @ [484:38] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitBlock[ValueParameterDescriptorImpl]

'descriptor' @ [484:49] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrReturnableBlock[DeserializedPropertyDescriptor]

'mapStatementOrigin' @ [485:38] ==> protected open fun mapStatementOrigin(statementOrigin: IrStatementOrigin?): IrStatementOrigin? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr[DeserializedSimpleFunctionDescriptor]

'expression' @ [485:57] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitBlock[ValueParameterDescriptorImpl]

'origin' @ [485:68] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrBlock[DeserializedPropertyDescriptor]

'expression' @ [486:38] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitBlock[ValueParameterDescriptorImpl]

'statements' @ [486:49] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlock[DeserializedPropertyDescriptor]

'map' @ [486:60] ==> public inline fun <T, R> Iterable<IrStatement>.map(transform: (IrStatement) -> IrStatement): List<IrStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatement
    <R> -> IrStatement

'it' @ [486:66] ==> value-parameter it: IrStatement defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitBlock.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [486:69] ==> public open fun <D> transform(transformer: IrElementTransformer<Nothing?>, data: Nothing?): IrStatement defined in org.jetbrains.kotlin.ir.IrStatement[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D> -> Nothing?

'this' @ [486:79] ==> <this> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr[LazyClassReceiverParameterDescriptor]

'expression' @ [487:38] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitBlock[ValueParameterDescriptorImpl]

'sourceFileName' @ [487:49] ==> public abstract val sourceFileName: String defined in org.jetbrains.kotlin.ir.expressions.IrReturnableBlock[DeserializedPropertyDescriptor]

'super' @ [490:17] ==> <this> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr[LazyClassReceiverParameterDescriptor]

'visitBlock' @ [490:23] ==> public open fun visitBlock(expression: IrBlock): IrBlock defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTree[DeserializedSimpleFunctionDescriptor]

'expression' @ [490:34] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.visitBlock[ValueParameterDescriptorImpl]

'irLoop' @ [495:20] ==> value-parameter irLoop: IrLoop defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.InlineCopyIr.getNonTransformedLoop[ValueParameterDescriptorImpl]

'oldValueParameters' @ [503:16] ==> value-parameter oldValueParameters: List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.copyValueParameters[ValueParameterDescriptorImpl]

'map' @ [503:35] ==> public inline fun <T, R> Iterable<ValueParameterDescriptor>.map(transform: (ValueParameterDescriptor) -> ValueParameterDescriptorImpl): List<ValueParameterDescriptorImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor
    <R> -> ValueParameterDescriptorImpl

'ValueParameterDescriptorImpl' @ [504:33] ==> public constructor ValueParameterDescriptorImpl(containingDeclaration: CallableDescriptor, original: ValueParameterDescriptor?, index: Int, annotations: Annotations, name: Name, outType: KotlinType, declaresDefaultValue: Boolean, isCrossinline: Boolean, isNoinline: Boolean, varargElementType: KotlinType?, source: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.ValueParameterDescriptorImpl[DeserializedClassConstructorDescriptor]

'containingDeclaration' @ [505:41] ==> value-parameter containingDeclaration: CallableDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.copyValueParameters[ValueParameterDescriptorImpl]

'oldDescriptor' @ [506:41] ==> value-parameter oldDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.copyValueParameters.<anonymous>[ValueParameterDescriptorImpl]

'original' @ [506:55] ==> public final val ValueParameterDescriptor.original: ValueParameterDescriptor[MyPropertyDescriptor]

'oldDescriptor' @ [507:41] ==> value-parameter oldDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.copyValueParameters.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [507:55] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'oldDescriptor' @ [508:41] ==> value-parameter oldDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.copyValueParameters.<anonymous>[ValueParameterDescriptorImpl]

'annotations' @ [508:55] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'oldDescriptor' @ [509:41] ==> value-parameter oldDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.copyValueParameters.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [509:55] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'substituteType' @ [510:41] ==> private final fun substituteType(oldType: KotlinType?): KotlinType? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[SimpleFunctionDescriptorImpl]

'oldDescriptor' @ [510:56] ==> value-parameter oldDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.copyValueParameters.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [510:70] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'oldDescriptor' @ [511:41] ==> value-parameter oldDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.copyValueParameters.<anonymous>[ValueParameterDescriptorImpl]

'declaresDefaultValue' @ [511:55] ==> public abstract fun declaresDefaultValue(): Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedSimpleFunctionDescriptor]

'oldDescriptor' @ [512:41] ==> value-parameter oldDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.copyValueParameters.<anonymous>[ValueParameterDescriptorImpl]

'isCrossinline' @ [512:55] ==> public abstract val isCrossinline: Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'oldDescriptor' @ [513:41] ==> value-parameter oldDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.copyValueParameters.<anonymous>[ValueParameterDescriptorImpl]

'isNoinline' @ [513:55] ==> public abstract val isNoinline: Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'substituteType' @ [514:41] ==> private final fun substituteType(oldType: KotlinType?): KotlinType? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[SimpleFunctionDescriptorImpl]

'oldDescriptor' @ [514:56] ==> value-parameter oldDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.copyValueParameters.<anonymous>[ValueParameterDescriptorImpl]

'varargElementType' @ [514:70] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'oldDescriptor' @ [515:41] ==> value-parameter oldDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.copyValueParameters.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [515:55] ==> public final val ValueParameterDescriptor.source: SourceElement[MyPropertyDescriptor]

'descriptorSubstituteMap' @ [517:13] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'oldDescriptor' @ [517:37] ==> value-parameter oldDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.copyValueParameters.<anonymous>[ValueParameterDescriptorImpl]

'newDescriptor' @ [517:54] ==> val newDescriptor: ValueParameterDescriptorImpl defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.copyValueParameters.<anonymous>[LocalVariableDescriptor]

'newDescriptor' @ [518:13] ==> val newDescriptor: ValueParameterDescriptorImpl defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.copyValueParameters.<anonymous>[LocalVariableDescriptor]

'typeSubstitutor' @ [525:13] ==> private final var typeSubstitutor: TypeSubstitutor? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'oldType' @ [525:45] ==> value-parameter oldType: KotlinType? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.substituteType[ValueParameterDescriptorImpl]

'oldType' @ [526:13] ==> value-parameter oldType: KotlinType? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.substituteType[ValueParameterDescriptorImpl]

'oldType' @ [526:45] ==> value-parameter oldType: KotlinType? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.substituteType[ValueParameterDescriptorImpl]

'typeSubstitutor' @ [527:16] ==> private final var typeSubstitutor: TypeSubstitutor? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'substitute' @ [527:34] ==> @Nullable public open fun substitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType? defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'oldType' @ [527:45] ==> value-parameter oldType: KotlinType? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.substituteType[ValueParameterDescriptorImpl]

'INVARIANT' @ [527:63] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'oldType' @ [527:77] ==> value-parameter oldType: KotlinType? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.substituteType[ValueParameterDescriptorImpl]

'oldTypeArguments' @ [534:13] ==> value-parameter oldTypeArguments: Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.substituteTypeArguments[ValueParameterDescriptorImpl]

'typeSubstitutor' @ [535:13] ==> private final var typeSubstitutor: TypeSubstitutor? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'oldTypeArguments' @ [535:46] ==> value-parameter oldTypeArguments: Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.substituteTypeArguments[ValueParameterDescriptorImpl]

'oldTypeArguments' @ [537:32] ==> value-parameter oldTypeArguments: Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.substituteTypeArguments[ValueParameterDescriptorImpl]

'entries' @ [537:49] ==> public abstract val entries: Set<Map.Entry<TypeParameterDescriptor, KotlinType>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'associate' @ [537:57] ==> public inline fun <T, K, V> Iterable<Map.Entry<TypeParameterDescriptor, KotlinType>>.associate(transform: (Map.Entry<TypeParameterDescriptor, KotlinType>) -> Pair<TypeParameterDescriptor, KotlinType>): Map<TypeParameterDescriptor, KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<TypeParameterDescriptor, KotlinType>
    <K> -> TypeParameterDescriptor
    <V> -> KotlinType

'it' @ [538:43] ==> value-parameter it: Map.Entry<TypeParameterDescriptor, KotlinType> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.substituteTypeArguments.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [538:46] ==> public abstract val key: TypeParameterDescriptor defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'it' @ [539:43] ==> value-parameter it: Map.Entry<TypeParameterDescriptor, KotlinType> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.substituteTypeArguments.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [539:46] ==> public abstract val value: KotlinType defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'substituteType' @ [540:43] ==> private final fun substituteType(oldType: KotlinType?): KotlinType? defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[SimpleFunctionDescriptorImpl]

'oldTypeArgument' @ [540:58] ==> val oldTypeArgument: KotlinType defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.substituteTypeArguments.<anonymous>[LocalVariableDescriptor]

'typeParameterDescriptor' @ [541:13] ==> val typeParameterDescriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.substituteTypeArguments.<anonymous>[LocalVariableDescriptor]

'newTypeArgument' @ [541:40] ==> val newTypeArgument: KotlinType defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.substituteTypeArguments.<anonymous>[LocalVariableDescriptor]

'newTypeArguments' @ [543:16] ==> val newTypeArguments: Map<TypeParameterDescriptor, KotlinType> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.substituteTypeArguments[LocalVariableDescriptor]

'descriptorSubstituteMap' @ [549:9] ==> private final val descriptorSubstituteMap: MutableMap<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'forEach' @ [549:33] ==> public final fun forEach(p0: (DeclarationDescriptor, DeclarationDescriptor) -> Unit): Unit defined in kotlin.collections.MutableMap[MyFunctionDescriptor]

'globalSubstituteMap' @ [550:13] ==> value-parameter globalSubstituteMap: MutableMap<DeclarationDescriptor, SubstitutedDescriptor> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.addCurrentSubstituteMap[ValueParameterDescriptorImpl]

'put' @ [550:33] ==> public abstract fun put(key: DeclarationDescriptor, value: SubstitutedDescriptor): SubstitutedDescriptor? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

't' @ [550:37] ==> value-parameter t: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.addCurrentSubstituteMap.<anonymous>[ValueParameterDescriptorImpl]

'SubstitutedDescriptor' @ [550:40] ==> public constructor SubstitutedDescriptor(inlinedFunction: FunctionDescriptor, descriptor: DeclarationDescriptor) defined in org.jetbrains.kotlin.backend.common.SubstitutedDescriptor[ClassConstructorDescriptorImpl]

'targetDescriptor' @ [550:62] ==> public final val targetDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors[PropertyDescriptorImpl]

'u' @ [550:80] ==> value-parameter u: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithDescriptors.addCurrentSubstituteMap.<anonymous>[ValueParameterDescriptorImpl]

'IrElementTransformerVoidWithContext' @ [559:7] ==> public constructor IrElementTransformerVoidWithContext() defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[ClassConstructorDescriptorImpl]

'super' @ [562:29] ==> <this> defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope[LazyClassReceiverParameterDescriptor]

'visitCall' @ [562:35] ==> public open fun visitCall(expression: IrCall): IrExpression defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[DeserializedSimpleFunctionDescriptor]

'expression' @ [562:45] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.visitCall[ValueParameterDescriptorImpl]

'globalSubstituteMap' @ [564:37] ==> public final val globalSubstituteMap: MutableMap<DeclarationDescriptor, SubstitutedDescriptor> defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope[PropertyDescriptorImpl]

'expression' @ [564:57] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.visitCall[ValueParameterDescriptorImpl]

'descriptor' @ [564:68] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'original' @ [564:79] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'oldExpression' @ [565:27] ==> val oldExpression: IrCall defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.visitCall[LocalVariableDescriptor]

'allScopes' @ [566:13] ==> protected final val allScopes: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope[PropertyDescriptorImpl]

'any' @ [566:23] ==> public inline fun <T> Iterable<ScopeWithIr>.any(predicate: (ScopeWithIr) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScopeWithIr

'it' @ [566:29] ==> value-parameter it: ScopeWithIr defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.visitCall.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [566:32] ==> public final val scope: Scope defined in org.jetbrains.kotlin.backend.common.ScopeWithIr[PropertyDescriptorImpl]

'scopeOwner' @ [566:38] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedPropertyDescriptor]

'substitutedDescriptor' @ [566:52] ==> val substitutedDescriptor: SubstitutedDescriptor defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.visitCall[LocalVariableDescriptor]

'inlinedFunction' @ [566:74] ==> public final val inlinedFunction: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.SubstitutedDescriptor[PropertyDescriptorImpl]

'oldExpression' @ [567:20] ==> val oldExpression: IrCall defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.visitCall[LocalVariableDescriptor]

'when (oldExpression) {
            is IrCallImpl -> copyIrCallImpl(oldExpression, substitutedDescriptor)
            is IrCallWithShallowCopy -> copyIrCallWithShallowCopy(oldExpression, substitutedDescriptor)
            else -> oldExpression
        }' @ [568:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrExpression, entry1: IrExpression, entry2: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrExpression

'oldExpression' @ [568:22] ==> val oldExpression: IrCall defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.visitCall[LocalVariableDescriptor]

'copyIrCallImpl' @ [569:30] ==> private final fun copyIrCallImpl(oldExpression: IrCallImpl, substitutedDescriptor: SubstitutedDescriptor): IrCallImpl defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope[SimpleFunctionDescriptorImpl]

'oldExpression' @ [569:45] ==> val oldExpression: IrCall defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.visitCall[LocalVariableDescriptor]

'substitutedDescriptor' @ [569:60] ==> val substitutedDescriptor: SubstitutedDescriptor defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.visitCall[LocalVariableDescriptor]

'copyIrCallWithShallowCopy' @ [570:41] ==> private final fun copyIrCallWithShallowCopy(oldExpression: IrCallWithShallowCopy, substitutedDescriptor: SubstitutedDescriptor): IrCall defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope[SimpleFunctionDescriptorImpl]

'oldExpression' @ [570:67] ==> val oldExpression: IrCall defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.visitCall[LocalVariableDescriptor]

'substitutedDescriptor' @ [570:82] ==> val substitutedDescriptor: SubstitutedDescriptor defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.visitCall[LocalVariableDescriptor]

'oldExpression' @ [571:21] ==> val oldExpression: IrCall defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.visitCall[LocalVariableDescriptor]

'oldExpression' @ [579:29] ==> value-parameter oldExpression: IrCallImpl defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallImpl[ValueParameterDescriptorImpl]

'descriptor' @ [579:43] ==> public open val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedPropertyDescriptor]

'substitutedDescriptor' @ [580:29] ==> value-parameter substitutedDescriptor: SubstitutedDescriptor defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallImpl[ValueParameterDescriptorImpl]

'descriptor' @ [580:51] ==> public final val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.SubstitutedDescriptor[PropertyDescriptorImpl]

'newDescriptor' @ [582:13] ==> val newDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallImpl[LocalVariableDescriptor]

'oldDescriptor' @ [582:30] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallImpl[LocalVariableDescriptor]

'oldExpression' @ [583:20] ==> value-parameter oldExpression: IrCallImpl defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallImpl[ValueParameterDescriptorImpl]

'IrCallImpl' @ [585:29] ==> @Deprecated public constructor IrCallImpl(startOffset: Int, endOffset: Int, type: KotlinType, calleeDescriptor: FunctionDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>? = ..., origin: IrStatementOrigin? = ..., superQualifierDescriptor: ClassDescriptor? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedClassConstructorDescriptor]

'oldExpression' @ [586:44] ==> value-parameter oldExpression: IrCallImpl defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallImpl[ValueParameterDescriptorImpl]

'startOffset' @ [586:58] ==> public open val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedPropertyDescriptor]

'oldExpression' @ [587:44] ==> value-parameter oldExpression: IrCallImpl defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallImpl[ValueParameterDescriptorImpl]

'endOffset' @ [587:58] ==> public open val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedPropertyDescriptor]

'oldExpression' @ [588:44] ==> value-parameter oldExpression: IrCallImpl defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallImpl[ValueParameterDescriptorImpl]

'type' @ [588:58] ==> public open val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedPropertyDescriptor]

'newDescriptor' @ [589:44] ==> val newDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallImpl[LocalVariableDescriptor]

'oldExpression' @ [590:44] ==> value-parameter oldExpression: IrCallImpl defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallImpl[ValueParameterDescriptorImpl]

'typeArguments' @ [590:58] ==> public final val typeArguments: Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedPropertyDescriptor]

'oldExpression' @ [591:44] ==> value-parameter oldExpression: IrCallImpl defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallImpl[ValueParameterDescriptorImpl]

'origin' @ [591:58] ==> public open val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedPropertyDescriptor]

'oldExpression' @ [592:44] ==> value-parameter oldExpression: IrCallImpl defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallImpl[ValueParameterDescriptorImpl]

'superQualifier' @ [592:58] ==> public open val superQualifier: ClassDescriptor? defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedPropertyDescriptor]

'apply' @ [593:11] ==> @InlineOnly public inline fun <T> IrCallImpl.apply(block: IrCallImpl.() -> Unit): IrCallImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrCallImpl

'oldExpression' @ [594:13] ==> value-parameter oldExpression: IrCallImpl defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallImpl[ValueParameterDescriptorImpl]

'descriptor' @ [594:27] ==> public open val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedPropertyDescriptor]

'valueParameters' @ [594:38] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'forEach' @ [594:54] ==> @HidesMembers public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.forEach(action: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'oldExpression' @ [595:37] ==> value-parameter oldExpression: IrCallImpl defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallImpl[ValueParameterDescriptorImpl]

'getValueArgument' @ [595:51] ==> public fun IrMemberAccessExpression.getValueArgument(valueParameterDescriptor: ValueParameterDescriptor): IrExpression? defined in org.jetbrains.kotlin.ir.expressions[DeserializedSimpleFunctionDescriptor]

'it' @ [595:68] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallImpl.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'putValueArgument' @ [596:17] ==> public open fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedSimpleFunctionDescriptor]

'it' @ [596:34] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallImpl.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [596:37] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'valueArgument' @ [596:44] ==> val valueArgument: IrExpression? defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallImpl.<anonymous>.<anonymous>[LocalVariableDescriptor]

'extensionReceiver' @ [598:13] ==> public open var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedPropertyDescriptor]

'oldExpression' @ [598:33] ==> value-parameter oldExpression: IrCallImpl defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallImpl[ValueParameterDescriptorImpl]

'extensionReceiver' @ [598:47] ==> public open var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedPropertyDescriptor]

'dispatchReceiver' @ [599:13] ==> public open var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedPropertyDescriptor]

'oldExpression' @ [599:33] ==> value-parameter oldExpression: IrCallImpl defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallImpl[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [599:47] ==> public open var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedPropertyDescriptor]

'newExpression' @ [602:16] ==> val newExpression: IrCallImpl defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallImpl[LocalVariableDescriptor]

'oldExpression' @ [609:29] ==> value-parameter oldExpression: IrCallWithShallowCopy defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallWithShallowCopy[ValueParameterDescriptorImpl]

'descriptor' @ [609:43] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrCallWithShallowCopy[DeserializedPropertyDescriptor]

'substitutedDescriptor' @ [610:29] ==> value-parameter substitutedDescriptor: SubstitutedDescriptor defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallWithShallowCopy[ValueParameterDescriptorImpl]

'descriptor' @ [610:51] ==> public final val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.SubstitutedDescriptor[PropertyDescriptorImpl]

'newDescriptor' @ [612:13] ==> val newDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallWithShallowCopy[LocalVariableDescriptor]

'oldDescriptor' @ [612:30] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallWithShallowCopy[LocalVariableDescriptor]

'oldExpression' @ [613:20] ==> value-parameter oldExpression: IrCallWithShallowCopy defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallWithShallowCopy[ValueParameterDescriptorImpl]

'oldExpression' @ [615:16] ==> value-parameter oldExpression: IrCallWithShallowCopy defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallWithShallowCopy[ValueParameterDescriptorImpl]

'shallowCopy' @ [615:30] ==> @Deprecated public abstract fun shallowCopy(newOrigin: IrStatementOrigin?, newCallee: FunctionDescriptor, newSuperQualifier: ClassDescriptor?): IrCall defined in org.jetbrains.kotlin.ir.expressions.IrCallWithShallowCopy[DeserializedSimpleFunctionDescriptor]

'oldExpression' @ [615:42] ==> value-parameter oldExpression: IrCallWithShallowCopy defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallWithShallowCopy[ValueParameterDescriptorImpl]

'origin' @ [615:56] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrCallWithShallowCopy[DeserializedPropertyDescriptor]

'newDescriptor' @ [615:64] ==> val newDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallWithShallowCopy[LocalVariableDescriptor]

'oldExpression' @ [615:79] ==> value-parameter oldExpression: IrCallWithShallowCopy defined in org.jetbrains.kotlin.backend.common.DescriptorSubstitutorForExternalScope.copyIrCallWithShallowCopy[ValueParameterDescriptorImpl]

'superQualifier' @ [615:93] ==> public abstract val superQualifier: ClassDescriptor? defined in org.jetbrains.kotlin.ir.expressions.IrCallWithShallowCopy[DeserializedPropertyDescriptor]

