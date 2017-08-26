'LookupElementWeigher' @ [41:26] ==> protected/*protected and package*/ constructor LookupElementWeigher(p0: (String..String?)) defined in com.intellij.codeInsight.lookup.LookupElementWeigher[JavaClassConstructorDescriptor]

'element' @ [43:15] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.PriorityWeigher.weigh[ValueParameterDescriptorImpl]

'getUserData' @ [43:23] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(ItemPriority..ItemPriority?)>): ItemPriority? defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ItemPriority

'ITEM_PRIORITY_KEY' @ [43:35] ==> public val ITEM_PRIORITY_KEY: Key<ItemPriority> defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[PropertyDescriptorImpl]

'DEFAULT' @ [43:70] ==> enum entry DEFAULT defined in org.jetbrains.kotlin.idea.completion.ItemPriority[FakeCallableDescriptorForObject]

'LookupElementWeigher' @ [46:80] ==> protected/*protected and package*/ constructor LookupElementWeigher(p0: (String..String?)) defined in com.intellij.codeInsight.lookup.LookupElementWeigher[JavaClassConstructorDescriptor]

'element' @ [55:13] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.NotImportedWeigher.weigh[ValueParameterDescriptorImpl]

'getUserData' @ [55:21] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(Unit..Unit?)>): Unit? defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'NOT_IMPORTED_KEY' @ [55:33] ==> public val NOT_IMPORTED_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[PropertyDescriptorImpl]

'default' @ [55:74] ==> enum entry default defined in org.jetbrains.kotlin.idea.completion.NotImportedWeigher.Weight[FakeCallableDescriptorForObject]

'element' @ [56:17] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.NotImportedWeigher.weigh[ValueParameterDescriptorImpl]

'`object`' @ [56:25] ==> public final val LookupElement.`object`: Any[MyPropertyDescriptor]

'o' @ [57:22] ==> val o: DeclarationLookupObject? defined in org.jetbrains.kotlin.idea.completion.NotImportedWeigher.weigh[LocalVariableDescriptor]

'importableFqName' @ [57:25] ==> public abstract val importableFqName: FqName? defined in org.jetbrains.kotlin.idea.core.completion.DeclarationLookupObject[DeserializedPropertyDescriptor]

'default' @ [57:59] ==> enum entry default defined in org.jetbrains.kotlin.idea.completion.NotImportedWeigher.Weight[FakeCallableDescriptorForObject]

'when (classifier.classify(fqName, o is PackageLookupObject)) {
            ImportableFqNameClassifier.Classification.siblingImported -> Weight.siblingImported
            ImportableFqNameClassifier.Classification.notImported -> Weight.notImported
            ImportableFqNameClassifier.Classification.notToBeUsedInKotlin -> Weight.notToBeUsedInKotlin
            else -> Weight.default
        }' @ [58:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Comparable<*>, entry1: Comparable<*>, entry2: Comparable<*>, entry3: Comparable<*>): Comparable<*>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Comparable<*>

'classifier' @ [58:22] ==> private final val classifier: ImportableFqNameClassifier defined in org.jetbrains.kotlin.idea.completion.NotImportedWeigher[PropertyDescriptorImpl]

'classify' @ [58:33] ==> public final fun classify(fqName: FqName, isPackage: Boolean): ImportableFqNameClassifier.Classification defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier[DeserializedSimpleFunctionDescriptor]

'fqName' @ [58:42] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.completion.NotImportedWeigher.weigh[LocalVariableDescriptor]

'o' @ [58:50] ==> val o: DeclarationLookupObject? defined in org.jetbrains.kotlin.idea.completion.NotImportedWeigher.weigh[LocalVariableDescriptor]

'siblingImported' @ [59:55] ==> enum entry siblingImported defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.Classification[FakeCallableDescriptorForObject]

'siblingImported' @ [59:81] ==> enum entry siblingImported defined in org.jetbrains.kotlin.idea.completion.NotImportedWeigher.Weight[FakeCallableDescriptorForObject]

'notImported' @ [60:55] ==> enum entry notImported defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.Classification[FakeCallableDescriptorForObject]

'notImported' @ [60:77] ==> enum entry notImported defined in org.jetbrains.kotlin.idea.completion.NotImportedWeigher.Weight[FakeCallableDescriptorForObject]

'notToBeUsedInKotlin' @ [61:55] ==> enum entry notToBeUsedInKotlin defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.Classification[FakeCallableDescriptorForObject]

'notToBeUsedInKotlin' @ [61:85] ==> enum entry notToBeUsedInKotlin defined in org.jetbrains.kotlin.idea.completion.NotImportedWeigher.Weight[FakeCallableDescriptorForObject]

'default' @ [62:28] ==> enum entry default defined in org.jetbrains.kotlin.idea.completion.NotImportedWeigher.Weight[FakeCallableDescriptorForObject]

'LookupElementWeigher' @ [67:92] ==> protected/*protected and package*/ constructor LookupElementWeigher(p0: (String..String?)) defined in com.intellij.codeInsight.lookup.LookupElementWeigher[JavaClassConstructorDescriptor]

'element' @ [69:13] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.NotImportedStaticMemberWeigher.weigh[ValueParameterDescriptorImpl]

'getUserData' @ [69:21] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(ItemPriority..ItemPriority?)>): ItemPriority? defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ItemPriority

'ITEM_PRIORITY_KEY' @ [69:33] ==> public val ITEM_PRIORITY_KEY: Key<ItemPriority> defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[PropertyDescriptorImpl]

'STATIC_MEMBER' @ [69:68] ==> enum entry STATIC_MEMBER defined in org.jetbrains.kotlin.idea.completion.ItemPriority[FakeCallableDescriptorForObject]

'?:' @ [70:22] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: FqName?, right: FqName): FqName[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> FqName

'element' @ [70:23] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.NotImportedStaticMemberWeigher.weigh[ValueParameterDescriptorImpl]

'`object`' @ [70:31] ==> public final val LookupElement.`object`: Any[MyPropertyDescriptor]

'importableFqName' @ [70:68] ==> public abstract val importableFqName: FqName? defined in org.jetbrains.kotlin.idea.core.completion.DeclarationLookupObject[DeserializedPropertyDescriptor]

'classifier' @ [71:16] ==> private final val classifier: ImportableFqNameClassifier defined in org.jetbrains.kotlin.idea.completion.NotImportedStaticMemberWeigher[PropertyDescriptorImpl]

'classify' @ [71:27] ==> public final fun classify(fqName: FqName, isPackage: Boolean): ImportableFqNameClassifier.Classification defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier[DeserializedSimpleFunctionDescriptor]

'fqName' @ [71:36] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.completion.NotImportedStaticMemberWeigher.weigh[LocalVariableDescriptor]

'parent' @ [71:43] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'LookupElementWeigher' @ [75:77] ==> protected/*protected and package*/ constructor LookupElementWeigher(p0: (String..String?)) defined in com.intellij.codeInsight.lookup.LookupElementWeigher[JavaClassConstructorDescriptor]

'element' @ [84:17] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.ImportedWeigher.weigh[ValueParameterDescriptorImpl]

'`object`' @ [84:25] ==> public final val LookupElement.`object`: Any[MyPropertyDescriptor]

'o' @ [85:22] ==> val o: DeclarationLookupObject? defined in org.jetbrains.kotlin.idea.completion.ImportedWeigher.weigh[LocalVariableDescriptor]

'importableFqName' @ [85:25] ==> public abstract val importableFqName: FqName? defined in org.jetbrains.kotlin.idea.core.completion.DeclarationLookupObject[DeserializedPropertyDescriptor]

'when (classifier.classify(fqName, o is PackageLookupObject)) {
            ImportableFqNameClassifier.Classification.fromCurrentPackage -> Weight.currentPackage
            ImportableFqNameClassifier.Classification.defaultImport -> Weight.defaultImport
            ImportableFqNameClassifier.Classification.preciseImport -> Weight.preciseImport
            ImportableFqNameClassifier.Classification.allUnderImport -> Weight.allUnderImport
            else -> null
        }' @ [86:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Comparable<*>?, entry1: Comparable<*>?, entry2: Comparable<*>?, entry3: Comparable<*>?, entry4: Comparable<*>?): Comparable<*>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Comparable<*>?

