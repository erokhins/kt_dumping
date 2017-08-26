'HashMap' @ [39:45] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ClassDescriptor
    <V : (Any..Any?)> -> PropertyDescriptor

'HashMap' @ [40:40] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ClassDescriptor
    <V : (Any..Any?)> -> PropertyDescriptor

'HashMap' @ [41:42] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ClassConstructorDescriptor
    <V : (Any..Any?)> -> ClassConstructorDescriptor

'singletonFieldDescriptors' @ [44:13] ==> private final val singletonFieldDescriptors: HashMap<ClassDescriptor, PropertyDescriptor> defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory[PropertyDescriptorImpl]

'getOrPut' @ [44:39] ==> public inline fun <K, V> MutableMap<ClassDescriptor, PropertyDescriptor>.getOrPut(key: ClassDescriptor, defaultValue: () -> PropertyDescriptor): PropertyDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ClassDescriptor
    <V> -> PropertyDescriptor

'enumEntryDescriptor' @ [44:48] ==> value-parameter enumEntryDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.getFieldDescriptorForEnumEntry[ValueParameterDescriptorImpl]

'createEnumEntryFieldDescriptor' @ [45:17] ==> private final fun createEnumEntryFieldDescriptor(enumEntryDescriptor: ClassDescriptor): PropertyDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory[SimpleFunctionDescriptorImpl]

'enumEntryDescriptor' @ [45:48] ==> value-parameter enumEntryDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.getFieldDescriptorForEnumEntry[ValueParameterDescriptorImpl]

'psiSourceManager' @ [49:22] ==> private final val psiSourceManager: PsiSourceManager defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory[PropertyDescriptorImpl]

'getKtFile' @ [49:39] ==> public final fun getKtFile(fileEntry: PsiSourceManager.PsiFileEntry): KtFile? defined in org.jetbrains.kotlin.psi2ir.PsiSourceManager[DeserializedSimpleFunctionDescriptor]

'fileEntry' @ [49:49] ==> value-parameter fileEntry: SourceManager.FileEntry defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createFileClassDescriptor[ValueParameterDescriptorImpl]

'AssertionError' @ [50:29] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'fileEntry' @ [50:69] ==> value-parameter fileEntry: SourceManager.FileEntry defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createFileClassDescriptor[ValueParameterDescriptorImpl]

'JvmFileClassUtil' @ [51:29] ==> public object JvmFileClassUtil defined in org.jetbrains.kotlin.fileClasses[FakeCallableDescriptorForObject]

'getFileClassInfoNoResolve' @ [51:46] ==> @JvmStatic public final fun getFileClassInfoNoResolve(file: KtFile): JvmFileClassInfo defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[DeserializedSimpleFunctionDescriptor]

'ktFile' @ [51:72] ==> val ktFile: KtFile defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createFileClassDescriptor[LocalVariableDescriptor]

'KotlinSourceElement' @ [52:29] ==> public constructor KotlinSourceElement(psi: KtElement) defined in org.jetbrains.kotlin.resolve.source.KotlinSourceElement[DeserializedClassConstructorDescriptor]

'ktFile' @ [52:49] ==> val ktFile: KtFile defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createFileClassDescriptor[LocalVariableDescriptor]

'FileClassDescriptorImpl' @ [53:16] ==> public constructor FileClassDescriptorImpl(name: Name, containingDeclaration: PackageFragmentDescriptor, supertypes: List<KotlinType>, sourceElement: SourceElement, annotations: Annotations) defined in org.jetbrains.kotlin.backend.jvm.descriptors.FileClassDescriptorImpl[ClassConstructorDescriptorImpl]

'fileClassInfo' @ [54:17] ==> val fileClassInfo: JvmFileClassInfo defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createFileClassDescriptor[LocalVariableDescriptor]

'fileClassFqName' @ [54:31] ==> public abstract val fileClassFqName: FqName defined in org.jetbrains.kotlin.fileClasses.JvmFileClassInfo[DeserializedPropertyDescriptor]

'shortName' @ [54:47] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'packageFragment' @ [54:60] ==> value-parameter packageFragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createFileClassDescriptor[ValueParameterDescriptorImpl]

'listOf' @ [55:17] ==> public fun <T> listOf(element: SimpleType): List<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'builtIns' @ [55:24] ==> private final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory[PropertyDescriptorImpl]

'anyType' @ [55:33] ==> public final val KotlinBuiltIns.anyType: SimpleType[MyPropertyDescriptor]

