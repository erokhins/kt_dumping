'lazy' @ [34:42] ==> public fun <T> lazy(initializer: () -> List<JavaRoot>): Lazy<List<JavaRoot>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<JavaRoot>

'_roots' @ [34:49] ==> value-parameter _roots: List<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.<init>[ValueParameterDescriptorImpl]

'toList' @ [34:56] ==> public fun <T> Iterable<JavaRoot>.toList(): List<JavaRoot> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaRoot

'roots' @ [37:17] ==> private final val roots: List<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[PropertyDescriptorImpl]

'size' @ [37:23] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'HashMap' @ [41:42] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> Cache

'innerPackageCaches' @ [43:42] ==> private final val innerPackageCaches: HashMap<String, JvmDependenciesIndexImpl.Cache> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.Cache[PropertyDescriptorImpl]

'getOrPut' @ [43:61] ==> public inline fun <K, V> MutableMap<String, JvmDependenciesIndexImpl.Cache>.getOrPut(key: String, defaultValue: () -> JvmDependenciesIndexImpl.Cache): JvmDependenciesIndexImpl.Cache defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Cache

'name' @ [43:70] ==> value-parameter name: String defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.Cache.get[ValueParameterDescriptorImpl]

'IntArrayList' @ [48:27] ==> public constructor IntArrayList(p0: Int) defined in com.intellij.util.containers.IntArrayList[JavaClassConstructorDescriptor]

'lazy' @ [53:37] ==> public fun <T> lazy(initializer: () -> JvmDependenciesIndexImpl.Cache): Lazy<JvmDependenciesIndexImpl.Cache> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Cache

'Cache' @ [54:9] ==> public constructor Cache() defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.Cache[ClassConstructorDescriptorImpl]

'apply' @ [54:17] ==> @InlineOnly public inline fun <T> JvmDependenciesIndexImpl.Cache.apply(block: JvmDependenciesIndexImpl.Cache.() -> Unit): JvmDependenciesIndexImpl.Cache defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Cache

'roots' @ [55:13] ==> private final val roots: List<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[PropertyDescriptorImpl]

