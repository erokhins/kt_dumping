'it' @ [60:82] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.<init>.<anonymous>[ValueParameterDescriptorImpl]

'resolutionFacade' @ [66:36] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'moduleDescriptor' @ [66:53] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'resolutionFacade' @ [67:27] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'project' @ [67:44] ==> public abstract val project: Project defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'scope' @ [68:38] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'excludeKotlinSources' @ [68:44] ==> public fun SearchScope.excludeKotlinSources(): SearchScope defined in org.jetbrains.kotlin.idea.search in file searchUtil.kt[SimpleFunctionDescriptorImpl]

'it' @ [71:13] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.descriptorFilter.<anonymous>[ValueParameterDescriptorImpl]

'isHiddenInResolution' @ [71:16] ==> @JvmOverloads public fun DeclarationDescriptor.isHiddenInResolution(languageVersionSettings: LanguageVersionSettings, isSuperCall: Boolean = ...): Boolean defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [71:37] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'frontendService' @ [71:54] ==> public inline fun <reified T : Any> ResolutionFacade.frontendService(): LanguageVersionSettings defined in org.jetbrains.kotlin.idea.resolve[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> LanguageVersionSettings

'!' @ [72:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [72:14] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [72:31] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.descriptorFilter.<anonymous>[ValueParameterDescriptorImpl]

'applyExcludeSettings' @ [73:13] ==> value-parameter applyExcludeSettings: Boolean = ... defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.<init>[ValueParameterDescriptorImpl]

'it' @ [73:37] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.descriptorFilter.<anonymous>[ValueParameterDescriptorImpl]

'isExcludedFromAutoImport' @ [73:40] ==> public fun DeclarationDescriptor.isExcludedFromAutoImport(project: Project, inFile: KtFile?): Boolean defined in org.jetbrains.kotlin.idea.core in file excludedFromImportsAndCompletion.kt[SimpleFunctionDescriptorImpl]

'project' @ [73:65] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'file' @ [73:74] ==> private final val file: KtFile? defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'LinkedHashSet' @ [78:28] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtNamedDeclaration

'declarations' @ [79:9] ==> val declarations: LinkedHashSet<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getTopLevelCallablesByName[LocalVariableDescriptor]

'addTopLevelNonExtensionCallablesByName' @ [79:22] ==> private final fun MutableSet<KtNamedDeclaration>.addTopLevelNonExtensionCallablesByName(index: StringStubIndexExtension<out KtNamedDeclaration>, name: String): Unit defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[SimpleFunctionDescriptorImpl]

'getInstance' @ [79:90] ==> public open fun getInstance(): (KotlinFunctionShortNameIndex..KotlinFunctionShortNameIndex?) defined in org.jetbrains.kotlin.idea.stubindex.KotlinFunctionShortNameIndex[JavaMethodDescriptor]

'name' @ [79:105] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getTopLevelCallablesByName[ValueParameterDescriptorImpl]

'declarations' @ [80:9] ==> val declarations: LinkedHashSet<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getTopLevelCallablesByName[LocalVariableDescriptor]

'addTopLevelNonExtensionCallablesByName' @ [80:22] ==> private final fun MutableSet<KtNamedDeclaration>.addTopLevelNonExtensionCallablesByName(index: StringStubIndexExtension<out KtNamedDeclaration>, name: String): Unit defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[SimpleFunctionDescriptorImpl]

'getInstance' @ [80:90] ==> public open fun getInstance(): (KotlinPropertyShortNameIndex..KotlinPropertyShortNameIndex?) defined in org.jetbrains.kotlin.idea.stubindex.KotlinPropertyShortNameIndex[JavaMethodDescriptor]

'name' @ [80:105] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getTopLevelCallablesByName[ValueParameterDescriptorImpl]

'declarations' @ [81:16] ==> val declarations: LinkedHashSet<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getTopLevelCallablesByName[LocalVariableDescriptor]

'flatMap' @ [82:18] ==> public inline fun <T, R> Iterable<KtNamedDeclaration>.flatMap(transform: (KtNamedDeclaration) -> Iterable<CallableDescriptor>): List<CallableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration
    <R> -> CallableDescriptor

'it' @ [82:28] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getTopLevelCallablesByName.<anonymous>[ValueParameterDescriptorImpl]

'resolveToDescriptors' @ [82:31] ==> private final inline fun <reified TDescriptor : Any> KtNamedDeclaration.resolveToDescriptors(): Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified TDescriptor : Any> -> CallableDescriptor

'filter' @ [83:18] ==> public inline fun <T> Iterable<CallableDescriptor>.filter(predicate: (CallableDescriptor) -> Boolean): List<CallableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'invoke' @ [83:27] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [83:44] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getTopLevelCallablesByName.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [90:9] ==> value-parameter index: StringStubIndexExtension<out KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.addTopLevelNonExtensionCallablesByName[ValueParameterDescriptorImpl]

'get' @ [90:15] ==> public open fun get(@NotNull p0: String, @NotNull p1: Project, @NotNull p2: GlobalSearchScope): (MutableCollection<out (KtNamedDeclaration..KtNamedDeclaration?)>..Collection<(KtNamedDeclaration..KtNamedDeclaration?)>?) defined in com.intellij.psi.stubs.StringStubIndexExtension[JavaMethodDescriptor]

'name' @ [90:19] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.addTopLevelNonExtensionCallablesByName[ValueParameterDescriptorImpl]

'project' @ [90:25] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'scope' @ [90:34] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'filterTo' @ [90:41] ==> public inline fun <T, C : MutableCollection<in (KtNamedDeclaration..KtNamedDeclaration?)>> Iterable<(KtNamedDeclaration..KtNamedDeclaration?)>.filterTo(destination: MutableSet<KtNamedDeclaration>, predicate: ((KtNamedDeclaration..KtNamedDeclaration?)) -> Boolean): MutableSet<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtNamedDeclaration..org.jetbrains.kotlin.psi.KtNamedDeclaration?)
    <C : MutableCollection<in T>> -> MutableSet<KtNamedDeclaration>

'this' @ [90:50] ==> <this> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.addTopLevelNonExtensionCallablesByName[ReceiverParameterDescriptorImpl]

'it' @ [90:58] ==> value-parameter it: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.addTopLevelNonExtensionCallablesByName.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [90:61] ==> public final val KtNamedDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'it' @ [90:81] ==> value-parameter it: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.addTopLevelNonExtensionCallablesByName.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [90:112] ==> value-parameter it: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.addTopLevelNonExtensionCallablesByName.<anonymous>[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [90:115] ==> public final val KtCallableDeclaration.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'getInstance' @ [94:45] ==> public open fun getInstance(): (KotlinFunctionShortNameIndex..KotlinFunctionShortNameIndex?) defined in org.jetbrains.kotlin.idea.stubindex.KotlinFunctionShortNameIndex[JavaMethodDescriptor]

'get' @ [94:59] ==> @NotNull @Override public open fun get(@NotNull s: String, @NotNull project: Project, @NotNull scope: GlobalSearchScope): (MutableCollection<(KtNamedFunction..KtNamedFunction?)>..Collection<(KtNamedFunction..KtNamedFunction?)>) defined in org.jetbrains.kotlin.idea.stubindex.KotlinFunctionShortNameIndex[JavaMethodDescriptor]

'name' @ [94:63] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getTopLevelExtensionOperatorsByName[ValueParameterDescriptorImpl]

'project' @ [94:69] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'scope' @ [94:78] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'filter' @ [95:18] ==> public inline fun <T> Iterable<(KtNamedFunction..KtNamedFunction?)>.filter(predicate: ((KtNamedFunction..KtNamedFunction?)) -> Boolean): List<(KtNamedFunction..KtNamedFunction?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtNamedFunction..org.jetbrains.kotlin.psi.KtNamedFunction?)

'it' @ [95:27] ==> value-parameter it: (KtNamedFunction..KtNamedFunction?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getTopLevelExtensionOperatorsByName.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [95:30] ==> public final val KtNamedFunction.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'it' @ [95:50] ==> value-parameter it: (KtNamedFunction..KtNamedFunction?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getTopLevelExtensionOperatorsByName.<anonymous>[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [95:53] ==> public final val KtNamedFunction.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'it' @ [95:86] ==> value-parameter it: (KtNamedFunction..KtNamedFunction?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getTopLevelExtensionOperatorsByName.<anonymous>[ValueParameterDescriptorImpl]

'hasModifier' @ [95:89] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'OPERATOR_KEYWORD' @ [95:110] ==> public final val OPERATOR_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'flatMap' @ [96:18] ==> public inline fun <T, R> Iterable<(KtNamedFunction..KtNamedFunction?)>.flatMap(transform: ((KtNamedFunction..KtNamedFunction?)) -> Iterable<FunctionDescriptor>): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtNamedFunction..org.jetbrains.kotlin.psi.KtNamedFunction?)
    <R> -> FunctionDescriptor

'it' @ [96:28] ==> value-parameter it: (KtNamedFunction..KtNamedFunction?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getTopLevelExtensionOperatorsByName.<anonymous>[ValueParameterDescriptorImpl]

'resolveToDescriptors' @ [96:31] ==> private final inline fun <reified TDescriptor : Any> KtNamedDeclaration.resolveToDescriptors(): Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified TDescriptor : Any> -> FunctionDescriptor

'filter' @ [97:18] ==> public inline fun <T> Iterable<FunctionDescriptor>.filter(predicate: (FunctionDescriptor) -> Boolean): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'invoke' @ [97:27] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [97:44] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getTopLevelExtensionOperatorsByName.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [97:51] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getTopLevelExtensionOperatorsByName.<anonymous>[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [97:54] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'distinct' @ [98:18] ==> public fun <T> Iterable<FunctionDescriptor>.distinct(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'getInstance' @ [102:45] ==> public open fun getInstance(): (KotlinFunctionShortNameIndex..KotlinFunctionShortNameIndex?) defined in org.jetbrains.kotlin.idea.stubindex.KotlinFunctionShortNameIndex[JavaMethodDescriptor]

'get' @ [102:59] ==> @NotNull @Override public open fun get(@NotNull s: String, @NotNull project: Project, @NotNull scope: GlobalSearchScope): (MutableCollection<(KtNamedFunction..KtNamedFunction?)>..Collection<(KtNamedFunction..KtNamedFunction?)>) defined in org.jetbrains.kotlin.idea.stubindex.KotlinFunctionShortNameIndex[JavaMethodDescriptor]

'name' @ [102:63] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getMemberOperatorsByName[ValueParameterDescriptorImpl]

'project' @ [102:69] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'scope' @ [102:78] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'filter' @ [103:18] ==> public inline fun <T> Iterable<(KtNamedFunction..KtNamedFunction?)>.filter(predicate: ((KtNamedFunction..KtNamedFunction?)) -> Boolean): List<(KtNamedFunction..KtNamedFunction?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtNamedFunction..org.jetbrains.kotlin.psi.KtNamedFunction?)

'it' @ [103:27] ==> value-parameter it: (KtNamedFunction..KtNamedFunction?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getMemberOperatorsByName.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [103:30] ==> public final val KtNamedFunction.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'it' @ [103:55] ==> value-parameter it: (KtNamedFunction..KtNamedFunction?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getMemberOperatorsByName.<anonymous>[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [103:58] ==> public final val KtNamedFunction.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'it' @ [103:91] ==> value-parameter it: (KtNamedFunction..KtNamedFunction?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getMemberOperatorsByName.<anonymous>[ValueParameterDescriptorImpl]

'hasModifier' @ [103:94] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'OPERATOR_KEYWORD' @ [103:115] ==> public final val OPERATOR_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'flatMap' @ [104:18] ==> public inline fun <T, R> Iterable<(KtNamedFunction..KtNamedFunction?)>.flatMap(transform: ((KtNamedFunction..KtNamedFunction?)) -> Iterable<FunctionDescriptor>): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtNamedFunction..org.jetbrains.kotlin.psi.KtNamedFunction?)
    <R> -> FunctionDescriptor

'it' @ [104:28] ==> value-parameter it: (KtNamedFunction..KtNamedFunction?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getMemberOperatorsByName.<anonymous>[ValueParameterDescriptorImpl]

'resolveToDescriptors' @ [104:31] ==> private final inline fun <reified TDescriptor : Any> KtNamedDeclaration.resolveToDescriptors(): Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified TDescriptor : Any> -> FunctionDescriptor

'filter' @ [105:18] ==> public inline fun <T> Iterable<FunctionDescriptor>.filter(predicate: (FunctionDescriptor) -> Boolean): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'invoke' @ [105:27] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [105:44] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getMemberOperatorsByName.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [105:51] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getMemberOperatorsByName.<anonymous>[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [105:54] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'distinct' @ [106:18] ==> public fun <T> Iterable<FunctionDescriptor>.distinct(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'index' @ [111:25] ==> value-parameter index: StringStubIndexExtension<out KtCallableDeclaration> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processTopLevelCallables.processIndex[ValueParameterDescriptorImpl]

'getAllKeys' @ [111:31] ==> public open fun getAllKeys(p0: (Project..Project?)): (MutableCollection<(String..String?)>..Collection<(String..String?)>?) defined in com.intellij.psi.stubs.StringStubIndexExtension[JavaMethodDescriptor]

'project' @ [111:42] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'checkCanceled' @ [112:33] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'!' @ [113:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [113:22] ==> public abstract operator fun invoke(p1: String): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'key' @ [113:33] ==> val key: (String..String?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processTopLevelCallables.processIndex[LocalVariableDescriptor]

'substringAfterLast' @ [113:37] ==> public fun String.substringAfterLast(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'key' @ [113:61] ==> val key: (String..String?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processTopLevelCallables.processIndex[LocalVariableDescriptor]

'index' @ [115:37] ==> value-parameter index: StringStubIndexExtension<out KtCallableDeclaration> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processTopLevelCallables.processIndex[ValueParameterDescriptorImpl]

'get' @ [115:43] ==> public open fun get(@NotNull p0: String, @NotNull p1: Project, @NotNull p2: GlobalSearchScope): (MutableCollection<out (KtCallableDeclaration..KtCallableDeclaration?)>..Collection<(KtCallableDeclaration..KtCallableDeclaration?)>?) defined in com.intellij.psi.stubs.StringStubIndexExtension[JavaMethodDescriptor]

'key' @ [115:47] ==> val key: (String..String?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processTopLevelCallables.processIndex[LocalVariableDescriptor]

'project' @ [115:52] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'scope' @ [115:61] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'declaration' @ [116:25] ==> val declaration: (KtCallableDeclaration..KtCallableDeclaration?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processTopLevelCallables.processIndex[LocalVariableDescriptor]

'receiverTypeReference' @ [116:37] ==> public final val KtCallableDeclaration.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'filterOutPrivate' @ [117:25] ==> private final val filterOutPrivate: Boolean defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'declaration' @ [117:45] ==> val declaration: (KtCallableDeclaration..KtCallableDeclaration?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processTopLevelCallables.processIndex[LocalVariableDescriptor]

'hasModifier' @ [117:57] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'PRIVATE_KEYWORD' @ [117:78] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'declaration' @ [119:40] ==> val declaration: (KtCallableDeclaration..KtCallableDeclaration?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processTopLevelCallables.processIndex[LocalVariableDescriptor]

'resolveToDescriptors' @ [119:52] ==> private final inline fun <reified TDescriptor : Any> KtNamedDeclaration.resolveToDescriptors(): Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified TDescriptor : Any> -> CallableDescriptor

'invoke' @ [120:29] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'descriptor' @ [120:46] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processTopLevelCallables.processIndex[LocalVariableDescriptor]

'invoke' @ [121:29] ==> public abstract operator fun invoke(p1: CallableDescriptor): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'descriptor' @ [121:39] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processTopLevelCallables.processIndex[LocalVariableDescriptor]

'processIndex' @ [127:9] ==> local final fun processIndex(index: StringStubIndexExtension<out KtCallableDeclaration>): Unit defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processTopLevelCallables[SimpleFunctionDescriptorImpl]

'getInstance' @ [127:57] ==> @NotNull public open fun getInstance(): KotlinTopLevelFunctionFqnNameIndex defined in org.jetbrains.kotlin.idea.stubindex.KotlinTopLevelFunctionFqnNameIndex[JavaMethodDescriptor]

'processIndex' @ [128:9] ==> local final fun processIndex(index: StringStubIndexExtension<out KtCallableDeclaration>): Unit defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processTopLevelCallables[SimpleFunctionDescriptorImpl]

'getInstance' @ [128:57] ==> @NotNull public open fun getInstance(): KotlinTopLevelPropertyFqnNameIndex defined in org.jetbrains.kotlin.idea.stubindex.KotlinTopLevelPropertyFqnNameIndex[JavaMethodDescriptor]

'callTypeAndReceiver' @ [137:29] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions[ValueParameterDescriptorImpl]

'receiverTypes' @ [137:49] ==> public fun CallTypeAndReceiver<*, *>.receiverTypes(bindingContext: BindingContext, contextElement: PsiElement, moduleDescriptor: ModuleDescriptor, resolutionFacade: ResolutionFacade, stableSmartCastsOnly: Boolean): Collection<KotlinType>? defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [137:63] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions[ValueParameterDescriptorImpl]

'position' @ [137:79] ==> value-parameter position: KtExpression defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [137:89] ==> private final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'resolutionFacade' @ [137:107] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'emptyList' @ [138:39] ==> public fun <T> emptyList(): List<CallableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'getCallableTopLevelExtensions' @ [139:16] ==> public final fun getCallableTopLevelExtensions(callTypeAndReceiver: CallTypeAndReceiver<*, *>, receiverTypes: Collection<KotlinType>, nameFilter: (String) -> Boolean): Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[SimpleFunctionDescriptorImpl]

'callTypeAndReceiver' @ [139:46] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions[ValueParameterDescriptorImpl]

'receiverTypes' @ [139:67] ==> val receiverTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions[LocalVariableDescriptor]

'nameFilter' @ [139:82] ==> value-parameter nameFilter: (String) -> Boolean defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions[ValueParameterDescriptorImpl]

'receiverTypes' @ [147:13] ==> value-parameter receiverTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions[ValueParameterDescriptorImpl]

'isEmpty' @ [147:27] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [147:45] ==> public fun <T> emptyList(): List<CallableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'HashSet' @ [149:33] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'receiverTypes' @ [150:9] ==> value-parameter receiverTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions[ValueParameterDescriptorImpl]

'forEach' @ [150:23] ==> @HidesMembers public inline fun <T> Iterable<KotlinType>.forEach(action: (KotlinType) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'receiverTypeNames' @ [150:33] ==> val receiverTypeNames: HashSet<String> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions[LocalVariableDescriptor]

'addTypeNames' @ [150:51] ==> private final fun MutableCollection<String>.addTypeNames(type: KotlinType): Unit defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[SimpleFunctionDescriptorImpl]

'it' @ [150:64] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions.<anonymous>[ValueParameterDescriptorImpl]

'KotlinTopLevelExtensionsByReceiverTypeIndex' @ [152:21] ==> public companion object defined in org.jetbrains.kotlin.idea.stubindex.KotlinTopLevelExtensionsByReceiverTypeIndex[FakeCallableDescriptorForObject]

'INSTANCE' @ [152:65] ==> public final val INSTANCE: KotlinTopLevelExtensionsByReceiverTypeIndex defined in org.jetbrains.kotlin.idea.stubindex.KotlinTopLevelExtensionsByReceiverTypeIndex.Companion[PropertyDescriptorImpl]

'index' @ [154:28] ==> val index: KotlinTopLevelExtensionsByReceiverTypeIndex defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions[LocalVariableDescriptor]

'getAllKeys' @ [154:34] ==> public open fun getAllKeys(p0: (Project..Project?)): (MutableCollection<(String..String?)>..Collection<(String..String?)>?) defined in org.jetbrains.kotlin.idea.stubindex.KotlinTopLevelExtensionsByReceiverTypeIndex[JavaMethodDescriptor]

'project' @ [154:45] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'asSequence' @ [155:18] ==> public fun <T> Iterable<(String..String?)>.asSequence(): Sequence<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'filter' @ [156:18] ==> public fun <T> Sequence<(String..String?)>.filter(predicate: ((String..String?)) -> Boolean): Sequence<(String..String?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'checkCanceled' @ [157:37] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'KotlinTopLevelExtensionsByReceiverTypeIndex' @ [158:21] ==> public companion object defined in org.jetbrains.kotlin.idea.stubindex.KotlinTopLevelExtensionsByReceiverTypeIndex[FakeCallableDescriptorForObject]

'receiverTypeNameFromKey' @ [158:65] ==> public final fun receiverTypeNameFromKey(key: String): String defined in org.jetbrains.kotlin.idea.stubindex.KotlinTopLevelExtensionsByReceiverTypeIndex.Companion[SimpleFunctionDescriptorImpl]

'it' @ [158:89] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions.<anonymous>[ValueParameterDescriptorImpl]

'receiverTypeNames' @ [158:96] ==> val receiverTypeNames: HashSet<String> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions[LocalVariableDescriptor]

'invoke' @ [159:24] ==> public abstract operator fun invoke(p1: String): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'KotlinTopLevelExtensionsByReceiverTypeIndex' @ [159:35] ==> public companion object defined in org.jetbrains.kotlin.idea.stubindex.KotlinTopLevelExtensionsByReceiverTypeIndex[FakeCallableDescriptorForObject]

'callableNameFromKey' @ [159:79] ==> public final fun callableNameFromKey(key: String): String defined in org.jetbrains.kotlin.idea.stubindex.KotlinTopLevelExtensionsByReceiverTypeIndex.Companion[SimpleFunctionDescriptorImpl]

'it' @ [159:99] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions.<anonymous>[ValueParameterDescriptorImpl]

'flatMap' @ [161:18] ==> public fun <T, R> Sequence<(String..String?)>.flatMap(transform: ((String..String?)) -> Sequence<(KtCallableDeclaration..KtCallableDeclaration?)>): Sequence<(KtCallableDeclaration..KtCallableDeclaration?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <R> -> (org.jetbrains.kotlin.psi.KtCallableDeclaration..org.jetbrains.kotlin.psi.KtCallableDeclaration?)

'index' @ [161:28] ==> val index: KotlinTopLevelExtensionsByReceiverTypeIndex defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions[LocalVariableDescriptor]

'get' @ [161:34] ==> public open fun get(s: String, project: Project, scope: GlobalSearchScope): (MutableCollection<(KtCallableDeclaration..KtCallableDeclaration?)>..Collection<(KtCallableDeclaration..KtCallableDeclaration?)>?) defined in org.jetbrains.kotlin.idea.stubindex.KotlinTopLevelExtensionsByReceiverTypeIndex[SimpleFunctionDescriptorImpl]

'it' @ [161:38] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions.<anonymous>[ValueParameterDescriptorImpl]

'project' @ [161:42] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'scope' @ [161:51] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'asSequence' @ [161:58] ==> public fun <T> Iterable<(KtCallableDeclaration..KtCallableDeclaration?)>.asSequence(): Sequence<(KtCallableDeclaration..KtCallableDeclaration?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtCallableDeclaration..org.jetbrains.kotlin.psi.KtCallableDeclaration?)

'findSuitableExtensions' @ [163:34] ==> private final fun findSuitableExtensions(declarations: Sequence<KtCallableDeclaration>, receiverTypes: Collection<KotlinType>, callType: CallType<*>): Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[SimpleFunctionDescriptorImpl]

'declarations' @ [163:57] ==> val declarations: Sequence<(KtCallableDeclaration..KtCallableDeclaration?)> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions[LocalVariableDescriptor]

'receiverTypes' @ [163:71] ==> value-parameter receiverTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions[ValueParameterDescriptorImpl]

'callTypeAndReceiver' @ [163:86] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions[ValueParameterDescriptorImpl]

'callType' @ [163:106] ==> public final val callType: CallType<out KtElement?> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'ArrayList' @ [165:37] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> CallableDescriptor

'KotlinIndicesHelperExtension' @ [167:27] ==> public companion object : ProjectExtensionDescriptor<KotlinIndicesHelperExtension> defined in org.jetbrains.kotlin.idea.core.extension.KotlinIndicesHelperExtension[FakeCallableDescriptorForObject]

'getInstances' @ [167:56] ==> public final fun getInstances(project: Project): List<KotlinIndicesHelperExtension> defined in org.jetbrains.kotlin.idea.core.extension.KotlinIndicesHelperExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [167:69] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'extension' @ [168:13] ==> val extension: KotlinIndicesHelperExtension defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions[LocalVariableDescriptor]

'appendExtensionCallables' @ [168:23] ==> public abstract fun appendExtensionCallables(consumer: MutableList<in CallableDescriptor>, moduleDescriptor: ModuleDescriptor, receiverTypes: Collection<KotlinType>, nameFilter: (String) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.core.extension.KotlinIndicesHelperExtension[SimpleFunctionDescriptorImpl]

'additionalDescriptors' @ [168:48] ==> val additionalDescriptors: ArrayList<CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions[LocalVariableDescriptor]

'moduleDescriptor' @ [168:71] ==> private final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'receiverTypes' @ [168:89] ==> value-parameter receiverTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions[ValueParameterDescriptorImpl]

'nameFilter' @ [168:104] ==> value-parameter nameFilter: (String) -> Boolean defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions[ValueParameterDescriptorImpl]

'if (additionalDescriptors.isNotEmpty())
            suitableExtensions + additionalDescriptors
        else
            suitableExtensions' @ [171:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<CallableDescriptor>, elseBranch: Collection<CallableDescriptor>): Collection<CallableDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<CallableDescriptor>

'additionalDescriptors' @ [171:20] ==> val additionalDescriptors: ArrayList<CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions[LocalVariableDescriptor]

'isNotEmpty' @ [171:42] ==> @InlineOnly public inline fun <T> Collection<CallableDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'suitableExtensions' @ [172:13] ==> val suitableExtensions: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions[LocalVariableDescriptor]

'additionalDescriptors' @ [172:34] ==> val additionalDescriptors: ArrayList<CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions[LocalVariableDescriptor]

'suitableExtensions' @ [174:13] ==> val suitableExtensions: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallableTopLevelExtensions[LocalVariableDescriptor]

'type' @ [179:31] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.resolveTypeAliasesUsingIndex[ValueParameterDescriptorImpl]

'constructor' @ [179:36] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'KotlinTypeAliasByExpansionShortNameIndex' @ [181:21] ==> public companion object defined in org.jetbrains.kotlin.idea.stubindex.KotlinTypeAliasByExpansionShortNameIndex[FakeCallableDescriptorForObject]

'INSTANCE' @ [181:62] ==> public final val INSTANCE: KotlinTypeAliasByExpansionShortNameIndex defined in org.jetbrains.kotlin.idea.stubindex.KotlinTypeAliasByExpansionShortNameIndex.Companion[PropertyDescriptorImpl]

'mutableSetOf' @ [182:19] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<TypeAliasDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeAliasDescriptor

'checkCanceled' @ [185:29] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'index' @ [186:13] ==> val index: KotlinTypeAliasByExpansionShortNameIndex defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.resolveTypeAliasesUsingIndex[LocalVariableDescriptor]

'typeName' @ [186:19] ==> value-parameter typeName: String defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.resolveTypeAliasesUsingIndex.searchRecursively[ValueParameterDescriptorImpl]

'project' @ [186:29] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'scope' @ [186:38] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'asSequence' @ [186:45] ==> public fun <T> Iterable<KtTypeAlias>.asSequence(): Sequence<KtTypeAlias> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeAlias

'map' @ [187:22] ==> public fun <T, R> Sequence<KtTypeAlias>.map(transform: (KtTypeAlias) -> TypeAliasDescriptor?): Sequence<TypeAliasDescriptor?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeAlias
    <R> -> TypeAliasDescriptor?

'it' @ [187:28] ==> value-parameter it: KtTypeAlias defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.resolveTypeAliasesUsingIndex.searchRecursively.<anonymous>[ValueParameterDescriptorImpl]

'resolveToDescriptorIfAny' @ [187:31] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'filterNotNull' @ [188:22] ==> public fun <T : Any> Sequence<TypeAliasDescriptor?>.filterNotNull(): Sequence<TypeAliasDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> TypeAliasDescriptor

'filter' @ [189:22] ==> public fun <T> Sequence<TypeAliasDescriptor>.filter(predicate: (TypeAliasDescriptor) -> Boolean): Sequence<TypeAliasDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeAliasDescriptor

'it' @ [189:31] ==> value-parameter it: TypeAliasDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.resolveTypeAliasesUsingIndex.searchRecursively.<anonymous>[ValueParameterDescriptorImpl]

'expandedType' @ [189:34] ==> public abstract val expandedType: SimpleType defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'constructor' @ [189:47] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'typeConstructor' @ [189:62] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.resolveTypeAliasesUsingIndex[LocalVariableDescriptor]

'filter' @ [190:22] ==> public fun <T> Sequence<TypeAliasDescriptor>.filter(predicate: (TypeAliasDescriptor) -> Boolean): Sequence<TypeAliasDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeAliasDescriptor

'it' @ [190:31] ==> value-parameter it: TypeAliasDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.resolveTypeAliasesUsingIndex.searchRecursively.<anonymous>[ValueParameterDescriptorImpl]

'out' @ [190:38] ==> val out: MutableSet<TypeAliasDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.resolveTypeAliasesUsingIndex[LocalVariableDescriptor]

'onEach' @ [191:22] ==> @SinceKotlin public fun <T> Sequence<TypeAliasDescriptor>.onEach(action: (TypeAliasDescriptor) -> Unit): Sequence<TypeAliasDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeAliasDescriptor

'out' @ [191:31] ==> val out: MutableSet<TypeAliasDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.resolveTypeAliasesUsingIndex[LocalVariableDescriptor]

'add' @ [191:35] ==> public abstract fun add(element: TypeAliasDescriptor): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'it' @ [191:39] ==> value-parameter it: TypeAliasDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.resolveTypeAliasesUsingIndex.searchRecursively.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [192:22] ==> public fun <T, R> Sequence<TypeAliasDescriptor>.map(transform: (TypeAliasDescriptor) -> String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeAliasDescriptor
    <R> -> String

'it' @ [192:28] ==> value-parameter it: TypeAliasDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.resolveTypeAliasesUsingIndex.searchRecursively.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [192:31] ==> public final val TypeAliasDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [192:36] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'forEach' @ [193:22] ==> public inline fun <T> Sequence<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'searchRecursively' @ [196:9] ==> local final fun searchRecursively(typeName: String): Unit defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.resolveTypeAliasesUsingIndex[SimpleFunctionDescriptorImpl]

'originalTypeName' @ [196:27] ==> value-parameter originalTypeName: String defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.resolveTypeAliasesUsingIndex[ValueParameterDescriptorImpl]

'out' @ [197:16] ==> val out: MutableSet<TypeAliasDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.resolveTypeAliasesUsingIndex[LocalVariableDescriptor]

'type' @ [201:27] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.addTypeNames[ValueParameterDescriptorImpl]

'constructor' @ [201:32] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'constructor' @ [202:9] ==> val constructor: TypeConstructor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.addTypeNames[LocalVariableDescriptor]

'declarationDescriptor' @ [202:21] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'name' @ [202:44] ==> public final val ClassifierDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [202:50] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'let' @ [202:62] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> MutableCollection<String>): MutableCollection<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> MutableCollection<String>

'add' @ [203:13] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'typeName' @ [203:17] ==> value-parameter typeName: String defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.addTypeNames.<anonymous>[ValueParameterDescriptorImpl]

'resolveTypeAliasesUsingIndex' @ [204:13] ==> public final fun resolveTypeAliasesUsingIndex(type: KotlinType, originalTypeName: String): Set<TypeAliasDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[SimpleFunctionDescriptorImpl]

'type' @ [204:42] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.addTypeNames[ValueParameterDescriptorImpl]

'typeName' @ [204:48] ==> value-parameter typeName: String defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.addTypeNames.<anonymous>[ValueParameterDescriptorImpl]

'mapTo' @ [204:58] ==> public inline fun <T, R, C : MutableCollection<in String>> Iterable<TypeAliasDescriptor>.mapTo(destination: MutableCollection<String>, transform: (TypeAliasDescriptor) -> String): MutableCollection<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeAliasDescriptor
    <R> -> String
    <C : MutableCollection<in R>> -> MutableCollection<String>

'this' @ [204:64] ==> <this> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.addTypeNames[ReceiverParameterDescriptorImpl]

'it' @ [204:72] ==> value-parameter it: TypeAliasDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.addTypeNames.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [204:75] ==> public final val TypeAliasDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [204:80] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'constructor' @ [206:9] ==> val constructor: TypeConstructor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.addTypeNames[LocalVariableDescriptor]

'supertypes' @ [206:21] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'forEach' @ [206:32] ==> @HidesMembers public inline fun <T> Iterable<(KotlinType..KotlinType?)>.forEach(action: ((KotlinType..KotlinType?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'addTypeNames' @ [206:42] ==> private final fun MutableCollection<String>.addTypeNames(type: KotlinType): Unit defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[SimpleFunctionDescriptorImpl]

'it' @ [206:55] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.addTypeNames.<anonymous>[ValueParameterDescriptorImpl]

'LinkedHashSet' @ [217:22] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> CallableDescriptor

'descriptor' @ [220:17] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.findSuitableExtensions.processDescriptor[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [220:28] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'invoke' @ [220:66] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'descriptor' @ [220:83] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.findSuitableExtensions.processDescriptor[ValueParameterDescriptorImpl]

'result' @ [221:17] ==> val result: LinkedHashSet<CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.findSuitableExtensions[LocalVariableDescriptor]

'addAll' @ [221:24] ==> public open fun addAll(elements: Collection<CallableDescriptor>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'descriptor' @ [221:31] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.findSuitableExtensions.processDescriptor[ValueParameterDescriptorImpl]

'substituteExtensionIfCallable' @ [221:42] ==> public fun <TCallable : CallableDescriptor> CallableDescriptor.substituteExtensionIfCallable(receiverTypes: Collection<KotlinType>, callType: CallType<*>): Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <TCallable : CallableDescriptor> -> CallableDescriptor

'receiverTypes' @ [221:72] ==> value-parameter receiverTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.findSuitableExtensions[ValueParameterDescriptorImpl]

'callType' @ [221:87] ==> value-parameter callType: CallType<*> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.findSuitableExtensions[ValueParameterDescriptorImpl]

'declarations' @ [225:9] ==> value-parameter declarations: Sequence<KtCallableDeclaration> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.findSuitableExtensions[ValueParameterDescriptorImpl]

'forEach' @ [225:22] ==> public inline fun <T> Sequence<KtCallableDeclaration>.forEach(action: (KtCallableDeclaration) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallableDeclaration

'it' @ [225:32] ==> value-parameter it: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.findSuitableExtensions.<anonymous>[ValueParameterDescriptorImpl]

'resolveToDescriptors' @ [225:35] ==> private final inline fun <reified TDescriptor : Any> KtNamedDeclaration.resolveToDescriptors(): Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified TDescriptor : Any> -> CallableDescriptor

'forEach' @ [225:78] ==> @HidesMembers public inline fun <T> Iterable<CallableDescriptor>.forEach(action: (CallableDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'result' @ [227:16] ==> val result: LinkedHashSet<CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.findSuitableExtensions[LocalVariableDescriptor]

'getInstance' @ [231:35] ==> public open fun getInstance(p0: (Project..Project?)): (PsiShortNamesCache..PsiShortNamesCache?) defined in com.intellij.psi.search.PsiShortNamesCache[JavaMethodDescriptor]

'project' @ [231:47] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'getClassesByName' @ [231:56] ==> @NotNull public abstract fun getClassesByName(@NotNull @NonNls p0: String, @NotNull p1: GlobalSearchScope): (Array<(PsiClass..PsiClass?)>..Array<out (PsiClass..PsiClass?)>) defined in com.intellij.psi.search.PsiShortNamesCache[JavaMethodDescriptor]

'name' @ [231:73] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getJvmClassesByName[ValueParameterDescriptorImpl]

'scope' @ [231:79] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'filter' @ [232:18] ==> public inline fun <T> Array<out (PsiClass..PsiClass?)>.filter(predicate: ((PsiClass..PsiClass?)) -> Boolean): List<(PsiClass..PsiClass?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'it' @ [232:27] ==> value-parameter it: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getJvmClassesByName.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [232:33] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'it' @ [232:42] ==> value-parameter it: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getJvmClassesByName.<anonymous>[ValueParameterDescriptorImpl]

'containingFile' @ [232:45] ==> public final val PsiClass.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'mapNotNull' @ [233:18] ==> public inline fun <T, R : Any> Iterable<(PsiClass..PsiClass?)>.mapNotNull(transform: ((PsiClass..PsiClass?)) -> ClassDescriptor?): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)
    <R : Any> -> ClassDescriptor

'it' @ [233:31] ==> value-parameter it: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getJvmClassesByName.<anonymous>[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [233:34] ==> public fun PsiClass.resolveToDescriptor(resolutionFacade: ResolutionFacade, declarationTranslator: (KtClassOrObject) -> KtClassOrObject? = ...): ClassDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[SimpleFunctionDescriptorImpl]

'resolutionFacade' @ [233:54] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'filter' @ [234:18] ==> public inline fun <T> Iterable<ClassDescriptor>.filter(predicate: (ClassDescriptor) -> Boolean): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'descriptorFilter' @ [234:25] ==> private final val descriptorFilter: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'toSet' @ [235:18] ==> public fun <T> Iterable<ClassDescriptor>.toSet(): Set<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'KotlinClassShortNameIndex.getInstance()[name, project, scope]' @ [239:16] ==> @NotNull @Override public open fun get(@NotNull s: String, @NotNull project: Project, @NotNull scope: GlobalSearchScope): (MutableCollection<(KtClassOrObject..KtClassOrObject?)>..Collection<(KtClassOrObject..KtClassOrObject?)>) defined in org.jetbrains.kotlin.idea.stubindex.KotlinClassShortNameIndex[JavaMethodDescriptor]

'getInstance' @ [239:42] ==> @NotNull public open fun getInstance(): KotlinClassShortNameIndex defined in org.jetbrains.kotlin.idea.stubindex.KotlinClassShortNameIndex[JavaMethodDescriptor]

'name' @ [239:56] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getKotlinEnumsByName[ValueParameterDescriptorImpl]

'project' @ [239:62] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'scope' @ [239:71] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'filter' @ [240:18] ==> public inline fun <T> Iterable<(KtClassOrObject..KtClassOrObject?)>.filter(predicate: ((KtClassOrObject..KtClassOrObject?)) -> Boolean): List<(KtClassOrObject..KtClassOrObject?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtClassOrObject..org.jetbrains.kotlin.psi.KtClassOrObject?)

'it' @ [240:27] ==> value-parameter it: (KtClassOrObject..KtClassOrObject?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getKotlinEnumsByName.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [240:48] ==> value-parameter it: (KtClassOrObject..KtClassOrObject?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getKotlinEnumsByName.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [240:54] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'mapNotNull' @ [241:18] ==> public inline fun <T, R : Any> Iterable<(KtClassOrObject..KtClassOrObject?)>.mapNotNull(transform: ((KtClassOrObject..KtClassOrObject?)) -> DeclarationDescriptor?): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtClassOrObject..org.jetbrains.kotlin.psi.KtClassOrObject?)
    <R : Any> -> DeclarationDescriptor

'it' @ [241:31] ==> value-parameter it: (KtClassOrObject..KtClassOrObject?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getKotlinEnumsByName.<anonymous>[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [241:34] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'filter' @ [242:18] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'descriptorFilter' @ [242:25] ==> private final val descriptorFilter: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'toSet' @ [243:18] ==> public fun <T> Iterable<DeclarationDescriptor>.toSet(): Set<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'getJavaCallables' @ [251:32] ==> private final fun getJavaCallables(name: String, shortNamesCache: PsiShortNamesCache): Sequence<Any> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[SimpleFunctionDescriptorImpl]

'name' @ [251:49] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJvmCallablesByName[ValueParameterDescriptorImpl]

'getInstance' @ [251:74] ==> public open fun getInstance(p0: (Project..Project?)): (PsiShortNamesCache..PsiShortNamesCache?) defined in com.intellij.psi.search.PsiShortNamesCache[JavaMethodDescriptor]

'project' @ [251:86] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'HashSet' @ [252:25] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> CallableDescriptor

'javaDeclarations' @ [253:33] ==> val javaDeclarations: Sequence<Any> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJvmCallablesByName[LocalVariableDescriptor]

'checkCanceled' @ [254:29] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'javaDeclaration' @ [255:17] ==> val javaDeclaration: Any defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJvmCallablesByName[LocalVariableDescriptor]

'!' @ [256:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [256:18] ==> public abstract operator fun invoke(p1: PsiMember): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'javaDeclaration' @ [256:25] ==> val javaDeclaration: Any defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJvmCallablesByName[LocalVariableDescriptor]

'javaDeclaration' @ [257:30] ==> val javaDeclaration: Any defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJvmCallablesByName[LocalVariableDescriptor]

'getJavaMemberDescriptor' @ [257:46] ==> @JvmOverloads public fun PsiMember.getJavaMemberDescriptor(resolutionFacade: ResolutionFacade? = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve in file JavaResolveExtension.kt[SimpleFunctionDescriptorImpl]

'resolutionFacade' @ [257:70] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'!' @ [258:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'processed' @ [258:18] ==> val processed: HashSet<CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJvmCallablesByName[LocalVariableDescriptor]

'add' @ [258:28] ==> public open fun add(element: CallableDescriptor): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'descriptor' @ [258:32] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJvmCallablesByName[LocalVariableDescriptor]

'!' @ [259:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [259:18] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'descriptor' @ [259:35] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJvmCallablesByName[LocalVariableDescriptor]

'invoke' @ [260:13] ==> public abstract operator fun invoke(p1: CallableDescriptor): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'descriptor' @ [260:23] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJvmCallablesByName[LocalVariableDescriptor]

'lazy' @ [270:72] ==> public fun <T> lazy(initializer: () -> List<PsiShortNamesCache>?): Lazy<List<PsiShortNamesCache>?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<PsiShortNamesCache>?

'getInstance' @ [271:50] ==> public open fun getInstance(p0: (Project..Project?)): (PsiShortNamesCache..PsiShortNamesCache?) defined in com.intellij.psi.search.PsiShortNamesCache[JavaMethodDescriptor]

'project' @ [271:62] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'shortNamesCache' @ [272:13] ==> val shortNamesCache: (PsiShortNamesCache..PsiShortNamesCache?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.filteredShortNamesCaches.<anonymous>[LocalVariableDescriptor]

'clazz' @ [276:32] ==> value-parameter clazz: Class<out PsiShortNamesCache> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.filteredShortNamesCaches.<anonymous>.getMyCachesField[ValueParameterDescriptorImpl]

'getDeclaredField' @ [276:38] ==> @CallerSensitive public open fun getDeclaredField(p0: (String..String?)): (Field..Field?) defined in java.lang.Class[JavaMethodDescriptor]

'clazz' @ [280:32] ==> value-parameter clazz: Class<out PsiShortNamesCache> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.filteredShortNamesCaches.<anonymous>.getMyCachesField[ValueParameterDescriptorImpl]

'declaredFields' @ [280:38] ==> public final val <T : (Any..Any?)> Class<out PsiShortNamesCache>.declaredFields: (Array<(Field..Field?)>..Array<out (Field..Field?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiShortNamesCache

'first' @ [280:53] ==> public inline fun <T> Array<out (Field..Field?)>.first(predicate: ((Field..Field?)) -> Boolean): (Field..Field?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Field..java.lang.reflect.Field?)

'isPrivate' @ [281:38] ==> public open fun isPrivate(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'it' @ [281:48] ==> value-parameter it: (Field..Field?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.filteredShortNamesCaches.<anonymous>.getMyCachesField.<anonymous>[ValueParameterDescriptorImpl]

'modifiers' @ [281:51] ==> public final val Field.modifiers: Int[MyPropertyDescriptor]

'isFinal' @ [281:74] ==> public open fun isFinal(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'it' @ [281:82] ==> value-parameter it: (Field..Field?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.filteredShortNamesCaches.<anonymous>.getMyCachesField.<anonymous>[ValueParameterDescriptorImpl]

'modifiers' @ [281:85] ==> public final val Field.modifiers: Int[MyPropertyDescriptor]

'!' @ [281:99] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isStatic' @ [281:109] ==> public open fun isStatic(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'it' @ [281:118] ==> value-parameter it: (Field..Field?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.filteredShortNamesCaches.<anonymous>.getMyCachesField.<anonymous>[ValueParameterDescriptorImpl]

'modifiers' @ [281:121] ==> public final val Field.modifiers: Int[MyPropertyDescriptor]

'it' @ [282:32] ==> value-parameter it: (Field..Field?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.filteredShortNamesCaches.<anonymous>.getMyCachesField.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [282:35] ==> public final val Field.type: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'isArray' @ [282:40] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.isArray: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'it' @ [282:51] ==> value-parameter it: (Field..Field?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.filteredShortNamesCaches.<anonymous>.getMyCachesField.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [282:54] ==> public final val Field.type: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'componentType' @ [282:59] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.componentType: (Class<*>..Class<*>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'PsiShortNamesCache' @ [282:76] ==> public constructor PsiShortNamesCache() defined in com.intellij.psi.search.PsiShortNamesCache[JavaClassConstructorDescriptor]

'java' @ [282:102] ==> public val <T> KClass<PsiShortNamesCache>.java: Class<PsiShortNamesCache> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiShortNamesCache

'getMyCachesField' @ [287:37] ==> local final fun getMyCachesField(clazz: Class<out PsiShortNamesCache>): Field defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.filteredShortNamesCaches.<anonymous>[SimpleFunctionDescriptorImpl]

'shortNamesCache' @ [287:54] ==> val shortNamesCache: (PsiShortNamesCache..PsiShortNamesCache?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.filteredShortNamesCaches.<anonymous>[LocalVariableDescriptor]

'java' @ [287:77] ==> public val <T> KClass<out PsiShortNamesCache>.java: Class<out PsiShortNamesCache> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiShortNamesCache

'myCachesField' @ [288:44] ==> val myCachesField: Field defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.filteredShortNamesCaches.<anonymous>[LocalVariableDescriptor]

'isAccessible' @ [288:58] ==> public final var Field.isAccessible: Boolean[MyPropertyDescriptor]

'myCachesField' @ [290:21] ==> val myCachesField: Field defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.filteredShortNamesCaches.<anonymous>[LocalVariableDescriptor]

'isAccessible' @ [290:35] ==> public final var Field.isAccessible: Boolean[MyPropertyDescriptor]

'Suppress' @ [291:21] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'myCachesField' @ [292:34] ==> val myCachesField: Field defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.filteredShortNamesCaches.<anonymous>[LocalVariableDescriptor]

'get' @ [292:48] ==> @CallerSensitive public open operator fun get(p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Field[JavaMethodDescriptor]

'shortNamesCache' @ [292:52] ==> val shortNamesCache: (PsiShortNamesCache..PsiShortNamesCache?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.filteredShortNamesCaches.<anonymous>[LocalVariableDescriptor]

'filter' @ [292:99] ==> public inline fun <T> Array<out PsiShortNamesCache>.filter(predicate: (PsiShortNamesCache) -> Boolean): List<PsiShortNamesCache> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiShortNamesCache

'it' @ [293:25] ==> value-parameter it: PsiShortNamesCache defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.filteredShortNamesCaches.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [294:28] ==> value-parameter it: PsiShortNamesCache defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.filteredShortNamesCaches.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'java' @ [294:38] ==> public val <T> KClass<out PsiShortNamesCache>.java: Class<out PsiShortNamesCache> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiShortNamesCache

'name' @ [294:43] ==> public final val <T : (Any..Any?)> Class<out PsiShortNamesCache>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiShortNamesCache

'it' @ [295:28] ==> value-parameter it: PsiShortNamesCache defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.filteredShortNamesCaches.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'java' @ [295:38] ==> public val <T> KClass<out PsiShortNamesCache>.java: Class<out PsiShortNamesCache> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiShortNamesCache

'name' @ [295:43] ==> public final val <T : (Any..Any?)> Class<out PsiShortNamesCache>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiShortNamesCache

'it' @ [296:28] ==> value-parameter it: PsiShortNamesCache defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.filteredShortNamesCaches.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'java' @ [296:38] ==> public val <T> KClass<out PsiShortNamesCache>.java: Class<out PsiShortNamesCache> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiShortNamesCache

'name' @ [296:43] ==> public final val <T : (Any..Any?)> Class<out PsiShortNamesCache>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiShortNamesCache

'myCachesField' @ [300:21] ==> val myCachesField: Field defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.filteredShortNamesCaches.<anonymous>[LocalVariableDescriptor]

'isAccessible' @ [300:35] ==> public final var Field.isAccessible: Boolean[MyPropertyDescriptor]

'previousIsAccessible' @ [300:50] ==> val previousIsAccessible: Boolean defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.filteredShortNamesCaches.<anonymous>[LocalVariableDescriptor]

'filteredShortNamesCaches' @ [311:9] ==> private final val filteredShortNamesCaches: List<PsiShortNamesCache>? defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'let' @ [311:35] ==> @InlineOnly public inline fun <T, R> List<PsiShortNamesCache>.let(block: (List<PsiShortNamesCache>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<PsiShortNamesCache>
    <R> -> Nothing

'getCallablesByName' @ [311:58] ==> private final fun getCallablesByName(name: String, scope: GlobalSearchScope, caches: List<PsiShortNamesCache>): Sequence<Any> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[SimpleFunctionDescriptorImpl]

'name' @ [311:77] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getJavaCallables[ValueParameterDescriptorImpl]

'scopeWithoutKotlin' @ [311:83] ==> private final val scopeWithoutKotlin: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'caches' @ [311:103] ==> value-parameter caches: List<PsiShortNamesCache> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getJavaCallables.<anonymous>[ValueParameterDescriptorImpl]

'shortNamesCache' @ [312:16] ==> value-parameter shortNamesCache: PsiShortNamesCache defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getJavaCallables[ValueParameterDescriptorImpl]

'getFieldsByNameUnfiltered' @ [312:32] ==> private final fun PsiShortNamesCache.getFieldsByNameUnfiltered(name: String, scope: GlobalSearchScope): Sequence<PsiField> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[SimpleFunctionDescriptorImpl]

'name' @ [312:58] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getJavaCallables[ValueParameterDescriptorImpl]

'scopeWithoutKotlin' @ [312:64] ==> private final val scopeWithoutKotlin: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'asSequence' @ [312:84] ==> @InlineOnly public inline fun <T> Sequence<PsiField>.asSequence(): Sequence<PsiField> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiField

'shortNamesCache' @ [313:16] ==> value-parameter shortNamesCache: PsiShortNamesCache defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getJavaCallables[ValueParameterDescriptorImpl]

'getMethodsByNameUnfiltered' @ [313:32] ==> private final fun PsiShortNamesCache.getMethodsByNameUnfiltered(name: String, scope: GlobalSearchScope): Sequence<PsiMethod> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[SimpleFunctionDescriptorImpl]

'name' @ [313:59] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getJavaCallables[ValueParameterDescriptorImpl]

'scopeWithoutKotlin' @ [313:65] ==> private final val scopeWithoutKotlin: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'asSequence' @ [313:85] ==> @InlineOnly public inline fun <T> Sequence<PsiMethod>.asSequence(): Sequence<PsiMethod> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'caches' @ [317:16] ==> value-parameter caches: List<PsiShortNamesCache> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallablesByName[ValueParameterDescriptorImpl]

'asSequence' @ [317:23] ==> public fun <T> Iterable<PsiShortNamesCache>.asSequence(): Sequence<PsiShortNamesCache> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiShortNamesCache

'flatMap' @ [317:36] ==> public fun <T, R> Sequence<PsiShortNamesCache>.flatMap(transform: (PsiShortNamesCache) -> Sequence<{PomRenameableTarget<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)> & PsiTarget & PsiNameIdentifierOwner & PsiDocCommentOwner}>): Sequence<{PomRenameableTarget<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)> & PsiTarget & PsiNameIdentifierOwner & PsiDocCommentOwner}> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiShortNamesCache
    <R> -> {PomRenameableTarget<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)> & PsiTarget & PsiNameIdentifierOwner & PsiDocCommentOwner}

'cache' @ [318:13] ==> value-parameter cache: PsiShortNamesCache defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallablesByName.<anonymous>[ValueParameterDescriptorImpl]

'getMethodsByNameUnfiltered' @ [318:19] ==> private final fun PsiShortNamesCache.getMethodsByNameUnfiltered(name: String, scope: GlobalSearchScope): Sequence<PsiMethod> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[SimpleFunctionDescriptorImpl]

'name' @ [318:46] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallablesByName[ValueParameterDescriptorImpl]

'scope' @ [318:52] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallablesByName[ValueParameterDescriptorImpl]

'cache' @ [318:61] ==> value-parameter cache: PsiShortNamesCache defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallablesByName.<anonymous>[ValueParameterDescriptorImpl]

'getFieldsByNameUnfiltered' @ [318:67] ==> private final fun PsiShortNamesCache.getFieldsByNameUnfiltered(name: String, scope: GlobalSearchScope): Sequence<PsiField> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[SimpleFunctionDescriptorImpl]

'name' @ [318:93] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallablesByName[ValueParameterDescriptorImpl]

'scope' @ [318:99] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getCallablesByName[ValueParameterDescriptorImpl]

'asSequence' @ [318:106] ==> @InlineOnly public inline fun <T> Sequence<PsiField>.asSequence(): Sequence<PsiField> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiField

'arrayListOf' @ [326:22] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<PsiMethod> /* = ArrayList<PsiMethod> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'processMethodsWithName' @ [327:9] ==> public final fun processMethodsWithName(@NonNls @NotNull p0: String, @NotNull p1: GlobalSearchScope, @NotNull p2: ((PsiMethod..PsiMethod?)) -> Boolean): Boolean defined in com.intellij.psi.search.PsiShortNamesCache[MyFunctionDescriptor]

'name' @ [327:32] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getMethodsByNameUnfiltered[ValueParameterDescriptorImpl]

'scope' @ [327:38] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getMethodsByNameUnfiltered[ValueParameterDescriptorImpl]

'result' @ [327:47] ==> val result: ArrayList<PsiMethod> /* = ArrayList<PsiMethod> */ defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getMethodsByNameUnfiltered[LocalVariableDescriptor]

'add' @ [327:54] ==> public open fun add(element: PsiMethod): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [327:58] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getMethodsByNameUnfiltered.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [328:16] ==> val result: ArrayList<PsiMethod> /* = ArrayList<PsiMethod> */ defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getMethodsByNameUnfiltered[LocalVariableDescriptor]

'asSequence' @ [328:23] ==> public fun <T> Iterable<PsiMethod>.asSequence(): Sequence<PsiMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'arrayListOf' @ [332:22] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<PsiField> /* = ArrayList<PsiField> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiField

'processFieldsWithName' @ [333:9] ==> public final fun processFieldsWithName(@NotNull p0: String, @NotNull p1: ((PsiField..PsiField?)) -> Boolean, @NotNull p2: GlobalSearchScope, @Nullable p3: IdFilter?): Boolean defined in com.intellij.psi.search.PsiShortNamesCache[MyFunctionDescriptor]

'name' @ [333:31] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getFieldsByNameUnfiltered[ValueParameterDescriptorImpl]

'result' @ [333:48] ==> val result: ArrayList<PsiField> /* = ArrayList<PsiField> */ defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getFieldsByNameUnfiltered[LocalVariableDescriptor]

'add' @ [333:55] ==> public open fun add(element: PsiField): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'field' @ [333:59] ==> value-parameter field: (PsiField..PsiField?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getFieldsByNameUnfiltered.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [333:75] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getFieldsByNameUnfiltered[ValueParameterDescriptorImpl]

'result' @ [334:16] ==> val result: ArrayList<PsiField> /* = ArrayList<PsiField> */ defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getFieldsByNameUnfiltered[LocalVariableDescriptor]

'asSequence' @ [334:23] ==> public fun <T> Iterable<PsiField>.asSequence(): Sequence<PsiField> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiField

'getInstance' @ [342:87] ==> public open fun getInstance(): (KotlinFunctionShortNameIndex..KotlinFunctionShortNameIndex?) defined in org.jetbrains.kotlin.idea.stubindex.KotlinFunctionShortNameIndex[JavaMethodDescriptor]

'get' @ [342:101] ==> @NotNull @Override public open fun get(@NotNull s: String, @NotNull project: Project, @NotNull scope: GlobalSearchScope): (MutableCollection<(KtNamedFunction..KtNamedFunction?)>..Collection<(KtNamedFunction..KtNamedFunction?)>) defined in org.jetbrains.kotlin.idea.stubindex.KotlinFunctionShortNameIndex[JavaMethodDescriptor]

'name' @ [342:105] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processKotlinCallablesByName[ValueParameterDescriptorImpl]

'project' @ [342:111] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'scope' @ [342:120] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'asSequence' @ [342:127] ==> public fun <T> Iterable<(KtNamedFunction..KtNamedFunction?)>.asSequence(): Sequence<(KtNamedFunction..KtNamedFunction?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtNamedFunction..org.jetbrains.kotlin.psi.KtNamedFunction?)

'getInstance' @ [343:85] ==> public open fun getInstance(): (KotlinPropertyShortNameIndex..KotlinPropertyShortNameIndex?) defined in org.jetbrains.kotlin.idea.stubindex.KotlinPropertyShortNameIndex[JavaMethodDescriptor]

'get' @ [343:99] ==> @NotNull @Override public open fun get(@NotNull s: String, @NotNull project: Project, @NotNull scope: GlobalSearchScope): (MutableCollection<(KtNamedDeclaration..KtNamedDeclaration?)>..Collection<(KtNamedDeclaration..KtNamedDeclaration?)>) defined in org.jetbrains.kotlin.idea.stubindex.KotlinPropertyShortNameIndex[JavaMethodDescriptor]

'name' @ [343:103] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processKotlinCallablesByName[ValueParameterDescriptorImpl]

'project' @ [343:109] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'scope' @ [343:118] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'asSequence' @ [343:125] ==> public fun <T> Iterable<(KtNamedDeclaration..KtNamedDeclaration?)>.asSequence(): Sequence<(KtNamedDeclaration..KtNamedDeclaration?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtNamedDeclaration..org.jetbrains.kotlin.psi.KtNamedDeclaration?)

'HashSet' @ [344:25] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> CallableDescriptor

'functions' @ [345:29] ==> val functions: Sequence<KtCallableDeclaration> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processKotlinCallablesByName[LocalVariableDescriptor]

'properties' @ [345:41] ==> val properties: Sequence<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processKotlinCallablesByName[LocalVariableDescriptor]

'checkCanceled' @ [346:29] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'!' @ [347:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [347:18] ==> public abstract operator fun invoke(p1: KtNamedDeclaration): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'declaration' @ [347:25] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processKotlinCallablesByName[LocalVariableDescriptor]

'declaration' @ [348:30] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processKotlinCallablesByName[LocalVariableDescriptor]

'descriptor' @ [348:42] ==> public val KtDeclaration.descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch in file utils.kt[PropertyDescriptorImpl]

'!' @ [349:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'processed' @ [349:18] ==> val processed: HashSet<CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processKotlinCallablesByName[LocalVariableDescriptor]

'add' @ [349:28] ==> public open fun add(element: CallableDescriptor): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'descriptor' @ [349:32] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processKotlinCallablesByName[LocalVariableDescriptor]

'!' @ [350:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [350:18] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'descriptor' @ [350:35] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processKotlinCallablesByName[LocalVariableDescriptor]

'invoke' @ [351:13] ==> public abstract operator fun invoke(p1: CallableDescriptor): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'descriptor' @ [351:23] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processKotlinCallablesByName[LocalVariableDescriptor]

'getInstance' @ [359:46] ==> @NotNull public open fun getInstance(): KotlinFullClassNameIndex defined in org.jetbrains.kotlin.idea.stubindex.KotlinFullClassNameIndex[JavaMethodDescriptor]

'index' @ [360:16] ==> val index: KotlinFullClassNameIndex defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getKotlinClasses[LocalVariableDescriptor]

'getAllKeys' @ [360:22] ==> public open fun getAllKeys(p0: (Project..Project?)): (MutableCollection<(String..String?)>..Collection<(String..String?)>?) defined in org.jetbrains.kotlin.idea.stubindex.KotlinFullClassNameIndex[JavaMethodDescriptor]

'project' @ [360:33] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'asSequence' @ [360:42] ==> public fun <T> Iterable<(String..String?)>.asSequence(): Sequence<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'filter' @ [361:18] ==> public fun <T> Sequence<(String..String?)>.filter(predicate: ((String..String?)) -> Boolean): Sequence<(String..String?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'checkCanceled' @ [362:37] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'invoke' @ [363:21] ==> public abstract operator fun invoke(p1: String): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'fqName' @ [363:32] ==> value-parameter fqName: (String..String?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getKotlinClasses.<anonymous>[ValueParameterDescriptorImpl]

'substringAfterLast' @ [363:39] ==> public fun String.substringAfterLast(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toList' @ [365:18] ==> public fun <T> Sequence<(String..String?)>.toList(): List<(String..String?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'flatMap' @ [366:18] ==> public inline fun <T, R> Iterable<(String..String?)>.flatMap(transform: ((String..String?)) -> Iterable<ClassDescriptor>): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <R> -> ClassDescriptor

'index' @ [367:21] ==> val index: KotlinFullClassNameIndex defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getKotlinClasses[LocalVariableDescriptor]

'fqName' @ [367:27] ==> value-parameter fqName: (String..String?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getKotlinClasses.<anonymous>[ValueParameterDescriptorImpl]

'project' @ [367:35] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'scope' @ [367:44] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'flatMap' @ [367:51] ==> public inline fun <T, R> Iterable<(KtClassOrObject..KtClassOrObject?)>.flatMap(transform: ((KtClassOrObject..KtClassOrObject?)) -> Iterable<ClassDescriptor>): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtClassOrObject..org.jetbrains.kotlin.psi.KtClassOrObject?)
    <R> -> ClassDescriptor

'classOrObject' @ [368:25] ==> value-parameter classOrObject: (KtClassOrObject..KtClassOrObject?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getKotlinClasses.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'resolveToDescriptorsWithHack' @ [368:39] ==> private final fun KtNamedDeclaration.resolveToDescriptorsWithHack(psiFilter: (KtDeclaration) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[SimpleFunctionDescriptorImpl]

'psiFilter' @ [368:68] ==> value-parameter psiFilter: (KtDeclaration) -> Boolean = ... defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getKotlinClasses[ValueParameterDescriptorImpl]

'filterIsInstance' @ [368:79] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> ClassDescriptor

'filter' @ [371:18] ==> public inline fun <T> Iterable<ClassDescriptor>.filter(predicate: (ClassDescriptor) -> Boolean): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'invoke' @ [371:27] ==> public abstract operator fun invoke(p1: ClassKind): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [371:38] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getKotlinClasses.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [371:41] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'invoke' @ [371:50] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [371:67] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getKotlinClasses.<anonymous>[ValueParameterDescriptorImpl]

'KotlinTopLevelTypeAliasFqNameIndex' @ [375:21] ==> public companion object defined in org.jetbrains.kotlin.idea.stubindex.KotlinTopLevelTypeAliasFqNameIndex[FakeCallableDescriptorForObject]

'getInstance' @ [375:56] ==> @JvmStatic public final fun getInstance(): KotlinTopLevelTypeAliasFqNameIndex defined in org.jetbrains.kotlin.idea.stubindex.KotlinTopLevelTypeAliasFqNameIndex.Companion[SimpleFunctionDescriptorImpl]

'index' @ [376:16] ==> val index: KotlinTopLevelTypeAliasFqNameIndex defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getTopLevelTypeAliases[LocalVariableDescriptor]

'getAllKeys' @ [376:22] ==> public open fun getAllKeys(p0: (Project..Project?)): (MutableCollection<(String..String?)>..Collection<(String..String?)>?) defined in org.jetbrains.kotlin.idea.stubindex.KotlinTopLevelTypeAliasFqNameIndex[JavaMethodDescriptor]

'project' @ [376:33] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'asSequence' @ [376:42] ==> public fun <T> Iterable<(String..String?)>.asSequence(): Sequence<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'filter' @ [377:18] ==> public fun <T> Sequence<(String..String?)>.filter(predicate: ((String..String?)) -> Boolean): Sequence<(String..String?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'checkCanceled' @ [378:37] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'invoke' @ [379:21] ==> public abstract operator fun invoke(p1: String): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [379:32] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getTopLevelTypeAliases.<anonymous>[ValueParameterDescriptorImpl]

'substringAfterLast' @ [379:35] ==> public fun String.substringAfterLast(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toList' @ [381:18] ==> public fun <T> Sequence<(String..String?)>.toList(): List<(String..String?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'flatMap' @ [382:18] ==> public inline fun <T, R> Iterable<(String..String?)>.flatMap(transform: ((String..String?)) -> Iterable<TypeAliasDescriptor>): List<TypeAliasDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <R> -> TypeAliasDescriptor

'index' @ [383:21] ==> val index: KotlinTopLevelTypeAliasFqNameIndex defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getTopLevelTypeAliases[LocalVariableDescriptor]

'fqName' @ [383:27] ==> value-parameter fqName: (String..String?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getTopLevelTypeAliases.<anonymous>[ValueParameterDescriptorImpl]

'project' @ [383:35] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'scope' @ [383:44] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'flatMap' @ [384:30] ==> public inline fun <T, R> Iterable<KtTypeAlias>.flatMap(transform: (KtTypeAlias) -> Iterable<TypeAliasDescriptor>): List<TypeAliasDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeAlias
    <R> -> TypeAliasDescriptor

'it' @ [384:40] ==> value-parameter it: KtTypeAlias defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.getTopLevelTypeAliases.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'resolveToDescriptors' @ [384:43] ==> private final inline fun <reified TDescriptor : Any> KtNamedDeclaration.resolveToDescriptors(): Collection<TypeAliasDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified TDescriptor : Any> -> TypeAliasDescriptor

'filter' @ [387:18] ==> public inline fun <T> Iterable<TypeAliasDescriptor>.filter(predicate: (TypeAliasDescriptor) -> Boolean): List<TypeAliasDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeAliasDescriptor

'descriptorFilter' @ [387:25] ==> private final val descriptorFilter: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'index' @ [397:26] ==> value-parameter index: StringStubIndexExtension<out KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processObjectMembers.processIndex[ValueParameterDescriptorImpl]

'getAllKeys' @ [397:32] ==> public open fun getAllKeys(p0: (Project..Project?)): (MutableCollection<(String..String?)>..Collection<(String..String?)>?) defined in com.intellij.psi.stubs.StringStubIndexExtension[JavaMethodDescriptor]

'project' @ [397:43] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'checkCanceled' @ [398:33] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'!' @ [399:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [399:22] ==> public abstract operator fun invoke(p1: String): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'name' @ [399:33] ==> val name: (String..String?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processObjectMembers.processIndex[LocalVariableDescriptor]

'index' @ [401:37] ==> value-parameter index: StringStubIndexExtension<out KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processObjectMembers.processIndex[ValueParameterDescriptorImpl]

'get' @ [401:43] ==> public open fun get(@NotNull p0: String, @NotNull p1: Project, @NotNull p2: GlobalSearchScope): (MutableCollection<out (KtNamedDeclaration..KtNamedDeclaration?)>..Collection<(KtNamedDeclaration..KtNamedDeclaration?)>?) defined in com.intellij.psi.stubs.StringStubIndexExtension[JavaMethodDescriptor]

'name' @ [401:47] ==> val name: (String..String?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processObjectMembers.processIndex[LocalVariableDescriptor]

'project' @ [401:53] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'scope' @ [401:62] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'declaration' @ [402:45] ==> val declaration: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processObjectMembers.processIndex[LocalVariableDescriptor]

'parent' @ [402:57] ==> public final val KtNamedDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [402:64] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'objectDeclaration' @ [403:25] ==> val objectDeclaration: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processObjectMembers.processIndex[LocalVariableDescriptor]

'isObjectLiteral' @ [403:43] ==> public final fun isObjectLiteral(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'filterOutPrivate' @ [404:25] ==> private final val filterOutPrivate: Boolean defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'declaration' @ [404:45] ==> val declaration: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processObjectMembers.processIndex[LocalVariableDescriptor]

'hasModifier' @ [404:57] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'PRIVATE_KEYWORD' @ [404:78] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'!' @ [405:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [405:26] ==> public abstract operator fun invoke(p1: KtNamedDeclaration, p2: KtObjectDeclaration): Boolean defined in kotlin.Function2[FunctionInvokeDescriptor]

'declaration' @ [405:33] ==> val declaration: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processObjectMembers.processIndex[LocalVariableDescriptor]

'objectDeclaration' @ [405:46] ==> val objectDeclaration: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processObjectMembers.processIndex[LocalVariableDescriptor]

'declaration' @ [406:40] ==> val declaration: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processObjectMembers.processIndex[LocalVariableDescriptor]

'resolveToDescriptors' @ [406:52] ==> private final inline fun <reified TDescriptor : Any> KtNamedDeclaration.resolveToDescriptors(): Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified TDescriptor : Any> -> CallableDescriptor

'descriptorKindFilter' @ [407:29] ==> value-parameter descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processObjectMembers[ValueParameterDescriptorImpl]

'accepts' @ [407:50] ==> public final fun accepts(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [407:58] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processObjectMembers.processIndex[LocalVariableDescriptor]

'invoke' @ [407:73] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'descriptor' @ [407:90] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processObjectMembers.processIndex[LocalVariableDescriptor]

'invoke' @ [408:29] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'descriptor' @ [408:39] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processObjectMembers.processIndex[LocalVariableDescriptor]

'descriptorKindFilter' @ [415:13] ==> value-parameter descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processObjectMembers[ValueParameterDescriptorImpl]

'kindMask' @ [415:34] ==> public final val kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedPropertyDescriptor]

'and' @ [415:43] ==> public final infix fun and(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'DescriptorKindFilter' @ [415:47] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'FUNCTIONS_MASK' @ [415:68] ==> public final val FUNCTIONS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'processIndex' @ [416:13] ==> local final fun processIndex(index: StringStubIndexExtension<out KtNamedDeclaration>): Unit defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processObjectMembers[SimpleFunctionDescriptorImpl]

'getInstance' @ [416:55] ==> public open fun getInstance(): (KotlinFunctionShortNameIndex..KotlinFunctionShortNameIndex?) defined in org.jetbrains.kotlin.idea.stubindex.KotlinFunctionShortNameIndex[JavaMethodDescriptor]

'descriptorKindFilter' @ [418:13] ==> value-parameter descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processObjectMembers[ValueParameterDescriptorImpl]

'kindMask' @ [418:34] ==> public final val kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedPropertyDescriptor]

'and' @ [418:43] ==> public final infix fun and(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'DescriptorKindFilter' @ [418:47] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'VARIABLES_MASK' @ [418:68] ==> public final val VARIABLES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'processIndex' @ [419:13] ==> local final fun processIndex(index: StringStubIndexExtension<out KtNamedDeclaration>): Unit defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processObjectMembers[SimpleFunctionDescriptorImpl]

'getInstance' @ [419:55] ==> public open fun getInstance(): (KotlinPropertyShortNameIndex..KotlinPropertyShortNameIndex?) defined in org.jetbrains.kotlin.idea.stubindex.KotlinPropertyShortNameIndex[JavaMethodDescriptor]

'getProjectIdFilter' @ [428:33] ==> public open fun getProjectIdFilter(p0: (Project..Project?), p1: Boolean): (IdFilter..IdFilter?) defined in com.intellij.util.indexing.IdFilter[JavaMethodDescriptor]

'resolutionFacade' @ [428:52] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'project' @ [428:69] ==> public abstract val project: Project defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'getInstance' @ [429:50] ==> public open fun getInstance(p0: (Project..Project?)): (PsiShortNamesCache..PsiShortNamesCache?) defined in com.intellij.psi.search.PsiShortNamesCache[JavaMethodDescriptor]

'project' @ [429:62] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'hashSetOf' @ [431:30] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'shortNamesCache' @ [432:9] ==> val shortNamesCache: (PsiShortNamesCache..PsiShortNamesCache?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'processAllMethodNames' @ [432:25] ==> public final fun processAllMethodNames(p0: (((String..String?)) -> Boolean..(((String..String?)) -> Boolean)?), p1: (GlobalSearchScope..GlobalSearchScope?), p2: (IdFilter..IdFilter?)): Boolean defined in com.intellij.psi.search.PsiShortNamesCache[MyFunctionDescriptor]

'invoke' @ [432:61] ==> public abstract operator fun invoke(p1: String): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'name' @ [432:72] ==> value-parameter name: (String..String?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers.<anonymous>[ValueParameterDescriptorImpl]

'allMethodNames' @ [432:79] ==> val allMethodNames: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'add' @ [432:94] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [432:98] ==> value-parameter name: (String..String?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers.<anonymous>[ValueParameterDescriptorImpl]

'scopeWithoutKotlin' @ [432:113] ==> private final val scopeWithoutKotlin: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'idFilter' @ [432:133] ==> val idFilter: (IdFilter..IdFilter?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'allMethodNames' @ [433:22] ==> val allMethodNames: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'checkCanceled' @ [434:29] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'shortNamesCache' @ [436:28] ==> val shortNamesCache: (PsiShortNamesCache..PsiShortNamesCache?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'getMethodsByName' @ [436:44] ==> @NotNull public abstract fun getMethodsByName(@NonNls @NotNull p0: String, @NotNull p1: GlobalSearchScope): (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in com.intellij.psi.search.PsiShortNamesCache[JavaMethodDescriptor]

'name' @ [436:61] ==> val name: String defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'scopeWithoutKotlin' @ [436:67] ==> private final val scopeWithoutKotlin: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'filterNot' @ [436:87] ==> public inline fun <T> Array<out (PsiMethod..PsiMethod?)>.filterNot(predicate: ((PsiMethod..PsiMethod?)) -> Boolean): List<(PsiMethod..PsiMethod?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'it' @ [436:99] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [437:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'method' @ [437:22] ==> val method: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'hasModifierProperty' @ [437:29] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'STATIC' @ [437:61] ==> public const final val STATIC: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'filterOutPrivate' @ [438:21] ==> private final val filterOutPrivate: Boolean defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'method' @ [438:41] ==> val method: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'hasModifierProperty' @ [438:48] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'PRIVATE' @ [438:80] ==> public const final val PRIVATE: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'method' @ [439:21] ==> val method: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'containingClass' @ [439:28] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'parent' @ [439:45] ==> public final val PsiClass.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'method' @ [440:34] ==> val method: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'getJavaMethodDescriptor' @ [440:41] ==> @JvmOverloads public fun PsiMethod.getJavaMethodDescriptor(resolutionFacade: ResolutionFacade? = ...): FunctionDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve in file JavaResolveExtension.kt[SimpleFunctionDescriptorImpl]

'resolutionFacade' @ [440:65] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'descriptor' @ [441:33] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'containingDeclaration' @ [441:44] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'descriptorKindFilter' @ [442:21] ==> value-parameter descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[ValueParameterDescriptorImpl]

'accepts' @ [442:42] ==> public final fun accepts(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [442:50] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'invoke' @ [442:65] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'descriptor' @ [442:82] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'invoke' @ [443:21] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'descriptor' @ [443:31] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'resolutionFacade' @ [446:43] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'getFrontendService' @ [446:60] ==> public abstract fun <T : Any> getFrontendService(serviceClass: Class<SyntheticScopes>): SyntheticScopes defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SyntheticScopes

'java' @ [446:102] ==> public val <T> KClass<SyntheticScopes>.java: Class<SyntheticScopes> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SyntheticScopes

'syntheticScopes' @ [447:21] ==> val syntheticScopes: SyntheticScopes defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'collectSyntheticStaticFunctions' @ [447:37] ==> public fun SyntheticScopes.collectSyntheticStaticFunctions(scope: ResolutionScope, name: Name, location: LookupLocation): List<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes[DeserializedSimpleFunctionDescriptor]

'container' @ [447:69] ==> val container: ClassDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'staticScope' @ [447:79] ==> public final val ClassDescriptor.staticScope: MemberScope[MyPropertyDescriptor]

'descriptor' @ [447:92] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'name' @ [447:103] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'FROM_IDE' @ [447:126] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'filterIsInstance' @ [448:30] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<SamAdapterDescriptor<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> SamAdapterDescriptor<*>

'firstOrNull' @ [449:30] ==> public inline fun <T> Iterable<SamAdapterDescriptor<*>>.firstOrNull(predicate: (SamAdapterDescriptor<*>) -> Boolean): SamAdapterDescriptor<*>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SamAdapterDescriptor<*>

'it' @ [449:44] ==> value-parameter it: SamAdapterDescriptor<*> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers.<anonymous>[ValueParameterDescriptorImpl]

'baseDescriptorForSynthetic' @ [449:47] ==> public abstract val baseDescriptorForSynthetic: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.load.java.sam.SamAdapterDescriptor[DeserializedPropertyDescriptor]

'original' @ [449:74] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'descriptor' @ [449:86] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'original' @ [449:97] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'let' @ [450:31] ==> @InlineOnly public inline fun <T, R> SamAdapterDescriptor<out (FunctionDescriptor..FunctionDescriptor?)>.let(block: (SamAdapterDescriptor<out (FunctionDescriptor..FunctionDescriptor?)>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SamAdapterDescriptor<out (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>
    <R> -> Unit

'invoke' @ [450:37] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [450:47] ==> value-parameter it: SamAdapterDescriptor<out (FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers.<anonymous>[ValueParameterDescriptorImpl]

'hashSetOf' @ [455:29] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'shortNamesCache' @ [456:9] ==> val shortNamesCache: (PsiShortNamesCache..PsiShortNamesCache?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'processAllFieldNames' @ [456:25] ==> public final fun processAllFieldNames(p0: (((String..String?)) -> Boolean..(((String..String?)) -> Boolean)?), p1: (GlobalSearchScope..GlobalSearchScope?), p2: (IdFilter..IdFilter?)): Boolean defined in com.intellij.psi.search.PsiShortNamesCache[MyFunctionDescriptor]

'invoke' @ [456:60] ==> public abstract operator fun invoke(p1: String): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'name' @ [456:71] ==> value-parameter name: (String..String?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers.<anonymous>[ValueParameterDescriptorImpl]

'allFieldNames' @ [456:78] ==> val allFieldNames: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'add' @ [456:92] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [456:96] ==> value-parameter name: (String..String?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers.<anonymous>[ValueParameterDescriptorImpl]

'scopeWithoutKotlin' @ [456:111] ==> private final val scopeWithoutKotlin: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'idFilter' @ [456:131] ==> val idFilter: (IdFilter..IdFilter?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'allFieldNames' @ [457:22] ==> val allFieldNames: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'checkCanceled' @ [458:29] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'shortNamesCache' @ [460:27] ==> val shortNamesCache: (PsiShortNamesCache..PsiShortNamesCache?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'getFieldsByName' @ [460:43] ==> @NotNull public abstract fun getFieldsByName(@NotNull @NonNls p0: String, @NotNull p1: GlobalSearchScope): (Array<(PsiField..PsiField?)>..Array<out (PsiField..PsiField?)>) defined in com.intellij.psi.search.PsiShortNamesCache[JavaMethodDescriptor]

'name' @ [460:59] ==> val name: String defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'scopeWithoutKotlin' @ [460:65] ==> private final val scopeWithoutKotlin: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'filterNot' @ [460:85] ==> public inline fun <T> Array<out (PsiField..PsiField?)>.filterNot(predicate: ((PsiField..PsiField?)) -> Boolean): List<(PsiField..PsiField?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiField..com.intellij.psi.PsiField?)

'it' @ [460:97] ==> value-parameter it: (PsiField..PsiField?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [461:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'field' @ [461:22] ==> val field: (PsiField..PsiField?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'hasModifierProperty' @ [461:28] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiField[JavaMethodDescriptor]

'STATIC' @ [461:60] ==> public const final val STATIC: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'filterOutPrivate' @ [462:21] ==> private final val filterOutPrivate: Boolean defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'field' @ [462:41] ==> val field: (PsiField..PsiField?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'hasModifierProperty' @ [462:47] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiField[JavaMethodDescriptor]

'PRIVATE' @ [462:79] ==> public const final val PRIVATE: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'field' @ [463:34] ==> val field: (PsiField..PsiField?) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'getJavaFieldDescriptor' @ [463:40] ==> @JvmOverloads public fun PsiField.getJavaFieldDescriptor(resolutionFacade: ResolutionFacade? = ...): PropertyDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve in file JavaResolveExtension.kt[SimpleFunctionDescriptorImpl]

'descriptorKindFilter' @ [464:21] ==> value-parameter descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[ValueParameterDescriptorImpl]

'accepts' @ [464:42] ==> public final fun accepts(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [464:50] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'invoke' @ [464:65] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'descriptor' @ [464:82] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'invoke' @ [465:21] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'descriptor' @ [465:31] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.processJavaStaticMembers[LocalVariableDescriptor]

'resolveToDescriptorsWithHack' @ [472:16] ==> private final fun KtNamedDeclaration.resolveToDescriptorsWithHack(psiFilter: (KtDeclaration) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[SimpleFunctionDescriptorImpl]

'filterIsInstance' @ [472:55] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<TDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> TDescriptor

'if (containingKtFile.isCompiled) { //TODO: it's temporary while resolveToDescriptor does not work for compiled declarations
            return resolutionFacade.resolveImportReference(moduleDescriptor, fqName!!)
        }
        else {
            val translatedDeclaration = declarationTranslator(this) ?: return emptyList()
            if (!psiFilter(translatedDeclaration)) return emptyList()

            return listOfNotNull(resolutionFacade.resolveToDescriptor(translatedDeclaration))
        }' @ [477:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'containingKtFile' @ [477:13] ==> public final val KtNamedDeclaration.containingKtFile: KtFile[MyPropertyDescriptor]

'isCompiled' @ [477:30] ==> public final val KtFile.isCompiled: Boolean[MyPropertyDescriptor]

'resolutionFacade' @ [478:20] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'resolveImportReference' @ [478:37] ==> public fun ResolutionFacade.resolveImportReference(moduleDescriptor: ModuleDescriptor, fqName: FqName): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'moduleDescriptor' @ [478:60] ==> private final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'fqName' @ [478:78] ==> public final val KtNamedDeclaration.fqName: FqName?[MyPropertyDescriptor]

'invoke' @ [481:41] ==> public abstract operator fun invoke(p1: KtDeclaration): KtDeclaration? defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [481:63] ==> <this> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.resolveToDescriptorsWithHack[ReceiverParameterDescriptorImpl]

'emptyList' @ [481:79] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'!' @ [482:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [482:18] ==> public abstract operator fun invoke(p1: KtDeclaration): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'translatedDeclaration' @ [482:28] ==> val translatedDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.resolveToDescriptorsWithHack[LocalVariableDescriptor]

'emptyList' @ [482:59] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'listOfNotNull' @ [484:20] ==> public fun <T : Any> listOfNotNull(element: DeclarationDescriptor?): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> DeclarationDescriptor

'resolutionFacade' @ [484:34] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[PropertyDescriptorImpl]

'resolveToDescriptor' @ [484:51] ==> public abstract fun resolveToDescriptor(declaration: KtDeclaration, bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'translatedDeclaration' @ [484:71] ==> val translatedDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper.resolveToDescriptorsWithHack[LocalVariableDescriptor]

