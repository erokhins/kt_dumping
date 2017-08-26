'alreadyAdded' @ [47:32] ==> value-parameter alreadyAdded: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.<init>[ValueParameterDescriptorImpl]

'mapTo' @ [47:45] ==> public inline fun <T, R, C : MutableCollection<in DeclarationDescriptor>> Iterable<DeclarationDescriptor>.mapTo(destination: HashSet<DeclarationDescriptor>, transform: (DeclarationDescriptor) -> DeclarationDescriptor): HashSet<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> DeclarationDescriptor
    <C : MutableCollection<in R>> -> HashSet<DeclarationDescriptor>

'HashSet' @ [47:51] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'if (it is ImportedFromObjectCallableDescriptor<*>) it.callableFromObject else it' @ [48:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DeclarationDescriptor, elseBranch: DeclarationDescriptor): DeclarationDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DeclarationDescriptor

'it' @ [48:13] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.alreadyAdded.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [48:60] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.alreadyAdded.<anonymous>[ValueParameterDescriptorImpl]

'callableFromObject' @ [48:63] ==> public final val callableFromObject: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.ImportedFromObjectCallableDescriptor[DeserializedPropertyDescriptor]

'it' @ [48:87] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.alreadyAdded.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [54:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'useReceiverTypes' @ [54:22] ==> value-parameter useReceiverTypes: Boolean defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.decoratedLookupElementFactory.<no name provided>.createStandardLookupElementsForDescriptor[ValueParameterDescriptorImpl]

'emptyList' @ [54:47] ==> public fun <T> emptyList(): List<LookupElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupElement

'lookupElementFactory' @ [55:24] ==> private final val lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion[PropertyDescriptorImpl]

'createLookupElement' @ [55:45] ==> public open fun createLookupElement(descriptor: DeclarationDescriptor, useReceiverTypes: Boolean, qualifyNestedClasses: Boolean, includeClassTypeArguments: Boolean, parametersAndTypeGrayed: Boolean): LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'descriptor' @ [55:65] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.decoratedLookupElementFactory.<no name provided>.createStandardLookupElementsForDescriptor[ValueParameterDescriptorImpl]

'decorateAsStaticMember' @ [56:26] ==> public fun LookupElement.decorateAsStaticMember(memberDescriptor: DeclarationDescriptor, classNameAsLookupString: Boolean): LookupElement? defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [56:49] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.decoratedLookupElementFactory.<no name provided>.createStandardLookupElementsForDescriptor[ValueParameterDescriptorImpl]

'assignPriority' @ [57:27] ==> public fun LookupElement.assignPriority(priority: ItemPriority): LookupElement defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'itemPriority' @ [57:42] ==> value-parameter itemPriority: ItemPriority defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.decoratedLookupElementFactory[ValueParameterDescriptorImpl]

'suppressAutoInsertion' @ [58:27] ==> public fun LookupElement.suppressAutoInsertion(): LookupElement defined in org.jetbrains.kotlin.idea.completion[SimpleFunctionDescriptorImpl]

'let' @ [59:26] ==> @InlineOnly public inline fun <T, R> LookupElement?.let(block: (LookupElement?) -> List<LookupElement>): List<LookupElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupElement?
    <R> -> List<LookupElement>

'file' @ [69:26] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.membersFromImports[ValueParameterDescriptorImpl]

'importDirectives' @ [69:31] ==> public final val KtFile.importDirectives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'filter' @ [70:18] ==> public inline fun <T> Iterable<(KtImportDirective..KtImportDirective?)>.filter(predicate: ((KtImportDirective..KtImportDirective?)) -> Boolean): List<(KtImportDirective..KtImportDirective?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)

'!' @ [70:27] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [70:28] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.membersFromImports.<anonymous>[ValueParameterDescriptorImpl]

'isAllUnder' @ [70:31] ==> public final val KtImportDirective.isAllUnder: Boolean[MyPropertyDescriptor]

'mapNotNull' @ [71:18] ==> public inline fun <T, R : Any> Iterable<(KtImportDirective..KtImportDirective?)>.mapNotNull(transform: ((KtImportDirective..KtImportDirective?)) -> ClassDescriptor?): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)
    <R : Any> -> ClassDescriptor

