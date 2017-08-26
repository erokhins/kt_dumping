'HashSet' @ [32:30] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> LookupSymbol

'INSTANCE' @ [33:41] ==> @NotNull public final val INSTANCE: JavaLanguage defined in com.intellij.lang.java.JavaLanguage[JavaPropertyDescriptor]

'getValue' @ [34:51] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'newDisposable' @ [35:39] ==> @NotNull public open fun newDisposable(): Disposable defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'CompilerConfiguration' @ [36:29] ==> public constructor CompilerConfiguration() defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaClassConstructorDescriptor]

'KotlinCoreEnvironment' @ [37:27] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[FakeCallableDescriptorForObject]

'createForProduction' @ [37:49] ==> @JvmStatic public final fun createForProduction(parentDisposable: Disposable, configuration: CompilerConfiguration, configFiles: EnvironmentConfigFiles): KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[DeserializedSimpleFunctionDescriptor]

'rootDisposable' @ [37:69] ==> val rootDisposable: Disposable defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.psiFileFactory.<anonymous>[LocalVariableDescriptor]

'configuration' @ [37:85] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.psiFileFactory.<anonymous>[LocalVariableDescriptor]

'JVM_CONFIG_FILES' @ [37:123] ==> enum entry JVM_CONFIG_FILES defined in org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles[FakeCallableDescriptorForObject]

'environment' @ [38:23] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.psiFileFactory.<anonymous>[LocalVariableDescriptor]

'project' @ [38:35] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'getInstance' @ [39:24] ==> public open fun getInstance(p0: (Project..Project?)): (PsiFileFactory..PsiFileFactory?) defined in com.intellij.psi.PsiFileFactory[JavaMethodDescriptor]

'project' @ [39:36] ==> val project: Project defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.psiFileFactory.<anonymous>[LocalVariableDescriptor]

'allSymbols' @ [43:21] ==> private final val allSymbols: HashSet<LookupSymbol> defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor[PropertyDescriptorImpl]

'filesDiff' @ [46:28] ==> value-parameter filesDiff: ChangedFiles.Known defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.process[ValueParameterDescriptorImpl]

'modified' @ [46:38] ==> public final val modified: List<File> defined in org.jetbrains.kotlin.incremental.ChangedFiles.Known[PropertyDescriptorImpl]

'filter' @ [46:47] ==> public inline fun <T> Iterable<File>.filter(predicate: (File) -> Boolean): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'isJavaFile' @ [46:60] ==> public fun File.isJavaFile(): Boolean defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]

'filesDiff' @ [47:27] ==> value-parameter filesDiff: ChangedFiles.Known defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.process[ValueParameterDescriptorImpl]

'removed' @ [47:37] ==> public final val removed: List<File> defined in org.jetbrains.kotlin.incremental.ChangedFiles.Known[PropertyDescriptorImpl]

'filter' @ [47:45] ==> public inline fun <T> Iterable<File>.filter(predicate: (File) -> Boolean): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'isJavaFile' @ [47:58] ==> public fun File.isJavaFile(): Boolean defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]

'removedJava' @ [49:13] ==> val removedJava: List<File> defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.process[LocalVariableDescriptor]