'sourceElement' @ [56:17] ==> val sourceElement: KotlinSourceElement defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createFileClassDescriptor[LocalVariableDescriptor]

'Annotations' @ [57:17] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [57:29] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'if (!innerClassDescriptor.isInner) throw AssertionError("Class is not inner: $innerClassDescriptor")
            else outerThisDescriptors.getOrPut(innerClassDescriptor) {
                val outerClassDescriptor = DescriptorUtils.getContainingClass(innerClassDescriptor) ?:
                                           throw AssertionError("No containing class for inner class $innerClassDescriptor")

                JvmPropertyDescriptorImpl.createFinalField(
                        Name.identifier("this$0"), outerClassDescriptor.defaultType, innerClassDescriptor,
                        Annotations.EMPTY, JavaVisibilities.PACKAGE_VISIBILITY, Opcodes.ACC_SYNTHETIC, SourceElement.NO_SOURCE
                )
            }' @ [62:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PropertyDescriptor, elseBranch: PropertyDescriptor): PropertyDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PropertyDescriptor

'!' @ [62:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'innerClassDescriptor' @ [62:18] ==> value-parameter innerClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.getOuterThisFieldDescriptor[ValueParameterDescriptorImpl]

'isInner' @ [62:39] ==> public final val ClassDescriptor.isInner: Boolean[MyPropertyDescriptor]

'AssertionError' @ [62:54] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'innerClassDescriptor' @ [62:91] ==> value-parameter innerClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.getOuterThisFieldDescriptor[ValueParameterDescriptorImpl]

'outerThisDescriptors' @ [63:18] ==> private final val outerThisDescriptors: HashMap<ClassDescriptor, PropertyDescriptor> defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory[PropertyDescriptorImpl]

'getOrPut' @ [63:39] ==> public inline fun <K, V> MutableMap<ClassDescriptor, PropertyDescriptor>.getOrPut(key: ClassDescriptor, defaultValue: () -> PropertyDescriptor): PropertyDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ClassDescriptor
    <V> -> PropertyDescriptor

'innerClassDescriptor' @ [63:48] ==> value-parameter innerClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.getOuterThisFieldDescriptor[ValueParameterDescriptorImpl]

'?:' @ [64:44] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ClassDescriptor?, right: ClassDescriptor): ClassDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ClassDescriptor

'getContainingClass' @ [64:60] ==> @Nullable public open fun getContainingClass(@NotNull p0: DeclarationDescriptor): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'innerClassDescriptor' @ [64:79] ==> value-parameter innerClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.getOuterThisFieldDescriptor[ValueParameterDescriptorImpl]

'AssertionError' @ [65:50] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'innerClassDescriptor' @ [65:103] ==> value-parameter innerClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.getOuterThisFieldDescriptor[ValueParameterDescriptorImpl]

'JvmPropertyDescriptorImpl' @ [67:17] ==> public companion object defined in org.jetbrains.kotlin.backend.jvm.descriptors.JvmPropertyDescriptorImpl[FakeCallableDescriptorForObject]

'createFinalField' @ [67:43] ==> public final fun createFinalField(name: Name, type: KotlinType, classDescriptor: ClassDescriptor, annotations: Annotations, visibility: Visibility, extraFlags: Int, source: SourceElement): PropertyDescriptorImpl defined in org.jetbrains.kotlin.backend.jvm.descriptors.JvmPropertyDescriptorImpl.Companion[SimpleFunctionDescriptorImpl]

'identifier' @ [68:30] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'outerClassDescriptor' @ [68:52] ==> val outerClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.getOuterThisFieldDescriptor.<anonymous>[LocalVariableDescriptor]

'defaultType' @ [68:73] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'innerClassDescriptor' @ [68:86] ==> value-parameter innerClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.getOuterThisFieldDescriptor[ValueParameterDescriptorImpl]

'Annotations' @ [69:25] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [69:37] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'PACKAGE_VISIBILITY' @ [69:61] ==> @NotNull public final val PACKAGE_VISIBILITY: Visibility defined in org.jetbrains.kotlin.load.java.JavaVisibilities[JavaPropertyDescriptor]

'ACC_SYNTHETIC' @ [69:89] ==> public const final val ACC_SYNTHETIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'NO_SOURCE' @ [69:118] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'innerClassConstructor' @ [74:26] ==> value-parameter innerClassConstructor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.getInnerClassConstructorWithOuterThisParameter[ValueParameterDescriptorImpl]

