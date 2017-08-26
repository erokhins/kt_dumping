'arrayListOf' @ [29:68] ==> public fun <T> arrayListOf(vararg elements: KotlinScriptDefinition): ArrayList<KotlinScriptDefinition> /* = ArrayList<KotlinScriptDefinition> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinScriptDefinition

'StandardScriptDefinition' @ [29:80] ==> public object StandardScriptDefinition : KotlinScriptDefinition defined in org.jetbrains.kotlin.script in file KotlinScriptDefinition.kt[FakeCallableDescriptorForObject]

'ReentrantReadWriteLock' @ [30:62] ==> public constructor ReentrantReadWriteLock() defined in java.util.concurrent.locks.ReentrantReadWriteLock[JavaClassConstructorDescriptor]

'definitionsLock' @ [34:9] ==> private final val definitionsLock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[PropertyDescriptorImpl]

'read' @ [34:25] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.read(action: () -> Unit): Unit defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'newDefinitions' @ [35:17] ==> value-parameter newDefinitions: List<KotlinScriptDefinition> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider.setScriptDefinitions[ValueParameterDescriptorImpl]

'definitions' @ [35:35] ==> private final val definitions: MutableList<KotlinScriptDefinition> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[PropertyDescriptorImpl]

'definitionsLock' @ [36:17] ==> private final val definitionsLock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[PropertyDescriptorImpl]

'write' @ [36:33] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> Boolean): Boolean defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'definitions' @ [37:21] ==> private final val definitions: MutableList<KotlinScriptDefinition> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[PropertyDescriptorImpl]

'clear' @ [37:33] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'definitions' @ [38:21] ==> private final val definitions: MutableList<KotlinScriptDefinition> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[PropertyDescriptorImpl]

'addAll' @ [38:33] ==> public abstract fun addAll(elements: Collection<KotlinScriptDefinition>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'newDefinitions' @ [38:40] ==> value-parameter newDefinitions: List<KotlinScriptDefinition> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider.setScriptDefinitions[ValueParameterDescriptorImpl]

'changed' @ [40:17] ==> var changed: Boolean defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider.setScriptDefinitions[LocalVariableDescriptor]

'changed' @ [43:16] ==> var changed: Boolean defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider.setScriptDefinitions[LocalVariableDescriptor]

'findScriptDefinition' @ [46:76] ==> public final fun findScriptDefinition(fileName: String): KotlinScriptDefinition? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[SimpleFunctionDescriptorImpl]

'file' @ [46:97] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider.findScriptDefinition[ValueParameterDescriptorImpl]

'name' @ [46:102] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'definitionsLock' @ [48:75] ==> private final val definitionsLock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[PropertyDescriptorImpl]

'read' @ [48:91] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.read(action: () -> KotlinScriptDefinition?): KotlinScriptDefinition? defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinScriptDefinition?

'definitions' @ [49:9] ==> private final val definitions: MutableList<KotlinScriptDefinition> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[PropertyDescriptorImpl]

'firstOrNull' @ [49:21] ==> public inline fun <T> Iterable<KotlinScriptDefinition>.firstOrNull(predicate: (KotlinScriptDefinition) -> Boolean): KotlinScriptDefinition? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinScriptDefinition

'it' @ [49:35] ==> value-parameter it: KotlinScriptDefinition defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider.findScriptDefinition.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isScript' @ [49:38] ==> public open fun isScript(fileName: String): Boolean defined in org.jetbrains.kotlin.script.KotlinScriptDefinition[SimpleFunctionDescriptorImpl]

'fileName' @ [49:47] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider.findScriptDefinition[ValueParameterDescriptorImpl]

'definitionsLock' @ [52:47] ==> private final val definitionsLock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[PropertyDescriptorImpl]

'read' @ [52:63] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.read(action: () -> Boolean): Boolean defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'definitions' @ [53:9] ==> private final val definitions: MutableList<KotlinScriptDefinition> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[PropertyDescriptorImpl]

'any' @ [53:21] ==> public inline fun <T> Iterable<KotlinScriptDefinition>.any(predicate: (KotlinScriptDefinition) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinScriptDefinition

'it' @ [53:27] ==> value-parameter it: KotlinScriptDefinition defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider.isScript.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isScript' @ [53:30] ==> public open fun isScript(fileName: String): Boolean defined in org.jetbrains.kotlin.script.KotlinScriptDefinition[SimpleFunctionDescriptorImpl]

'fileName' @ [53:39] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider.isScript[ValueParameterDescriptorImpl]

'definitionsLock' @ [57:9] ==> private final val definitionsLock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[PropertyDescriptorImpl]

'write' @ [57:25] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> Unit): Unit defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'definitions' @ [58:13] ==> private final val definitions: MutableList<KotlinScriptDefinition> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[PropertyDescriptorImpl]

'add' @ [58:25] ==> public abstract fun add(index: Int, element: KotlinScriptDefinition): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'scriptDefinition' @ [58:32] ==> value-parameter scriptDefinition: KotlinScriptDefinition defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider.addScriptDefinition[ValueParameterDescriptorImpl]

'definitionsLock' @ [63:9] ==> private final val definitionsLock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[PropertyDescriptorImpl]

'write' @ [63:25] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> Boolean): Boolean defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'definitions' @ [64:13] ==> private final val definitions: MutableList<KotlinScriptDefinition> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[PropertyDescriptorImpl]

'remove' @ [64:25] ==> public abstract fun remove(element: KotlinScriptDefinition): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'scriptDefinition' @ [64:32] ==> value-parameter scriptDefinition: KotlinScriptDefinition defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider.removeScriptDefinition[ValueParameterDescriptorImpl]

'definitionsLock' @ [68:62] ==> private final val definitionsLock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[PropertyDescriptorImpl]

'read' @ [68:78] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.read(action: () -> List<LanguageFileType>): List<LanguageFileType> defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<LanguageFileType>

'definitions' @ [69:9] ==> private final val definitions: MutableList<KotlinScriptDefinition> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[PropertyDescriptorImpl]

'map' @ [69:21] ==> public inline fun <T, R> Iterable<KotlinScriptDefinition>.map(transform: (KotlinScriptDefinition) -> LanguageFileType): List<LanguageFileType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinScriptDefinition
    <R> -> LanguageFileType

'it' @ [69:27] ==> value-parameter it: KotlinScriptDefinition defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider.getAllKnownFileTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'fileType' @ [69:30] ==> public open val fileType: LanguageFileType defined in org.jetbrains.kotlin.script.KotlinScriptDefinition[PropertyDescriptorImpl]

'distinct' @ [69:41] ==> public fun <T> Iterable<LanguageFileType>.distinct(): List<LanguageFileType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LanguageFileType

'JvmStatic' @ [73:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'getService' @ [75:32] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(KotlinScriptDefinitionProvider..KotlinScriptDefinitionProvider?)>): (KotlinScriptDefinitionProvider..KotlinScriptDefinitionProvider?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider..org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider?)

'project' @ [75:43] ==> value-parameter project: Project defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider.Companion.getInstance[ValueParameterDescriptorImpl]

'KotlinScriptDefinitionProvider' @ [75:52] ==> public companion object defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[FakeCallableDescriptorForObject]

'java' @ [75:90] ==> public val <T> KClass<KotlinScriptDefinitionProvider>.java: Class<KotlinScriptDefinitionProvider> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinScriptDefinitionProvider

'KotlinScriptDefinitionProvider' @ [80:9] ==> public companion object defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[FakeCallableDescriptorForObject]

'getInstance' @ [80:40] ==> @JvmStatic public final fun getInstance(project: Project): KotlinScriptDefinitionProvider? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider.Companion[SimpleFunctionDescriptorImpl]

'project' @ [80:52] ==> value-parameter project: Project defined in org.jetbrains.kotlin.script.getScriptDefinition[ValueParameterDescriptorImpl]

'findScriptDefinition' @ [80:62] ==> public final fun findScriptDefinition(file: VirtualFile): KotlinScriptDefinition? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[SimpleFunctionDescriptorImpl]

'file' @ [80:83] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.script.getScriptDefinition[ValueParameterDescriptorImpl]

'KotlinScriptDefinitionProvider' @ [83:9] ==> public companion object defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[FakeCallableDescriptorForObject]

'getInstance' @ [83:40] ==> @JvmStatic public final fun getInstance(project: Project): KotlinScriptDefinitionProvider? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider.Companion[SimpleFunctionDescriptorImpl]

'psiFile' @ [83:52] ==> value-parameter psiFile: PsiFile defined in org.jetbrains.kotlin.script.getScriptDefinition[ValueParameterDescriptorImpl]

'project' @ [83:60] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'findScriptDefinition' @ [83:70] ==> public final fun findScriptDefinition(fileName: String): KotlinScriptDefinition? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[SimpleFunctionDescriptorImpl]

'psiFile' @ [83:91] ==> value-parameter psiFile: PsiFile defined in org.jetbrains.kotlin.script.getScriptDefinition[ValueParameterDescriptorImpl]

'name' @ [83:99] ==> public final var PsiFile.name: String[MyPropertyDescriptor]