'indices' @ [55:19] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'forEach' @ [55:27] ==> @HidesMembers public inline fun <T> Iterable<Int>.forEach(action: (Int) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'rootIndices' @ [55:35] ==> public final val rootIndices: IntArrayList defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.Cache[PropertyDescriptorImpl]

'rootIndices' @ [56:13] ==> public final val rootIndices: IntArrayList defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.Cache[PropertyDescriptorImpl]

'add' @ [56:25] ==> public open fun add(p0: Int): Unit defined in com.intellij.util.containers.IntArrayList[JavaMethodDescriptor]

'maxIndex' @ [56:29] ==> private final val maxIndex: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[PropertyDescriptorImpl]

'rootIndices' @ [57:13] ==> public final val rootIndices: IntArrayList defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.Cache[PropertyDescriptorImpl]

'trimToSize' @ [57:25] ==> public open fun trimToSize(): Unit defined in com.intellij.util.containers.IntArrayList[JavaMethodDescriptor]

'lazy' @ [65:34] ==> public fun <T> lazy(initializer: () -> Sequence<JavaRoot>): Lazy<Sequence<JavaRoot>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Sequence<JavaRoot>

'roots' @ [65:41] ==> private final val roots: List<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[PropertyDescriptorImpl]

'asSequence' @ [65:47] ==> public fun <T> Iterable<JavaRoot>.asSequence(): Sequence<JavaRoot> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaRoot

'lazy' @ [67:78] ==> public fun <T> lazy(initializer: () -> Array<THashMap<String, VirtualFile?>>): Lazy<Array<THashMap<String, VirtualFile?>>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Array<THashMap<String, VirtualFile?>>

'Array' @ [68:9] ==> public constructor Array<T>(size: Int, init: (Int) -> THashMap<String, VirtualFile?>) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> THashMap<String, VirtualFile?>

'roots' @ [68:15] ==> private final val roots: List<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[PropertyDescriptorImpl]

'size' @ [68:21] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'THashMap' @ [68:29] ==> public constructor THashMap<K : (Any..Any?), V : (Any..Any?)>() defined in gnu.trove.THashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> VirtualFile?

'search' @ [76:9] ==> private final fun <T : Any> search(request: JvmDependenciesIndexImpl.SearchRequest, handler: (VirtualFile, JavaRoot.RootType) -> Unit?): Unit? defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Unit

'TraverseRequest' @ [76:16] ==> public constructor TraverseRequest(packageFqName: FqName, acceptedRootTypes: Set<JavaRoot.RootType>) defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.TraverseRequest[ClassConstructorDescriptorImpl]

'packageFqName' @ [76:32] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.traverseDirectoriesInPackage[ValueParameterDescriptorImpl]

'acceptedRootTypes' @ [76:47] ==> value-parameter acceptedRootTypes: Set<JavaRoot.RootType> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.traverseDirectoriesInPackage[ValueParameterDescriptorImpl]

'if (continueSearch(dir, rootType)) null else Unit' @ [77:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'invoke' @ [77:17] ==> public abstract operator fun invoke(p1: VirtualFile, p2: JavaRoot.RootType): Boolean defined in kotlin.Function2[FunctionInvokeDescriptor]

'dir' @ [77:32] ==> value-parameter dir: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.traverseDirectoriesInPackage.<anonymous>[ValueParameterDescriptorImpl]

'rootType' @ [77:37] ==> value-parameter rootType: JavaRoot.RootType defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.traverseDirectoriesInPackage.<anonymous>[ValueParameterDescriptorImpl]

'Unit' @ [77:58] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'lastClassSearch' @ [88:13] ==> private final var lastClassSearch: Pair<JvmDependenciesIndexImpl.FindClassRequest, JvmDependenciesIndexImpl.SearchResult>? defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[PropertyDescriptorImpl]

'first' @ [88:30] ==> public final val first: JvmDependenciesIndexImpl.FindClassRequest defined in kotlin.Pair[DeserializedPropertyDescriptor]

'classId' @ [88:37] ==> public final val classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.FindClassRequest[PropertyDescriptorImpl]

'classId' @ [88:48] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findClass[ValueParameterDescriptorImpl]

'search' @ [89:20] ==> private final fun <T : Any> search(request: JvmDependenciesIndexImpl.SearchRequest, handler: (VirtualFile, JavaRoot.RootType) -> T?): T? defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'FindClassRequest' @ [89:27] ==> public constructor FindClassRequest(classId: ClassId, acceptedRootTypes: Set<JavaRoot.RootType>) defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.FindClassRequest[ClassConstructorDescriptorImpl]

'classId' @ [89:44] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findClass[ValueParameterDescriptorImpl]

'acceptedRootTypes' @ [89:53] ==> value-parameter acceptedRootTypes: Set<JavaRoot.RootType> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findClass[ValueParameterDescriptorImpl]

'findClassGivenDirectory' @ [89:73] ==> value-parameter findClassGivenDirectory: (VirtualFile, JavaRoot.RootType) -> T? defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findClass[ValueParameterDescriptorImpl]

'component1' @ [92:14] ==> public final operator fun component1(): JvmDependenciesIndexImpl.FindClassRequest defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [92:29] ==> public final operator fun component2(): JvmDependenciesIndexImpl.SearchResult defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'lastClassSearch' @ [92:45] ==> private final var lastClassSearch: Pair<JvmDependenciesIndexImpl.FindClassRequest, JvmDependenciesIndexImpl.SearchResult>? defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[PropertyDescriptorImpl]

'when (cachedResult) {
            is SearchResult.NotFound -> {
                val limitedRootTypes = acceptedRootTypes - cachedRequest.acceptedRootTypes
                if (limitedRootTypes.isEmpty()) {
                    null
                }
                else {
                    search(FindClassRequest(classId, limitedRootTypes), findClassGivenDirectory)
                }
            }
            is SearchResult.Found -> {
                if (cachedRequest.acceptedRootTypes == acceptedRootTypes) {
                    findClassGivenDirectory(cachedResult.packageDirectory, cachedResult.root.type)
                }
                else {
                    search(FindClassRequest(classId, acceptedRootTypes), findClassGivenDirectory)
                }
            }
        }' @ [93:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: T?, entry1: T?): T?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> T?

'cachedResult' @ [93:22] ==> val cachedResult: JvmDependenciesIndexImpl.SearchResult defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findClass[LocalVariableDescriptor]

'acceptedRootTypes' @ [95:40] ==> value-parameter acceptedRootTypes: Set<JavaRoot.RootType> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findClass[ValueParameterDescriptorImpl]

'cachedRequest' @ [95:60] ==> val cachedRequest: JvmDependenciesIndexImpl.FindClassRequest defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findClass[LocalVariableDescriptor]

'acceptedRootTypes' @ [95:74] ==> public open val acceptedRootTypes: Set<JavaRoot.RootType> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.FindClassRequest[PropertyDescriptorImpl]

'if (limitedRootTypes.isEmpty()) {
                    null
                }
                else {
                    search(FindClassRequest(classId, limitedRootTypes), findClassGivenDirectory)
                }' @ [96:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T?, elseBranch: T?): T?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T?

