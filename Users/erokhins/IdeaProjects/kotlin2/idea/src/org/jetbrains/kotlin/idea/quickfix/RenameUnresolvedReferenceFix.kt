'KotlinSingleIntentionActionFactory' @ [46:49] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [48:19] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceActionFactory.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [48:30] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'RenameUnresolvedReferenceFix' @ [49:16] ==> public constructor RenameUnresolvedReferenceFix(element: KtNameReferenceExpression) defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix[ClassConstructorDescriptorImpl]

'ref' @ [49:45] ==> val ref: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceActionFactory.createAction[LocalVariableDescriptor]

'KotlinQuickFixAction<KtNameReferenceExpression>' @ [53:73] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtNameReferenceExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtNameReferenceExpression

'element' @ [53:121] ==> value-parameter element: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.<init>[ValueParameterDescriptorImpl]

'Expression' @ [62:9] ==> public constructor Expression() defined in com.intellij.codeInsight.template.Expression[JavaClassConstructorDescriptor]

'sort' @ [64:20] ==> public open fun <T : (Any..Any?)> sort(p0: (Array<(LookupElement..LookupElement?)>..Array<out (LookupElement..LookupElement?)>?), p1: (Comparator<in (LookupElement..LookupElement?)>..Comparator<in (LookupElement..LookupElement?)>?)): Unit defined in java.util.Arrays[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.codeInsight.lookup.LookupElement..com.intellij.codeInsight.lookup.LookupElement?)

'items' @ [64:25] ==> private final val items: Array<out LookupElement> defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.ReferenceNameExpression[PropertyDescriptorImpl]

'HammingComparator' @ [64:32] ==> public constructor HammingComparator<T>(referenceString: String, asString: (LookupElement..LookupElement?).() -> String) defined in org.jetbrains.kotlin.idea.quickfix.HammingComparator[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> (com.intellij.codeInsight.lookup.LookupElement..com.intellij.codeInsight.lookup.LookupElement?)

'originalReferenceName' @ [64:50] ==> private final val originalReferenceName: String defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.ReferenceNameExpression[PropertyDescriptorImpl]

'lookupString' @ [64:75] ==> public final val LookupElement.lookupString: String[MyPropertyDescriptor]

'TextResult' @ [67:68] ==> public constructor TextResult(@NotNull p0: String) defined in com.intellij.codeInsight.template.TextResult[JavaClassConstructorDescriptor]

'items' @ [67:79] ==> private final val items: Array<out LookupElement> defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.ReferenceNameExpression[PropertyDescriptorImpl]

'firstOrNull' @ [67:85] ==> public fun <T> Array<out LookupElement>.firstOrNull(): LookupElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupElement

'lookupString' @ [67:100] ==> public final val LookupElement.lookupString: String[MyPropertyDescriptor]

'originalReferenceName' @ [67:116] ==> private final val originalReferenceName: String defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.ReferenceNameExpression[PropertyDescriptorImpl]

'if (items.size <= 1) null else items' @ [71:73] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Array<out LookupElement>?, elseBranch: Array<out LookupElement>?): Array<out LookupElement>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Array<out LookupElement>?

'items' @ [71:77] ==> private final val items: Array<out LookupElement> defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.ReferenceNameExpression[PropertyDescriptorImpl]

'size' @ [71:83] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'items' @ [71:104] ==> private final val items: Array<out LookupElement> defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.ReferenceNameExpression[PropertyDescriptorImpl]