'classifier' @ [86:22] ==> private final val classifier: ImportableFqNameClassifier defined in org.jetbrains.kotlin.idea.completion.ImportedWeigher[PropertyDescriptorImpl]

'classify' @ [86:33] ==> public final fun classify(fqName: FqName, isPackage: Boolean): ImportableFqNameClassifier.Classification defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier[DeserializedSimpleFunctionDescriptor]

'fqName' @ [86:42] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.completion.ImportedWeigher.weigh[LocalVariableDescriptor]

'o' @ [86:50] ==> val o: DeclarationLookupObject? defined in org.jetbrains.kotlin.idea.completion.ImportedWeigher.weigh[LocalVariableDescriptor]

'fromCurrentPackage' @ [87:55] ==> enum entry fromCurrentPackage defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.Classification[FakeCallableDescriptorForObject]

'currentPackage' @ [87:84] ==> enum entry currentPackage defined in org.jetbrains.kotlin.idea.completion.ImportedWeigher.Weight[FakeCallableDescriptorForObject]

'defaultImport' @ [88:55] ==> enum entry defaultImport defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.Classification[FakeCallableDescriptorForObject]

'defaultImport' @ [88:79] ==> enum entry defaultImport defined in org.jetbrains.kotlin.idea.completion.ImportedWeigher.Weight[FakeCallableDescriptorForObject]

'preciseImport' @ [89:55] ==> enum entry preciseImport defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.Classification[FakeCallableDescriptorForObject]

'preciseImport' @ [89:79] ==> enum entry preciseImport defined in org.jetbrains.kotlin.idea.completion.ImportedWeigher.Weight[FakeCallableDescriptorForObject]

'allUnderImport' @ [90:55] ==> enum entry allUnderImport defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.Classification[FakeCallableDescriptorForObject]

'allUnderImport' @ [90:80] ==> enum entry allUnderImport defined in org.jetbrains.kotlin.idea.completion.ImportedWeigher.Weight[FakeCallableDescriptorForObject]

'CompletionWeigher' @ [97:46] ==> public constructor CompletionWeigher() defined in com.intellij.codeInsight.completion.CompletionWeigher[JavaClassConstructorDescriptor]

'?:' @ [99:26] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'element' @ [99:27] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.KotlinLookupElementProximityWeigher.weigh[ValueParameterDescriptorImpl]

'`object`' @ [99:35] ==> public final val LookupElement.`object`: Any[MyPropertyDescriptor]

'psiElement' @ [99:74] ==> public abstract val psiElement: PsiElement? defined in org.jetbrains.kotlin.idea.core.completion.DeclarationLookupObject[DeserializedPropertyDescriptor]

'getProximity' @ [100:39] ==> @Nullable public final fun getProximity(p0: (() -> (PsiElement..PsiElement?)..(() -> (PsiElement..PsiElement?))?), p1: (PsiElement..PsiElement?), p2: (ProcessingContext..ProcessingContext?)): WeighingComparable<(PsiElement..PsiElement?), (ProximityLocation..ProximityLocation?)>? defined in com.intellij.psi.util.proximity.PsiProximityComparator[SamAdapterFunctionDescriptor]

'psiElement' @ [100:54] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.completion.KotlinLookupElementProximityWeigher.weigh[LocalVariableDescriptor]

'location' @ [100:68] ==> value-parameter location: CompletionLocation defined in org.jetbrains.kotlin.idea.completion.KotlinLookupElementProximityWeigher.weigh[ValueParameterDescriptorImpl]

'completionParameters' @ [100:77] ==> public final val CompletionLocation.completionParameters: (CompletionParameters..CompletionParameters?)[MyPropertyDescriptor]

'position' @ [100:98] ==> public final val CompletionParameters.position: PsiElement[MyPropertyDescriptor]

'location' @ [100:108] ==> value-parameter location: CompletionLocation defined in org.jetbrains.kotlin.idea.completion.KotlinLookupElementProximityWeigher.weigh[ValueParameterDescriptorImpl]

'processingContext' @ [100:117] ==> public final val CompletionLocation.processingContext: (ProcessingContext..ProcessingContext?)[MyPropertyDescriptor]

'LookupElementWeigher' @ [104:41] ==> protected/*protected and package*/ constructor LookupElementWeigher(p0: (String..String?)) defined in com.intellij.codeInsight.lookup.LookupElementWeigher[JavaClassConstructorDescriptor]

'element' @ [106:15] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.SmartCompletionPriorityWeigher.weigh[ValueParameterDescriptorImpl]

'getUserData' @ [106:23] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(SmartCompletionItemPriority..SmartCompletionItemPriority?)>): SmartCompletionItemPriority? defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SmartCompletionItemPriority

'SMART_COMPLETION_ITEM_PRIORITY_KEY' @ [106:35] ==> public val SMART_COMPLETION_ITEM_PRIORITY_KEY: Key<SmartCompletionItemPriority> defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[PropertyDescriptorImpl]

'DEFAULT' @ [106:102] ==> enum entry DEFAULT defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'LookupElementWeigher' @ [109:22] ==> protected/*protected and package*/ constructor LookupElementWeigher(p0: (String..String?)) defined in com.intellij.codeInsight.lookup.LookupElementWeigher[JavaClassConstructorDescriptor]

'element' @ [119:17] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.KindWeigher.weigh[ValueParameterDescriptorImpl]

'`object`' @ [119:25] ==> public final val LookupElement.`object`: Any[MyPropertyDescriptor]

'when (o) {
            is PackageLookupObject -> Weight.packages

            is DeclarationLookupObject -> {
                val descriptor = o.descriptor
                when (descriptor) {
                    is VariableDescriptor, is FunctionDescriptor -> Weight.callable
                    is ClassDescriptor -> if (descriptor.kind == ClassKind.ENUM_ENTRY) Weight.enumMember else Weight.default
                    else -> Weight.default
                }
            }

            is KeywordLookupObject -> Weight.keyword

            else -> Weight.default
        }' @ [121:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Comparable<*>, entry1: Comparable<*>, entry2: Comparable<*>, entry3: Comparable<*>): Comparable<*>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Comparable<*>

'o' @ [121:22] ==> val o: Any defined in org.jetbrains.kotlin.idea.completion.KindWeigher.weigh[LocalVariableDescriptor]

'packages' @ [122:46] ==> enum entry packages defined in org.jetbrains.kotlin.idea.completion.KindWeigher.Weight[FakeCallableDescriptorForObject]

'o' @ [125:34] ==> val o: Any defined in org.jetbrains.kotlin.idea.completion.KindWeigher.weigh[LocalVariableDescriptor]

'descriptor' @ [125:36] ==> public abstract val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.completion.DeclarationLookupObject[DeserializedPropertyDescriptor]

'when (descriptor) {
                    is VariableDescriptor, is FunctionDescriptor -> Weight.callable
                    is ClassDescriptor -> if (descriptor.kind == ClassKind.ENUM_ENTRY) Weight.enumMember else Weight.default
                    else -> Weight.default
                }' @ [126:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KindWeigher.Weight, entry1: KindWeigher.Weight, entry2: KindWeigher.Weight): KindWeigher.Weight[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Weight

'descriptor' @ [126:23] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.KindWeigher.weigh[LocalVariableDescriptor]

'callable' @ [127:76] ==> enum entry callable defined in org.jetbrains.kotlin.idea.completion.KindWeigher.Weight[FakeCallableDescriptorForObject]

