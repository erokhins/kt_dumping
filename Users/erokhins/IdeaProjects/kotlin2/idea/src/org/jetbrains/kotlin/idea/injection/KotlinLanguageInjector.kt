'toRegex' @ [56:61] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'BaseInjection' @ [57:47] ==> public constructor BaseInjection(@NotNull p0: String) defined in org.intellij.plugins.intelliLang.inject.config.BaseInjection[JavaClassConstructorDescriptor]

'lazy' @ [60:59] ==> public fun <T> lazy(initializer: () -> KotlinLanguageInjectionSupport?): Lazy<KotlinLanguageInjectionSupport?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinLanguageInjectionSupport?

'ArrayList' @ [61:9] ==> public final fun <E> <init>(p0: (MutableCollection<out (LanguageInjectionSupport..LanguageInjectionSupport?)>..Collection<(LanguageInjectionSupport..LanguageInjectionSupport?)>?)): ArrayList<LanguageInjectionSupport> /* = ArrayList<LanguageInjectionSupport> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> LanguageInjectionSupport

'getActiveInjectionSupports' @ [61:33] ==> public open fun getActiveInjectionSupports(): (MutableCollection<(LanguageInjectionSupport..LanguageInjectionSupport?)>..Collection<(LanguageInjectionSupport..LanguageInjectionSupport?)>?) defined in org.intellij.plugins.intelliLang.inject.InjectorUtils[JavaMethodDescriptor]

'filterIsInstance' @ [61:63] ==> public fun <R> Iterable<*>.filterIsInstance(klass: Class<KotlinLanguageInjectionSupport>): List<KotlinLanguageInjectionSupport> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> KotlinLanguageInjectionSupport

'KotlinLanguageInjectionSupport' @ [61:80] ==> public constructor KotlinLanguageInjectionSupport() defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport[ClassConstructorDescriptorImpl]

'java' @ [61:118] ==> public val <T> KClass<KotlinLanguageInjectionSupport>.java: Class<KotlinLanguageInjectionSupport> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinLanguageInjectionSupport

'firstOrNull' @ [61:124] ==> public fun <T> List<KotlinLanguageInjectionSupport>.firstOrNull(): KotlinLanguageInjectionSupport? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinLanguageInjectionSupport

'UserDataProperty' @ [65:103] ==> public constructor UserDataProperty<in R : UserDataHolder, T : Any>(key: Key<KotlinLanguageInjector.KotlinCachedInjection>) defined in org.jetbrains.kotlin.psi.UserDataProperty[DeserializedClassConstructorDescriptor]
Inferred types:
    <in R : UserDataHolder> -> KtStringTemplateExpression
    <T : Any> -> KotlinCachedInjection

'create' @ [66:17] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(KotlinLanguageInjector.KotlinCachedInjection..KotlinLanguageInjector.KotlinCachedInjection?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinCachedInjection

'context' @ [69:50] ==> value-parameter context: PsiElement defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[ValueParameterDescriptorImpl]

'!' @ [70:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'context' @ [70:14] ==> value-parameter context: PsiElement defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[ValueParameterDescriptorImpl]

'isValidHost' @ [70:22] ==> public final val KtStringTemplateExpression.isValidHost: Boolean[MyPropertyDescriptor]

'kotlinSupport' @ [72:23] ==> public final val kotlinSupport: KotlinLanguageInjectionSupport? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector[PropertyDescriptorImpl]

'!' @ [74:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ProjectRootsUtil' @ [74:14] ==> public object ProjectRootsUtil defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'isInProjectOrLibSource' @ [74:31] ==> @JvmStatic public final fun isInProjectOrLibSource(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[DeserializedSimpleFunctionDescriptor]

'ktHost' @ [74:54] ==> val ktHost: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'with' @ [76:35] ==> @InlineOnly public inline fun <T, R> with(receiver: (Application..Application?), block: (Application..Application?).() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.application.Application..com.intellij.openapi.application.Application?)
    <R> -> Boolean

'getApplication' @ [76:59] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isDispatchThread' @ [76:79] ==> public final val Application.isDispatchThread: Boolean[MyPropertyDescriptor]

'!' @ [76:99] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUnitTestMode' @ [76:100] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'ktHost' @ [77:37] ==> val ktHost: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'cachedInjectionWithModification' @ [77:44] ==> private final var KtStringTemplateExpression.cachedInjectionWithModification: KotlinLanguageInjector.KotlinCachedInjection? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector[PropertyDescriptorImpl]

'getInstance' @ [78:44] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [78:56] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector[PropertyDescriptorImpl]

'modificationTracker' @ [78:65] ==> public final val PsiManager.modificationTracker: PsiModificationTracker[MyPropertyDescriptor]

'modificationCount' @ [78:85] ==> public final val PsiModificationTracker.modificationCount: Long[MyPropertyDescriptor]

'when {
            needImmediateAnswer -> kotlinCachedInjection?.baseInjection ?: ABSENT_KOTLIN_INJECTION
            kotlinCachedInjection != null && (modificationCount == kotlinCachedInjection.modificationCount) ->
                kotlinCachedInjection.baseInjection
            else -> {
                runInReadActionWithWriteActionPriorityWithPCE {
                    val computedInjection = computeBaseInjection(ktHost, support, registrar) ?: ABSENT_KOTLIN_INJECTION
                    ktHost.cachedInjectionWithModification = KotlinCachedInjection(modificationCount, computedInjection)
                    computedInjection
                }
            }
        }' @ [80:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: BaseInjection, entry1: BaseInjection, entry2: BaseInjection): BaseInjection[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> BaseInjection

'needImmediateAnswer' @ [81:13] ==> val needImmediateAnswer: Boolean defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'kotlinCachedInjection' @ [81:36] ==> val kotlinCachedInjection: KotlinLanguageInjector.KotlinCachedInjection? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'baseInjection' @ [81:59] ==> public final val baseInjection: BaseInjection defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.KotlinCachedInjection[PropertyDescriptorImpl]

'ABSENT_KOTLIN_INJECTION' @ [81:76] ==> private final val ABSENT_KOTLIN_INJECTION: BaseInjection defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.Companion[PropertyDescriptorImpl]

'kotlinCachedInjection' @ [82:13] ==> val kotlinCachedInjection: KotlinLanguageInjector.KotlinCachedInjection? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'modificationCount' @ [82:47] ==> val modificationCount: Long defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'kotlinCachedInjection' @ [82:68] ==> val kotlinCachedInjection: KotlinLanguageInjector.KotlinCachedInjection? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'modificationCount' @ [82:90] ==> public final val modificationCount: Long defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.KotlinCachedInjection[PropertyDescriptorImpl]

'kotlinCachedInjection' @ [83:17] ==> val kotlinCachedInjection: KotlinLanguageInjector.KotlinCachedInjection? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'baseInjection' @ [83:39] ==> public final val baseInjection: BaseInjection defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.KotlinCachedInjection[PropertyDescriptorImpl]

'runInReadActionWithWriteActionPriorityWithPCE' @ [85:17] ==> public fun <T : Any> runInReadActionWithWriteActionPriorityWithPCE(f: () -> BaseInjection): BaseInjection defined in org.jetbrains.kotlin.idea[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> BaseInjection

'computeBaseInjection' @ [86:45] ==> @Suppress private final fun computeBaseInjection(ktHost: KtStringTemplateExpression, support: KotlinLanguageInjectionSupport, registrar: MultiHostRegistrar): BaseInjection? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector[SimpleFunctionDescriptorImpl]

'ktHost' @ [86:66] ==> val ktHost: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'support' @ [86:74] ==> val support: KotlinLanguageInjectionSupport defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'registrar' @ [86:83] ==> value-parameter registrar: MultiHostRegistrar defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[ValueParameterDescriptorImpl]

'ABSENT_KOTLIN_INJECTION' @ [86:97] ==> private final val ABSENT_KOTLIN_INJECTION: BaseInjection defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.Companion[PropertyDescriptorImpl]

'ktHost' @ [87:21] ==> val ktHost: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'cachedInjectionWithModification' @ [87:28] ==> private final var KtStringTemplateExpression.cachedInjectionWithModification: KotlinLanguageInjector.KotlinCachedInjection? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector[PropertyDescriptorImpl]

'KotlinCachedInjection' @ [87:62] ==> public constructor KotlinCachedInjection(modificationCount: Long, baseInjection: BaseInjection) defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.KotlinCachedInjection[ClassConstructorDescriptorImpl]

'modificationCount' @ [87:84] ==> val modificationCount: Long defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'computedInjection' @ [87:103] ==> val computedInjection: BaseInjection defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject.<anonymous>[LocalVariableDescriptor]

'computedInjection' @ [88:21] ==> val computedInjection: BaseInjection defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject.<anonymous>[LocalVariableDescriptor]

'baseInjection' @ [93:13] ==> val baseInjection: BaseInjection defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'ABSENT_KOTLIN_INJECTION' @ [93:30] ==> private final val ABSENT_KOTLIN_INJECTION: BaseInjection defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.Companion[PropertyDescriptorImpl]

'?:' @ [97:24] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Language?, right: Language): Language[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Language

'getLanguageByString' @ [97:38] ==> @Nullable public open fun getLanguageByString(p0: (String..String?)): Language? defined in org.intellij.plugins.intelliLang.inject.InjectorUtils[JavaMethodDescriptor]

'baseInjection' @ [97:58] ==> val baseInjection: BaseInjection defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'injectedLanguageId' @ [97:72] ==> public final var BaseInjection.injectedLanguageId: String[MyPropertyDescriptor]

'if (ktHost.hasInterpolation()) {
            val file = ktHost.containingKtFile
            val parts = splitLiteralToInjectionParts(baseInjection, ktHost) ?: return

            if (parts.ranges.isEmpty()) return

            InjectorUtils.registerInjection(language, parts.ranges, file, registrar)
            InjectorUtils.registerSupport(support, false, registrar)
            InjectorUtils.putInjectedFileUserData(registrar, InjectedLanguageUtil.FRANKENSTEIN_INJECTION,
                                                  if (parts.isUnparsable) java.lang.Boolean.TRUE else null)
        }
        else {
            InjectorUtils.registerInjectionSimple(ktHost, baseInjection, support, registrar)
        }' @ [99:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'ktHost' @ [99:13] ==> val ktHost: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'hasInterpolation' @ [99:20] ==> public open fun hasInterpolation(): Boolean defined in org.jetbrains.kotlin.psi.KtStringTemplateExpression[JavaMethodDescriptor]

'ktHost' @ [100:24] ==> val ktHost: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'containingKtFile' @ [100:31] ==> public final val KtStringTemplateExpression.containingKtFile: KtFile[MyPropertyDescriptor]

'splitLiteralToInjectionParts' @ [101:25] ==> public fun splitLiteralToInjectionParts(injection: BaseInjection, literal: KtStringTemplateExpression): InjectionSplitResult? defined in org.jetbrains.kotlin.idea.injection in file InterpolatedStringInjectorProcessor.kt[SimpleFunctionDescriptorImpl]

'baseInjection' @ [101:54] ==> val baseInjection: BaseInjection defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'ktHost' @ [101:69] ==> val ktHost: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'parts' @ [103:17] ==> val parts: InjectionSplitResult defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'ranges' @ [103:23] ==> public final val ranges: List<Trinity<PsiLanguageInjectionHost, InjectedLanguage, TextRange>> defined in org.jetbrains.kotlin.idea.injection.InjectionSplitResult[PropertyDescriptorImpl]

'isEmpty' @ [103:30] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'registerInjection' @ [105:27] ==> public open fun registerInjection(p0: (Language..Language?), p1: (MutableList<(Trinity<(PsiLanguageInjectionHost..PsiLanguageInjectionHost?), (InjectedLanguage..InjectedLanguage?), (TextRange..TextRange?)>..Trinity<(PsiLanguageInjectionHost..PsiLanguageInjectionHost?), (InjectedLanguage..InjectedLanguage?), (TextRange..TextRange?)>?)>..List<(Trinity<(PsiLanguageInjectionHost..PsiLanguageInjectionHost?), (InjectedLanguage..InjectedLanguage?), (TextRange..TextRange?)>..Trinity<(PsiLanguageInjectionHost..PsiLanguageInjectionHost?), (InjectedLanguage..InjectedLanguage?), (TextRange..TextRange?)>?)>?), p2: (PsiFile..PsiFile?), p3: (MultiHostRegistrar..MultiHostRegistrar?)): Unit defined in org.intellij.plugins.intelliLang.inject.InjectorUtils[JavaMethodDescriptor]

'language' @ [105:45] ==> val language: Language defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'parts' @ [105:55] ==> val parts: InjectionSplitResult defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'ranges' @ [105:61] ==> public final val ranges: List<Trinity<PsiLanguageInjectionHost, InjectedLanguage, TextRange>> defined in org.jetbrains.kotlin.idea.injection.InjectionSplitResult[PropertyDescriptorImpl]

'file' @ [105:69] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'registrar' @ [105:75] ==> value-parameter registrar: MultiHostRegistrar defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[ValueParameterDescriptorImpl]

'registerSupport' @ [106:27] ==> public open fun registerSupport(@NotNull p0: LanguageInjectionSupport, p1: Boolean, @NotNull p2: MultiHostRegistrar): Unit defined in org.intellij.plugins.intelliLang.inject.InjectorUtils[JavaMethodDescriptor]

'support' @ [106:43] ==> val support: KotlinLanguageInjectionSupport defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'registrar' @ [106:59] ==> value-parameter registrar: MultiHostRegistrar defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[ValueParameterDescriptorImpl]

'putInjectedFileUserData' @ [107:27] ==> public open fun <T : (Any..Any?)> putInjectedFileUserData(p0: (MultiHostRegistrar..MultiHostRegistrar?), p1: (Key<(Boolean..Boolean?)>..Key<(Boolean..Boolean?)>?), p2: (Boolean..Boolean?)): Unit defined in org.intellij.plugins.intelliLang.inject.InjectorUtils[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'registrar' @ [107:51] ==> value-parameter registrar: MultiHostRegistrar defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[ValueParameterDescriptorImpl]

'FRANKENSTEIN_INJECTION' @ [107:83] ==> public final val FRANKENSTEIN_INJECTION: (Key<(Boolean..Boolean?)>..Key<(Boolean..Boolean?)>?) defined in com.intellij.psi.impl.source.tree.injected.InjectedLanguageUtil[JavaPropertyDescriptor]

'if (parts.isUnparsable) java.lang.Boolean.TRUE else null' @ [108:51] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Boolean..Boolean?), elseBranch: (Boolean..Boolean?)): (Boolean..Boolean?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Boolean..kotlin.Boolean?)

'parts' @ [108:55] ==> val parts: InjectionSplitResult defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'isUnparsable' @ [108:61] ==> public final val isUnparsable: Boolean defined in org.jetbrains.kotlin.idea.injection.InjectionSplitResult[PropertyDescriptorImpl]

'TRUE' @ [108:93] ==> public final val TRUE: (Boolean..Boolean?) defined in java.lang.Boolean[JavaPropertyDescriptor]

'registerInjectionSimple' @ [111:27] ==> public open fun registerInjectionSimple(@NotNull p0: PsiLanguageInjectionHost, @NotNull p1: BaseInjection, @Nullable p2: LanguageInjectionSupport?, @NotNull p3: MultiHostRegistrar): Boolean defined in org.intellij.plugins.intelliLang.inject.InjectorUtils[JavaMethodDescriptor]

'ktHost' @ [111:51] ==> val ktHost: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'baseInjection' @ [111:59] ==> val baseInjection: BaseInjection defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'support' @ [111:74] ==> val support: KotlinLanguageInjectionSupport defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[LocalVariableDescriptor]

'registrar' @ [111:83] ==> value-parameter registrar: MultiHostRegistrar defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.getLanguagesToInject[ValueParameterDescriptorImpl]

'Suppress' @ [115:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'ktHost' @ [120:30] ==> value-parameter ktHost: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.computeBaseInjection[ValueParameterDescriptorImpl]

'containingFile' @ [120:37] ==> public final val KtStringTemplateExpression.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'temporaryPlacesRegistry' @ [122:36] ==> public final val temporaryPlacesRegistry: TemporaryPlacesRegistry defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector[PropertyDescriptorImpl]

'getLanguageFor' @ [122:60] ==> @Nullable public open fun getLanguageFor(@NotNull p0: PsiLanguageInjectionHost, p1: (PsiFile..PsiFile?)): InjectedLanguage? defined in org.intellij.plugins.intelliLang.inject.TemporaryPlacesRegistry[JavaMethodDescriptor]

'ktHost' @ [122:75] ==> value-parameter ktHost: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.computeBaseInjection[ValueParameterDescriptorImpl]

'containingFile' @ [122:83] ==> val containingFile: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.computeBaseInjection[LocalVariableDescriptor]

'tempInjectedLanguage' @ [123:13] ==> val tempInjectedLanguage: InjectedLanguage? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.computeBaseInjection[LocalVariableDescriptor]

'putInjectedFileUserData' @ [124:27] ==> public open fun <T : (Any..Any?)> putInjectedFileUserData(p0: (MultiHostRegistrar..MultiHostRegistrar?), p1: (Key<(InjectedLanguage..InjectedLanguage?)>..Key<(InjectedLanguage..InjectedLanguage?)>?), p2: (InjectedLanguage..InjectedLanguage?)): Unit defined in org.intellij.plugins.intelliLang.inject.InjectorUtils[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> InjectedLanguage

'registrar' @ [124:51] ==> value-parameter registrar: MultiHostRegistrar defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.computeBaseInjection[ValueParameterDescriptorImpl]

'TEMPORARY_INJECTED_LANGUAGE' @ [124:87] ==> public final val TEMPORARY_INJECTED_LANGUAGE: (Key<(InjectedLanguage..InjectedLanguage?)>..Key<(InjectedLanguage..InjectedLanguage?)>?) defined in org.intellij.plugins.intelliLang.inject.LanguageInjectionSupport[JavaPropertyDescriptor]

'tempInjectedLanguage' @ [124:116] ==> val tempInjectedLanguage: InjectedLanguage? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.computeBaseInjection[LocalVariableDescriptor]

'BaseInjection' @ [125:20] ==> public constructor BaseInjection(@NotNull p0: String) defined in org.intellij.plugins.intelliLang.inject.config.BaseInjection[JavaClassConstructorDescriptor]

'support' @ [125:34] ==> value-parameter support: KotlinLanguageInjectionSupport defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.computeBaseInjection[ValueParameterDescriptorImpl]

'id' @ [125:42] ==> public final val KotlinLanguageInjectionSupport.id: String[MyPropertyDescriptor]

'apply' @ [125:46] ==> @InlineOnly public inline fun <T> BaseInjection.apply(block: BaseInjection.() -> Unit): BaseInjection defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BaseInjection

'injectedLanguageId' @ [126:17] ==> public final var BaseInjection.injectedLanguageId: String[MyPropertyDescriptor]

'tempInjectedLanguage' @ [126:38] ==> val tempInjectedLanguage: InjectedLanguage? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.computeBaseInjection[LocalVariableDescriptor]

'id' @ [126:59] ==> public final val InjectedLanguage.id: String[MyPropertyDescriptor]

'prefix' @ [127:17] ==> public final var BaseInjection.prefix: String[MyPropertyDescriptor]

'tempInjectedLanguage' @ [127:26] ==> val tempInjectedLanguage: InjectedLanguage? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.computeBaseInjection[LocalVariableDescriptor]

'prefix' @ [127:47] ==> public final val InjectedLanguage.prefix: String[MyPropertyDescriptor]

'suffix' @ [128:17] ==> public final var BaseInjection.suffix: String[MyPropertyDescriptor]

'tempInjectedLanguage' @ [128:26] ==> val tempInjectedLanguage: InjectedLanguage? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.computeBaseInjection[LocalVariableDescriptor]

'suffix' @ [128:47] ==> public final val InjectedLanguage.suffix: String[MyPropertyDescriptor]

'findInjectionInfo' @ [132:16] ==> private final fun findInjectionInfo(place: KtElement, originalHost: Boolean = ...): KotlinLanguageInjector.InjectionInfo? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector[SimpleFunctionDescriptorImpl]

'ktHost' @ [132:34] ==> value-parameter ktHost: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.computeBaseInjection[ValueParameterDescriptorImpl]

'toBaseInjection' @ [132:43] ==> public final fun toBaseInjection(injectionSupport: KotlinLanguageInjectionSupport): BaseInjection? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.InjectionInfo[SimpleFunctionDescriptorImpl]

'support' @ [132:59] ==> value-parameter support: KotlinLanguageInjectionSupport defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.computeBaseInjection[ValueParameterDescriptorImpl]

'listOf' @ [136:16] ==> public fun <T> listOf(element: Class<KtStringTemplateExpression>): List<Class<KtStringTemplateExpression>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<KtStringTemplateExpression>

'KtStringTemplateExpression' @ [136:23] ==> public constructor KtStringTemplateExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtStringTemplateExpression[JavaClassConstructorDescriptor]

'java' @ [136:57] ==> public val <T> KClass<KtStringTemplateExpression>.java: Class<KtStringTemplateExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtStringTemplateExpression

'injectWithExplicitCodeInstruction' @ [140:16] ==> private final fun injectWithExplicitCodeInstruction(host: KtElement): KotlinLanguageInjector.InjectionInfo? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector[SimpleFunctionDescriptorImpl]

'place' @ [140:50] ==> value-parameter place: KtElement defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.findInjectionInfo[ValueParameterDescriptorImpl]

'injectWithCall' @ [141:19] ==> private final fun injectWithCall(host: KtElement): KotlinLanguageInjector.InjectionInfo? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector[SimpleFunctionDescriptorImpl]

'place' @ [141:34] ==> value-parameter place: KtElement defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.findInjectionInfo[ValueParameterDescriptorImpl]

'injectWithReceiver' @ [142:19] ==> private final fun injectWithReceiver(host: KtElement): KotlinLanguageInjector.InjectionInfo? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector[SimpleFunctionDescriptorImpl]

'place' @ [142:38] ==> value-parameter place: KtElement defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.findInjectionInfo[ValueParameterDescriptorImpl]

'injectWithVariableUsage' @ [143:19] ==> private final fun injectWithVariableUsage(host: KtElement, originalHost: Boolean): KotlinLanguageInjector.InjectionInfo? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector[SimpleFunctionDescriptorImpl]

'place' @ [143:43] ==> value-parameter place: KtElement defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.findInjectionInfo[ValueParameterDescriptorImpl]

'originalHost' @ [143:50] ==> value-parameter originalHost: Boolean = ... defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.findInjectionInfo[ValueParameterDescriptorImpl]

'kotlinSupport' @ [147:23] ==> public final val kotlinSupport: KotlinLanguageInjectionSupport? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector[PropertyDescriptorImpl]

'support' @ [149:17] ==> val support: KotlinLanguageInjectionSupport defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithExplicitCodeInstruction[LocalVariableDescriptor]

'findInjectionCommentLanguageId' @ [149:25] ==> public final fun findInjectionCommentLanguageId(host: KtElement): String? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport[SimpleFunctionDescriptorImpl]

'host' @ [149:56] ==> value-parameter host: KtElement defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithExplicitCodeInstruction[ValueParameterDescriptorImpl]

'support' @ [150:17] ==> val support: KotlinLanguageInjectionSupport defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithExplicitCodeInstruction[LocalVariableDescriptor]

'findAnnotationInjectionLanguageId' @ [150:25] ==> public final fun findAnnotationInjectionLanguageId(host: KtElement): String? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjectionSupport[SimpleFunctionDescriptorImpl]

'host' @ [150:59] ==> value-parameter host: KtElement defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithExplicitCodeInstruction[ValueParameterDescriptorImpl]

'InjectionInfo' @ [152:16] ==> public constructor InjectionInfo(languageId: String?, prefix: String?, suffix: String?) defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.InjectionInfo[ClassConstructorDescriptorImpl]

'languageId' @ [152:30] ==> val languageId: String defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithExplicitCodeInstruction[LocalVariableDescriptor]

'host' @ [156:35] ==> value-parameter host: KtElement defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithReceiver[ValueParameterDescriptorImpl]

'parent' @ [156:40] ==> public final val KtElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'qualifiedExpression' @ [157:13] ==> val qualifiedExpression: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithReceiver[LocalVariableDescriptor]

'receiverExpression' @ [157:33] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'host' @ [157:55] ==> value-parameter host: KtElement defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithReceiver[ValueParameterDescriptorImpl]

'qualifiedExpression' @ [159:30] ==> val qualifiedExpression: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithReceiver[LocalVariableDescriptor]

'selectorExpression' @ [159:50] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'callExpression' @ [160:22] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithReceiver[LocalVariableDescriptor]

'calleeExpression' @ [160:37] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'isAnalyzeOff' @ [162:13] ==> private final fun isAnalyzeOff(project: Project): Boolean defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector[SimpleFunctionDescriptorImpl]

'qualifiedExpression' @ [162:26] ==> val qualifiedExpression: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithReceiver[LocalVariableDescriptor]

'project' @ [162:46] ==> public final val KtDotQualifiedExpression.project: Project[MyPropertyDescriptor]

'getInstance' @ [164:46] ==> public open fun getInstance(): (Configuration..Configuration?) defined in org.intellij.plugins.intelliLang.Configuration[JavaMethodDescriptor]

'getInjections' @ [164:60] ==> @NotNull public open fun getInjections(p0: (String..String?)): (MutableList<(BaseInjection..BaseInjection?)>..List<(BaseInjection..BaseInjection?)>) defined in org.intellij.plugins.intelliLang.Configuration[JavaMethodDescriptor]

'KOTLIN_SUPPORT_ID' @ [164:74] ==> @NonNls public val KOTLIN_SUPPORT_ID: String defined in org.jetbrains.kotlin.idea.injection in file KotlinLanguageInjectionSupport.kt[PropertyDescriptorImpl]

'callee' @ [166:26] ==> val callee: KtExpression defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithReceiver[LocalVariableDescriptor]

'text' @ [166:33] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'collectPossibleNames' @ [167:29] ==> private final fun collectPossibleNames(injections: List<BaseInjection>): Set<String> defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector[SimpleFunctionDescriptorImpl]

'kotlinInjections' @ [167:50] ==> val kotlinInjections: (MutableList<(BaseInjection..BaseInjection?)>..List<(BaseInjection..BaseInjection?)>) defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithReceiver[LocalVariableDescriptor]

'calleeName' @ [169:13] ==> val calleeName: (String..String?) defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithReceiver[LocalVariableDescriptor]

'possibleNames' @ [169:28] ==> val possibleNames: Set<String> defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithReceiver[LocalVariableDescriptor]

'callee' @ [173:27] ==> val callee: KtExpression defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithReceiver[LocalVariableDescriptor]

'references' @ [173:34] ==> public final val KtExpression.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'checkCanceled' @ [174:29] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'reference' @ [176:30] ==> val reference: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithReceiver[LocalVariableDescriptor]

'resolve' @ [176:40] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiReference[JavaMethodDescriptor]

'resolvedTo' @ [177:17] ==> val resolvedTo: PsiElement? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithReceiver[LocalVariableDescriptor]

'findInjection' @ [178:37] ==> private final fun findInjection(element: PsiElement?, injections: List<BaseInjection>): KotlinLanguageInjector.InjectionInfo? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector[SimpleFunctionDescriptorImpl]

'resolvedTo' @ [178:51] ==> val resolvedTo: PsiElement? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithReceiver[LocalVariableDescriptor]

'receiverTypeReference' @ [178:62] ==> public final val KtFunction.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'kotlinInjections' @ [178:85] ==> val kotlinInjections: (MutableList<(BaseInjection..BaseInjection?)>..List<(BaseInjection..BaseInjection?)>) defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithReceiver[LocalVariableDescriptor]

'injectionInfo' @ [179:21] ==> val injectionInfo: KotlinLanguageInjector.InjectionInfo? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithReceiver[LocalVariableDescriptor]

'injectionInfo' @ [180:28] ==> val injectionInfo: KotlinLanguageInjector.InjectionInfo? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithReceiver[LocalVariableDescriptor]

'HashSet' @ [189:22] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'injections' @ [191:27] ==> value-parameter injections: List<BaseInjection> defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.collectPossibleNames[ValueParameterDescriptorImpl]

'injection' @ [192:35] ==> val injection: BaseInjection defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.collectPossibleNames[LocalVariableDescriptor]

'injectionPlaces' @ [192:45] ==> public final val BaseInjection.injectionPlaces: (Array<(InjectionPlace..InjectionPlace?)>..Array<out (InjectionPlace..InjectionPlace?)>)[MyPropertyDescriptor]

'injectionPlaces' @ [193:27] ==> val injectionPlaces: (Array<(InjectionPlace..InjectionPlace?)>..Array<out (InjectionPlace..InjectionPlace?)>) defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.collectPossibleNames[LocalVariableDescriptor]

'place' @ [194:32] ==> val place: (InjectionPlace..InjectionPlace?) defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.collectPossibleNames[LocalVariableDescriptor]

'toString' @ [194:38] ==> public open fun toString(): String defined in org.intellij.plugins.intelliLang.inject.config.InjectionPlace[JavaMethodDescriptor]

'STRING_LITERALS_REGEXP' @ [195:32] ==> private final val STRING_LITERALS_REGEXP: Regex defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.Companion[PropertyDescriptorImpl]

'findAll' @ [195:55] ==> public final fun findAll(input: CharSequence, startIndex: Int = ...): Sequence<MatchResult> defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'placeStr' @ [195:63] ==> val placeStr: String defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.collectPossibleNames[LocalVariableDescriptor]

'map' @ [195:73] ==> public fun <T, R> Sequence<MatchResult>.map(transform: (MatchResult) -> String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MatchResult
    <R> -> String

'it' @ [195:79] ==> value-parameter it: MatchResult defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.collectPossibleNames.<anonymous>[ValueParameterDescriptorImpl]

'groupValues' @ [195:82] ==> public abstract val groupValues: List<String> defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'result' @ [196:17] ==> val result: HashSet<String> defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.collectPossibleNames[LocalVariableDescriptor]

'addAll' @ [196:24] ==> public fun <T> MutableCollection<in String>.addAll(elements: Sequence<String>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'literals' @ [196:31] ==> val literals: Sequence<String> defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.collectPossibleNames[LocalVariableDescriptor]

'result' @ [200:16] ==> val result: HashSet<String> defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.collectPossibleNames[LocalVariableDescriptor]

'!' @ [205:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'originalHost' @ [205:14] ==> value-parameter originalHost: Boolean defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithVariableUsage[ValueParameterDescriptorImpl]

'host' @ [207:33] ==> value-parameter host: KtElement defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithVariableUsage[ValueParameterDescriptorImpl]

'host' @ [208:26] ==> value-parameter host: KtElement defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithVariableUsage[ValueParameterDescriptorImpl]

'parent' @ [208:31] ==> public final val KtElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'ktProperty' @ [209:13] ==> val ktProperty: KtProperty defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithVariableUsage[LocalVariableDescriptor]

'initializer' @ [209:24] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'host' @ [209:39] ==> value-parameter host: KtElement defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithVariableUsage[ValueParameterDescriptorImpl]

'isAnalyzeOff' @ [211:13] ==> private final fun isAnalyzeOff(project: Project): Boolean defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector[SimpleFunctionDescriptorImpl]

'ktHost' @ [211:26] ==> val ktHost: KtElement defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithVariableUsage[LocalVariableDescriptor]

'project' @ [211:33] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'LocalSearchScope' @ [213:27] ==> public constructor LocalSearchScope(@NotNull p0: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>), @Nullable p1: String?, p2: Boolean) defined in com.intellij.psi.search.LocalSearchScope[JavaClassConstructorDescriptor]

'arrayOf' @ [213:44] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiFile): Array<PsiFile> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiFile

'ktProperty' @ [213:52] ==> val ktProperty: KtProperty defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithVariableUsage[LocalVariableDescriptor]

'containingFile' @ [213:63] ==> public final val KtProperty.containingFile: PsiFile[MyPropertyDescriptor]

'search' @ [214:33] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'ktProperty' @ [214:40] ==> val ktProperty: KtProperty defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithVariableUsage[LocalVariableDescriptor]

'searchScope' @ [214:52] ==> val searchScope: LocalSearchScope defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithVariableUsage[LocalVariableDescriptor]

'asSequence' @ [214:65] ==> public fun <T> Iterable<(PsiReference..PsiReference?)>.asSequence(): Sequence<(PsiReference..PsiReference?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'mapNotNull' @ [214:78] ==> public fun <T, R : Any> Sequence<(PsiReference..PsiReference?)>.mapNotNull(transform: ((PsiReference..PsiReference?)) -> KotlinLanguageInjector.InjectionInfo?): Sequence<KotlinLanguageInjector.InjectionInfo> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)
    <R : Any> -> InjectionInfo

'psiReference' @ [215:27] ==> value-parameter psiReference: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithVariableUsage.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [215:40] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'findInjectionInfo' @ [216:13] ==> private final fun findInjectionInfo(place: KtElement, originalHost: Boolean = ...): KotlinLanguageInjector.InjectionInfo? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector[SimpleFunctionDescriptorImpl]

'element' @ [216:31] ==> val element: KtElement defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithVariableUsage.<anonymous>[LocalVariableDescriptor]

'firstOrNull' @ [217:11] ==> public fun <T> Sequence<KotlinLanguageInjector.InjectionInfo>.firstOrNull(): KotlinLanguageInjector.InjectionInfo? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InjectionInfo

'host' @ [221:33] ==> value-parameter host: KtElement defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithCall[ValueParameterDescriptorImpl]

'ktHost' @ [222:24] ==> val ktHost: KtElement defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithCall[LocalVariableDescriptor]

'parent' @ [222:31] ==> public final val KtElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'?:' @ [224:30] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtCallExpression?, right: KtCallExpression): KtCallExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtCallExpression

'getParentOfType' @ [224:42] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtCallExpression..KtCallExpression?)>): KtCallExpression? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtCallExpression

'ktHost' @ [224:58] ==> val ktHost: KtElement defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithCall[LocalVariableDescriptor]

'KtCallExpression' @ [224:66] ==> public constructor KtCallExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtCallExpression[JavaClassConstructorDescriptor]

'java' @ [224:90] ==> public val <T> KClass<KtCallExpression>.java: Class<KtCallExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtCallExpression

'callExpression' @ [225:22] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithCall[LocalVariableDescriptor]

'calleeExpression' @ [225:37] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'isAnalyzeOff' @ [227:13] ==> private final fun isAnalyzeOff(project: Project): Boolean defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector[SimpleFunctionDescriptorImpl]

'ktHost' @ [227:26] ==> val ktHost: KtElement defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithCall[LocalVariableDescriptor]

'project' @ [227:33] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'callee' @ [229:27] ==> val callee: KtExpression defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithCall[LocalVariableDescriptor]

'references' @ [229:34] ==> public final val KtExpression.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'checkCanceled' @ [230:29] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'reference' @ [232:30] ==> val reference: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithCall[LocalVariableDescriptor]

'resolve' @ [232:40] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiReference[JavaMethodDescriptor]

'if (resolvedTo is PsiMethod) {
                val injectionForJavaMethod = injectionForJavaMethod(argument, resolvedTo)
                if (injectionForJavaMethod != null) {
                    return injectionForJavaMethod
                }
            }
            else if (resolvedTo is KtFunction) {
                val injectionForJavaMethod = injectionForKotlinCall(argument, resolvedTo, reference)
                if (injectionForJavaMethod != null) {
                    return injectionForJavaMethod
                }
            }' @ [233:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'resolvedTo' @ [233:17] ==> val resolvedTo: PsiElement? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithCall[LocalVariableDescriptor]

'injectionForJavaMethod' @ [234:46] ==> private final fun injectionForJavaMethod(argument: KtValueArgument, javaMethod: PsiMethod): KotlinLanguageInjector.InjectionInfo? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector[SimpleFunctionDescriptorImpl]

'argument' @ [234:69] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithCall[LocalVariableDescriptor]

'resolvedTo' @ [234:79] ==> val resolvedTo: PsiElement? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithCall[LocalVariableDescriptor]

'injectionForJavaMethod' @ [235:21] ==> val injectionForJavaMethod: KotlinLanguageInjector.InjectionInfo? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithCall[LocalVariableDescriptor]

'injectionForJavaMethod' @ [236:28] ==> val injectionForJavaMethod: KotlinLanguageInjector.InjectionInfo? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithCall[LocalVariableDescriptor]

'resolvedTo' @ [239:22] ==> val resolvedTo: PsiElement? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithCall[LocalVariableDescriptor]

'injectionForKotlinCall' @ [240:46] ==> private final fun injectionForKotlinCall(argument: KtValueArgument, ktFunction: KtFunction, reference: PsiReference): KotlinLanguageInjector.InjectionInfo? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector[SimpleFunctionDescriptorImpl]

'argument' @ [240:69] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithCall[LocalVariableDescriptor]

'resolvedTo' @ [240:79] ==> val resolvedTo: PsiElement? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithCall[LocalVariableDescriptor]

'reference' @ [240:91] ==> val reference: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithCall[LocalVariableDescriptor]

'injectionForJavaMethod' @ [241:21] ==> val injectionForJavaMethod: KotlinLanguageInjector.InjectionInfo? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithCall[LocalVariableDescriptor]

'injectionForJavaMethod' @ [242:28] ==> val injectionForJavaMethod: KotlinLanguageInjector.InjectionInfo? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectWithCall[LocalVariableDescriptor]

'argument' @ [251:30] ==> value-parameter argument: KtValueArgument defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForJavaMethod[ValueParameterDescriptorImpl]

'parent' @ [251:39] ==> public final val KtValueArgument.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'arguments' @ [251:70] ==> public final val KtValueArgumentList.arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'indexOf' @ [251:80] ==> public abstract fun indexOf(element: (KtValueArgument..KtValueArgument?)): Int defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'argument' @ [251:88] ==> value-parameter argument: KtValueArgument defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForJavaMethod[ValueParameterDescriptorImpl]

'javaMethod' @ [252:28] ==> value-parameter javaMethod: PsiMethod defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForJavaMethod[ValueParameterDescriptorImpl]

'parameterList' @ [252:39] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parameters' @ [252:53] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'getOrNull' @ [252:64] ==> public fun <T> Array<out (PsiParameter..PsiParameter?)>.getOrNull(index: Int): PsiParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiParameter..com.intellij.psi.PsiParameter?)

'argumentIndex' @ [252:74] ==> val argumentIndex: Int defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForJavaMethod[LocalVariableDescriptor]

'findInjection' @ [254:29] ==> private final fun findInjection(element: PsiElement?, injections: List<BaseInjection>): KotlinLanguageInjector.InjectionInfo? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector[SimpleFunctionDescriptorImpl]

'psiParameter' @ [254:43] ==> val psiParameter: PsiParameter defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForJavaMethod[LocalVariableDescriptor]

'getInstance' @ [254:71] ==> public open fun getInstance(): (Configuration..Configuration?) defined in org.intellij.plugins.intelliLang.Configuration[JavaMethodDescriptor]

'getInjections' @ [254:85] ==> @NotNull public open fun getInjections(p0: (String..String?)): (MutableList<(BaseInjection..BaseInjection?)>..List<(BaseInjection..BaseInjection?)>) defined in org.intellij.plugins.intelliLang.Configuration[JavaMethodDescriptor]

'JAVA_SUPPORT_ID' @ [254:128] ==> @NonNls public const final val JAVA_SUPPORT_ID: String defined in org.intellij.plugins.intelliLang.inject.java.JavaLanguageInjectionSupport[JavaPropertyDescriptor]

'injectionInfo' @ [255:13] ==> val injectionInfo: KotlinLanguageInjector.InjectionInfo? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForJavaMethod[LocalVariableDescriptor]

'injectionInfo' @ [256:20] ==> val injectionInfo: KotlinLanguageInjector.InjectionInfo? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForJavaMethod[LocalVariableDescriptor]

'getAnnotationFrom' @ [259:44] ==> public open fun getAnnotationFrom(@NotNull p0: PsiModifierListOwner, @NotNull p1: Pair<(String..String?), out (MutableSet<(String..String?)>..Set<(String..String?)>?)>, p2: Boolean): (Array<(PsiAnnotation..PsiAnnotation?)>..Array<out (PsiAnnotation..PsiAnnotation?)>?) defined in org.intellij.plugins.intelliLang.util.AnnotationUtilEx[JavaMethodDescriptor]

'psiParameter' @ [260:17] ==> val psiParameter: PsiParameter defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForJavaMethod[LocalVariableDescriptor]

'getProjectInstance' @ [261:31] ==> public open fun getProjectInstance(p0: (Project..Project?)): (Configuration..Configuration?) defined in org.intellij.plugins.intelliLang.Configuration[JavaMethodDescriptor]

'psiParameter' @ [261:50] ==> val psiParameter: PsiParameter defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForJavaMethod[LocalVariableDescriptor]

'project' @ [261:63] ==> public final val PsiParameter.project: Project[MyPropertyDescriptor]

'advancedConfiguration' @ [261:72] ==> public final val Configuration.advancedConfiguration: (Configuration.AdvancedConfiguration..Configuration.AdvancedConfiguration?)[MyPropertyDescriptor]

'languageAnnotationPair' @ [261:94] ==> public final val Configuration.AdvancedConfiguration.languageAnnotationPair: (Pair<(String..String?), out (MutableSet<(String..String?)>..Set<(String..String?)>?)>..Pair<(String..String?), out (MutableSet<(String..String?)>..Set<(String..String?)>?)>?)[MyPropertyDescriptor]

'annotations' @ [264:13] ==> val annotations: (Array<(PsiAnnotation..PsiAnnotation?)>..Array<out (PsiAnnotation..PsiAnnotation?)>?) defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForJavaMethod[LocalVariableDescriptor]

'isNotEmpty' @ [264:25] ==> @InlineOnly public inline fun <T> Array<out (PsiAnnotation..PsiAnnotation?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiAnnotation..com.intellij.psi.PsiAnnotation?)

'processAnnotationInjectionInner' @ [265:20] ==> private final fun processAnnotationInjectionInner(annotations: Array<PsiAnnotation>): KotlinLanguageInjector.InjectionInfo? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector[SimpleFunctionDescriptorImpl]

'annotations' @ [265:52] ==> val annotations: (Array<(PsiAnnotation..PsiAnnotation?)>..Array<out (PsiAnnotation..PsiAnnotation?)>?) defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForJavaMethod[LocalVariableDescriptor]

'argument' @ [272:30] ==> value-parameter argument: KtValueArgument defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForKotlinCall[ValueParameterDescriptorImpl]

'parent' @ [272:39] ==> public final val KtValueArgument.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'arguments' @ [272:70] ==> public final val KtValueArgumentList.arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'indexOf' @ [272:80] ==> public abstract fun indexOf(element: (KtValueArgument..KtValueArgument?)): Int defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'argument' @ [272:88] ==> value-parameter argument: KtValueArgument defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForKotlinCall[ValueParameterDescriptorImpl]

'ktFunction' @ [273:27] ==> value-parameter ktFunction: KtFunction defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForKotlinCall[ValueParameterDescriptorImpl]

'valueParameters' @ [273:38] ==> public final val KtFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'getOrNull' @ [273:54] ==> public fun <T> List<(KtParameter..KtParameter?)>.getOrNull(index: Int): KtParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'argumentIndex' @ [273:64] ==> val argumentIndex: Int defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForKotlinCall[LocalVariableDescriptor]

'findInjection' @ [275:32] ==> private final fun findInjection(element: PsiElement?, injections: List<BaseInjection>): KotlinLanguageInjector.InjectionInfo? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector[SimpleFunctionDescriptorImpl]

'ktParameter' @ [275:46] ==> val ktParameter: KtParameter defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForKotlinCall[LocalVariableDescriptor]

'getInstance' @ [275:73] ==> public open fun getInstance(): (Configuration..Configuration?) defined in org.intellij.plugins.intelliLang.Configuration[JavaMethodDescriptor]

'getInjections' @ [275:87] ==> @NotNull public open fun getInjections(p0: (String..String?)): (MutableList<(BaseInjection..BaseInjection?)>..List<(BaseInjection..BaseInjection?)>) defined in org.intellij.plugins.intelliLang.Configuration[JavaMethodDescriptor]

'KOTLIN_SUPPORT_ID' @ [275:101] ==> @NonNls public val KOTLIN_SUPPORT_ID: String defined in org.jetbrains.kotlin.idea.injection in file KotlinLanguageInjectionSupport.kt[PropertyDescriptorImpl]

'patternInjection' @ [276:13] ==> val patternInjection: KotlinLanguageInjector.InjectionInfo? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForKotlinCall[LocalVariableDescriptor]

'patternInjection' @ [277:20] ==> val patternInjection: KotlinLanguageInjector.InjectionInfo? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForKotlinCall[LocalVariableDescriptor]

'reference' @ [282:27] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForKotlinCall[ValueParameterDescriptorImpl]

'ktReference' @ [283:30] ==> val ktReference: KtReference defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForKotlinCall[LocalVariableDescriptor]

'element' @ [283:42] ==> public final val KtReference.element: KtElement[MyPropertyDescriptor]

'analyze' @ [283:50] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL_WITH_DIAGNOSTICS' @ [283:74] ==> enum entry PARTIAL_WITH_DIAGNOSTICS defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'ktReference' @ [284:34] ==> val ktReference: KtReference defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForKotlinCall[LocalVariableDescriptor]

'resolveToDescriptors' @ [284:46] ==> public abstract fun resolveToDescriptors(bindingContext: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.references.KtReference[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [284:67] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForKotlinCall[LocalVariableDescriptor]

'singleOrNull' @ [284:83] ==> public fun <T> Iterable<DeclarationDescriptor>.singleOrNull(): DeclarationDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'functionDescriptor' @ [286:35] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForKotlinCall[LocalVariableDescriptor]

'valueParameters' @ [286:54] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'getOrNull' @ [286:70] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.getOrNull(index: Int): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'argumentIndex' @ [286:80] ==> val argumentIndex: Int defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForKotlinCall[LocalVariableDescriptor]

'parameterDescriptor' @ [287:32] ==> val parameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForKotlinCall[LocalVariableDescriptor]

'annotations' @ [287:52] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'findAnnotation' @ [287:64] ==> public open fun findAnnotation(fqName: FqName): AnnotationDescriptor? defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[DeserializedSimpleFunctionDescriptor]

'FqName' @ [287:79] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'LANGUAGE' @ [287:101] ==> public const final val LANGUAGE: String defined in com.intellij.codeInsight.AnnotationUtil[JavaPropertyDescriptor]

'injectAnnotation' @ [289:26] ==> val injectAnnotation: AnnotationDescriptor defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForKotlinCall[LocalVariableDescriptor]

'argumentValue' @ [289:43] ==> public fun AnnotationDescriptor.argumentValue(parameterName: String): Any? defined in org.jetbrains.kotlin.resolve.annotations[DeserializedSimpleFunctionDescriptor]

'InjectionInfo' @ [290:16] ==> public constructor InjectionInfo(languageId: String?, prefix: String?, suffix: String?) defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.InjectionInfo[ClassConstructorDescriptorImpl]

'languageId' @ [290:30] ==> val languageId: String defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.injectionForKotlinCall[LocalVariableDescriptor]

'injections' @ [294:27] ==> value-parameter injections: List<BaseInjection> defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.findInjection[ValueParameterDescriptorImpl]

'injection' @ [295:17] ==> val injection: BaseInjection defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.findInjection[LocalVariableDescriptor]

'acceptsPsiElement' @ [295:27] ==> public open fun acceptsPsiElement(p0: (PsiElement..PsiElement?)): Boolean defined in org.intellij.plugins.intelliLang.inject.config.BaseInjection[JavaMethodDescriptor]

'element' @ [295:45] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.findInjection[ValueParameterDescriptorImpl]

'InjectionInfo' @ [296:24] ==> public constructor InjectionInfo(languageId: String?, prefix: String?, suffix: String?) defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.InjectionInfo[ClassConstructorDescriptorImpl]

'injection' @ [296:38] ==> val injection: BaseInjection defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.findInjection[LocalVariableDescriptor]

'injectedLanguageId' @ [296:48] ==> public final var BaseInjection.injectedLanguageId: String[MyPropertyDescriptor]

'injection' @ [296:68] ==> val injection: BaseInjection defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.findInjection[LocalVariableDescriptor]

'prefix' @ [296:78] ==> public final var BaseInjection.prefix: String[MyPropertyDescriptor]

'injection' @ [296:86] ==> val injection: BaseInjection defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.findInjection[LocalVariableDescriptor]

'suffix' @ [296:96] ==> public final var BaseInjection.suffix: String[MyPropertyDescriptor]

'==' @ [304:16] ==> public final fun equals(other: Any?): Boolean defined in org.intellij.plugins.intelliLang.Configuration.DfaOption[DeserializedSimpleFunctionDescriptor]

'getProjectInstance' @ [304:30] ==> public open fun getProjectInstance(p0: (Project..Project?)): (Configuration..Configuration?) defined in org.intellij.plugins.intelliLang.Configuration[JavaMethodDescriptor]

'project' @ [304:49] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.isAnalyzeOff[ValueParameterDescriptorImpl]

'advancedConfiguration' @ [304:58] ==> public final val Configuration.advancedConfiguration: (Configuration.AdvancedConfiguration..Configuration.AdvancedConfiguration?)[MyPropertyDescriptor]

'dfaOption' @ [304:80] ==> public final var Configuration.AdvancedConfiguration.dfaOption: Configuration.DfaOption[MyPropertyDescriptor]

'OFF' @ [304:117] ==> enum entry OFF defined in org.intellij.plugins.intelliLang.Configuration.DfaOption[FakeCallableDescriptorForObject]

'languageId' @ [309:17] ==> public final val languageId: String? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.InjectionInfo[PropertyDescriptorImpl]

'BaseInjection' @ [311:33] ==> public constructor BaseInjection(@NotNull p0: String) defined in org.intellij.plugins.intelliLang.inject.config.BaseInjection[JavaClassConstructorDescriptor]

'injectionSupport' @ [311:47] ==> value-parameter injectionSupport: KotlinLanguageInjectionSupport defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.InjectionInfo.toBaseInjection[ValueParameterDescriptorImpl]

'id' @ [311:64] ==> public final val KotlinLanguageInjectionSupport.id: String[MyPropertyDescriptor]

'baseInjection' @ [312:13] ==> val baseInjection: BaseInjection defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.InjectionInfo.toBaseInjection[LocalVariableDescriptor]

'injectedLanguageId' @ [312:27] ==> public final var BaseInjection.injectedLanguageId: String[MyPropertyDescriptor]

'languageId' @ [312:48] ==> public final val languageId: String? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.InjectionInfo[PropertyDescriptorImpl]

'prefix' @ [314:17] ==> public final val prefix: String? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.InjectionInfo[PropertyDescriptorImpl]

'baseInjection' @ [315:17] ==> val baseInjection: BaseInjection defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.InjectionInfo.toBaseInjection[LocalVariableDescriptor]

'prefix' @ [315:31] ==> public final var BaseInjection.prefix: String[MyPropertyDescriptor]

'prefix' @ [315:40] ==> public final val prefix: String? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.InjectionInfo[PropertyDescriptorImpl]

'suffix' @ [318:17] ==> public final val suffix: String? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.InjectionInfo[PropertyDescriptorImpl]

'baseInjection' @ [319:17] ==> val baseInjection: BaseInjection defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.InjectionInfo.toBaseInjection[LocalVariableDescriptor]

'suffix' @ [319:31] ==> public final var BaseInjection.suffix: String[MyPropertyDescriptor]

'suffix' @ [319:40] ==> public final val suffix: String? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.InjectionInfo[PropertyDescriptorImpl]

'baseInjection' @ [322:20] ==> val baseInjection: BaseInjection defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.InjectionInfo.toBaseInjection[LocalVariableDescriptor]

'calcAnnotationValue' @ [327:35] ==> @Nullable public open fun calcAnnotationValue(p0: (Array<(PsiAnnotation..PsiAnnotation?)>..Array<out (PsiAnnotation..PsiAnnotation?)>?), @NonNls p1: (String..String?)): String? defined in org.intellij.plugins.intelliLang.util.AnnotationUtilEx[JavaMethodDescriptor]

'annotations' @ [327:55] ==> value-parameter annotations: Array<PsiAnnotation> defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.processAnnotationInjectionInner[ValueParameterDescriptorImpl]

'calcAnnotationValue' @ [328:39] ==> @Nullable public open fun calcAnnotationValue(p0: (Array<(PsiAnnotation..PsiAnnotation?)>..Array<out (PsiAnnotation..PsiAnnotation?)>?), @NonNls p1: (String..String?)): String? defined in org.intellij.plugins.intelliLang.util.AnnotationUtilEx[JavaMethodDescriptor]

'annotations' @ [328:59] ==> value-parameter annotations: Array<PsiAnnotation> defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.processAnnotationInjectionInner[ValueParameterDescriptorImpl]

'calcAnnotationValue' @ [329:39] ==> @Nullable public open fun calcAnnotationValue(p0: (Array<(PsiAnnotation..PsiAnnotation?)>..Array<out (PsiAnnotation..PsiAnnotation?)>?), @NonNls p1: (String..String?)): String? defined in org.intellij.plugins.intelliLang.util.AnnotationUtilEx[JavaMethodDescriptor]

'annotations' @ [329:59] ==> value-parameter annotations: Array<PsiAnnotation> defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.processAnnotationInjectionInner[ValueParameterDescriptorImpl]

'InjectionInfo' @ [331:16] ==> public constructor InjectionInfo(languageId: String?, prefix: String?, suffix: String?) defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.InjectionInfo[ClassConstructorDescriptorImpl]

'id' @ [331:30] ==> val id: String? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.processAnnotationInjectionInner[LocalVariableDescriptor]

'prefix' @ [331:34] ==> val prefix: String? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.processAnnotationInjectionInner[LocalVariableDescriptor]

'suffix' @ [331:42] ==> val suffix: String? defined in org.jetbrains.kotlin.idea.injection.KotlinLanguageInjector.processAnnotationInjectionInner[LocalVariableDescriptor]

