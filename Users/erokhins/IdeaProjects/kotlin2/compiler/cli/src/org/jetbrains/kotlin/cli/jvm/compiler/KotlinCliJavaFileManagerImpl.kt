'CoreJavaFileManager' @ [46:76] ==> public constructor CoreJavaFileManager(p0: (PsiManager..PsiManager?)) defined in com.intellij.core.CoreJavaFileManager[JavaClassConstructorDescriptor]

'myPsiManager' @ [46:96] ==> value-parameter myPsiManager: PsiManager defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.<init>[ValueParameterDescriptorImpl]

'PerformanceCounter' @ [47:31] ==> public companion object defined in org.jetbrains.kotlin.util.PerformanceCounter[FakeCallableDescriptorForObject]

'create' @ [47:50] ==> @JvmOverloads public final fun create(name: String, reenterable: Boolean = ...): PerformanceCounter defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion[DeserializedSimpleFunctionDescriptor]

'THashMap' @ [50:74] ==> public constructor THashMap<K : (Any..Any?), V : (Any..Any?)>() defined in gnu.trove.THashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> FqName
    <V : (Any..Any?)> -> VirtualFile

'allScope' @ [51:46] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'myPsiManager' @ [51:55] ==> private final val myPsiManager: PsiManager defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[PropertyDescriptorImpl]

'project' @ [51:68] ==> public final val PsiManager.project: Project[MyPropertyDescriptor]

'this' @ [55:9] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[LazyClassReceiverParameterDescriptor]

'index' @ [55:14] ==> private final lateinit var index: JvmDependenciesIndex defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[PropertyDescriptorImpl]

'index' @ [55:22] ==> value-parameter index: JvmDependenciesIndex defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.initialize[ValueParameterDescriptorImpl]

'this' @ [56:9] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[LazyClassReceiverParameterDescriptor]

'singleJavaFileRootsIndex' @ [56:14] ==> private final lateinit var singleJavaFileRootsIndex: SingleJavaFileRootsIndex defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[PropertyDescriptorImpl]

'singleJavaFileRootsIndex' @ [56:41] ==> value-parameter singleJavaFileRootsIndex: SingleJavaFileRootsIndex defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.initialize[ValueParameterDescriptorImpl]

'this' @ [57:9] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[LazyClassReceiverParameterDescriptor]

'useFastClassFilesReading' @ [57:14] ==> private final var useFastClassFilesReading: Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[PropertyDescriptorImpl]

'useFastClassFilesReading' @ [57:41] ==> value-parameter useFastClassFilesReading: Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.initialize[ValueParameterDescriptorImpl]

'perfCounter' @ [60:93] ==> private final val perfCounter: PerformanceCounter defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[PropertyDescriptorImpl]

