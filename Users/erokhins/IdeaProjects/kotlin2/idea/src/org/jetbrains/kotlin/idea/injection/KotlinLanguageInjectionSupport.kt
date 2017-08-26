'NonNls' @ [43:1] ==> public constructor NonNls() defined in org.jetbrains.annotations.NonNls[JavaClassConstructorDescriptor]

'AbstractLanguageInjectionSupport' @ [45:40] ==> public constructor AbstractLanguageInjectionSupport() defined in org.intellij.plugins.intelliLang.inject.AbstractLanguageInjectionSupport[JavaClassConstructorDescriptor]

'KOTLIN_SUPPORT_ID' @ [46:36] ==> @NonNls public val KOTLIN_SUPPORT_ID: String defined in org.jetbrains.kotlin.idea.injection in file KotlinLanguageInjectionSupport.kt[PropertyDescriptorImpl]

'arrayOf' @ [48:40] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Class<KotlinPatterns>): Array<Class<KotlinPatterns>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Class<KotlinPatterns>

'KotlinPatterns' @ [48:48] ==> @Suppress public object KotlinPatterns : StandardPatterns defined in org.jetbrains.kotlin.idea.patterns in file KotlinPatterns.kt[FakeCallableDescriptorForObject]

'java' @ [48:70] ==> public val <T> KClass<KotlinPatterns>.java: Class<KotlinPatterns> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinPatterns

'host' @ [50:68] ==> value-parameter host: PsiLanguageInjectionHost? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.isApplicableTo[ValueParameterDescriptorImpl]

'language' @ [55:13] ==> value-parameter language: Language? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.addInjectionInPlace[ValueParameterDescriptorImpl]

'host' @ [55:33] ==> value-parameter host: PsiLanguageInjectionHost? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.addInjectionInPlace[ValueParameterDescriptorImpl]

'getProjectInstance' @ [57:43] ==> public open fun getProjectInstance(p0: (Project..Project?)): (Configuration..Configuration?) defined in org.intellij.plugins.intelliLang.Configuration[JavaMethodDescriptor]

'host' @ [57:62] ==> value-parameter host: PsiLanguageInjectionHost? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.addInjectionInPlace[ValueParameterDescriptorImpl]

'project' @ [57:67] ==> public final val PsiLanguageInjectionHost.project: Project[MyPropertyDescriptor]

'advancedConfiguration' @ [57:76] ==> public final val Configuration.advancedConfiguration: (Configuration.AdvancedConfiguration..Configuration.AdvancedConfiguration?)[MyPropertyDescriptor]

'!' @ [58:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'configuration' @ [58:14] ==> val configuration: (Configuration.AdvancedConfiguration..Configuration.AdvancedConfiguration?) defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.addInjectionInPlace[LocalVariableDescriptor]

'isSourceModificationAllowed' @ [58:28] ==> public final var Configuration.AdvancedConfiguration.isSourceModificationAllowed: Boolean[MyPropertyDescriptor]

'host' @ [60:13] ==> value-parameter host: PsiLanguageInjectionHost? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.addInjectionInPlace[ValueParameterDescriptorImpl]

'putUserData' @ [60:18] ==> public abstract fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(Processor<(PsiLanguageInjectionHost..PsiLanguageInjectionHost?)>..Processor<(PsiLanguageInjectionHost..PsiLanguageInjectionHost?)>?)>, @Nullable p1: Processor<(PsiLanguageInjectionHost..PsiLanguageInjectionHost?)>?): Unit defined in com.intellij.psi.PsiLanguageInjectionHost[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Processor<(com.intellij.psi.PsiLanguageInjectionHost..com.intellij.psi.PsiLanguageInjectionHost?)>

'FIX_KEY' @ [60:51] ==> public final val FIX_KEY: (Key<(Processor<(PsiLanguageInjectionHost..PsiLanguageInjectionHost?)>..Processor<(PsiLanguageInjectionHost..PsiLanguageInjectionHost?)>?)>..Key<(Processor<(PsiLanguageInjectionHost..PsiLanguageInjectionHost?)>..Processor<(PsiLanguageInjectionHost..PsiLanguageInjectionHost?)>?)>?) defined in org.intellij.plugins.intelliLang.inject.InjectLanguageAction[JavaPropertyDescriptor]

'Processor' @ [60:60] ==> public fun <T : (Any..Any?)> Processor(function: ((PsiLanguageInjectionHost..PsiLanguageInjectionHost?)) -> Boolean): Processor<(PsiLanguageInjectionHost..PsiLanguageInjectionHost?)> defined in com.intellij.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiLanguageInjectionHost..com.intellij.psi.PsiLanguageInjectionHost?)

