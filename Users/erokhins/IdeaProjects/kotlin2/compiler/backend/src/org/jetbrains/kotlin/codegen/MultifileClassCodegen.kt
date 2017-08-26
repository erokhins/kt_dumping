'asmTypeByFqNameWithoutInnerClasses' @ [63:43] ==> @NotNull public open fun asmTypeByFqNameWithoutInnerClasses(@NotNull fqName: FqName): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'facadeFqName' @ [63:78] ==> private final val facadeFqName: FqName defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'getOnlyPackageFragment' @ [65:35] ==> private final fun getOnlyPackageFragment(packageFqName: FqName, files: Collection<KtFile>, bindingContext: BindingContext): PackageFragmentDescriptor? defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion[SimpleFunctionDescriptorImpl]

'facadeFqName' @ [65:58] ==> private final val facadeFqName: FqName defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'parent' @ [65:71] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'files' @ [65:81] ==> private final val files: Collection<KtFile> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'state' @ [65:88] ==> private final val state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'bindingContext' @ [65:94] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'getCompiledPackageFragment' @ [67:43] ==> private final fun getCompiledPackageFragment(facadeFqName: FqName, state: GenerationState): IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment? defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion[SimpleFunctionDescriptorImpl]

'facadeFqName' @ [67:70] ==> private final val facadeFqName: FqName defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'state' @ [67:84] ==> private final val state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'if (compiledPackageFragment == null)
                emptyList<DeserializedCallableMemberDescriptor>()
            else
                getDeserializedCallables(compiledPackageFragment)' @ [70:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<DeserializedCallableMemberDescriptor>, elseBranch: List<DeserializedCallableMemberDescriptor>): List<DeserializedCallableMemberDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<DeserializedCallableMemberDescriptor>

'compiledPackageFragment' @ [70:17] ==> private final val compiledPackageFragment: IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment? defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'emptyList' @ [71:17] ==> public fun <T> emptyList(): List<DeserializedCallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeserializedCallableMemberDescriptor

'getDeserializedCallables' @ [73:17] ==> private final fun getDeserializedCallables(compiledPackageFragment: PackageFragmentDescriptor): List<DeserializedCallableMemberDescriptor> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[SimpleFunctionDescriptorImpl]

'compiledPackageFragment' @ [73:42] ==> private final val compiledPackageFragment: IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment? defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'compiledPackageFragment' @ [76:13] ==> value-parameter compiledPackageFragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.getDeserializedCallables[ValueParameterDescriptorImpl]

'getMemberScope' @ [76:37] ==> public abstract fun getMemberScope(): MemberScope defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedSimpleFunctionDescriptor]

'getContributedDescriptors' @ [77:22] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'DescriptorKindFilter' @ [77:48] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'CALLABLES' @ [77:69] ==> @field:JvmField public final val CALLABLES: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'MemberScope' @ [77:80] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[FakeCallableDescriptorForObject]

'ALL_NAME_FILTER' @ [77:92] ==> public final val ALL_NAME_FILTER: (Name) -> Boolean defined in org.jetbrains.kotlin.resolve.scopes.MemberScope.Companion[DeserializedPropertyDescriptor]

'filterIsInstance' @ [78:22] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<DeserializedCallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> DeserializedCallableMemberDescriptor

'state' @ [81:13] ==> private final val state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'fileClassesProvider' @ [81:19] ==> public final val fileClassesProvider: CodegenFileClassesProvider defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'getFileClassInfo' @ [81:39] ==> public open fun getFileClassInfo(file: KtFile): JvmFileClassInfo defined in org.jetbrains.kotlin.codegen.CodegenFileClassesProvider[SimpleFunctionDescriptorImpl]

'this' @ [81:56] ==> <this> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.getFileClassFqName[ReceiverParameterDescriptorImpl]

'fileClassFqName' @ [81:62] ==> public abstract val fileClassFqName: FqName defined in org.jetbrains.kotlin.fileClasses.JvmFileClassInfo[DeserializedPropertyDescriptor]

'state' @ [84:13] ==> private final val state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'inheritMultifileParts' @ [84:19] ==> public final val inheritMultifileParts: Boolean defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'run' @ [86:43] ==> @InlineOnly public inline fun <T, R> MultifileClassCodegenImpl.run(block: MultifileClassCodegenImpl.() -> List<String>): List<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MultifileClassCodegenImpl
    <R> -> List<String>

'hashSetOf' @ [87:36] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'files' @ [88:22] ==> private final val files: Collection<KtFile> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'file' @ [89:17] ==> val file: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.partInternalNamesSorted.<anonymous>[LocalVariableDescriptor]

'hasDeclarationsForPartClass' @ [89:22] ==> private final fun KtFile.hasDeclarationsForPartClass(): Boolean defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion[SimpleFunctionDescriptorImpl]

'partInternalNamesSet' @ [90:17] ==> val partInternalNamesSet: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.partInternalNamesSorted.<anonymous>[LocalVariableDescriptor]

'add' @ [90:38] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'file' @ [90:42] ==> val file: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.partInternalNamesSorted.<anonymous>[LocalVariableDescriptor]

'getFileClassFqName' @ [90:47] ==> private final fun KtFile.getFileClassFqName(): FqName defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[SimpleFunctionDescriptorImpl]

'toInternalName' @ [90:68] ==> private final fun FqName.toInternalName(): String defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion[SimpleFunctionDescriptorImpl]