'containingDeclaration' @ [74:48] ==> public final val ClassConstructorDescriptor.containingDeclaration: ClassDescriptor[MyPropertyDescriptor]

'assert' @ [75:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'innerClass' @ [75:16] ==> val innerClass: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.getInnerClassConstructorWithOuterThisParameter[LocalVariableDescriptor]

'isInner' @ [75:27] ==> public final val ClassDescriptor.isInner: Boolean[MyPropertyDescriptor]

'innerClass' @ [75:60] ==> val innerClass: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.getInnerClassConstructorWithOuterThisParameter[LocalVariableDescriptor]

'innerClassConstructors' @ [77:16] ==> private final val innerClassConstructors: HashMap<ClassConstructorDescriptor, ClassConstructorDescriptor> defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory[PropertyDescriptorImpl]

'getOrPut' @ [77:39] ==> public inline fun <K, V> MutableMap<ClassConstructorDescriptor, ClassConstructorDescriptor>.getOrPut(key: ClassConstructorDescriptor, defaultValue: () -> ClassConstructorDescriptor): ClassConstructorDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ClassConstructorDescriptor
    <V> -> ClassConstructorDescriptor

'innerClassConstructor' @ [77:48] ==> value-parameter innerClassConstructor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.getInnerClassConstructorWithOuterThisParameter[ValueParameterDescriptorImpl]

'createInnerClassConstructorWithOuterThisParameter' @ [78:13] ==> private final fun createInnerClassConstructorWithOuterThisParameter(oldDescriptor: ClassConstructorDescriptor): ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory[SimpleFunctionDescriptorImpl]

'innerClassConstructor' @ [78:63] ==> value-parameter innerClassConstructor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.getInnerClassConstructorWithOuterThisParameter[ValueParameterDescriptorImpl]

'oldDescriptor' @ [83:31] ==> value-parameter oldDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createInnerClassConstructorWithOuterThisParameter[ValueParameterDescriptorImpl]

'containingDeclaration' @ [83:45] ==> public final val ClassConstructorDescriptor.containingDeclaration: ClassDescriptor[MyPropertyDescriptor]

'classDescriptor' @ [84:30] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createInnerClassConstructorWithOuterThisParameter[LocalVariableDescriptor]

'containingDeclaration' @ [84:46] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'defaultType' @ [84:88] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'createSynthesized' @ [86:60] ==> @NotNull public open fun createSynthesized(@NotNull p0: ClassDescriptor, @NotNull p1: Annotations, p2: Boolean, @NotNull p3: SourceElement): ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.ClassConstructorDescriptorImpl[JavaMethodDescriptor]

'classDescriptor' @ [87:17] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createInnerClassConstructorWithOuterThisParameter[LocalVariableDescriptor]

'oldDescriptor' @ [87:34] ==> value-parameter oldDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createInnerClassConstructorWithOuterThisParameter[ValueParameterDescriptorImpl]

'annotations' @ [87:48] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor[DeserializedPropertyDescriptor]

'oldDescriptor' @ [87:61] ==> value-parameter oldDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createInnerClassConstructorWithOuterThisParameter[ValueParameterDescriptorImpl]

'isPrimary' @ [87:75] ==> public final val ClassConstructorDescriptor.isPrimary: Boolean[MyPropertyDescriptor]

'oldDescriptor' @ [87:86] ==> value-parameter oldDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createInnerClassConstructorWithOuterThisParameter[ValueParameterDescriptorImpl]

'source' @ [87:100] ==> public final val ClassConstructorDescriptor.source: SourceElement[MyPropertyDescriptor]

'newDescriptor' @ [90:39] ==> val newDescriptor: ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createInnerClassConstructorWithOuterThisParameter[LocalVariableDescriptor]

'createValueParameter' @ [90:53] ==> public fun CallableMemberDescriptor.createValueParameter(index: Int, name: String, type: KotlinType): ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors in file Util.kt[SimpleFunctionDescriptorImpl]

'outerThisType' @ [90:88] ==> val outerThisType: SimpleType defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createInnerClassConstructorWithOuterThisParameter[LocalVariableDescriptor]

'listOf' @ [93:17] ==> public fun <T> listOf(element: ValueParameterDescriptor): List<ValueParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor

'outerThisValueParameter' @ [93:24] ==> val outerThisValueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createInnerClassConstructorWithOuterThisParameter[LocalVariableDescriptor]

'oldDescriptor' @ [94:17] ==> value-parameter oldDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createInnerClassConstructorWithOuterThisParameter[ValueParameterDescriptorImpl]

'valueParameters' @ [94:31] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'map' @ [94:47] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> ValueParameterDescriptor): List<ValueParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> ValueParameterDescriptor

