'ReentrantReadWriteLock' @ [36:29] ==> public constructor ReentrantReadWriteLock() defined in java.util.concurrent.locks.ReentrantReadWriteLock[JavaClassConstructorDescriptor]

'hashMapOf' @ [37:25] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<String, ScriptDependencies?> /* = HashMap<String, ScriptDependencies?> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> ScriptDependencies?

'ScriptContentLoader' @ [38:39] ==> public constructor ScriptContentLoader(project: Project) defined in org.jetbrains.kotlin.script.ScriptContentLoader[DeserializedClassConstructorDescriptor]

'project' @ [38:59] ==> value-parameter project: Project defined in org.jetbrains.kotlin.cli.common.script.CliScriptDependenciesProvider.<init>[ValueParameterDescriptorImpl]

'cacheLock' @ [40:82] ==> private final val cacheLock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.script.CliScriptDependenciesProvider[PropertyDescriptorImpl]

'read' @ [40:92] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.read(action: () -> ScriptDependencies?): ScriptDependencies? defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScriptDependencies?

'calculateExternalDependencies' @ [41:9] ==> private final fun calculateExternalDependencies(file: VirtualFile): ScriptDependencies? defined in org.jetbrains.kotlin.cli.common.script.CliScriptDependenciesProvider[SimpleFunctionDescriptorImpl]

'file' @ [41:39] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.cli.common.script.CliScriptDependenciesProvider.getScriptDependencies[ValueParameterDescriptorImpl]

'file' @ [45:20] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.cli.common.script.CliScriptDependenciesProvider.calculateExternalDependencies[ValueParameterDescriptorImpl]

'path' @ [45:25] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'cache' @ [46:22] ==> private final val cache: HashMap<String, ScriptDependencies?> /* = HashMap<String, ScriptDependencies?> */ defined in org.jetbrains.kotlin.cli.common.script.CliScriptDependenciesProvider[PropertyDescriptorImpl]

'path' @ [46:28] ==> val path: String defined in org.jetbrains.kotlin.cli.common.script.CliScriptDependenciesProvider.calculateExternalDependencies[LocalVariableDescriptor]

'if (cached != null) cached
        else {
            val scriptDef = scriptDefinitionProvider.findScriptDefinition(file)
            if (scriptDef != null) {
                val deps = scriptContentLoader.loadContentsAndResolveDependencies(scriptDef, file)

                if (deps != null) {
                    log.info("[kts] new cached deps for $path: ${deps.classpath.joinToString(File.pathSeparator)}")
                }
                cacheLock.write {
                    cache.put(path, deps)
                }
                deps
            }
            else null
        }' @ [47:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ScriptDependencies?, elseBranch: ScriptDependencies?): ScriptDependencies?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ScriptDependencies?

'cached' @ [47:20] ==> val cached: ScriptDependencies? defined in org.jetbrains.kotlin.cli.common.script.CliScriptDependenciesProvider.calculateExternalDependencies[LocalVariableDescriptor]

'cached' @ [47:36] ==> val cached: ScriptDependencies? defined in org.jetbrains.kotlin.cli.common.script.CliScriptDependenciesProvider.calculateExternalDependencies[LocalVariableDescriptor]

'scriptDefinitionProvider' @ [49:29] ==> private final val scriptDefinitionProvider: KotlinScriptDefinitionProvider defined in org.jetbrains.kotlin.cli.common.script.CliScriptDependenciesProvider[PropertyDescriptorImpl]

'findScriptDefinition' @ [49:54] ==> public final fun findScriptDefinition(file: VirtualFile): KotlinScriptDefinition? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[DeserializedSimpleFunctionDescriptor]

'file' @ [49:75] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.cli.common.script.CliScriptDependenciesProvider.calculateExternalDependencies[ValueParameterDescriptorImpl]

'if (scriptDef != null) {
                val deps = scriptContentLoader.loadContentsAndResolveDependencies(scriptDef, file)

                if (deps != null) {
                    log.info("[kts] new cached deps for $path: ${deps.classpath.joinToString(File.pathSeparator)}")
                }
                cacheLock.write {
                    cache.put(path, deps)
                }
                deps
            }
            else null' @ [50:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ScriptDependencies?, elseBranch: ScriptDependencies?): ScriptDependencies?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ScriptDependencies?

