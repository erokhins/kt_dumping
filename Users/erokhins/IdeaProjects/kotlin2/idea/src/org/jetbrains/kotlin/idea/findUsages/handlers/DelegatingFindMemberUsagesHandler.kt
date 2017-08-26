'FindUsagesHandler' @ [37:5] ==> protected/*protected and package*/ constructor FindUsagesHandler(@NotNull p0: PsiElement) defined in com.intellij.find.findUsages.FindUsagesHandler[JavaClassConstructorDescriptor]

'declaration' @ [37:23] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler.<init>[ValueParameterDescriptorImpl]

'KotlinFindMemberUsagesHandler' @ [38:33] ==> public companion object defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler[FakeCallableDescriptorForObject]

'getInstance' @ [38:63] ==> public final fun getInstance(declaration: KtNamedDeclaration, elementsToSearch: Collection<PsiElement> = ..., factory: KotlinFindUsagesHandlerFactory): KotlinFindMemberUsagesHandler<out KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [38:75] ==> public final val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler[PropertyDescriptorImpl]

'elementsToSearch' @ [38:88] ==> public final val elementsToSearch: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler[PropertyDescriptorImpl]

'factory' @ [38:106] ==> public final val factory: KotlinFindUsagesHandlerFactory defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler[PropertyDescriptorImpl]

'when (element) {
            is KtNamedDeclaration ->
                HandlerAndOptions(KotlinFindMemberUsagesHandler.getInstance(element, elementsToSearch, factory), options)

            is PsiMethod, is PsiParameter ->
                HandlerAndOptions(JavaFindUsagesHandler(element, elementsToSearch.toTypedArray(), factory.javaHandlerFactory),
                                  (options as KotlinCallableFindUsagesOptions?)?.toJavaOptions(project))

            else -> null
        }' @ [46:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DelegatingFindMemberUsagesHandler.HandlerAndOptions?, entry1: DelegatingFindMemberUsagesHandler.HandlerAndOptions?, entry2: DelegatingFindMemberUsagesHandler.HandlerAndOptions?): DelegatingFindMemberUsagesHandler.HandlerAndOptions?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> HandlerAndOptions?

'element' @ [46:22] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler.getHandlerAndOptions[ValueParameterDescriptorImpl]

'HandlerAndOptions' @ [48:17] ==> public constructor HandlerAndOptions(handler: FindUsagesHandler, options: FindUsagesOptions?) defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler.HandlerAndOptions[ClassConstructorDescriptorImpl]

'KotlinFindMemberUsagesHandler' @ [48:35] ==> public companion object defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler[FakeCallableDescriptorForObject]

'getInstance' @ [48:65] ==> public final fun getInstance(declaration: KtNamedDeclaration, elementsToSearch: Collection<PsiElement> = ..., factory: KotlinFindUsagesHandlerFactory): KotlinFindMemberUsagesHandler<out KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler.Companion[SimpleFunctionDescriptorImpl]

'element' @ [48:77] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler.getHandlerAndOptions[ValueParameterDescriptorImpl]

'elementsToSearch' @ [48:86] ==> public final val elementsToSearch: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler[PropertyDescriptorImpl]

'factory' @ [48:104] ==> public final val factory: KotlinFindUsagesHandlerFactory defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler[PropertyDescriptorImpl]

'options' @ [48:114] ==> value-parameter options: FindUsagesOptions? defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler.getHandlerAndOptions[ValueParameterDescriptorImpl]

'HandlerAndOptions' @ [51:17] ==> public constructor HandlerAndOptions(handler: FindUsagesHandler, options: FindUsagesOptions?) defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler.HandlerAndOptions[ClassConstructorDescriptorImpl]

'JavaFindUsagesHandler' @ [51:35] ==> public constructor JavaFindUsagesHandler(@NotNull p0: PsiElement, @NotNull p1: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>), @NotNull p2: JavaFindUsagesHandlerFactory) defined in com.intellij.find.findUsages.JavaFindUsagesHandler[JavaClassConstructorDescriptor]

'element' @ [51:57] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler.getHandlerAndOptions[ValueParameterDescriptorImpl]

'elementsToSearch' @ [51:66] ==> public final val elementsToSearch: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler[PropertyDescriptorImpl]

'toTypedArray' @ [51:83] ==> public inline fun <reified T> Collection<PsiElement>.toTypedArray(): Array<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiElement

'factory' @ [51:99] ==> public final val factory: KotlinFindUsagesHandlerFactory defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler[PropertyDescriptorImpl]

'javaHandlerFactory' @ [51:107] ==> public final val javaHandlerFactory: JavaFindUsagesHandlerFactory defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesHandlerFactory[PropertyDescriptorImpl]

'options' @ [52:36] ==> value-parameter options: FindUsagesOptions? defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler.getHandlerAndOptions[ValueParameterDescriptorImpl]

'toJavaOptions' @ [52:82] ==> public abstract fun toJavaOptions(project: Project): FindUsagesOptions? defined in org.jetbrains.kotlin.idea.findUsages.KotlinCallableFindUsagesOptions[SimpleFunctionDescriptorImpl]

'project' @ [52:96] ==> public final val DelegatingFindMemberUsagesHandler.project: Project[MyPropertyDescriptor]

'getHandlerAndOptions' @ [59:16] ==> private final fun getHandlerAndOptions(element: PsiElement, options: FindUsagesOptions?): DelegatingFindMemberUsagesHandler.HandlerAndOptions? defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler[SimpleFunctionDescriptorImpl]