'limitedRootTypes' @ [96:21] ==> val limitedRootTypes: Set<JavaRoot.RootType> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findClass[LocalVariableDescriptor]

'isEmpty' @ [96:38] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'search' @ [100:21] ==> private final fun <T : Any> search(request: JvmDependenciesIndexImpl.SearchRequest, handler: (VirtualFile, JavaRoot.RootType) -> T?): T? defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'FindClassRequest' @ [100:28] ==> public constructor FindClassRequest(classId: ClassId, acceptedRootTypes: Set<JavaRoot.RootType>) defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.FindClassRequest[ClassConstructorDescriptorImpl]

'classId' @ [100:45] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findClass[ValueParameterDescriptorImpl]

'limitedRootTypes' @ [100:54] ==> val limitedRootTypes: Set<JavaRoot.RootType> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findClass[LocalVariableDescriptor]

'findClassGivenDirectory' @ [100:73] ==> value-parameter findClassGivenDirectory: (VirtualFile, JavaRoot.RootType) -> T? defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findClass[ValueParameterDescriptorImpl]

'if (cachedRequest.acceptedRootTypes == acceptedRootTypes) {
                    findClassGivenDirectory(cachedResult.packageDirectory, cachedResult.root.type)
                }
                else {
                    search(FindClassRequest(classId, acceptedRootTypes), findClassGivenDirectory)
                }' @ [104:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T?, elseBranch: T?): T?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T?

'cachedRequest' @ [104:21] ==> val cachedRequest: JvmDependenciesIndexImpl.FindClassRequest defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findClass[LocalVariableDescriptor]

'acceptedRootTypes' @ [104:35] ==> public open val acceptedRootTypes: Set<JavaRoot.RootType> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.FindClassRequest[PropertyDescriptorImpl]

'acceptedRootTypes' @ [104:56] ==> value-parameter acceptedRootTypes: Set<JavaRoot.RootType> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findClass[ValueParameterDescriptorImpl]

'invoke' @ [105:21] ==> public abstract operator fun invoke(p1: VirtualFile, p2: JavaRoot.RootType): T? defined in kotlin.Function2[FunctionInvokeDescriptor]

'cachedResult' @ [105:45] ==> val cachedResult: JvmDependenciesIndexImpl.SearchResult defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findClass[LocalVariableDescriptor]

'packageDirectory' @ [105:58] ==> public final val packageDirectory: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.SearchResult.Found[PropertyDescriptorImpl]

'cachedResult' @ [105:76] ==> val cachedResult: JvmDependenciesIndexImpl.SearchResult defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findClass[LocalVariableDescriptor]

'root' @ [105:89] ==> public final val root: JavaRoot defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.SearchResult.Found[PropertyDescriptorImpl]

'type' @ [105:94] ==> public final val type: JavaRoot.RootType defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot[PropertyDescriptorImpl]

'search' @ [108:21] ==> private final fun <T : Any> search(request: JvmDependenciesIndexImpl.SearchRequest, handler: (VirtualFile, JavaRoot.RootType) -> T?): T? defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'FindClassRequest' @ [108:28] ==> public constructor FindClassRequest(classId: ClassId, acceptedRootTypes: Set<JavaRoot.RootType>) defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.FindClassRequest[ClassConstructorDescriptorImpl]

'classId' @ [108:45] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findClass[ValueParameterDescriptorImpl]

'acceptedRootTypes' @ [108:54] ==> value-parameter acceptedRootTypes: Set<JavaRoot.RootType> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findClass[ValueParameterDescriptorImpl]

