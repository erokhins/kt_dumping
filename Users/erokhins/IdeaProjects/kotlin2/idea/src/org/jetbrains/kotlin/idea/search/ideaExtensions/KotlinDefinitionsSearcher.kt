'skipDelegatedMethodsConsumer' @ [43:24] ==> private final fun skipDelegatedMethodsConsumer(baseConsumer: Processor<PsiElement>): Processor<PsiElement> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion[SimpleFunctionDescriptorImpl]

'consumer' @ [43:53] ==> value-parameter consumer: Processor<PsiElement> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.execute[ValueParameterDescriptorImpl]

'queryParameters' @ [44:23] ==> value-parameter queryParameters: DefinitionsScopedSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.execute[ValueParameterDescriptorImpl]

'element' @ [44:39] ==> public final val DefinitionsScopedSearch.SearchParameters.element: PsiElement[MyPropertyDescriptor]

'queryParameters' @ [45:21] ==> value-parameter queryParameters: DefinitionsScopedSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.execute[ValueParameterDescriptorImpl]

'scope' @ [45:37] ==> public final val DefinitionsScopedSearch.SearchParameters.scope: SearchScope[MyPropertyDescriptor]

'when (element) {
            is KtClass ->
                processClassImplementations(element, consumer)

            is KtLightClass -> {
                val useScope = runReadAction { element.useScope }
                if (useScope is LocalSearchScope)
                    processLightClassLocalImplementations(element, useScope, consumer)
                else
                    true
            }

            is KtNamedFunction, is KtSecondaryConstructor ->
                processFunctionImplementations(element as KtFunction, scope, consumer)

            is KtProperty ->
                processPropertyImplementations(element, scope, consumer)

            is KtParameter ->
                if (isFieldParameter(element)) processPropertyImplementations(element, scope, consumer) else true

            else -> true
        }' @ [47:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean, entry4: Boolean, entry5: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'element' @ [47:22] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.execute[LocalVariableDescriptor]

'processClassImplementations' @ [49:17] ==> private final fun processClassImplementations(klass: KtClass, consumer: Processor<PsiElement>): Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion[SimpleFunctionDescriptorImpl]

'element' @ [49:45] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.execute[LocalVariableDescriptor]

'consumer' @ [49:54] ==> val consumer: Processor<PsiElement> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.execute[LocalVariableDescriptor]

'runReadAction' @ [52:32] ==> public fun <T> runReadAction(action: () -> SearchScope): SearchScope defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SearchScope

'element' @ [52:48] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.execute[LocalVariableDescriptor]

'useScope' @ [52:56] ==> public final val KtLightClass.useScope: SearchScope[MyPropertyDescriptor]

'if (useScope is LocalSearchScope)
                    processLightClassLocalImplementations(element, useScope, consumer)
                else
                    true' @ [53:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'useScope' @ [53:21] ==> val useScope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.execute[LocalVariableDescriptor]

'processLightClassLocalImplementations' @ [54:21] ==> private final fun processLightClassLocalImplementations(psiClass: KtLightClass, searchScope: LocalSearchScope, consumer: Processor<PsiElement>): Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion[SimpleFunctionDescriptorImpl]

'element' @ [54:59] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.execute[LocalVariableDescriptor]

'useScope' @ [54:68] ==> val useScope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.execute[LocalVariableDescriptor]

'consumer' @ [54:78] ==> val consumer: Processor<PsiElement> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.execute[LocalVariableDescriptor]

'processFunctionImplementations' @ [60:17] ==> private final fun processFunctionImplementations(function: KtFunction, scope: SearchScope, consumer: Processor<PsiElement>): Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion[SimpleFunctionDescriptorImpl]

'element' @ [60:48] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.execute[LocalVariableDescriptor]

'scope' @ [60:71] ==> val scope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.execute[LocalVariableDescriptor]

'consumer' @ [60:78] ==> val consumer: Processor<PsiElement> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.execute[LocalVariableDescriptor]

'processPropertyImplementations' @ [63:17] ==> private final fun processPropertyImplementations(property: KtProperty, scope: SearchScope, consumer: Processor<PsiElement>): Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion[SimpleFunctionDescriptorImpl]

'element' @ [63:48] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.execute[LocalVariableDescriptor]