'it' @ [72:21] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.membersFromImports.<anonymous>[ValueParameterDescriptorImpl]

'targetDescriptors' @ [72:24] ==> public fun KtImportDirective.targetDescriptors(resolutionFacade: ResolutionFacade = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [72:42] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion[PropertyDescriptorImpl]

'map' @ [73:30] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.map(transform: (DeclarationDescriptor) -> DeclarationDescriptor?): List<DeclarationDescriptor?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> DeclarationDescriptor?

'it' @ [73:36] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.membersFromImports.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [73:39] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'distinct' @ [74:30] ==> public fun <T> Iterable<DeclarationDescriptor?>.distinct(): List<DeclarationDescriptor?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor?

'singleOrNull' @ [75:30] ==> public fun <T> List<DeclarationDescriptor?>.singleOrNull(): DeclarationDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor?

'toSet' @ [77:18] ==> public fun <T> Iterable<ClassDescriptor>.toSet(): Set<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'ArrayList' @ [79:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'DescriptorKindFilter' @ [81:26] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'CALLABLES' @ [81:47] ==> @field:JvmField public final val CALLABLES: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'Extensions' @ [81:87] ==> public object Extensions : DescriptorKindExclude defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude[FakeCallableDescriptorForObject]

'prefixMatcher' @ [82:26] ==> private final val prefixMatcher: PrefixMatcher defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion[PropertyDescriptorImpl]

'asNameFilter' @ [82:40] ==> public fun PrefixMatcher.asNameFilter(): (Name) -> Boolean defined in org.jetbrains.kotlin.idea.completion[SimpleFunctionDescriptorImpl]

'containers' @ [83:27] ==> val containers: Set<ClassDescriptor> defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.membersFromImports[LocalVariableDescriptor]

'if (container.kind == ClassKind.OBJECT) container.unsubstitutedMemberScope else container.staticScope' @ [84:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: MemberScope, elseBranch: MemberScope): MemberScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MemberScope

'container' @ [84:35] ==> val container: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.membersFromImports[LocalVariableDescriptor]

'kind' @ [84:45] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'OBJECT' @ [84:63] ==> enum entry OBJECT defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'container' @ [84:71] ==> val container: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.membersFromImports[LocalVariableDescriptor]

'unsubstitutedMemberScope' @ [84:81] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'container' @ [84:111] ==> val container: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.membersFromImports[LocalVariableDescriptor]

'staticScope' @ [84:121] ==> public final val ClassDescriptor.staticScope: MemberScope[MyPropertyDescriptor]

'memberScope' @ [86:21] ==> val memberScope: MemberScope defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.membersFromImports[LocalVariableDescriptor]

'getDescriptorsFiltered' @ [86:33] ==> public fun MemberScope.getDescriptorsFiltered(kindFilter: DescriptorKindFilter = ..., nameFilter: (Name) -> Boolean = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes[DeserializedSimpleFunctionDescriptor]

'kindFilter' @ [86:56] ==> val kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.membersFromImports[LocalVariableDescriptor]

'nameFilter' @ [86:68] ==> val nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.membersFromImports[LocalVariableDescriptor]

'memberScope' @ [87:21] ==> val memberScope: MemberScope defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.membersFromImports[LocalVariableDescriptor]

'collectSyntheticStaticMembersAndConstructors' @ [87:33] ==> public fun ResolutionScope.collectSyntheticStaticMembersAndConstructors(resolutionFacade: ResolutionFacade, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [87:78] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion[PropertyDescriptorImpl]

'kindFilter' @ [87:96] ==> val kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.membersFromImports[LocalVariableDescriptor]

'nameFilter' @ [87:108] ==> val nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.membersFromImports[LocalVariableDescriptor]

'members' @ [88:13] ==> val members: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.membersFromImports[LocalVariableDescriptor]

'filterTo' @ [88:21] ==> public inline fun <T, C : MutableCollection<in DeclarationDescriptor>> Iterable<DeclarationDescriptor>.filterTo(destination: ArrayList<DeclarationDescriptor>, predicate: (DeclarationDescriptor) -> Boolean): ArrayList<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <C : MutableCollection<in T>> -> ArrayList<DeclarationDescriptor>

'result' @ [88:30] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.membersFromImports[LocalVariableDescriptor]

'it' @ [88:40] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.membersFromImports.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [88:68] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.membersFromImports.<anonymous>[ValueParameterDescriptorImpl]

'alreadyAdded' @ [88:75] ==> private final val alreadyAdded: HashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion[PropertyDescriptorImpl]

'result' @ [90:16] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.membersFromImports[LocalVariableDescriptor]

'DescriptorKindFilter' @ [99:36] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'CALLABLES' @ [99:57] ==> @field:JvmField public final val CALLABLES: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'Extensions' @ [99:97] ==> public object Extensions : DescriptorKindExclude defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude[FakeCallableDescriptorForObject]

'prefixMatcher' @ [100:49] ==> private final val prefixMatcher: PrefixMatcher defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion[PropertyDescriptorImpl]

'prefixMatches' @ [100:63] ==> public abstract fun prefixMatches(@NotNull p0: String): Boolean defined in com.intellij.codeInsight.completion.PrefixMatcher[JavaMethodDescriptor]

'it' @ [100:77] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.processMembersFromIndices.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [103:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [103:14] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.processMembersFromIndices.<anonymous>[ValueParameterDescriptorImpl]

'hasModifier' @ [103:26] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [103:47] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'objectDeclaration' @ [103:68] ==> value-parameter objectDeclaration: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.processMembersFromIndices.<anonymous>[ValueParameterDescriptorImpl]

'isTopLevelOrCompanion' @ [103:86] ==> private final fun KtObjectDeclaration.isTopLevelOrCompanion(): Boolean defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion[SimpleFunctionDescriptorImpl]

'indicesHelper' @ [105:9] ==> value-parameter indicesHelper: KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.processMembersFromIndices[ValueParameterDescriptorImpl]

'processObjectMembers' @ [105:23] ==> public final fun processObjectMembers(descriptorKindFilter: DescriptorKindFilter, nameFilter: (String) -> Boolean, filter: (KtNamedDeclaration, KtObjectDeclaration) -> Boolean, processor: (DeclarationDescriptor) -> Unit): Unit defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[DeserializedSimpleFunctionDescriptor]

'descriptorKindFilter' @ [105:44] ==> val descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.processMembersFromIndices[LocalVariableDescriptor]

'nameFilter' @ [105:66] ==> val nameFilter: (String) -> Boolean defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.processMembersFromIndices[LocalVariableDescriptor]

'filter' @ [105:78] ==> val filter: (KtNamedDeclaration, KtObjectDeclaration) -> Boolean defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.processMembersFromIndices[LocalVariableDescriptor]

'it' @ [106:17] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.processMembersFromIndices.<anonymous>[ValueParameterDescriptorImpl]

'alreadyAdded' @ [106:24] ==> private final val alreadyAdded: HashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion[PropertyDescriptorImpl]

'invoke' @ [107:17] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [107:27] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.processMembersFromIndices.<anonymous>[ValueParameterDescriptorImpl]

'isJvmModule' @ [111:13] ==> private final val isJvmModule: Boolean defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion[PropertyDescriptorImpl]

'indicesHelper' @ [112:13] ==> value-parameter indicesHelper: KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.processMembersFromIndices[ValueParameterDescriptorImpl]

'processJavaStaticMembers' @ [112:27] ==> public final fun processJavaStaticMembers(descriptorKindFilter: DescriptorKindFilter, nameFilter: (String) -> Boolean, processor: (DeclarationDescriptor) -> Unit): Unit defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[DeserializedSimpleFunctionDescriptor]

'descriptorKindFilter' @ [112:52] ==> val descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.processMembersFromIndices[LocalVariableDescriptor]

'nameFilter' @ [112:74] ==> val nameFilter: (String) -> Boolean defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.processMembersFromIndices[LocalVariableDescriptor]

'it' @ [113:21] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.processMembersFromIndices.<anonymous>[ValueParameterDescriptorImpl]

'alreadyAdded' @ [113:28] ==> private final val alreadyAdded: HashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion[PropertyDescriptorImpl]

'invoke' @ [114:21] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [114:31] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.processMembersFromIndices.<anonymous>[ValueParameterDescriptorImpl]

'if (isCompanion()) {
            val owner = parent.parent as? KtClass ?: return false
            return owner.isTopLevel()
        }
        else {
            return isTopLevel()
        }' @ [121:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'isCompanion' @ [121:13] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'parent' @ [122:25] ==> public final val KtObjectDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [122:32] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'owner' @ [123:20] ==> val owner: KtClass defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.isTopLevelOrCompanion[LocalVariableDescriptor]

'isTopLevel' @ [123:26] ==> public final fun isTopLevel(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'isTopLevel' @ [126:20] ==> public final fun isTopLevel(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'decoratedLookupElementFactory' @ [131:23] ==> public final fun decoratedLookupElementFactory(itemPriority: ItemPriority): AbstractLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion[SimpleFunctionDescriptorImpl]

'STATIC_MEMBER_FROM_IMPORTS' @ [131:66] ==> enum entry STATIC_MEMBER_FROM_IMPORTS defined in org.jetbrains.kotlin.idea.completion.ItemPriority[FakeCallableDescriptorForObject]

'membersFromImports' @ [132:9] ==> public final fun membersFromImports(file: KtFile): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion[SimpleFunctionDescriptorImpl]

'file' @ [132:28] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.completeFromImports[ValueParameterDescriptorImpl]

'flatMap' @ [133:18] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.flatMap(transform: (DeclarationDescriptor) -> Iterable<LookupElement>): List<LookupElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> LookupElement

'factory' @ [133:28] ==> val factory: AbstractLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.completeFromImports[LocalVariableDescriptor]

'createStandardLookupElementsForDescriptor' @ [133:36] ==> public abstract fun createStandardLookupElementsForDescriptor(descriptor: DeclarationDescriptor, useReceiverTypes: Boolean): Collection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.AbstractLookupElementFactory[SimpleFunctionDescriptorImpl]

'it' @ [133:78] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.completeFromImports.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [134:18] ==> @HidesMembers public inline fun <T> Iterable<LookupElement>.forEach(action: (LookupElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupElement

'collector' @ [134:28] ==> value-parameter collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.completeFromImports[ValueParameterDescriptorImpl]

'addElement' @ [134:38] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'it' @ [134:49] ==> value-parameter it: LookupElement defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.completeFromImports.<anonymous>[ValueParameterDescriptorImpl]

'decoratedLookupElementFactory' @ [138:23] ==> public final fun decoratedLookupElementFactory(itemPriority: ItemPriority): AbstractLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion[SimpleFunctionDescriptorImpl]

'STATIC_MEMBER' @ [138:66] ==> enum entry STATIC_MEMBER defined in org.jetbrains.kotlin.idea.completion.ItemPriority[FakeCallableDescriptorForObject]

'processMembersFromIndices' @ [139:9] ==> public final fun processMembersFromIndices(indicesHelper: KotlinIndicesHelper, processor: (DeclarationDescriptor) -> Unit): Unit defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion[SimpleFunctionDescriptorImpl]

'indicesHelper' @ [139:35] ==> value-parameter indicesHelper: KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.completeFromIndices[ValueParameterDescriptorImpl]

'factory' @ [140:13] ==> val factory: AbstractLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.completeFromIndices[LocalVariableDescriptor]

'createStandardLookupElementsForDescriptor' @ [140:21] ==> public abstract fun createStandardLookupElementsForDescriptor(descriptor: DeclarationDescriptor, useReceiverTypes: Boolean): Collection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.AbstractLookupElementFactory[SimpleFunctionDescriptorImpl]

'it' @ [140:63] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.completeFromIndices.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [140:92] ==> @HidesMembers public inline fun <T> Iterable<LookupElement>.forEach(action: (LookupElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupElement

'collector' @ [140:102] ==> value-parameter collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.completeFromIndices[ValueParameterDescriptorImpl]

'addElement' @ [140:112] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'it' @ [140:123] ==> value-parameter it: LookupElement defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.completeFromIndices.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'collector' @ [141:13] ==> value-parameter collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion.completeFromIndices[ValueParameterDescriptorImpl]

'flushToResultSet' @ [141:23] ==> public final fun flushToResultSet(): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

