'KotlinQuickFixAction<KtNamedFunction>' @ [70:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtNamedFunction) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtNamedFunction

'element' @ [70:43] ==> value-parameter element: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.<init>[ValueParameterDescriptorImpl]

'if (addModifier) {
            "Add 'suspend' modifier to all functions in hierarchy"
        } else {
            "Remove 'suspend' modifier from all functions in hierarchy"
        }' @ [72:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'addModifier' @ [72:20] ==> private final val addModifier: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix[PropertyDescriptorImpl]

'familyName' @ [79:30] ==> public final val ChangeSuspendInHierarchyFix.familyName: String[MyPropertyDescriptor]

'LinkedHashSet' @ [84:22] ==> public final fun <E> <init>(): LinkedHashSet<KtNamedFunction> /* = LinkedHashSet<KtNamedFunction> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> KtNamedFunction

'getInstance' @ [86:49] ==> @NotNull public open fun getInstance(): ProgressManager defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'progressIndicator' @ [86:63] ==> public final val ProgressManager.progressIndicator: (ProgressIndicator..ProgressIndicator?)[MyPropertyDescriptor]

'element' @ [88:24] ==> protected final val element: KtNamedFunction? defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix[PropertyDescriptorImpl]

'emptySet' @ [88:42] ==> public fun <T> emptySet(): Set<KtNamedFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedFunction

'function' @ [89:34] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.findAllFunctionToProcess[LocalVariableDescriptor]

'resolveToDescriptor' @ [89:43] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'functionDescriptor' @ [91:39] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.findAllFunctionToProcess[LocalVariableDescriptor]

'findTopMostOverriddables' @ [91:58] ==> public final fun FunctionDescriptor.findTopMostOverriddables(): List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion[SimpleFunctionDescriptorImpl]

'baseFunctionDescriptors' @ [92:9] ==> val baseFunctionDescriptors: List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.findAllFunctionToProcess[LocalVariableDescriptor]

'forEach' @ [92:33] ==> @HidesMembers public inline fun <T> Iterable<FunctionDescriptor>.forEach(action: (FunctionDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'baseFunctionDescriptor' @ [93:39] ==> value-parameter baseFunctionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.findAllFunctionToProcess.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [93:62] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'DescriptorToSourceUtilsIde' @ [94:29] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [94:56] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [94:74] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.findAllFunctionToProcess[ValueParameterDescriptorImpl]

'baseClassDescriptor' @ [94:83] ==> val baseClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.findAllFunctionToProcess.<anonymous>[LocalVariableDescriptor]

'?:' @ [96:24] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'baseClass' @ [96:25] ==> val baseClass: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.findAllFunctionToProcess.<anonymous>[LocalVariableDescriptor]

'name' @ [96:57] ==> public final val PsiNamedElement.name: String?[MyPropertyDescriptor]

'progressIndicator' @ [97:13] ==> val progressIndicator: (ProgressIndicator..ProgressIndicator?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.findAllFunctionToProcess[LocalVariableDescriptor]

'text' @ [97:31] ==> public final var ProgressIndicator.text: (String..String?)[MyPropertyDescriptor]

'name' @ [97:58] ==> val name: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.findAllFunctionToProcess.<anonymous>[LocalVariableDescriptor]

'listOf' @ [98:27] ==> public fun <T> listOf(element: PsiElement): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'baseClass' @ [98:34] ==> val baseClass: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.findAllFunctionToProcess.<anonymous>[LocalVariableDescriptor]

'HierarchySearchRequest' @ [98:47] ==> public constructor HierarchySearchRequest<T : PsiElement>(originalElement: PsiElement, searchScope: SearchScope, searchDeeply: Boolean = ...) defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : PsiElement> -> PsiElement

'baseClass' @ [98:70] ==> val baseClass: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.findAllFunctionToProcess.<anonymous>[LocalVariableDescriptor]

'baseClass' @ [98:81] ==> val baseClass: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.findAllFunctionToProcess.<anonymous>[LocalVariableDescriptor]

'useScope' @ [98:91] ==> public final val PsiElement.useScope: SearchScope[MyPropertyDescriptor]

'searchInheritors' @ [98:101] ==> public fun HierarchySearchRequest<*>.searchInheritors(): Query<PsiClass> defined in org.jetbrains.kotlin.idea.search.declarationsSearch[DeserializedSimpleFunctionDescriptor]

'classes' @ [99:13] ==> val classes: List<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.findAllFunctionToProcess.<anonymous>[LocalVariableDescriptor]

'mapNotNullTo' @ [99:21] ==> public inline fun <T, R : Any, C : MutableCollection<in KtNamedFunction>> Iterable<(PsiElement..PsiElement?)>.mapNotNullTo(destination: LinkedHashSet<KtNamedFunction> /* = LinkedHashSet<KtNamedFunction> */, transform: ((PsiElement..PsiElement?)) -> KtNamedFunction?): LinkedHashSet<KtNamedFunction> /* = LinkedHashSet<KtNamedFunction> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <R : Any> -> KtNamedFunction
    <C : MutableCollection<in R>> -> LinkedHashSet<KtNamedFunction>

'result' @ [99:34] ==> val result: LinkedHashSet<KtNamedFunction> /* = LinkedHashSet<KtNamedFunction> */ defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.findAllFunctionToProcess[LocalVariableDescriptor]

