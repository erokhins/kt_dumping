'DependsOn' @ [17:1] ==> public constructor DependsOn(value: String = ..., groupId: String = ..., artifactId: String = ..., version: String = ...) defined in org.jetbrains.kotlin.script.util.DependsOn[ClassConstructorDescriptorImpl]

'RemoteRepository' @ [33:20] ==> public constructor RemoteRepository(p0: (String..String?), p1: (String..String?), p2: (String..String?)) defined in org.sonatype.aether.repository.RemoteRepository[JavaClassConstructorDescriptor]

'File' @ [38:21] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'File' @ [38:26] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'!!' @ [38:31] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: String?): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> String

'getProperty' @ [38:38] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'arrayListOf' @ [40:46] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<RemoteRepository> /* = ArrayList<RemoteRepository> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RemoteRepository

'if (repos.isEmpty()) arrayListOf(mavenCentral) else repos' @ [42:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ArrayList<RemoteRepository> /* = ArrayList<RemoteRepository> */, elseBranch: ArrayList<RemoteRepository> /* = ArrayList<RemoteRepository> */): ArrayList<RemoteRepository> /* = ArrayList<RemoteRepository> */[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ArrayList<RemoteRepository>

'repos' @ [42:38] ==> public final val repos: ArrayList<RemoteRepository> defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver[PropertyDescriptorImpl]

'isEmpty' @ [42:44] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'arrayListOf' @ [42:55] ==> public fun <T> arrayListOf(vararg elements: RemoteRepository): ArrayList<RemoteRepository> /* = ArrayList<RemoteRepository> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RemoteRepository

'mavenCentral' @ [42:67] ==> public val mavenCentral: RemoteRepository defined in org.jetbrains.kotlin.script.util.resolvers in file maven.kt[PropertyDescriptorImpl]

'repos' @ [42:86] ==> public final val repos: ArrayList<RemoteRepository> defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver[PropertyDescriptorImpl]

'isNotBlank' @ [44:41] ==> @InlineOnly public inline fun CharSequence.isNotBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'reportError' @ [49:13] ==> public final val reportError: ((String) -> Unit)? defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver[PropertyDescriptorImpl]

'invoke' @ [49:26] ==> public abstract operator fun invoke(p1: String): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'msg' @ [49:33] ==> value-parameter msg: String defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve.error[ValueParameterDescriptorImpl]

'RuntimeException' @ [49:47] ==> public final fun <init>(p0: (String..String?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'msg' @ [49:64] ==> value-parameter msg: String defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve.error[ValueParameterDescriptorImpl]

'this' @ [52:48] ==> <this> defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve.orNullIfBlank[ReceiverParameterDescriptorImpl]

'takeUnless' @ [52:54] ==> @InlineOnly @SinceKotlin public inline fun <T> String.takeUnless(predicate: (String) -> Boolean): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'String' @ [52:65] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'isBlank' @ [52:73] ==> public fun CharSequence.isBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'when {
            dependsOn.groupId.isValidParam() || dependsOn.artifactId.isValidParam() -> {
                DefaultArtifact(dependsOn.groupId.orNullIfBlank(), dependsOn.artifactId.orNullIfBlank(), null, dependsOn.version.orNullIfBlank())
            }
            dependsOn.value.isValidParam() && dependsOn.value.count { it == ':' } == 2 -> {
                DefaultArtifact(dependsOn.value)
            }
            else -> {
                error("Unknown set of arguments to maven resolver: ${dependsOn.value}")
                return null
            }
        }' @ [54:43] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DefaultArtifact, entry1: DefaultArtifact, entry2: DefaultArtifact): DefaultArtifact[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DefaultArtifact

'dependsOn' @ [55:13] ==> value-parameter dependsOn: DependsOn defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve[ValueParameterDescriptorImpl]

'groupId' @ [55:23] ==> public final val groupId: String defined in org.jetbrains.kotlin.script.util.DependsOn[PropertyDescriptorImpl]

'isValidParam' @ [55:31] ==> private final fun String.isValidParam(): Boolean defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver[SimpleFunctionDescriptorImpl]

'dependsOn' @ [55:49] ==> value-parameter dependsOn: DependsOn defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve[ValueParameterDescriptorImpl]

'artifactId' @ [55:59] ==> public final val artifactId: String defined in org.jetbrains.kotlin.script.util.DependsOn[PropertyDescriptorImpl]

'isValidParam' @ [55:70] ==> private final fun String.isValidParam(): Boolean defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver[SimpleFunctionDescriptorImpl]

'DefaultArtifact' @ [56:17] ==> public constructor DefaultArtifact(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: (String..String?)) defined in org.sonatype.aether.util.artifact.DefaultArtifact[JavaClassConstructorDescriptor]

'dependsOn' @ [56:33] ==> value-parameter dependsOn: DependsOn defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve[ValueParameterDescriptorImpl]

'groupId' @ [56:43] ==> public final val groupId: String defined in org.jetbrains.kotlin.script.util.DependsOn[PropertyDescriptorImpl]

'orNullIfBlank' @ [56:51] ==> local final fun String?.orNullIfBlank(): String? defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve[SimpleFunctionDescriptorImpl]

'dependsOn' @ [56:68] ==> value-parameter dependsOn: DependsOn defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve[ValueParameterDescriptorImpl]

'artifactId' @ [56:78] ==> public final val artifactId: String defined in org.jetbrains.kotlin.script.util.DependsOn[PropertyDescriptorImpl]

'orNullIfBlank' @ [56:89] ==> local final fun String?.orNullIfBlank(): String? defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve[SimpleFunctionDescriptorImpl]

'dependsOn' @ [56:112] ==> value-parameter dependsOn: DependsOn defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve[ValueParameterDescriptorImpl]

'version' @ [56:122] ==> public final val version: String defined in org.jetbrains.kotlin.script.util.DependsOn[PropertyDescriptorImpl]

'orNullIfBlank' @ [56:130] ==> local final fun String?.orNullIfBlank(): String? defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve[SimpleFunctionDescriptorImpl]

'dependsOn' @ [58:13] ==> value-parameter dependsOn: DependsOn defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve[ValueParameterDescriptorImpl]

'value' @ [58:23] ==> public final val value: String defined in org.jetbrains.kotlin.script.util.DependsOn[PropertyDescriptorImpl]

'isValidParam' @ [58:29] ==> private final fun String.isValidParam(): Boolean defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver[SimpleFunctionDescriptorImpl]

'dependsOn' @ [58:47] ==> value-parameter dependsOn: DependsOn defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve[ValueParameterDescriptorImpl]

'value' @ [58:57] ==> public final val value: String defined in org.jetbrains.kotlin.script.util.DependsOn[PropertyDescriptorImpl]

'count' @ [58:63] ==> public inline fun CharSequence.count(predicate: (Char) -> Boolean): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [58:71] ==> value-parameter it: Char defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve.<anonymous>[ValueParameterDescriptorImpl]

'DefaultArtifact' @ [59:17] ==> public constructor DefaultArtifact(p0: (String..String?)) defined in org.sonatype.aether.util.artifact.DefaultArtifact[JavaClassConstructorDescriptor]

'dependsOn' @ [59:33] ==> value-parameter dependsOn: DependsOn defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve[ValueParameterDescriptorImpl]

'value' @ [59:43] ==> public final val value: String defined in org.jetbrains.kotlin.script.util.DependsOn[PropertyDescriptorImpl]

'error' @ [62:17] ==> local final fun error(msg: String): Unit defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve[SimpleFunctionDescriptorImpl]

'dependsOn' @ [62:70] ==> value-parameter dependsOn: DependsOn defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve[ValueParameterDescriptorImpl]

'value' @ [62:80] ==> public final val value: String defined in org.jetbrains.kotlin.script.util.DependsOn[PropertyDescriptorImpl]

'Aether' @ [68:24] ==> public constructor Aether(@NotNull p0: (MutableCollection<(RemoteRepository..RemoteRepository?)>..Collection<(RemoteRepository..RemoteRepository?)>?), @NotNull p1: (File..File?)) defined in com.jcabi.aether.Aether[JavaClassConstructorDescriptor]

'currentRepos' @ [68:31] ==> private final fun currentRepos(): ArrayList<RemoteRepository> /* = ArrayList<RemoteRepository> */ defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver[SimpleFunctionDescriptorImpl]

'localRepo' @ [68:47] ==> public final val localRepo: File defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver[PropertyDescriptorImpl]

'resolve' @ [68:58] ==> public open fun resolve(@NotNull p0: (Artifact..Artifact?), @NotNull p1: (String..String?)): (MutableList<(Artifact..Artifact?)>..List<(Artifact..Artifact?)>?) defined in com.jcabi.aether.Aether[JavaMethodDescriptor]

'artifactId' @ [68:67] ==> val artifactId: DefaultArtifact defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve[LocalVariableDescriptor]

'RUNTIME' @ [68:90] ==> public const final val RUNTIME: String defined in org.sonatype.aether.util.artifact.JavaScopes[JavaPropertyDescriptor]

'if (deps != null)
                return deps.map { it.file }
            else {
                error("resolving ${artifactId.artifactId} failed: no results")
            }' @ [69:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'deps' @ [69:17] ==> val deps: (MutableList<(Artifact..Artifact?)>..List<(Artifact..Artifact?)>?) defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve[LocalVariableDescriptor]

'deps' @ [70:24] ==> val deps: (MutableList<(Artifact..Artifact?)>..List<(Artifact..Artifact?)>?) defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve[LocalVariableDescriptor]

'map' @ [70:29] ==> public inline fun <T, R> Iterable<(Artifact..Artifact?)>.map(transform: ((Artifact..Artifact?)) -> (File..File?)): List<(File..File?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.sonatype.aether.artifact.Artifact..org.sonatype.aether.artifact.Artifact?)
    <R> -> (java.io.File..java.io.File?)

'it' @ [70:35] ==> value-parameter it: (Artifact..Artifact?) defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [70:38] ==> public final var Artifact.file: (File..File?)[MyPropertyDescriptor]

'error' @ [72:17] ==> local final fun error(msg: String): Unit defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve[SimpleFunctionDescriptorImpl]

'artifactId' @ [72:36] ==> val artifactId: DefaultArtifact defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve[LocalVariableDescriptor]

'artifactId' @ [72:47] ==> public final val DefaultArtifact.artifactId: (String..String?)[MyPropertyDescriptor]

'reportError' @ [76:13] ==> public final val reportError: ((String) -> Unit)? defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver[PropertyDescriptorImpl]

'invoke' @ [76:26] ==> public abstract operator fun invoke(p1: String): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'artifactId' @ [76:46] ==> val artifactId: DefaultArtifact defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve[LocalVariableDescriptor]

'artifactId' @ [76:57] ==> public final val DefaultArtifact.artifactId: (String..String?)[MyPropertyDescriptor]

'e' @ [76:78] ==> val e: DependencyResolutionException defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve[LocalVariableDescriptor]

'e' @ [76:91] ==> val e: DependencyResolutionException defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryResolve[LocalVariableDescriptor]

'annotation' @ [82:22] ==> value-parameter annotation: Repository defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryAddRepo[ValueParameterDescriptorImpl]

'url' @ [82:33] ==> public final val url: String defined in org.jetbrains.kotlin.script.util.Repository[PropertyDescriptorImpl]

'takeIf' @ [82:37] ==> @InlineOnly @SinceKotlin public inline fun <T> String.takeIf(predicate: (String) -> Boolean): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [82:46] ==> value-parameter it: String defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryAddRepo.<anonymous>[ValueParameterDescriptorImpl]

'isValidParam' @ [82:49] ==> private final fun String.isValidParam(): Boolean defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver[SimpleFunctionDescriptorImpl]

'annotation' @ [82:69] ==> value-parameter annotation: Repository defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryAddRepo[ValueParameterDescriptorImpl]

'value' @ [82:80] ==> public final val value: String defined in org.jetbrains.kotlin.script.util.Repository[PropertyDescriptorImpl]

'takeIf' @ [82:86] ==> @InlineOnly @SinceKotlin public inline fun <T> String.takeIf(predicate: (String) -> Boolean): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [82:95] ==> value-parameter it: String defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryAddRepo.<anonymous>[ValueParameterDescriptorImpl]

'isValidParam' @ [82:98] ==> private final fun String.isValidParam(): Boolean defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver[SimpleFunctionDescriptorImpl]

'URL' @ [84:13] ==> public constructor URL(p0: (String..String?)) defined in java.net.URL[JavaClassConstructorDescriptor]

'urlStr' @ [84:17] ==> val urlStr: String defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryAddRepo[LocalVariableDescriptor]

'repos' @ [88:9] ==> public final val repos: ArrayList<RemoteRepository> defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver[PropertyDescriptorImpl]

'add' @ [88:15] ==> public open fun add(element: RemoteRepository): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'RemoteRepository' @ [89:17] ==> public constructor RemoteRepository(p0: (String..String?), p1: (String..String?), p2: (String..String?)) defined in org.sonatype.aether.repository.RemoteRepository[JavaClassConstructorDescriptor]

'if (annotation.id.isValidParam()) annotation.id else "central"' @ [90:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'annotation' @ [90:29] ==> value-parameter annotation: Repository defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryAddRepo[ValueParameterDescriptorImpl]

'id' @ [90:40] ==> public final val id: String defined in org.jetbrains.kotlin.script.util.Repository[PropertyDescriptorImpl]

'isValidParam' @ [90:43] ==> private final fun String.isValidParam(): Boolean defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver[SimpleFunctionDescriptorImpl]

'annotation' @ [90:59] ==> value-parameter annotation: Repository defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryAddRepo[ValueParameterDescriptorImpl]

'id' @ [90:70] ==> public final val id: String defined in org.jetbrains.kotlin.script.util.Repository[PropertyDescriptorImpl]

'urlStr' @ [92:25] ==> val urlStr: String defined in org.jetbrains.kotlin.script.util.resolvers.MavenResolver.tryAddRepo[LocalVariableDescriptor]