'compiledPackageFragment' @ [93:9] ==> private final val compiledPackageFragment: IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment? defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'let' @ [93:34] ==> @InlineOnly public inline fun <T, R> IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment.let(block: (IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IncrementalMultifileClassPackageFragment
    <R> -> Boolean

'partInternalNamesSet' @ [94:13] ==> val partInternalNamesSet: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.partInternalNamesSorted.<anonymous>[LocalVariableDescriptor]

'addAll' @ [94:34] ==> public open fun addAll(elements: Collection<String>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'it' @ [94:41] ==> value-parameter it: IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.partInternalNamesSorted.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'partsInternalNames' @ [94:44] ==> public final val partsInternalNames: Collection<String> defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment[DeserializedPropertyDescriptor]

'partInternalNamesSet' @ [96:9] ==> val partInternalNamesSet: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.partInternalNamesSorted.<anonymous>[LocalVariableDescriptor]

'sorted' @ [96:30] ==> public fun <T : Comparable<String>> Iterable<String>.sorted(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'run' @ [99:46] ==> @InlineOnly public inline fun <T, R> MultifileClassCodegenImpl.run(block: MultifileClassCodegenImpl.() -> HashMap<String, String> /* = HashMap<String, String> */): HashMap<String, String> /* = HashMap<String, String> */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MultifileClassCodegenImpl
    <R> -> HashMap<String, String>

'hashMapOf' @ [100:22] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<String, String> /* = HashMap<String, String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'..' @ [101:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'partInternalNamesSorted' @ [101:23] ==> private final val partInternalNamesSorted: List<String> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'size' @ [101:47] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'result' @ [102:13] ==> val result: HashMap<String, String> /* = HashMap<String, String> */ defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.superClassForInheritedPart.<anonymous>[LocalVariableDescriptor]

'partInternalNamesSorted' @ [102:20] ==> private final val partInternalNamesSorted: List<String> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'i' @ [102:44] ==> val i: Int defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.superClassForInheritedPart.<anonymous>[LocalVariableDescriptor]

'partInternalNamesSorted' @ [102:50] ==> private final val partInternalNamesSorted: List<String> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'i' @ [102:74] ==> val i: Int defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.superClassForInheritedPart.<anonymous>[LocalVariableDescriptor]

'result' @ [104:9] ==> val result: HashMap<String, String> /* = HashMap<String, String> */ defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.superClassForInheritedPart.<anonymous>[LocalVariableDescriptor]

'hashMapOf' @ [107:43] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<MemberDescriptor, () -> Unit> /* = HashMap<MemberDescriptor, () -> Unit> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> MemberDescriptor
    <V> -> Function0<Unit>

'if (shouldGeneratePartHierarchy)
            superClassForInheritedPart[partInternalName] ?: J_L_OBJECT
        else
            J_L_OBJECT' @ [110:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'shouldGeneratePartHierarchy' @ [110:13] ==> private final val shouldGeneratePartHierarchy: Boolean defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'superClassForInheritedPart' @ [111:13] ==> private final val superClassForInheritedPart: HashMap<String, String> /* = HashMap<String, String> */ defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'partInternalName' @ [111:40] ==> value-parameter partInternalName: String defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.getSuperClassForPart[ValueParameterDescriptorImpl]

'J_L_OBJECT' @ [111:61] ==> private final val J_L_OBJECT: (String..String?) defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion[PropertyDescriptorImpl]

'J_L_OBJECT' @ [113:13] ==> private final val J_L_OBJECT: (String..String?) defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion[PropertyDescriptorImpl]

'ClassBuilderOnDemand' @ [115:32] ==> public constructor ClassBuilderOnDemand(@NotNull createClassBuilder: () -> (ClassBuilder..ClassBuilder?)) defined in org.jetbrains.kotlin.codegen.ClassBuilderOnDemand[JavaClassConstructorDescriptor]

'files' @ [116:26] ==> private final val files: Collection<KtFile> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'firstOrNull' @ [116:32] ==> public fun <T> Iterable<KtFile>.firstOrNull(): KtFile? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'packageFragment' @ [118:37] ==> private final val packageFragment: PackageFragmentDescriptor? defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'compiledPackageFragment' @ [119:40] ==> private final val compiledPackageFragment: IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment? defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'AssertionError' @ [120:46] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'facadeFqName' @ [120:104] ==> private final val facadeFqName: FqName defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'files' @ [120:126] ==> private final val files: Collection<KtFile> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'MultifileClass' @ [122:33] ==> public fun MultifileClass(representativeFile: KtFile?, descriptor: PackageFragmentDescriptor): JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics[DeserializedSimpleFunctionDescriptor]

'originFile' @ [122:48] ==> val originFile: KtFile? defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.classBuilder.<anonymous>[LocalVariableDescriptor]

'actualPackageFragment' @ [122:60] ==> val actualPackageFragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.classBuilder.<anonymous>[LocalVariableDescriptor]

'if (previouslyCompiledCallables.isEmpty())
                    files.singleOrNull { it.hasDeclarationsForPartClass() }
                else
                    null' @ [125:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtFile?, elseBranch: KtFile?): KtFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtFile?

'previouslyCompiledCallables' @ [125:21] ==> private final val previouslyCompiledCallables: List<DeserializedCallableMemberDescriptor> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'isEmpty' @ [125:49] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'files' @ [126:21] ==> private final val files: Collection<KtFile> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'singleOrNull' @ [126:27] ==> public inline fun <T> Iterable<KtFile>.singleOrNull(predicate: (KtFile) -> Boolean): KtFile? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'it' @ [126:42] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.classBuilder.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'hasDeclarationsForPartClass' @ [126:45] ==> private final fun KtFile.hasDeclarationsForPartClass(): Boolean defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion[SimpleFunctionDescriptorImpl]

'if (shouldGeneratePartHierarchy)
                    partInternalNamesSorted.last()
                else
                    J_L_OBJECT' @ [131:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'shouldGeneratePartHierarchy' @ [131:21] ==> private final val shouldGeneratePartHierarchy: Boolean defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'partInternalNamesSorted' @ [132:21] ==> private final val partInternalNamesSorted: List<String> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'last' @ [132:45] ==> public fun <T> List<String>.last(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'J_L_OBJECT' @ [134:21] ==> private final val J_L_OBJECT: (String..String?) defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion[PropertyDescriptorImpl]

'state' @ [136:9] ==> private final val state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'factory' @ [136:15] ==> public final val factory: ClassFileFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'newVisitor' @ [136:23] ==> @NotNull public open fun newVisitor(@NotNull origin: JvmDeclarationOrigin, @NotNull asmType: Type, @NotNull sourceFiles: (MutableCollection<out (PsiFile..PsiFile?)>..Collection<(PsiFile..PsiFile?)>)): ClassBuilder defined in org.jetbrains.kotlin.codegen.ClassFileFactory[JavaMethodDescriptor]

'declarationOrigin' @ [136:34] ==> val declarationOrigin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.classBuilder.<anonymous>[LocalVariableDescriptor]

'facadeClassType' @ [136:53] ==> private final val facadeClassType: Type defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'files' @ [136:70] ==> private final val files: Collection<KtFile> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'apply' @ [136:77] ==> @InlineOnly public inline fun <T> ClassBuilder.apply(block: (ClassBuilder).() -> Unit): ClassBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassBuilder

'defineClass' @ [137:13] ==> public abstract fun defineClass(@Nullable origin: PsiElement?, version: Int, access: Int, @NotNull name: String, @Nullable signature: String?, @NotNull superName: String, @NotNull interfaces: (Array<(String..String?)>..Array<out (String..String?)>)): Unit defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'singleSourceFile' @ [137:25] ==> val singleSourceFile: KtFile? defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.classBuilder.<anonymous>[LocalVariableDescriptor]

'state' @ [137:43] ==> private final val state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'classFileVersion' @ [137:49] ==> public final val classFileVersion: Int defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'FACADE_CLASS_ATTRIBUTES' @ [137:67] ==> private final val FACADE_CLASS_ATTRIBUTES: Int defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion[PropertyDescriptorImpl]

'facadeClassType' @ [138:25] ==> private final val facadeClassType: Type defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'internalName' @ [138:41] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'superClassForFacade' @ [138:61] ==> val superClassForFacade: (String..String?) defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.classBuilder.<anonymous>[LocalVariableDescriptor]

'EMPTY_STRING_ARRAY' @ [138:92] ==> public final val EMPTY_STRING_ARRAY: (Array<(String..String?)>..Array<out (String..String?)>?) defined in com.intellij.util.ArrayUtil[JavaPropertyDescriptor]

'singleSourceFile' @ [139:17] ==> val singleSourceFile: KtFile? defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.classBuilder.<anonymous>[LocalVariableDescriptor]

'visitSource' @ [140:17] ==> public abstract fun visitSource(@NotNull name: String, @Nullable debug: String?): Unit defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'singleSourceFile' @ [140:29] ==> val singleSourceFile: KtFile? defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.classBuilder.<anonymous>[LocalVariableDescriptor]

'name' @ [140:46] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'shouldGeneratePartHierarchy' @ [143:17] ==> private final val shouldGeneratePartHierarchy: Boolean defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'newMethod' @ [144:17] ==> @NotNull public abstract fun newMethod(@NotNull origin: JvmDeclarationOrigin, access: Int, @NotNull name: String, @NotNull desc: String, @Nullable signature: String?, @Nullable exceptions: (Array<(String..String?)>?..Array<out (String..String?)>?)): MethodVisitor defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'OtherOrigin' @ [144:27] ==> public fun OtherOrigin(descriptor: DeclarationDescriptor): JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics[DeserializedSimpleFunctionDescriptor]

'actualPackageFragment' @ [144:39] ==> val actualPackageFragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.classBuilder.<anonymous>[LocalVariableDescriptor]

'ACC_PRIVATE' @ [144:71] ==> public const final val ACC_PRIVATE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'apply' @ [144:113] ==> @InlineOnly public inline fun <T> MethodVisitor.apply(block: (MethodVisitor).() -> Unit): MethodVisitor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MethodVisitor

'visitCode' @ [145:21] ==> public open fun visitCode(): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'visitVarInsn' @ [146:21] ==> public open fun visitVarInsn(p0: Int, p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'ALOAD' @ [146:42] ==> public const final val ALOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'visitMethodInsn' @ [147:21] ==> public open fun visitMethodInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'INVOKESPECIAL' @ [147:45] ==> public const final val INVOKESPECIAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'superClassForFacade' @ [147:60] ==> val superClassForFacade: (String..String?) defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.classBuilder.<anonymous>[LocalVariableDescriptor]

'visitInsn' @ [148:21] ==> public open fun visitInsn(p0: Int): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'RETURN' @ [148:39] ==> public const final val RETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'visitMaxs' @ [149:21] ==> public open fun visitMaxs(p0: Int, p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'visitEnd' @ [150:21] ==> public open fun visitEnd(): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'assert' @ [157:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'delegateGenerationTasks' @ [157:16] ==> private final val delegateGenerationTasks: HashMap<MemberDescriptor, () -> Unit> /* = HashMap<MemberDescriptor, () -> Unit> */ defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'isEmpty' @ [157:40] ==> public open fun isEmpty(): Boolean defined in java.util.HashMap[JavaMethodDescriptor]

'facadeFqName' @ [157:99] ==> private final val facadeFqName: FqName defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'generateCodeForSourceFiles' @ [159:9] ==> private final fun generateCodeForSourceFiles(errorHandler: CompilationErrorHandler): Unit defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[SimpleFunctionDescriptorImpl]

'errorHandler' @ [159:36] ==> value-parameter errorHandler: CompilationErrorHandler defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generate[ValueParameterDescriptorImpl]

'generateDelegatesToPreviouslyCompiledParts' @ [161:9] ==> private final fun generateDelegatesToPreviouslyCompiledParts(): Unit defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[SimpleFunctionDescriptorImpl]

'!' @ [163:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'partInternalNamesSorted' @ [163:14] ==> private final val partInternalNamesSorted: List<String> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'isEmpty' @ [163:38] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'generateMultifileFacadeClass' @ [164:13] ==> private final fun generateMultifileFacadeClass(): Unit defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[SimpleFunctionDescriptorImpl]

'done' @ [167:9] ==> private final fun done(): Unit defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[SimpleFunctionDescriptorImpl]

'files' @ [171:22] ==> private final val files: Collection<KtFile> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'ProgressIndicatorAndCompilationCanceledStatus' @ [172:13] ==> public object ProgressIndicatorAndCompilationCanceledStatus defined in org.jetbrains.kotlin.progress[FakeCallableDescriptorForObject]

'checkCanceled' @ [172:59] ==> @JvmStatic public final fun checkCanceled(): Unit defined in org.jetbrains.kotlin.progress.ProgressIndicatorAndCompilationCanceledStatus[DeserializedSimpleFunctionDescriptor]

'generatePart' @ [174:17] ==> private final fun generatePart(file: KtFile): Unit defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[SimpleFunctionDescriptorImpl]

'file' @ [174:30] ==> val file: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateCodeForSourceFiles[LocalVariableDescriptor]

'state' @ [175:17] ==> private final val state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'afterIndependentPart' @ [175:23] ==> public final fun afterIndependentPart(): Unit defined in org.jetbrains.kotlin.codegen.state.GenerationState[SimpleFunctionDescriptorImpl]

'e' @ [178:23] ==> val e: ProcessCanceledException defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateCodeForSourceFiles[LocalVariableDescriptor]

'file' @ [181:29] ==> val file: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateCodeForSourceFiles[LocalVariableDescriptor]

'virtualFile' @ [181:34] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'errorHandler' @ [182:17] ==> value-parameter errorHandler: CompilationErrorHandler defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateCodeForSourceFiles[ValueParameterDescriptorImpl]

'reportException' @ [182:30] ==> public abstract fun reportException(exception: (Throwable..Throwable?), fileUrl: (String..String?)): Unit defined in org.jetbrains.kotlin.codegen.CompilationErrorHandler[JavaMethodDescriptor]

'e' @ [182:46] ==> val e: Throwable defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateCodeForSourceFiles[LocalVariableDescriptor]

'if (vFile == null) "no file" else vFile.url' @ [182:49] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'vFile' @ [182:53] ==> val vFile: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateCodeForSourceFiles[LocalVariableDescriptor]

'vFile' @ [182:83] ==> val vFile: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateCodeForSourceFiles[LocalVariableDescriptor]

'url' @ [182:89] ==> public final val VirtualFile.url: String[MyPropertyDescriptor]

'throwIfRunningOnServer' @ [183:33] ==> public open fun throwIfRunningOnServer(p0: (Throwable..Throwable?)): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticUtils[JavaMethodDescriptor]

'e' @ [183:56] ==> val e: Throwable defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateCodeForSourceFiles[LocalVariableDescriptor]

'getApplication' @ [184:40] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isInternal' @ [184:57] ==> public final val Application.isInternal: Boolean[MyPropertyDescriptor]

'e' @ [186:21] ==> val e: Throwable defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateCodeForSourceFiles[LocalVariableDescriptor]

'printStackTrace' @ [186:23] ==> public open fun printStackTrace(): Unit defined in kotlin.Throwable[JavaMethodDescriptor]

'delegateGenerationTasks' @ [193:24] ==> private final val delegateGenerationTasks: HashMap<MemberDescriptor, () -> Unit> /* = HashMap<MemberDescriptor, () -> Unit> */ defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'keys' @ [193:48] ==> public open val keys: MutableSet<MemberDescriptor> defined in java.util.HashMap[JavaPropertyDescriptor]

'sortedWith' @ [193:53] ==> public fun <T> Iterable<MemberDescriptor>.sortedWith(comparator: Comparator<in MemberDescriptor> /* = Comparator<in MemberDescriptor> */): List<MemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberDescriptor

'INSTANCE' @ [193:81] ==> public final val INSTANCE: (MemberComparator..MemberComparator?) defined in org.jetbrains.kotlin.resolve.MemberComparator[JavaPropertyDescriptor]

'delegateGenerationTasks' @ [194:13] ==> private final val delegateGenerationTasks: HashMap<MemberDescriptor, () -> Unit> /* = HashMap<MemberDescriptor, () -> Unit> */ defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'member' @ [194:37] ==> val member: MemberDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateMultifileFacadeClass[LocalVariableDescriptor]

'writeKotlinMultifileFacadeAnnotationIfNeeded' @ [197:9] ==> private final fun writeKotlinMultifileFacadeAnnotationIfNeeded(): Unit defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[SimpleFunctionDescriptorImpl]

'genClassOrObject' @ [201:23] ==> public open fun genClassOrObject(@NotNull parentContext: raw (CodegenContext<(DeclarationDescriptor..DeclarationDescriptor?)>..CodegenContext<*>), @NotNull aClass: KtClassOrObject, @NotNull state: GenerationState, @Nullable parentCodegen: MemberCodegen<*>?): Unit defined in org.jetbrains.kotlin.codegen.MemberCodegen[JavaMethodDescriptor]

'packagePartContext' @ [201:40] ==> value-parameter packagePartContext: FieldOwnerContext<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateClassOrObject[ValueParameterDescriptorImpl]

'classOrObject' @ [201:60] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateClassOrObject[ValueParameterDescriptorImpl]

'state' @ [201:75] ==> private final val state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'this' @ [205:31] ==> <this> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[LazyClassReceiverParameterDescriptor]

'packageFragment' @ [205:36] ==> private final val packageFragment: PackageFragmentDescriptor? defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'AssertionError' @ [206:40] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'file' @ [206:67] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generatePart[ValueParameterDescriptorImpl]

'facadeFqName' @ [206:76] ==> private final val facadeFqName: FqName defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'file' @ [208:24] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generatePart[ValueParameterDescriptorImpl]

'getFileClassFqName' @ [208:29] ==> private final fun KtFile.getFileClassFqName(): FqName defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[SimpleFunctionDescriptorImpl]

'toAsmType' @ [208:50] ==> private final fun FqName.toAsmType(): Type defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion[SimpleFunctionDescriptorImpl]

'state' @ [209:27] ==> private final val state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'rootContext' @ [209:33] ==> public final val rootContext: CodegenContext<*> defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'intoMultifileClassPart' @ [209:45] ==> @NotNull public open fun intoMultifileClassPart(@NotNull descriptor: PackageFragmentDescriptor, @NotNull multifileClassType: Type, @NotNull filePartType: Type, @NotNull sourceFile: KtFile): MultifileClassPartContext defined in org.jetbrains.kotlin.codegen.context.CodegenContext[JavaMethodDescriptor]

'packageFragment' @ [209:68] ==> val packageFragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generatePart[LocalVariableDescriptor]

'facadeClassType' @ [209:85] ==> private final val facadeClassType: Type defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'partType' @ [209:102] ==> val partType: Type defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generatePart[LocalVariableDescriptor]

'file' @ [209:112] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generatePart[ValueParameterDescriptorImpl]

'generateNonPartClassDeclarations' @ [211:9] ==> private final fun generateNonPartClassDeclarations(file: KtFile, partContext: FieldOwnerContext<PackageFragmentDescriptor>): Unit defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[SimpleFunctionDescriptorImpl]

'file' @ [211:42] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generatePart[ValueParameterDescriptorImpl]

'partContext' @ [211:48] ==> val partContext: MultifileClassPartContext defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generatePart[LocalVariableDescriptor]

'!' @ [213:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'state' @ [213:14] ==> private final val state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'generateDeclaredClassFilter' @ [213:20] ==> public final val generateDeclaredClassFilter: GenerationState.GenerateClassFilter defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'shouldGeneratePackagePart' @ [213:48] ==> public abstract fun shouldGeneratePackagePart(ktFile: KtFile): Boolean defined in org.jetbrains.kotlin.codegen.state.GenerationState.GenerateClassFilter[SimpleFunctionDescriptorImpl]

'file' @ [213:74] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generatePart[ValueParameterDescriptorImpl]

'!' @ [213:83] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'file' @ [213:84] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generatePart[ValueParameterDescriptorImpl]

'hasDeclarationsForPartClass' @ [213:89] ==> private final fun KtFile.hasDeclarationsForPartClass(): Boolean defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion[SimpleFunctionDescriptorImpl]

'packagePartRegistry' @ [215:9] ==> private final val packagePartRegistry: PackagePartRegistry defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'addPart' @ [215:29] ==> public abstract fun addPart(partShortName: String, facadeShortName: String?): Unit defined in org.jetbrains.kotlin.codegen.PackagePartRegistry[SimpleFunctionDescriptorImpl]

'partType' @ [215:37] ==> val partType: Type defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generatePart[LocalVariableDescriptor]

'internalName' @ [215:46] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'substringAfterLast' @ [215:59] ==> public fun String.substringAfterLast(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'facadeClassType' @ [215:84] ==> private final val facadeClassType: Type defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'internalName' @ [215:100] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'substringAfterLast' @ [215:113] ==> public fun String.substringAfterLast(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'state' @ [217:23] ==> private final val state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'factory' @ [217:29] ==> public final val factory: ClassFileFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'newVisitor' @ [217:37] ==> @NotNull public open fun newVisitor(@NotNull origin: JvmDeclarationOrigin, @NotNull asmType: Type, @NotNull sourceFile: PsiFile): ClassBuilder defined in org.jetbrains.kotlin.codegen.ClassFileFactory[JavaMethodDescriptor]

'MultifileClassPart' @ [217:48] ==> public fun MultifileClassPart(file: KtFile, descriptor: PackageFragmentDescriptor): JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics[DeserializedSimpleFunctionDescriptor]

'file' @ [217:67] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generatePart[ValueParameterDescriptorImpl]

'packageFragment' @ [217:73] ==> val packageFragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generatePart[LocalVariableDescriptor]

'partType' @ [217:91] ==> val partType: Type defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generatePart[LocalVariableDescriptor]

'file' @ [217:101] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generatePart[ValueParameterDescriptorImpl]

'MultifileClassPartCodegen' @ [219:9] ==> public constructor MultifileClassPartCodegen(v: ClassBuilder, file: KtFile, packageFragment: PackageFragmentDescriptor, superClassInternalName: String, shouldGeneratePartHierarchy: Boolean, partContext: MultifileClassPartContext, state: GenerationState) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[ClassConstructorDescriptorImpl]

'builder' @ [220:17] ==> val builder: ClassBuilder defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generatePart[LocalVariableDescriptor]

'file' @ [220:26] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generatePart[ValueParameterDescriptorImpl]

'packageFragment' @ [220:32] ==> val packageFragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generatePart[LocalVariableDescriptor]

'getSuperClassForPart' @ [221:17] ==> private final fun getSuperClassForPart(partInternalName: String): (String..String?) defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[SimpleFunctionDescriptorImpl]

'partType' @ [221:38] ==> val partType: Type defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generatePart[LocalVariableDescriptor]

'internalName' @ [221:47] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'shouldGeneratePartHierarchy' @ [222:17] ==> private final val shouldGeneratePartHierarchy: Boolean defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'partContext' @ [223:17] ==> val partContext: MultifileClassPartContext defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generatePart[LocalVariableDescriptor]

'state' @ [223:30] ==> private final val state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'generate' @ [224:11] ==> public open fun generate(): Unit defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[SimpleFunctionDescriptorImpl]

'addDelegateGenerationTasksForDeclarationsInFile' @ [226:9] ==> private final fun addDelegateGenerationTasksForDeclarationsInFile(file: KtFile, packageFragment: PackageFragmentDescriptor, partType: Type): Unit defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[SimpleFunctionDescriptorImpl]

'file' @ [226:57] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generatePart[ValueParameterDescriptorImpl]

'packageFragment' @ [226:63] ==> val packageFragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generatePart[LocalVariableDescriptor]

'partType' @ [226:80] ==> val partType: Type defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generatePart[LocalVariableDescriptor]

'file' @ [230:29] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateNonPartClassDeclarations[ValueParameterDescriptorImpl]

'declarations' @ [230:34] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'when (declaration) {
                is KtClassOrObject ->
                    if (state.generateDeclaredClassFilter.shouldGenerateClass(declaration)) {
                        generateClassOrObject(declaration, partContext)
                    }
                is KtScript ->
                    if (state.generateDeclaredClassFilter.shouldGenerateScript(declaration)) {
                        ScriptCodegen.createScriptCodegen(declaration, state, partContext).generate()
                    }
            }' @ [231:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'declaration' @ [231:19] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateNonPartClassDeclarations[LocalVariableDescriptor]

'state' @ [233:25] ==> private final val state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'generateDeclaredClassFilter' @ [233:31] ==> public final val generateDeclaredClassFilter: GenerationState.GenerateClassFilter defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'shouldGenerateClass' @ [233:59] ==> public abstract fun shouldGenerateClass(processingClassOrObject: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.codegen.state.GenerationState.GenerateClassFilter[SimpleFunctionDescriptorImpl]

'declaration' @ [233:79] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateNonPartClassDeclarations[LocalVariableDescriptor]

'generateClassOrObject' @ [234:25] ==> public open fun generateClassOrObject(classOrObject: KtClassOrObject, packagePartContext: FieldOwnerContext<PackageFragmentDescriptor>): Unit defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[SimpleFunctionDescriptorImpl]

'declaration' @ [234:47] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateNonPartClassDeclarations[LocalVariableDescriptor]

'partContext' @ [234:60] ==> value-parameter partContext: FieldOwnerContext<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateNonPartClassDeclarations[ValueParameterDescriptorImpl]

'state' @ [237:25] ==> private final val state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'generateDeclaredClassFilter' @ [237:31] ==> public final val generateDeclaredClassFilter: GenerationState.GenerateClassFilter defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'shouldGenerateScript' @ [237:59] ==> public abstract fun shouldGenerateScript(script: KtScript): Boolean defined in org.jetbrains.kotlin.codegen.state.GenerationState.GenerateClassFilter[SimpleFunctionDescriptorImpl]

'declaration' @ [237:80] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateNonPartClassDeclarations[LocalVariableDescriptor]

'createScriptCodegen' @ [238:39] ==> public open fun createScriptCodegen(@NotNull declaration: KtScript, @NotNull state: GenerationState, @NotNull parentContext: raw (CodegenContext<(DeclarationDescriptor..DeclarationDescriptor?)>..CodegenContext<*>)): (ScriptCodegen..ScriptCodegen?) defined in org.jetbrains.kotlin.codegen.ScriptCodegen[JavaMethodDescriptor]

'declaration' @ [238:59] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateNonPartClassDeclarations[LocalVariableDescriptor]

'state' @ [238:72] ==> private final val state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'partContext' @ [238:79] ==> value-parameter partContext: FieldOwnerContext<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateNonPartClassDeclarations[ValueParameterDescriptorImpl]

'generate' @ [238:92] ==> public open fun generate(): Unit defined in org.jetbrains.kotlin.codegen.ScriptCodegen[JavaMethodDescriptor]

'state' @ [245:29] ==> private final val state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'rootContext' @ [245:35] ==> public final val rootContext: CodegenContext<*> defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'intoMultifileClass' @ [245:47] ==> @NotNull public open fun intoMultifileClass(@NotNull descriptor: PackageFragmentDescriptor, @NotNull multifileClassType: Type, @NotNull filePartType: Type): FieldOwnerContext<(PackageFragmentDescriptor..PackageFragmentDescriptor?)> defined in org.jetbrains.kotlin.codegen.context.CodegenContext[JavaMethodDescriptor]

'packageFragment' @ [245:66] ==> value-parameter packageFragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.addDelegateGenerationTasksForDeclarationsInFile[ValueParameterDescriptorImpl]

'facadeClassType' @ [245:83] ==> private final val facadeClassType: Type defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'partType' @ [245:100] ==> value-parameter partType: Type defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.addDelegateGenerationTasksForDeclarationsInFile[ValueParameterDescriptorImpl]

'createCodegenForDelegatesInMultifileFacade' @ [246:29] ==> private final fun createCodegenForDelegatesInMultifileFacade(facadeContext: FieldOwnerContext<*>): MemberCodegen<KtFile> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[SimpleFunctionDescriptorImpl]

'facadeContext' @ [246:72] ==> val facadeContext: FieldOwnerContext<(PackageFragmentDescriptor..PackageFragmentDescriptor?)> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.addDelegateGenerationTasksForDeclarationsInFile[LocalVariableDescriptor]

'file' @ [247:29] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.addDelegateGenerationTasksForDeclarationsInFile[ValueParameterDescriptorImpl]

'declarations' @ [247:34] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'declaration' @ [248:17] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.addDelegateGenerationTasksForDeclarationsInFile[LocalVariableDescriptor]

'declaration' @ [248:51] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.addDelegateGenerationTasksForDeclarationsInFile[LocalVariableDescriptor]

'declaration' @ [248:80] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.addDelegateGenerationTasksForDeclarationsInFile[LocalVariableDescriptor]

'state' @ [249:34] ==> private final val state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'bindingContext' @ [249:40] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'get' @ [249:55] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?), p1: (PsiElement..PsiElement?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> DeclarationDescriptor

'DECLARATION_TO_DESCRIPTOR' @ [249:74] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'declaration' @ [249:101] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.addDelegateGenerationTasksForDeclarationsInFile[LocalVariableDescriptor]

'descriptor' @ [250:21] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.addDelegateGenerationTasksForDeclarationsInFile[LocalVariableDescriptor]

'AssertionError' @ [251:27] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'+' @ [251:42] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [251:77] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.addDelegateGenerationTasksForDeclarationsInFile[LocalVariableDescriptor]

'declaration' @ [251:100] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.addDelegateGenerationTasksForDeclarationsInFile[LocalVariableDescriptor]

'text' @ [251:112] ==> public final val KtDeclaration.text: (String..String?)[MyPropertyDescriptor]

'addDelegateGenerationTaskIfNeeded' @ [253:17] ==> private final fun addDelegateGenerationTaskIfNeeded(callable: MemberDescriptor, task: () -> Unit): Unit defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[SimpleFunctionDescriptorImpl]

'descriptor' @ [253:51] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.addDelegateGenerationTasksForDeclarationsInFile[LocalVariableDescriptor]

'memberCodegen' @ [253:65] ==> val memberCodegen: MemberCodegen<KtFile> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.addDelegateGenerationTasksForDeclarationsInFile[LocalVariableDescriptor]

'genSimpleMember' @ [253:79] ==> public open fun genSimpleMember(@NotNull declaration: KtDeclaration): Unit defined in org.jetbrains.kotlin.codegen.MemberCodegen[JavaMethodDescriptor]

'declaration' @ [253:95] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.addDelegateGenerationTasksForDeclarationsInFile[LocalVariableDescriptor]

'isPrivate' @ [259:26] ==> public open fun isPrivate(@NotNull p0: Visibility): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'descriptor' @ [259:36] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.shouldGenerateInFacade[ValueParameterDescriptorImpl]

'visibility' @ [259:47] ==> public final val MemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'==' @ [260:13] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'getVisibilityAccessFlag' @ [260:21] ==> public open fun getVisibilityAccessFlag(@NotNull descriptor: MemberDescriptor): Int defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'descriptor' @ [260:45] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.shouldGenerateInFacade[ValueParameterDescriptorImpl]

'ACC_PRIVATE' @ [260:68] ==> public const final val ACC_PRIVATE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'!' @ [262:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'state' @ [262:14] ==> private final val state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'classBuilderMode' @ [262:20] ==> public final val classBuilderMode: ClassBuilderMode defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'generateBodies' @ [262:37] ==> public final val generateBodies: Boolean defined in org.jetbrains.kotlin.codegen.ClassBuilderMode[JavaPropertyDescriptor]

'shouldGeneratePartHierarchy' @ [264:13] ==> private final val shouldGeneratePartHierarchy: Boolean defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'descriptor' @ [265:17] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.shouldGenerateInFacade[ValueParameterDescriptorImpl]

'!' @ [265:54] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [265:55] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.shouldGenerateInFacade[ValueParameterDescriptorImpl]

'isConst' @ [265:66] ==> public final val PropertyDescriptor.isConst: Boolean[MyPropertyDescriptor]

'shouldGenerateInFacade' @ [272:13] ==> private final fun shouldGenerateInFacade(descriptor: MemberDescriptor): Boolean defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[SimpleFunctionDescriptorImpl]

'callable' @ [272:36] ==> value-parameter callable: MemberDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.addDelegateGenerationTaskIfNeeded[ValueParameterDescriptorImpl]

'delegateGenerationTasks' @ [273:13] ==> private final val delegateGenerationTasks: HashMap<MemberDescriptor, () -> Unit> /* = HashMap<MemberDescriptor, () -> Unit> */ defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'callable' @ [273:37] ==> value-parameter callable: MemberDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.addDelegateGenerationTaskIfNeeded[ValueParameterDescriptorImpl]

'task' @ [273:49] ==> value-parameter task: () -> Unit defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.addDelegateGenerationTaskIfNeeded[ValueParameterDescriptorImpl]

'compiledPackageFragment' @ [278:13] ==> private final val compiledPackageFragment: IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment? defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'previouslyCompiledCallables' @ [280:26] ==> private final val previouslyCompiledCallables: List<DeserializedCallableMemberDescriptor> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'JvmFileClassUtil' @ [281:30] ==> public object JvmFileClassUtil defined in org.jetbrains.kotlin.fileClasses[FakeCallableDescriptorForObject]

'getPartFqNameForDeserialized' @ [281:47] ==> @JvmStatic public final fun getPartFqNameForDeserialized(deserializedMemberDescriptor: DeserializedMemberDescriptor): FqName defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[DeserializedSimpleFunctionDescriptor]

'callable' @ [281:76] ==> val callable: DeserializedCallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateDelegatesToPreviouslyCompiledParts[LocalVariableDescriptor]

'asmTypeByFqNameWithoutInnerClasses' @ [282:36] ==> @NotNull public open fun asmTypeByFqNameWithoutInnerClasses(@NotNull fqName: FqName): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'partFqName' @ [282:71] ==> val partFqName: FqName defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateDelegatesToPreviouslyCompiledParts[LocalVariableDescriptor]

'addDelegateGenerationTaskIfNeeded' @ [284:13] ==> private final fun addDelegateGenerationTaskIfNeeded(callable: MemberDescriptor, task: () -> Unit): Unit defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[SimpleFunctionDescriptorImpl]

'callable' @ [284:47] ==> val callable: DeserializedCallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateDelegatesToPreviouslyCompiledParts[LocalVariableDescriptor]

'generateDelegateToCompiledMember' @ [284:59] ==> private final fun generateDelegateToCompiledMember(member: CallableMemberDescriptor, compiledPackageFragment: PackageFragmentDescriptor, partType: Type): Unit defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[SimpleFunctionDescriptorImpl]

'callable' @ [284:92] ==> val callable: DeserializedCallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateDelegatesToPreviouslyCompiledParts[LocalVariableDescriptor]

'compiledPackageFragment' @ [284:102] ==> private final val compiledPackageFragment: IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment? defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'partType' @ [284:127] ==> val partType: Type defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateDelegatesToPreviouslyCompiledParts[LocalVariableDescriptor]

'state' @ [293:23] ==> private final val state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'rootContext' @ [293:29] ==> public final val rootContext: CodegenContext<*> defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'intoMultifileClass' @ [293:41] ==> @NotNull public open fun intoMultifileClass(@NotNull descriptor: PackageFragmentDescriptor, @NotNull multifileClassType: Type, @NotNull filePartType: Type): FieldOwnerContext<(PackageFragmentDescriptor..PackageFragmentDescriptor?)> defined in org.jetbrains.kotlin.codegen.context.CodegenContext[JavaMethodDescriptor]

'compiledPackageFragment' @ [293:60] ==> value-parameter compiledPackageFragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateDelegateToCompiledMember[ValueParameterDescriptorImpl]

'facadeClassType' @ [293:85] ==> private final val facadeClassType: Type defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'partType' @ [293:102] ==> value-parameter partType: Type defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateDelegateToCompiledMember[ValueParameterDescriptorImpl]

'createCodegenForDelegatesInMultifileFacade' @ [295:29] ==> private final fun createCodegenForDelegatesInMultifileFacade(facadeContext: FieldOwnerContext<*>): MemberCodegen<KtFile> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[SimpleFunctionDescriptorImpl]

'context' @ [295:72] ==> val context: FieldOwnerContext<(PackageFragmentDescriptor..PackageFragmentDescriptor?)> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateDelegateToCompiledMember[LocalVariableDescriptor]

'when (member) {
            is DeserializedSimpleFunctionDescriptor -> {
                memberCodegen.functionCodegen.generateMethod(OtherOrigin(member), member, DelegateToCompiledMemberGenerationStrategy)

                memberCodegen.functionCodegen.generateDefaultIfNeeded(
                        context.intoFunction(member), member, OwnerKind.PACKAGE, DefaultParameterValueLoader.DEFAULT, null)

                memberCodegen.functionCodegen.generateOverloadsWithDefaultValues(null, member, member)
            }
            is DeserializedPropertyDescriptor -> {
                memberCodegen.propertyCodegen.generateInPackageFacade(member)
            }
            else -> {
                throw IllegalStateException("Unexpected member: " + member)
            }
        }' @ [297:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'member' @ [297:15] ==> value-parameter member: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateDelegateToCompiledMember[ValueParameterDescriptorImpl]

'memberCodegen' @ [299:17] ==> val memberCodegen: MemberCodegen<KtFile> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateDelegateToCompiledMember[LocalVariableDescriptor]

'functionCodegen' @ [299:31] ==> public final val functionCodegen: (FunctionCodegen..FunctionCodegen?) defined in org.jetbrains.kotlin.codegen.MemberCodegen[JavaPropertyDescriptor]

'generateMethod' @ [299:47] ==> public open fun generateMethod(@NotNull origin: JvmDeclarationOrigin, @NotNull descriptor: FunctionDescriptor, @NotNull strategy: FunctionGenerationStrategy): Unit defined in org.jetbrains.kotlin.codegen.FunctionCodegen[JavaMethodDescriptor]

'OtherOrigin' @ [299:62] ==> public fun OtherOrigin(descriptor: DeclarationDescriptor): JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics[DeserializedSimpleFunctionDescriptor]

'member' @ [299:74] ==> value-parameter member: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateDelegateToCompiledMember[ValueParameterDescriptorImpl]

'member' @ [299:83] ==> value-parameter member: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateDelegateToCompiledMember[ValueParameterDescriptorImpl]

'DelegateToCompiledMemberGenerationStrategy' @ [299:91] ==> public object DelegateToCompiledMemberGenerationStrategy : FunctionGenerationStrategy defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[FakeCallableDescriptorForObject]

'memberCodegen' @ [301:17] ==> val memberCodegen: MemberCodegen<KtFile> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateDelegateToCompiledMember[LocalVariableDescriptor]

'functionCodegen' @ [301:31] ==> public final val functionCodegen: (FunctionCodegen..FunctionCodegen?) defined in org.jetbrains.kotlin.codegen.MemberCodegen[JavaPropertyDescriptor]

'generateDefaultIfNeeded' @ [301:47] ==> public/*package*/ open fun generateDefaultIfNeeded(@NotNull owner: MethodContext, @NotNull functionDescriptor: FunctionDescriptor, @NotNull kind: OwnerKind, @NotNull loadStrategy: DefaultParameterValueLoader, @Nullable function: KtNamedFunction?): Unit defined in org.jetbrains.kotlin.codegen.FunctionCodegen[JavaMethodDescriptor]

'context' @ [302:25] ==> val context: FieldOwnerContext<(PackageFragmentDescriptor..PackageFragmentDescriptor?)> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateDelegateToCompiledMember[LocalVariableDescriptor]

'intoFunction' @ [302:33] ==> @NotNull public open fun intoFunction(descriptor: (FunctionDescriptor..FunctionDescriptor?)): MethodContext defined in org.jetbrains.kotlin.codegen.context.FieldOwnerContext[JavaMethodDescriptor]

'member' @ [302:46] ==> value-parameter member: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateDelegateToCompiledMember[ValueParameterDescriptorImpl]

'member' @ [302:55] ==> value-parameter member: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateDelegateToCompiledMember[ValueParameterDescriptorImpl]

'OwnerKind' @ [302:63] ==> public companion object defined in org.jetbrains.kotlin.codegen.OwnerKind[FakeCallableDescriptorForObject]

'PACKAGE' @ [302:73] ==> enum entry PACKAGE defined in org.jetbrains.kotlin.codegen.OwnerKind[FakeCallableDescriptorForObject]

'DEFAULT' @ [302:110] ==> public final val DEFAULT: (DefaultParameterValueLoader..DefaultParameterValueLoader?) defined in org.jetbrains.kotlin.codegen.DefaultParameterValueLoader[JavaPropertyDescriptor]

'memberCodegen' @ [304:17] ==> val memberCodegen: MemberCodegen<KtFile> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateDelegateToCompiledMember[LocalVariableDescriptor]

'functionCodegen' @ [304:31] ==> public final val functionCodegen: (FunctionCodegen..FunctionCodegen?) defined in org.jetbrains.kotlin.codegen.MemberCodegen[JavaPropertyDescriptor]

'generateOverloadsWithDefaultValues' @ [304:47] ==> public open fun generateOverloadsWithDefaultValues(@Nullable function: KtNamedFunction?, @NotNull functionDescriptor: FunctionDescriptor, @NotNull delegateFunctionDescriptor: FunctionDescriptor): Unit defined in org.jetbrains.kotlin.codegen.FunctionCodegen[JavaMethodDescriptor]

'member' @ [304:88] ==> value-parameter member: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateDelegateToCompiledMember[ValueParameterDescriptorImpl]

'member' @ [304:96] ==> value-parameter member: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateDelegateToCompiledMember[ValueParameterDescriptorImpl]

'memberCodegen' @ [307:17] ==> val memberCodegen: MemberCodegen<KtFile> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateDelegateToCompiledMember[LocalVariableDescriptor]

'propertyCodegen' @ [307:31] ==> public final val propertyCodegen: (PropertyCodegen..PropertyCodegen?) defined in org.jetbrains.kotlin.codegen.MemberCodegen[JavaPropertyDescriptor]

'generateInPackageFacade' @ [307:47] ==> public open fun generateInPackageFacade(@NotNull deserializedProperty: DeserializedPropertyDescriptor): Unit defined in org.jetbrains.kotlin.codegen.PropertyCodegen[JavaMethodDescriptor]

'member' @ [307:71] ==> value-parameter member: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateDelegateToCompiledMember[ValueParameterDescriptorImpl]

'IllegalStateException' @ [310:23] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [310:45] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'member' @ [310:69] ==> value-parameter member: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.generateDelegateToCompiledMember[ValueParameterDescriptorImpl]

'FunctionGenerationStrategy' @ [315:57] ==> public constructor FunctionGenerationStrategy() defined in org.jetbrains.kotlin.codegen.FunctionGenerationStrategy[JavaClassConstructorDescriptor]

'IllegalStateException' @ [317:19] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'!' @ [322:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'state' @ [322:14] ==> private final val state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'classBuilderMode' @ [322:20] ==> public final val classBuilderMode: ClassBuilderMode defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'generateMetadata' @ [322:37] ==> public final val generateMetadata: Boolean defined in org.jetbrains.kotlin.codegen.ClassBuilderMode[JavaPropertyDescriptor]

'files' @ [323:13] ==> private final val files: Collection<KtFile> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'any' @ [323:19] ==> public inline fun <T> Iterable<KtFile>.any(predicate: (KtFile) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'it' @ [323:25] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.writeKotlinMultifileFacadeAnnotationIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'isScript' @ [323:28] ==> public final val KtFile.isScript: Boolean[MyPropertyDescriptor]

'if (shouldGeneratePartHierarchy) JvmAnnotationNames.METADATA_MULTIFILE_PARTS_INHERIT_FLAG else 0' @ [325:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'shouldGeneratePartHierarchy' @ [325:30] ==> private final val shouldGeneratePartHierarchy: Boolean defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'METADATA_MULTIFILE_PARTS_INHERIT_FLAG' @ [325:78] ==> public const final val METADATA_MULTIFILE_PARTS_INHERIT_FLAG: Int defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'writeKotlinMetadata' @ [327:9] ==> public fun writeKotlinMetadata(cb: ClassBuilder, state: GenerationState, kind: KotlinClassHeader.Kind, extraFlags: Int, action: (AnnotationVisitor) -> Unit): Unit defined in org.jetbrains.kotlin.codegen[SimpleFunctionDescriptorImpl]

'classBuilder' @ [327:29] ==> private final val classBuilder: ClassBuilderOnDemand defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'state' @ [327:43] ==> private final val state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'MULTIFILE_CLASS' @ [327:73] ==> enum entry MULTIFILE_CLASS defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'extraFlags' @ [327:90] ==> val extraFlags: Int defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.writeKotlinMultifileFacadeAnnotationIfNeeded[LocalVariableDescriptor]

'av' @ [328:23] ==> value-parameter av: AnnotationVisitor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.writeKotlinMultifileFacadeAnnotationIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'visitArray' @ [328:26] ==> public open fun visitArray(p0: (String..String?)): (AnnotationVisitor..AnnotationVisitor?) defined in org.jetbrains.org.objectweb.asm.AnnotationVisitor[JavaMethodDescriptor]

'METADATA_DATA_FIELD_NAME' @ [328:56] ==> public const final val METADATA_DATA_FIELD_NAME: String defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'partInternalNamesSorted' @ [329:34] ==> private final val partInternalNamesSorted: List<String> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'arv' @ [330:17] ==> val arv: (AnnotationVisitor..AnnotationVisitor?) defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.writeKotlinMultifileFacadeAnnotationIfNeeded.<anonymous>[LocalVariableDescriptor]

'visit' @ [330:21] ==> public open fun visit(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.jetbrains.org.objectweb.asm.AnnotationVisitor[JavaMethodDescriptor]

'internalName' @ [330:33] ==> val internalName: String defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.writeKotlinMultifileFacadeAnnotationIfNeeded.<anonymous>[LocalVariableDescriptor]

'arv' @ [332:13] ==> val arv: (AnnotationVisitor..AnnotationVisitor?) defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.writeKotlinMultifileFacadeAnnotationIfNeeded.<anonymous>[LocalVariableDescriptor]

'visitEnd' @ [332:17] ==> public open fun visitEnd(): Unit defined in org.jetbrains.org.objectweb.asm.AnnotationVisitor[JavaMethodDescriptor]

'MemberCodegen<KtFile>' @ [337:22] ==> public constructor MemberCodegen<T : (KtPureElement..KtPureElement?)>(@NotNull state: GenerationState, @Nullable parentCodegen: MemberCodegen<*>?, @NotNull context: raw (FieldOwnerContext<(DeclarationDescriptor..DeclarationDescriptor?)>..FieldOwnerContext<*>), element: (KtFile..KtFile?), @NotNull builder: ClassBuilder) defined in org.jetbrains.kotlin.codegen.MemberCodegen[JavaClassConstructorDescriptor]
Inferred types:
    <T : (KtPureElement..KtPureElement?)> -> KtFile

'state' @ [337:44] ==> private final val state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'facadeContext' @ [337:57] ==> value-parameter facadeContext: FieldOwnerContext<*> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.createCodegenForDelegatesInMultifileFacade[ValueParameterDescriptorImpl]

'classBuilder' @ [337:78] ==> private final val classBuilder: ClassBuilderOnDemand defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'UnsupportedOperationException' @ [338:60] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [339:53] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [340:73] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'classBuilder' @ [344:9] ==> private final val classBuilder: ClassBuilderOnDemand defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'done' @ [344:22] ==> @Override public open fun done(): Unit defined in org.jetbrains.kotlin.codegen.ClassBuilderOnDemand[JavaMethodDescriptor]

'classBuilder' @ [345:13] ==> private final val classBuilder: ClassBuilderOnDemand defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'isComputed' @ [345:26] ==> public final val ClassBuilderOnDemand.isComputed: Boolean[MyPropertyDescriptor]

'state' @ [346:13] ==> private final val state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl[PropertyDescriptorImpl]

'afterIndependentPart' @ [346:19] ==> public final fun afterIndependentPart(): Unit defined in org.jetbrains.kotlin.codegen.state.GenerationState[SimpleFunctionDescriptorImpl]

'OBJECT_TYPE' @ [351:43] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'internalName' @ [351:55] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'or' @ [352:47] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ACC_PUBLIC' @ [352:55] ==> public const final val ACC_PUBLIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ACC_FINAL' @ [352:77] ==> public const final val ACC_FINAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ACC_SUPER' @ [352:98] ==> public const final val ACC_SUPER: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'SmartList' @ [355:29] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PackageFragmentDescriptor

'files' @ [356:26] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.getOnlyPackageFragment[ValueParameterDescriptorImpl]

'bindingContext' @ [357:32] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.getOnlyPackageFragment[ValueParameterDescriptorImpl]

'get' @ [357:47] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtFile..KtFile?), (PackageFragmentDescriptor..PackageFragmentDescriptor?)>..ReadOnlySlice<(KtFile..KtFile?), (PackageFragmentDescriptor..PackageFragmentDescriptor?)>?), p1: (KtFile..KtFile?)): PackageFragmentDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtFile
    <V : (Any..Any?)> -> PackageFragmentDescriptor

'FILE_TO_PACKAGE_FRAGMENT' @ [357:66] ==> public final val FILE_TO_PACKAGE_FRAGMENT: (WritableSlice<(KtFile..KtFile?), (PackageFragmentDescriptor..PackageFragmentDescriptor?)>..WritableSlice<(KtFile..KtFile?), (PackageFragmentDescriptor..PackageFragmentDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'file' @ [357:92] ==> val file: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.getOnlyPackageFragment[LocalVariableDescriptor]

'AssertionError' @ [358:41] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'+' @ [358:56] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'file' @ [358:90] ==> val file: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.getOnlyPackageFragment[LocalVariableDescriptor]

'file' @ [358:104] ==> val file: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.getOnlyPackageFragment[LocalVariableDescriptor]

'text' @ [358:109] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'assert' @ [360:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'packageFqName' @ [360:24] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.getOnlyPackageFragment[ValueParameterDescriptorImpl]

'fragment' @ [360:41] ==> val fragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.getOnlyPackageFragment[LocalVariableDescriptor]

'fqName' @ [360:50] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'+' @ [360:60] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'packageFqName' @ [360:91] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.getOnlyPackageFragment[ValueParameterDescriptorImpl]

'fragment' @ [360:122] ==> val fragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.getOnlyPackageFragment[LocalVariableDescriptor]

'fqName' @ [360:131] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'!' @ [362:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'fragments' @ [362:22] ==> val fragments: SmartList<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.getOnlyPackageFragment[LocalVariableDescriptor]

'contains' @ [362:32] ==> public open fun contains(element: (PackageFragmentDescriptor..PackageFragmentDescriptor?)): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'fragment' @ [362:41] ==> val fragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.getOnlyPackageFragment[LocalVariableDescriptor]

'fragments' @ [363:21] ==> val fragments: SmartList<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.getOnlyPackageFragment[LocalVariableDescriptor]

'add' @ [363:31] ==> public open fun add(element: (PackageFragmentDescriptor..PackageFragmentDescriptor?)): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'fragment' @ [363:35] ==> val fragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.getOnlyPackageFragment[LocalVariableDescriptor]

'fragments' @ [366:17] ==> val fragments: SmartList<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.getOnlyPackageFragment[LocalVariableDescriptor]

'size' @ [366:27] ==> public open val size: Int defined in com.intellij.util.SmartList[JavaPropertyDescriptor]

'IllegalStateException' @ [367:23] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'files' @ [367:86] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.getOnlyPackageFragment[ValueParameterDescriptorImpl]

'fragments' @ [367:106] ==> val fragments: SmartList<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.getOnlyPackageFragment[LocalVariableDescriptor]

'fragments' @ [369:20] ==> val fragments: SmartList<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.getOnlyPackageFragment[LocalVariableDescriptor]

'firstOrNull' @ [369:30] ==> public fun <T> List<(PackageFragmentDescriptor..PackageFragmentDescriptor?)>.firstOrNull(): PackageFragmentDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor..org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor?)

'declarations' @ [373:17] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'any' @ [373:30] ==> public inline fun <T> Iterable<(KtDeclaration..KtDeclaration?)>.any(predicate: ((KtDeclaration..KtDeclaration?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'it' @ [373:36] ==> value-parameter it: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.hasDeclarationsForPartClass.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [373:56] ==> value-parameter it: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.hasDeclarationsForPartClass.<anonymous>[ValueParameterDescriptorImpl]

'internalNameByFqNameWithoutInnerClasses' @ [376:25] ==> @NotNull public open fun internalNameByFqNameWithoutInnerClasses(@NotNull fqName: FqName): String defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'this' @ [376:65] ==> <this> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.toInternalName[ReceiverParameterDescriptorImpl]

'asmTypeByFqNameWithoutInnerClasses' @ [379:25] ==> @NotNull public open fun asmTypeByFqNameWithoutInnerClasses(@NotNull fqName: FqName): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'this' @ [379:60] ==> <this> defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.toAsmType[ReceiverParameterDescriptorImpl]

'!' @ [384:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isEnabled' @ [384:41] ==> public open fun isEnabled(): Boolean defined in org.jetbrains.kotlin.config.IncrementalCompilation[JavaMethodDescriptor]

'facadeFqName' @ [386:33] ==> value-parameter facadeFqName: FqName defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.getCompiledPackageFragment[ValueParameterDescriptorImpl]

'parent' @ [386:46] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'state' @ [388:46] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.getCompiledPackageFragment[ValueParameterDescriptorImpl]

'module' @ [388:52] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'getPackage' @ [388:59] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'packageFqName' @ [388:70] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.getCompiledPackageFragment[LocalVariableDescriptor]

'fragments' @ [388:85] ==> public abstract val fragments: List<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'firstOrNull' @ [388:95] ==> public inline fun <T> Iterable<PackageFragmentDescriptor>.firstOrNull(predicate: (PackageFragmentDescriptor) -> Boolean): PackageFragmentDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentDescriptor

'fragment' @ [389:21] ==> value-parameter fragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.getCompiledPackageFragment.<anonymous>[ValueParameterDescriptorImpl]

'fragment' @ [390:21] ==> value-parameter fragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.getCompiledPackageFragment.<anonymous>[ValueParameterDescriptorImpl]

'target' @ [390:30] ==> public final val target: TargetId defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.IncrementalPackageFragment[DeserializedPropertyDescriptor]

'state' @ [390:40] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.getCompiledPackageFragment[ValueParameterDescriptorImpl]

'targetId' @ [390:46] ==> public final val targetId: TargetId? defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'incrementalPackageFragment' @ [393:20] ==> val incrementalPackageFragment: IncrementalPackageFragmentProvider.IncrementalPackageFragment? defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.getCompiledPackageFragment[LocalVariableDescriptor]

'getPackageFragmentForMultifileClass' @ [393:48] ==> public final fun getPackageFragmentForMultifileClass(multifileClassFqName: FqName): IncrementalPackageFragmentProvider.IncrementalMultifileClassPackageFragment? defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider.IncrementalPackageFragment[DeserializedSimpleFunctionDescriptor]

'facadeFqName' @ [393:84] ==> value-parameter facadeFqName: FqName defined in org.jetbrains.kotlin.codegen.MultifileClassCodegenImpl.Companion.getCompiledPackageFragment[ValueParameterDescriptorImpl]