'if (descriptor.kind == ClassKind.ENUM_ENTRY) Weight.enumMember else Weight.default' @ [128:43] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KindWeigher.Weight, elseBranch: KindWeigher.Weight): KindWeigher.Weight[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Weight

'descriptor' @ [128:47] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.KindWeigher.weigh[LocalVariableDescriptor]

'kind' @ [128:58] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_ENTRY' @ [128:76] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'enumMember' @ [128:95] ==> enum entry enumMember defined in org.jetbrains.kotlin.idea.completion.KindWeigher.Weight[FakeCallableDescriptorForObject]

'default' @ [128:118] ==> enum entry default defined in org.jetbrains.kotlin.idea.completion.KindWeigher.Weight[FakeCallableDescriptorForObject]

'default' @ [129:36] ==> enum entry default defined in org.jetbrains.kotlin.idea.completion.KindWeigher.Weight[FakeCallableDescriptorForObject]

'keyword' @ [133:46] ==> enum entry keyword defined in org.jetbrains.kotlin.idea.completion.KindWeigher.Weight[FakeCallableDescriptorForObject]

'default' @ [135:28] ==> enum entry default defined in org.jetbrains.kotlin.idea.completion.KindWeigher.Weight[FakeCallableDescriptorForObject]

'LookupElementWeigher' @ [140:26] ==> protected/*protected and package*/ constructor LookupElementWeigher(p0: (String..String?)) defined in com.intellij.codeInsight.lookup.LookupElementWeigher[JavaClassConstructorDescriptor]

'weight1' @ [159:17] ==> public final val weight1: CallableWeigher.Weight1 defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.CompoundWeight[PropertyDescriptorImpl]

'other' @ [159:28] ==> value-parameter other: CallableWeigher.CompoundWeight defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.CompoundWeight.compareTo[ValueParameterDescriptorImpl]

'weight1' @ [159:34] ==> public final val weight1: CallableWeigher.Weight1 defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.CompoundWeight[PropertyDescriptorImpl]

'weight1' @ [159:50] ==> public final val weight1: CallableWeigher.Weight1 defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.CompoundWeight[PropertyDescriptorImpl]

'compareTo' @ [159:58] ==> public final fun compareTo(other: CallableWeigher.Weight1): Int defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.Weight1[DeserializedSimpleFunctionDescriptor]

'other' @ [159:68] ==> value-parameter other: CallableWeigher.CompoundWeight defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.CompoundWeight.compareTo[ValueParameterDescriptorImpl]

'weight1' @ [159:74] ==> public final val weight1: CallableWeigher.Weight1 defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.CompoundWeight[PropertyDescriptorImpl]

'receiverIndex' @ [160:17] ==> public final val receiverIndex: Int defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.CompoundWeight[PropertyDescriptorImpl]

'other' @ [160:34] ==> value-parameter other: CallableWeigher.CompoundWeight defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.CompoundWeight.compareTo[ValueParameterDescriptorImpl]

'receiverIndex' @ [160:40] ==> public final val receiverIndex: Int defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.CompoundWeight[PropertyDescriptorImpl]

'receiverIndex' @ [160:62] ==> public final val receiverIndex: Int defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.CompoundWeight[PropertyDescriptorImpl]

'compareTo' @ [160:76] ==> public open fun compareTo(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'other' @ [160:86] ==> value-parameter other: CallableWeigher.CompoundWeight defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.CompoundWeight.compareTo[ValueParameterDescriptorImpl]

'receiverIndex' @ [160:92] ==> public final val receiverIndex: Int defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.CompoundWeight[PropertyDescriptorImpl]

'weight2' @ [161:20] ==> public final val weight2: CallableWeigher.Weight2 defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.CompoundWeight[PropertyDescriptorImpl]

'compareTo' @ [161:28] ==> public final fun compareTo(other: CallableWeigher.Weight2): Int defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.Weight2[DeserializedSimpleFunctionDescriptor]

'other' @ [161:38] ==> value-parameter other: CallableWeigher.CompoundWeight defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.CompoundWeight.compareTo[ValueParameterDescriptorImpl]

'weight2' @ [161:44] ==> public final val weight2: CallableWeigher.Weight2 defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.CompoundWeight[PropertyDescriptorImpl]

'element' @ [166:22] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.weigh[ValueParameterDescriptorImpl]

'getUserData' @ [166:30] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(CallableWeight..CallableWeight?)>): CallableWeight? defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CallableWeight

'CALLABLE_WEIGHT_KEY' @ [166:42] ==> public val CALLABLE_WEIGHT_KEY: Key<CallableWeight> defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[PropertyDescriptorImpl]

'when (weight.enum) {
            CallableWeightEnum.local -> Weight1.local

            CallableWeightEnum.thisClassMember,
            CallableWeightEnum.baseClassMember,
            CallableWeightEnum.thisTypeExtension,
            CallableWeightEnum.baseTypeExtension -> Weight1.memberOrExtension

            CallableWeightEnum.globalOrStatic -> Weight1.globalOrStatic

            CallableWeightEnum.typeParameterExtension -> Weight1.typeParameterExtension

            CallableWeightEnum.receiverCastRequired -> Weight1.receiverCastRequired
        }' @ [167:18] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CallableWeigher.Weight1, entry1: CallableWeigher.Weight1, entry2: CallableWeigher.Weight1, entry3: CallableWeigher.Weight1, entry4: CallableWeigher.Weight1): CallableWeigher.Weight1[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Weight1

'weight' @ [167:24] ==> val weight: CallableWeight defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.weigh[LocalVariableDescriptor]

'enum' @ [167:31] ==> public final val enum: CallableWeightEnum defined in org.jetbrains.kotlin.idea.completion.CallableWeight[PropertyDescriptorImpl]

'local' @ [168:32] ==> enum entry local defined in org.jetbrains.kotlin.idea.completion.CallableWeightEnum[FakeCallableDescriptorForObject]

'local' @ [168:49] ==> enum entry local defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.Weight1[FakeCallableDescriptorForObject]

'thisClassMember' @ [170:32] ==> enum entry thisClassMember defined in org.jetbrains.kotlin.idea.completion.CallableWeightEnum[FakeCallableDescriptorForObject]

'baseClassMember' @ [171:32] ==> enum entry baseClassMember defined in org.jetbrains.kotlin.idea.completion.CallableWeightEnum[FakeCallableDescriptorForObject]

'thisTypeExtension' @ [172:32] ==> enum entry thisTypeExtension defined in org.jetbrains.kotlin.idea.completion.CallableWeightEnum[FakeCallableDescriptorForObject]

'baseTypeExtension' @ [173:32] ==> enum entry baseTypeExtension defined in org.jetbrains.kotlin.idea.completion.CallableWeightEnum[FakeCallableDescriptorForObject]

'memberOrExtension' @ [173:61] ==> enum entry memberOrExtension defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.Weight1[FakeCallableDescriptorForObject]

'globalOrStatic' @ [175:32] ==> enum entry globalOrStatic defined in org.jetbrains.kotlin.idea.completion.CallableWeightEnum[FakeCallableDescriptorForObject]

'globalOrStatic' @ [175:58] ==> enum entry globalOrStatic defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.Weight1[FakeCallableDescriptorForObject]

'typeParameterExtension' @ [177:32] ==> enum entry typeParameterExtension defined in org.jetbrains.kotlin.idea.completion.CallableWeightEnum[FakeCallableDescriptorForObject]

'typeParameterExtension' @ [177:66] ==> enum entry typeParameterExtension defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.Weight1[FakeCallableDescriptorForObject]

'receiverCastRequired' @ [179:32] ==> enum entry receiverCastRequired defined in org.jetbrains.kotlin.idea.completion.CallableWeightEnum[FakeCallableDescriptorForObject]

'receiverCastRequired' @ [179:64] ==> enum entry receiverCastRequired defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.Weight1[FakeCallableDescriptorForObject]

'when (weight.enum) {
            CallableWeightEnum.thisClassMember -> Weight2.thisClassMember
            CallableWeightEnum.baseClassMember -> Weight2.baseClassMember
            CallableWeightEnum.thisTypeExtension -> Weight2.thisTypeExtension
            CallableWeightEnum.baseTypeExtension -> Weight2.baseTypeExtension
            else -> Weight2.other
        }' @ [181:18] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CallableWeigher.Weight2, entry1: CallableWeigher.Weight2, entry2: CallableWeigher.Weight2, entry3: CallableWeigher.Weight2, entry4: CallableWeigher.Weight2): CallableWeigher.Weight2[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Weight2