'it' @ [94:53] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createInnerClassConstructorWithOuterThisParameter.<anonymous>[ValueParameterDescriptorImpl]

'copy' @ [94:56] ==> public abstract fun copy(newOwner: CallableDescriptor, newName: Name, newIndex: Int): ValueParameterDescriptor defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedSimpleFunctionDescriptor]

'newDescriptor' @ [94:61] ==> val newDescriptor: ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createInnerClassConstructorWithOuterThisParameter[LocalVariableDescriptor]

'it' @ [94:76] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createInnerClassConstructorWithOuterThisParameter.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [94:79] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'it' @ [94:85] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createInnerClassConstructorWithOuterThisParameter.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [94:88] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'newDescriptor' @ [95:9] ==> val newDescriptor: ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createInnerClassConstructorWithOuterThisParameter[LocalVariableDescriptor]

'initialize' @ [95:23] ==> public open fun initialize(@NotNull p0: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>), @NotNull p1: Visibility): (ClassConstructorDescriptorImpl..ClassConstructorDescriptorImpl?) defined in org.jetbrains.kotlin.descriptors.impl.ClassConstructorDescriptorImpl[JavaMethodDescriptor]

'newValueParameters' @ [95:34] ==> val newValueParameters: List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createInnerClassConstructorWithOuterThisParameter[LocalVariableDescriptor]

'oldDescriptor' @ [95:54] ==> value-parameter oldDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createInnerClassConstructorWithOuterThisParameter[ValueParameterDescriptorImpl]

'visibility' @ [95:68] ==> public final val ClassConstructorDescriptor.visibility: Visibility[MyPropertyDescriptor]

'newDescriptor' @ [96:9] ==> val newDescriptor: ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createInnerClassConstructorWithOuterThisParameter[LocalVariableDescriptor]

'returnType' @ [96:23] ==> public final var ClassConstructorDescriptorImpl.returnType: KotlinType[MyPropertyDescriptor]

'oldDescriptor' @ [96:36] ==> value-parameter oldDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createInnerClassConstructorWithOuterThisParameter[ValueParameterDescriptorImpl]

'returnType' @ [96:50] ==> public final val ClassConstructorDescriptor.returnType: KotlinType[MyPropertyDescriptor]

'newDescriptor' @ [97:16] ==> val newDescriptor: ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createInnerClassConstructorWithOuterThisParameter[LocalVariableDescriptor]

