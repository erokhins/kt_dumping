'when (getCapability(ModuleInfo.Capability)) {
        is ModuleProductionSourceInfo -> SourceKind.PRODUCTION
        is ModuleTestSourceInfo -> SourceKind.TEST
        else -> SourceKind.OTHER
    }' @ [41:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SourceKind, entry1: SourceKind, entry2: SourceKind): SourceKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SourceKind

'getCapability' @ [41:19] ==> public abstract fun <T> getCapability(capability: ModuleDescriptor.Capability<ModuleInfo>): ModuleInfo? defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleInfo

'ModuleInfo' @ [41:33] ==> public companion object defined in org.jetbrains.kotlin.analyzer.ModuleInfo[FakeCallableDescriptorForObject]

'Capability' @ [41:44] ==> public final val Capability: ModuleDescriptor.Capability<ModuleInfo> defined in org.jetbrains.kotlin.analyzer.ModuleInfo.Companion[DeserializedPropertyDescriptor]

'PRODUCTION' @ [42:53] ==> enum entry PRODUCTION defined in org.jetbrains.kotlin.idea.highlighter.SourceKind[FakeCallableDescriptorForObject]

'TEST' @ [43:47] ==> enum entry TEST defined in org.jetbrains.kotlin.idea.highlighter.SourceKind[FakeCallableDescriptorForObject]

'OTHER' @ [44:28] ==> enum entry OTHER defined in org.jetbrains.kotlin.idea.highlighter.SourceKind[FakeCallableDescriptorForObject]

'allImplementingModules' @ [50:13] ==> public abstract val allImplementingModules: Set<ModuleDescriptor> defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'filter' @ [50:36] ==> public inline fun <T> Iterable<ModuleDescriptor>.filter(predicate: (ModuleDescriptor) -> Boolean): List<ModuleDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleDescriptor

'sourceKind' @ [51:9] ==> public val ModuleDescriptor.sourceKind: SourceKind defined in org.jetbrains.kotlin.idea.highlighter in file PlatformHeaderAnnotator.kt[PropertyDescriptorImpl]

'OTHER' @ [51:34] ==> enum entry OTHER defined in org.jetbrains.kotlin.idea.highlighter.SourceKind[FakeCallableDescriptorForObject]

'it' @ [52:9] ==> value-parameter it: ModuleDescriptor defined in org.jetbrains.kotlin.idea.highlighter.<get-allImplementingCompatibleModules>.<anonymous>[ValueParameterDescriptorImpl]

'sourceKind' @ [52:12] ==> public val ModuleDescriptor.sourceKind: SourceKind defined in org.jetbrains.kotlin.idea.highlighter in file PlatformHeaderAnnotator.kt[PropertyDescriptorImpl]

'OTHER' @ [52:37] ==> enum entry OTHER defined in org.jetbrains.kotlin.idea.highlighter.SourceKind[FakeCallableDescriptorForObject]

'it' @ [53:9] ==> value-parameter it: ModuleDescriptor defined in org.jetbrains.kotlin.idea.highlighter.<get-allImplementingCompatibleModules>.<anonymous>[ValueParameterDescriptorImpl]

'sourceKind' @ [53:12] ==> public val ModuleDescriptor.sourceKind: SourceKind defined in org.jetbrains.kotlin.idea.highlighter in file PlatformHeaderAnnotator.kt[PropertyDescriptorImpl]

'sourceKind' @ [53:26] ==> public val ModuleDescriptor.sourceKind: SourceKind defined in org.jetbrains.kotlin.idea.highlighter in file PlatformHeaderAnnotator.kt[PropertyDescriptorImpl]

'element' @ [59:27] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.annotate[ValueParameterDescriptorImpl]

