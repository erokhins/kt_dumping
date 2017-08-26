'resolvers' @ [35:52] ==> value-parameter resolvers: Iterable<Resolver> defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver.<init>[ValueParameterDescriptorImpl]

'toMutableList' @ [35:62] ==> public fun <T> Iterable<Resolver>.toMutableList(): MutableList<Resolver> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Resolver

'if (resolvers.isEmpty()) baseClassPath  else baseClassPath + depsFromAnnotations' @ [38:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<File>, elseBranch: List<File>): List<File>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<File>

'resolvers' @ [38:38] ==> private final val resolvers: MutableList<Resolver> defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver[PropertyDescriptorImpl]

'isEmpty' @ [38:48] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'baseClassPath' @ [38:59] ==> public final val baseClassPath: List<File> defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver[PropertyDescriptorImpl]

'baseClassPath' @ [38:79] ==> public final val baseClassPath: List<File> defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver[PropertyDescriptorImpl]

'depsFromAnnotations' @ [38:95] ==> value-parameter depsFromAnnotations: List<File> defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver.ResolvedDependencies.<init>[ValueParameterDescriptorImpl]

'if (previousDependencies != null) emptyList() else listOf(DependsOn::class.java.`package`.name + ".*")' @ [39:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<String>, elseBranch: List<String>): List<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<String>

'previousDependencies' @ [39:36] ==> value-parameter previousDependencies: KotlinScriptExternalDependencies? defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver.ResolvedDependencies.<init>[ValueParameterDescriptorImpl]

'emptyList' @ [39:66] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'listOf' @ [39:83] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'DependsOn' @ [39:90] ==> public constructor DependsOn(value: String = ..., groupId: String = ..., artifactId: String = ..., version: String = ...) defined in org.jetbrains.kotlin.script.util.DependsOn[ClassConstructorDescriptorImpl]

'java' @ [39:107] ==> public val <T> KClass<DependsOn>.java: Class<DependsOn> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DependsOn