'weight' @ [181:24] ==> val weight: CallableWeight defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.weigh[LocalVariableDescriptor]

'enum' @ [181:31] ==> public final val enum: CallableWeightEnum defined in org.jetbrains.kotlin.idea.completion.CallableWeight[PropertyDescriptorImpl]

'thisClassMember' @ [182:32] ==> enum entry thisClassMember defined in org.jetbrains.kotlin.idea.completion.CallableWeightEnum[FakeCallableDescriptorForObject]

'thisClassMember' @ [182:59] ==> enum entry thisClassMember defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.Weight2[FakeCallableDescriptorForObject]

'baseClassMember' @ [183:32] ==> enum entry baseClassMember defined in org.jetbrains.kotlin.idea.completion.CallableWeightEnum[FakeCallableDescriptorForObject]

'baseClassMember' @ [183:59] ==> enum entry baseClassMember defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.Weight2[FakeCallableDescriptorForObject]

'thisTypeExtension' @ [184:32] ==> enum entry thisTypeExtension defined in org.jetbrains.kotlin.idea.completion.CallableWeightEnum[FakeCallableDescriptorForObject]

'thisTypeExtension' @ [184:61] ==> enum entry thisTypeExtension defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.Weight2[FakeCallableDescriptorForObject]

'baseTypeExtension' @ [185:32] ==> enum entry baseTypeExtension defined in org.jetbrains.kotlin.idea.completion.CallableWeightEnum[FakeCallableDescriptorForObject]

'baseTypeExtension' @ [185:61] ==> enum entry baseTypeExtension defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.Weight2[FakeCallableDescriptorForObject]

'other' @ [186:29] ==> enum entry other defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.Weight2[FakeCallableDescriptorForObject]

'CompoundWeight' @ [188:16] ==> public constructor CompoundWeight(weight1: CallableWeigher.Weight1, receiverIndex: Int, weight2: CallableWeigher.Weight2) defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.CompoundWeight[ClassConstructorDescriptorImpl]

'w1' @ [188:31] ==> val w1: CallableWeigher.Weight1 defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.weigh[LocalVariableDescriptor]

'weight' @ [188:35] ==> val weight: CallableWeight defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.weigh[LocalVariableDescriptor]

'receiverIndex' @ [188:42] ==> public final val receiverIndex: Int? defined in org.jetbrains.kotlin.idea.completion.CallableWeight[PropertyDescriptorImpl]

'Int' @ [188:59] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [188:63] ==> public const final val MAX_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'w2' @ [188:74] ==> val w2: CallableWeigher.Weight2 defined in org.jetbrains.kotlin.idea.completion.CallableWeigher.weigh[LocalVariableDescriptor]

'LookupElementWeigher' @ [192:36] ==> protected/*protected and package*/ constructor LookupElementWeigher(p0: (String..String?)) defined in com.intellij.codeInsight.lookup.LookupElementWeigher[JavaClassConstructorDescriptor]

'?:' @ [199:26] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: DeclarationDescriptor?, right: DeclarationDescriptor): DeclarationDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> DeclarationDescriptor

'element' @ [199:27] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.VariableOrFunctionWeigher.weigh[ValueParameterDescriptorImpl]

'`object`' @ [199:35] ==> public final val LookupElement.`object`: Any[MyPropertyDescriptor]

'descriptor' @ [199:74] ==> public abstract val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.completion.DeclarationLookupObject[DeserializedPropertyDescriptor]

'when (descriptor) {
            is VariableDescriptor -> Weight.variable
            is FunctionDescriptor -> Weight.function
            else -> null
        }' @ [200:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Comparable<*>?, entry1: Comparable<*>?, entry2: Comparable<*>?): Comparable<*>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Comparable<*>?

'descriptor' @ [200:22] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.VariableOrFunctionWeigher.weigh[LocalVariableDescriptor]

'variable' @ [201:45] ==> enum entry variable defined in org.jetbrains.kotlin.idea.completion.VariableOrFunctionWeigher.Weight[FakeCallableDescriptorForObject]

'function' @ [202:45] ==> enum entry function defined in org.jetbrains.kotlin.idea.completion.VariableOrFunctionWeigher.Weight[FakeCallableDescriptorForObject]

'LookupElementWeigher' @ [211:47] ==> protected/*protected and package*/ constructor LookupElementWeigher(p0: (String..String?), p1: Boolean, p2: Boolean) defined in com.intellij.codeInsight.lookup.LookupElementWeigher[JavaClassConstructorDescriptor]

'?:' @ [213:24] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PropertyDescriptor?, right: PropertyDescriptor): PropertyDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PropertyDescriptor

'element' @ [213:25] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.PreferGetSetMethodsToPropertyWeigher.weigh[ValueParameterDescriptorImpl]

'`object`' @ [213:33] ==> public final val LookupElement.`object`: Any[MyPropertyDescriptor]

'descriptor' @ [213:72] ==> public abstract val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.completion.DeclarationLookupObject[DeserializedPropertyDescriptor]

'context' @ [214:29] ==> value-parameter context: WeighingContext defined in org.jetbrains.kotlin.idea.completion.PreferGetSetMethodsToPropertyWeigher.weigh[ValueParameterDescriptorImpl]

'itemMatcher' @ [214:37] ==> @NotNull public abstract fun itemMatcher(@NotNull p0: LookupElement): PrefixMatcher defined in com.intellij.codeInsight.lookup.WeighingContext[JavaMethodDescriptor]

'element' @ [214:49] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.PreferGetSetMethodsToPropertyWeigher.weigh[ValueParameterDescriptorImpl]

'prefixMatcher' @ [215:13] ==> val prefixMatcher: PrefixMatcher defined in org.jetbrains.kotlin.idea.completion.PreferGetSetMethodsToPropertyWeigher.weigh[LocalVariableDescriptor]

'prefixMatches' @ [215:27] ==> public abstract fun prefixMatches(@NotNull p0: String): Boolean defined in com.intellij.codeInsight.completion.PrefixMatcher[JavaMethodDescriptor]

'property' @ [215:41] ==> val property: PropertyDescriptor defined in org.jetbrains.kotlin.idea.completion.PreferGetSetMethodsToPropertyWeigher.weigh[LocalVariableDescriptor]

'name' @ [215:50] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [215:55] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'element' @ [216:36] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.PreferGetSetMethodsToPropertyWeigher.weigh[ValueParameterDescriptorImpl]

'allLookupStrings' @ [216:44] ==> public final val LookupElement.allLookupStrings: (MutableSet<(String..String?)>..Set<(String..String?)>?)[MyPropertyDescriptor]

'filter' @ [216:61] ==> public inline fun <T> Iterable<(String..String?)>.filter(predicate: ((String..String?)) -> Boolean): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'prefixMatcher' @ [216:70] ==> val prefixMatcher: PrefixMatcher defined in org.jetbrains.kotlin.idea.completion.PreferGetSetMethodsToPropertyWeigher.weigh[LocalVariableDescriptor]

'prefixMatches' @ [216:84] ==> public abstract fun prefixMatches(@NotNull p0: String): Boolean defined in com.intellij.codeInsight.completion.PrefixMatcher[JavaMethodDescriptor]

'it' @ [216:98] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.completion.PreferGetSetMethodsToPropertyWeigher.weigh.<anonymous>[ValueParameterDescriptorImpl]