'assert' @ [103:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'enumEntryDescriptor' @ [103:16] ==> value-parameter enumEntryDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createEnumEntryFieldDescriptor[ValueParameterDescriptorImpl]

'kind' @ [103:36] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_ENTRY' @ [103:54] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'enumEntryDescriptor' @ [103:92] ==> value-parameter enumEntryDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createEnumEntryFieldDescriptor[ValueParameterDescriptorImpl]

'enumEntryDescriptor' @ [105:35] ==> value-parameter enumEntryDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createEnumEntryFieldDescriptor[ValueParameterDescriptorImpl]

'containingDeclaration' @ [105:55] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'assert' @ [106:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'enumClassDescriptor' @ [106:16] ==> val enumClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createEnumEntryFieldDescriptor[LocalVariableDescriptor]

'kind' @ [106:36] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_CLASS' @ [106:54] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'enumClassDescriptor' @ [106:92] ==> val enumClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createEnumEntryFieldDescriptor[LocalVariableDescriptor]

'JvmPropertyDescriptorImpl' @ [108:16] ==> public companion object defined in org.jetbrains.kotlin.backend.jvm.descriptors.JvmPropertyDescriptorImpl[FakeCallableDescriptorForObject]

'createStaticVal' @ [108:42] ==> public final fun createStaticVal(name: Name, type: KotlinType, containingDeclaration: DeclarationDescriptor, annotations: Annotations, modality: Modality, visibility: Visibility, extraFlags: Int, source: SourceElement): PropertyDescriptorImpl defined in org.jetbrains.kotlin.backend.jvm.descriptors.JvmPropertyDescriptorImpl.Companion[SimpleFunctionDescriptorImpl]

'enumEntryDescriptor' @ [109:17] ==> value-parameter enumEntryDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createEnumEntryFieldDescriptor[ValueParameterDescriptorImpl]

'name' @ [109:37] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'enumClassDescriptor' @ [110:17] ==> val enumClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createEnumEntryFieldDescriptor[LocalVariableDescriptor]

'defaultType' @ [110:37] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'enumClassDescriptor' @ [111:17] ==> val enumClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createEnumEntryFieldDescriptor[LocalVariableDescriptor]

'enumEntryDescriptor' @ [112:17] ==> value-parameter enumEntryDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createEnumEntryFieldDescriptor[ValueParameterDescriptorImpl]

'annotations' @ [112:37] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.ClassDescriptor[DeserializedPropertyDescriptor]

'Modality' @ [113:17] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'FINAL' @ [113:26] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'PUBLIC' @ [114:30] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'ACC_ENUM' @ [115:25] ==> public const final val ACC_ENUM: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'enumEntryDescriptor' @ [116:17] ==> value-parameter enumEntryDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createEnumEntryFieldDescriptor[ValueParameterDescriptorImpl]

'source' @ [116:37] ==> public final val ClassDescriptor.source: SourceElement[MyPropertyDescriptor]

'singletonFieldDescriptors' @ [121:13] ==> private final val singletonFieldDescriptors: HashMap<ClassDescriptor, PropertyDescriptor> defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory[PropertyDescriptorImpl]

'getOrPut' @ [121:39] ==> public inline fun <K, V> MutableMap<ClassDescriptor, PropertyDescriptor>.getOrPut(key: ClassDescriptor, defaultValue: () -> PropertyDescriptor): PropertyDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ClassDescriptor
    <V> -> PropertyDescriptor

'objectDescriptor' @ [121:48] ==> value-parameter objectDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.getFieldDescriptorForObjectInstance[ValueParameterDescriptorImpl]

'createObjectInstanceFieldDescriptor' @ [122:17] ==> private final fun createObjectInstanceFieldDescriptor(objectDescriptor: ClassDescriptor): PropertyDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory[SimpleFunctionDescriptorImpl]

'objectDescriptor' @ [122:53] ==> value-parameter objectDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.getFieldDescriptorForObjectInstance[ValueParameterDescriptorImpl]

'assert' @ [126:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'objectDescriptor' @ [126:16] ==> value-parameter objectDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createObjectInstanceFieldDescriptor[ValueParameterDescriptorImpl]

'kind' @ [126:33] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'OBJECT' @ [126:51] ==> enum entry OBJECT defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'objectDescriptor' @ [126:84] ==> value-parameter objectDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createObjectInstanceFieldDescriptor[ValueParameterDescriptorImpl]

'create' @ [128:39] ==> @NotNull public open fun create(@NotNull p0: DeclarationDescriptor, @NotNull p1: Annotations, @NotNull p2: Modality, @NotNull p3: Visibility, p4: Boolean, @NotNull p5: Name, @NotNull p6: CallableMemberDescriptor.Kind, @NotNull p7: SourceElement, p8: Boolean, p9: Boolean, p10: Boolean, p11: Boolean, p12: Boolean, p13: Boolean): PropertyDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.PropertyDescriptorImpl[JavaMethodDescriptor]

'objectDescriptor' @ [129:17] ==> value-parameter objectDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createObjectInstanceFieldDescriptor[ValueParameterDescriptorImpl]

'Annotations' @ [130:17] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [130:29] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'Modality' @ [130:36] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'FINAL' @ [130:45] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'PUBLIC' @ [130:65] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'identifier' @ [131:22] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'SYNTHESIZED' @ [132:47] ==> enum entry SYNTHESIZED defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'NO_SOURCE' @ [132:74] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'initialize' @ [134:11] ==> public fun PropertyDescriptorImpl.initialize(type: KotlinType, typeParameters: List<TypeParameterDescriptor> = ..., dispatchReceiverParameter: ReceiverParameterDescriptor? = ..., extensionReceiverParameter: ReceiverParameterDescriptor? = ..., getter: PropertyGetterDescriptorImpl? = ..., setter: PropertySetterDescriptorImpl? = ...): PropertyDescriptorImpl defined in org.jetbrains.kotlin.backend.jvm.descriptors[SimpleFunctionDescriptorImpl]

'objectDescriptor' @ [134:22] ==> value-parameter objectDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory.createObjectInstanceFieldDescriptor[ValueParameterDescriptorImpl]

'defaultType' @ [134:39] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