'findClassGivenDirectory' @ [108:74] ==> value-parameter findClassGivenDirectory: (VirtualFile, JavaRoot.RootType) -> T? defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findClass[ValueParameterDescriptorImpl]

'request' @ [116:28] ==> value-parameter request: JvmDependenciesIndexImpl.SearchRequest defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[ValueParameterDescriptorImpl]

'packageFqName' @ [116:36] ==> public abstract val packageFqName: FqName defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.SearchRequest[PropertyDescriptorImpl]

'pathSegments' @ [116:50] ==> @NotNull public open fun pathSegments(): (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'map' @ [116:65] ==> public inline fun <T, R> Iterable<(Name..Name?)>.map(transform: ((Name..Name?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.name.Name..org.jetbrains.kotlin.name.Name?)
    <R> -> String

'it' @ [116:71] ==> value-parameter it: (Name..Name?) defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search.<anonymous>[ValueParameterDescriptorImpl]

'identifier' @ [116:74] ==> public final val Name.identifier: String[MyPropertyDescriptor]

'cachesPath' @ [118:22] ==> private final fun cachesPath(path: List<String>): List<JvmDependenciesIndexImpl.Cache> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[SimpleFunctionDescriptorImpl]

'packagesPath' @ [118:33] ==> val packagesPath: List<String> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'-' @ [120:34] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'caches' @ [124:28] ==> val caches: List<JvmDependenciesIndexImpl.Cache> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'lastIndex' @ [124:35] ==> public val <T> List<JvmDependenciesIndexImpl.Cache>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Cache

'caches' @ [125:36] ==> val caches: List<JvmDependenciesIndexImpl.Cache> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'cacheIndex' @ [125:43] ==> val cacheIndex: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'rootIndices' @ [125:55] ==> public final val rootIndices: IntArrayList defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.Cache[PropertyDescriptorImpl]

'..' @ [126:23] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'cacheRootIndices' @ [126:26] ==> val cacheRootIndices: IntArrayList defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'size' @ [126:43] ==> public open fun size(): Int defined in com.intellij.util.containers.IntArrayList[JavaMethodDescriptor]

'cacheRootIndices' @ [127:33] ==> val cacheRootIndices: IntArrayList defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'i' @ [127:50] ==> val i: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'rootIndex' @ [128:21] ==> val rootIndex: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'processedRootsUpTo' @ [128:34] ==> var processedRootsUpTo: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'travelPath' @ [130:39] ==> private final fun travelPath(rootIndex: Int, packageFqName: FqName, packagesPath: List<String>, fillCachesAfter: Int, cachesPath: List<JvmDependenciesIndexImpl.Cache>): VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[SimpleFunctionDescriptorImpl]

'rootIndex' @ [130:50] ==> val rootIndex: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'request' @ [130:61] ==> value-parameter request: JvmDependenciesIndexImpl.SearchRequest defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[ValueParameterDescriptorImpl]

'packageFqName' @ [130:69] ==> public abstract val packageFqName: FqName defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.SearchRequest[PropertyDescriptorImpl]

'packagesPath' @ [130:84] ==> val packagesPath: List<String> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'cacheIndex' @ [130:98] ==> val cacheIndex: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'caches' @ [130:110] ==> val caches: List<JvmDependenciesIndexImpl.Cache> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'roots' @ [131:28] ==> private final val roots: List<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[PropertyDescriptorImpl]

'rootIndex' @ [131:34] ==> val rootIndex: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'root' @ [132:21] ==> val root: JavaRoot defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'type' @ [132:26] ==> public final val type: JavaRoot.RootType defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot[PropertyDescriptorImpl]

'request' @ [132:34] ==> value-parameter request: JvmDependenciesIndexImpl.SearchRequest defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[ValueParameterDescriptorImpl]

'acceptedRootTypes' @ [132:42] ==> public abstract val acceptedRootTypes: Set<JavaRoot.RootType> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.SearchRequest[PropertyDescriptorImpl]

'invoke' @ [133:34] ==> public abstract operator fun invoke(p1: VirtualFile, p2: JavaRoot.RootType): T? defined in kotlin.Function2[FunctionInvokeDescriptor]

'directoryInRoot' @ [133:42] ==> val directoryInRoot: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'root' @ [133:59] ==> val root: JavaRoot defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'type' @ [133:64] ==> public final val type: JavaRoot.RootType defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot[PropertyDescriptorImpl]

'result' @ [134:25] ==> val result: T? defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'request' @ [135:29] ==> value-parameter request: JvmDependenciesIndexImpl.SearchRequest defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[ValueParameterDescriptorImpl]

'lastClassSearch' @ [136:29] ==> private final var lastClassSearch: Pair<JvmDependenciesIndexImpl.FindClassRequest, JvmDependenciesIndexImpl.SearchResult>? defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[PropertyDescriptorImpl]

'Pair' @ [136:47] ==> public constructor Pair<out A, out B>(first: JvmDependenciesIndexImpl.FindClassRequest, second: JvmDependenciesIndexImpl.SearchResult.Found) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> FindClassRequest
    <out B> -> Found

'request' @ [136:52] ==> value-parameter request: JvmDependenciesIndexImpl.SearchRequest defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[ValueParameterDescriptorImpl]

'Found' @ [136:74] ==> public constructor Found(packageDirectory: VirtualFile, root: JavaRoot) defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.SearchResult.Found[ClassConstructorDescriptorImpl]

'directoryInRoot' @ [136:80] ==> val directoryInRoot: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'root' @ [136:97] ==> val root: JavaRoot defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'result' @ [138:32] ==> val result: T? defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'processedRootsUpTo' @ [142:13] ==> var processedRootsUpTo: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'if (cacheRootIndices.isEmpty) processedRootsUpTo else cacheRootIndices.get(cacheRootIndices.size() - 1)' @ [142:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'cacheRootIndices' @ [142:38] ==> val cacheRootIndices: IntArrayList defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'isEmpty' @ [142:55] ==> public final val IntArrayList.isEmpty: Boolean[MyPropertyDescriptor]

'processedRootsUpTo' @ [142:64] ==> var processedRootsUpTo: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'cacheRootIndices' @ [142:88] ==> val cacheRootIndices: IntArrayList defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'get' @ [142:105] ==> public open operator fun get(p0: Int): Int defined in com.intellij.util.containers.IntArrayList[JavaMethodDescriptor]

'cacheRootIndices' @ [142:109] ==> val cacheRootIndices: IntArrayList defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[LocalVariableDescriptor]

'size' @ [142:126] ==> public open fun size(): Int defined in com.intellij.util.containers.IntArrayList[JavaMethodDescriptor]

'request' @ [145:13] ==> value-parameter request: JvmDependenciesIndexImpl.SearchRequest defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[ValueParameterDescriptorImpl]

'lastClassSearch' @ [146:13] ==> private final var lastClassSearch: Pair<JvmDependenciesIndexImpl.FindClassRequest, JvmDependenciesIndexImpl.SearchResult>? defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[PropertyDescriptorImpl]

'Pair' @ [146:31] ==> public constructor Pair<out A, out B>(first: JvmDependenciesIndexImpl.FindClassRequest, second: JvmDependenciesIndexImpl.SearchResult.NotFound) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> FindClassRequest
    <out B> -> NotFound

'request' @ [146:36] ==> value-parameter request: JvmDependenciesIndexImpl.SearchRequest defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.search[ValueParameterDescriptorImpl]

'NotFound' @ [146:58] ==> public object NotFound : JvmDependenciesIndexImpl.SearchResult defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.SearchResult[FakeCallableDescriptorForObject]

'rootIndex' @ [160:13] ==> value-parameter rootIndex: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.travelPath[ValueParameterDescriptorImpl]

'maxIndex' @ [160:26] ==> private final val maxIndex: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[PropertyDescriptorImpl]

'..' @ [161:23] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'fillCachesAfter' @ [161:24] ==> value-parameter fillCachesAfter: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.travelPath[ValueParameterDescriptorImpl]

'cachesPath' @ [161:47] ==> value-parameter cachesPath: List<JvmDependenciesIndexImpl.Cache> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.travelPath[ValueParameterDescriptorImpl]

'size' @ [161:58] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'cachesPath' @ [163:17] ==> value-parameter cachesPath: List<JvmDependenciesIndexImpl.Cache> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.travelPath[ValueParameterDescriptorImpl]

'i' @ [163:28] ==> val i: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.travelPath[LocalVariableDescriptor]

'rootIndices' @ [163:31] ==> public final val rootIndices: IntArrayList defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.Cache[PropertyDescriptorImpl]

'add' @ [163:43] ==> public open fun add(p0: Int): Unit defined in com.intellij.util.containers.IntArrayList[JavaMethodDescriptor]

'maxIndex' @ [163:47] ==> private final val maxIndex: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[PropertyDescriptorImpl]

'cachesPath' @ [164:17] ==> value-parameter cachesPath: List<JvmDependenciesIndexImpl.Cache> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.travelPath[ValueParameterDescriptorImpl]

'i' @ [164:28] ==> val i: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.travelPath[LocalVariableDescriptor]

'rootIndices' @ [164:31] ==> public final val rootIndices: IntArrayList defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.Cache[PropertyDescriptorImpl]

'trimToSize' @ [164:43] ==> public open fun trimToSize(): Unit defined in com.intellij.util.containers.IntArrayList[JavaMethodDescriptor]

'packageCache' @ [169:16] ==> private final val packageCache: Array<out MutableMap<String, VirtualFile?>> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[PropertyDescriptorImpl]

'rootIndex' @ [169:29] ==> value-parameter rootIndex: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.travelPath[ValueParameterDescriptorImpl]

'getOrPut' @ [169:40] ==> public inline fun <K, V> MutableMap<String, VirtualFile?>.getOrPut(key: String, defaultValue: () -> VirtualFile?): VirtualFile? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> VirtualFile?

'packageFqName' @ [169:49] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.travelPath[ValueParameterDescriptorImpl]

'asString' @ [169:63] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'doTravelPath' @ [170:13] ==> private final fun doTravelPath(rootIndex: Int, packagesPath: List<String>, fillCachesAfter: Int, cachesPath: List<JvmDependenciesIndexImpl.Cache>): VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[SimpleFunctionDescriptorImpl]

'rootIndex' @ [170:26] ==> value-parameter rootIndex: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.travelPath[ValueParameterDescriptorImpl]

'packagesPath' @ [170:37] ==> value-parameter packagesPath: List<String> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.travelPath[ValueParameterDescriptorImpl]

'fillCachesAfter' @ [170:51] ==> value-parameter fillCachesAfter: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.travelPath[ValueParameterDescriptorImpl]

'cachesPath' @ [170:68] ==> value-parameter cachesPath: List<JvmDependenciesIndexImpl.Cache> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.travelPath[ValueParameterDescriptorImpl]

'roots' @ [175:24] ==> private final val roots: List<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[PropertyDescriptorImpl]

'rootIndex' @ [175:30] ==> value-parameter rootIndex: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.doTravelPath[ValueParameterDescriptorImpl]

'pathRoot' @ [176:34] ==> val pathRoot: JavaRoot defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.doTravelPath[LocalVariableDescriptor]

'prefixFqName' @ [176:43] ==> public final val prefixFqName: FqName? defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot[PropertyDescriptorImpl]

'pathSegments' @ [176:57] ==> @NotNull public open fun pathSegments(): (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'pathRoot' @ [178:27] ==> val pathRoot: JavaRoot defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.doTravelPath[LocalVariableDescriptor]

'file' @ [178:36] ==> public final val file: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot[PropertyDescriptorImpl]

'packagesPath' @ [180:27] ==> value-parameter packagesPath: List<String> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.doTravelPath[ValueParameterDescriptorImpl]

'indices' @ [180:40] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'packagesPath' @ [181:34] ==> value-parameter packagesPath: List<String> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.doTravelPath[ValueParameterDescriptorImpl]

'pathIndex' @ [181:47] ==> val pathIndex: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.doTravelPath[LocalVariableDescriptor]

'if (prefixPathSegments != null && pathIndex < prefixPathSegments.size) {
                // Traverse prefix first instead of traversing real directories
                if (prefixPathSegments[pathIndex].identifier != subPackageName) {
                    return null
                }
            }
            else {
                currentFile = currentFile.findChildPackage(subPackageName, pathRoot.type) ?: return null
            }' @ [182:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'prefixPathSegments' @ [182:17] ==> val prefixPathSegments: (MutableList<(Name..Name?)>?..List<(Name..Name?)>?) defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.doTravelPath[LocalVariableDescriptor]

'pathIndex' @ [182:47] ==> val pathIndex: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.doTravelPath[LocalVariableDescriptor]

'prefixPathSegments' @ [182:59] ==> val prefixPathSegments: (MutableList<(Name..Name?)>?..List<(Name..Name?)>?) defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.doTravelPath[LocalVariableDescriptor]

'size' @ [182:78] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'prefixPathSegments' @ [184:21] ==> val prefixPathSegments: (MutableList<(Name..Name?)>?..List<(Name..Name?)>?) defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.doTravelPath[LocalVariableDescriptor]

'pathIndex' @ [184:40] ==> val pathIndex: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.doTravelPath[LocalVariableDescriptor]

'identifier' @ [184:51] ==> public final val Name.identifier: String[MyPropertyDescriptor]

'subPackageName' @ [184:65] ==> val subPackageName: String defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.doTravelPath[LocalVariableDescriptor]

'currentFile' @ [189:17] ==> var currentFile: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.doTravelPath[LocalVariableDescriptor]

'currentFile' @ [189:31] ==> var currentFile: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.doTravelPath[LocalVariableDescriptor]

'findChildPackage' @ [189:43] ==> private final fun VirtualFile.findChildPackage(subPackageName: String, rootType: JavaRoot.RootType): VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[SimpleFunctionDescriptorImpl]

'subPackageName' @ [189:60] ==> val subPackageName: String defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.doTravelPath[LocalVariableDescriptor]

'pathRoot' @ [189:76] ==> val pathRoot: JavaRoot defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.doTravelPath[LocalVariableDescriptor]

'type' @ [189:85] ==> public final val type: JavaRoot.RootType defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot[PropertyDescriptorImpl]

'pathIndex' @ [192:43] ==> val pathIndex: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.doTravelPath[LocalVariableDescriptor]

'correspondingCacheIndex' @ [193:17] ==> val correspondingCacheIndex: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.doTravelPath[LocalVariableDescriptor]

'fillCachesAfter' @ [193:43] ==> value-parameter fillCachesAfter: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.doTravelPath[ValueParameterDescriptorImpl]

'cachesPath' @ [195:17] ==> value-parameter cachesPath: List<JvmDependenciesIndexImpl.Cache> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.doTravelPath[ValueParameterDescriptorImpl]

'correspondingCacheIndex' @ [195:28] ==> val correspondingCacheIndex: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.doTravelPath[LocalVariableDescriptor]

'rootIndices' @ [195:53] ==> public final val rootIndices: IntArrayList defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.Cache[PropertyDescriptorImpl]

'add' @ [195:65] ==> public open fun add(p0: Int): Unit defined in com.intellij.util.containers.IntArrayList[JavaMethodDescriptor]

'rootIndex' @ [195:69] ==> value-parameter rootIndex: Int defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.doTravelPath[ValueParameterDescriptorImpl]

'currentFile' @ [199:16] ==> var currentFile: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.doTravelPath[LocalVariableDescriptor]

'findChild' @ [203:30] ==> @Nullable public open fun findChild(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'subPackageName' @ [203:40] ==> value-parameter subPackageName: String defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findChildPackage[ValueParameterDescriptorImpl]

'when (rootType) {
            JavaRoot.RootType.BINARY -> JavaClassFileType.INSTANCE.defaultExtension
            JavaRoot.RootType.SOURCE -> JavaFileType.INSTANCE.defaultExtension
        }' @ [205:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'rootType' @ [205:35] ==> value-parameter rootType: JavaRoot.RootType defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findChildPackage[ValueParameterDescriptorImpl]

'JavaRoot' @ [206:13] ==> public companion object RootTypes defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot[FakeCallableDescriptorForObject]

'BINARY' @ [206:31] ==> enum entry BINARY defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot.RootType[FakeCallableDescriptorForObject]

'INSTANCE' @ [206:59] ==> public final val INSTANCE: (JavaClassFileType..JavaClassFileType?) defined in com.intellij.ide.highlighter.JavaClassFileType[JavaPropertyDescriptor]

'defaultExtension' @ [206:68] ==> public final val JavaClassFileType.defaultExtension: String[MyPropertyDescriptor]

'JavaRoot' @ [207:13] ==> public companion object RootTypes defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot[FakeCallableDescriptorForObject]

'SOURCE' @ [207:31] ==> enum entry SOURCE defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot.RootType[FakeCallableDescriptorForObject]

'INSTANCE' @ [207:54] ==> public final val INSTANCE: (JavaFileType..JavaFileType?) defined in com.intellij.ide.highlighter.JavaFileType[JavaPropertyDescriptor]

'defaultExtension' @ [207:63] ==> public final val JavaFileType.defaultExtension: String[MyPropertyDescriptor]

'findChild' @ [212:13] ==> @Nullable public open fun findChild(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'subPackageName' @ [212:25] ==> value-parameter subPackageName: String defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findChildPackage[ValueParameterDescriptorImpl]

'fileExtension' @ [212:41] ==> val fileExtension: String defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findChildPackage[LocalVariableDescriptor]

'isDirectory' @ [212:58] ==> public final val VirtualFile.isDirectory: Boolean[MyPropertyDescriptor]

'processFilesRecursively' @ [213:29] ==> public final fun processFilesRecursively(@NotNull p0: VirtualFile, @NotNull p1: ((VirtualFile..VirtualFile?)) -> Boolean): Boolean defined in com.intellij.openapi.vfs.VfsUtilCore[SamAdapterFunctionDescriptor]

'childDirectory' @ [213:53] ==> val childDirectory: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findChildPackage[LocalVariableDescriptor]

'file' @ [213:79] ==> value-parameter file: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findChildPackage.<anonymous>[ValueParameterDescriptorImpl]

'extension' @ [213:84] ==> public final val VirtualFile.extension: String?[MyPropertyDescriptor]

'fileExtension' @ [213:97] ==> val fileExtension: String defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findChildPackage[LocalVariableDescriptor]

'childDirectory' @ [218:16] ==> val childDirectory: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.findChildPackage[LocalVariableDescriptor]

'ArrayList' @ [222:22] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Cache

'path' @ [222:39] ==> value-parameter path: List<String> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.cachesPath[ValueParameterDescriptorImpl]

'size' @ [222:44] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'caches' @ [223:9] ==> val caches: ArrayList<JvmDependenciesIndexImpl.Cache> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.cachesPath[LocalVariableDescriptor]

'add' @ [223:16] ==> public open fun add(element: JvmDependenciesIndexImpl.Cache): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'rootCache' @ [223:20] ==> private final val rootCache: JvmDependenciesIndexImpl.Cache defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[PropertyDescriptorImpl]

'rootCache' @ [224:28] ==> private final val rootCache: JvmDependenciesIndexImpl.Cache defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[PropertyDescriptorImpl]

'path' @ [225:32] ==> value-parameter path: List<String> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.cachesPath[ValueParameterDescriptorImpl]

'currentCache' @ [226:13] ==> var currentCache: JvmDependenciesIndexImpl.Cache defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.cachesPath[LocalVariableDescriptor]

'currentCache' @ [226:28] ==> var currentCache: JvmDependenciesIndexImpl.Cache defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.cachesPath[LocalVariableDescriptor]

'subPackageName' @ [226:41] ==> val subPackageName: String defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.cachesPath[LocalVariableDescriptor]

'caches' @ [227:13] ==> val caches: ArrayList<JvmDependenciesIndexImpl.Cache> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.cachesPath[LocalVariableDescriptor]

'add' @ [227:20] ==> public open fun add(element: JvmDependenciesIndexImpl.Cache): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'currentCache' @ [227:24] ==> var currentCache: JvmDependenciesIndexImpl.Cache defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.cachesPath[LocalVariableDescriptor]

'caches' @ [229:16] ==> val caches: ArrayList<JvmDependenciesIndexImpl.Cache> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.cachesPath[LocalVariableDescriptor]

'classId' @ [234:21] ==> public final val classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.FindClassRequest[PropertyDescriptorImpl]

'packageFqName' @ [234:29] ==> public final val ClassId.packageFqName: FqName[MyPropertyDescriptor]

'SearchResult' @ [248:78] ==> private constructor SearchResult() defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.SearchResult[ClassConstructorDescriptorImpl]

'SearchResult' @ [250:27] ==> private constructor SearchResult() defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl.SearchResult[ClassConstructorDescriptorImpl]