'scriptDef' @ [50:17] ==> val scriptDef: KotlinScriptDefinition? defined in org.jetbrains.kotlin.cli.common.script.CliScriptDependenciesProvider.calculateExternalDependencies[LocalVariableDescriptor]

'scriptContentLoader' @ [51:28] ==> private final val scriptContentLoader: ScriptContentLoader defined in org.jetbrains.kotlin.cli.common.script.CliScriptDependenciesProvider[PropertyDescriptorImpl]

'loadContentsAndResolveDependencies' @ [51:48] ==> public final fun loadContentsAndResolveDependencies(scriptDef: KotlinScriptDefinition, file: VirtualFile): ScriptDependencies? defined in org.jetbrains.kotlin.script.ScriptContentLoader[DeserializedSimpleFunctionDescriptor]

'scriptDef' @ [51:83] ==> val scriptDef: KotlinScriptDefinition? defined in org.jetbrains.kotlin.cli.common.script.CliScriptDependenciesProvider.calculateExternalDependencies[LocalVariableDescriptor]

'file' @ [51:94] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.cli.common.script.CliScriptDependenciesProvider.calculateExternalDependencies[ValueParameterDescriptorImpl]

'deps' @ [53:21] ==> val deps: ScriptDependencies? defined in org.jetbrains.kotlin.cli.common.script.CliScriptDependenciesProvider.calculateExternalDependencies[LocalVariableDescriptor]

'log' @ [54:21] ==> private val log: Logger defined in org.jetbrains.kotlin.cli.common.script in file CliScriptDependenciesProvider.kt[PropertyDescriptorImpl]

'info' @ [54:25] ==> public abstract fun info(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'path' @ [54:58] ==> val path: String defined in org.jetbrains.kotlin.cli.common.script.CliScriptDependenciesProvider.calculateExternalDependencies[LocalVariableDescriptor]

'deps' @ [54:66] ==> val deps: ScriptDependencies? defined in org.jetbrains.kotlin.cli.common.script.CliScriptDependenciesProvider.calculateExternalDependencies[LocalVariableDescriptor]

'classpath' @ [54:71] ==> public final val classpath: List<File> defined in kotlin.script.experimental.dependencies.ScriptDependencies[DeserializedPropertyDescriptor]

'joinToString' @ [54:81] ==> public fun <T> Iterable<File>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((File) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'pathSeparator' @ [54:99] ==> public const final val pathSeparator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'cacheLock' @ [56:17] ==> private final val cacheLock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.script.CliScriptDependenciesProvider[PropertyDescriptorImpl]

'write' @ [56:27] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> ScriptDependencies?): ScriptDependencies? defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScriptDependencies?

'cache' @ [57:21] ==> private final val cache: HashMap<String, ScriptDependencies?> /* = HashMap<String, ScriptDependencies?> */ defined in org.jetbrains.kotlin.cli.common.script.CliScriptDependenciesProvider[PropertyDescriptorImpl]

'put' @ [57:27] ==> public open fun put(key: String, value: ScriptDependencies?): ScriptDependencies? defined in java.util.HashMap[JavaMethodDescriptor]

'path' @ [57:31] ==> val path: String defined in org.jetbrains.kotlin.cli.common.script.CliScriptDependenciesProvider.calculateExternalDependencies[LocalVariableDescriptor]

'deps' @ [57:37] ==> val deps: ScriptDependencies? defined in org.jetbrains.kotlin.cli.common.script.CliScriptDependenciesProvider.calculateExternalDependencies[LocalVariableDescriptor]

'deps' @ [59:17] ==> val deps: ScriptDependencies? defined in org.jetbrains.kotlin.cli.common.script.CliScriptDependenciesProvider.calculateExternalDependencies[LocalVariableDescriptor]

'getInstance' @ [66:26] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'ScriptDependenciesProvider' @ [66:38] ==> public companion object defined in org.jetbrains.kotlin.script.ScriptDependenciesProvider[FakeCallableDescriptorForObject]

'java' @ [66:72] ==> public val <T> KClass<ScriptDependenciesProvider>.java: Class<ScriptDependenciesProvider> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ScriptDependenciesProvider