'addInjectionInstructionInCode' @ [61:17] ==> private fun addInjectionInstructionInCode(language: Language, host: PsiLanguageInjectionHost): Boolean defined in org.jetbrains.kotlin.idea.injection in file KotlinLanguageInjectionSupport.kt[SimpleFunctionDescriptorImpl]

'language' @ [61:47] ==> value-parameter language: Language? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.addInjectionInPlace[ValueParameterDescriptorImpl]

'fixHost' @ [61:57] ==> value-parameter fixHost: (PsiLanguageInjectionHost..PsiLanguageInjectionHost?) defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.addInjectionInPlace.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [66:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'addInjectionInstructionInCode' @ [66:14] ==> private fun addInjectionInstructionInCode(language: Language, host: PsiLanguageInjectionHost): Boolean defined in org.jetbrains.kotlin.idea.injection in file KotlinLanguageInjectionSupport.kt[SimpleFunctionDescriptorImpl]

'language' @ [66:44] ==> value-parameter language: Language? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.addInjectionInPlace[ValueParameterDescriptorImpl]

'host' @ [66:54] ==> value-parameter host: PsiLanguageInjectionHost? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.addInjectionInPlace[ValueParameterDescriptorImpl]

'getInstance' @ [70:33] ==> public open fun getInstance(p0: (Project..Project?)): (TemporaryPlacesRegistry..TemporaryPlacesRegistry?) defined in org.intellij.plugins.intelliLang.inject.TemporaryPlacesRegistry[JavaMethodDescriptor]

'host' @ [70:45] ==> value-parameter host: PsiLanguageInjectionHost? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.addInjectionInPlace[ValueParameterDescriptorImpl]

'project' @ [70:50] ==> public final val PsiLanguageInjectionHost.project: Project[MyPropertyDescriptor]

'addHostWithUndo' @ [70:59] ==> public open fun addHostWithUndo(p0: (PsiLanguageInjectionHost..PsiLanguageInjectionHost?), p1: (InjectedLanguage..InjectedLanguage?)): Unit defined in org.intellij.plugins.intelliLang.inject.TemporaryPlacesRegistry[JavaMethodDescriptor]

'host' @ [70:75] ==> value-parameter host: PsiLanguageInjectionHost? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.addInjectionInPlace[ValueParameterDescriptorImpl]

'create' @ [70:98] ==> @Nullable public open fun create(p0: (String..String?)): InjectedLanguage? defined in org.intellij.plugins.intelliLang.inject.InjectedLanguage[JavaMethodDescriptor]

'language' @ [70:105] ==> value-parameter language: Language? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.addInjectionInPlace[ValueParameterDescriptorImpl]

'id' @ [70:114] ==> public final val Language.id: String[MyPropertyDescriptor]

'psiElement' @ [75:13] ==> value-parameter psiElement: PsiLanguageInjectionHost? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.removeInjectionInPlace[ValueParameterDescriptorImpl]

'psiElement' @ [75:35] ==> value-parameter psiElement: PsiLanguageInjectionHost? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.removeInjectionInPlace[ValueParameterDescriptorImpl]

'psiElement' @ [77:23] ==> value-parameter psiElement: PsiLanguageInjectionHost? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.removeInjectionInPlace[ValueParameterDescriptorImpl]

'getProject' @ [77:34] ==> @NotNull @Contract public abstract fun getProject(): Project defined in com.intellij.psi.PsiLanguageInjectionHost[JavaMethodDescriptor]

'findAnnotationInjection' @ [79:35] ==> private fun findAnnotationInjection(host: KtElement): KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.injection in file KotlinLanguageInjectionSupport.kt[SimpleFunctionDescriptorImpl]

'psiElement' @ [79:59] ==> value-parameter psiElement: PsiLanguageInjectionHost? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.removeInjectionInPlace[ValueParameterDescriptorImpl]

'findInjectionComment' @ [80:32] ==> public final fun findInjectionComment(host: KtElement): PsiComment? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport[SimpleFunctionDescriptorImpl]

'psiElement' @ [80:53] ==> value-parameter psiElement: PsiLanguageInjectionHost? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.removeInjectionInPlace[ValueParameterDescriptorImpl]

'listOf' @ [82:34] ==> public fun <T> listOf(vararg elements: PsiElement?): List<PsiElement?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement?

'injectionAnnotation' @ [82:41] ==> val injectionAnnotation: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.removeInjectionInPlace[LocalVariableDescriptor]

'injectionComment' @ [82:62] ==> val injectionComment: PsiComment? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.removeInjectionInPlace[LocalVariableDescriptor]

'filterNotNull' @ [82:80] ==> public fun <T : Any> Iterable<PsiElement?>.filterNotNull(): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PsiElement

'getProjectInstance' @ [84:43] ==> public open fun getProjectInstance(p0: (Project..Project?)): (Configuration..Configuration?) defined in org.intellij.plugins.intelliLang.Configuration[JavaMethodDescriptor]

'project' @ [84:62] ==> val project: Project defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.removeInjectionInPlace[LocalVariableDescriptor]

'getInstance' @ [86:33] ==> public open fun getInstance(p0: (Project..Project?)): (TemporaryPlacesRegistry..TemporaryPlacesRegistry?) defined in org.intellij.plugins.intelliLang.inject.TemporaryPlacesRegistry[JavaMethodDescriptor]

'project' @ [86:45] ==> val project: Project defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.removeInjectionInPlace[LocalVariableDescriptor]

'removeHostWithUndo' @ [86:54] ==> public open fun removeHostWithUndo(p0: (Project..Project?), p1: (PsiLanguageInjectionHost..PsiLanguageInjectionHost?)): Boolean defined in org.intellij.plugins.intelliLang.inject.TemporaryPlacesRegistry[JavaMethodDescriptor]

'project' @ [86:73] ==> val project: Project defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.removeInjectionInPlace[LocalVariableDescriptor]

'psiElement' @ [86:82] ==> value-parameter psiElement: PsiLanguageInjectionHost? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.removeInjectionInPlace[ValueParameterDescriptorImpl]

'configuration' @ [87:9] ==> val configuration: (Configuration..Configuration?) defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.removeInjectionInPlace[LocalVariableDescriptor]

'replaceInjectionsWithUndo' @ [87:23] ==> public open fun replaceInjectionsWithUndo(p0: (Project..Project?), p1: (MutableList<out (BaseInjection..BaseInjection?)>..List<(BaseInjection..BaseInjection?)>?), p2: (MutableList<out (BaseInjection..BaseInjection?)>..List<(BaseInjection..BaseInjection?)>?), p3: (MutableList<out (PsiElement..PsiElement?)>..List<(PsiElement..PsiElement?)>?)): Unit defined in org.intellij.plugins.intelliLang.Configuration[JavaMethodDescriptor]

'project' @ [87:49] ==> val project: Project defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.removeInjectionInPlace[LocalVariableDescriptor]

'listOf' @ [87:58] ==> @InlineOnly public inline fun <T> listOf(): List<(BaseInjection..BaseInjection?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.intellij.plugins.intelliLang.inject.config.BaseInjection..org.intellij.plugins.intelliLang.inject.config.BaseInjection?)

'listOf' @ [87:68] ==> @InlineOnly public inline fun <T> listOf(): List<(BaseInjection..BaseInjection?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.intellij.plugins.intelliLang.inject.config.BaseInjection..org.intellij.plugins.intelliLang.inject.config.BaseInjection?)

'injectInstructions' @ [87:78] ==> val injectInstructions: List<PsiElement> defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.removeInjectionInPlace[LocalVariableDescriptor]

'findCommentInjection' @ [99:30] ==> @Nullable public open fun findCommentInjection(@NotNull p0: PsiElement, @NotNull p1: String, @Nullable p2: Ref<(PsiElement..PsiElement?)>?): BaseInjection? defined in org.intellij.plugins.intelliLang.inject.InjectorUtils[JavaMethodDescriptor]

'host' @ [99:51] ==> value-parameter host: KtElement defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.findInjectionCommentLanguageId[ValueParameterDescriptorImpl]

'injectedLanguageId' @ [99:68] ==> public final var BaseInjection.injectedLanguageId: String[MyPropertyDescriptor]

'create' @ [103:30] ==> public open fun <T : (Any..Any?)> create(@Nullable p0: PsiElement?): (Ref<(PsiElement..PsiElement?)>..Ref<(PsiElement..PsiElement?)>?) defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiElement

'?:' @ [104:9] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: BaseInjection?, right: BaseInjection): BaseInjection[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> BaseInjection

'findCommentInjection' @ [104:23] ==> @Nullable public open fun findCommentInjection(@NotNull p0: PsiElement, @NotNull p1: String, @Nullable p2: Ref<(PsiElement..PsiElement?)>?): BaseInjection? defined in org.intellij.plugins.intelliLang.inject.InjectorUtils[JavaMethodDescriptor]

'host' @ [104:44] ==> value-parameter host: KtElement defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.findInjectionComment[ValueParameterDescriptorImpl]

'commentRef' @ [104:54] ==> val commentRef: (Ref<(PsiElement..PsiElement?)>..Ref<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.findInjectionComment[LocalVariableDescriptor]

'commentRef' @ [106:16] ==> val commentRef: (Ref<(PsiElement..PsiElement?)>..Ref<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.findInjectionComment[LocalVariableDescriptor]

'get' @ [106:27] ==> public final fun get(): (PsiElement..PsiElement?) defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'findAnnotationInjection' @ [110:31] ==> private fun findAnnotationInjection(host: KtElement): KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.injection in file KotlinLanguageInjectionSupport.kt[SimpleFunctionDescriptorImpl]

'host' @ [110:55] ==> value-parameter host: KtElement defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.findAnnotationInjectionLanguageId[ValueParameterDescriptorImpl]

'extractLanguageFromInjectAnnotation' @ [111:16] ==> public fun extractLanguageFromInjectAnnotation(annotationEntry: KtAnnotationEntry): String? defined in org.jetbrains.kotlin.idea.injection in file KotlinLanguageInjectionSupport.kt[SimpleFunctionDescriptorImpl]

'annotationEntry' @ [111:52] ==> val annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport.findAnnotationInjectionLanguageId[LocalVariableDescriptor]

'annotationEntry' @ [116:40] ==> value-parameter annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.injection.extractLanguageFromInjectAnnotation[ValueParameterDescriptorImpl]

'valueArguments' @ [116:56] ==> public final val KtAnnotationEntry.valueArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'firstOrNull' @ [116:71] ==> public fun <T> List<(ValueArgument..ValueArgument?)>.firstOrNull(): ValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'firstArgument' @ [118:31] ==> val firstArgument: ValueArgument defined in org.jetbrains.kotlin.idea.injection.extractLanguageFromInjectAnnotation[LocalVariableDescriptor]

'getArgumentExpression' @ [118:45] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'firstStringArgument' @ [119:28] ==> val firstStringArgument: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.injection.extractLanguageFromInjectAnnotation[LocalVariableDescriptor]

'entries' @ [119:48] ==> public final val KtStringTemplateExpression.entries: (Array<(KtStringTemplateEntry..KtStringTemplateEntry?)>..Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>)[MyPropertyDescriptor]

'singleOrNull' @ [119:56] ==> public fun <T> Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>.singleOrNull(): KtStringTemplateEntry? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtStringTemplateEntry..org.jetbrains.kotlin.psi.KtStringTemplateEntry?)

'firstStringEntry' @ [121:12] ==> val firstStringEntry: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.injection.extractLanguageFromInjectAnnotation[LocalVariableDescriptor]

'text' @ [121:29] ==> public final val KtStringTemplateEntry.text: (String..String?)[MyPropertyDescriptor]

'findElementToInjectWithAnnotation' @ [125:29] ==> private fun findElementToInjectWithAnnotation(host: KtElement): KtModifierListOwner? defined in org.jetbrains.kotlin.idea.injection in file KotlinLanguageInjectionSupport.kt[SimpleFunctionDescriptorImpl]

'host' @ [125:63] ==> value-parameter host: KtElement defined in org.jetbrains.kotlin.idea.injection.findAnnotationInjection[ValueParameterDescriptorImpl]

'modifierListOwner' @ [127:24] ==> val modifierListOwner: KtModifierListOwner defined in org.jetbrains.kotlin.idea.injection.findAnnotationInjection[LocalVariableDescriptor]

'modifierList' @ [127:42] ==> public final val KtModifierListOwner.modifierList: KtModifierList?[MyPropertyDescriptor]

'host' @ [130:9] ==> value-parameter host: KtElement defined in org.jetbrains.kotlin.idea.injection.findAnnotationInjection[ValueParameterDescriptorImpl]

'startOffset' @ [130:14] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'modifierList' @ [130:28] ==> val modifierList: KtModifierList defined in org.jetbrains.kotlin.idea.injection.findAnnotationInjection[LocalVariableDescriptor]

'endOffset' @ [130:41] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'modifierListOwner' @ [132:12] ==> val modifierListOwner: KtModifierListOwner defined in org.jetbrains.kotlin.idea.injection.findAnnotationInjection[LocalVariableDescriptor]

'findAnnotation' @ [132:30] ==> public fun KtAnnotated.findAnnotation(annotationFqName: FqName): KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'FqName' @ [132:45] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'LANGUAGE' @ [132:67] ==> public const final val LANGUAGE: String defined in com.intellij.codeInsight.AnnotationUtil[JavaPropertyDescriptor]

'?:' @ [136:18] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Module?, right: Module): Module[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Module

'findModuleForPsiElement' @ [136:33] ==> @Nullable public open fun findModuleForPsiElement(@NotNull p0: PsiElement): Module? defined in com.intellij.openapi.module.ModuleUtilCore[JavaMethodDescriptor]

'host' @ [136:57] ==> value-parameter host: PsiElement defined in org.jetbrains.kotlin.idea.injection.canInjectWithAnnotation[ValueParameterDescriptorImpl]

'getInstance' @ [137:39] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'module' @ [137:51] ==> val module: Module defined in org.jetbrains.kotlin.idea.injection.canInjectWithAnnotation[LocalVariableDescriptor]

'project' @ [137:58] ==> public final val Module.project: Project[MyPropertyDescriptor]

'javaPsiFacade' @ [139:12] ==> val javaPsiFacade: (JavaPsiFacade..JavaPsiFacade?) defined in org.jetbrains.kotlin.idea.injection.canInjectWithAnnotation[LocalVariableDescriptor]

'findClass' @ [139:26] ==> @Nullable public abstract fun findClass(@NonNls @NotNull p0: String, @NotNull p1: GlobalSearchScope): PsiClass? defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'LANGUAGE' @ [139:51] ==> public const final val LANGUAGE: String defined in com.intellij.codeInsight.AnnotationUtil[JavaPropertyDescriptor]

'moduleWithDependenciesAndLibrariesScope' @ [139:79] ==> @NotNull public open fun moduleWithDependenciesAndLibrariesScope(@NotNull p0: Module): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'module' @ [139:119] ==> val module: Module defined in org.jetbrains.kotlin.idea.injection.canInjectWithAnnotation[LocalVariableDescriptor]

'getParentOfType' @ [143:24] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtModifierListOwner..KtModifierListOwner?)>, p2: Boolean, @NotNull vararg p3: (Class<out (PsiElement..PsiElement?)>..Class<out (PsiElement..PsiElement?)>?)): KtModifierListOwner? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtModifierListOwner

'host' @ [144:13] ==> value-parameter host: KtElement defined in org.jetbrains.kotlin.idea.injection.findElementToInjectWithAnnotation[ValueParameterDescriptorImpl]

'java' @ [145:40] ==> public val <T> KClass<KtModifierListOwner>.java: Class<KtModifierListOwner> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtModifierListOwner

'KtBlockExpression' @ [147:13] ==> public constructor KtBlockExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtBlockExpression[JavaClassConstructorDescriptor]

'java' @ [147:38] ==> public val <T> KClass<KtBlockExpression>.java: Class<KtBlockExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtBlockExpression

'java' @ [147:67] ==> public val <T> KClass<KtParameterList>.java: Class<KtParameterList> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtParameterList

'java' @ [147:100] ==> public val <T> KClass<KtTypeParameterList>.java: Class<KtTypeParameterList> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtTypeParameterList

'?:' @ [152:33] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtBlockExpression?, right: KtBlockExpression): KtBlockExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtBlockExpression

'getParentOfType' @ [152:45] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtBlockExpression..KtBlockExpression?)>, p2: Boolean, @NotNull vararg p3: (Class<out (PsiElement..PsiElement?)>..Class<out (PsiElement..PsiElement?)>?)): KtBlockExpression? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtBlockExpression

'host' @ [153:13] ==> value-parameter host: KtElement defined in org.jetbrains.kotlin.idea.injection.findElementToInjectWithComment[ValueParameterDescriptorImpl]

'KtBlockExpression' @ [154:13] ==> public constructor KtBlockExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtBlockExpression[JavaClassConstructorDescriptor]

'java' @ [154:38] ==> public val <T> KClass<KtBlockExpression>.java: Class<KtBlockExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtBlockExpression

'java' @ [156:34] ==> public val <T> KClass<KtDeclaration>.java: Class<KtDeclaration> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtDeclaration

'parentBlockExpression' @ [159:12] ==> val parentBlockExpression: KtBlockExpression defined in org.jetbrains.kotlin.idea.injection.findElementToInjectWithComment[LocalVariableDescriptor]

'statements' @ [159:34] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'firstOrNull' @ [159:45] ==> public inline fun <T> Iterable<(KtExpression..KtExpression?)>.firstOrNull(predicate: ((KtExpression..KtExpression?)) -> Boolean): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'isAncestor' @ [160:21] ==> @Contract public open fun isAncestor(@Nullable p0: PsiElement?, @NotNull p1: PsiElement, p2: Boolean): Boolean defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'statement' @ [160:32] ==> value-parameter statement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.injection.findElementToInjectWithComment.<anonymous>[ValueParameterDescriptorImpl]

