'sourceClass' @ [55:28] ==> public final val sourceClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'getResolutionFacade' @ [55:40] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [57:30] ==> public final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'analyzeFullyAndGetResult' @ [57:47] ==> public abstract fun analyzeFullyAndGetResult(elements: Collection<KtElement>): AnalysisResult defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'listOf' @ [57:72] ==> public fun <T> listOf(element: KtClass): List<KtClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClass

'sourceClass' @ [57:79] ==> public final val sourceClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'bindingContext' @ [57:93] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'sourceClassContext' @ [59:33] ==> public final val sourceClassContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'DECLARATION_TO_DESCRIPTOR' @ [59:67] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'sourceClass' @ [59:94] ==> public final val sourceClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'membersToMove' @ [61:29] ==> public final val membersToMove: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'map' @ [62:14] ==> public inline fun <T, R> Iterable<KotlinMemberInfo>.map(transform: (KotlinMemberInfo) -> (KtNamedDeclaration..KtNamedDeclaration?)): List<(KtNamedDeclaration..KtNamedDeclaration?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinMemberInfo
    <R> -> (org.jetbrains.kotlin.psi.KtNamedDeclaration..org.jetbrains.kotlin.psi.KtNamedDeclaration?)

'it' @ [62:20] ==> value-parameter it: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext.memberDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'member' @ [62:23] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'keysToMap' @ [63:14] ==> public fun <K, V> Iterable<(KtNamedDeclaration..KtNamedDeclaration?)>.keysToMap(value: ((KtNamedDeclaration..KtNamedDeclaration?)) -> DeclarationDescriptor): Map<(KtNamedDeclaration..KtNamedDeclaration?), DeclarationDescriptor> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtNamedDeclaration..org.jetbrains.kotlin.psi.KtNamedDeclaration?)
    <V> -> DeclarationDescriptor

'when (it) {
                    is KtPsiClassWrapper -> it.psiClass.getJavaClassDescriptor(resolutionFacade)!!
                    else -> sourceClassContext[BindingContext.DECLARATION_TO_DESCRIPTOR, it]!!
                }' @ [64:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor, entry1: DeclarationDescriptor): DeclarationDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor

'it' @ [64:23] ==> value-parameter it: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext.memberDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [65:45] ==> value-parameter it: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext.memberDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'psiClass' @ [65:48] ==> public abstract val psiClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KtPsiClassWrapper[PropertyDescriptorImpl]

'getJavaClassDescriptor' @ [65:57] ==> @JvmOverloads public fun PsiClass.getJavaClassDescriptor(resolutionFacade: ResolutionFacade? = ...): ClassDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [65:80] ==> public final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'sourceClassContext' @ [66:29] ==> public final val sourceClassContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'DECLARATION_TO_DESCRIPTOR' @ [66:63] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [66:90] ==> value-parameter it: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext.memberDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'BaseRefactoringProcessor' @ [75:5] ==> protected/*protected and package*/ constructor BaseRefactoringProcessor(@NotNull p0: Project) defined in com.intellij.refactoring.BaseRefactoringProcessor[JavaClassConstructorDescriptor]

'project' @ [75:30] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.<init>[ValueParameterDescriptorImpl]

'KotlinPushDownContext' @ [76:27] ==> public constructor KotlinPushDownContext(sourceClass: KtClass, membersToMove: List<KotlinMemberInfo>) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[ClassConstructorDescriptorImpl]

'sourceClass' @ [76:49] ==> value-parameter sourceClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.<init>[ValueParameterDescriptorImpl]

'membersToMove' @ [76:62] ==> value-parameter membersToMove: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.<init>[ValueParameterDescriptorImpl]

