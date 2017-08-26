'KotlinFindUsagesHandler<T>' @ [57:7] ==> public constructor KotlinFindUsagesHandler<T : PsiElement>(psiElement: T, elementsToSearch: Collection<PsiElement>, factory: KotlinFindUsagesHandlerFactory) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> T

'declaration' @ [57:34] ==> value-parameter declaration: T defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.<init>[ValueParameterDescriptorImpl]

'elementsToSearch' @ [57:47] ==> value-parameter elementsToSearch: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.<init>[ValueParameterDescriptorImpl]

'factory' @ [57:65] ==> value-parameter factory: KotlinFindUsagesHandlerFactory defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.<init>[ValueParameterDescriptorImpl]

'KotlinFindMemberUsagesHandler<KtFunction>' @ [61:71] ==> protected constructor KotlinFindMemberUsagesHandler<T : KtNamedDeclaration>(declaration: KtFunction, elementsToSearch: Collection<PsiElement>, factory: KotlinFindUsagesHandlerFactory) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtNamedDeclaration> -> KtFunction

'declaration' @ [61:113] ==> value-parameter declaration: KtFunction defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Function.<init>[ValueParameterDescriptorImpl]

'elementsToSearch' @ [61:126] ==> value-parameter elementsToSearch: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Function.<init>[ValueParameterDescriptorImpl]

'factory' @ [61:144] ==> value-parameter factory: KotlinFindUsagesHandlerFactory defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Function.<init>[ValueParameterDescriptorImpl]

'factory' @ [63:91] ==> public final val factory: KotlinFindUsagesHandlerFactory defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Function[PropertyDescriptorImpl]

'findFunctionOptions' @ [63:99] ==> public final val findFunctionOptions: KotlinFunctionFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesHandlerFactory[PropertyDescriptorImpl]

'factory' @ [66:27] ==> public final val factory: KotlinFindUsagesHandlerFactory defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Function[PropertyDescriptorImpl]

'findFunctionOptions' @ [66:35] ==> public final val findFunctionOptions: KotlinFunctionFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesHandlerFactory[PropertyDescriptorImpl]

'getElement' @ [67:31] ==> @Suppress public final fun getElement(): KtFunction defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Function[SimpleFunctionDescriptorImpl]

'toLightMethods' @ [67:44] ==> public fun PsiElement.toLightMethods(): List<PsiMethod> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [67:61] ==> public fun <T> List<PsiMethod>.firstOrNull(): PsiMethod? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'lightMethod' @ [68:17] ==> val lightMethod: PsiMethod? defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Function.getFindUsagesDialog[LocalVariableDescriptor]

'KotlinFindFunctionUsagesDialog' @ [69:24] ==> public constructor KotlinFindFunctionUsagesDialog(method: (PsiMethod..PsiMethod?), project: (Project..Project?), findUsagesOptions: (KotlinFunctionFindUsagesOptions..KotlinFunctionFindUsagesOptions?), toShowInNewTab: Boolean, mustOpenInNewTab: Boolean, isSingleFile: Boolean, handler: (FindUsagesHandler..FindUsagesHandler?)) defined in org.jetbrains.kotlin.idea.findUsages.dialogs.KotlinFindFunctionUsagesDialog[JavaClassConstructorDescriptor]

'lightMethod' @ [69:55] ==> val lightMethod: PsiMethod? defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Function.getFindUsagesDialog[LocalVariableDescriptor]

'project' @ [69:68] ==> public final val KotlinFindMemberUsagesHandler.Function.project: Project[MyPropertyDescriptor]

'options' @ [69:77] ==> val options: KotlinFunctionFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Function.getFindUsagesDialog[LocalVariableDescriptor]

'toShowInNewTab' @ [69:86] ==> value-parameter toShowInNewTab: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Function.getFindUsagesDialog[ValueParameterDescriptorImpl]

'mustOpenInNewTab' @ [69:102] ==> value-parameter mustOpenInNewTab: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Function.getFindUsagesDialog[ValueParameterDescriptorImpl]

'isSingleFile' @ [69:120] ==> value-parameter isSingleFile: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Function.getFindUsagesDialog[ValueParameterDescriptorImpl]

'this' @ [69:134] ==> <this> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Function[LazyClassReceiverParameterDescriptor]

'super' @ [72:20] ==> <this> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Function[LazyClassReceiverParameterDescriptor]

'getFindUsagesDialog' @ [72:26] ==> @NotNull public open fun getFindUsagesDialog(p0: Boolean, p1: Boolean, p2: Boolean): AbstractFindUsagesDialog defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler[JavaMethodDescriptor]

'isSingleFile' @ [72:46] ==> value-parameter isSingleFile: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Function.getFindUsagesDialog[ValueParameterDescriptorImpl]