'host' @ [160:43] ==> value-parameter host: KtElement defined in org.jetbrains.kotlin.idea.injection.findElementToInjectWithComment[ValueParameterDescriptorImpl]

'checkIsValidPlaceForInjectionWithLineComment' @ [160:59] ==> private fun checkIsValidPlaceForInjectionWithLineComment(statement: KtExpression, host: KtElement): Boolean defined in org.jetbrains.kotlin.idea.injection in file KotlinLanguageInjectionSupport.kt[SimpleFunctionDescriptorImpl]

'statement' @ [160:104] ==> value-parameter statement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.injection.findElementToInjectWithComment.<anonymous>[ValueParameterDescriptorImpl]

'host' @ [160:115] ==> value-parameter host: KtElement defined in org.jetbrains.kotlin.idea.injection.findElementToInjectWithComment[ValueParameterDescriptorImpl]

'host' @ [165:18] ==> value-parameter host: PsiLanguageInjectionHost defined in org.jetbrains.kotlin.idea.injection.addInjectionInstructionInCode[ValueParameterDescriptorImpl]

'ktHost' @ [166:19] ==> val ktHost: KtElement defined in org.jetbrains.kotlin.idea.injection.addInjectionInstructionInCode[LocalVariableDescriptor]

'project' @ [166:26] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'findElementToInjectWithAnnotation' @ [169:29] ==> private fun findElementToInjectWithAnnotation(host: KtElement): KtModifierListOwner? defined in org.jetbrains.kotlin.idea.injection in file KotlinLanguageInjectionSupport.kt[SimpleFunctionDescriptorImpl]