'message' @ [74:45] ==> public open fun message(@NotNull @NonNls @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.codeInsight.daemon.QuickFixBundle[JavaMethodDescriptor]

'message' @ [76:51] ==> public open fun message(@NotNull @NonNls @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.codeInsight.daemon.QuickFixBundle[JavaMethodDescriptor]

'element' @ [79:23] ==> protected final val element: KtNameReferenceExpression? defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix[PropertyDescriptorImpl]

'super' @ [80:16] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [80:22] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[SimpleFunctionDescriptorImpl]

'project' @ [80:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [80:43] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [80:51] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [81:19] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.isAvailable[ValueParameterDescriptorImpl]

'element' @ [82:19] ==> val element: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.isAvailable[LocalVariableDescriptor]

'getStrictParentOfType' @ [82:27] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtTypeReference? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeReference

'element' @ [86:23] ==> protected final val element: KtNameReferenceExpression? defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix[PropertyDescriptorImpl]

'editor' @ [87:13] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[ValueParameterDescriptorImpl]

'element' @ [88:33] ==> val element: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'getQualifiedElement' @ [88:41] ==> public fun KtSimpleNameExpression.getQualifiedElement(): KtElement defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [90:28] ==> val element: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'getReferencedName' @ [90:36] ==> public open fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[DeserializedSimpleFunctionDescriptor]

'element' @ [91:25] ==> val element: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'parents' @ [91:33] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'firstOrNull' @ [91:41] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [91:55] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [91:86] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [91:111] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [92:24] ==> val element: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'isCallee' @ [92:32] ==> public fun KtSimpleNameExpression.isCallee(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'patternExpression' @ [93:27] ==> val patternExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'toRange' @ [93:45] ==> public fun PsiElement?.toRange(): KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching[DeserializedSimpleFunctionDescriptor]

'match' @ [94:18] ==> public open fun match(scope: PsiElement, unifier: KotlinPsiUnifier): List<UnificationResult.Matched> defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedSimpleFunctionDescriptor]

'container' @ [94:24] ==> val container: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'DEFAULT' @ [94:52] ==> public final val DEFAULT: KotlinPsiUnifier defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiUnifier.Companion[DeserializedPropertyDescriptor]

'mapNotNull' @ [95:18] ==> public inline fun <T, R : Any> Iterable<UnificationResult.Matched>.mapNotNull(transform: (UnificationResult.Matched) -> KtNameReferenceExpression?): List<KtNameReferenceExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Matched
    <R : Any> -> KtNameReferenceExpression

'it' @ [96:38] ==> value-parameter it: UnificationResult.Matched defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'range' @ [96:41] ==> public abstract val range: KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.UnificationResult.Matched[DeserializedPropertyDescriptor]

'elements' @ [96:47] ==> public abstract val elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedPropertyDescriptor]

'first' @ [96:56] ==> public fun <T> List<PsiElement>.first(): PsiElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'getQualifiedElementSelector' @ [96:83] ==> public fun KtElement.getQualifiedElementSelector(): KtElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'if (candidate != null && candidate.isCallee() == isCallee) candidate else null' @ [97:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtNameReferenceExpression?, elseBranch: KtNameReferenceExpression?): KtNameReferenceExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtNameReferenceExpression?

'candidate' @ [97:25] ==> val candidate: KtNameReferenceExpression? defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke.<anonymous>[LocalVariableDescriptor]

'candidate' @ [97:46] ==> val candidate: KtNameReferenceExpression? defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke.<anonymous>[LocalVariableDescriptor]

'isCallee' @ [97:56] ==> public fun KtSimpleNameExpression.isCallee(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'isCallee' @ [97:70] ==> val isCallee: Boolean defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'candidate' @ [97:80] ==> val candidate: KtNameReferenceExpression? defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke.<anonymous>[LocalVariableDescriptor]

'element' @ [100:32] ==> val element: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'getResolutionFacade' @ [100:40] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [101:23] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'analyze' @ [101:40] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'element' @ [101:48] ==> val element: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'PARTIAL' @ [101:73] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'resolutionFacade' @ [102:32] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'moduleDescriptor' @ [102:49] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'ReferenceVariantsHelper' @ [103:30] ==> public constructor ReferenceVariantsHelper(bindingContext: BindingContext, resolutionFacade: ResolutionFacade, moduleDescriptor: ModuleDescriptor, visibilityFilter: (DeclarationDescriptor) -> Boolean, notProperties: Set<FqNameUnsafe> = ...) defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[DeserializedClassConstructorDescriptor]

'context' @ [103:54] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'resolutionFacade' @ [103:63] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'moduleDescriptor' @ [103:81] ==> val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'it' @ [104:13] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [104:59] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'isVisible' @ [104:62] ==> public fun DeclarationDescriptorWithVisibility.isVisible(context: PsiElement, receiverExpression: KtExpression?, bindingContext: BindingContext, resolutionFacade: ResolutionFacade): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'element' @ [104:72] ==> val element: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'context' @ [104:87] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'resolutionFacade' @ [104:96] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'getNotProperties' @ [105:33] ==> public final fun getNotProperties(element: PsiElement): Set<FqNameUnsafe> defined in org.jetbrains.kotlin.idea.core.NotPropertiesService.Companion[DeserializedSimpleFunctionDescriptor]

'element' @ [105:50] ==> val element: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'patternExpression' @ [106:29] ==> val patternExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'guessTypes' @ [107:18] ==> public fun KtExpression.guessTypes(context: BindingContext, module: ModuleDescriptor, pseudocode: Pseudocode? = ..., coerceUnusedToUnit: Boolean = ..., allowErrorTypes: Boolean = ...): Array<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'context' @ [107:29] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'moduleDescriptor' @ [107:38] ==> val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'ifEmpty' @ [108:18] ==> public inline fun <T> Array<out KotlinType>.ifEmpty(body: () -> Array<out KotlinType>): Array<out KotlinType> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'arrayOf' @ [108:28] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: SimpleType): Array<SimpleType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> SimpleType

'moduleDescriptor' @ [108:36] ==> val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'builtIns' @ [108:53] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'nullableAnyType' @ [108:62] ==> public final val KotlinBuiltIns.nullableAnyType: SimpleType[MyPropertyDescriptor]

'if (isCallee) DescriptorKindFilter.FUNCTIONS else DescriptorKindFilter.VARIABLES' @ [109:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DescriptorKindFilter, elseBranch: DescriptorKindFilter): DescriptorKindFilter[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DescriptorKindFilter

'isCallee' @ [109:40] ==> val isCallee: Boolean defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'FUNCTIONS' @ [109:71] ==> @field:JvmField public final val FUNCTIONS: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'VARIABLES' @ [109:107] ==> @field:JvmField public final val VARIABLES: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'variantsHelper' @ [110:27] ==> val variantsHelper: ReferenceVariantsHelper defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'getReferenceVariants' @ [111:18] ==> public final fun getReferenceVariants(expression: KtSimpleNameExpression, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean, filterOutJavaGettersAndSetters: Boolean = ..., filterOutShadowed: Boolean = ..., excludeNonInitializedVariable: Boolean = ..., useReceiverType: KotlinType? = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[DeserializedSimpleFunctionDescriptor]

'element' @ [111:39] ==> val element: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'descriptorKindFilter' @ [111:48] ==> val descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'filter' @ [112:18] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'candidate' @ [113:21] ==> value-parameter candidate: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'expectedTypes' @ [113:57] ==> val expectedTypes: Array<out KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'any' @ [113:71] ==> public inline fun <T> Array<out KotlinType>.any(predicate: (KotlinType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'candidate' @ [113:77] ==> value-parameter candidate: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'returnType' @ [113:87] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'isSubtypeOf' @ [113:99] ==> public fun KotlinType.isSubtypeOf(superType: KotlinType): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [113:111] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'mapTo' @ [115:18] ==> public inline fun <T, R, C : MutableCollection<in String>> Iterable<DeclarationDescriptor>.mapTo(destination: LinkedHashSet<String> /* = LinkedHashSet<String> */, transform: (DeclarationDescriptor) -> String): LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> String
    <C : MutableCollection<in R>> -> LinkedHashSet<String>

'if (ApplicationManager.getApplication().isUnitTestMode) linkedSetOf() else linkedSetOf(originalName)' @ [115:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: LinkedHashSet<String> /* = LinkedHashSet<String> */, elseBranch: LinkedHashSet<String> /* = LinkedHashSet<String> */): LinkedHashSet<String> /* = LinkedHashSet<String> */[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> LinkedHashSet<String>

'getApplication' @ [115:47] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [115:64] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'linkedSetOf' @ [115:80] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'linkedSetOf' @ [115:99] ==> public fun <T> linkedSetOf(vararg elements: String): LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'originalName' @ [115:111] ==> val originalName: String defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'it' @ [116:21] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [116:24] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [116:29] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'map' @ [118:18] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> LookupElementBuilder): List<LookupElementBuilder> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> LookupElementBuilder

'create' @ [118:45] ==> @NotNull public open fun create(@NotNull p0: String): LookupElementBuilder defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'it' @ [118:52] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'toTypedArray' @ [119:18] ==> public inline fun <reified T> Collection<LookupElementBuilder>.toTypedArray(): Array<LookupElementBuilder> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> LookupElementBuilder

'ReferenceNameExpression' @ [120:30] ==> public constructor ReferenceNameExpression(items: Array<out LookupElement>, originalReferenceName: String) defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.ReferenceNameExpression[ClassConstructorDescriptorImpl]

'lookupItems' @ [120:54] ==> val lookupItems: Array<LookupElementBuilder> defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'originalName' @ [120:67] ==> val originalName: String defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'TemplateBuilderImpl' @ [122:23] ==> public constructor TemplateBuilderImpl(@NotNull p0: PsiElement) defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaClassConstructorDescriptor]

'container' @ [122:43] ==> val container: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'occurrences' @ [123:9] ==> val occurrences: List<KtNameReferenceExpression> defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'forEach' @ [123:21] ==> @HidesMembers public inline fun <T> Iterable<KtNameReferenceExpression>.forEach(action: (KtNameReferenceExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNameReferenceExpression

'if (it != element) {
                builder.replaceElement(it.getReferencedNameElement(), OTHER_VARIABLE_NAME, INPUT_VARIABLE_NAME, false)
            }
            else {
                builder.replaceElement(it.getReferencedNameElement(), INPUT_VARIABLE_NAME, nameExpression, true)
            }' @ [124:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'it' @ [124:17] ==> value-parameter it: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [124:23] ==> val element: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'builder' @ [125:17] ==> val builder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'replaceElement' @ [125:25] ==> public open fun replaceElement(p0: (PsiElement..PsiElement?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'it' @ [125:40] ==> value-parameter it: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'getReferencedNameElement' @ [125:43] ==> public open fun getReferencedNameElement(): PsiElement defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[DeserializedSimpleFunctionDescriptor]

'OTHER_VARIABLE_NAME' @ [125:71] ==> private final val OTHER_VARIABLE_NAME: String defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.Companion[PropertyDescriptorImpl]

'INPUT_VARIABLE_NAME' @ [125:92] ==> private final val INPUT_VARIABLE_NAME: String defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.Companion[PropertyDescriptorImpl]

'builder' @ [128:17] ==> val builder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'replaceElement' @ [128:25] ==> public open fun replaceElement(p0: (PsiElement..PsiElement?), p1: (String..String?), p2: (Expression..Expression?), p3: Boolean): Unit defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'it' @ [128:40] ==> value-parameter it: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'getReferencedNameElement' @ [128:43] ==> public open fun getReferencedNameElement(): PsiElement defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[DeserializedSimpleFunctionDescriptor]

'INPUT_VARIABLE_NAME' @ [128:71] ==> private final val INPUT_VARIABLE_NAME: String defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.Companion[PropertyDescriptorImpl]

'nameExpression' @ [128:92] ==> val nameExpression: RenameUnresolvedReferenceFix.ReferenceNameExpression defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'editor' @ [132:9] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[ValueParameterDescriptorImpl]

'caretModel' @ [132:16] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [132:27] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'container' @ [132:40] ==> val container: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'startOffset' @ [132:50] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'getInstance' @ [133:25] ==> public open fun getInstance(p0: (Project..Project?)): (TemplateManager..TemplateManager?) defined in com.intellij.codeInsight.template.TemplateManager[JavaMethodDescriptor]

'project' @ [133:37] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[ValueParameterDescriptorImpl]

'startTemplate' @ [133:46] ==> public abstract fun startTemplate(@NotNull p0: Editor, @NotNull p1: Template): Unit defined in com.intellij.codeInsight.template.TemplateManager[JavaMethodDescriptor]

'editor' @ [133:60] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[ValueParameterDescriptorImpl]

'builder' @ [133:68] ==> val builder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.quickfix.RenameUnresolvedReferenceFix.invoke[LocalVariableDescriptor]

'buildInlineTemplate' @ [133:76] ==> public open fun buildInlineTemplate(): (Template..Template?) defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'..' @ [139:17] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'min' @ [139:25] ==> public open fun min(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

's1' @ [139:29] ==> value-parameter s1: String defined in org.jetbrains.kotlin.idea.quickfix.HammingComparator.countDifference[ValueParameterDescriptorImpl]

'lastIndex' @ [139:32] ==> public val CharSequence.lastIndex: Int defined in kotlin.text[DeserializedPropertyDescriptor]

'referenceString' @ [139:43] ==> private final val referenceString: String defined in org.jetbrains.kotlin.idea.quickfix.HammingComparator[PropertyDescriptorImpl]

'lastIndex' @ [139:59] ==> public val CharSequence.lastIndex: Int defined in kotlin.text[DeserializedPropertyDescriptor]

'count' @ [139:71] ==> public inline fun <T> Iterable<Int>.count(predicate: (Int) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

's1' @ [139:79] ==> value-parameter s1: String defined in org.jetbrains.kotlin.idea.quickfix.HammingComparator.countDifference[ValueParameterDescriptorImpl]

'it' @ [139:82] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.quickfix.HammingComparator.countDifference.<anonymous>[ValueParameterDescriptorImpl]

'referenceString' @ [139:89] ==> private final val referenceString: String defined in org.jetbrains.kotlin.idea.quickfix.HammingComparator[PropertyDescriptorImpl]

'it' @ [139:105] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.quickfix.HammingComparator.countDifference.<anonymous>[ValueParameterDescriptorImpl]

'countDifference' @ [143:16] ==> private final fun countDifference(s1: String): Int defined in org.jetbrains.kotlin.idea.quickfix.HammingComparator[SimpleFunctionDescriptorImpl]

'lookupItem1' @ [143:32] ==> value-parameter lookupItem1: T defined in org.jetbrains.kotlin.idea.quickfix.HammingComparator.compare[ValueParameterDescriptorImpl]

'invoke' @ [143:44] ==> public abstract operator fun T.invoke(): String defined in kotlin.Function1[FunctionInvokeDescriptor]

'countDifference' @ [143:58] ==> private final fun countDifference(s1: String): Int defined in org.jetbrains.kotlin.idea.quickfix.HammingComparator[SimpleFunctionDescriptorImpl]

'lookupItem2' @ [143:74] ==> value-parameter lookupItem2: T defined in org.jetbrains.kotlin.idea.quickfix.HammingComparator.compare[ValueParameterDescriptorImpl]

'invoke' @ [143:86] ==> public abstract operator fun T.invoke(): String defined in kotlin.Function1[FunctionInvokeDescriptor]

