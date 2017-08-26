'mapOf' @ [31:37] ==> @InlineOnly public inline fun <K, V> mapOf(): Map<ClassDescriptor, IrClassContext> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ClassDescriptor
    <V> -> IrClassContext

'hashMapOf' @ [33:35] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<IrClass, IrClassContext> /* = HashMap<IrClass, IrClassContext> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IrClass
    <V> -> IrClassContext

'irFile' @ [36:25] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.lower[ValueParameterDescriptorImpl]

'declarations' @ [36:32] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrFile[DeserializedPropertyDescriptor]

'singleOrNull' @ [36:45] ==> public inline fun <T> Iterable<IrDeclaration>.singleOrNull(predicate: (IrDeclaration) -> Boolean): IrDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrDeclaration

'it' @ [36:60] ==> value-parameter it: IrDeclaration defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.lower.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [36:63] ==> public abstract val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrDeclaration[DeserializedPropertyDescriptor]

'if (packageIr != null) {
            visitClass(packageIr as IrClass, null)
            irFile.declarations.filterNot { it == packageIr }.forEach { it.accept(this, irClass2Context[packageIr]!!) }
        } else {
            irFile.accept(this, null)
        }' @ [37:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'packageIr' @ [37:13] ==> val packageIr: IrDeclaration? defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.lower[LocalVariableDescriptor]

'visitClass' @ [38:13] ==> public open fun visitClass(declaration: IrClass, data: IrClassContext?): IrStatement defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext[SimpleFunctionDescriptorImpl]

'packageIr' @ [38:24] ==> val packageIr: IrDeclaration? defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.lower[LocalVariableDescriptor]

'irFile' @ [39:13] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.lower[ValueParameterDescriptorImpl]

'declarations' @ [39:20] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrFile[DeserializedPropertyDescriptor]

'filterNot' @ [39:33] ==> public inline fun <T> Iterable<IrDeclaration>.filterNot(predicate: (IrDeclaration) -> Boolean): List<IrDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrDeclaration

'it' @ [39:45] ==> value-parameter it: IrDeclaration defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.lower.<anonymous>[ValueParameterDescriptorImpl]

'packageIr' @ [39:51] ==> val packageIr: IrDeclaration? defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.lower[LocalVariableDescriptor]

'forEach' @ [39:63] ==> @HidesMembers public inline fun <T> Iterable<IrDeclaration>.forEach(action: (IrDeclaration) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrDeclaration

'it' @ [39:73] ==> value-parameter it: IrDeclaration defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.lower.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [39:76] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<IrElement, IrClassContext>, data: IrClassContext): IrElement defined in org.jetbrains.kotlin.ir.declarations.IrDeclaration[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> IrElement
    <D> -> IrClassContext

'this' @ [39:83] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext[LazyClassReceiverParameterDescriptor]

'irClass2Context' @ [39:89] ==> private final val irClass2Context: HashMap<IrClass, IrClassContext> /* = HashMap<IrClass, IrClassContext> */ defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext[PropertyDescriptorImpl]

'packageIr' @ [39:105] ==> val packageIr: IrDeclaration? defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.lower[LocalVariableDescriptor]

'irFile' @ [41:13] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.lower[ValueParameterDescriptorImpl]

'accept' @ [41:20] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<IrElement, Nothing?>, data: Nothing?): IrElement defined in org.jetbrains.kotlin.ir.declarations.IrFile[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> IrElement
    <D> -> Nothing?

'this' @ [41:27] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext[LazyClassReceiverParameterDescriptor]

'IrClassContext' @ [46:23] ==> public constructor IrClassContext(irClass: IrClass, parent: IrClassContext?) defined in org.jetbrains.kotlin.backend.jvm.lower.IrClassContext[ClassConstructorDescriptorImpl]

'declaration' @ [46:38] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.visitClass[ValueParameterDescriptorImpl]

'data' @ [46:51] ==> value-parameter data: IrClassContext? defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.visitClass[ValueParameterDescriptorImpl]

'irClass2Context' @ [47:9] ==> private final val irClass2Context: HashMap<IrClass, IrClassContext> /* = HashMap<IrClass, IrClassContext> */ defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext[PropertyDescriptorImpl]

'put' @ [47:25] ==> public open fun put(key: IrClass, value: IrClassContext): IrClassContext? defined in java.util.HashMap[JavaMethodDescriptor]

'declaration' @ [47:29] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.visitClass[ValueParameterDescriptorImpl]

'context' @ [47:42] ==> val context: IrClassContext defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.visitClass[LocalVariableDescriptor]

'lowerBefore' @ [48:9] ==> public open fun lowerBefore(irClass: IrClass, data: IrClassContext): Unit defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext[SimpleFunctionDescriptorImpl]

'declaration' @ [48:21] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.visitClass[ValueParameterDescriptorImpl]

'context' @ [48:34] ==> val context: IrClassContext defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.visitClass[LocalVariableDescriptor]

'super' @ [49:21] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext[LazyClassReceiverParameterDescriptor]

'visitClass' @ [49:27] ==> public open fun visitClass(declaration: IrClass, data: IrClassContext?): IrStatement defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformer[DeserializedSimpleFunctionDescriptor]

'declaration' @ [49:38] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.visitClass[ValueParameterDescriptorImpl]

'context' @ [49:51] ==> val context: IrClassContext defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.visitClass[LocalVariableDescriptor]

'lower' @ [50:9] ==> public abstract fun lower(irCLass: IrClass, data: IrClassContext): Unit defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext[SimpleFunctionDescriptorImpl]

'declaration' @ [50:15] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.visitClass[ValueParameterDescriptorImpl]

'context' @ [50:28] ==> val context: IrClassContext defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.visitClass[LocalVariableDescriptor]

'clazz' @ [51:16] ==> val clazz: IrStatement defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.visitClass[LocalVariableDescriptor]

'companion2Context' @ [59:25] ==> private final val companion2Context: Map<ClassDescriptor, IrClassContext> defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext[PropertyDescriptorImpl]

'descriptor' @ [59:43] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.findCompanionFor[ValueParameterDescriptorImpl]

'RuntimeException' @ [59:64] ==> public final fun <init>(p0: (String..String?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'irClass' @ [59:115] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.findCompanionFor[ValueParameterDescriptorImpl]

'descriptor' @ [59:127] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.findCompanionFor[ValueParameterDescriptorImpl]

'assert' @ [60:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'irClass' @ [60:16] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.findCompanionFor[ValueParameterDescriptorImpl]

'companion' @ [60:27] ==> val companion: IrClassContext defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.findCompanionFor[LocalVariableDescriptor]

'parent' @ [60:37] ==> public final val parent: IrClassContext? defined in org.jetbrains.kotlin.backend.jvm.lower.IrClassContext[PropertyDescriptorImpl]

'irClass' @ [60:45] ==> public final val irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.IrClassContext[PropertyDescriptorImpl]

'irClass' @ [60:81] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.findCompanionFor[ValueParameterDescriptorImpl]

'companion' @ [60:94] ==> val companion: IrClassContext defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.findCompanionFor[LocalVariableDescriptor]

'parent' @ [60:104] ==> public final val parent: IrClassContext? defined in org.jetbrains.kotlin.backend.jvm.lower.IrClassContext[PropertyDescriptorImpl]

'irClass' @ [60:112] ==> public final val irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.IrClassContext[PropertyDescriptorImpl]

'companion' @ [61:16] ==> val companion: IrClassContext defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext.findCompanionFor[LocalVariableDescriptor]