'!' @ [60:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [60:14] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.annotate[LocalVariableDescriptor]

'hasModifier' @ [60:26] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'HEADER_KEYWORD' @ [60:47] ==> public final val HEADER_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'getPlatform' @ [62:36] ==> @NotNull public open fun getPlatform(@NotNull file: KtFile): TargetPlatform defined in org.jetbrains.kotlin.idea.project.TargetPlatformDetector[JavaMethodDescriptor]

'declaration' @ [62:48] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.annotate[LocalVariableDescriptor]

'containingKtFile' @ [62:60] ==> public final val KtDeclaration.containingKtFile: KtFile[MyPropertyDescriptor]

'declaration' @ [64:39] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.annotate[LocalVariableDescriptor]

'findModuleDescriptor' @ [64:51] ==> public fun KtElement.findModuleDescriptor(): ModuleDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'defaultModuleDescriptor' @ [65:36] ==> val defaultModuleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.annotate[LocalVariableDescriptor]

'allImplementingCompatibleModules' @ [65:60] ==> public val ModuleDescriptor.allImplementingCompatibleModules: List<ModuleDescriptor> defined in org.jetbrains.kotlin.idea.highlighter in file PlatformHeaderAnnotator.kt[PropertyDescriptorImpl]

'dependentDescriptors' @ [66:13] ==> val dependentDescriptors: List<ModuleDescriptor> defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.annotate[LocalVariableDescriptor]

'isEmpty' @ [66:34] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'validate' @ [68:27] ==> public final fun validate(declaration: KtDeclaration, modulesToCheck: Collection<ModuleDescriptor>): Diagnostics defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator[SimpleFunctionDescriptorImpl]

'declaration' @ [68:36] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.annotate[LocalVariableDescriptor]

'dependentDescriptors' @ [68:49] ==> val dependentDescriptors: List<ModuleDescriptor> defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.annotate[LocalVariableDescriptor]

'KotlinPsiChecker' @ [69:9] ==> public constructor KotlinPsiChecker() defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker[ClassConstructorDescriptorImpl]

'annotateElement' @ [69:28] ==> public final fun annotateElement(element: PsiElement, holder: AnnotationHolder, diagnostics: Diagnostics): Unit defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker[SimpleFunctionDescriptorImpl]

'declaration' @ [69:44] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.annotate[LocalVariableDescriptor]

'holder' @ [69:57] ==> value-parameter holder: AnnotationHolder defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.annotate[ValueParameterDescriptorImpl]

'diagnostics' @ [69:65] ==> val diagnostics: Diagnostics defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.annotate[LocalVariableDescriptor]

'declaration' @ [73:26] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.validate[ValueParameterDescriptorImpl]

'toDescriptor' @ [73:38] ==> public fun KtDeclaration.toDescriptor(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core in file psiModificationUtils.kt[SimpleFunctionDescriptorImpl]

'Diagnostics' @ [73:84] ==> public companion object defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[FakeCallableDescriptorForObject]

'EMPTY' @ [73:96] ==> public final val EMPTY: Diagnostics defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics.Companion[DeserializedPropertyDescriptor]

'!' @ [74:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [74:14] ==> val descriptor: MemberDescriptor defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.validate[LocalVariableDescriptor]

'isHeader' @ [74:25] ==> public final val MemberDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'Diagnostics' @ [74:42] ==> public companion object defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[FakeCallableDescriptorForObject]

'EMPTY' @ [74:54] ==> public final val EMPTY: Diagnostics defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics.Companion[DeserializedPropertyDescriptor]

'mutableListOf' @ [76:30] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Diagnostic> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'diagnosticList' @ [79:17] ==> val diagnosticList: MutableList<Diagnostic> defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.validate[LocalVariableDescriptor]

'diagnostic' @ [79:35] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.validate.<no name provided>.report[ValueParameterDescriptorImpl]

'modulesToCheck' @ [84:24] ==> value-parameter modulesToCheck: Collection<ModuleDescriptor> defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.validate[ValueParameterDescriptorImpl]

'HeaderImplDeclarationChecker' @ [85:13] ==> public object HeaderImplDeclarationChecker : DeclarationChecker defined in org.jetbrains.kotlin.resolve.checkers[FakeCallableDescriptorForObject]

'checkHeaderDeclarationHasImplementation' @ [85:42] ==> public final fun checkHeaderDeclarationHasImplementation(reportOn: KtDeclaration, descriptor: MemberDescriptor, diagnosticHolder: DiagnosticSink, platformModule: ModuleDescriptor, checkImpl: Boolean): Unit defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[DeserializedSimpleFunctionDescriptor]

'declaration' @ [86:21] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.validate[ValueParameterDescriptorImpl]

'descriptor' @ [86:34] ==> val descriptor: MemberDescriptor defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.validate[LocalVariableDescriptor]

'diagnosticSink' @ [86:46] ==> val diagnosticSink: <no name provided> defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.validate[LocalVariableDescriptor]

'module' @ [86:62] ==> val module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.validate[LocalVariableDescriptor]

'KotlinCacheService' @ [90:32] ==> public companion object defined in org.jetbrains.kotlin.caches.resolve.KotlinCacheService[FakeCallableDescriptorForObject]

'getInstance' @ [90:51] ==> public final fun getInstance(project: Project): KotlinCacheService defined in org.jetbrains.kotlin.caches.resolve.KotlinCacheService.Companion[DeserializedSimpleFunctionDescriptor]

'declaration' @ [90:63] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.validate[ValueParameterDescriptorImpl]

'project' @ [90:75] ==> public final val KtDeclaration.project: Project[MyPropertyDescriptor]

'getSuppressionCache' @ [90:84] ==> public abstract fun getSuppressionCache(): KotlinSuppressCache defined in org.jetbrains.kotlin.caches.resolve.KotlinCacheService[DeserializedSimpleFunctionDescriptor]

'diagnosticList' @ [91:28] ==> val diagnosticList: MutableList<Diagnostic> defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.validate[LocalVariableDescriptor]

'filter' @ [91:43] ==> public inline fun <T> Iterable<Diagnostic>.filter(predicate: (Diagnostic) -> Boolean): List<Diagnostic> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'!' @ [92:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'suppressionCache' @ [92:14] ==> val suppressionCache: KotlinSuppressCache defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.validate[LocalVariableDescriptor]

'isSuppressed' @ [92:31] ==> public final fun isSuppressed(psiElement: PsiElement, suppressionKey: String, severity: Severity): Boolean defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache[DeserializedSimpleFunctionDescriptor]

'declaration' @ [92:44] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.validate[ValueParameterDescriptorImpl]

'it' @ [92:57] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.validate.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [92:60] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'name' @ [92:68] ==> public final var <D : (Diagnostic..Diagnostic?)> DiagnosticFactory<out (Diagnostic..Diagnostic?)>.name: String[MyPropertyDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> (org.jetbrains.kotlin.diagnostics.Diagnostic..org.jetbrains.kotlin.diagnostics.Diagnostic?)

'it' @ [92:74] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.validate.<anonymous>[ValueParameterDescriptorImpl]

'severity' @ [92:77] ==> public final val Diagnostic.severity: Severity[MyPropertyDescriptor]

'if (filteredList.isNotEmpty()) SimpleDiagnostics(filteredList) else Diagnostics.EMPTY' @ [94:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Diagnostics, elseBranch: Diagnostics): Diagnostics[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Diagnostics

'filteredList' @ [94:20] ==> val filteredList: List<Diagnostic> defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.validate[LocalVariableDescriptor]

'isNotEmpty' @ [94:33] ==> @InlineOnly public inline fun <T> Collection<Diagnostic>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'SimpleDiagnostics' @ [94:47] ==> public constructor SimpleDiagnostics(diagnostics: Collection<Diagnostic>) defined in org.jetbrains.kotlin.resolve.diagnostics.SimpleDiagnostics[DeserializedClassConstructorDescriptor]

'filteredList' @ [94:65] ==> val filteredList: List<Diagnostic> defined in org.jetbrains.kotlin.idea.highlighter.PlatformHeaderAnnotator.validate[LocalVariableDescriptor]

'Diagnostics' @ [94:84] ==> public companion object defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[FakeCallableDescriptorForObject]

'EMPTY' @ [94:96] ==> public final val EMPTY: Diagnostics defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics.Companion[DeserializedPropertyDescriptor]

