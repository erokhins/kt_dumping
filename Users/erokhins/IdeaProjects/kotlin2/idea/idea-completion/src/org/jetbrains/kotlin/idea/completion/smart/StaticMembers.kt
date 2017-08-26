'HashMap' @ [51:36] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ClassDescriptor
    <V : (Any..Any?)> -> MutableList<ExpectedInfo>

'expectedInfos' @ [52:30] ==> value-parameter expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[ValueParameterDescriptorImpl]

'expectedInfo' @ [53:31] ==> val expectedInfo: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[LocalVariableDescriptor]

'multipleFuzzyTypes' @ [53:44] ==> public val ExpectedInfo.multipleFuzzyTypes: Collection<FuzzyType> defined in org.jetbrains.kotlin.idea.core[DeserializedPropertyDescriptor]

'fuzzyType' @ [54:39] ==> val fuzzyType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[LocalVariableDescriptor]

'type' @ [54:49] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'constructor' @ [54:54] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [54:66] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'expectedInfosByClass' @ [55:17] ==> val expectedInfosByClass: HashMap<ClassDescriptor, MutableList<ExpectedInfo>> defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[LocalVariableDescriptor]

'getOrPut' @ [55:38] ==> public inline fun <K, V> MutableMap<ClassDescriptor, MutableList<ExpectedInfo>>.getOrPut(key: ClassDescriptor, defaultValue: () -> MutableList<ExpectedInfo>): MutableList<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ClassDescriptor
    <V> -> MutableList<ExpectedInfo>

'classDescriptor' @ [55:47] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[LocalVariableDescriptor]

'ArrayList' @ [55:66] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ExpectedInfo

'add' @ [55:80] ==> public abstract fun add(element: ExpectedInfo): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'expectedInfo' @ [55:84] ==> val expectedInfo: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[LocalVariableDescriptor]

'expectedInfo' @ [58:17] ==> val expectedInfo: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[LocalVariableDescriptor]

'additionalData' @ [58:30] ==> public final val additionalData: ExpectedInfo.AdditionalData? defined in org.jetbrains.kotlin.idea.core.ExpectedInfo[DeserializedPropertyDescriptor]

'resolutionFacade' @ [59:38] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers[PropertyDescriptorImpl]

'resolveImportReference' @ [59:55] ==> public fun ResolutionFacade.resolveImportReference(moduleDescriptor: ModuleDescriptor, fqName: FqName): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'moduleDescriptor' @ [59:78] ==> private final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers[PropertyDescriptorImpl]

'FqName' @ [59:96] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'singleOrNull' @ [59:135] ==> public fun <T> Iterable<DeclarationDescriptor>.singleOrNull(): DeclarationDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'delegatesClass' @ [60:21] ==> val delegatesClass: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[LocalVariableDescriptor]

'addToCollection' @ [61:21] ==> private final fun addToCollection(collection: MutableCollection<LookupElement>, classDescriptor: ClassDescriptor, expectedInfos: Collection<ExpectedInfo>, context: KtSimpleNameExpression, enumEntriesToSkip: Set<DeclarationDescriptor>, priority: SmartCompletionItemPriority): Unit defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers[SimpleFunctionDescriptorImpl]

'collection' @ [61:37] ==> value-parameter collection: MutableCollection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[ValueParameterDescriptorImpl]

'delegatesClass' @ [61:49] ==> val delegatesClass: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[LocalVariableDescriptor]

'listOf' @ [61:65] ==> public fun <T> listOf(element: ExpectedInfo): List<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo

'expectedInfo' @ [61:72] ==> val expectedInfo: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[LocalVariableDescriptor]

'context' @ [61:87] ==> value-parameter context: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[ValueParameterDescriptorImpl]

'enumEntriesToSkip' @ [61:96] ==> value-parameter enumEntriesToSkip: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[ValueParameterDescriptorImpl]