'if (matchedLookupStrings.all { it.startsWith("get") || it.startsWith("set") }) 1 else 0' @ [217:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'matchedLookupStrings' @ [217:20] ==> val matchedLookupStrings: List<(String..String?)> defined in org.jetbrains.kotlin.idea.completion.PreferGetSetMethodsToPropertyWeigher.weigh[LocalVariableDescriptor]

'all' @ [217:41] ==> public inline fun <T> Iterable<(String..String?)>.all(predicate: ((String..String?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'it' @ [217:47] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.completion.PreferGetSetMethodsToPropertyWeigher.weigh.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [217:50] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [217:71] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.completion.PreferGetSetMethodsToPropertyWeigher.weigh.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [217:74] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'LookupElementWeigher' @ [221:28] ==> protected/*protected and package*/ constructor LookupElementWeigher(p0: (String..String?)) defined in com.intellij.codeInsight.lookup.LookupElementWeigher[JavaClassConstructorDescriptor]

'element' @ [223:17] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.DeprecatedWeigher.weigh[ValueParameterDescriptorImpl]

'`object`' @ [223:25] ==> public final val LookupElement.`object`: Any[MyPropertyDescriptor]

'if (o.isDeprecated) 1 else 0' @ [224:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'o' @ [224:20] ==> val o: DeclarationLookupObject defined in org.jetbrains.kotlin.idea.completion.DeprecatedWeigher.weigh[LocalVariableDescriptor]

'isDeprecated' @ [224:22] ==> public abstract val isDeprecated: Boolean defined in org.jetbrains.kotlin.idea.core.completion.DeclarationLookupObject[DeserializedPropertyDescriptor]

'LookupElementWeigher' @ [228:36] ==> protected/*protected and package*/ constructor LookupElementWeigher(p0: (String..String?), p1: Boolean, p2: Boolean) defined in com.intellij.codeInsight.lookup.LookupElementWeigher[JavaClassConstructorDescriptor]

'context' @ [239:22] ==> value-parameter context: WeighingContext defined in org.jetbrains.kotlin.idea.completion.PreferMatchingItemWeigher.weigh[ValueParameterDescriptorImpl]

'itemPattern' @ [239:30] ==> @NotNull public abstract fun itemPattern(@NotNull p0: LookupElement): String defined in com.intellij.codeInsight.lookup.WeighingContext[JavaMethodDescriptor]

'element' @ [239:42] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.PreferMatchingItemWeigher.weigh[ValueParameterDescriptorImpl]

'if (element.lookupString != prefix) {
            return Weight.notExactMatch
        }
        else {
            val o = element.`object`
            return when (o) {
                is KeywordLookupObject -> Weight.keywordExactMatch

                is DeclarationLookupObject -> {
                    val smartCompletionPriority = element.getUserData(SMART_COMPLETION_ITEM_PRIORITY_KEY)
                    when {
                        smartCompletionPriority != null && smartCompletionPriority != SmartCompletionItemPriority.DEFAULT -> Weight.specialExactMatch
                        element.getUserData(NOT_IMPORTED_KEY) != null -> Weight.notImportedExactMatch
                        o.descriptor is FunctionDescriptor -> Weight.functionExactMatch
                        else -> Weight.defaultExactMatch
                    }
                }

                else -> Weight.defaultExactMatch
            }
        }' @ [240:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'element' @ [240:13] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.PreferMatchingItemWeigher.weigh[ValueParameterDescriptorImpl]

'lookupString' @ [240:21] ==> public final val LookupElement.lookupString: String[MyPropertyDescriptor]

'prefix' @ [240:37] ==> val prefix: String defined in org.jetbrains.kotlin.idea.completion.PreferMatchingItemWeigher.weigh[LocalVariableDescriptor]

'notExactMatch' @ [241:27] ==> enum entry notExactMatch defined in org.jetbrains.kotlin.idea.completion.PreferMatchingItemWeigher.Weight[FakeCallableDescriptorForObject]

'element' @ [244:21] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.PreferMatchingItemWeigher.weigh[ValueParameterDescriptorImpl]

'`object`' @ [244:29] ==> public final val LookupElement.`object`: Any[MyPropertyDescriptor]

'when (o) {
                is KeywordLookupObject -> Weight.keywordExactMatch

                is DeclarationLookupObject -> {
                    val smartCompletionPriority = element.getUserData(SMART_COMPLETION_ITEM_PRIORITY_KEY)
                    when {
                        smartCompletionPriority != null && smartCompletionPriority != SmartCompletionItemPriority.DEFAULT -> Weight.specialExactMatch
                        element.getUserData(NOT_IMPORTED_KEY) != null -> Weight.notImportedExactMatch
                        o.descriptor is FunctionDescriptor -> Weight.functionExactMatch
                        else -> Weight.defaultExactMatch
                    }
                }

                else -> Weight.defaultExactMatch
            }' @ [245:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Comparable<*>, entry1: Comparable<*>, entry2: Comparable<*>): Comparable<*>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Comparable<*>

'o' @ [245:26] ==> val o: Any defined in org.jetbrains.kotlin.idea.completion.PreferMatchingItemWeigher.weigh[LocalVariableDescriptor]

'keywordExactMatch' @ [246:50] ==> enum entry keywordExactMatch defined in org.jetbrains.kotlin.idea.completion.PreferMatchingItemWeigher.Weight[FakeCallableDescriptorForObject]

'element' @ [249:51] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.PreferMatchingItemWeigher.weigh[ValueParameterDescriptorImpl]

'getUserData' @ [249:59] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(SmartCompletionItemPriority..SmartCompletionItemPriority?)>): SmartCompletionItemPriority? defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SmartCompletionItemPriority

'SMART_COMPLETION_ITEM_PRIORITY_KEY' @ [249:71] ==> public val SMART_COMPLETION_ITEM_PRIORITY_KEY: Key<SmartCompletionItemPriority> defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[PropertyDescriptorImpl]

'when {
                        smartCompletionPriority != null && smartCompletionPriority != SmartCompletionItemPriority.DEFAULT -> Weight.specialExactMatch
                        element.getUserData(NOT_IMPORTED_KEY) != null -> Weight.notImportedExactMatch
                        o.descriptor is FunctionDescriptor -> Weight.functionExactMatch
                        else -> Weight.defaultExactMatch
                    }' @ [250:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PreferMatchingItemWeigher.Weight, entry1: PreferMatchingItemWeigher.Weight, entry2: PreferMatchingItemWeigher.Weight, entry3: PreferMatchingItemWeigher.Weight): PreferMatchingItemWeigher.Weight[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Weight

'smartCompletionPriority' @ [251:25] ==> val smartCompletionPriority: SmartCompletionItemPriority? defined in org.jetbrains.kotlin.idea.completion.PreferMatchingItemWeigher.weigh[LocalVariableDescriptor]

'smartCompletionPriority' @ [251:60] ==> val smartCompletionPriority: SmartCompletionItemPriority? defined in org.jetbrains.kotlin.idea.completion.PreferMatchingItemWeigher.weigh[LocalVariableDescriptor]

'DEFAULT' @ [251:115] ==> enum entry DEFAULT defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'specialExactMatch' @ [251:133] ==> enum entry specialExactMatch defined in org.jetbrains.kotlin.idea.completion.PreferMatchingItemWeigher.Weight[FakeCallableDescriptorForObject]

'element' @ [252:25] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.PreferMatchingItemWeigher.weigh[ValueParameterDescriptorImpl]

'getUserData' @ [252:33] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(Unit..Unit?)>): Unit? defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'NOT_IMPORTED_KEY' @ [252:45] ==> public val NOT_IMPORTED_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[PropertyDescriptorImpl]

'notImportedExactMatch' @ [252:81] ==> enum entry notImportedExactMatch defined in org.jetbrains.kotlin.idea.completion.PreferMatchingItemWeigher.Weight[FakeCallableDescriptorForObject]

'o' @ [253:25] ==> val o: Any defined in org.jetbrains.kotlin.idea.completion.PreferMatchingItemWeigher.weigh[LocalVariableDescriptor]

'descriptor' @ [253:27] ==> public abstract val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.completion.DeclarationLookupObject[DeserializedPropertyDescriptor]

'functionExactMatch' @ [253:70] ==> enum entry functionExactMatch defined in org.jetbrains.kotlin.idea.completion.PreferMatchingItemWeigher.Weight[FakeCallableDescriptorForObject]

'defaultExactMatch' @ [254:40] ==> enum entry defaultExactMatch defined in org.jetbrains.kotlin.idea.completion.PreferMatchingItemWeigher.Weight[FakeCallableDescriptorForObject]

'defaultExactMatch' @ [258:32] ==> enum entry defaultExactMatch defined in org.jetbrains.kotlin.idea.completion.PreferMatchingItemWeigher.Weight[FakeCallableDescriptorForObject]