'message' @ [79:71] ==> public open fun message(@PropertyKey p0: (String..String?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'arrayOf' @ [81:38] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KtClass): Array<KtClass> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KtClass

'context' @ [81:46] ==> private final val context: KotlinPushDownContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[PropertyDescriptorImpl]

'sourceClass' @ [81:54] ==> public final val sourceClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'message' @ [84:35] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'getReferencesString' @ [84:94] ==> public open fun getReferencesString(p0: Int, p1: Int): (String..String?) defined in com.intellij.usageView.UsageViewBundle[JavaMethodDescriptor]

'usagesCount' @ [84:114] ==> value-parameter usagesCount: Int defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.UsageViewDescriptorImpl.getCodeReferencesText[ValueParameterDescriptorImpl]

'filesCount' @ [84:127] ==> value-parameter filesCount: Int defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.UsageViewDescriptorImpl.getCodeReferencesText[ValueParameterDescriptorImpl]

'UsageInfo' @ [89:48] ==> public constructor UsageInfo(@NotNull p0: PsiElement) defined in com.intellij.usageView.UsageInfo[JavaClassConstructorDescriptor]

'element' @ [89:58] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.SubclassUsage.<init>[ValueParameterDescriptorImpl]

'PUSH_MEMBERS_DOWN' @ [91:37] ==> public val PUSH_MEMBERS_DOWN: String defined in org.jetbrains.kotlin.idea.refactoring.pushDown in file KotlinPushDownHandler.kt[PropertyDescriptorImpl]

'UsageViewDescriptorImpl' @ [93:76] ==> public constructor UsageViewDescriptorImpl() defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.UsageViewDescriptorImpl[ClassConstructorDescriptorImpl]

'RefactoringEventData' @ [95:36] ==> public constructor RefactoringEventData() defined in com.intellij.refactoring.listeners.RefactoringEventData[JavaClassConstructorDescriptor]

'apply' @ [95:59] ==> @InlineOnly public inline fun <T> RefactoringEventData.apply(block: RefactoringEventData.() -> Unit): RefactoringEventData defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RefactoringEventData

'addElement' @ [96:9] ==> public open fun addElement(p0: (PsiElement..PsiElement?)): Unit defined in com.intellij.refactoring.listeners.RefactoringEventData[JavaMethodDescriptor]

'context' @ [96:20] ==> private final val context: KotlinPushDownContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[PropertyDescriptorImpl]

'sourceClass' @ [96:28] ==> public final val sourceClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'addElements' @ [97:9] ==> public open fun addElements(p0: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>?)): Unit defined in com.intellij.refactoring.listeners.RefactoringEventData[JavaMethodDescriptor]

'context' @ [97:21] ==> private final val context: KotlinPushDownContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[PropertyDescriptorImpl]

