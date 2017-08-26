'RunConfigurationProducer<JetRunConfiguration>' @ [38:40] ==> protected/*protected and package*/ constructor RunConfigurationProducer<T : (RunConfiguration..RunConfiguration?)>(p0: (ConfigurationType..ConfigurationType?)) defined in com.intellij.execution.actions.RunConfigurationProducer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (RunConfiguration..RunConfiguration?)> -> JetRunConfiguration

'getInstance' @ [38:110] ==> public open fun getInstance(): (JetRunConfigurationType..JetRunConfigurationType?) defined in org.jetbrains.kotlin.idea.run.JetRunConfigurationType[JavaMethodDescriptor]

'context' @ [43:24] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.setupConfigurationFromContext[ValueParameterDescriptorImpl]

'location' @ [43:32] ==> public final val ConfigurationContext.location: raw (Location<(PsiElement..PsiElement?)>?..Location<*>?)[MyPropertyDescriptor]

'location' @ [44:22] ==> val location: (Location<(PsiElement..PsiElement?)>..Location<*>) defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.setupConfigurationFromContext[LocalVariableDescriptor]

'module' @ [44:31] ==> public final val <E : (PsiElement..PsiElement?)> Location<(PsiElement..PsiElement?)>.module: Module?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'getEntryPointContainer' @ [45:25] ==> private final fun getEntryPointContainer(location: Location<*>?): KtDeclarationContainer? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer[SimpleFunctionDescriptorImpl]

'location' @ [45:48] ==> val location: (Location<(PsiElement..PsiElement?)>..Location<*>) defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.setupConfigurationFromContext[LocalVariableDescriptor]

'getStartClassFqName' @ [46:32] ==> public final fun getStartClassFqName(container: KtDeclarationContainer?): String? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion[SimpleFunctionDescriptorImpl]

'container' @ [46:52] ==> val container: KtDeclarationContainer? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.setupConfigurationFromContext[LocalVariableDescriptor]

'configuration' @ [48:9] ==> value-parameter configuration: JetRunConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.setupConfigurationFromContext[ValueParameterDescriptorImpl]

'setModule' @ [48:23] ==> public open fun setModule(p0: (Module..Module?)): Unit defined in org.jetbrains.kotlin.idea.run.JetRunConfiguration[JavaMethodDescriptor]

'module' @ [48:33] ==> val module: Module defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.setupConfigurationFromContext[LocalVariableDescriptor]

'configuration' @ [49:9] ==> value-parameter configuration: JetRunConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.setupConfigurationFromContext[ValueParameterDescriptorImpl]

'runClass' @ [49:23] ==> public final var JetRunConfiguration.runClass: String?[MyPropertyDescriptor]

'startClassFQName' @ [49:34] ==> val startClassFQName: String defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.setupConfigurationFromContext[LocalVariableDescriptor]

'configuration' @ [50:9] ==> value-parameter configuration: JetRunConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.setupConfigurationFromContext[ValueParameterDescriptorImpl]

'setGeneratedName' @ [50:23] ==> public open fun setGeneratedName(): Unit defined in org.jetbrains.kotlin.idea.run.JetRunConfiguration[JavaMethodDescriptor]

'location' @ [56:13] ==> value-parameter location: Location<*>? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.getEntryPointContainer[ValueParameterDescriptorImpl]

'getInstance' @ [57:25] ==> public open fun getInstance(@NotNull p0: Project): (DumbService..DumbService?) defined in com.intellij.openapi.project.DumbService[JavaMethodDescriptor]

'location' @ [57:37] ==> value-parameter location: Location<*>? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.getEntryPointContainer[ValueParameterDescriptorImpl]