'`package`' @ [39:112] ==> public final val <T : (Any..Any?)> Class<DependsOn>.`package`: (Package..Package?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> DependsOn

'name' @ [39:122] ==> public final val Package.name: (String..String?)[MyPropertyDescriptor]

'AcceptedAnnotations' @ [42:5] ==> public constructor AcceptedAnnotations(vararg supportedAnnotationClasses: KClass<out Annotation>) defined in kotlin.script.templates.AcceptedAnnotations[DeserializedClassConstructorDescriptor]

'DependsOn' @ [42:26] ==> public constructor DependsOn(value: String = ..., groupId: String = ..., artifactId: String = ..., version: String = ...) defined in org.jetbrains.kotlin.script.util.DependsOn[ClassConstructorDescriptorImpl]

'Repository' @ [42:44] ==> public constructor Repository(value: String = ..., id: String = ..., url: String = ...) defined in org.jetbrains.kotlin.script.util.Repository[ClassConstructorDescriptorImpl]

'resolveFromAnnotations' @ [48:47] ==> private final fun resolveFromAnnotations(script: ScriptContents): List<File> defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver[SimpleFunctionDescriptorImpl]

'script' @ [48:70] ==> value-parameter script: ScriptContents defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver.resolve[ValueParameterDescriptorImpl]

'if (previousDependencies != null && depsFromAnnotations.isEmpty()) previousDependencies
                else ResolvedDependencies(previousDependencies, depsFromAnnotations)' @ [49:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinScriptExternalDependencies, elseBranch: KotlinScriptExternalDependencies): KotlinScriptExternalDependencies[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinScriptExternalDependencies

'previousDependencies' @ [49:21] ==> value-parameter previousDependencies: KotlinScriptExternalDependencies? defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver.resolve[ValueParameterDescriptorImpl]

'depsFromAnnotations' @ [49:53] ==> val depsFromAnnotations: List<File> defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver.resolve[LocalVariableDescriptor]

'isEmpty' @ [49:73] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'previousDependencies' @ [49:84] ==> value-parameter previousDependencies: KotlinScriptExternalDependencies? defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver.resolve[ValueParameterDescriptorImpl]

'ResolvedDependencies' @ [50:22] ==> public constructor ResolvedDependencies(previousDependencies: KotlinScriptExternalDependencies?, depsFromAnnotations: List<File>) defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver.ResolvedDependencies[ClassConstructorDescriptorImpl]

'previousDependencies' @ [50:43] ==> value-parameter previousDependencies: KotlinScriptExternalDependencies? defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver.resolve[ValueParameterDescriptorImpl]

'depsFromAnnotations' @ [50:65] ==> val depsFromAnnotations: List<File> defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver.resolve[LocalVariableDescriptor]

'asFuture' @ [51:18] ==> public fun KotlinScriptExternalDependencies?.asFuture(): PseudoFuture<KotlinScriptExternalDependencies?> defined in kotlin.script.dependencies[DeserializedSimpleFunctionDescriptor]

'script' @ [55:9] ==> value-parameter script: ScriptContents defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver.resolveFromAnnotations[ValueParameterDescriptorImpl]

'annotations' @ [55:16] ==> public abstract val annotations: Iterable<Annotation> defined in kotlin.script.dependencies.ScriptContents[DeserializedPropertyDescriptor]

'forEach' @ [55:28] ==> @HidesMembers public inline fun <T> Iterable<Annotation>.forEach(action: (Annotation) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation

'when (annotation) {
                is Repository -> FlatLibDirectoryResolver.tryCreate(annotation)?.apply { resolvers.add(this) }
                        ?: resolvers.find { it is MavenResolver }?.takeIf { (it as MavenResolver).tryAddRepo(annotation) }
                        ?: throw IllegalArgumentException("Illegal argument for Repository annotation: $annotation")
                is DependsOn -> {}
                is InvalidScriptResolverAnnotation -> throw Exception("Invalid annotation ${annotation.name}", annotation.error)
                else -> throw Exception("Unknown annotation ${annotation.javaClass}")
            }' @ [56:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any, entry3: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'annotation' @ [56:19] ==> value-parameter annotation: Annotation defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver.resolveFromAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'FlatLibDirectoryResolver' @ [57:34] ==> public companion object defined in org.jetbrains.kotlin.script.util.resolvers.FlatLibDirectoryResolver[FakeCallableDescriptorForObject]

'tryCreate' @ [57:59] ==> public final fun tryCreate(annotation: Repository): FlatLibDirectoryResolver? defined in org.jetbrains.kotlin.script.util.resolvers.FlatLibDirectoryResolver.Companion[SimpleFunctionDescriptorImpl]

'annotation' @ [57:69] ==> value-parameter annotation: Annotation defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver.resolveFromAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'apply' @ [57:82] ==> @InlineOnly public inline fun <T> FlatLibDirectoryResolver.apply(block: FlatLibDirectoryResolver.() -> Unit): FlatLibDirectoryResolver defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FlatLibDirectoryResolver

'resolvers' @ [57:90] ==> private final val resolvers: MutableList<Resolver> defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver[PropertyDescriptorImpl]

'add' @ [57:100] ==> public abstract fun add(element: Resolver): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'this' @ [57:104] ==> <this> defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver.resolveFromAnnotations.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'resolvers' @ [58:28] ==> private final val resolvers: MutableList<Resolver> defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver[PropertyDescriptorImpl]

'find' @ [58:38] ==> @InlineOnly public inline fun <T> Iterable<Resolver>.find(predicate: (Resolver) -> Boolean): Resolver? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Resolver

'it' @ [58:45] ==> value-parameter it: Resolver defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver.resolveFromAnnotations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'takeIf' @ [58:68] ==> @InlineOnly @SinceKotlin public inline fun <T> Resolver.takeIf(predicate: (Resolver) -> Boolean): Resolver? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Resolver

'it' @ [58:78] ==> value-parameter it: Resolver defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver.resolveFromAnnotations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'tryAddRepo' @ [58:99] ==> public final fun tryAddRepo(annotation: Repository): Boolean defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver[SimpleFunctionDescriptorImpl]

'annotation' @ [58:110] ==> value-parameter annotation: Annotation defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver.resolveFromAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [59:34] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'annotation' @ [59:105] ==> value-parameter annotation: Annotation defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver.resolveFromAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'Exception' @ [61:61] ==> public final fun <init>(p0: (String..String?), p1: (Throwable..Throwable?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'annotation' @ [61:93] ==> value-parameter annotation: Annotation defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver.resolveFromAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [61:104] ==> public final val name: String defined in org.jetbrains.kotlin.script.InvalidScriptResolverAnnotation[DeserializedPropertyDescriptor]

'annotation' @ [61:112] ==> value-parameter annotation: Annotation defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver.resolveFromAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'error' @ [61:123] ==> public final val error: Exception? /* = Exception? */ defined in org.jetbrains.kotlin.script.InvalidScriptResolverAnnotation[DeserializedPropertyDescriptor]

'Exception' @ [62:31] ==> public final fun <init>(p0: (String..String?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'annotation' @ [62:63] ==> value-parameter annotation: Annotation defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver.resolveFromAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'javaClass' @ [62:74] ==> public val <T : Any> Annotation.javaClass: Class<Annotation> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Annotation

'script' @ [65:16] ==> value-parameter script: ScriptContents defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver.resolveFromAnnotations[ValueParameterDescriptorImpl]

'annotations' @ [65:23] ==> public abstract val annotations: Iterable<Annotation> defined in kotlin.script.dependencies.ScriptContents[DeserializedPropertyDescriptor]

'filterIsInstance' @ [65:35] ==> public fun <R> Iterable<*>.filterIsInstance(klass: Class<DependsOn>): List<DependsOn> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> DependsOn

'DependsOn' @ [65:52] ==> public constructor DependsOn(value: String = ..., groupId: String = ..., artifactId: String = ..., version: String = ...) defined in org.jetbrains.kotlin.script.util.DependsOn[ClassConstructorDescriptorImpl]

'java' @ [65:69] ==> public val <T> KClass<DependsOn>.java: Class<DependsOn> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DependsOn

'flatMap' @ [65:75] ==> public inline fun <T, R> Iterable<DependsOn>.flatMap(transform: (DependsOn) -> Iterable<File>): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DependsOn
    <R> -> File

'resolvers' @ [66:13] ==> private final val resolvers: MutableList<Resolver> defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver[PropertyDescriptorImpl]

'asSequence' @ [66:23] ==> public fun <T> Iterable<Resolver>.asSequence(): Sequence<Resolver> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Resolver

'mapNotNull' @ [66:36] ==> public fun <T, R : Any> Sequence<Resolver>.mapNotNull(transform: (Resolver) -> Iterable<File>?): Sequence<Iterable<File>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Resolver
    <R : Any> -> Iterable<File>

'it' @ [66:49] ==> value-parameter it: Resolver defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver.resolveFromAnnotations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'tryResolve' @ [66:52] ==> public abstract fun tryResolve(dependsOn: DependsOn): Iterable<File>? defined in org.jetbrains.kotlin.script.util.resolvers.Resolver[SimpleFunctionDescriptorImpl]

'dep' @ [66:63] ==> value-parameter dep: DependsOn defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver.resolveFromAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'firstOrNull' @ [66:70] ==> public fun <T> Sequence<Iterable<File>>.firstOrNull(): Iterable<File>? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Iterable<File>

'Exception' @ [67:27] ==> public final fun <init>(p0: (String..String?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'dep' @ [67:68] ==> value-parameter dep: DependsOn defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver.resolveFromAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'KotlinAnnotatedScriptDependenciesResolver' @ [73:9] ==> public constructor KotlinAnnotatedScriptDependenciesResolver(baseClassPath: List<File>, resolvers: Iterable<Resolver>) defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver[ClassConstructorDescriptorImpl]

'emptyList' @ [73:51] ==> public fun <T> emptyList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'arrayListOf' @ [73:64] ==> public fun <T> arrayListOf(vararg elements: DirectResolver): ArrayList<DirectResolver> /* = ArrayList<DirectResolver> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DirectResolver

'DirectResolver' @ [73:76] ==> public constructor DirectResolver() defined in org.jetbrains.kotlin.script.util.resolvers.DirectResolver[ClassConstructorDescriptorImpl]

'KotlinAnnotatedScriptDependenciesResolver' @ [76:9] ==> public constructor KotlinAnnotatedScriptDependenciesResolver(baseClassPath: List<File>, resolvers: Iterable<Resolver>) defined in org.jetbrains.kotlin.script.util.KotlinAnnotatedScriptDependenciesResolver[ClassConstructorDescriptorImpl]

'emptyList' @ [76:51] ==> public fun <T> emptyList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'arrayListOf' @ [76:64] ==> public fun <T> arrayListOf(vararg elements: Resolver): ArrayList<Resolver> /* = ArrayList<Resolver> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Resolver

'DirectResolver' @ [76:76] ==> public constructor DirectResolver() defined in org.jetbrains.kotlin.script.util.resolvers.DirectResolver[ClassConstructorDescriptorImpl]

'MavenResolver' @ [76:94] ==> public constructor MavenResolver(reportError: ((String) -> Unit)? = ...) defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver[ClassConstructorDescriptorImpl]