'membersToMove' @ [97:29] ==> public final val membersToMove: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'map' @ [97:43] ==> public inline fun <T, R> Iterable<KotlinMemberInfo>.map(transform: (KotlinMemberInfo) -> (KtNamedDeclaration..KtNamedDeclaration?)): List<(KtNamedDeclaration..KtNamedDeclaration?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinMemberInfo
    <R> -> (org.jetbrains.kotlin.psi.KtNamedDeclaration..org.jetbrains.kotlin.psi.KtNamedDeclaration?)

'it' @ [97:49] ==> value-parameter it: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.getBeforeData.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'member' @ [97:52] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'toTypedArray' @ [97:61] ==> public inline fun <reified T> Collection<(KtNamedDeclaration..KtNamedDeclaration?)>.toTypedArray(): Array<(KtNamedDeclaration..KtNamedDeclaration?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (org.jetbrains.kotlin.psi.KtNamedDeclaration..org.jetbrains.kotlin.psi.KtNamedDeclaration?)

'RefactoringEventData' @ [100:63] ==> public constructor RefactoringEventData() defined in com.intellij.refactoring.listeners.RefactoringEventData[JavaClassConstructorDescriptor]

'apply' @ [100:86] ==> @InlineOnly public inline fun <T> RefactoringEventData.apply(block: RefactoringEventData.() -> Unit): RefactoringEventData defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RefactoringEventData

'addElements' @ [101:9] ==> public open fun addElements(p0: (MutableCollection<(PsiElement..PsiElement?)>..Collection<(PsiElement..PsiElement?)>?)): Unit defined in com.intellij.refactoring.listeners.RefactoringEventData[JavaMethodDescriptor]

'usages' @ [101:21] ==> value-parameter usages: Array<out UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.getAfterData[ValueParameterDescriptorImpl]

'mapNotNull' @ [101:28] ==> public inline fun <T, R : Any> Array<out UsageInfo>.mapNotNull(transform: (UsageInfo) -> KtClassOrObject?): List<KtClassOrObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo
    <R : Any> -> KtClassOrObject

'it' @ [101:41] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.getAfterData.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [101:44] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'HierarchySearchRequest' @ [105:16] ==> public constructor HierarchySearchRequest<T : PsiElement>(originalElement: KtClass, searchScope: SearchScope, searchDeeply: Boolean = ...) defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : PsiElement> -> KtClass

'context' @ [105:39] ==> private final val context: KotlinPushDownContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[PropertyDescriptorImpl]

'sourceClass' @ [105:47] ==> public final val sourceClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'context' @ [105:60] ==> private final val context: KotlinPushDownContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[PropertyDescriptorImpl]

'sourceClass' @ [105:68] ==> public final val sourceClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'useScope' @ [105:80] ==> public final val KtClass.useScope: SearchScope[MyPropertyDescriptor]

'searchInheritors' @ [106:18] ==> public fun HierarchySearchRequest<*>.searchInheritors(): Query<PsiClass> defined in org.jetbrains.kotlin.idea.search.declarationsSearch[DeserializedSimpleFunctionDescriptor]

'mapNotNull' @ [107:18] ==> public inline fun <T, R : Any> Iterable<(PsiClass..PsiClass?)>.mapNotNull(transform: ((PsiClass..PsiClass?)) -> PsiElement?): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)
    <R : Any> -> PsiElement

'it' @ [107:31] ==> value-parameter it: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.findUsages.<anonymous>[ValueParameterDescriptorImpl]

'unwrapped' @ [107:34] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'map' @ [108:18] ==> public inline fun <T, R> Iterable<PsiElement>.map(transform: (PsiElement) -> KotlinPushDownProcessor.SubclassUsage): List<KotlinPushDownProcessor.SubclassUsage> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> SubclassUsage

'toTypedArray' @ [109:18] ==> public inline fun <reified T> Collection<KotlinPushDownProcessor.SubclassUsage>.toTypedArray(): Array<KotlinPushDownProcessor.SubclassUsage> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> SubclassUsage

'refUsages' @ [113:22] ==> value-parameter refUsages: Ref<Array<UsageInfo>> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.preprocessUsages[ValueParameterDescriptorImpl]

'get' @ [113:32] ==> public final fun get(): (Array<UsageInfo>..Array<UsageInfo>?) defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'EMPTY_ARRAY' @ [113:51] ==> public final val EMPTY_ARRAY: (Array<(UsageInfo..UsageInfo?)>..Array<out (UsageInfo..UsageInfo?)>?) defined in com.intellij.usageView.UsageInfo[JavaPropertyDescriptor]

'usages' @ [114:13] ==> val usages: (Array<UsageInfo>..Array<out (UsageInfo..UsageInfo?)>?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.preprocessUsages[LocalVariableDescriptor]

'isEmpty' @ [114:20] ==> @InlineOnly public inline fun <T> Array<out UsageInfo>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'+' @ [115:27] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'context' @ [115:30] ==> private final val context: KotlinPushDownContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[PropertyDescriptorImpl]

'sourceClassDescriptor' @ [115:38] ==> public final val sourceClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'renderForConflicts' @ [115:60] ==> public fun DeclarationDescriptor.renderForConflicts(): String defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpConflictsUtils.kt[SimpleFunctionDescriptorImpl]

'showYesNoDialog' @ [117:35] ==> @Messages.YesNoResult public open fun showYesNoDialog(p0: (String..String?), @NotNull @Nls p1: String, @Nullable p2: Icon?): Int defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'message' @ [117:51] ==> val message: String defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.preprocessUsages[LocalVariableDescriptor]

'capitalize' @ [117:59] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'PUSH_MEMBERS_DOWN' @ [117:73] ==> public val PUSH_MEMBERS_DOWN: String defined in org.jetbrains.kotlin.idea.refactoring.pushDown in file KotlinPushDownHandler.kt[PropertyDescriptorImpl]

'getWarningIcon' @ [117:101] ==> @NotNull public open fun getWarningIcon(): Icon defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'answer' @ [118:17] ==> val answer: Int defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.preprocessUsages[LocalVariableDescriptor]

'NO' @ [118:36] ==> public const final val NO: Int defined in com.intellij.openapi.ui.Messages[JavaPropertyDescriptor]

'myProject' @ [121:25] ==> @NotNull protected/*protected and package*/ final val myProject: Project defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[JavaPropertyDescriptor]

'runSynchronouslyWithProgress' @ [121:35] ==> public fun <T : Any> Project.runSynchronouslyWithProgress(progressTitle: String, canBeCanceled: Boolean, action: () -> MultiMap<PsiElement, String>): MultiMap<PsiElement, String>? defined in org.jetbrains.kotlin.idea[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> MultiMap<PsiElement, String>

'message' @ [121:82] ==> public open fun message(@PropertyKey p0: (String..String?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'runReadAction' @ [122:13] ==> public fun <T> runReadAction(action: () -> MultiMap<PsiElement, String>): MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MultiMap<PsiElement, String>

'analyzePushDownConflicts' @ [122:29] ==> public fun analyzePushDownConflicts(context: KotlinPushDownContext, usages: Array<out UsageInfo>): MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.pushDown[SimpleFunctionDescriptorImpl]

'context' @ [122:54] ==> private final val context: KotlinPushDownContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[PropertyDescriptorImpl]

'usages' @ [122:63] ==> val usages: (Array<UsageInfo>..Array<out (UsageInfo..UsageInfo?)>?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.preprocessUsages[LocalVariableDescriptor]

'showConflicts' @ [125:16] ==> protected/*protected and package*/ open fun showConflicts(@NotNull p0: MultiMap<(PsiElement..PsiElement?), (String..String?)>, @Nullable p1: (Array<(UsageInfo..UsageInfo?)>?..Array<out (UsageInfo..UsageInfo?)>?)): Boolean defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[JavaMethodDescriptor]

'conflicts' @ [125:30] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.preprocessUsages[LocalVariableDescriptor]

'usages' @ [125:41] ==> val usages: (Array<UsageInfo>..Array<out (UsageInfo..UsageInfo?)>?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.preprocessUsages[LocalVariableDescriptor]

'context' @ [129:37] ==> private final val context: KotlinPushDownContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[PropertyDescriptorImpl]

'resolutionFacade' @ [129:45] ==> public final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'resolveToDescriptor' @ [129:62] ==> public abstract fun resolveToDescriptor(declaration: KtDeclaration, bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'targetClass' @ [129:82] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.pushDownToClass[ValueParameterDescriptorImpl]

'getTypeSubstitutor' @ [130:27] ==> public fun getTypeSubstitutor(baseType: KotlinType, derivedType: KotlinType): TypeSubstitutor? defined in org.jetbrains.kotlin.types.substitutions[DeserializedSimpleFunctionDescriptor]

'context' @ [130:46] ==> private final val context: KotlinPushDownContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[PropertyDescriptorImpl]

'sourceClassDescriptor' @ [130:54] ==> public final val sourceClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'defaultType' @ [130:76] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'targetClassDescriptor' @ [130:89] ==> val targetClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.pushDownToClass[LocalVariableDescriptor]

'defaultType' @ [130:111] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'EMPTY' @ [131:46] ==> public final val EMPTY: (TypeSubstitutor..TypeSubstitutor?) defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaPropertyDescriptor]

'context' @ [132:37] ==> private final val context: KotlinPushDownContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[PropertyDescriptorImpl]

'membersToMove' @ [132:45] ==> public final val membersToMove: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'memberInfo' @ [133:26] ==> val memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.pushDownToClass[LocalVariableDescriptor]

'member' @ [133:37] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'context' @ [134:36] ==> private final val context: KotlinPushDownContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[PropertyDescriptorImpl]

'memberDescriptors' @ [134:44] ==> public final val memberDescriptors: Map<(KtNamedDeclaration..KtNamedDeclaration?), DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'member' @ [134:62] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.pushDownToClass[LocalVariableDescriptor]

'when (member) {
                is KtProperty, is KtNamedFunction -> {
                    memberDescriptor as CallableMemberDescriptor

                    moveCallableMemberToClass(
                            member as KtCallableDeclaration,
                            memberDescriptor,
                            targetClass,
                            targetClassDescriptor,
                            substitutor,
                            memberInfo.isToAbstract
                    )
                }

                is KtClassOrObject, is KtPsiClassWrapper -> {
                    if (memberInfo.overrides != null) {
                        context.sourceClass.getSuperTypeEntryByDescriptor(
                                memberDescriptor as ClassDescriptor,
                                context.sourceClassContext
                        )?.let {
                            addSuperTypeEntry(it, targetClass, targetClassDescriptor, context.sourceClassContext, substitutor)
                        }
                        continue@members
                    }
                    else {
                        addMemberToTarget(member, targetClass)
                    }
                }

                else -> continue@members
            }' @ [136:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtNamedDeclaration, entry1: KtNamedDeclaration, entry2: KtNamedDeclaration): KtNamedDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtNamedDeclaration

'member' @ [136:37] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.pushDownToClass[LocalVariableDescriptor]

'memberDescriptor' @ [138:21] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.pushDownToClass[LocalVariableDescriptor]

'moveCallableMemberToClass' @ [140:21] ==> internal fun moveCallableMemberToClass(member: KtCallableDeclaration, memberDescriptor: CallableMemberDescriptor, targetClass: KtClassOrObject, targetClassDescriptor: ClassDescriptor, substitutor: TypeSubstitutor, makeAbstract: Boolean): KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pushDown in file pushDownImpl.kt[SimpleFunctionDescriptorImpl]

'member' @ [141:29] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.pushDownToClass[LocalVariableDescriptor]

'memberDescriptor' @ [142:29] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.pushDownToClass[LocalVariableDescriptor]

'targetClass' @ [143:29] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.pushDownToClass[ValueParameterDescriptorImpl]

'targetClassDescriptor' @ [144:29] ==> val targetClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.pushDownToClass[LocalVariableDescriptor]

'substitutor' @ [145:29] ==> val substitutor: (TypeSubstitutor..TypeSubstitutor?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.pushDownToClass[LocalVariableDescriptor]

'memberInfo' @ [146:29] ==> val memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.pushDownToClass[LocalVariableDescriptor]

'isToAbstract' @ [146:40] ==> public final var KotlinMemberInfo.isToAbstract: Boolean[MyPropertyDescriptor]

'if (memberInfo.overrides != null) {
                        context.sourceClass.getSuperTypeEntryByDescriptor(
                                memberDescriptor as ClassDescriptor,
                                context.sourceClassContext
                        )?.let {
                            addSuperTypeEntry(it, targetClass, targetClassDescriptor, context.sourceClassContext, substitutor)
                        }
                        continue@members
                    }
                    else {
                        addMemberToTarget(member, targetClass)
                    }' @ [151:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtNamedDeclaration, elseBranch: KtNamedDeclaration): KtNamedDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtNamedDeclaration

'memberInfo' @ [151:25] ==> val memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.pushDownToClass[LocalVariableDescriptor]

'overrides' @ [151:36] ==> public final val KotlinMemberInfo.overrides: (Boolean..Boolean?)[MyPropertyDescriptor]

'context' @ [152:25] ==> private final val context: KotlinPushDownContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[PropertyDescriptorImpl]

'sourceClass' @ [152:33] ==> public final val sourceClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'getSuperTypeEntryByDescriptor' @ [152:45] ==> public fun KtClassOrObject.getSuperTypeEntryByDescriptor(descriptor: ClassDescriptor, context: BindingContext): KtSuperTypeListEntry? defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'memberDescriptor' @ [153:33] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.pushDownToClass[LocalVariableDescriptor]

'context' @ [154:33] ==> private final val context: KotlinPushDownContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[PropertyDescriptorImpl]

'sourceClassContext' @ [154:41] ==> public final val sourceClassContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'let' @ [155:28] ==> @InlineOnly public inline fun <T, R> KtSuperTypeListEntry.let(block: (KtSuperTypeListEntry) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSuperTypeListEntry
    <R> -> Unit

'addSuperTypeEntry' @ [156:29] ==> public fun addSuperTypeEntry(delegator: KtSuperTypeListEntry, targetClass: KtClassOrObject, targetClassDescriptor: ClassDescriptor, context: BindingContext, substitutor: TypeSubstitutor): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [156:47] ==> value-parameter it: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.pushDownToClass.<anonymous>[ValueParameterDescriptorImpl]

'targetClass' @ [156:51] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.pushDownToClass[ValueParameterDescriptorImpl]

'targetClassDescriptor' @ [156:64] ==> val targetClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.pushDownToClass[LocalVariableDescriptor]

'context' @ [156:87] ==> private final val context: KotlinPushDownContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[PropertyDescriptorImpl]

'sourceClassContext' @ [156:95] ==> public final val sourceClassContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'substitutor' @ [156:115] ==> val substitutor: (TypeSubstitutor..TypeSubstitutor?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.pushDownToClass[LocalVariableDescriptor]

'addMemberToTarget' @ [161:25] ==> public fun addMemberToTarget(targetMember: KtNamedDeclaration, targetClass: KtClassOrObject): KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'member' @ [161:43] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.pushDownToClass[LocalVariableDescriptor]

'targetClass' @ [161:51] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.pushDownToClass[ValueParameterDescriptorImpl]

'applyMarking' @ [167:13] ==> public fun applyMarking(declaration: KtNamedDeclaration, substitutor: TypeSubstitutor, targetClassDescriptor: ClassDescriptor): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file markingUtils.kt[SimpleFunctionDescriptorImpl]

'movedMember' @ [167:26] ==> val movedMember: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.pushDownToClass[LocalVariableDescriptor]

'substitutor' @ [167:39] ==> val substitutor: (TypeSubstitutor..TypeSubstitutor?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.pushDownToClass[LocalVariableDescriptor]

'targetClassDescriptor' @ [167:52] ==> val targetClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.pushDownToClass[LocalVariableDescriptor]

'context' @ [172:28] ==> private final val context: KotlinPushDownContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[PropertyDescriptorImpl]

'membersToMove' @ [172:36] ==> public final val membersToMove: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'memberInfo' @ [173:26] ==> val memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.removeOriginalMembers[LocalVariableDescriptor]

'member' @ [173:37] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'context' @ [174:36] ==> private final val context: KotlinPushDownContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[PropertyDescriptorImpl]

'memberDescriptors' @ [174:44] ==> public final val memberDescriptors: Map<(KtNamedDeclaration..KtNamedDeclaration?), DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'member' @ [174:62] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.removeOriginalMembers[LocalVariableDescriptor]

'when (member) {
                is KtProperty, is KtNamedFunction -> {
                    member as KtCallableDeclaration
                    memberDescriptor as CallableMemberDescriptor

                    if (memberDescriptor.modality != Modality.ABSTRACT && memberInfo.isToAbstract) {
                        if (member.hasModifier(KtTokens.PRIVATE_KEYWORD)) {
                            member.addModifier(KtTokens.PROTECTED_KEYWORD)
                        }
                        makeAbstract(member, memberDescriptor, TypeSubstitutor.EMPTY, context.sourceClass)
                        member.typeReference?.addToShorteningWaitSet()
                    }
                    else {
                        member.delete()
                    }
                }
                is KtClassOrObject, is KtPsiClassWrapper -> {
                    if (memberInfo.overrides != null) {
                        context.sourceClass.getSuperTypeEntryByDescriptor(
                                memberDescriptor as ClassDescriptor,
                                context.sourceClassContext
                        )?.let {
                            context.sourceClass.removeSuperTypeListEntry(it)
                        }
                    }
                    else {
                        member.delete()
                    }
                }
            }' @ [175:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit?, entry1: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit?

'member' @ [175:19] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.removeOriginalMembers[LocalVariableDescriptor]

'member' @ [177:21] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.removeOriginalMembers[LocalVariableDescriptor]

'memberDescriptor' @ [178:21] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.removeOriginalMembers[LocalVariableDescriptor]

'if (memberDescriptor.modality != Modality.ABSTRACT && memberInfo.isToAbstract) {
                        if (member.hasModifier(KtTokens.PRIVATE_KEYWORD)) {
                            member.addModifier(KtTokens.PROTECTED_KEYWORD)
                        }
                        makeAbstract(member, memberDescriptor, TypeSubstitutor.EMPTY, context.sourceClass)
                        member.typeReference?.addToShorteningWaitSet()
                    }
                    else {
                        member.delete()
                    }' @ [180:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'memberDescriptor' @ [180:25] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.removeOriginalMembers[LocalVariableDescriptor]

'modality' @ [180:42] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [180:54] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [180:63] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'memberInfo' @ [180:75] ==> val memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.removeOriginalMembers[LocalVariableDescriptor]

'isToAbstract' @ [180:86] ==> public final var KotlinMemberInfo.isToAbstract: Boolean[MyPropertyDescriptor]

'member' @ [181:29] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.removeOriginalMembers[LocalVariableDescriptor]

'hasModifier' @ [181:36] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'PRIVATE_KEYWORD' @ [181:57] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'member' @ [182:29] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.removeOriginalMembers[LocalVariableDescriptor]

'addModifier' @ [182:36] ==> public abstract fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'PROTECTED_KEYWORD' @ [182:57] ==> public final val PROTECTED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'makeAbstract' @ [184:25] ==> public fun makeAbstract(member: KtCallableDeclaration, originalMemberDescriptor: CallableMemberDescriptor, substitutor: TypeSubstitutor, targetClass: KtClass): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'member' @ [184:38] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.removeOriginalMembers[LocalVariableDescriptor]

'memberDescriptor' @ [184:46] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.removeOriginalMembers[LocalVariableDescriptor]

'EMPTY' @ [184:80] ==> public final val EMPTY: (TypeSubstitutor..TypeSubstitutor?) defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaPropertyDescriptor]

'context' @ [184:87] ==> private final val context: KotlinPushDownContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[PropertyDescriptorImpl]

'sourceClass' @ [184:95] ==> public final val sourceClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'member' @ [185:25] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.removeOriginalMembers[LocalVariableDescriptor]

'typeReference' @ [185:32] ==> public final var KtCallableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'addToShorteningWaitSet' @ [185:47] ==> public fun KtElement.addToShorteningWaitSet(options: ShortenReferences.Options = ...): Unit defined in org.jetbrains.kotlin.idea.codeInsight.shorten[DeserializedSimpleFunctionDescriptor]

'member' @ [188:25] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.removeOriginalMembers[LocalVariableDescriptor]

'delete' @ [188:32] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'if (memberInfo.overrides != null) {
                        context.sourceClass.getSuperTypeEntryByDescriptor(
                                memberDescriptor as ClassDescriptor,
                                context.sourceClassContext
                        )?.let {
                            context.sourceClass.removeSuperTypeListEntry(it)
                        }
                    }
                    else {
                        member.delete()
                    }' @ [192:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'memberInfo' @ [192:25] ==> val memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.removeOriginalMembers[LocalVariableDescriptor]

'overrides' @ [192:36] ==> public final val KotlinMemberInfo.overrides: (Boolean..Boolean?)[MyPropertyDescriptor]

'context' @ [193:25] ==> private final val context: KotlinPushDownContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[PropertyDescriptorImpl]

'sourceClass' @ [193:33] ==> public final val sourceClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'getSuperTypeEntryByDescriptor' @ [193:45] ==> public fun KtClassOrObject.getSuperTypeEntryByDescriptor(descriptor: ClassDescriptor, context: BindingContext): KtSuperTypeListEntry? defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'memberDescriptor' @ [194:33] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.removeOriginalMembers[LocalVariableDescriptor]

'context' @ [195:33] ==> private final val context: KotlinPushDownContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[PropertyDescriptorImpl]

'sourceClassContext' @ [195:41] ==> public final val sourceClassContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'let' @ [196:28] ==> @InlineOnly public inline fun <T, R> KtSuperTypeListEntry.let(block: (KtSuperTypeListEntry) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSuperTypeListEntry
    <R> -> Unit

'context' @ [197:29] ==> private final val context: KotlinPushDownContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[PropertyDescriptorImpl]

'sourceClass' @ [197:37] ==> public final val sourceClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'removeSuperTypeListEntry' @ [197:49] ==> public final fun removeSuperTypeListEntry(superTypeListEntry: KtSuperTypeListEntry): Unit defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'it' @ [197:74] ==> value-parameter it: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.removeOriginalMembers.<anonymous>[ValueParameterDescriptorImpl]

'member' @ [201:25] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.removeOriginalMembers[LocalVariableDescriptor]

'delete' @ [201:32] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'ArrayList' @ [209:30] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtElement

'context' @ [211:13] ==> private final val context: KotlinPushDownContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[PropertyDescriptorImpl]

'membersToMove' @ [211:21] ==> public final val membersToMove: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'forEach' @ [211:35] ==> @HidesMembers public inline fun <T> Iterable<KotlinMemberInfo>.forEach(action: (KotlinMemberInfo) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinMemberInfo

'markedElements' @ [212:17] ==> val markedElements: ArrayList<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.performRefactoring[LocalVariableDescriptor]

'markElements' @ [212:35] ==> public fun markElements(declaration: KtNamedDeclaration, context: BindingContext, sourceClassDescriptor: ClassDescriptor, targetClassDescriptor: ClassDescriptor?): List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.pullUp[SimpleFunctionDescriptorImpl]

'it' @ [212:48] ==> value-parameter it: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.performRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'member' @ [212:51] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'context' @ [212:59] ==> private final val context: KotlinPushDownContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[PropertyDescriptorImpl]

'sourceClassContext' @ [212:67] ==> public final val sourceClassContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'context' @ [212:87] ==> private final val context: KotlinPushDownContext defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[PropertyDescriptorImpl]

'sourceClassDescriptor' @ [212:95] ==> public final val sourceClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownContext[PropertyDescriptorImpl]

'usages' @ [214:13] ==> value-parameter usages: Array<out UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.performRefactoring[ValueParameterDescriptorImpl]

'forEach' @ [214:20] ==> public inline fun <T> Array<out UsageInfo>.forEach(action: (UsageInfo) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'it' @ [214:31] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.performRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [214:34] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'let' @ [214:64] ==> @InlineOnly public inline fun <T, R> KtClassOrObject.let(block: (KtClassOrObject) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject
    <R> -> Unit

'pushDownToClass' @ [214:70] ==> private final fun pushDownToClass(targetClass: KtClassOrObject): Unit defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[SimpleFunctionDescriptorImpl]

'it' @ [214:86] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.performRefactoring.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'removeOriginalMembers' @ [215:13] ==> private final fun removeOriginalMembers(): Unit defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[SimpleFunctionDescriptorImpl]

'clearMarking' @ [218:13] ==> public fun clearMarking(markedElements: List<KtElement>): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp[SimpleFunctionDescriptorImpl]

'markedElements' @ [218:26] ==> val markedElements: ArrayList<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor.performRefactoring[LocalVariableDescriptor]