'project' @ [57:46] ==> public final val <E : (PsiElement..PsiElement?)> Location<out (PsiElement..PsiElement?)>.project: Project[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'isDumb' @ [57:55] ==> public final val DumbService.isDumb: Boolean[MyPropertyDescriptor]

'location' @ [59:22] ==> value-parameter location: Location<*>? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.getEntryPointContainer[ValueParameterDescriptorImpl]

'module' @ [59:31] ==> public final val <E : (PsiElement..PsiElement?)> Location<out (PsiElement..PsiElement?)>.module: Module?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'!=' @ [61:13] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.resolve.TargetPlatform[DeserializedSimpleFunctionDescriptor]

'getPlatform' @ [61:36] ==> @NotNull public open fun getPlatform(@NotNull p0: Module): TargetPlatform defined in org.jetbrains.kotlin.idea.project.TargetPlatformDetector[JavaMethodDescriptor]

'module' @ [61:48] ==> val module: Module defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.getEntryPointContainer[LocalVariableDescriptor]

'JvmPlatform' @ [61:59] ==> public object JvmPlatform : TargetPlatform defined in org.jetbrains.kotlin.resolve.jvm.platform[FakeCallableDescriptorForObject]

'location' @ [63:31] ==> value-parameter location: Location<*>? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.getEntryPointContainer[ValueParameterDescriptorImpl]

'psiElement' @ [63:40] ==> public final val <E : (PsiElement..PsiElement?)> Location<out (PsiElement..PsiElement?)>.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'getEntryPointContainer' @ [65:16] ==> public final fun getEntryPointContainer(locationElement: PsiElement): KtDeclarationContainer? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion[SimpleFunctionDescriptorImpl]

'locationElement' @ [65:39] ==> val locationElement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.getEntryPointContainer[LocalVariableDescriptor]

'getStartClassFqName' @ [69:32] ==> public final fun getStartClassFqName(container: KtDeclarationContainer?): String? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion[SimpleFunctionDescriptorImpl]

'getEntryPointContainer' @ [69:52] ==> private final fun getEntryPointContainer(location: Location<*>?): KtDeclarationContainer? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer[SimpleFunctionDescriptorImpl]

'context' @ [69:75] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.isConfigurationFromContext[ValueParameterDescriptorImpl]

'location' @ [69:83] ==> public final val ConfigurationContext.location: raw (Location<(PsiElement..PsiElement?)>?..Location<*>?)[MyPropertyDescriptor]

'configuration' @ [71:16] ==> value-parameter configuration: JetRunConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.isConfigurationFromContext[ValueParameterDescriptorImpl]

'runClass' @ [71:30] ==> public final var JetRunConfiguration.runClass: String?[MyPropertyDescriptor]

'startClassFQName' @ [71:42] ==> val startClassFQName: String defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.isConfigurationFromContext[LocalVariableDescriptor]

'context' @ [72:16] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.isConfigurationFromContext[ValueParameterDescriptorImpl]

'module' @ [72:24] ==> public final val ConfigurationContext.module: (Module..Module?)[MyPropertyDescriptor]

'configuration' @ [72:35] ==> value-parameter configuration: JetRunConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.isConfigurationFromContext[ValueParameterDescriptorImpl]

'configurationModule' @ [72:49] ==> public final val JetRunConfiguration.configurationModule: (RunConfigurationModule..RunConfigurationModule?)[MyPropertyDescriptor]

'module' @ [72:69] ==> public final var RunConfigurationModule.module: Module?[MyPropertyDescriptor]

'locationElement' @ [77:27] ==> value-parameter locationElement: PsiElement defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getEntryPointContainer[ValueParameterDescriptorImpl]

'containingFile' @ [77:43] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'!' @ [78:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'psiFile' @ [78:19] ==> val psiFile: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getEntryPointContainer[LocalVariableDescriptor]

'ProjectRootsUtil' @ [78:40] ==> public object ProjectRootsUtil defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'isInProjectOrLibSource' @ [78:57] ==> @JvmStatic public final fun isInProjectOrLibSource(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[DeserializedSimpleFunctionDescriptor]

'psiFile' @ [78:80] ==> val psiFile: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getEntryPointContainer[LocalVariableDescriptor]

'psiFile' @ [80:36] ==> val psiFile: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getEntryPointContainer[LocalVariableDescriptor]

'getResolutionFacade' @ [80:44] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'MainFunctionDetector' @ [81:40] ==> public constructor MainFunctionDetector(functionResolver: (KtNamedFunction) -> FunctionDescriptor?) defined in org.jetbrains.kotlin.idea.MainFunctionDetector[DeserializedClassConstructorDescriptor]

'resolutionFacade' @ [81:63] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getEntryPointContainer[LocalVariableDescriptor]

'resolveToDescriptor' @ [81:80] ==> public abstract fun resolveToDescriptor(declaration: KtDeclaration, bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'it' @ [81:100] ==> value-parameter it: KtNamedFunction defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getEntryPointContainer.<anonymous>[ValueParameterDescriptorImpl]

'locationElement' @ [83:34] ==> value-parameter locationElement: PsiElement defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getEntryPointContainer[ValueParameterDescriptorImpl]

'declarationContainer' @ [83:50] ==> private final fun PsiElement.declarationContainer(strict: Boolean): KtDeclarationContainer? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion[SimpleFunctionDescriptorImpl]

'currentElement' @ [84:20] ==> var currentElement: KtDeclarationContainer? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getEntryPointContainer[LocalVariableDescriptor]

'currentElement' @ [85:43] ==> var currentElement: KtDeclarationContainer? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getEntryPointContainer[LocalVariableDescriptor]

'entryPointContainer' @ [86:21] ==> var entryPointContainer: KtDeclarationContainer? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getEntryPointContainer[LocalVariableDescriptor]

'entryPointContainer' @ [87:21] ==> var entryPointContainer: KtDeclarationContainer? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getEntryPointContainer[LocalVariableDescriptor]

'entryPointContainer' @ [87:43] ==> var entryPointContainer: KtDeclarationContainer? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getEntryPointContainer[LocalVariableDescriptor]

'companionObjects' @ [87:63] ==> public final val KtClass.companionObjects: List<KtObjectDeclaration>[MyPropertyDescriptor]

'singleOrNull' @ [87:80] ==> public fun <T> List<KtObjectDeclaration>.singleOrNull(): KtObjectDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtObjectDeclaration

'entryPointContainer' @ [89:21] ==> var entryPointContainer: KtDeclarationContainer? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getEntryPointContainer[LocalVariableDescriptor]

'mainFunctionDetector' @ [89:52] ==> val mainFunctionDetector: MainFunctionDetector defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getEntryPointContainer[LocalVariableDescriptor]

'hasMain' @ [89:73] ==> public final fun hasMain(declarations: List<KtDeclaration>): Boolean defined in org.jetbrains.kotlin.idea.MainFunctionDetector[DeserializedSimpleFunctionDescriptor]

'entryPointContainer' @ [89:81] ==> var entryPointContainer: KtDeclarationContainer? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getEntryPointContainer[LocalVariableDescriptor]

'declarations' @ [89:101] ==> public final val KtDeclarationContainer.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'entryPointContainer' @ [89:123] ==> var entryPointContainer: KtDeclarationContainer? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getEntryPointContainer[LocalVariableDescriptor]

'currentElement' @ [90:17] ==> var currentElement: KtDeclarationContainer? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getEntryPointContainer[LocalVariableDescriptor]

'currentElement' @ [90:35] ==> var currentElement: KtDeclarationContainer? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getEntryPointContainer[LocalVariableDescriptor]

'declarationContainer' @ [90:65] ==> private final fun PsiElement.declarationContainer(strict: Boolean): KtDeclarationContainer? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion[SimpleFunctionDescriptorImpl]

'when(container) {
            null -> null
            is KtFile -> container.javaFileFacadeFqName.asString()
            is KtClassOrObject -> {
                if (!container.isValid) {
                    null
                }
                else if (container is KtObjectDeclaration && container.isCompanion()) {
                    val containerClass = container.getParentOfType<KtClass>(true)
                    containerClass?.toLightClass()?.let { ClassUtil.getJVMClassName(it) }
                }
                else {
                    container.toLightClass()?.let { ClassUtil.getJVMClassName(it) }
                }
            }
            else -> throw IllegalArgumentException("Invalid entry-point container: " + (container as PsiElement).text)
        }' @ [96:80] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?, entry3: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'container' @ [96:85] ==> value-parameter container: KtDeclarationContainer? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getStartClassFqName[ValueParameterDescriptorImpl]

'container' @ [98:26] ==> value-parameter container: KtDeclarationContainer? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getStartClassFqName[ValueParameterDescriptorImpl]

'javaFileFacadeFqName' @ [98:36] ==> public val KtFile.javaFileFacadeFqName: FqName defined in org.jetbrains.kotlin.fileClasses[DeserializedPropertyDescriptor]

'asString' @ [98:57] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'if (!container.isValid) {
                    null
                }
                else if (container is KtObjectDeclaration && container.isCompanion()) {
                    val containerClass = container.getParentOfType<KtClass>(true)
                    containerClass?.toLightClass()?.let { ClassUtil.getJVMClassName(it) }
                }
                else {
                    container.toLightClass()?.let { ClassUtil.getJVMClassName(it) }
                }' @ [100:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'!' @ [100:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'container' @ [100:22] ==> value-parameter container: KtDeclarationContainer? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getStartClassFqName[ValueParameterDescriptorImpl]

'isValid' @ [100:32] ==> public final val KtClassOrObject.isValid: Boolean[MyPropertyDescriptor]

'if (container is KtObjectDeclaration && container.isCompanion()) {
                    val containerClass = container.getParentOfType<KtClass>(true)
                    containerClass?.toLightClass()?.let { ClassUtil.getJVMClassName(it) }
                }
                else {
                    container.toLightClass()?.let { ClassUtil.getJVMClassName(it) }
                }' @ [103:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'container' @ [103:26] ==> value-parameter container: KtDeclarationContainer? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getStartClassFqName[ValueParameterDescriptorImpl]

'container' @ [103:62] ==> value-parameter container: KtDeclarationContainer? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getStartClassFqName[ValueParameterDescriptorImpl]

'isCompanion' @ [103:72] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'container' @ [104:42] ==> value-parameter container: KtDeclarationContainer? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getStartClassFqName[ValueParameterDescriptorImpl]

'getParentOfType' @ [104:52] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClass

'containerClass' @ [105:21] ==> val containerClass: KtClass? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getStartClassFqName[LocalVariableDescriptor]

'toLightClass' @ [105:37] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'let' @ [105:53] ==> @InlineOnly public inline fun <T, R> KtLightClass.let(block: (KtLightClass) -> String?): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLightClass
    <R> -> String?

'getJVMClassName' @ [105:69] ==> @Nullable public open fun getJVMClassName(@NotNull p0: PsiClass): String? defined in com.intellij.psi.util.ClassUtil[JavaMethodDescriptor]

'it' @ [105:85] ==> value-parameter it: KtLightClass defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getStartClassFqName.<anonymous>[ValueParameterDescriptorImpl]

'container' @ [108:21] ==> value-parameter container: KtDeclarationContainer? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getStartClassFqName[ValueParameterDescriptorImpl]

'toLightClass' @ [108:31] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'let' @ [108:47] ==> @InlineOnly public inline fun <T, R> KtLightClass.let(block: (KtLightClass) -> String?): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLightClass
    <R> -> String?

'getJVMClassName' @ [108:63] ==> @Nullable public open fun getJVMClassName(@NotNull p0: PsiClass): String? defined in com.intellij.psi.util.ClassUtil[JavaMethodDescriptor]

'it' @ [108:79] ==> value-parameter it: KtLightClass defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getStartClassFqName.<anonymous>[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [111:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'+' @ [111:52] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'container' @ [111:89] ==> value-parameter container: KtDeclarationContainer? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.getStartClassFqName[ValueParameterDescriptorImpl]

'text' @ [111:114] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'if (strict)
                PsiTreeUtil.getParentOfType(this, KtClassOrObject::class.java, KtFile::class.java)
            else
                PsiTreeUtil.getNonStrictParentOfType(this, KtClassOrObject::class.java, KtFile::class.java)' @ [115:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: {PsiNamedElement & ElementBase & KtDeclarationContainer & KtAnnotated}?, elseBranch: {PsiNamedElement & ElementBase & KtDeclarationContainer & KtAnnotated}?): {PsiNamedElement & ElementBase & KtDeclarationContainer & KtAnnotated}?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> {PsiNamedElement & ElementBase & KtDeclarationContainer & KtAnnotated}?

'strict' @ [115:31] ==> value-parameter strict: Boolean defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.declarationContainer[ValueParameterDescriptorImpl]

'getParentOfType' @ [116:29] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull vararg p1: (Class<out ({PsiNamedElement & ElementBase & KtDeclarationContainer & KtAnnotated}..{PsiNamedElement & ElementBase & KtDeclarationContainer & KtAnnotated}?)>..Class<out ({PsiNamedElement & ElementBase & KtDeclarationContainer & KtAnnotated}..{PsiNamedElement & ElementBase & KtDeclarationContainer & KtAnnotated}?)>?)): {PsiNamedElement & ElementBase & KtDeclarationContainer & KtAnnotated}? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> {PsiNamedElement & ElementBase & KtDeclarationContainer & KtAnnotated}

'this' @ [116:45] ==> <this> defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.declarationContainer[ReceiverParameterDescriptorImpl]

'java' @ [116:74] ==> public val <T> KClass<KtClassOrObject>.java: Class<KtClassOrObject> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'KtFile' @ [116:80] ==> public constructor KtFile(p0: (FileViewProvider..FileViewProvider?), p1: Boolean) defined in org.jetbrains.kotlin.psi.KtFile[JavaClassConstructorDescriptor]

'java' @ [116:94] ==> public val <T> KClass<KtFile>.java: Class<KtFile> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtFile

'getNonStrictParentOfType' @ [118:29] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getNonStrictParentOfType(@Nullable p0: PsiElement?, @NotNull vararg p1: (Class<out ({PsiNamedElement & ElementBase & KtDeclarationContainer & KtAnnotated}..{PsiNamedElement & ElementBase & KtDeclarationContainer & KtAnnotated}?)>..Class<out ({PsiNamedElement & ElementBase & KtDeclarationContainer & KtAnnotated}..{PsiNamedElement & ElementBase & KtDeclarationContainer & KtAnnotated}?)>?)): {PsiNamedElement & ElementBase & KtDeclarationContainer & KtAnnotated}? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> {PsiNamedElement & ElementBase & KtDeclarationContainer & KtAnnotated}

'this' @ [118:54] ==> <this> defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.declarationContainer[ReceiverParameterDescriptorImpl]

'java' @ [118:83] ==> public val <T> KClass<KtClassOrObject>.java: Class<KtClassOrObject> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'KtFile' @ [118:89] ==> public constructor KtFile(p0: (FileViewProvider..FileViewProvider?), p1: Boolean) defined in org.jetbrains.kotlin.psi.KtFile[JavaClassConstructorDescriptor]

'java' @ [118:103] ==> public val <T> KClass<KtFile>.java: Class<KtFile> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtFile

'element' @ [119:20] ==> val element: {PsiNamedElement & ElementBase & KtDeclarationContainer & KtAnnotated}? defined in org.jetbrains.kotlin.idea.run.KotlinRunConfigurationProducer.Companion.declarationContainer[LocalVariableDescriptor]