'it' @ [100:32] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.findAllFunctionToProcess.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'unwrapped' @ [100:35] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'subClass' @ [101:39] ==> val subClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.findAllFunctionToProcess.<anonymous>.<anonymous>[LocalVariableDescriptor]

'resolveToDescriptor' @ [101:48] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getTypeSubstitutor' @ [102:35] ==> public fun getTypeSubstitutor(baseType: KotlinType, derivedType: KotlinType): TypeSubstitutor? defined in org.jetbrains.kotlin.types.substitutions[DeserializedSimpleFunctionDescriptor]

'baseClassDescriptor' @ [102:54] ==> val baseClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.findAllFunctionToProcess.<anonymous>[LocalVariableDescriptor]

'defaultType' @ [102:74] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'classDescriptor' @ [102:87] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.findAllFunctionToProcess.<anonymous>.<anonymous>[LocalVariableDescriptor]

'defaultType' @ [102:103] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'baseFunctionDescriptor' @ [104:43] ==> value-parameter baseFunctionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.findAllFunctionToProcess.<anonymous>[ValueParameterDescriptorImpl]

'substitute' @ [104:66] ==> @Nullable public abstract fun substitute(@NotNull substitutor: TypeSubstitutor): FunctionDescriptor? defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[JavaMethodDescriptor]

'substitutor' @ [104:77] ==> val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.findAllFunctionToProcess.<anonymous>.<anonymous>[LocalVariableDescriptor]

'classDescriptor' @ [105:45] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.findAllFunctionToProcess.<anonymous>.<anonymous>[LocalVariableDescriptor]

'findCallableMemberBySignature' @ [105:61] ==> public fun ClassDescriptor.findCallableMemberBySignature(signature: CallableMemberDescriptor, allowOverridabilityConflicts: Boolean = ...): CallableMemberDescriptor? defined in org.jetbrains.kotlin.util[DeserializedSimpleFunctionDescriptor]

'signatureInSubClass' @ [105:91] ==> val signatureInSubClass: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.findAllFunctionToProcess.<anonymous>.<anonymous>[LocalVariableDescriptor]

'subFunctionDescriptor' @ [107:17] ==> val subFunctionDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.findAllFunctionToProcess.<anonymous>.<anonymous>[LocalVariableDescriptor]

'source' @ [107:39] ==> public final val CallableMemberDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [107:46] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'result' @ [111:16] ==> val result: LinkedHashSet<KtNamedFunction> /* = LinkedHashSet<KtNamedFunction> */ defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.findAllFunctionToProcess[LocalVariableDescriptor]

'project' @ [115:25] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.invoke[ValueParameterDescriptorImpl]