'scope' @ [63:57] ==> val scope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.execute[LocalVariableDescriptor]

'consumer' @ [63:64] ==> val consumer: Processor<PsiElement> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.execute[LocalVariableDescriptor]

'if (isFieldParameter(element)) processPropertyImplementations(element, scope, consumer) else true' @ [66:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'isFieldParameter' @ [66:21] ==> private final fun isFieldParameter(parameter: KtParameter): Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion[SimpleFunctionDescriptorImpl]

'element' @ [66:38] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.execute[LocalVariableDescriptor]

'processPropertyImplementations' @ [66:48] ==> private final fun processPropertyImplementations(parameter: KtParameter, scope: SearchScope, consumer: Processor<PsiElement>): Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion[SimpleFunctionDescriptorImpl]

'element' @ [66:79] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.execute[LocalVariableDescriptor]

'scope' @ [66:88] ==> val scope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.execute[LocalVariableDescriptor]

'consumer' @ [66:95] ==> val consumer: Processor<PsiElement> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.execute[LocalVariableDescriptor]

'Processor' @ [75:20] ==> public fun <T : (Any..Any?)> Processor(function: ((PsiElement..PsiElement?)) -> Boolean): Processor<PsiElement> defined in com.intellij.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> PsiElement

'isDelegated' @ [76:21] ==> private final fun isDelegated(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion[SimpleFunctionDescriptorImpl]

'element' @ [76:33] ==> value-parameter element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.skipDelegatedMethodsConsumer.<anonymous>[ValueParameterDescriptorImpl]

'baseConsumer' @ [79:17] ==> value-parameter baseConsumer: Processor<PsiElement> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.skipDelegatedMethodsConsumer[ValueParameterDescriptorImpl]

'process' @ [79:30] ==> public abstract fun process(p0: (PsiElement..PsiElement?)): Boolean defined in com.intellij.util.Processor[JavaMethodDescriptor]

'element' @ [79:38] ==> value-parameter element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.skipDelegatedMethodsConsumer.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [83:65] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.isDelegated[ValueParameterDescriptorImpl]

'element' @ [83:93] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.isDelegated[ValueParameterDescriptorImpl]

'isDelegated' @ [83:101] ==> public open val isDelegated: Boolean defined in org.jetbrains.kotlin.asJava.elements.KtLightMethod[DeserializedPropertyDescriptor]

'runReadAction' @ [86:20] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'!=' @ [86:36] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'getClassIfParameterIsProperty' @ [86:46] ==> @Nullable public open fun getClassIfParameterIsProperty(@NotNull p0: KtParameter): KtClassOrObject? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'parameter' @ [86:76] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.isFieldParameter[ValueParameterDescriptorImpl]

'runReadAction' @ [90:28] ==> public fun <T> runReadAction(action: () -> KtLightClass?): KtLightClass? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLightClass?

'klass' @ [90:44] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processClassImplementations[ValueParameterDescriptorImpl]

'toLightClass' @ [90:50] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'runReadAction' @ [92:31] ==> public fun <T> runReadAction(action: () -> SearchScope): SearchScope defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SearchScope

'psiClass' @ [92:47] ==> val psiClass: KtLightClass defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processClassImplementations[LocalVariableDescriptor]

'useScope' @ [92:56] ==> public final val KtLightClass.useScope: SearchScope[MyPropertyDescriptor]

'searchScope' @ [93:17] ==> val searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processClassImplementations[LocalVariableDescriptor]

'processLightClassLocalImplementations' @ [94:24] ==> private final fun processLightClassLocalImplementations(psiClass: KtLightClass, searchScope: LocalSearchScope, consumer: Processor<PsiElement>): Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion[SimpleFunctionDescriptorImpl]

'psiClass' @ [94:62] ==> val psiClass: KtLightClass defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processClassImplementations[LocalVariableDescriptor]

'searchScope' @ [94:72] ==> val searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processClassImplementations[LocalVariableDescriptor]

'consumer' @ [94:85] ==> value-parameter consumer: Processor<PsiElement> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processClassImplementations[ValueParameterDescriptorImpl]

'process' @ [97:34] ==> public open fun <T : (Any..Any?)> process(@NotNull p0: (MutableIterable<(PsiElement..PsiElement?)>..Iterable<(PsiElement..PsiElement?)>), @NotNull p1: Processor<(PsiElement..PsiElement?)>): Boolean defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'search' @ [97:64] ==> @NotNull public open fun search(@NotNull p0: PsiClass, p1: Boolean): Query<(PsiClass..PsiClass?)> defined in com.intellij.psi.search.searches.ClassInheritorsSearch[JavaMethodDescriptor]

'psiClass' @ [97:71] ==> val psiClass: KtLightClass defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processClassImplementations[LocalVariableDescriptor]

'consumer' @ [97:88] ==> value-parameter consumer: Processor<PsiElement> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processClassImplementations[ValueParameterDescriptorImpl]

'searchScope' @ [104:32] ==> value-parameter searchScope: LocalSearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processLightClassLocalImplementations[ValueParameterDescriptorImpl]

'scope' @ [104:44] ==> public final val LocalSearchScope.scope: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'mapTo' @ [104:50] ==> public inline fun <T, R, C : MutableCollection<in (VirtualFile..VirtualFile?)>> Array<out (PsiElement..PsiElement?)>.mapTo(destination: HashSet<(VirtualFile..VirtualFile?)>, transform: ((PsiElement..PsiElement?)) -> (VirtualFile..VirtualFile?)): HashSet<(VirtualFile..VirtualFile?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <R> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)
    <C : MutableCollection<in R>> -> HashSet<(com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)>

'HashSet' @ [104:56] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)

'it' @ [104:69] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processLightClassLocalImplementations.<anonymous>[ValueParameterDescriptorImpl]

'containingFile' @ [104:72] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'virtualFile' @ [104:87] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'filesScope' @ [105:49] ==> @NotNull public open fun filesScope(@NotNull p0: Project, @NotNull p1: (MutableCollection<(VirtualFile..VirtualFile?)>..Collection<(VirtualFile..VirtualFile?)>)): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'psiClass' @ [105:60] ==> value-parameter psiClass: KtLightClass defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processLightClassLocalImplementations[ValueParameterDescriptorImpl]

'project' @ [105:69] ==> public final val KtLightClass.project: Project[MyPropertyDescriptor]

'virtualFiles' @ [105:78] ==> val virtualFiles: HashSet<(VirtualFile..VirtualFile?)> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processLightClassLocalImplementations[LocalVariableDescriptor]

'process' @ [106:34] ==> public open fun <T : (Any..Any?)> process(@NotNull p0: (MutableIterable<(PsiClass..PsiClass?)>..Iterable<(PsiClass..PsiClass?)>), @NotNull p1: Processor<(PsiClass..PsiClass?)>): Boolean defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'search' @ [106:64] ==> @NotNull public open fun search(@NotNull p0: PsiClass, @NotNull p1: SearchScope, p2: Boolean): Query<(PsiClass..PsiClass?)> defined in com.intellij.psi.search.searches.ClassInheritorsSearch[JavaMethodDescriptor]

'psiClass' @ [106:71] ==> value-parameter psiClass: KtLightClass defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processLightClassLocalImplementations[ValueParameterDescriptorImpl]

'globalScope' @ [106:81] ==> val globalScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processLightClassLocalImplementations[LocalVariableDescriptor]

'Processor' @ [106:101] ==> public fun <T : (Any..Any?)> Processor(function: ((PsiClass..PsiClass?)) -> Boolean): Processor<PsiClass> defined in com.intellij.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> PsiClass

'candidate' @ [107:39] ==> value-parameter candidate: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processLightClassLocalImplementations.<anonymous>[ValueParameterDescriptorImpl]

'unwrapped' @ [107:49] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'candidate' @ [107:62] ==> value-parameter candidate: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processLightClassLocalImplementations.<anonymous>[ValueParameterDescriptorImpl]

'if (candidateOrigin in searchScope) {
                    consumer.process(candidate)
                }
                else {
                    true
                }' @ [108:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'candidateOrigin' @ [108:21] ==> val candidateOrigin: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processLightClassLocalImplementations.<anonymous>[LocalVariableDescriptor]

