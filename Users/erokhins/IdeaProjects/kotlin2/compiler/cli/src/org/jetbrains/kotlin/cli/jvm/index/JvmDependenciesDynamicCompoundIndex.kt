'arrayListOf' @ [27:27] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<JvmDependenciesIndex> /* = ArrayList<JvmDependenciesIndex> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmDependenciesIndex

'ReentrantReadWriteLock' @ [28:24] ==> public constructor ReentrantReadWriteLock() defined in java.util.concurrent.locks.ReentrantReadWriteLock[JavaClassConstructorDescriptor]

'lock' @ [31:9] ==> private final val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex[PropertyDescriptorImpl]

'write' @ [31:14] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> Boolean): Boolean defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'indices' @ [32:13] ==> private final val indices: ArrayList<JvmDependenciesIndex> /* = ArrayList<JvmDependenciesIndex> */ defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex[PropertyDescriptorImpl]

'add' @ [32:21] ==> public open fun add(element: JvmDependenciesIndex): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'index' @ [32:25] ==> value-parameter index: JvmDependenciesIndex defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex.addIndex[ValueParameterDescriptorImpl]

'lock' @ [37:13] ==> private final val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex[PropertyDescriptorImpl]

'read' @ [37:18] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.read(action: () -> JvmDependenciesIndexImpl?): JvmDependenciesIndexImpl? defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmDependenciesIndexImpl?

'indexedRoots' @ [38:38] ==> public open val indexedRoots: Sequence<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex[PropertyDescriptorImpl]

'toHashSet' @ [38:51] ==> public fun <T> Sequence<JavaRoot>.toHashSet(): HashSet<JavaRoot> /* = HashSet<JavaRoot> */ defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaRoot

'roots' @ [39:32] ==> value-parameter roots: Iterable<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex.addNewIndexForRoots[ValueParameterDescriptorImpl]

'filter' @ [39:38] ==> public inline fun <T> Iterable<JavaRoot>.filter(predicate: (JavaRoot) -> Boolean): List<JavaRoot> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaRoot

'root' @ [39:55] ==> value-parameter root: JavaRoot defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex.addNewIndexForRoots.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'alreadyIndexed' @ [39:64] ==> val alreadyIndexed: HashSet<JavaRoot> /* = HashSet<JavaRoot> */ defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex.addNewIndexForRoots.<anonymous>[LocalVariableDescriptor]

'if (newRoots.isEmpty()) null
                else JvmDependenciesIndexImpl(newRoots).also(this::addIndex)' @ [40:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JvmDependenciesIndexImpl?, elseBranch: JvmDependenciesIndexImpl?): JvmDependenciesIndexImpl?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JvmDependenciesIndexImpl?

'newRoots' @ [40:21] ==> val newRoots: List<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex.addNewIndexForRoots.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [40:30] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'JvmDependenciesIndexImpl' @ [41:22] ==> public constructor JvmDependenciesIndexImpl(_roots: List<JavaRoot>) defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndexImpl[ClassConstructorDescriptorImpl]

'newRoots' @ [41:47] ==> val newRoots: List<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex.addNewIndexForRoots.<anonymous>[LocalVariableDescriptor]

'also' @ [41:57] ==> @InlineOnly @SinceKotlin public inline fun <T> JvmDependenciesIndexImpl.also(block: (JvmDependenciesIndexImpl) -> Unit): JvmDependenciesIndexImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmDependenciesIndexImpl

'this' @ [41:62] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex[LazyClassReceiverParameterDescriptor]

'indices' @ [44:59] ==> private final val indices: ArrayList<JvmDependenciesIndex> /* = ArrayList<JvmDependenciesIndex> */ defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex[PropertyDescriptorImpl]

'asSequence' @ [44:67] ==> public fun <T> Iterable<JvmDependenciesIndex>.asSequence(): Sequence<JvmDependenciesIndex> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmDependenciesIndex

'flatMap' @ [44:80] ==> public fun <T, R> Sequence<JvmDependenciesIndex>.flatMap(transform: (JvmDependenciesIndex) -> Sequence<JavaRoot>): Sequence<JavaRoot> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmDependenciesIndex
    <R> -> JavaRoot

'it' @ [44:90] ==> value-parameter it: JvmDependenciesIndex defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex.<get-indexedRoots>.<anonymous>[ValueParameterDescriptorImpl]

'indexedRoots' @ [44:93] ==> public abstract val indexedRoots: Sequence<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndex[PropertyDescriptorImpl]

'lock' @ [50:13] ==> private final val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex[PropertyDescriptorImpl]

'read' @ [50:18] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.read(action: () -> T?): T? defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T?

'indices' @ [51:9] ==> private final val indices: ArrayList<JvmDependenciesIndex> /* = ArrayList<JvmDependenciesIndex> */ defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex[PropertyDescriptorImpl]

'asSequence' @ [51:17] ==> public fun <T> Iterable<JvmDependenciesIndex>.asSequence(): Sequence<JvmDependenciesIndex> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmDependenciesIndex

'mapNotNull' @ [51:30] ==> public fun <T, R : Any> Sequence<JvmDependenciesIndex>.mapNotNull(transform: (JvmDependenciesIndex) -> T?): Sequence<T> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmDependenciesIndex
    <R : Any> -> T

'it' @ [51:43] ==> value-parameter it: JvmDependenciesIndex defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex.findClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'findClass' @ [51:46] ==> public abstract fun <T : Any> findClass(classId: ClassId, acceptedRootTypes: Set<JavaRoot.RootType> = ..., findClassGivenDirectory: (VirtualFile, JavaRoot.RootType) -> T?): T? defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndex[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'classId' @ [51:56] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex.findClass[ValueParameterDescriptorImpl]

'acceptedRootTypes' @ [51:65] ==> value-parameter acceptedRootTypes: Set<JavaRoot.RootType> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex.findClass[ValueParameterDescriptorImpl]

'findClassGivenDirectory' @ [51:84] ==> value-parameter findClassGivenDirectory: (VirtualFile, JavaRoot.RootType) -> T? defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex.findClass[ValueParameterDescriptorImpl]

'firstOrNull' @ [51:111] ==> public fun <T> Sequence<T>.firstOrNull(): T? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'lock' @ [58:9] ==> private final val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex[PropertyDescriptorImpl]

'read' @ [58:14] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.read(action: () -> Unit): Unit defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'indices' @ [59:9] ==> private final val indices: ArrayList<JvmDependenciesIndex> /* = ArrayList<JvmDependenciesIndex> */ defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex[PropertyDescriptorImpl]

'forEach' @ [59:17] ==> @HidesMembers public inline fun <T> Iterable<JvmDependenciesIndex>.forEach(action: (JvmDependenciesIndex) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmDependenciesIndex

'it' @ [59:27] ==> value-parameter it: JvmDependenciesIndex defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex.traverseDirectoriesInPackage.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'traverseDirectoriesInPackage' @ [59:30] ==> public abstract fun traverseDirectoriesInPackage(packageFqName: FqName, acceptedRootTypes: Set<JavaRoot.RootType> = ..., continueSearch: (VirtualFile, JavaRoot.RootType) -> Boolean): Unit defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesIndex[SimpleFunctionDescriptorImpl]

'packageFqName' @ [59:59] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex.traverseDirectoriesInPackage[ValueParameterDescriptorImpl]

'acceptedRootTypes' @ [59:74] ==> value-parameter acceptedRootTypes: Set<JavaRoot.RootType> defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex.traverseDirectoriesInPackage[ValueParameterDescriptorImpl]

'continueSearch' @ [59:93] ==> value-parameter continueSearch: (VirtualFile, JavaRoot.RootType) -> Boolean defined in org.jetbrains.kotlin.cli.jvm.index.JvmDependenciesDynamicCompoundIndex.traverseDirectoriesInPackage[ValueParameterDescriptorImpl]