'psiElement' @ [59:37] ==> public final val DelegatingFindMemberUsagesHandler.psiElement: PsiElement[MyPropertyDescriptor]

'handler' @ [59:56] ==> public final val handler: FindUsagesHandler defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler.HandlerAndOptions[PropertyDescriptorImpl]

'getFindUsagesDialog' @ [59:65] ==> @NotNull public open fun getFindUsagesDialog(p0: Boolean, p1: Boolean, p2: Boolean): AbstractFindUsagesDialog defined in com.intellij.find.findUsages.FindUsagesHandler[JavaMethodDescriptor]

'isSingleFile' @ [59:85] ==> value-parameter isSingleFile: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler.getFindUsagesDialog[ValueParameterDescriptorImpl]

'toShowInNewTab' @ [59:99] ==> value-parameter toShowInNewTab: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler.getFindUsagesDialog[ValueParameterDescriptorImpl]

'mustOpenInNewTab' @ [59:115] ==> value-parameter mustOpenInNewTab: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler.getFindUsagesDialog[ValueParameterDescriptorImpl]

'super' @ [60:19] ==> <this> defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler[LazyClassReceiverParameterDescriptor]

'getFindUsagesDialog' @ [60:25] ==> @NotNull public open fun getFindUsagesDialog(p0: Boolean, p1: Boolean, p2: Boolean): AbstractFindUsagesDialog defined in com.intellij.find.findUsages.FindUsagesHandler[JavaMethodDescriptor]

'isSingleFile' @ [60:45] ==> value-parameter isSingleFile: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler.getFindUsagesDialog[ValueParameterDescriptorImpl]

'toShowInNewTab' @ [60:59] ==> value-parameter toShowInNewTab: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler.getFindUsagesDialog[ValueParameterDescriptorImpl]

'mustOpenInNewTab' @ [60:75] ==> value-parameter mustOpenInNewTab: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler.getFindUsagesDialog[ValueParameterDescriptorImpl]

'kotlinHandler' @ [64:16] ==> private final val kotlinHandler: KotlinFindMemberUsagesHandler<out KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler[PropertyDescriptorImpl]

'primaryElements' @ [64:30] ==> public final val <T : KtNamedDeclaration> KotlinFindMemberUsagesHandler<out KtNamedDeclaration>.primaryElements: Array<PsiElement>[MyPropertyDescriptor]
Inferred types:
    <T : KtNamedDeclaration> -> KtNamedDeclaration

'kotlinHandler' @ [68:16] ==> private final val kotlinHandler: KotlinFindMemberUsagesHandler<out KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler[PropertyDescriptorImpl]

'secondaryElements' @ [68:30] ==> public final val <T : KtNamedDeclaration> KotlinFindMemberUsagesHandler<out KtNamedDeclaration>.secondaryElements: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]
Inferred types:
    <T : KtNamedDeclaration> -> KtNamedDeclaration

'kotlinHandler' @ [72:16] ==> private final val kotlinHandler: KotlinFindMemberUsagesHandler<out KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler[PropertyDescriptorImpl]

'getFindUsagesOptions' @ [72:30] ==> @NotNull public open fun getFindUsagesOptions(@Nullable p0: DataContext?): FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindMemberUsagesHandler[JavaMethodDescriptor]

'dataContext' @ [72:51] ==> value-parameter dataContext: DataContext? defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler.getFindUsagesOptions[ValueParameterDescriptorImpl]

'component1' @ [76:14] ==> public final operator fun component1(): FindUsagesHandler defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler.HandlerAndOptions[SimpleFunctionDescriptorImpl]

'component2' @ [76:23] ==> public final operator fun component2(): FindUsagesOptions? defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler.HandlerAndOptions[SimpleFunctionDescriptorImpl]

'runReadAction' @ [76:41] ==> public fun <T> runReadAction(action: () -> DelegatingFindMemberUsagesHandler.HandlerAndOptions?): DelegatingFindMemberUsagesHandler.HandlerAndOptions? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HandlerAndOptions?

'getHandlerAndOptions' @ [76:57] ==> private final fun getHandlerAndOptions(element: PsiElement, options: FindUsagesOptions?): DelegatingFindMemberUsagesHandler.HandlerAndOptions? defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler[SimpleFunctionDescriptorImpl]

'element' @ [76:78] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler.processElementUsages[ValueParameterDescriptorImpl]

'options' @ [76:87] ==> value-parameter options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler.processElementUsages[ValueParameterDescriptorImpl]

'handler' @ [77:16] ==> val handler: FindUsagesHandler defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler.processElementUsages[LocalVariableDescriptor]

'processElementUsages' @ [77:24] ==> public open fun processElementUsages(@NotNull p0: PsiElement, @NotNull p1: Processor<(UsageInfo..UsageInfo?)>, @NotNull p2: FindUsagesOptions): Boolean defined in com.intellij.find.findUsages.FindUsagesHandler[JavaMethodDescriptor]

'element' @ [77:45] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler.processElementUsages[ValueParameterDescriptorImpl]

'processor' @ [77:54] ==> value-parameter processor: Processor<UsageInfo> defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler.processElementUsages[ValueParameterDescriptorImpl]

'handlerOptions' @ [77:65] ==> val handlerOptions: FindUsagesOptions? defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler.processElementUsages[LocalVariableDescriptor]

'!' @ [80:111] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSingleFile' @ [80:112] ==> value-parameter isSingleFile: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.DelegatingFindMemberUsagesHandler.isSearchForTextOccurencesAvailable[ValueParameterDescriptorImpl]