'time' @ [60:105] ==> public final fun <T> time(block: () -> PsiClass?): PsiClass? defined in org.jetbrains.kotlin.util.PerformanceCounter[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass?

'findVirtualFileForTopLevelClass' @ [61:9] ==> private final fun findVirtualFileForTopLevelClass(classId: ClassId, searchScope: GlobalSearchScope): VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[SimpleFunctionDescriptorImpl]

'classId' @ [61:41] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findPsiClass[ValueParameterDescriptorImpl]

'searchScope' @ [61:50] ==> value-parameter searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findPsiClass[ValueParameterDescriptorImpl]

'findPsiClassInVirtualFile' @ [61:64] ==> private final fun VirtualFile.findPsiClassInVirtualFile(classNameWithInnerClasses: String): PsiClass? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[SimpleFunctionDescriptorImpl]

'classId' @ [61:90] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findPsiClass[ValueParameterDescriptorImpl]

'relativeClassName' @ [61:98] ==> public final val ClassId.relativeClassName: FqName[MyPropertyDescriptor]

'asString' @ [61:116] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'classId' @ [65:33] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findVirtualFileForTopLevelClass[ValueParameterDescriptorImpl]

'relativeClassName' @ [65:41] ==> public final val ClassId.relativeClassName: FqName[MyPropertyDescriptor]

'asString' @ [65:59] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'topLevelClassesCache' @ [66:16] ==> private final val topLevelClassesCache: MutableMap<FqName, VirtualFile?> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[PropertyDescriptorImpl]

'getOrPut' @ [66:37] ==> public inline fun <K, V> MutableMap<FqName, VirtualFile?>.getOrPut(key: FqName, defaultValue: () -> VirtualFile?): VirtualFile? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FqName
    <V> -> VirtualFile?

'classId' @ [66:46] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findVirtualFileForTopLevelClass[ValueParameterDescriptorImpl]

'packageFqName' @ [66:54] ==> public final val ClassId.packageFqName: FqName[MyPropertyDescriptor]

'child' @ [66:68] ==> @NotNull public open fun child(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'classId' @ [66:74] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findVirtualFileForTopLevelClass[ValueParameterDescriptorImpl]

'relativeClassName' @ [66:82] ==> public final val ClassId.relativeClassName: FqName[MyPropertyDescriptor]

'pathSegments' @ [66:100] ==> @NotNull public open fun pathSegments(): (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'first' @ [66:115] ==> public fun <T> List<(Name..Name?)>.first(): (Name..Name?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.name.Name..org.jetbrains.kotlin.name.Name?)

'index' @ [67:13] ==> private final lateinit var index: JvmDependenciesIndex defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[PropertyDescriptorImpl]

'findClass' @ [67:19] ==> public abstract fun <T : Any> findClass(classId: ClassId, acceptedRootTypes: Set<JavaRoot.RootType> = ..., findClassGivenDirectory: (VirtualFile, JavaRoot.RootType) -> VirtualFile?): VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndex[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> VirtualFile

'classId' @ [67:29] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findVirtualFileForTopLevelClass[ValueParameterDescriptorImpl]

'findVirtualFileGivenPackage' @ [68:17] ==> private final fun findVirtualFileGivenPackage(packageDir: VirtualFile, classNameWithInnerClasses: String, rootType: JavaRoot.RootType): VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[SimpleFunctionDescriptorImpl]

'dir' @ [68:45] ==> value-parameter dir: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findVirtualFileForTopLevelClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'relativeClassName' @ [68:50] ==> val relativeClassName: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findVirtualFileForTopLevelClass[LocalVariableDescriptor]

'type' @ [68:69] ==> value-parameter type: JavaRoot.RootType defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findVirtualFileForTopLevelClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'singleJavaFileRootsIndex' @ [70:16] ==> private final lateinit var singleJavaFileRootsIndex: SingleJavaFileRootsIndex defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[PropertyDescriptorImpl]

'findJavaSourceClass' @ [70:41] ==> public final fun findJavaSourceClass(classId: ClassId): VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.index.SingleJavaFileRootsIndex[SimpleFunctionDescriptorImpl]

'classId' @ [70:61] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findVirtualFileForTopLevelClass[ValueParameterDescriptorImpl]

'takeIf' @ [71:12] ==> @InlineOnly @SinceKotlin public inline fun <T> VirtualFile.takeIf(predicate: (VirtualFile) -> Boolean): VirtualFile? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'it' @ [71:21] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findVirtualFileForTopLevelClass.<anonymous>[ValueParameterDescriptorImpl]

'searchScope' @ [71:27] ==> value-parameter searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findVirtualFileForTopLevelClass[ValueParameterDescriptorImpl]

'THashMap' @ [74:64] ==> public constructor THashMap<K : (Any..Any?), V : (Any..Any?)>() defined in gnu.trove.THashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ClassId
    <V : (Any..Any?)> -> JavaClass

'BinaryClassSignatureParser' @ [76:13] ==> public constructor BinaryClassSignatureParser(globalContext: ClassifierResolutionContext) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryClassSignatureParser[DeserializedClassConstructorDescriptor]

'ClassifierResolutionContext' @ [76:40] ==> public constructor ClassifierResolutionContext(classesByQName: ClassIdToJavaClass /* = (ClassId) -> JavaClass? */) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext[DeserializedClassConstructorDescriptor]

'findClass' @ [76:70] ==> public open fun findClass(classId: ClassId, searchScope: GlobalSearchScope): JavaClass? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[SimpleFunctionDescriptorImpl]

'it' @ [76:80] ==> value-parameter it: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.signatureParsingComponent.<anonymous>[ValueParameterDescriptorImpl]

'allScope' @ [76:84] ==> private final val allScope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[PropertyDescriptorImpl]

'findVirtualFileForTopLevelClass' @ [79:27] ==> private final fun findVirtualFileForTopLevelClass(classId: ClassId, searchScope: GlobalSearchScope): VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[SimpleFunctionDescriptorImpl]

'classId' @ [79:59] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClass[ValueParameterDescriptorImpl]

'searchScope' @ [79:68] ==> value-parameter searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClass[ValueParameterDescriptorImpl]

'useFastClassFilesReading' @ [81:13] ==> private final var useFastClassFilesReading: Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[PropertyDescriptorImpl]

'virtualFile' @ [81:41] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClass[LocalVariableDescriptor]

'extension' @ [81:53] ==> public final val VirtualFile.extension: String?[MyPropertyDescriptor]

'binaryCache' @ [83:20] ==> private final val binaryCache: MutableMap<ClassId, JavaClass?> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[PropertyDescriptorImpl]

'getOrPut' @ [83:32] ==> public inline fun <K, V> MutableMap<ClassId, JavaClass?>.getOrPut(key: ClassId, defaultValue: () -> JavaClass?): JavaClass? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ClassId
    <V> -> JavaClass?

'classId' @ [83:41] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClass[ValueParameterDescriptorImpl]

'virtualFile' @ [89:36] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClass[LocalVariableDescriptor]

'contentsToByteArray' @ [89:48] ==> @NotNull public abstract fun contentsToByteArray(): ByteArray defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'virtualFile' @ [90:21] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClass[LocalVariableDescriptor]

'nameWithoutExtension' @ [90:33] ==> public final val VirtualFile.nameWithoutExtension: String[MyPropertyDescriptor]

'contains' @ [90:54] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'isNotTopLevelClass' @ [90:71] ==> public fun isNotTopLevelClass(classContent: ByteArray): Boolean defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles[DeserializedSimpleFunctionDescriptor]

'classContent' @ [90:90] ==> val classContent: ByteArray defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClass.<anonymous>[LocalVariableDescriptor]

'classId' @ [91:17] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClass[ValueParameterDescriptorImpl]

'outerClassId' @ [91:25] ==> public final val ClassId.outerClassId: ClassId?[MyPropertyDescriptor]

'let' @ [91:39] ==> @InlineOnly public inline fun <T, R> ClassId.let(block: (ClassId) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassId
    <R> -> Nothing

'findClass' @ [92:38] ==> public open fun findClass(classId: ClassId, searchScope: GlobalSearchScope): JavaClass? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[SimpleFunctionDescriptorImpl]

'outerClassId' @ [92:48] ==> value-parameter outerClassId: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'searchScope' @ [92:62] ==> value-parameter searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClass[ValueParameterDescriptorImpl]

'outerClass' @ [93:37] ==> val outerClass: JavaClass? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClass.<anonymous>.<anonymous>[LocalVariableDescriptor]

'findInnerClass' @ [93:49] ==> public abstract fun findInnerClass(name: Name): JavaClass? defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedSimpleFunctionDescriptor]

'classId' @ [93:64] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClass[ValueParameterDescriptorImpl]

'shortClassName' @ [93:72] ==> public final val ClassId.shortClassName: Name[MyPropertyDescriptor]

'ClassifierResolutionContext' @ [96:32] ==> public constructor ClassifierResolutionContext(classesByQName: ClassIdToJavaClass /* = (ClassId) -> JavaClass? */) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext[DeserializedClassConstructorDescriptor]

'findClass' @ [96:62] ==> public open fun findClass(classId: ClassId, searchScope: GlobalSearchScope): JavaClass? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[SimpleFunctionDescriptorImpl]

'it' @ [96:72] ==> value-parameter it: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'allScope' @ [96:76] ==> private final val allScope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[PropertyDescriptorImpl]

'BinaryJavaClass' @ [98:17] ==> public constructor BinaryJavaClass(virtualFile: VirtualFile, fqName: FqName, context: ClassifierResolutionContext, signatureParser: BinaryClassSignatureParser, access: Int = ..., outerClass: JavaClass?, classContent: ByteArray? = ...) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaClass[DeserializedClassConstructorDescriptor]

'virtualFile' @ [99:25] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClass[LocalVariableDescriptor]

'classId' @ [100:25] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClass[ValueParameterDescriptorImpl]

'asSingleFqName' @ [100:33] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'resolver' @ [101:25] ==> val resolver: ClassifierResolutionContext defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClass.<anonymous>[LocalVariableDescriptor]

'signatureParsingComponent' @ [102:25] ==> private final val signatureParsingComponent: BinaryClassSignatureParser defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[PropertyDescriptorImpl]

'classContent' @ [104:40] ==> val classContent: ByteArray defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClass.<anonymous>[LocalVariableDescriptor]

'virtualFile' @ [109:16] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClass[LocalVariableDescriptor]

'findPsiClassInVirtualFile' @ [109:28] ==> private final fun VirtualFile.findPsiClassInVirtualFile(classNameWithInnerClasses: String): PsiClass? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[SimpleFunctionDescriptorImpl]

'classId' @ [109:54] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClass[ValueParameterDescriptorImpl]

'relativeClassName' @ [109:62] ==> public final val ClassId.relativeClassName: FqName[MyPropertyDescriptor]

'asString' @ [109:80] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'let' @ [109:93] ==> @InlineOnly public inline fun <T, R> PsiClass.let(block: (PsiClass) -> JavaClassImpl): JavaClassImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass
    <R> -> JavaClassImpl

'forEachClassId' @ [121:9] ==> private final inline fun forEachClassId(fqName: String, block: (ClassId) -> Unit): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[SimpleFunctionDescriptorImpl]

'qName' @ [121:24] ==> value-parameter qName: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClass[ValueParameterDescriptorImpl]

'findPsiClass' @ [122:13] ==> private final fun findPsiClass(classId: ClassId, searchScope: GlobalSearchScope): PsiClass? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[SimpleFunctionDescriptorImpl]

'classId' @ [122:26] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClass.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [122:35] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClass[ValueParameterDescriptorImpl]

'let' @ [122:43] ==> @InlineOnly public inline fun <T, R> PsiClass.let(block: (PsiClass) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass
    <R> -> Nothing

'it' @ [122:56] ==> value-parameter it: PsiClass defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [129:23] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.forEachClassId[ValueParameterDescriptorImpl]

'toSafeTopLevelClassId' @ [129:30] ==> private fun String.toSafeTopLevelClassId(): ClassId? defined in org.jetbrains.kotlin.cli.jvm.compiler in file KotlinCliJavaFileManagerImpl.kt[SimpleFunctionDescriptorImpl]

'invoke' @ [132:13] ==> public abstract operator fun invoke(p1: ClassId): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'classId' @ [132:19] ==> var classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.forEachClassId[LocalVariableDescriptor]

'classId' @ [134:33] ==> var classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.forEachClassId[LocalVariableDescriptor]

'packageFqName' @ [134:41] ==> public final val ClassId.packageFqName: FqName[MyPropertyDescriptor]

'packageFqName' @ [135:17] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.forEachClassId[LocalVariableDescriptor]

'isRoot' @ [135:31] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'classId' @ [137:13] ==> var classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.forEachClassId[LocalVariableDescriptor]

'ClassId' @ [137:23] ==> public constructor ClassId(@NotNull p0: FqName, @NotNull p1: FqName, p2: Boolean) defined in org.jetbrains.kotlin.name.ClassId[JavaClassConstructorDescriptor]

'packageFqName' @ [138:21] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.forEachClassId[LocalVariableDescriptor]

'parent' @ [138:35] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'FqName' @ [139:21] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'packageFqName' @ [139:28] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.forEachClassId[LocalVariableDescriptor]

'shortName' @ [139:42] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'asString' @ [139:54] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'classId' @ [139:73] ==> var classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.forEachClassId[LocalVariableDescriptor]

'relativeClassName' @ [139:81] ==> public final val ClassId.relativeClassName: FqName[MyPropertyDescriptor]

'asString' @ [139:99] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'perfCounter' @ [145:90] ==> private final val perfCounter: PerformanceCounter defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[PropertyDescriptorImpl]

'time' @ [145:102] ==> public final fun <T> time(block: () -> Array<PsiClass>): Array<PsiClass> defined in org.jetbrains.kotlin.util.PerformanceCounter[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Array<PsiClass>

'ArrayList' @ [146:22] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiClass

'forEachClassId' @ [147:9] ==> private final inline fun forEachClassId(fqName: String, block: (ClassId) -> Unit): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[SimpleFunctionDescriptorImpl]

'qName' @ [147:24] ==> value-parameter qName: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClasses[ValueParameterDescriptorImpl]

'classId' @ [148:37] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClasses.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'relativeClassName' @ [148:45] ==> public final val ClassId.relativeClassName: FqName[MyPropertyDescriptor]

'asString' @ [148:63] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'index' @ [149:13] ==> private final lateinit var index: JvmDependenciesIndex defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[PropertyDescriptorImpl]

'traverseDirectoriesInPackage' @ [149:19] ==> public abstract fun traverseDirectoriesInPackage(packageFqName: FqName, acceptedRootTypes: Set<JavaRoot.RootType> = ..., continueSearch: (VirtualFile, JavaRoot.RootType) -> Boolean): Unit defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndex[SimpleFunctionDescriptorImpl]

'classId' @ [149:48] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClasses.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'packageFqName' @ [149:56] ==> public final val ClassId.packageFqName: FqName[MyPropertyDescriptor]

'findVirtualFileGivenPackage' @ [151:25] ==> private final fun findVirtualFileGivenPackage(packageDir: VirtualFile, classNameWithInnerClasses: String, rootType: JavaRoot.RootType): VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[SimpleFunctionDescriptorImpl]

'dir' @ [151:53] ==> value-parameter dir: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClasses.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'relativeClassName' @ [151:58] ==> val relativeClassName: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClasses.<anonymous>.<anonymous>[LocalVariableDescriptor]

'rootType' @ [151:77] ==> value-parameter rootType: JavaRoot.RootType defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClasses.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'takeIf' @ [152:31] ==> @InlineOnly @SinceKotlin public inline fun <T> VirtualFile.takeIf(predicate: (VirtualFile) -> Boolean): VirtualFile? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'it' @ [152:40] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClasses.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [152:46] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClasses[ValueParameterDescriptorImpl]

'findPsiClassInVirtualFile' @ [153:31] ==> private final fun VirtualFile.findPsiClassInVirtualFile(classNameWithInnerClasses: String): PsiClass? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[SimpleFunctionDescriptorImpl]

'relativeClassName' @ [153:57] ==> val relativeClassName: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClasses.<anonymous>.<anonymous>[LocalVariableDescriptor]

'psiClass' @ [154:21] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClasses.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'result' @ [155:21] ==> val result: ArrayList<PsiClass> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClasses.<anonymous>[LocalVariableDescriptor]

'add' @ [155:28] ==> public open fun add(element: PsiClass): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'psiClass' @ [155:32] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClasses.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'result' @ [161:13] ==> val result: ArrayList<PsiClass> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClasses.<anonymous>[LocalVariableDescriptor]

'addIfNotNull' @ [161:20] ==> public fun <T : Any> MutableCollection<PsiClass>.addIfNotNull(t: PsiClass?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PsiClass

'singleJavaFileRootsIndex' @ [162:21] ==> private final lateinit var singleJavaFileRootsIndex: SingleJavaFileRootsIndex defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[PropertyDescriptorImpl]

'findJavaSourceClass' @ [162:46] ==> public final fun findJavaSourceClass(classId: ClassId): VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.index.SingleJavaFileRootsIndex[SimpleFunctionDescriptorImpl]

'classId' @ [162:66] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClasses.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'takeIf' @ [163:31] ==> @InlineOnly @SinceKotlin public inline fun <T> VirtualFile.takeIf(predicate: (VirtualFile) -> Boolean): VirtualFile? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'it' @ [163:40] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClasses.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [163:46] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClasses[ValueParameterDescriptorImpl]

'findPsiClassInVirtualFile' @ [164:31] ==> private final fun VirtualFile.findPsiClassInVirtualFile(classNameWithInnerClasses: String): PsiClass? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[SimpleFunctionDescriptorImpl]

'relativeClassName' @ [164:57] ==> val relativeClassName: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClasses.<anonymous>.<anonymous>[LocalVariableDescriptor]

'result' @ [167:17] ==> val result: ArrayList<PsiClass> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClasses.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [167:24] ==> @InlineOnly public inline fun <T> Collection<PsiClass>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'result' @ [168:29] ==> val result: ArrayList<PsiClass> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findClasses.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [168:36] ==> public inline fun <reified T> Collection<PsiClass>.toTypedArray(): Array<PsiClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiClass

'EMPTY_ARRAY' @ [172:18] ==> @NotNull public final val EMPTY_ARRAY: (Array<(PsiClass..PsiClass?)>..Array<out (PsiClass..PsiClass?)>) defined in com.intellij.psi.PsiClass[JavaPropertyDescriptor]

'packageName' @ [177:29] ==> value-parameter packageName: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findPackage[ValueParameterDescriptorImpl]

'toSafeFqName' @ [177:41] ==> private fun String.toSafeFqName(): FqName? defined in org.jetbrains.kotlin.cli.jvm.compiler in file KotlinCliJavaFileManagerImpl.kt[SimpleFunctionDescriptorImpl]

'index' @ [178:9] ==> private final lateinit var index: JvmDependenciesIndex defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[PropertyDescriptorImpl]

'traverseDirectoriesInPackage' @ [178:15] ==> public abstract fun traverseDirectoriesInPackage(packageFqName: FqName, acceptedRootTypes: Set<JavaRoot.RootType> = ..., continueSearch: (VirtualFile, JavaRoot.RootType) -> Boolean): Unit defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndex[SimpleFunctionDescriptorImpl]

'packageFqName' @ [178:44] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findPackage[LocalVariableDescriptor]

'found' @ [179:13] ==> var found: Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findPackage[LocalVariableDescriptor]

'!' @ [183:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'found' @ [183:14] ==> var found: Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findPackage[LocalVariableDescriptor]

'found' @ [184:13] ==> var found: Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findPackage[LocalVariableDescriptor]

'singleJavaFileRootsIndex' @ [184:21] ==> private final lateinit var singleJavaFileRootsIndex: SingleJavaFileRootsIndex defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[PropertyDescriptorImpl]

'findJavaSourceClasses' @ [184:46] ==> public final fun findJavaSourceClasses(packageFqName: FqName): List<ClassId> defined in org.jetbrains.kotlin.cli.jvm.index.SingleJavaFileRootsIndex[SimpleFunctionDescriptorImpl]

'packageFqName' @ [184:68] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findPackage[LocalVariableDescriptor]

'isNotEmpty' @ [184:83] ==> @InlineOnly public inline fun <T> Collection<ClassId>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassId

'if (found) PsiPackageImpl(myPsiManager, packageName) else null' @ [186:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiPackage?, elseBranch: PsiPackage?): PsiPackage?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiPackage?

'found' @ [186:20] ==> var found: Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findPackage[LocalVariableDescriptor]

'PsiPackageImpl' @ [186:27] ==> public constructor PsiPackageImpl(p0: (PsiManager..PsiManager?), p1: (String..String?)) defined in com.intellij.psi.impl.file.PsiPackageImpl[JavaClassConstructorDescriptor]

'myPsiManager' @ [186:42] ==> private final val myPsiManager: PsiManager defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[PropertyDescriptorImpl]

'packageName' @ [186:56] ==> value-parameter packageName: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findPackage[ValueParameterDescriptorImpl]

'classNameWithInnerClasses' @ [194:33] ==> value-parameter classNameWithInnerClasses: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findVirtualFileGivenPackage[ValueParameterDescriptorImpl]

'substringBefore' @ [194:59] ==> public fun String.substringBefore(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'when (rootType) {
            JavaRoot.RootType.BINARY -> packageDir.findChild("$topLevelClassName.class")
            JavaRoot.RootType.SOURCE -> packageDir.findChild("$topLevelClassName.java")
        }' @ [196:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: VirtualFile?, entry1: VirtualFile?): VirtualFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> VirtualFile?

'rootType' @ [196:27] ==> value-parameter rootType: JavaRoot.RootType defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findVirtualFileGivenPackage[ValueParameterDescriptorImpl]

'JavaRoot' @ [197:13] ==> public companion object RootTypes defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot[FakeCallableDescriptorForObject]

'BINARY' @ [197:31] ==> enum entry BINARY defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot.RootType[FakeCallableDescriptorForObject]

'packageDir' @ [197:41] ==> value-parameter packageDir: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findVirtualFileGivenPackage[ValueParameterDescriptorImpl]

'findChild' @ [197:52] ==> @Nullable public open fun findChild(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'topLevelClassName' @ [197:64] ==> val topLevelClassName: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findVirtualFileGivenPackage[LocalVariableDescriptor]

'JavaRoot' @ [198:13] ==> public companion object RootTypes defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot[FakeCallableDescriptorForObject]

'SOURCE' @ [198:31] ==> enum entry SOURCE defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot.RootType[FakeCallableDescriptorForObject]

'packageDir' @ [198:41] ==> value-parameter packageDir: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findVirtualFileGivenPackage[ValueParameterDescriptorImpl]

'findChild' @ [198:52] ==> @Nullable public open fun findChild(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'topLevelClassName' @ [198:64] ==> val topLevelClassName: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findVirtualFileGivenPackage[LocalVariableDescriptor]

'!' @ [201:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'vFile' @ [201:14] ==> val vFile: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findVirtualFileGivenPackage[LocalVariableDescriptor]

'isValid' @ [201:20] ==> public final val VirtualFile.isValid: Boolean[MyPropertyDescriptor]

'LOG' @ [202:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.Companion[PropertyDescriptorImpl]

'error' @ [202:17] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'vFile' @ [202:57] ==> val vFile: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findVirtualFileGivenPackage[LocalVariableDescriptor]

'path' @ [202:63] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'packageDir' @ [202:72] ==> value-parameter packageDir: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findVirtualFileGivenPackage[ValueParameterDescriptorImpl]

'isValid' @ [202:83] ==> public final val VirtualFile.isValid: Boolean[MyPropertyDescriptor]

'packageDir' @ [202:99] ==> value-parameter packageDir: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findVirtualFileGivenPackage[ValueParameterDescriptorImpl]

'path' @ [202:110] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'vFile' @ [206:16] ==> val vFile: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findVirtualFileGivenPackage[LocalVariableDescriptor]

'myPsiManager' @ [212:20] ==> private final val myPsiManager: PsiManager defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[PropertyDescriptorImpl]

'findFile' @ [212:33] ==> @Nullable public abstract fun findFile(@NotNull p0: VirtualFile): PsiFile? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'this' @ [212:42] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findPsiClassInVirtualFile[ReceiverParameterDescriptorImpl]

'findClassInPsiFile' @ [213:16] ==> private final fun findClassInPsiFile(classNameWithInnerClassesDotSeparated: String, file: PsiClassOwner): PsiClass? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.Companion[SimpleFunctionDescriptorImpl]

'classNameWithInnerClasses' @ [213:35] ==> value-parameter classNameWithInnerClasses: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findPsiClassInVirtualFile[ValueParameterDescriptorImpl]

'file' @ [213:62] ==> val file: PsiClassOwner defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.findPsiClassInVirtualFile[LocalVariableDescriptor]

'hashSetOf' @ [217:22] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'index' @ [218:9] ==> private final lateinit var index: JvmDependenciesIndex defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[PropertyDescriptorImpl]

'traverseDirectoriesInPackage' @ [218:15] ==> public abstract fun traverseDirectoriesInPackage(packageFqName: FqName, acceptedRootTypes: Set<JavaRoot.RootType> = ..., continueSearch: (VirtualFile, JavaRoot.RootType) -> Boolean): Unit defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndex[SimpleFunctionDescriptorImpl]

'packageFqName' @ [218:44] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.knownClassNamesInPackage[ValueParameterDescriptorImpl]

'dir' @ [221:27] ==> value-parameter dir: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.knownClassNamesInPackage.<anonymous>[ValueParameterDescriptorImpl]

'children' @ [221:31] ==> public final val VirtualFile.children: (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>?)[MyPropertyDescriptor]

'child' @ [222:21] ==> val child: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.knownClassNamesInPackage.<anonymous>[LocalVariableDescriptor]

'extension' @ [222:27] ==> public final val VirtualFile.extension: String?[MyPropertyDescriptor]

'child' @ [222:51] ==> val child: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.knownClassNamesInPackage.<anonymous>[LocalVariableDescriptor]

'extension' @ [222:57] ==> public final val VirtualFile.extension: String?[MyPropertyDescriptor]

'result' @ [223:21] ==> val result: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.knownClassNamesInPackage[LocalVariableDescriptor]

'add' @ [223:28] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'child' @ [223:32] ==> val child: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.knownClassNamesInPackage.<anonymous>[LocalVariableDescriptor]

'nameWithoutExtension' @ [223:38] ==> public final val VirtualFile.nameWithoutExtension: String[MyPropertyDescriptor]

'singleJavaFileRootsIndex' @ [230:25] ==> private final lateinit var singleJavaFileRootsIndex: SingleJavaFileRootsIndex defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[PropertyDescriptorImpl]

'findJavaSourceClasses' @ [230:50] ==> public final fun findJavaSourceClasses(packageFqName: FqName): List<ClassId> defined in org.jetbrains.kotlin.cli.jvm.index.SingleJavaFileRootsIndex[SimpleFunctionDescriptorImpl]

'packageFqName' @ [230:72] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.knownClassNamesInPackage[ValueParameterDescriptorImpl]

'assert' @ [231:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [231:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'classId' @ [231:21] ==> val classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.knownClassNamesInPackage[LocalVariableDescriptor]

'isNestedClass' @ [231:29] ==> public final val ClassId.isNestedClass: Boolean[MyPropertyDescriptor]

'classId' @ [231:109] ==> val classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.knownClassNamesInPackage[LocalVariableDescriptor]

'result' @ [232:13] ==> val result: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.knownClassNamesInPackage[LocalVariableDescriptor]

'add' @ [232:20] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'classId' @ [232:24] ==> val classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.knownClassNamesInPackage[LocalVariableDescriptor]

'shortClassName' @ [232:32] ==> public final val ClassId.shortClassName: Name[MyPropertyDescriptor]

'asString' @ [232:47] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'result' @ [235:16] ==> val result: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.knownClassNamesInPackage[LocalVariableDescriptor]

'emptySet' @ [240:16] ==> public fun <T> emptySet(): Set<PsiJavaModule> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiJavaModule

'emptyList' @ [243:71] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'getInstance' @ [246:34] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'KotlinCliJavaFileManagerImpl' @ [246:46] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl[FakeCallableDescriptorForObject]

'java' @ [246:82] ==> public val <T> KClass<KotlinCliJavaFileManagerImpl>.java: Class<KotlinCliJavaFileManagerImpl> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinCliJavaFileManagerImpl

'file' @ [249:35] ==> value-parameter file: PsiClassOwner defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.Companion.findClassInPsiFile[ValueParameterDescriptorImpl]

'classes' @ [249:40] ==> public final val PsiClassOwner.classes: (Array<(PsiClass..PsiClass?)>..Array<out (PsiClass..PsiClass?)>)[MyPropertyDescriptor]

'findClassByTopLevelClass' @ [250:33] ==> private final fun findClassByTopLevelClass(className: String, topLevelClass: PsiClass): PsiClass? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.Companion[SimpleFunctionDescriptorImpl]

'classNameWithInnerClassesDotSeparated' @ [250:58] ==> value-parameter classNameWithInnerClassesDotSeparated: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.Companion.findClassInPsiFile[ValueParameterDescriptorImpl]

'topLevelClass' @ [250:97] ==> val topLevelClass: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.Companion.findClassInPsiFile[LocalVariableDescriptor]

'candidate' @ [251:21] ==> val candidate: PsiClass? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.Companion.findClassInPsiFile[LocalVariableDescriptor]

'candidate' @ [252:28] ==> val candidate: PsiClass? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.Companion.findClassInPsiFile[LocalVariableDescriptor]

'className' @ [259:17] ==> value-parameter className: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.Companion.findClassByTopLevelClass[ValueParameterDescriptorImpl]

'indexOf' @ [259:27] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (className == topLevelClass.name) topLevelClass else null' @ [260:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiClass?, elseBranch: PsiClass?): PsiClass?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiClass?

'className' @ [260:28] ==> value-parameter className: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.Companion.findClassByTopLevelClass[ValueParameterDescriptorImpl]

'topLevelClass' @ [260:41] ==> value-parameter topLevelClass: PsiClass defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.Companion.findClassByTopLevelClass[ValueParameterDescriptorImpl]

'name' @ [260:55] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'topLevelClass' @ [260:61] ==> value-parameter topLevelClass: PsiClass defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.Companion.findClassByTopLevelClass[ValueParameterDescriptorImpl]

'split' @ [263:39] ==> @NotNull @Contract public open fun split(@NotNull p0: String, @NotNull p1: String): (MutableList<(String..String?)>..List<(String..String?)>) defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'className' @ [263:45] ==> value-parameter className: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.Companion.findClassByTopLevelClass[ValueParameterDescriptorImpl]

'iterator' @ [263:61] ==> public abstract fun iterator(): MutableIterator<(String..String?)> defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'!' @ [264:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'segments' @ [264:18] ==> val segments: MutableIterator<(String..String?)> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.Companion.findClassByTopLevelClass[LocalVariableDescriptor]

'hasNext' @ [264:27] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'segments' @ [264:40] ==> val segments: MutableIterator<(String..String?)> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.Companion.findClassByTopLevelClass[LocalVariableDescriptor]

'next' @ [264:49] ==> public abstract fun next(): (String..String?) defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'topLevelClass' @ [264:59] ==> value-parameter topLevelClass: PsiClass defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.Companion.findClassByTopLevelClass[ValueParameterDescriptorImpl]

'name' @ [264:73] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'topLevelClass' @ [267:28] ==> value-parameter topLevelClass: PsiClass defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.Companion.findClassByTopLevelClass[ValueParameterDescriptorImpl]

'segments' @ [268:20] ==> val segments: MutableIterator<(String..String?)> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.Companion.findClassByTopLevelClass[LocalVariableDescriptor]

'hasNext' @ [268:29] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'segments' @ [269:38] ==> val segments: MutableIterator<(String..String?)> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.Companion.findClassByTopLevelClass[LocalVariableDescriptor]

'next' @ [269:47] ==> public abstract fun next(): (String..String?) defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'curClass' @ [270:34] ==> var curClass: PsiClass defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.Companion.findClassByTopLevelClass[LocalVariableDescriptor]

'findInnerClassByName' @ [270:43] ==> @Nullable public abstract fun findInnerClassByName(@NonNls p0: (String..String?), p1: Boolean): PsiClass? defined in com.intellij.psi.PsiClass[JavaMethodDescriptor]

'innerClassName' @ [270:64] ==> val innerClassName: (String..String?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.Companion.findClassByTopLevelClass[LocalVariableDescriptor]

'curClass' @ [271:17] ==> var curClass: PsiClass defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.Companion.findClassByTopLevelClass[LocalVariableDescriptor]

'innerClass' @ [271:28] ==> val innerClass: PsiClass defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.Companion.findClassByTopLevelClass[LocalVariableDescriptor]

'curClass' @ [273:20] ==> var curClass: PsiClass defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCliJavaFileManagerImpl.Companion.findClassByTopLevelClass[LocalVariableDescriptor]

'invoke' @ [280:5] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'safely' @ [289:46] ==> private fun <T : Any> safely(compute: () -> FqName): FqName? defined in org.jetbrains.kotlin.cli.jvm.compiler[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> FqName

'FqName' @ [289:55] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'this' @ [289:62] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.toSafeFqName[ReceiverParameterDescriptorImpl]

'safely' @ [290:56] ==> private fun <T : Any> safely(compute: () -> ClassId): ClassId? defined in org.jetbrains.kotlin.cli.jvm.compiler[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> ClassId

'topLevel' @ [290:73] ==> @NotNull public open fun topLevel(@NotNull p0: FqName): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'FqName' @ [290:82] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'this' @ [290:89] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.toSafeTopLevelClassId[ReceiverParameterDescriptorImpl]