'toShowInNewTab' @ [72:60] ==> value-parameter toShowInNewTab: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Function.getFindUsagesDialog[ValueParameterDescriptorImpl]

'mustOpenInNewTab' @ [72:76] ==> value-parameter mustOpenInNewTab: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Function.getFindUsagesDialog[ValueParameterDescriptorImpl]

'options' @ [76:33] ==> value-parameter options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Function.createKotlinReferencesSearchOptions[ValueParameterDescriptorImpl]

'KotlinReferencesSearchOptions' @ [77:20] ==> public constructor KotlinReferencesSearchOptions(acceptCallableOverrides: Boolean = ..., acceptOverloads: Boolean = ..., acceptExtensionsOfDeclarationClass: Boolean = ..., acceptCompanionObjectMembers: Boolean = ..., searchForComponentConventions: Boolean = ..., searchForOperatorConventions: Boolean = ..., searchNamedArguments: Boolean = ...) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions[DeserializedClassConstructorDescriptor]

'kotlinOptions' @ [78:50] ==> val kotlinOptions: KotlinFunctionFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Function.createKotlinReferencesSearchOptions[LocalVariableDescriptor]

'isIncludeOverloadUsages' @ [78:64] ==> public final var isIncludeOverloadUsages: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinFunctionFindUsagesOptions[JavaPropertyDescriptor]

'kotlinOptions' @ [79:50] ==> val kotlinOptions: KotlinFunctionFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Function.createKotlinReferencesSearchOptions[LocalVariableDescriptor]

'isIncludeOverloadUsages' @ [79:64] ==> public final var isIncludeOverloadUsages: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinFunctionFindUsagesOptions[JavaPropertyDescriptor]

'options' @ [83:33] ==> value-parameter options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Function.applyQueryFilters[ValueParameterDescriptorImpl]

'query' @ [84:20] ==> value-parameter query: Query<PsiReference> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Function.applyQueryFilters[ValueParameterDescriptorImpl]

'applyFilter' @ [85:18] ==> public fun Query<PsiReference>.applyFilter(flag: Boolean, condition: (PsiReference) -> Boolean): Query<PsiReference> defined in org.jetbrains.kotlin.idea.findUsages.handlers[SimpleFunctionDescriptorImpl]

'kotlinOptions' @ [85:30] ==> val kotlinOptions: KotlinFunctionFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Function.applyQueryFilters[LocalVariableDescriptor]

'isSkipImportStatements' @ [85:44] ==> public final var isSkipImportStatements: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinFunctionFindUsagesOptions[JavaPropertyDescriptor]

'!' @ [85:70] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [85:71] ==> value-parameter it: PsiReference defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Function.applyQueryFilters.<anonymous>[ValueParameterDescriptorImpl]

'isImportUsage' @ [85:74] ==> public fun PsiReference.isImportUsage(): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch[DeserializedSimpleFunctionDescriptor]

'KotlinFindMemberUsagesHandler<KtNamedDeclaration>' @ [89:146] ==> protected constructor KotlinFindMemberUsagesHandler<T : KtNamedDeclaration>(declaration: KtNamedDeclaration, elementsToSearch: Collection<PsiElement>, factory: KotlinFindUsagesHandlerFactory) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtNamedDeclaration> -> KtNamedDeclaration

'declaration' @ [89:196] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property.<init>[ValueParameterDescriptorImpl]

'elementsToSearch' @ [89:209] ==> value-parameter elementsToSearch: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property.<init>[ValueParameterDescriptorImpl]

'factory' @ [89:227] ==> value-parameter factory: KotlinFindUsagesHandlerFactory defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property.<init>[ValueParameterDescriptorImpl]

'factory' @ [91:91] ==> public final val factory: KotlinFindUsagesHandlerFactory defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property[PropertyDescriptorImpl]

'findPropertyOptions' @ [91:99] ==> public final val findPropertyOptions: KotlinPropertyFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesHandlerFactory[PropertyDescriptorImpl]

'KotlinFindPropertyUsagesDialog' @ [94:20] ==> public constructor KotlinFindPropertyUsagesDialog(element: (PsiElement..PsiElement?), project: (Project..Project?), findUsagesOptions: (KotlinPropertyFindUsagesOptions..KotlinPropertyFindUsagesOptions?), toShowInNewTab: Boolean, mustOpenInNewTab: Boolean, isSingleFile: Boolean, handler: (FindUsagesHandler..FindUsagesHandler?)) defined in org.jetbrains.kotlin.idea.findUsages.dialogs.KotlinFindPropertyUsagesDialog[JavaClassConstructorDescriptor]

'getElement' @ [94:51] ==> @Suppress public final fun getElement(): KtNamedDeclaration defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property[SimpleFunctionDescriptorImpl]