'LookupElementWeigher' @ [269:5] ==> protected/*protected and package*/ constructor LookupElementWeigher(p0: (String..String?), p1: Boolean, p2: Boolean) defined in com.intellij.codeInsight.lookup.LookupElementWeigher[JavaClassConstructorDescriptor]

'Key' @ [272:41] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'Key' @ [273:34] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'smartCompletion' @ [276:37] ==> private final val smartCompletion: SmartCompletion defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher[PropertyDescriptorImpl]

'descriptorsToSkip' @ [276:53] ==> public final val descriptorsToSkip: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'smartCompletion' @ [277:33] ==> private final val smartCompletion: SmartCompletion defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher[PropertyDescriptorImpl]

'expectedInfos' @ [277:49] ==> public final val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'values' @ [279:62] ==> public final fun values(): Array<SmartCompletionItemPriority> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[SimpleFunctionDescriptorImpl]

'size' @ [279:71] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'+' @ [282:15] ==> public final operator fun plus(other: Int): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'nameSimilarity' @ [282:16] ==> value-parameter nameSimilarity: Int defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.itemWeight[ValueParameterDescriptorImpl]

'toLong' @ [282:31] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'PRIORITY_COUNT' @ [282:50] ==> private final val PRIORITY_COUNT: Int defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher[PropertyDescriptorImpl]

'priority' @ [282:67] ==> value-parameter priority: SmartCompletionItemPriority defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.itemWeight[ValueParameterDescriptorImpl]

'ordinal' @ [282:76] ==> public final val ordinal: Int defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[DeserializedPropertyDescriptor]

'-' @ [288:45] ==> public final operator fun unaryMinus(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'element' @ [291:13] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh[ValueParameterDescriptorImpl]

'getUserData' @ [291:21] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(Unit..Unit?)>): Unit? defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'NAMED_ARGUMENT_KEY' @ [291:33] ==> public final val NAMED_ARGUMENT_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.Companion[PropertyDescriptorImpl]

'NAMED_ARGUMENT_WEIGHT' @ [292:20] ==> private final val NAMED_ARGUMENT_WEIGHT: Long defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher[PropertyDescriptorImpl]

'element' @ [295:24] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh[ValueParameterDescriptorImpl]

'getUserData' @ [295:32] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(SmartCompletionItemPriority..SmartCompletionItemPriority?)>): SmartCompletionItemPriority? defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SmartCompletionItemPriority

'SMART_COMPLETION_ITEM_PRIORITY_KEY' @ [295:44] ==> public val SMART_COMPLETION_ITEM_PRIORITY_KEY: Key<SmartCompletionItemPriority> defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[PropertyDescriptorImpl]

'priority' @ [296:13] ==> val priority: SmartCompletionItemPriority? defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh[LocalVariableDescriptor]

'itemWeight' @ [297:20] ==> private final fun itemWeight(priority: SmartCompletionItemPriority, nameSimilarity: Int): Long defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher[SimpleFunctionDescriptorImpl]

'priority' @ [297:31] ==> val priority: SmartCompletionItemPriority? defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh[LocalVariableDescriptor]

'element' @ [297:41] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh[ValueParameterDescriptorImpl]

'getUserData' @ [297:49] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(Int..Int?)>): Int? defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Int

'NAME_SIMILARITY_KEY' @ [297:61] ==> public val NAME_SIMILARITY_KEY: Key<Int> defined in org.jetbrains.kotlin.idea.completion.smart in file NameSimilarity.kt[PropertyDescriptorImpl]

'element' @ [300:17] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh[ValueParameterDescriptorImpl]

'`object`' @ [300:25] ==> public final val LookupElement.`object`: Any[MyPropertyDescriptor]

'in' @ [302:13] ==> public operator fun <@OnlyInputTypes T> Iterable<DeclarationDescriptor?>.contains(element: DeclarationDescriptor?): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> DeclarationDescriptor?

'o' @ [302:14] ==> val o: Any defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh[LocalVariableDescriptor]

'descriptor' @ [302:46] ==> public abstract val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.completion.DeclarationLookupObject[DeserializedPropertyDescriptor]

'descriptorsToSkip' @ [302:60] ==> private final val descriptorsToSkip: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher[PropertyDescriptorImpl]

'DESCRIPTOR_TO_SKIP_WEIGHT' @ [302:86] ==> private final val DESCRIPTOR_TO_SKIP_WEIGHT: Long defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher[PropertyDescriptorImpl]

'expectedInfos' @ [304:13] ==> private final val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher[PropertyDescriptorImpl]

'isEmpty' @ [304:27] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'NO_MATCH_WEIGHT' @ [304:45] ==> private final val NO_MATCH_WEIGHT: Long defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher[PropertyDescriptorImpl]

'smartCompletion' @ [306:35] ==> private final val smartCompletion: SmartCompletion defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher[PropertyDescriptorImpl]

'smartCastCalculator' @ [306:51] ==> public final val smartCastCalculator: SmartCastCalculator defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'component1' @ [308:14] ==> public final operator fun component1(): Collection<FuzzyType> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [308:26] ==> public final operator fun component2(): Name? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'when (o) {
            is DeclarationLookupObject -> {
                val descriptor = o.descriptor ?: return NO_MATCH_WEIGHT
                descriptor.fuzzyTypesForSmartCompletion(smartCastCalculator, callTypeAndReceiver, resolutionFacade, bindingContext) to descriptor.name
            }

            is ThisItemLookupObject -> smartCastCalculator.types(o.receiverParameter).map { it.toFuzzyType(emptyList()) } to null

            else -> return NO_MATCH_WEIGHT
        }' @ [308:34] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Pair<Collection<FuzzyType>, Name?>, entry1: Pair<Collection<FuzzyType>, Name?>, entry2: Pair<Collection<FuzzyType>, Name?>): Pair<Collection<FuzzyType>, Name?>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Pair<Collection<FuzzyType>, Name?>

'o' @ [308:40] ==> val o: Any defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh[LocalVariableDescriptor]

'o' @ [310:34] ==> val o: Any defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh[LocalVariableDescriptor]

'descriptor' @ [310:36] ==> public abstract val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.completion.DeclarationLookupObject[DeserializedPropertyDescriptor]

'NO_MATCH_WEIGHT' @ [310:57] ==> private final val NO_MATCH_WEIGHT: Long defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher[PropertyDescriptorImpl]

'descriptor' @ [311:17] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh[LocalVariableDescriptor]

'fuzzyTypesForSmartCompletion' @ [311:28] ==> public fun DeclarationDescriptor.fuzzyTypesForSmartCompletion(smartCastCalculator: SmartCastCalculator, callTypeAndReceiver: CallTypeAndReceiver<*, *>, resolutionFacade: ResolutionFacade, bindingContext: BindingContext): Collection<FuzzyType> defined in org.jetbrains.kotlin.idea.completion.smart[SimpleFunctionDescriptorImpl]

'smartCastCalculator' @ [311:57] ==> val smartCastCalculator: SmartCastCalculator defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh[LocalVariableDescriptor]

'callTypeAndReceiver' @ [311:78] ==> private final val callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher[PropertyDescriptorImpl]

'resolutionFacade' @ [311:99] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher[PropertyDescriptorImpl]

'bindingContext' @ [311:117] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher[PropertyDescriptorImpl]

'descriptor' @ [311:136] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh[LocalVariableDescriptor]

'name' @ [311:147] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'smartCastCalculator' @ [314:40] ==> val smartCastCalculator: SmartCastCalculator defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh[LocalVariableDescriptor]

'types' @ [314:60] ==> public final fun types(thisReceiverParameter: ReceiverParameterDescriptor): Collection<KotlinType> defined in org.jetbrains.kotlin.idea.core.SmartCastCalculator[DeserializedSimpleFunctionDescriptor]

'o' @ [314:66] ==> val o: Any defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh[LocalVariableDescriptor]

'receiverParameter' @ [314:68] ==> public final val receiverParameter: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.idea.completion.ThisItemLookupObject[PropertyDescriptorImpl]

'map' @ [314:87] ==> public inline fun <T, R> Iterable<KotlinType>.map(transform: (KotlinType) -> FuzzyType): List<FuzzyType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> FuzzyType