'searchScope' @ [108:40] ==> value-parameter searchScope: LocalSearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processLightClassLocalImplementations[ValueParameterDescriptorImpl]

'consumer' @ [109:21] ==> value-parameter consumer: Processor<PsiElement> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processLightClassLocalImplementations[ValueParameterDescriptorImpl]

'process' @ [109:30] ==> public abstract fun process(p0: (PsiElement..PsiElement?)): Boolean defined in com.intellij.util.Processor[JavaMethodDescriptor]

'candidate' @ [109:38] ==> value-parameter candidate: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processLightClassLocalImplementations.<anonymous>[ValueParameterDescriptorImpl]

'runReadAction' @ [118:29] ==> public fun <T> runReadAction(action: () -> PsiMethod?): PsiMethod? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod?

'LightClassUtil' @ [118:45] ==> public object LightClassUtil defined in org.jetbrains.kotlin.asJava[FakeCallableDescriptorForObject]

'getLightClassMethod' @ [118:60] ==> public final fun getLightClassMethod(function: KtFunction): PsiMethod? defined in org.jetbrains.kotlin.asJava.LightClassUtil[DeserializedSimpleFunctionDescriptor]

'function' @ [118:80] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processFunctionImplementations[ValueParameterDescriptorImpl]

'psiMethod' @ [120:20] ==> val psiMethod: PsiMethod? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processFunctionImplementations[LocalVariableDescriptor]