'project' @ [94:65] ==> public final val KotlinFindMemberUsagesHandler.Property.project: Project[MyPropertyDescriptor]

'factory' @ [94:74] ==> public final val factory: KotlinFindUsagesHandlerFactory defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property[PropertyDescriptorImpl]

'findPropertyOptions' @ [94:82] ==> public final val findPropertyOptions: KotlinPropertyFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesHandlerFactory[PropertyDescriptorImpl]

'toShowInNewTab' @ [94:103] ==> value-parameter toShowInNewTab: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property.getFindUsagesDialog[ValueParameterDescriptorImpl]

'mustOpenInNewTab' @ [94:119] ==> value-parameter mustOpenInNewTab: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property.getFindUsagesDialog[ValueParameterDescriptorImpl]

'isSingleFile' @ [94:137] ==> value-parameter isSingleFile: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property.getFindUsagesDialog[ValueParameterDescriptorImpl]

'this' @ [94:151] ==> <this> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property[LazyClassReceiverParameterDescriptor]

'options' @ [98:33] ==> value-parameter options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property.applyQueryFilters[ValueParameterDescriptorImpl]

'!' @ [100:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'kotlinOptions' @ [100:18] ==> val kotlinOptions: KotlinPropertyFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property.applyQueryFilters[LocalVariableDescriptor]

'isReadAccess' @ [100:32] ==> public final var isReadAccess: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinPropertyFindUsagesOptions[JavaPropertyDescriptor]

'!' @ [100:48] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'kotlinOptions' @ [100:49] ==> val kotlinOptions: KotlinPropertyFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property.applyQueryFilters[LocalVariableDescriptor]

'isWriteAccess' @ [100:63] ==> public final var isWriteAccess: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinPropertyFindUsagesOptions[JavaPropertyDescriptor]

'EmptyQuery' @ [101:24] ==> public constructor EmptyQuery<R : (Any..Any?)>() defined in com.intellij.util.EmptyQuery[JavaClassConstructorDescriptor]
Inferred types:
    <R : (Any..Any?)> -> PsiReference

'query' @ [104:26] ==> value-parameter query: Query<PsiReference> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property.applyQueryFilters[ValueParameterDescriptorImpl]

'applyFilter' @ [105:22] ==> public fun Query<PsiReference>.applyFilter(flag: Boolean, condition: (PsiReference) -> Boolean): Query<PsiReference> defined in org.jetbrains.kotlin.idea.findUsages.handlers[SimpleFunctionDescriptorImpl]

'kotlinOptions' @ [105:34] ==> val kotlinOptions: KotlinPropertyFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property.applyQueryFilters[LocalVariableDescriptor]

'isSkipImportStatements' @ [105:48] ==> public final var isSkipImportStatements: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinPropertyFindUsagesOptions[JavaPropertyDescriptor]

'!' @ [105:74] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [105:75] ==> value-parameter it: PsiReference defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property.applyQueryFilters.<anonymous>[ValueParameterDescriptorImpl]

'isImportUsage' @ [105:78] ==> public fun PsiReference.isImportUsage(): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch[DeserializedSimpleFunctionDescriptor]

'!' @ [107:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'kotlinOptions' @ [107:18] ==> val kotlinOptions: KotlinPropertyFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property.applyQueryFilters[LocalVariableDescriptor]

'isReadAccess' @ [107:32] ==> public final var isReadAccess: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinPropertyFindUsagesOptions[JavaPropertyDescriptor]

'!' @ [107:48] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'kotlinOptions' @ [107:49] ==> val kotlinOptions: KotlinPropertyFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property.applyQueryFilters[LocalVariableDescriptor]

'isWriteAccess' @ [107:63] ==> public final var isWriteAccess: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinPropertyFindUsagesOptions[JavaPropertyDescriptor]

'KotlinReadWriteAccessDetector' @ [108:32] ==> public constructor KotlinReadWriteAccessDetector() defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector[DeserializedClassConstructorDescriptor]

'FilteredQuery' @ [110:24] ==> public constructor FilteredQuery<T : (Any..Any?)>(@NotNull p0: Query<(PsiReference..PsiReference?)>, @NotNull p1: ((PsiReference..PsiReference?)) -> Boolean) defined in com.intellij.util.FilteredQuery[SamAdapterClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiReference

'result' @ [110:38] ==> val result: Query<PsiReference> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property.applyQueryFilters[LocalVariableDescriptor]

'detector' @ [111:34] ==> val detector: KotlinReadWriteAccessDetector defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property.applyQueryFilters[LocalVariableDescriptor]

'getReferenceAccess' @ [111:43] ==> public open fun getReferenceAccess(referencedElement: PsiElement, reference: PsiReference): ReadWriteAccessDetector.Access defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector[DeserializedSimpleFunctionDescriptor]

'element' @ [111:62] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property.applyQueryFilters[ValueParameterDescriptorImpl]

'it' @ [111:71] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property.applyQueryFilters.<anonymous>[ValueParameterDescriptorImpl]

'when (access) {
                        ReadWriteAccessDetector.Access.Read -> kotlinOptions.isReadAccess
                        ReadWriteAccessDetector.Access.Write -> kotlinOptions.isWriteAccess
                        ReadWriteAccessDetector.Access.ReadWrite -> kotlinOptions.isReadWriteAccess
                    }' @ [112:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'access' @ [112:27] ==> val access: ReadWriteAccessDetector.Access defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property.applyQueryFilters.<anonymous>[LocalVariableDescriptor]

'Read' @ [113:56] ==> enum entry Read defined in com.intellij.codeInsight.highlighting.ReadWriteAccessDetector.Access[FakeCallableDescriptorForObject]

'kotlinOptions' @ [113:64] ==> val kotlinOptions: KotlinPropertyFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property.applyQueryFilters[LocalVariableDescriptor]

'isReadAccess' @ [113:78] ==> public final var isReadAccess: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinPropertyFindUsagesOptions[JavaPropertyDescriptor]

'Write' @ [114:56] ==> enum entry Write defined in com.intellij.codeInsight.highlighting.ReadWriteAccessDetector.Access[FakeCallableDescriptorForObject]

'kotlinOptions' @ [114:65] ==> val kotlinOptions: KotlinPropertyFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property.applyQueryFilters[LocalVariableDescriptor]

'isWriteAccess' @ [114:79] ==> public final var isWriteAccess: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinPropertyFindUsagesOptions[JavaPropertyDescriptor]

'ReadWrite' @ [115:56] ==> enum entry ReadWrite defined in com.intellij.codeInsight.highlighting.ReadWriteAccessDetector.Access[FakeCallableDescriptorForObject]

'kotlinOptions' @ [115:69] ==> val kotlinOptions: KotlinPropertyFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property.applyQueryFilters[LocalVariableDescriptor]

'isReadWriteAccess' @ [115:83] ==> public final var isReadWriteAccess: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinPropertyFindUsagesOptions[PropertyDescriptorImpl]

'result' @ [119:20] ==> val result: Query<PsiReference> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property.applyQueryFilters[LocalVariableDescriptor]

'KotlinReferencesSearchOptions' @ [123:20] ==> public constructor KotlinReferencesSearchOptions(acceptCallableOverrides: Boolean = ..., acceptOverloads: Boolean = ..., acceptExtensionsOfDeclarationClass: Boolean = ..., acceptCompanionObjectMembers: Boolean = ..., searchForComponentConventions: Boolean = ..., searchForOperatorConventions: Boolean = ..., searchNamedArguments: Boolean = ...) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions[DeserializedClassConstructorDescriptor]

'MySearcher' @ [128:16] ==> public constructor MySearcher(element: PsiElement, processor: Processor<UsageInfo>, options: FindUsagesOptions) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher[ClassConstructorDescriptorImpl]

'element' @ [128:27] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.createSearcher[ValueParameterDescriptorImpl]

'processor' @ [128:36] ==> value-parameter processor: Processor<UsageInfo> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.createSearcher[ValueParameterDescriptorImpl]

'options' @ [128:47] ==> value-parameter options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.createSearcher[ValueParameterDescriptorImpl]

'Searcher' @ [133:9] ==> public constructor Searcher(element: PsiElement, processor: Processor<UsageInfo>, options: FindUsagesOptions) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Searcher[ClassConstructorDescriptorImpl]

'element' @ [133:18] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher.<init>[ValueParameterDescriptorImpl]

'processor' @ [133:27] ==> value-parameter processor: Processor<UsageInfo> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher.<init>[ValueParameterDescriptorImpl]

'options' @ [133:38] ==> value-parameter options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher.<init>[ValueParameterDescriptorImpl]

'options' @ [135:37] ==> value-parameter options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher.<init>[ValueParameterDescriptorImpl]

'KotlinFindUsagesHandler' @ [138:38] ==> public companion object defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler[FakeCallableDescriptorForObject]

'createReferenceProcessor' @ [138:62] ==> internal final fun createReferenceProcessor(usageInfoProcessor: Processor<UsageInfo>): Processor<PsiReference> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Companion[SimpleFunctionDescriptorImpl]

'processor' @ [138:87] ==> public final val processor: Processor<UsageInfo> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher[PropertyDescriptorImpl]

'UniqueProcessor' @ [139:52] ==> public constructor UniqueProcessor<T : (Any..Any?)>(@NotNull p0: Processor<(UsageInfo..UsageInfo?)>) defined in com.intellij.util.CommonProcessors.UniqueProcessor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> UsageInfo

'processor' @ [139:68] ==> public final val processor: Processor<UsageInfo> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher[PropertyDescriptorImpl]

'options' @ [141:17] ==> public final val options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher[PropertyDescriptorImpl]

'isUsages' @ [141:25] ==> public final var isUsages: Boolean defined in com.intellij.find.findUsages.FindUsagesOptions[JavaPropertyDescriptor]

'createKotlinReferencesSearchOptions' @ [142:43] ==> protected abstract fun createKotlinReferencesSearchOptions(options: FindUsagesOptions): KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler[SimpleFunctionDescriptorImpl]

'options' @ [142:79] ==> public final val options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher[PropertyDescriptorImpl]

'KotlinReferencesSearchParameters' @ [143:40] ==> public constructor KotlinReferencesSearchParameters(elementToSearch: PsiElement, scope: SearchScope = ..., ignoreAccessScope: Boolean = ..., optimizer: SearchRequestCollector? = ..., kotlinOptions: KotlinReferencesSearchOptions = ...) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchParameters[DeserializedClassConstructorDescriptor]

'element' @ [143:73] ==> public final val element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher[PropertyDescriptorImpl]

'options' @ [143:82] ==> public final val options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher[PropertyDescriptorImpl]

'searchScope' @ [143:90] ==> @NotNull public final var searchScope: SearchScope defined in com.intellij.find.findUsages.FindUsagesOptions[JavaPropertyDescriptor]

'kotlinSearchOptions' @ [143:119] ==> val kotlinSearchOptions: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher.buildTaskList[LocalVariableDescriptor]

'applyQueryFilters' @ [145:17] ==> protected abstract fun applyQueryFilters(element: PsiElement, options: FindUsagesOptions, query: Query<PsiReference>): Query<PsiReference> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler[SimpleFunctionDescriptorImpl]

'element' @ [145:35] ==> public final val element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher[PropertyDescriptorImpl]

'options' @ [145:44] ==> public final val options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher[PropertyDescriptorImpl]

'search' @ [145:70] ==> @NotNull public open fun search(@NotNull p0: ReferencesSearch.SearchParameters): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'searchParameters' @ [145:77] ==> val searchParameters: KotlinReferencesSearchParameters defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher.buildTaskList[LocalVariableDescriptor]

'let' @ [145:96] ==> @InlineOnly public inline fun <T, R> Query<PsiReference>.let(block: (Query<PsiReference>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Query<PsiReference>
    <R> -> Unit

'addTask' @ [146:21] ==> protected final fun addTask(task: () -> Boolean): Unit defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher[SimpleFunctionDescriptorImpl]

'query' @ [146:31] ==> value-parameter query: Query<PsiReference> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher.buildTaskList.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [146:37] ==> public abstract fun forEach(@NotNull p0: Processor<(PsiReference..PsiReference?)>): Boolean defined in com.intellij.util.Query[JavaMethodDescriptor]

'referenceProcessor' @ [146:45] ==> val referenceProcessor: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher.buildTaskList[LocalVariableDescriptor]

'element' @ [150:35] ==> public final val element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher[PropertyDescriptorImpl]

'toLightMethods' @ [150:43] ==> public fun PsiElement.toLightMethods(): List<PsiMethod> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'options' @ [151:39] ==> public final val options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher[PropertyDescriptorImpl]

'searchScope' @ [151:47] ==> @NotNull public final var searchScope: SearchScope defined in com.intellij.find.findUsages.FindUsagesOptions[JavaPropertyDescriptor]

'element' @ [153:25] ==> public final val element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher[PropertyDescriptorImpl]

'element' @ [153:56] ==> public final val element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher[PropertyDescriptorImpl]

'element' @ [153:82] ==> public final val element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher[PropertyDescriptorImpl]

'dataClassComponentFunction' @ [153:90] ==> public fun KtParameter.dataClassComponentFunction(): FunctionDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch[DeserializedSimpleFunctionDescriptor]

'searchScope' @ [154:25] ==> var searchScope: SearchScope defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher.buildTaskList[LocalVariableDescriptor]

'searchScope' @ [154:39] ==> var searchScope: SearchScope defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher.buildTaskList[LocalVariableDescriptor]

'excludeKotlinSources' @ [154:51] ==> public fun SearchScope.excludeKotlinSources(): SearchScope defined in org.jetbrains.kotlin.idea.search[DeserializedSimpleFunctionDescriptor]

'applyQueryFilters' @ [156:21] ==> protected abstract fun applyQueryFilters(element: PsiElement, options: FindUsagesOptions, query: Query<PsiReference>): Query<PsiReference> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler[SimpleFunctionDescriptorImpl]

'element' @ [156:39] ==> public final val element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher[PropertyDescriptorImpl]

'options' @ [156:48] ==> public final val options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher[PropertyDescriptorImpl]

'search' @ [156:80] ==> public open fun search(@NotNull p0: PsiMethod, p1: (SearchScope..SearchScope?), p2: Boolean): (Query<(PsiReference..PsiReference?)>..Query<(PsiReference..PsiReference?)>?) defined in com.intellij.psi.search.searches.MethodReferencesSearch[JavaMethodDescriptor]

'psiMethod' @ [156:87] ==> val psiMethod: PsiMethod defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher.buildTaskList[LocalVariableDescriptor]

'searchScope' @ [156:98] ==> var searchScope: SearchScope defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher.buildTaskList[LocalVariableDescriptor]

'let' @ [156:118] ==> @InlineOnly public inline fun <T, R> Query<PsiReference>.let(block: (Query<PsiReference>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Query<PsiReference>
    <R> -> Unit

'addTask' @ [157:25] ==> protected final fun addTask(task: () -> Boolean): Unit defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher[SimpleFunctionDescriptorImpl]

'query' @ [157:35] ==> value-parameter query: Query<PsiReference> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher.buildTaskList.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [157:41] ==> public abstract fun forEach(@NotNull p0: Processor<(PsiReference..PsiReference?)>): Boolean defined in com.intellij.util.Query[JavaMethodDescriptor]

'referenceProcessor' @ [157:49] ==> val referenceProcessor: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher.buildTaskList[LocalVariableDescriptor]

'kotlinOptions' @ [162:17] ==> private final val kotlinOptions: KotlinCallableFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher[PropertyDescriptorImpl]

'searchOverrides' @ [162:31] ==> public abstract var searchOverrides: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinCallableFindUsagesOptions[PropertyDescriptorImpl]

'addTask' @ [163:17] ==> protected final fun addTask(task: () -> Boolean): Unit defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher[SimpleFunctionDescriptorImpl]

'HierarchySearchRequest' @ [164:38] ==> public constructor HierarchySearchRequest<T : PsiElement>(originalElement: PsiElement, searchScope: SearchScope, searchDeeply: Boolean = ...) defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : PsiElement> -> PsiElement

'element' @ [164:61] ==> public final val element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher[PropertyDescriptorImpl]

'options' @ [164:70] ==> public final val options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher[PropertyDescriptorImpl]

'searchScope' @ [164:78] ==> @NotNull public final var searchScope: SearchScope defined in com.intellij.find.findUsages.FindUsagesOptions[JavaPropertyDescriptor]

'searchOverriders' @ [164:97] ==> public fun HierarchySearchRequest<*>.searchOverriders(): Query<PsiMethod> defined in org.jetbrains.kotlin.idea.search.declarationsSearch[DeserializedSimpleFunctionDescriptor]

'overriders' @ [165:21] ==> val overriders: Query<PsiMethod> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher.buildTaskList.<anonymous>[LocalVariableDescriptor]

'all' @ [165:32] ==> public inline fun <T> Iterable<(PsiMethod..PsiMethod?)>.all(predicate: ((PsiMethod..PsiMethod?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'runReadAction' @ [166:39] ==> public fun <T> runReadAction(action: () -> PsiElement?): PsiElement? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement?

'it' @ [166:55] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher.buildTaskList.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'takeIf' @ [166:58] ==> @InlineOnly @SinceKotlin public inline fun <T> (PsiMethod..PsiMethod?).takeIf(predicate: ((PsiMethod..PsiMethod?)) -> Boolean): PsiMethod? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'it' @ [166:67] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher.buildTaskList.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isValid' @ [166:70] ==> public final val PsiMethod.isValid: Boolean[MyPropertyDescriptor]

'navigationElement' @ [166:81] ==> public final val PsiMethod.navigationElement: PsiElement[MyPropertyDescriptor]

'KotlinFindUsagesHandler' @ [167:25] ==> public companion object defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler[FakeCallableDescriptorForObject]

'processUsage' @ [167:49] ==> internal final fun processUsage(processor: Processor<UsageInfo>, element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Companion[SimpleFunctionDescriptorImpl]

'uniqueProcessor' @ [167:62] ==> val uniqueProcessor: CommonProcessors.UniqueProcessor<UsageInfo> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher.buildTaskList[LocalVariableDescriptor]

'element' @ [167:79] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.MySearcher.buildTaskList.<anonymous>.<anonymous>[LocalVariableDescriptor]

'!' @ [182:111] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSingleFile' @ [182:112] ==> value-parameter isSingleFile: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.isSearchForTextOccurencesAvailable[ValueParameterDescriptorImpl]

'psiElement' @ [182:128] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.isSearchForTextOccurencesAvailable[ValueParameterDescriptorImpl]

'target' @ [185:35] ==> value-parameter target: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.findReferencesToHighlight[ValueParameterDescriptorImpl]

'resolveToDescriptorIfAny' @ [185:70] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'if (callableDescriptor is ParameterDescriptor)
            listOf(callableDescriptor)
        else
            callableDescriptor?.findOriginalTopMostOverriddenDescriptors() ?: emptyList<CallableDescriptor>()' @ [186:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<CallableDescriptor>, elseBranch: Collection<CallableDescriptor>): Collection<CallableDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<CallableDescriptor>

'callableDescriptor' @ [186:42] ==> val callableDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.findReferencesToHighlight[LocalVariableDescriptor]

'listOf' @ [187:13] ==> public fun <T> listOf(element: ParameterDescriptor): List<ParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParameterDescriptor

'callableDescriptor' @ [187:20] ==> val callableDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.findReferencesToHighlight[LocalVariableDescriptor]

'callableDescriptor' @ [189:13] ==> val callableDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.findReferencesToHighlight[LocalVariableDescriptor]

'findOriginalTopMostOverriddenDescriptors' @ [189:33] ==> public fun <D : CallableDescriptor> CallableDescriptor.findOriginalTopMostOverriddenDescriptors(): Set<CallableDescriptor> defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : CallableDescriptor> -> CallableDescriptor

'emptyList' @ [189:79] ==> public fun <T> emptyList(): List<CallableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'descriptorsToHighlight' @ [191:32] ==> val descriptorsToHighlight: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.findReferencesToHighlight[LocalVariableDescriptor]

'map' @ [191:55] ==> public inline fun <T, R> Iterable<CallableDescriptor>.map(transform: (CallableDescriptor) -> PsiElement?): List<PsiElement?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor
    <R> -> PsiElement?

'it' @ [191:61] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.findReferencesToHighlight.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [191:64] ==> public final val CallableDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [191:71] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'filter' @ [191:82] ==> public inline fun <T> Iterable<PsiElement?>.filter(predicate: (PsiElement?) -> Boolean): List<PsiElement?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement?

'it' @ [191:91] ==> value-parameter it: PsiElement? defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.findReferencesToHighlight.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [191:105] ==> value-parameter it: PsiElement? defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.findReferencesToHighlight.<anonymous>[ValueParameterDescriptorImpl]

'target' @ [191:111] ==> value-parameter target: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.findReferencesToHighlight[ValueParameterDescriptorImpl]

'if (baseDeclarations.isNotEmpty()) {
            baseDeclarations.flatMap {
                val handler = (FindManager.getInstance(project) as FindManagerImpl).findUsagesManager.getFindUsagesHandler(it!!, true)
                handler?.findReferencesToHighlight(it, searchScope) ?: emptyList()
            }
        }
        else {
            super.findReferencesToHighlight(target, searchScope)
        }' @ [193:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<PsiReference>, elseBranch: Collection<PsiReference>): Collection<PsiReference>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<PsiReference>

'baseDeclarations' @ [193:20] ==> val baseDeclarations: List<PsiElement?> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.findReferencesToHighlight[LocalVariableDescriptor]

'isNotEmpty' @ [193:37] ==> @InlineOnly public inline fun <T> Collection<PsiElement?>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement?

'baseDeclarations' @ [194:13] ==> val baseDeclarations: List<PsiElement?> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.findReferencesToHighlight[LocalVariableDescriptor]

'flatMap' @ [194:30] ==> public inline fun <T, R> Iterable<PsiElement?>.flatMap(transform: (PsiElement?) -> Iterable<(PsiReference..PsiReference?)>): List<(PsiReference..PsiReference?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement?
    <R> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'getInstance' @ [195:44] ==> public open fun getInstance(p0: (Project..Project?)): (FindManager..FindManager?) defined in com.intellij.find.FindManager[JavaMethodDescriptor]

'project' @ [195:56] ==> public final val <T : KtNamedDeclaration> KotlinFindMemberUsagesHandler<T>.project: Project[MyPropertyDescriptor]
Inferred types:
    <T : KtNamedDeclaration> -> T

'findUsagesManager' @ [195:85] ==> public final val FindManagerImpl.findUsagesManager: FindUsagesManager[MyPropertyDescriptor]

'getFindUsagesHandler' @ [195:103] ==> @Nullable public open fun getFindUsagesHandler(@NotNull p0: PsiElement, p1: Boolean): FindUsagesHandler? defined in com.intellij.find.findUsages.FindUsagesManager[JavaMethodDescriptor]

'it' @ [195:124] ==> value-parameter it: PsiElement? defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.findReferencesToHighlight.<anonymous>[ValueParameterDescriptorImpl]

'handler' @ [196:17] ==> val handler: FindUsagesHandler? defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.findReferencesToHighlight.<anonymous>[LocalVariableDescriptor]

'findReferencesToHighlight' @ [196:26] ==> @NotNull public open fun findReferencesToHighlight(@NotNull p0: PsiElement, @NotNull p1: SearchScope): (MutableCollection<(PsiReference..PsiReference?)>..Collection<(PsiReference..PsiReference?)>) defined in com.intellij.find.findUsages.FindUsagesHandler[JavaMethodDescriptor]

'it' @ [196:52] ==> value-parameter it: PsiElement? defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.findReferencesToHighlight.<anonymous>[ValueParameterDescriptorImpl]

'searchScope' @ [196:56] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.findReferencesToHighlight[ValueParameterDescriptorImpl]

'emptyList' @ [196:72] ==> public fun <T> emptyList(): List<PsiReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReference

'super' @ [200:13] ==> <this> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler[LazyClassReceiverParameterDescriptor]

'findReferencesToHighlight' @ [200:19] ==> public open fun findReferencesToHighlight(target: PsiElement, searchScope: SearchScope): Collection<PsiReference> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler[SimpleFunctionDescriptorImpl]

'target' @ [200:45] ==> value-parameter target: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.findReferencesToHighlight[ValueParameterDescriptorImpl]

'searchScope' @ [200:53] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.findReferencesToHighlight[ValueParameterDescriptorImpl]

'emptyList' @ [207:75] ==> public fun <T> emptyList(): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'if (declaration is KtFunction)
                Function(declaration, elementsToSearch, factory)
            else
                Property(declaration, elementsToSearch, factory)' @ [209:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinFindMemberUsagesHandler<out KtNamedDeclaration>, elseBranch: KotlinFindMemberUsagesHandler<out KtNamedDeclaration>): KotlinFindMemberUsagesHandler<out KtNamedDeclaration>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinFindMemberUsagesHandler<out KtNamedDeclaration>

'declaration' @ [209:24] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Companion.getInstance[ValueParameterDescriptorImpl]

'Function' @ [210:17] ==> public constructor Function(declaration: KtFunction, elementsToSearch: Collection<PsiElement>, factory: KotlinFindUsagesHandlerFactory) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Function[ClassConstructorDescriptorImpl]

'declaration' @ [210:26] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Companion.getInstance[ValueParameterDescriptorImpl]

'elementsToSearch' @ [210:39] ==> value-parameter elementsToSearch: Collection<PsiElement> = ... defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Companion.getInstance[ValueParameterDescriptorImpl]

'factory' @ [210:57] ==> value-parameter factory: KotlinFindUsagesHandlerFactory defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Companion.getInstance[ValueParameterDescriptorImpl]

'Property' @ [212:17] ==> public constructor Property(declaration: KtNamedDeclaration, elementsToSearch: Collection<PsiElement>, factory: KotlinFindUsagesHandlerFactory) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Property[ClassConstructorDescriptorImpl]

'declaration' @ [212:26] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Companion.getInstance[ValueParameterDescriptorImpl]

'elementsToSearch' @ [212:39] ==> value-parameter elementsToSearch: Collection<PsiElement> = ... defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Companion.getInstance[ValueParameterDescriptorImpl]

'factory' @ [212:57] ==> value-parameter factory: KotlinFindUsagesHandlerFactory defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Companion.getInstance[ValueParameterDescriptorImpl]

'if (flag) FilteredQuery(this, condition) else this' @ [219:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Query<PsiReference>, elseBranch: Query<PsiReference>): Query<PsiReference>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Query<PsiReference>

'flag' @ [219:16] ==> value-parameter flag: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.applyFilter[ValueParameterDescriptorImpl]

'FilteredQuery' @ [219:22] ==> public constructor FilteredQuery<T : (Any..Any?)>(@NotNull p0: Query<(PsiReference..PsiReference?)>, @NotNull p1: ((PsiReference..PsiReference?)) -> Boolean) defined in com.intellij.util.FilteredQuery[SamAdapterClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiReference

'this' @ [219:36] ==> <this> defined in org.jetbrains.kotlin.idea.findUsages.handlers.applyFilter[ReceiverParameterDescriptorImpl]

'condition' @ [219:42] ==> value-parameter condition: (PsiReference) -> Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.applyFilter[ValueParameterDescriptorImpl]

'this' @ [219:58] ==> <this> defined in org.jetbrains.kotlin.idea.findUsages.handlers.applyFilter[ReceiverParameterDescriptorImpl]