'any' @ [49:25] ==> public fun <T> Iterable<File>.any(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'reporter' @ [50:13] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor[PropertyDescriptorImpl]

'report' @ [50:22] ==> public abstract fun report(message: () -> String): Unit defined in org.jetbrains.kotlin.incremental.ICReporter[DeserializedSimpleFunctionDescriptor]

'removedJava' @ [50:64] ==> val removedJava: List<File> defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.process[LocalVariableDescriptor]

'joinToString' @ [50:76] ==> public fun <T> Iterable<File>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((File) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'Unknown' @ [51:34] ==> public constructor Unknown() defined in org.jetbrains.kotlin.incremental.ChangesEither.Unknown[ClassConstructorDescriptorImpl]

'HashSet' @ [54:23] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> LookupSymbol

'modifiedJava' @ [55:26] ==> val modifiedJava: List<File> defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.process[LocalVariableDescriptor]

'assert' @ [56:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'javaFile' @ [56:20] ==> val javaFile: File defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.process[LocalVariableDescriptor]

'extension' @ [56:29] ==> public val File.extension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'equals' @ [56:39] ==> public fun String?.equals(other: String?, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'javaFile' @ [58:27] ==> val javaFile: File defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.process[LocalVariableDescriptor]

'psiFile' @ [58:36] ==> private final fun File.psiFile(): PsiFile? defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor[SimpleFunctionDescriptorImpl]

'psiFile' @ [59:17] ==> val psiFile: PsiFile? defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.process[LocalVariableDescriptor]

'reporter' @ [60:17] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor[PropertyDescriptorImpl]

'report' @ [60:26] ==> public abstract fun report(message: () -> String): Unit defined in org.jetbrains.kotlin.incremental.ICReporter[DeserializedSimpleFunctionDescriptor]

'psiFile' @ [60:64] ==> val psiFile: PsiFile? defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.process[LocalVariableDescriptor]

'javaClass' @ [60:73] ==> public val <T : Any> PsiFile.javaClass: Class<PsiFile> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> PsiFile

'Unknown' @ [61:38] ==> public constructor Unknown() defined in org.jetbrains.kotlin.incremental.ChangesEither.Unknown[ClassConstructorDescriptorImpl]

'psiFile' @ [64:13] ==> val psiFile: PsiFile? defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.process[LocalVariableDescriptor]

'classes' @ [64:21] ==> public final val PsiJavaFile.classes: (Array<(PsiClass..PsiClass?)>..Array<out (PsiClass..PsiClass?)>)[MyPropertyDescriptor]

'forEach' @ [64:29] ==> public inline fun <T> Array<out (PsiClass..PsiClass?)>.forEach(action: ((PsiClass..PsiClass?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'it' @ [64:39] ==> value-parameter it: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.process.<anonymous>[ValueParameterDescriptorImpl]

'addLookupSymbols' @ [64:42] ==> private final fun PsiClass.addLookupSymbols(symbols: MutableSet<LookupSymbol>): Unit defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor[SimpleFunctionDescriptorImpl]

'symbols' @ [64:59] ==> val symbols: HashSet<LookupSymbol> defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.process[LocalVariableDescriptor]

'allSymbols' @ [66:9] ==> private final val allSymbols: HashSet<LookupSymbol> defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor[PropertyDescriptorImpl]

'addAll' @ [66:20] ==> public open fun addAll(elements: Collection<LookupSymbol>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'symbols' @ [66:27] ==> val symbols: HashSet<LookupSymbol> defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.process[LocalVariableDescriptor]

'Known' @ [67:30] ==> public constructor Known(lookupSymbols: Collection<LookupSymbol> = ..., fqNames: Collection<FqName> = ...) defined in org.jetbrains.kotlin.incremental.ChangesEither.Known[ClassConstructorDescriptorImpl]

'symbols' @ [67:52] ==> val symbols: HashSet<LookupSymbol> defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.process[LocalVariableDescriptor]

'qualifiedName' @ [71:19] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'orEmpty' @ [71:33] ==> @InlineOnly public inline fun String?.orEmpty(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'symbols' @ [73:9] ==> value-parameter symbols: MutableSet<LookupSymbol> defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.addLookupSymbols[ValueParameterDescriptorImpl]

'add' @ [73:17] ==> public abstract fun add(element: LookupSymbol): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'LookupSymbol' @ [73:21] ==> public constructor LookupSymbol(name: String, scope: String) defined in org.jetbrains.kotlin.incremental.LookupSymbol[DeserializedClassConstructorDescriptor]

'name' @ [73:34] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'orEmpty' @ [73:39] ==> @InlineOnly public inline fun String?.orEmpty(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (fqn == name) "" else fqn.removeSuffix("." + name!!)' @ [73:50] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'fqn' @ [73:54] ==> val fqn: String defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.addLookupSymbols[LocalVariableDescriptor]

'name' @ [73:61] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'fqn' @ [73:75] ==> val fqn: String defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.addLookupSymbols[LocalVariableDescriptor]

'removeSuffix' @ [73:79] ==> public fun String.removeSuffix(suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'+' @ [73:92] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'name' @ [73:98] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'methods' @ [74:9] ==> public final val PsiClass.methods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'forEach' @ [74:17] ==> public inline fun <T> Array<out (PsiMethod..PsiMethod?)>.forEach(action: ((PsiMethod..PsiMethod?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'symbols' @ [74:27] ==> value-parameter symbols: MutableSet<LookupSymbol> defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.addLookupSymbols[ValueParameterDescriptorImpl]

'add' @ [74:35] ==> public abstract fun add(element: LookupSymbol): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'LookupSymbol' @ [74:39] ==> public constructor LookupSymbol(name: String, scope: String) defined in org.jetbrains.kotlin.incremental.LookupSymbol[DeserializedClassConstructorDescriptor]

'it' @ [74:52] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.addLookupSymbols.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [74:55] ==> public final var PsiMethod.name: String[MyPropertyDescriptor]

'fqn' @ [74:61] ==> val fqn: String defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.addLookupSymbols[LocalVariableDescriptor]

'fields' @ [75:9] ==> public final val PsiClass.fields: (Array<(PsiField..PsiField?)>..Array<out (PsiField..PsiField?)>)[MyPropertyDescriptor]

'forEach' @ [75:16] ==> public inline fun <T> Array<out (PsiField..PsiField?)>.forEach(action: ((PsiField..PsiField?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiField..com.intellij.psi.PsiField?)

'symbols' @ [75:26] ==> value-parameter symbols: MutableSet<LookupSymbol> defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.addLookupSymbols[ValueParameterDescriptorImpl]

'add' @ [75:34] ==> public abstract fun add(element: LookupSymbol): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'LookupSymbol' @ [75:38] ==> public constructor LookupSymbol(name: String, scope: String) defined in org.jetbrains.kotlin.incremental.LookupSymbol[DeserializedClassConstructorDescriptor]

'it' @ [75:51] ==> value-parameter it: (PsiField..PsiField?) defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.addLookupSymbols.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [75:54] ==> public final val PsiField.name: String?[MyPropertyDescriptor]

'orEmpty' @ [75:59] ==> @InlineOnly public inline fun String?.orEmpty(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'fqn' @ [75:70] ==> val fqn: String defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.addLookupSymbols[LocalVariableDescriptor]

'innerClasses' @ [76:9] ==> public final val PsiClass.innerClasses: (Array<(PsiClass..PsiClass?)>..Array<out (PsiClass..PsiClass?)>)[MyPropertyDescriptor]

'forEach' @ [76:22] ==> public inline fun <T> Array<out (PsiClass..PsiClass?)>.forEach(action: ((PsiClass..PsiClass?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'it' @ [76:32] ==> value-parameter it: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.addLookupSymbols.<anonymous>[ValueParameterDescriptorImpl]

'addLookupSymbols' @ [76:35] ==> private final fun PsiClass.addLookupSymbols(symbols: MutableSet<LookupSymbol>): Unit defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor[SimpleFunctionDescriptorImpl]

'symbols' @ [76:52] ==> value-parameter symbols: MutableSet<LookupSymbol> defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor.addLookupSymbols[ValueParameterDescriptorImpl]

'psiFileFactory' @ [80:13] ==> private final val psiFileFactory: PsiFileFactory defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor[PropertyDescriptorImpl]

'createFileFromText' @ [80:28] ==> public abstract fun createFileFromText(@NotNull p0: String, @NotNull p1: Language, @NotNull p2: CharSequence): (PsiFile..PsiFile?) defined in com.intellij.psi.PsiFileFactory[JavaMethodDescriptor]

'nameWithoutExtension' @ [80:47] ==> public val File.nameWithoutExtension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'javaLang' @ [80:69] ==> private final val javaLang: JavaLanguage defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor[PropertyDescriptorImpl]

'readText' @ [80:79] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