'DELEGATES_STATIC_MEMBER' @ [61:143] ==> enum entry DELEGATES_STATIC_MEMBER defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'component1' @ [66:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ClassDescriptor, MutableList<ExpectedInfo>>.component1(): ClassDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ClassDescriptor
    <V> -> MutableList<ExpectedInfo>

'component2' @ [66:32] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ClassDescriptor, MutableList<ExpectedInfo>>.component2(): MutableList<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ClassDescriptor
    <V> -> MutableList<ExpectedInfo>

'expectedInfosByClass' @ [66:58] ==> val expectedInfosByClass: HashMap<ClassDescriptor, MutableList<ExpectedInfo>> defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[LocalVariableDescriptor]

'!' @ [67:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [67:18] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[LocalVariableDescriptor]

'name' @ [67:34] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'isSpecial' @ [67:39] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'addToCollection' @ [68:17] ==> private final fun addToCollection(collection: MutableCollection<LookupElement>, classDescriptor: ClassDescriptor, expectedInfos: Collection<ExpectedInfo>, context: KtSimpleNameExpression, enumEntriesToSkip: Set<DeclarationDescriptor>, priority: SmartCompletionItemPriority): Unit defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers[SimpleFunctionDescriptorImpl]

'collection' @ [68:33] ==> value-parameter collection: MutableCollection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[ValueParameterDescriptorImpl]

'classDescriptor' @ [68:45] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[LocalVariableDescriptor]

'expectedInfosForClass' @ [68:62] ==> val expectedInfosForClass: MutableList<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[LocalVariableDescriptor]

'context' @ [68:85] ==> value-parameter context: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[ValueParameterDescriptorImpl]

'enumEntriesToSkip' @ [68:94] ==> value-parameter enumEntriesToSkip: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[ValueParameterDescriptorImpl]

'STATIC_MEMBER' @ [68:141] ==> enum entry STATIC_MEMBER defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'descriptor' @ [82:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection.processMember[ValueParameterDescriptorImpl]

'!' @ [82:70] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [82:71] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection.processMember[ValueParameterDescriptorImpl]

'isVisible' @ [82:82] ==> public fun DeclarationDescriptorWithVisibility.isVisible(context: PsiElement, receiverExpression: KtExpression?, bindingContext: BindingContext, resolutionFacade: ResolutionFacade): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'context' @ [82:92] ==> value-parameter context: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[ValueParameterDescriptorImpl]

'bindingContext' @ [82:107] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers[PropertyDescriptorImpl]

'resolutionFacade' @ [82:123] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers[PropertyDescriptorImpl]

'if (descriptor is CallableDescriptor) {
                val returnType = descriptor.fuzzyReturnType() ?: return
                matcher = { expectedInfo -> returnType.matchExpectedInfo(expectedInfo) }
            }
            else if (DescriptorUtils.isEnumEntry(descriptor) && !enumEntriesToSkip.contains(descriptor)) {
                matcher = { ExpectedInfoMatch.match(TypeSubstitutor.EMPTY) } /* we do not need to check type of enum entry because it's taken from proper enum */
            }
            else {
                return
            }' @ [85:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'descriptor' @ [85:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection.processMember[ValueParameterDescriptorImpl]

'descriptor' @ [86:34] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection.processMember[ValueParameterDescriptorImpl]

'fuzzyReturnType' @ [86:45] ==> public fun CallableDescriptor.fuzzyReturnType(): FuzzyType? defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'matcher' @ [87:17] ==> val matcher: (ExpectedInfo) -> ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection.processMember[LocalVariableDescriptor]

'returnType' @ [87:45] ==> val returnType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection.processMember[LocalVariableDescriptor]

'matchExpectedInfo' @ [87:56] ==> public fun FuzzyType.matchExpectedInfo(expectedInfo: ExpectedInfo): ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart[SimpleFunctionDescriptorImpl]

'expectedInfo' @ [87:74] ==> value-parameter expectedInfo: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection.processMember.<anonymous>[ValueParameterDescriptorImpl]

'if (DescriptorUtils.isEnumEntry(descriptor) && !enumEntriesToSkip.contains(descriptor)) {
                matcher = { ExpectedInfoMatch.match(TypeSubstitutor.EMPTY) } /* we do not need to check type of enum entry because it's taken from proper enum */
            }
            else {
                return
            }' @ [89:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isEnumEntry' @ [89:38] ==> public open fun isEnumEntry(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [89:50] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection.processMember[ValueParameterDescriptorImpl]

'!' @ [89:65] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'enumEntriesToSkip' @ [89:66] ==> value-parameter enumEntriesToSkip: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[ValueParameterDescriptorImpl]

'contains' @ [89:84] ==> public abstract fun contains(element: DeclarationDescriptor): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [89:93] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection.processMember[ValueParameterDescriptorImpl]

'matcher' @ [90:17] ==> val matcher: (ExpectedInfo) -> ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection.processMember[LocalVariableDescriptor]

'ExpectedInfoMatch' @ [90:29] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch[FakeCallableDescriptorForObject]

'match' @ [90:47] ==> public final fun match(substitutor: TypeSubstitutor): ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch.Companion[SimpleFunctionDescriptorImpl]

'EMPTY' @ [90:69] ==> public final val EMPTY: (TypeSubstitutor..TypeSubstitutor?) defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaPropertyDescriptor]

'collection' @ [96:13] ==> value-parameter collection: MutableCollection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[ValueParameterDescriptorImpl]

'addLookupElements' @ [96:24] ==> public fun <TDescriptor : DeclarationDescriptor?> MutableCollection<LookupElement>.addLookupElements(descriptor: DeclarationDescriptor, expectedInfos: Collection<ExpectedInfo>, infoMatcher: (ExpectedInfo) -> ExpectedInfoMatch, noNameSimilarityForReturnItself: Boolean = ..., lookupElementFactory: (DeclarationDescriptor) -> Collection<LookupElement>): Unit defined in org.jetbrains.kotlin.idea.completion.smart[SimpleFunctionDescriptorImpl]
Inferred types:
    <TDescriptor : DeclarationDescriptor?> -> DeclarationDescriptor

'descriptor' @ [96:42] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection.processMember[ValueParameterDescriptorImpl]

'expectedInfos' @ [96:54] ==> value-parameter expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[ValueParameterDescriptorImpl]

'matcher' @ [96:69] ==> val matcher: (ExpectedInfo) -> ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection.processMember[LocalVariableDescriptor]

'createLookupElements' @ [96:80] ==> private final fun createLookupElements(memberDescriptor: DeclarationDescriptor, priority: SmartCompletionItemPriority): Collection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers[SimpleFunctionDescriptorImpl]

'it' @ [96:101] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection.processMember.<anonymous>[ValueParameterDescriptorImpl]

'priority' @ [96:105] ==> value-parameter priority: SmartCompletionItemPriority defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[ValueParameterDescriptorImpl]

'classDescriptor' @ [99:9] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[ValueParameterDescriptorImpl]

'staticScope' @ [99:25] ==> public final val ClassDescriptor.staticScope: MemberScope[MyPropertyDescriptor]

'getContributedDescriptors' @ [99:37] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'forEach' @ [99:65] ==> @HidesMembers public inline fun <T> Iterable<DeclarationDescriptor>.forEach(action: (DeclarationDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'classDescriptor' @ [101:31] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[ValueParameterDescriptorImpl]

'companionObjectDescriptor' @ [101:47] ==> public final val ClassDescriptor.companionObjectDescriptor: ClassDescriptor?[MyPropertyDescriptor]

'companionObject' @ [102:13] ==> val companionObject: ClassDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[LocalVariableDescriptor]

'companionObject' @ [103:13] ==> val companionObject: ClassDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[LocalVariableDescriptor]

'defaultType' @ [103:29] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'memberScope' @ [103:41] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'getContributedDescriptors' @ [103:53] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'filter' @ [104:22] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'!' @ [104:31] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [104:32] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection.<anonymous>[ValueParameterDescriptorImpl]

'isExtension' @ [104:35] ==> public val DeclarationDescriptor.isExtension: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'forEach' @ [105:22] ==> @HidesMembers public inline fun <T> Iterable<DeclarationDescriptor>.forEach(action: (DeclarationDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'classDescriptor' @ [108:23] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[ValueParameterDescriptorImpl]

'defaultType' @ [108:39] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'memberScope' @ [108:51] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'getContributedDescriptors' @ [108:63] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'filter' @ [108:91] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'when (classDescriptor.kind) {
                ClassKind.ENUM_CLASS -> member is ClassDescriptor // enum member
                ClassKind.OBJECT -> member is CallableMemberDescriptor || DescriptorUtils.isNonCompanionObject(member)
                else -> DescriptorUtils.isNonCompanionObject(member)
            }' @ [109:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'classDescriptor' @ [109:19] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[ValueParameterDescriptorImpl]

'kind' @ [109:35] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_CLASS' @ [110:27] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'member' @ [110:41] ==> value-parameter member: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection.<anonymous>[ValueParameterDescriptorImpl]

'OBJECT' @ [111:27] ==> enum entry OBJECT defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'member' @ [111:37] ==> value-parameter member: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection.<anonymous>[ValueParameterDescriptorImpl]

'isNonCompanionObject' @ [111:91] ==> public open fun isNonCompanionObject(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'member' @ [111:112] ==> value-parameter member: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection.<anonymous>[ValueParameterDescriptorImpl]

'isNonCompanionObject' @ [112:41] ==> public open fun isNonCompanionObject(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'member' @ [112:62] ==> value-parameter member: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection.<anonymous>[ValueParameterDescriptorImpl]

'members' @ [115:9] ==> val members: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.addToCollection[LocalVariableDescriptor]

'forEach' @ [115:17] ==> @HidesMembers public inline fun <T> Iterable<DeclarationDescriptor>.forEach(action: (DeclarationDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'lookupElementFactory' @ [119:16] ==> private final val lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers[PropertyDescriptorImpl]

'createStandardLookupElementsForDescriptor' @ [119:37] ==> public open fun createStandardLookupElementsForDescriptor(descriptor: DeclarationDescriptor, useReceiverTypes: Boolean): Collection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'memberDescriptor' @ [119:79] ==> value-parameter memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.createLookupElements[ValueParameterDescriptorImpl]

'map' @ [120:18] ==> public inline fun <T, R> Iterable<LookupElement>.map(transform: (LookupElement) -> LookupElement): List<LookupElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupElement
    <R> -> LookupElement

'it' @ [121:21] ==> value-parameter it: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.createLookupElements.<anonymous>[ValueParameterDescriptorImpl]

'decorateAsStaticMember' @ [121:24] ==> public fun LookupElement.decorateAsStaticMember(memberDescriptor: DeclarationDescriptor, classNameAsLookupString: Boolean): LookupElement? defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'memberDescriptor' @ [121:47] ==> value-parameter memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.createLookupElements[ValueParameterDescriptorImpl]

'assignSmartCompletionPriority' @ [122:30] ==> public fun LookupElement.assignSmartCompletionPriority(priority: SmartCompletionItemPriority): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'priority' @ [122:60] ==> value-parameter priority: SmartCompletionItemPriority defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers.createLookupElements[ValueParameterDescriptorImpl]