'let' @ [120:31] ==> @InlineOnly public inline fun <T, R> PsiMethod.let(block: (PsiMethod) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <R> -> Boolean

'processImplementations' @ [120:65] ==> public open fun processImplementations(p0: (PsiMethod..PsiMethod?), p1: (Processor<(PsiElement..PsiElement?)>..Processor<(PsiElement..PsiElement?)>?), p2: (SearchScope..SearchScope?)): Boolean defined in com.intellij.codeInsight.navigation.MethodImplementationsSearch[JavaMethodDescriptor]

'it' @ [120:88] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processFunctionImplementations.<anonymous>[ValueParameterDescriptorImpl]

'consumer' @ [120:92] ==> value-parameter consumer: Processor<PsiElement> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processFunctionImplementations[ValueParameterDescriptorImpl]

'scope' @ [120:102] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processFunctionImplementations[ValueParameterDescriptorImpl]

'runReadAction' @ [124:39] ==> public fun <T> runReadAction(action: () -> LightClassUtil.PropertyAccessorsPsiMethods): LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyAccessorsPsiMethods

'LightClassUtil' @ [124:55] ==> public object LightClassUtil defined in org.jetbrains.kotlin.asJava[FakeCallableDescriptorForObject]

'getLightClassPropertyMethods' @ [124:70] ==> public final fun getLightClassPropertyMethods(parameter: KtParameter): LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.asJava.LightClassUtil[DeserializedSimpleFunctionDescriptor]

'parameter' @ [124:99] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processPropertyImplementations[ValueParameterDescriptorImpl]

'processPropertyImplementationsMethods' @ [126:20] ==> public final fun processPropertyImplementationsMethods(accessors: LightClassUtil.PropertyAccessorsPsiMethods, scope: SearchScope, consumer: Processor<PsiElement>): Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion[SimpleFunctionDescriptorImpl]

'accessorsPsiMethods' @ [126:58] ==> val accessorsPsiMethods: LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processPropertyImplementations[LocalVariableDescriptor]

'scope' @ [126:79] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processPropertyImplementations[ValueParameterDescriptorImpl]

'consumer' @ [126:86] ==> value-parameter consumer: Processor<PsiElement> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processPropertyImplementations[ValueParameterDescriptorImpl]

'runReadAction' @ [130:39] ==> public fun <T> runReadAction(action: () -> LightClassUtil.PropertyAccessorsPsiMethods): LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyAccessorsPsiMethods

'LightClassUtil' @ [130:55] ==> public object LightClassUtil defined in org.jetbrains.kotlin.asJava[FakeCallableDescriptorForObject]

'getLightClassPropertyMethods' @ [130:70] ==> public final fun getLightClassPropertyMethods(property: KtProperty): LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.asJava.LightClassUtil[DeserializedSimpleFunctionDescriptor]

'property' @ [130:99] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processPropertyImplementations[ValueParameterDescriptorImpl]

'processPropertyImplementationsMethods' @ [132:20] ==> public final fun processPropertyImplementationsMethods(accessors: LightClassUtil.PropertyAccessorsPsiMethods, scope: SearchScope, consumer: Processor<PsiElement>): Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion[SimpleFunctionDescriptorImpl]

'accessorsPsiMethods' @ [132:58] ==> val accessorsPsiMethods: LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processPropertyImplementations[LocalVariableDescriptor]

'scope' @ [132:79] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processPropertyImplementations[ValueParameterDescriptorImpl]

'consumer' @ [132:86] ==> value-parameter consumer: Processor<PsiElement> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processPropertyImplementations[ValueParameterDescriptorImpl]

'accessors' @ [136:28] ==> value-parameter accessors: LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processPropertyImplementationsMethods[ValueParameterDescriptorImpl]

'ArrayList' @ [137:39] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiMethod

'getOverridingMethods' @ [138:45] ==> public open fun getOverridingMethods(p0: (PsiMethod..PsiMethod?), p1: (MutableList<(PsiMethod..PsiMethod?)>..List<(PsiMethod..PsiMethod?)>?), p2: (SearchScope..SearchScope?)): Unit defined in com.intellij.codeInsight.navigation.MethodImplementationsSearch[JavaMethodDescriptor]

'method' @ [138:66] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processPropertyImplementationsMethods[LocalVariableDescriptor]

'implementations' @ [138:74] ==> val implementations: ArrayList<PsiMethod> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processPropertyImplementationsMethods[LocalVariableDescriptor]

'scope' @ [138:91] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processPropertyImplementationsMethods[ValueParameterDescriptorImpl]

'implementations' @ [140:40] ==> val implementations: ArrayList<PsiMethod> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processPropertyImplementationsMethods[LocalVariableDescriptor]

'isDelegated' @ [141:25] ==> private final fun isDelegated(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion[SimpleFunctionDescriptorImpl]

'implementation' @ [141:37] ==> val implementation: PsiMethod defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processPropertyImplementationsMethods[LocalVariableDescriptor]

'implementation' @ [143:42] ==> val implementation: PsiMethod defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processPropertyImplementationsMethods[LocalVariableDescriptor]

'kotlinOrigin' @ [143:77] ==> public abstract val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethod[DeserializedPropertyDescriptor]

'when(mirrorElement) {
                        is KtProperty, is KtParameter -> mirrorElement
                        is KtPropertyAccessor -> if (mirrorElement.parent is KtProperty) mirrorElement.parent else implementation
                        else -> implementation
                    }' @ [144:44] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (PsiElement..PsiElement?), entry1: (PsiElement..PsiElement?), entry2: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'mirrorElement' @ [144:49] ==> val mirrorElement: KtDeclaration? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processPropertyImplementationsMethods[LocalVariableDescriptor]

'mirrorElement' @ [145:58] ==> val mirrorElement: KtDeclaration? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processPropertyImplementationsMethods[LocalVariableDescriptor]

'if (mirrorElement.parent is KtProperty) mirrorElement.parent else implementation' @ [146:50] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiElement..PsiElement?), elseBranch: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'mirrorElement' @ [146:54] ==> val mirrorElement: KtDeclaration? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processPropertyImplementationsMethods[LocalVariableDescriptor]

'parent' @ [146:68] ==> public final val KtPropertyAccessor.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'mirrorElement' @ [146:90] ==> val mirrorElement: KtDeclaration? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processPropertyImplementationsMethods[LocalVariableDescriptor]

'parent' @ [146:104] ==> public final val KtPropertyAccessor.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'implementation' @ [146:116] ==> val implementation: PsiMethod defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processPropertyImplementationsMethods[LocalVariableDescriptor]

'implementation' @ [147:33] ==> val implementation: PsiMethod defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processPropertyImplementationsMethods[LocalVariableDescriptor]

'!' @ [150:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'consumer' @ [150:26] ==> value-parameter consumer: Processor<PsiElement> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processPropertyImplementationsMethods[ValueParameterDescriptorImpl]

'process' @ [150:35] ==> public abstract fun process(p0: (PsiElement..PsiElement?)): Boolean defined in com.intellij.util.Processor[JavaMethodDescriptor]

'elementToProcess' @ [150:43] ==> val elementToProcess: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion.processPropertyImplementationsMethods[LocalVariableDescriptor]