'it' @ [314:93] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh.<anonymous>[ValueParameterDescriptorImpl]

'toFuzzyType' @ [314:96] ==> public fun KotlinType.toFuzzyType(freeParameters: Collection<TypeParameterDescriptor>): FuzzyType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [314:108] ==> public fun <T> emptyList(): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'NO_MATCH_WEIGHT' @ [316:28] ==> private final val NO_MATCH_WEIGHT: Long defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher[PropertyDescriptorImpl]

'fuzzyTypes' @ [319:13] ==> val fuzzyTypes: Collection<FuzzyType> defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh[LocalVariableDescriptor]

'isEmpty' @ [319:24] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'NO_MATCH_WEIGHT' @ [319:42] ==> private final val NO_MATCH_WEIGHT: Long defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher[PropertyDescriptorImpl]

'expectedInfos' @ [321:74] ==> private final val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher[PropertyDescriptorImpl]

'map' @ [321:88] ==> public inline fun <T, R> Iterable<ExpectedInfo>.map(transform: (ExpectedInfo) -> Pair<ExpectedInfo, ExpectedInfoMatch>): List<Pair<ExpectedInfo, ExpectedInfoMatch>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo
    <R> -> Pair<ExpectedInfo, ExpectedInfoMatch>

'it' @ [321:94] ==> value-parameter it: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh.<anonymous>[ValueParameterDescriptorImpl]

'fuzzyTypes' @ [321:100] ==> val fuzzyTypes: Collection<FuzzyType> defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh[LocalVariableDescriptor]

'matchExpectedInfo' @ [321:111] ==> public fun Collection<FuzzyType>.matchExpectedInfo(expectedInfo: ExpectedInfo): ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart[SimpleFunctionDescriptorImpl]

'it' @ [321:129] ==> value-parameter it: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh.<anonymous>[ValueParameterDescriptorImpl]

'matched' @ [322:13] ==> val matched: Collection<Pair<ExpectedInfo, ExpectedInfoMatch>> defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh[LocalVariableDescriptor]