'ktHost' @ [169:63] ==> val ktHost: KtElement defined in org.jetbrains.kotlin.idea.injection.addInjectionInstructionInCode[LocalVariableDescriptor]

'modifierListOwner' @ [171:9] ==> val modifierListOwner: KtModifierListOwner? defined in org.jetbrains.kotlin.idea.injection.addInjectionInstructionInCode[LocalVariableDescriptor]

'canInjectWithAnnotation' @ [171:38] ==> private fun canInjectWithAnnotation(host: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.injection in file KotlinLanguageInjectionSupport.kt[SimpleFunctionDescriptorImpl]

'ktHost' @ [171:62] ==> val ktHost: KtElement defined in org.jetbrains.kotlin.idea.injection.addInjectionInstructionInCode[LocalVariableDescriptor]

'project' @ [172:9] ==> val project: Project defined in org.jetbrains.kotlin.idea.injection.addInjectionInstructionInCode[LocalVariableDescriptor]

'executeWriteCommand' @ [172:17] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'modifierListOwner' @ [173:13] ==> val modifierListOwner: KtModifierListOwner? defined in org.jetbrains.kotlin.idea.injection.addInjectionInstructionInCode[LocalVariableDescriptor]

'addAnnotation' @ [173:31] ==> public fun KtModifierListOwner.addAnnotation(annotationFqName: FqName, annotationInnerText: String? = ..., whiteSpaceText: String = ..., addToExistingAnnotation: ((KtAnnotationEntry) -> Boolean)? = ...): Boolean defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'FqName' @ [173:45] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'LANGUAGE' @ [173:67] ==> public const final val LANGUAGE: String defined in com.intellij.codeInsight.AnnotationUtil[JavaPropertyDescriptor]

'language' @ [173:83] ==> value-parameter language: Language defined in org.jetbrains.kotlin.idea.injection.addInjectionInstructionInCode[ValueParameterDescriptorImpl]

'id' @ [173:92] ==> public final val Language.id: String[MyPropertyDescriptor]

'modifierListOwner' @ [181:13] ==> val modifierListOwner: KtModifierListOwner? defined in org.jetbrains.kotlin.idea.injection.addInjectionInstructionInCode[LocalVariableDescriptor]

'firstNonCommentChild' @ [181:32] ==> private fun PsiElement.firstNonCommentChild(): PsiElement? defined in org.jetbrains.kotlin.idea.injection in file KotlinLanguageInjectionSupport.kt[SimpleFunctionDescriptorImpl]

'findElementToInjectWithComment' @ [182:13] ==> private fun findElementToInjectWithComment(host: KtElement): KtExpression? defined in org.jetbrains.kotlin.idea.injection in file KotlinLanguageInjectionSupport.kt[SimpleFunctionDescriptorImpl]

'ktHost' @ [182:44] ==> val ktHost: KtElement defined in org.jetbrains.kotlin.idea.injection.addInjectionInstructionInCode[LocalVariableDescriptor]

'KtPsiFactory' @ [185:22] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [185:35] ==> val project: Project defined in org.jetbrains.kotlin.idea.injection.addInjectionInstructionInCode[LocalVariableDescriptor]

'psiFactory' @ [186:25] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.injection.addInjectionInstructionInCode[LocalVariableDescriptor]

'createComment' @ [186:36] ==> public final fun createComment(text: String): PsiComment defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'+' @ [186:50] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'language' @ [186:66] ==> value-parameter language: Language defined in org.jetbrains.kotlin.idea.injection.addInjectionInstructionInCode[ValueParameterDescriptorImpl]

'id' @ [186:75] ==> public final val Language.id: String[MyPropertyDescriptor]

'project' @ [188:5] ==> val project: Project defined in org.jetbrains.kotlin.idea.injection.addInjectionInstructionInCode[LocalVariableDescriptor]

'executeWriteCommand' @ [188:13] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'commentBeforeAnchor' @ [189:9] ==> val commentBeforeAnchor: PsiElement defined in org.jetbrains.kotlin.idea.injection.addInjectionInstructionInCode[LocalVariableDescriptor]

'parent' @ [189:29] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'addBefore' @ [189:36] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'injectComment' @ [189:46] ==> val injectComment: PsiComment defined in org.jetbrains.kotlin.idea.injection.addInjectionInstructionInCode[LocalVariableDescriptor]

'commentBeforeAnchor' @ [189:61] ==> val commentBeforeAnchor: PsiElement defined in org.jetbrains.kotlin.idea.injection.addInjectionInstructionInCode[LocalVariableDescriptor]

'statement' @ [198:32] ==> value-parameter statement: KtExpression defined in org.jetbrains.kotlin.idea.injection.checkIsValidPlaceForInjectionWithLineComment[ValueParameterDescriptorImpl]

'startOffset' @ [198:42] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'host' @ [199:21] ==> value-parameter host: KtElement defined in org.jetbrains.kotlin.idea.injection.checkIsValidPlaceForInjectionWithLineComment[ValueParameterDescriptorImpl]

'startOffset' @ [199:26] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'hostStart' @ [200:9] ==> val hostStart: Int defined in org.jetbrains.kotlin.idea.injection.checkIsValidPlaceForInjectionWithLineComment[LocalVariableDescriptor]

'statementStartOffset' @ [200:21] ==> val statementStartOffset: Int defined in org.jetbrains.kotlin.idea.injection.checkIsValidPlaceForInjectionWithLineComment[LocalVariableDescriptor]

'hostStart' @ [200:45] ==> val hostStart: Int defined in org.jetbrains.kotlin.idea.injection.checkIsValidPlaceForInjectionWithLineComment[LocalVariableDescriptor]

'statementStartOffset' @ [200:57] ==> val statementStartOffset: Int defined in org.jetbrains.kotlin.idea.injection.checkIsValidPlaceForInjectionWithLineComment[LocalVariableDescriptor]

'hostStart' @ [204:9] ==> val hostStart: Int defined in org.jetbrains.kotlin.idea.injection.checkIsValidPlaceForInjectionWithLineComment[LocalVariableDescriptor]

'statementStartOffset' @ [204:21] ==> val statementStartOffset: Int defined in org.jetbrains.kotlin.idea.injection.checkIsValidPlaceForInjectionWithLineComment[LocalVariableDescriptor]

'prevWalker' @ [206:13] ==> private fun prevWalker(element: PsiElement, scope: PsiElement): Iterator<PsiElement?> defined in org.jetbrains.kotlin.idea.injection[SimpleFunctionDescriptorImpl]

'host' @ [206:24] ==> value-parameter host: KtElement defined in org.jetbrains.kotlin.idea.injection.checkIsValidPlaceForInjectionWithLineComment[ValueParameterDescriptorImpl]

'statement' @ [206:30] ==> value-parameter statement: KtExpression defined in org.jetbrains.kotlin.idea.injection.checkIsValidPlaceForInjectionWithLineComment[ValueParameterDescriptorImpl]

'asSequence' @ [206:41] ==> public fun <T> Iterator<PsiElement?>.asSequence(): Sequence<PsiElement?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement?

'takeWhile' @ [206:54] ==> public fun <T> Sequence<PsiElement?>.takeWhile(predicate: (PsiElement?) -> Boolean): Sequence<PsiElement?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement?

'it' @ [206:66] ==> value-parameter it: PsiElement? defined in org.jetbrains.kotlin.idea.injection.checkIsValidPlaceForInjectionWithLineComment.<anonymous>[ValueParameterDescriptorImpl]

'any' @ [206:79] ==> public inline fun <T> Sequence<PsiElement?>.any(predicate: (PsiElement?) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement?

'it' @ [207:13] ==> value-parameter it: PsiElement? defined in org.jetbrains.kotlin.idea.injection.checkIsValidPlaceForInjectionWithLineComment.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [207:47] ==> value-parameter it: PsiElement? defined in org.jetbrains.kotlin.idea.injection.checkIsValidPlaceForInjectionWithLineComment.<anonymous>[ValueParameterDescriptorImpl]

'isValidHost' @ [207:50] ==> public final val PsiLanguageInjectionHost.isValidHost: Boolean[MyPropertyDescriptor]

'!' @ [207:65] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isEmptyOrSpaces' @ [207:77] ==> @Contract public open fun isEmptyOrSpaces(@Nullable p0: String?): Boolean defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'it' @ [207:93] ==> value-parameter it: PsiElement? defined in org.jetbrains.kotlin.idea.injection.checkIsValidPlaceForInjectionWithLineComment.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [207:96] ==> public final val PsiLanguageInjectionHost.text: (String..String?)[MyPropertyDescriptor]

'firstChild' @ [217:12] ==> public final val PsiElement.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'siblings' @ [217:23] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'dropWhile' @ [217:34] ==> public fun <T> Sequence<PsiElement>.dropWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [217:46] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.injection.firstNonCommentChild.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [217:66] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.injection.firstNonCommentChild.<anonymous>[ValueParameterDescriptorImpl]

'firstOrNull' @ [217:88] ==> public fun <T> Sequence<PsiElement>.firstOrNull(): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'element' @ [223:38] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.injection.prevWalker[ValueParameterDescriptorImpl]

'e' @ [227:27] ==> private final var e: PsiElement? defined in org.jetbrains.kotlin.idea.injection.prevWalker.<no name provided>[PropertyDescriptorImpl]

'current' @ [229:17] ==> val current: PsiElement? defined in org.jetbrains.kotlin.idea.injection.prevWalker.<no name provided>.next[LocalVariableDescriptor]

'current' @ [229:36] ==> val current: PsiElement? defined in org.jetbrains.kotlin.idea.injection.prevWalker.<no name provided>.next[LocalVariableDescriptor]

'scope' @ [229:48] ==> value-parameter scope: PsiElement defined in org.jetbrains.kotlin.idea.injection.prevWalker[ValueParameterDescriptorImpl]

'current' @ [230:24] ==> val current: PsiElement? defined in org.jetbrains.kotlin.idea.injection.prevWalker.<no name provided>.next[LocalVariableDescriptor]

'prevSibling' @ [230:32] ==> public final val PsiElement.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'e' @ [231:13] ==> private final var e: PsiElement? defined in org.jetbrains.kotlin.idea.injection.prevWalker.<no name provided>[PropertyDescriptorImpl]

'if (prev != null) {
                getDeepestLast(prev)
            }
            else {
                val parent = current.parent
                if (parent === scope || parent is PsiFile) null else parent
            }' @ [231:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'prev' @ [231:21] ==> val prev: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.injection.prevWalker.<no name provided>.next[LocalVariableDescriptor]

'getDeepestLast' @ [232:17] ==> @NotNull public open fun getDeepestLast(@NotNull p0: PsiElement): PsiElement defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'prev' @ [232:32] ==> val prev: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.injection.prevWalker.<no name provided>.next[LocalVariableDescriptor]

'current' @ [235:30] ==> val current: PsiElement? defined in org.jetbrains.kotlin.idea.injection.prevWalker.<no name provided>.next[LocalVariableDescriptor]

'parent' @ [235:38] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (parent === scope || parent is PsiFile) null else parent' @ [236:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'parent' @ [236:21] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.injection.prevWalker.<no name provided>.next[LocalVariableDescriptor]

'scope' @ [236:32] ==> value-parameter scope: PsiElement defined in org.jetbrains.kotlin.idea.injection.prevWalker[ValueParameterDescriptorImpl]

'parent' @ [236:41] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.injection.prevWalker.<no name provided>.next[LocalVariableDescriptor]

'parent' @ [236:70] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.injection.prevWalker.<no name provided>.next[LocalVariableDescriptor]

'e' @ [238:20] ==> private final var e: PsiElement? defined in org.jetbrains.kotlin.idea.injection.prevWalker.<no name provided>[PropertyDescriptorImpl]