'runSynchronouslyWithProgress' @ [115:33] ==> public fun <T : Any> Project.runSynchronouslyWithProgress(progressTitle: String, canBeCanceled: Boolean, action: () -> Set<KtNamedFunction>): Set<KtNamedFunction>? defined in org.jetbrains.kotlin.idea[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Set<KtNamedFunction>

'runReadAction' @ [116:13] ==> public fun <T> runReadAction(action: () -> Set<KtNamedFunction>): Set<KtNamedFunction> defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Set<KtNamedFunction>

'findAllFunctionToProcess' @ [116:29] ==> private final fun findAllFunctionToProcess(project: Project): Set<KtNamedFunction> defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix[SimpleFunctionDescriptorImpl]

'project' @ [116:54] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.invoke[ValueParameterDescriptorImpl]

'runWriteAction' @ [119:9] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'functions' @ [120:13] ==> val functions: Set<KtNamedFunction> defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.invoke[LocalVariableDescriptor]

'forEach' @ [120:23] ==> @HidesMembers public inline fun <T> Iterable<KtNamedFunction>.forEach(action: (KtNamedFunction) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedFunction

'if (addModifier) {
                    it.addModifier(KtTokens.SUSPEND_KEYWORD)
                }
                else {
                    it.removeModifier(KtTokens.SUSPEND_KEYWORD)
                }' @ [121:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'addModifier' @ [121:21] ==> private final val addModifier: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix[PropertyDescriptorImpl]

'it' @ [122:21] ==> value-parameter it: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.invoke.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'addModifier' @ [122:24] ==> public open fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'SUSPEND_KEYWORD' @ [122:45] ==> public final val SUSPEND_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'it' @ [125:21] ==> value-parameter it: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.invoke.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'removeModifier' @ [125:24] ==> public open fun removeModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'SUSPEND_KEYWORD' @ [125:48] ==> public final val SUSPEND_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'KotlinIntentionActionsFactory' @ [131:24] ==> public constructor KotlinIntentionActionsFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionsFactory[DeserializedClassConstructorDescriptor]

'HashMap' @ [133:37] ==> public final fun <K, V> <init>(): HashMap<FunctionDescriptor, List<FunctionDescriptor>> /* = HashMap<FunctionDescriptor, List<FunctionDescriptor>> */ defined in kotlin.collections.HashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> FunctionDescriptor
    <V> -> List<FunctionDescriptor>

'overridablesCache' @ [136:24] ==> val overridablesCache: HashMap<FunctionDescriptor, List<FunctionDescriptor>> /* = HashMap<FunctionDescriptor, List<FunctionDescriptor>> */ defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.findTopMostOverriddables[LocalVariableDescriptor]

'getOrPut' @ [136:42] ==> public inline fun <K, V> MutableMap<FunctionDescriptor, List<FunctionDescriptor>>.getOrPut(key: FunctionDescriptor, defaultValue: () -> List<FunctionDescriptor>): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FunctionDescriptor
    <V> -> List<FunctionDescriptor>

'this' @ [136:51] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.findTopMostOverriddables.getOverridables[ReceiverParameterDescriptorImpl]

'containingDeclaration' @ [137:43] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'emptyList' @ [137:115] ==> public fun <T> emptyList(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'getSuperclassDescriptors' @ [138:37] ==> @NotNull public open fun getSuperclassDescriptors(@NotNull p0: ClassDescriptor): (MutableList<(ClassDescriptor..ClassDescriptor?)>..List<(ClassDescriptor..ClassDescriptor?)>) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [138:62] ==> val classDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.findTopMostOverriddables.getOverridables.<anonymous>[LocalVariableDescriptor]

'flatMap' @ [138:79] ==> public inline fun <T, R> Iterable<(ClassDescriptor..ClassDescriptor?)>.flatMap(transform: ((ClassDescriptor..ClassDescriptor?)) -> Iterable<FunctionDescriptor>): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)
    <R> -> FunctionDescriptor

'superClassDescriptor' @ [139:29] ==> value-parameter superClassDescriptor: (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.findTopMostOverriddables.getOverridables.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [139:106] ==> public fun <T> emptyList(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'superClassDescriptor' @ [140:42] ==> value-parameter superClassDescriptor: (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.findTopMostOverriddables.getOverridables.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'unsubstitutedMemberScope' @ [140:63] ==> public final val ClassDescriptorWithResolutionScopes.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'getContributedFunctions' @ [140:88] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [140:112] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'FROM_IDE' @ [140:135] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'getTypeSubstitutor' @ [141:43] ==> public fun getTypeSubstitutor(baseType: KotlinType, derivedType: KotlinType): TypeSubstitutor? defined in org.jetbrains.kotlin.types.substitutions[DeserializedSimpleFunctionDescriptor]

'superClassDescriptor' @ [141:62] ==> value-parameter superClassDescriptor: (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.findTopMostOverriddables.getOverridables.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'defaultType' @ [141:83] ==> public final val ClassDescriptorWithResolutionScopes.defaultType: SimpleType[MyPropertyDescriptor]

'classDescriptor' @ [141:96] ==> val classDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.findTopMostOverriddables.getOverridables.<anonymous>[LocalVariableDescriptor]

'defaultType' @ [141:112] ==> public final val ClassDescriptorWithResolutionScopes.defaultType: SimpleType[MyPropertyDescriptor]

'emptyList' @ [142:61] ==> public fun <T> emptyList(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'candidates' @ [143:25] ==> val candidates: Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.findTopMostOverriddables.getOverridables.<anonymous>.<anonymous>[LocalVariableDescriptor]

'filter' @ [143:36] ==> public inline fun <T> Iterable<SimpleFunctionDescriptor>.filter(predicate: (SimpleFunctionDescriptor) -> Boolean): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'it' @ [144:45] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.findTopMostOverriddables.getOverridables.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'substitute' @ [144:48] ==> @Nullable public abstract fun substitute(@NotNull substitutor: TypeSubstitutor): FunctionDescriptor? defined in org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor[JavaMethodDescriptor]

'substitutor' @ [144:59] ==> val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.findTopMostOverriddables.getOverridables.<anonymous>.<anonymous>[LocalVariableDescriptor]

'classDescriptor' @ [145:29] ==> val classDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.findTopMostOverriddables.getOverridables.<anonymous>[LocalVariableDescriptor]

'findCallableMemberBySignature' @ [145:45] ==> public fun ClassDescriptor.findCallableMemberBySignature(signature: CallableMemberDescriptor, allowOverridabilityConflicts: Boolean = ...): CallableMemberDescriptor? defined in org.jetbrains.kotlin.util[DeserializedSimpleFunctionDescriptor]

'signature' @ [145:75] ==> val signature: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.findTopMostOverriddables.getOverridables.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'this' @ [145:95] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.findTopMostOverriddables.getOverridables[ReceiverParameterDescriptorImpl]

'dfs' @ [151:24] ==> public final fun <N : (Any..Any?), R : (Any..Any?)> dfs(@NotNull p0: (MutableCollection<(FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>), @NotNull p1: ((FunctionDescriptor..FunctionDescriptor?)) -> (MutableIterable<(FunctionDescriptor..FunctionDescriptor?)>..Iterable<(FunctionDescriptor..FunctionDescriptor?)>), @NotNull p2: DFS.NodeHandler<(FunctionDescriptor..FunctionDescriptor?), (ArrayList<FunctionDescriptor>..ArrayList<FunctionDescriptor>?)>): (ArrayList<FunctionDescriptor>..ArrayList<FunctionDescriptor>?) defined in org.jetbrains.kotlin.utils.DFS[SamAdapterFunctionDescriptor]
Inferred types:
    <N : (Any..Any?)> -> FunctionDescriptor
    <R : (Any..Any?)> -> ArrayList<FunctionDescriptor>

'listOf' @ [152:21] ==> public fun <T> listOf(element: FunctionDescriptor): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'this' @ [152:28] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.findTopMostOverriddables[ReceiverParameterDescriptorImpl]

'it' @ [153:23] ==> value-parameter it: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.findTopMostOverriddables.<anonymous>[ValueParameterDescriptorImpl]

'getOverridables' @ [153:27] ==> local final fun FunctionDescriptor.getOverridables(): List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.findTopMostOverriddables[SimpleFunctionDescriptorImpl]

'emptyList' @ [153:48] ==> public fun <T> emptyList(): List<(FunctionDescriptor..FunctionDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'DFS.CollectingNodeHandler<FunctionDescriptor, FunctionDescriptor, ArrayList<FunctionDescriptor>>' @ [154:30] ==> protected/*protected and package*/ constructor CollectingNodeHandler<N : (Any..Any?), R : (Any..Any?), C : (MutableIterable<(FunctionDescriptor..FunctionDescriptor?)>..Iterable<(FunctionDescriptor..FunctionDescriptor?)>?)>(@NotNull p0: ArrayList<FunctionDescriptor>) defined in org.jetbrains.kotlin.utils.DFS.CollectingNodeHandler[JavaClassConstructorDescriptor]
Inferred types:
    <N : (Any..Any?)> -> FunctionDescriptor
    <R : (Any..Any?)> -> FunctionDescriptor
    <C : (MutableIterable<(R..R?)>..Iterable<(R..R?)>?)> -> ArrayList<FunctionDescriptor>

'ArrayList' @ [154:127] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FunctionDescriptor

'current' @ [156:33] ==> value-parameter current: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.findTopMostOverriddables.<no name provided>.afterChildren[ValueParameterDescriptorImpl]

'getOverridables' @ [156:41] ==> local final fun FunctionDescriptor.getOverridables(): List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.findTopMostOverriddables[SimpleFunctionDescriptorImpl]

'isEmpty' @ [156:59] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'result' @ [157:33] ==> @NotNull protected/*protected and package*/ final val result: ArrayList<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.findTopMostOverriddables.<no name provided>[JavaPropertyDescriptor]

'add' @ [157:40] ==> public open fun add(element: FunctionDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'current' @ [157:44] ==> value-parameter current: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.findTopMostOverriddables.<no name provided>.afterChildren[ValueParameterDescriptorImpl]

'currentDescriptor' @ [166:42] ==> value-parameter currentDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.getOverridables[ValueParameterDescriptorImpl]

'containingDeclaration' @ [166:60] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'emptyList' @ [166:112] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'filter' @ [167:20] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [168:21] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.getOverridables.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [168:50] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.getOverridables.<anonymous>[ValueParameterDescriptorImpl]

'currentDescriptor' @ [168:56] ==> value-parameter currentDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.getOverridables[ValueParameterDescriptorImpl]

'it' @ [169:21] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.getOverridables.<anonymous>[ValueParameterDescriptorImpl]

'isSuspend' @ [169:24] ==> public final val FunctionDescriptor.isSuspend: Boolean[MyPropertyDescriptor]

'currentDescriptor' @ [169:37] ==> value-parameter currentDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.getOverridables[ValueParameterDescriptorImpl]

'isSuspend' @ [169:55] ==> public final val FunctionDescriptor.isSuspend: Boolean[MyPropertyDescriptor]

'it' @ [170:49] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.getOverridables.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [170:52] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'!' @ [171:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'currentClassDescriptor' @ [171:22] ==> val currentClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.getOverridables[LocalVariableDescriptor]

'isSubclassOf' @ [171:45] ==> public fun ClassDescriptor.isSubclassOf(superclass: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'containingClassDescriptor' @ [171:58] ==> val containingClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.getOverridables.<anonymous>[LocalVariableDescriptor]

'getTypeSubstitutor' @ [172:35] ==> public fun getTypeSubstitutor(baseType: KotlinType, derivedType: KotlinType): TypeSubstitutor? defined in org.jetbrains.kotlin.types.substitutions[DeserializedSimpleFunctionDescriptor]

'containingClassDescriptor' @ [173:25] ==> val containingClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.getOverridables.<anonymous>[LocalVariableDescriptor]

'defaultType' @ [173:51] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'currentClassDescriptor' @ [174:25] ==> val currentClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.getOverridables[LocalVariableDescriptor]

'defaultType' @ [174:48] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'it' @ [176:47] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.getOverridables.<anonymous>[ValueParameterDescriptorImpl]

'substitute' @ [176:50] ==> @Nullable public abstract fun substitute(@NotNull substitutor: TypeSubstitutor): FunctionDescriptor? defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[JavaMethodDescriptor]

'substitutor' @ [176:61] ==> val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.getOverridables.<anonymous>[LocalVariableDescriptor]

'==' @ [177:17] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.resolve.OverridingUtil.OverrideCompatibilityInfo.Result[DeserializedSimpleFunctionDescriptor]

'DEFAULT' @ [177:32] ==> public final val DEFAULT: (OverridingUtil..OverridingUtil?) defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaPropertyDescriptor]

'isOverridableBy' @ [177:40] ==> @NotNull public open fun isOverridableBy(@NotNull p0: CallableDescriptor, @NotNull p1: CallableDescriptor, @Nullable p2: ClassDescriptor?): OverridingUtil.OverrideCompatibilityInfo defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]

'signatureInCurrentClass' @ [177:56] ==> val signatureInCurrentClass: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.getOverridables.<anonymous>[LocalVariableDescriptor]

'currentDescriptor' @ [177:81] ==> value-parameter currentDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.getOverridables[ValueParameterDescriptorImpl]

'result' @ [177:106] ==> public final val OverridingUtil.OverrideCompatibilityInfo.result: OverridingUtil.OverrideCompatibilityInfo.Result[MyPropertyDescriptor]

'CONFLICT' @ [178:73] ==> enum entry CONFLICT defined in org.jetbrains.kotlin.resolve.OverridingUtil.OverrideCompatibilityInfo.Result[FakeCallableDescriptorForObject]

'diagnostic' @ [183:35] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.doCreateActions[ValueParameterDescriptorImpl]

'psiElement' @ [183:46] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'emptyList' @ [183:87] ==> public fun <T> emptyList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'currentFunction' @ [184:37] ==> val currentFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.doCreateActions[LocalVariableDescriptor]

'resolveToDescriptor' @ [184:53] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'CONFLICTING_OVERLOADS' @ [185:20] ==> public final val CONFLICTING_OVERLOADS: (DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [185:42] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters1<(PsiElement..PsiElement?), (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'diagnostic' @ [185:47] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.doCreateActions[ValueParameterDescriptorImpl]

'a' @ [185:59] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?)> DiagnosticWithParameters1<(PsiElement..PsiElement?), (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>.a: (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <A : (Any..Any?)> -> (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)>?)

'getOverridables' @ [185:61] ==> private final fun Collection<DeclarationDescriptor>.getOverridables(currentDescriptor: FunctionDescriptor): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion[SimpleFunctionDescriptorImpl]

'currentDescriptor' @ [185:77] ==> val currentDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.doCreateActions[LocalVariableDescriptor]

'ifEmpty' @ [185:96] ==> public inline fun <T, C : Collection<DeclarationDescriptor>> List<DeclarationDescriptor>.ifEmpty(body: () -> List<DeclarationDescriptor>): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <C : Collection<T>> -> List<DeclarationDescriptor>

'emptyList' @ [185:113] ==> public fun <T> emptyList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'listOf' @ [187:20] ==> public fun <T> listOf(vararg elements: ChangeSuspendInHierarchyFix): List<ChangeSuspendInHierarchyFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ChangeSuspendInHierarchyFix

'ChangeSuspendInHierarchyFix' @ [188:21] ==> public constructor ChangeSuspendInHierarchyFix(element: KtNamedFunction, addModifier: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix[ClassConstructorDescriptorImpl]

'currentFunction' @ [188:49] ==> val currentFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.doCreateActions[LocalVariableDescriptor]

'ChangeSuspendInHierarchyFix' @ [189:21] ==> public constructor ChangeSuspendInHierarchyFix(element: KtNamedFunction, addModifier: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix[ClassConstructorDescriptorImpl]

'currentFunction' @ [189:49] ==> val currentFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeSuspendInHierarchyFix.Companion.doCreateActions[LocalVariableDescriptor]