'all' @ [322:21] ==> public inline fun <T> Iterable<Pair<ExpectedInfo, ExpectedInfoMatch>>.all(predicate: (Pair<ExpectedInfo, ExpectedInfoMatch>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<ExpectedInfo, ExpectedInfoMatch>

'it' @ [322:27] ==> value-parameter it: Pair<ExpectedInfo, ExpectedInfoMatch> defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [322:30] ==> public final val second: ExpectedInfoMatch defined in kotlin.Pair[DeserializedPropertyDescriptor]

'ExpectedInfoMatch' @ [322:40] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch[FakeCallableDescriptorForObject]

'noMatch' @ [322:58] ==> public final val noMatch: ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch.Companion[PropertyDescriptorImpl]

'NO_MATCH_WEIGHT' @ [322:76] ==> private final val NO_MATCH_WEIGHT: Long defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher[PropertyDescriptorImpl]

'if (name != null) {
            val matchingInfos = matched.filter { it.second != ExpectedInfoMatch.noMatch }.map { it.first }
            calcNameSimilarity(name.asString(), matchingInfos)
        }
        else {
            0
        }' @ [324:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'name' @ [324:34] ==> val name: Name? defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh[LocalVariableDescriptor]

'matched' @ [325:33] ==> val matched: Collection<Pair<ExpectedInfo, ExpectedInfoMatch>> defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh[LocalVariableDescriptor]

'filter' @ [325:41] ==> public inline fun <T> Iterable<Pair<ExpectedInfo, ExpectedInfoMatch>>.filter(predicate: (Pair<ExpectedInfo, ExpectedInfoMatch>) -> Boolean): List<Pair<ExpectedInfo, ExpectedInfoMatch>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<ExpectedInfo, ExpectedInfoMatch>

'it' @ [325:50] ==> value-parameter it: Pair<ExpectedInfo, ExpectedInfoMatch> defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [325:53] ==> public final val second: ExpectedInfoMatch defined in kotlin.Pair[DeserializedPropertyDescriptor]

'ExpectedInfoMatch' @ [325:63] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch[FakeCallableDescriptorForObject]

'noMatch' @ [325:81] ==> public final val noMatch: ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch.Companion[PropertyDescriptorImpl]

'map' @ [325:91] ==> public inline fun <T, R> Iterable<Pair<ExpectedInfo, ExpectedInfoMatch>>.map(transform: (Pair<ExpectedInfo, ExpectedInfoMatch>) -> ExpectedInfo): List<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<ExpectedInfo, ExpectedInfoMatch>
    <R> -> ExpectedInfo

'it' @ [325:97] ==> value-parameter it: Pair<ExpectedInfo, ExpectedInfoMatch> defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [325:100] ==> public final val first: ExpectedInfo defined in kotlin.Pair[DeserializedPropertyDescriptor]

'calcNameSimilarity' @ [326:13] ==> public fun calcNameSimilarity(name: String, expectedInfos: Collection<ExpectedInfo>): Int defined in org.jetbrains.kotlin.idea.completion.smart[SimpleFunctionDescriptorImpl]

'name' @ [326:32] ==> val name: Name? defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh[LocalVariableDescriptor]

'asString' @ [326:37] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'matchingInfos' @ [326:49] ==> val matchingInfos: List<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh[LocalVariableDescriptor]

'if (matched.any { it.second.isMatch() })
            itemWeight(SmartCompletionItemPriority.DEFAULT, nameSimilarity)
        else
            itemWeight(SmartCompletionItemPriority.NULLABLE, nameSimilarity)' @ [332:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Long, elseBranch: Long): Long[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Long

'matched' @ [332:20] ==> val matched: Collection<Pair<ExpectedInfo, ExpectedInfoMatch>> defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh[LocalVariableDescriptor]

'any' @ [332:28] ==> public inline fun <T> Iterable<Pair<ExpectedInfo, ExpectedInfoMatch>>.any(predicate: (Pair<ExpectedInfo, ExpectedInfoMatch>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<ExpectedInfo, ExpectedInfoMatch>

'it' @ [332:34] ==> value-parameter it: Pair<ExpectedInfo, ExpectedInfoMatch> defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [332:37] ==> public final val second: ExpectedInfoMatch defined in kotlin.Pair[DeserializedPropertyDescriptor]

'isMatch' @ [332:44] ==> public final fun isMatch(): Boolean defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch[SimpleFunctionDescriptorImpl]

'itemWeight' @ [333:13] ==> private final fun itemWeight(priority: SmartCompletionItemPriority, nameSimilarity: Int): Long defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher[SimpleFunctionDescriptorImpl]

'DEFAULT' @ [333:52] ==> enum entry DEFAULT defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'nameSimilarity' @ [333:61] ==> val nameSimilarity: Int defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh[LocalVariableDescriptor]

'itemWeight' @ [335:13] ==> private final fun itemWeight(priority: SmartCompletionItemPriority, nameSimilarity: Int): Long defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher[SimpleFunctionDescriptorImpl]

'NULLABLE' @ [335:52] ==> enum entry NULLABLE defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'nameSimilarity' @ [335:62] ==> val nameSimilarity: Int defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.weigh[LocalVariableDescriptor]

'LookupElementWeigher' @ [339:70] ==> protected/*protected and package*/ constructor LookupElementWeigher(p0: (String..String?), p1: Boolean, p2: Boolean) defined in com.intellij.codeInsight.lookup.LookupElementWeigher[JavaClassConstructorDescriptor]

'context' @ [340:35] ==> value-parameter context: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.PreferContextElementsWeigher.<init>[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [340:43] ==> public val DeclarationDescriptor.parentsWithSelf: Sequence<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'takeWhile' @ [341:14] ==> public fun <T> Sequence<DeclarationDescriptor>.takeWhile(predicate: (DeclarationDescriptor) -> Boolean): Sequence<DeclarationDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [341:26] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.PreferContextElementsWeigher.contextElements.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [342:14] ==> public fun <T> Sequence<DeclarationDescriptor>.toList(): List<DeclarationDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'flatMap' @ [343:14] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.flatMap(transform: (DeclarationDescriptor) -> Iterable<DeclarationDescriptor>): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> DeclarationDescriptor

'if (it is CallableDescriptor) it.findOriginalTopMostOverriddenDescriptors() else listOf(it)' @ [343:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<DeclarationDescriptor>, elseBranch: Collection<DeclarationDescriptor>): Collection<DeclarationDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<DeclarationDescriptor>

'it' @ [343:28] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.PreferContextElementsWeigher.contextElements.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [343:54] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.PreferContextElementsWeigher.contextElements.<anonymous>[ValueParameterDescriptorImpl]

'findOriginalTopMostOverriddenDescriptors' @ [343:57] ==> public fun <D : CallableDescriptor> CallableDescriptor.findOriginalTopMostOverriddenDescriptors(): Set<CallableDescriptor> defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : CallableDescriptor> -> CallableDescriptor

'listOf' @ [343:105] ==> public fun <T> listOf(element: DeclarationDescriptor): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [343:112] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.PreferContextElementsWeigher.contextElements.<anonymous>[ValueParameterDescriptorImpl]

'toSet' @ [344:14] ==> public fun <T> Iterable<DeclarationDescriptor>.toSet(): Set<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'contextElements' @ [345:39] ==> private final val contextElements: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.PreferContextElementsWeigher[PropertyDescriptorImpl]

'map' @ [345:55] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.map(transform: (DeclarationDescriptor) -> Name): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> Name

'it' @ [345:61] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.PreferContextElementsWeigher.contextElementNames.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [345:64] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'toSet' @ [345:71] ==> public fun <T> Iterable<Name>.toSet(): Set<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'element' @ [348:28] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.PreferContextElementsWeigher.weigh[ValueParameterDescriptorImpl]

'`object`' @ [348:36] ==> public final val LookupElement.`object`: Any[MyPropertyDescriptor]

'lookupObject' @ [349:26] ==> val lookupObject: DeclarationLookupObject defined in org.jetbrains.kotlin.idea.completion.PreferContextElementsWeigher.weigh[LocalVariableDescriptor]

'descriptor' @ [349:39] ==> public abstract val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.completion.DeclarationLookupObject[DeserializedPropertyDescriptor]

'descriptor' @ [350:16] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.PreferContextElementsWeigher.weigh[LocalVariableDescriptor]

'isContextElement' @ [350:27] ==> private final fun DeclarationDescriptor.isContextElement(): Boolean defined in org.jetbrains.kotlin.idea.completion.PreferContextElementsWeigher[SimpleFunctionDescriptorImpl]

'name' @ [354:13] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'contextElementNames' @ [354:22] ==> private final val contextElementNames: Set<Name> defined in org.jetbrains.kotlin.idea.completion.PreferContextElementsWeigher[PropertyDescriptorImpl]

'this' @ [356:13] ==> <this> defined in org.jetbrains.kotlin.idea.completion.PreferContextElementsWeigher.isContextElement[ReceiverParameterDescriptorImpl]

'this' @ [357:30] ==> <this> defined in org.jetbrains.kotlin.idea.completion.PreferContextElementsWeigher.isContextElement[ReceiverParameterDescriptorImpl]

'overriddenDescriptors' @ [357:35] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'overridden' @ [358:17] ==> val overridden: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.idea.completion.PreferContextElementsWeigher.isContextElement[LocalVariableDescriptor]

'isNotEmpty' @ [358:28] ==> @InlineOnly public inline fun <T> Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'overridden' @ [359:24] ==> val overridden: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.idea.completion.PreferContextElementsWeigher.isContextElement[LocalVariableDescriptor]

'any' @ [359:35] ==> public inline fun <T> Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>.any(predicate: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'it' @ [359:41] ==> value-parameter it: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.idea.completion.PreferContextElementsWeigher.isContextElement.<anonymous>[ValueParameterDescriptorImpl]

'isContextElement' @ [359:44] ==> private final fun DeclarationDescriptor.isContextElement(): Boolean defined in org.jetbrains.kotlin.idea.completion.PreferContextElementsWeigher[SimpleFunctionDescriptorImpl]

'original' @ [363:16] ==> public final val DeclarationDescriptor.original: DeclarationDescriptor[MyPropertyDescriptor]

'contextElements' @ [363:28] ==> private final val contextElements: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.PreferContextElementsWeigher[PropertyDescriptorImpl]

'LookupElementWeigher' @ [367:36] ==> protected/*protected and package*/ constructor LookupElementWeigher(p0: (String..String?)) defined in com.intellij.codeInsight.lookup.LookupElementWeigher[JavaClassConstructorDescriptor]

'element' @ [369:28] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.ByNameAlphabeticalWeigher.weigh[ValueParameterDescriptorImpl]

'`object`' @ [369:36] ==> public final val LookupElement.`object`: Any[MyPropertyDescriptor]

'lookupObject' @ [370:16] ==> val lookupObject: DeclarationLookupObject defined in org.jetbrains.kotlin.idea.completion.ByNameAlphabeticalWeigher.weigh[LocalVariableDescriptor]

'name' @ [370:29] ==> public abstract val name: Name? defined in org.jetbrains.kotlin.idea.core.completion.DeclarationLookupObject[DeserializedPropertyDescriptor]

'asString' @ [370:35] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'LookupElementWeigher' @ [374:38] ==> protected/*protected and package*/ constructor LookupElementWeigher(p0: (String..String?)) defined in com.intellij.codeInsight.lookup.LookupElementWeigher[JavaClassConstructorDescriptor]

'element' @ [376:28] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.PreferLessParametersWeigher.weigh[ValueParameterDescriptorImpl]

'`object`' @ [376:36] ==> public final val LookupElement.`object`: Any[MyPropertyDescriptor]

'lookupObject' @ [377:24] ==> val lookupObject: DeclarationLookupObject defined in org.jetbrains.kotlin.idea.completion.PreferLessParametersWeigher.weigh[LocalVariableDescriptor]

'descriptor' @ [377:37] ==> public abstract val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.completion.DeclarationLookupObject[DeserializedPropertyDescriptor]

'function' @ [378:16] ==> val function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.PreferLessParametersWeigher.weigh[LocalVariableDescriptor]

'valueParameters' @ [378:25] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [378:41] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'LookupElementWeigher' @ [382:69] ==> protected/*protected and package*/ constructor LookupElementWeigher(p0: (String..String?)) defined in com.intellij.codeInsight.lookup.LookupElementWeigher[JavaClassConstructorDescriptor]

'callType' @ [384:13] ==> private final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.completion.CallableReferenceWeigher[PropertyDescriptorImpl]

'CALLABLE_REFERENCE' @ [384:34] ==> public object CALLABLE_REFERENCE : CallType<KtExpression?> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'element' @ [384:56] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.CallableReferenceWeigher.weigh[ValueParameterDescriptorImpl]

'getUserData' @ [384:64] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(SmartCompletionItemPriority..SmartCompletionItemPriority?)>): SmartCompletionItemPriority? defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SmartCompletionItemPriority

'SMART_COMPLETION_ITEM_PRIORITY_KEY' @ [384:76] ==> public val SMART_COMPLETION_ITEM_PRIORITY_KEY: Key<SmartCompletionItemPriority> defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[PropertyDescriptorImpl]

'CALLABLE_REFERENCE' @ [384:143] ==> enum entry CALLABLE_REFERENCE defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'element' @ [385:31] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.CallableReferenceWeigher.weigh[ValueParameterDescriptorImpl]

'`object`' @ [385:39] ==> public final val LookupElement.`object`: Any[MyPropertyDescriptor]

'descriptor' @ [385:78] ==> public abstract val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.completion.DeclarationLookupObject[DeserializedPropertyDescriptor]

'if (descriptor?.returnType?.isNothing() == true) 1 else 0' @ [386:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int?, elseBranch: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int?

'descriptor' @ [386:24] ==> val descriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.completion.CallableReferenceWeigher.weigh[LocalVariableDescriptor]

'returnType' @ [386:36] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'isNothing' @ [386:48] ==> public fun KotlinType.isNothing(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

