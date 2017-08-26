'LightClassGenerationSupport' @ [38:53] ==> public companion object defined in org.jetbrains.kotlin.asJava.LightClassGenerationSupport[FakeCallableDescriptorForObject]

'getInstance' @ [38:81] ==> @JvmStatic public final fun getInstance(project: Project): LightClassGenerationSupport defined in org.jetbrains.kotlin.asJava.LightClassGenerationSupport.Companion[SimpleFunctionDescriptorImpl]

'project' @ [38:93] ==> public final val KtClassOrObject.project: Project[MyPropertyDescriptor]

'getLightClass' @ [38:102] ==> public abstract fun getLightClass(classOrObject: KtClassOrObject): KtLightClass? defined in org.jetbrains.kotlin.asJava.LightClassGenerationSupport[SimpleFunctionDescriptorImpl]

'this' @ [38:116] ==> <this> defined in org.jetbrains.kotlin.asJava.toLightClass[ReceiverParameterDescriptorImpl]

'toLightClass' @ [41:5] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava in file lightClassUtils.kt[SimpleFunctionDescriptorImpl]

'let' @ [41:21] ==> @InlineOnly public inline fun <T, R> KtLightClass.let(block: (KtLightClass) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLightClass
    <R> -> Nothing

'it' @ [41:34] ==> value-parameter it: KtLightClass defined in org.jetbrains.kotlin.asJava.toLightClassWithBuiltinMapping.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [43:18] ==> public final val KtClassOrObject.fqName: FqName?[MyPropertyDescriptor]

'?:' @ [44:27] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: FqName?, right: FqName): FqName[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> FqName

'mapKotlinToJava' @ [44:48] ==> public final fun mapKotlinToJava(kotlinFqName: FqNameUnsafe): ClassId? defined in org.jetbrains.kotlin.platform.JavaToKotlinClassMap[DeserializedSimpleFunctionDescriptor]

'fqName' @ [44:64] ==> val fqName: FqName defined in org.jetbrains.kotlin.asJava.toLightClassWithBuiltinMapping[LocalVariableDescriptor]

'toUnsafe' @ [44:71] ==> @NotNull public open fun toUnsafe(): FqNameUnsafe defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'asSingleFqName' @ [44:84] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'useScope' @ [45:23] ==> public final val KtClassOrObject.useScope: SearchScope[MyPropertyDescriptor]

'getInstance' @ [46:26] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'project' @ [46:38] ==> public final val KtClassOrObject.project: Project[MyPropertyDescriptor]

'findClass' @ [46:47] ==> @Nullable public abstract fun findClass(@NonNls @NotNull p0: String, @NotNull p1: GlobalSearchScope): PsiClass? defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'javaClassFqName' @ [46:57] ==> val javaClassFqName: FqName defined in org.jetbrains.kotlin.asJava.toLightClassWithBuiltinMapping[LocalVariableDescriptor]

'asString' @ [46:73] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'searchScope' @ [46:85] ==> val searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.asJava.toLightClassWithBuiltinMapping[LocalVariableDescriptor]

'LightClassGenerationSupport' @ [50:12] ==> public companion object defined in org.jetbrains.kotlin.asJava.LightClassGenerationSupport[FakeCallableDescriptorForObject]

'getInstance' @ [50:40] ==> @JvmStatic public final fun getInstance(project: Project): LightClassGenerationSupport defined in org.jetbrains.kotlin.asJava.LightClassGenerationSupport.Companion[SimpleFunctionDescriptorImpl]

'project' @ [50:52] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'getFacadeClassesInPackage' @ [51:14] ==> public abstract fun getFacadeClassesInPackage(packageFqName: FqName, scope: GlobalSearchScope): Collection<PsiClass> defined in org.jetbrains.kotlin.asJava.LightClassGenerationSupport[SimpleFunctionDescriptorImpl]

'packageFqName' @ [51:40] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'this' @ [51:55] ==> <this> defined in org.jetbrains.kotlin.asJava.findFacadeClass[ReceiverParameterDescriptorImpl]

'useScope' @ [51:60] ==> public final val KtFile.useScope: SearchScope[MyPropertyDescriptor]

'projectScope' @ [51:112] ==> @NotNull public open fun projectScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [51:125] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'firstOrNull' @ [52:14] ==> public inline fun <T> Iterable<PsiClass>.firstOrNull(predicate: (PsiClass) -> Boolean): PsiClass? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'it' @ [52:28] ==> value-parameter it: PsiClass defined in org.jetbrains.kotlin.asJava.findFacadeClass.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [52:59] ==> <this> defined in org.jetbrains.kotlin.asJava.findFacadeClass[ReceiverParameterDescriptorImpl]

'it' @ [52:67] ==> value-parameter it: PsiClass defined in org.jetbrains.kotlin.asJava.findFacadeClass.<anonymous>[ValueParameterDescriptorImpl]

'files' @ [52:70] ==> public final val files: Collection<KtFile> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[PropertyDescriptorImpl]

'when (this) {
            is KtClassOrObject -> listOfNotNull(toLightClass())
            is KtNamedFunction,
            is KtSecondaryConstructor -> LightClassUtil.getLightClassMethods(this as KtFunction)
            is KtProperty -> LightClassUtil.getLightClassPropertyMethods(this).allDeclarations
            is KtPropertyAccessor -> listOfNotNull(LightClassUtil.getLightClassAccessorMethod(this))
            is KtParameter -> mutableListOf<PsiNamedElement>().also { elements ->
                toPsiParameters().toCollection(elements)
                LightClassUtil.getLightClassPropertyMethods(this).toCollection(elements)
                toAnnotationLightMethod()?.let(elements::add)
            }
            is KtTypeParameter -> toPsiTypeParameters()
            is KtFile -> listOfNotNull(findFacadeClass())
            else -> listOf()
        }' @ [56:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<PsiNamedElement>, entry1: List<PsiNamedElement>, entry2: List<PsiNamedElement>, entry3: List<PsiNamedElement>, entry4: List<PsiNamedElement>, entry5: List<PsiNamedElement>, entry6: List<PsiNamedElement>, entry7: List<PsiNamedElement>): List<PsiNamedElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<PsiNamedElement>

'this' @ [56:15] ==> <this> defined in org.jetbrains.kotlin.asJava.toLightElements[ReceiverParameterDescriptorImpl]

'listOfNotNull' @ [57:35] ==> public fun <T : Any> listOfNotNull(element: KtLightClass?): List<KtLightClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtLightClass

'toLightClass' @ [57:49] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava in file lightClassUtils.kt[SimpleFunctionDescriptorImpl]

'getLightClassMethods' @ [59:57] ==> public final fun getLightClassMethods(function: KtFunction): List<PsiMethod> defined in org.jetbrains.kotlin.asJava.LightClassUtil[SimpleFunctionDescriptorImpl]

'this' @ [59:78] ==> <this> defined in org.jetbrains.kotlin.asJava.toLightElements[ReceiverParameterDescriptorImpl]

'getLightClassPropertyMethods' @ [60:45] ==> public final fun getLightClassPropertyMethods(property: KtProperty): LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.asJava.LightClassUtil[SimpleFunctionDescriptorImpl]

'this' @ [60:74] ==> <this> defined in org.jetbrains.kotlin.asJava.toLightElements[ReceiverParameterDescriptorImpl]

'allDeclarations' @ [60:80] ==> public final val allDeclarations: List<PsiNamedElement> defined in org.jetbrains.kotlin.asJava.LightClassUtil.PropertyAccessorsPsiMethods[PropertyDescriptorImpl]

'listOfNotNull' @ [61:38] ==> public fun <T : Any> listOfNotNull(element: PsiMethod?): List<PsiMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PsiMethod

'getLightClassAccessorMethod' @ [61:67] ==> public final fun getLightClassAccessorMethod(accessor: KtPropertyAccessor): PsiMethod? defined in org.jetbrains.kotlin.asJava.LightClassUtil[SimpleFunctionDescriptorImpl]

'this' @ [61:95] ==> <this> defined in org.jetbrains.kotlin.asJava.toLightElements[ReceiverParameterDescriptorImpl]

'mutableListOf' @ [62:31] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<PsiNamedElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiNamedElement

'also' @ [62:64] ==> @InlineOnly @SinceKotlin public inline fun <T> MutableList<PsiNamedElement>.also(block: (MutableList<PsiNamedElement>) -> Unit): MutableList<PsiNamedElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableList<PsiNamedElement>

'toPsiParameters' @ [63:17] ==> public fun KtParameter.toPsiParameters(): Collection<PsiParameter> defined in org.jetbrains.kotlin.asJava in file lightClassUtils.kt[SimpleFunctionDescriptorImpl]

'toCollection' @ [63:35] ==> public fun <T, C : MutableCollection<in PsiParameter>> Iterable<PsiParameter>.toCollection(destination: MutableList<PsiNamedElement>): MutableList<PsiNamedElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiParameter
    <C : MutableCollection<in T>> -> MutableList<PsiNamedElement>

'elements' @ [63:48] ==> value-parameter elements: MutableList<PsiNamedElement> defined in org.jetbrains.kotlin.asJava.toLightElements.<anonymous>[ValueParameterDescriptorImpl]

'LightClassUtil' @ [64:17] ==> public object LightClassUtil defined in org.jetbrains.kotlin.asJava in file LightClassUtil.kt[FakeCallableDescriptorForObject]

'getLightClassPropertyMethods' @ [64:32] ==> public final fun getLightClassPropertyMethods(parameter: KtParameter): LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.asJava.LightClassUtil[SimpleFunctionDescriptorImpl]

'this' @ [64:61] ==> <this> defined in org.jetbrains.kotlin.asJava.toLightElements[ReceiverParameterDescriptorImpl]

'toCollection' @ [64:67] ==> public fun <T, C : MutableCollection<in PsiMethod>> Iterable<PsiMethod>.toCollection(destination: MutableList<PsiNamedElement>): MutableList<PsiNamedElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <C : MutableCollection<in T>> -> MutableList<PsiNamedElement>

'elements' @ [64:80] ==> value-parameter elements: MutableList<PsiNamedElement> defined in org.jetbrains.kotlin.asJava.toLightElements.<anonymous>[ValueParameterDescriptorImpl]

'toAnnotationLightMethod' @ [65:17] ==> private fun KtParameter.toAnnotationLightMethod(): PsiMethod? defined in org.jetbrains.kotlin.asJava in file lightClassUtils.kt[SimpleFunctionDescriptorImpl]

'let' @ [65:44] ==> @InlineOnly public inline fun <T, R> PsiMethod.let(block: (PsiMethod) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <R> -> Boolean

'elements' @ [65:48] ==> value-parameter elements: MutableList<PsiNamedElement> defined in org.jetbrains.kotlin.asJava.toLightElements.<anonymous>[ValueParameterDescriptorImpl]

'add' @ [65:58] ==> public abstract fun add(element: PsiNamedElement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'toPsiTypeParameters' @ [67:35] ==> public fun KtTypeParameter.toPsiTypeParameters(): List<PsiTypeParameter> defined in org.jetbrains.kotlin.asJava in file lightClassUtils.kt[SimpleFunctionDescriptorImpl]

'listOfNotNull' @ [68:26] ==> public fun <T : Any> listOfNotNull(element: KtLightClass?): List<KtLightClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtLightClass

'findFacadeClass' @ [68:40] ==> public fun KtFile.findFacadeClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava in file lightClassUtils.kt[SimpleFunctionDescriptorImpl]

'listOf' @ [69:21] ==> @InlineOnly public inline fun <T> listOf(): List<PsiNamedElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiNamedElement

'when (this) {
            is KtFunction -> LightClassUtil.getLightClassMethods(this)
            is KtProperty -> LightClassUtil.getLightClassPropertyMethods(this).toList()
            is KtParameter -> LightClassUtil.getLightClassPropertyMethods(this).toList()
            is KtPropertyAccessor -> LightClassUtil.getLightClassAccessorMethods(this)
            is KtClass -> listOfNotNull(toLightClass()?.constructors?.firstOrNull())
            is PsiMethod -> listOf(this)
            else -> listOf()
        }' @ [73:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<PsiMethod>, entry1: List<PsiMethod>, entry2: List<PsiMethod>, entry3: List<PsiMethod>, entry4: List<PsiMethod>, entry5: List<PsiMethod>, entry6: List<PsiMethod>): List<PsiMethod>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<PsiMethod>

'this' @ [73:15] ==> <this> defined in org.jetbrains.kotlin.asJava.toLightMethods[ReceiverParameterDescriptorImpl]

'getLightClassMethods' @ [74:45] ==> public final fun getLightClassMethods(function: KtFunction): List<PsiMethod> defined in org.jetbrains.kotlin.asJava.LightClassUtil[SimpleFunctionDescriptorImpl]

'this' @ [74:66] ==> <this> defined in org.jetbrains.kotlin.asJava.toLightMethods[ReceiverParameterDescriptorImpl]

'getLightClassPropertyMethods' @ [75:45] ==> public final fun getLightClassPropertyMethods(property: KtProperty): LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.asJava.LightClassUtil[SimpleFunctionDescriptorImpl]

'this' @ [75:74] ==> <this> defined in org.jetbrains.kotlin.asJava.toLightMethods[ReceiverParameterDescriptorImpl]

'toList' @ [75:80] ==> public fun <T> Iterable<PsiMethod>.toList(): List<PsiMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'getLightClassPropertyMethods' @ [76:46] ==> public final fun getLightClassPropertyMethods(parameter: KtParameter): LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.asJava.LightClassUtil[SimpleFunctionDescriptorImpl]

'this' @ [76:75] ==> <this> defined in org.jetbrains.kotlin.asJava.toLightMethods[ReceiverParameterDescriptorImpl]

'toList' @ [76:81] ==> public fun <T> Iterable<PsiMethod>.toList(): List<PsiMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'getLightClassAccessorMethods' @ [77:53] ==> public final fun getLightClassAccessorMethods(accessor: KtPropertyAccessor): List<PsiMethod> defined in org.jetbrains.kotlin.asJava.LightClassUtil[SimpleFunctionDescriptorImpl]

'this' @ [77:82] ==> <this> defined in org.jetbrains.kotlin.asJava.toLightMethods[ReceiverParameterDescriptorImpl]

'listOfNotNull' @ [78:27] ==> public fun <T : Any> listOfNotNull(element: PsiMethod?): List<PsiMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PsiMethod

'toLightClass' @ [78:41] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava in file lightClassUtils.kt[SimpleFunctionDescriptorImpl]

'constructors' @ [78:57] ==> public final val KtLightClass.constructors: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'firstOrNull' @ [78:71] ==> public fun <T> Array<out (PsiMethod..PsiMethod?)>.firstOrNull(): PsiMethod? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'listOf' @ [79:29] ==> public fun <T> listOf(element: PsiMethod): List<PsiMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'this' @ [79:36] ==> <this> defined in org.jetbrains.kotlin.asJava.toLightMethods[ReceiverParameterDescriptorImpl]

'listOf' @ [80:21] ==> @InlineOnly public inline fun <T> listOf(): List<PsiMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'when (this) {
            is KtFunction -> LightClassUtil.getLightClassMethod(this)
            is KtProperty -> LightClassUtil.getLightClassPropertyMethods(this).getter
            is KtParameter -> LightClassUtil.getLightClassPropertyMethods(this).getter
            is KtPropertyAccessor -> LightClassUtil.getLightClassAccessorMethod(this)
            is PsiMethod -> this
            else -> null
        }' @ [84:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiMethod?, entry1: PsiMethod?, entry2: PsiMethod?, entry3: PsiMethod?, entry4: PsiMethod?, entry5: PsiMethod?): PsiMethod?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiMethod?

'this' @ [84:15] ==> <this> defined in org.jetbrains.kotlin.asJava.getRepresentativeLightMethod[ReceiverParameterDescriptorImpl]

'getLightClassMethod' @ [85:45] ==> public final fun getLightClassMethod(function: KtFunction): PsiMethod? defined in org.jetbrains.kotlin.asJava.LightClassUtil[SimpleFunctionDescriptorImpl]

'this' @ [85:65] ==> <this> defined in org.jetbrains.kotlin.asJava.getRepresentativeLightMethod[ReceiverParameterDescriptorImpl]

'getLightClassPropertyMethods' @ [86:45] ==> public final fun getLightClassPropertyMethods(property: KtProperty): LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.asJava.LightClassUtil[SimpleFunctionDescriptorImpl]

'this' @ [86:74] ==> <this> defined in org.jetbrains.kotlin.asJava.getRepresentativeLightMethod[ReceiverParameterDescriptorImpl]

'getter' @ [86:80] ==> public final val getter: PsiMethod? defined in org.jetbrains.kotlin.asJava.LightClassUtil.PropertyAccessorsPsiMethods[PropertyDescriptorImpl]

'getLightClassPropertyMethods' @ [87:46] ==> public final fun getLightClassPropertyMethods(parameter: KtParameter): LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.asJava.LightClassUtil[SimpleFunctionDescriptorImpl]

'this' @ [87:75] ==> <this> defined in org.jetbrains.kotlin.asJava.getRepresentativeLightMethod[ReceiverParameterDescriptorImpl]

'getter' @ [87:81] ==> public final val getter: PsiMethod? defined in org.jetbrains.kotlin.asJava.LightClassUtil.PropertyAccessorsPsiMethods[PropertyDescriptorImpl]

'getLightClassAccessorMethod' @ [88:53] ==> public final fun getLightClassAccessorMethod(accessor: KtPropertyAccessor): PsiMethod? defined in org.jetbrains.kotlin.asJava.LightClassUtil[SimpleFunctionDescriptorImpl]

'this' @ [88:81] ==> <this> defined in org.jetbrains.kotlin.asJava.getRepresentativeLightMethod[ReceiverParameterDescriptorImpl]

'this' @ [89:29] ==> <this> defined in org.jetbrains.kotlin.asJava.getRepresentativeLightMethod[ReceiverParameterDescriptorImpl]

'getNonStrictParentOfType' @ [94:21] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtParameterList? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtParameterList

'emptyList' @ [94:75] ==> public fun <T> emptyList(): List<PsiParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiParameter

'paramList' @ [96:22] ==> val paramList: KtParameterList defined in org.jetbrains.kotlin.asJava.toPsiParameters[LocalVariableDescriptor]

'parameters' @ [96:32] ==> public final val KtParameterList.parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'indexOf' @ [96:43] ==> public abstract fun indexOf(element: (KtParameter..KtParameter?)): Int defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'this' @ [96:51] ==> <this> defined in org.jetbrains.kotlin.asJava.toPsiParameters[ReceiverParameterDescriptorImpl]

'paramIndex' @ [97:9] ==> val paramIndex: Int defined in org.jetbrains.kotlin.asJava.toPsiParameters[LocalVariableDescriptor]

'emptyList' @ [97:32] ==> public fun <T> emptyList(): List<PsiParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiParameter

'paramList' @ [98:17] ==> val paramList: KtParameterList defined in org.jetbrains.kotlin.asJava.toPsiParameters[LocalVariableDescriptor]

'parent' @ [98:27] ==> public final val KtParameterList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (owner is KtDeclaration && owner.isExtensionDeclaration()) paramIndex + 1 else paramIndex' @ [99:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'owner' @ [99:31] ==> val owner: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.asJava.toPsiParameters[LocalVariableDescriptor]

'owner' @ [99:57] ==> val owner: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.asJava.toPsiParameters[LocalVariableDescriptor]

'isExtensionDeclaration' @ [99:63] ==> public fun PsiElement.isExtensionDeclaration(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'paramIndex' @ [99:89] ==> val paramIndex: Int defined in org.jetbrains.kotlin.asJava.toPsiParameters[LocalVariableDescriptor]

'paramIndex' @ [99:109] ==> val paramIndex: Int defined in org.jetbrains.kotlin.asJava.toPsiParameters[LocalVariableDescriptor]

'when (owner) {
                is KtFunction -> LightClassUtil.getLightClassMethods(owner)
                is KtPropertyAccessor -> LightClassUtil.getLightClassAccessorMethods(owner)
                else -> null
            }' @ [102:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<PsiMethod>?, entry1: List<PsiMethod>?, entry2: List<PsiMethod>?): List<PsiMethod>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<PsiMethod>?

'owner' @ [102:19] ==> val owner: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.asJava.toPsiParameters[LocalVariableDescriptor]

'getLightClassMethods' @ [103:49] ==> public final fun getLightClassMethods(function: KtFunction): List<PsiMethod> defined in org.jetbrains.kotlin.asJava.LightClassUtil[SimpleFunctionDescriptorImpl]

'owner' @ [103:70] ==> val owner: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.asJava.toPsiParameters[LocalVariableDescriptor]

'getLightClassAccessorMethods' @ [104:57] ==> public final fun getLightClassAccessorMethods(accessor: KtPropertyAccessor): List<PsiMethod> defined in org.jetbrains.kotlin.asJava.LightClassUtil[SimpleFunctionDescriptorImpl]

'owner' @ [104:86] ==> val owner: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.asJava.toPsiParameters[LocalVariableDescriptor]

'emptyList' @ [106:25] ==> public fun <T> emptyList(): List<PsiParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiParameter

'methods' @ [108:12] ==> val methods: Collection<PsiMethod> defined in org.jetbrains.kotlin.asJava.toPsiParameters[LocalVariableDescriptor]

'mapNotNull' @ [108:20] ==> public inline fun <T, R : Any> Iterable<PsiMethod>.mapNotNull(transform: (PsiMethod) -> PsiParameter?): List<PsiParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <R : Any> -> PsiParameter

'it' @ [108:33] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.asJava.toPsiParameters.<anonymous>[ValueParameterDescriptorImpl]

'parameterList' @ [108:36] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parameters' @ [108:50] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'getOrNull' @ [108:61] ==> public fun <T> Array<out (PsiParameter..PsiParameter?)>.getOrNull(index: Int): PsiParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiParameter..com.intellij.psi.PsiParameter?)

'lightParamIndex' @ [108:71] ==> val lightParamIndex: Int defined in org.jetbrains.kotlin.asJava.toPsiParameters[LocalVariableDescriptor]

'ownerFunction' @ [112:18] ==> public final val KtParameter.ownerFunction: KtDeclarationWithBody?[MyPropertyDescriptor]

'parent' @ [113:27] ==> val parent: KtPrimaryConstructor defined in org.jetbrains.kotlin.asJava.toAnnotationLightMethod[LocalVariableDescriptor]

'getContainingClassOrObject' @ [113:34] ==> public open fun getContainingClassOrObject(): KtClassOrObject defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[DeserializedSimpleFunctionDescriptor]

'!' @ [114:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containingClass' @ [114:10] ==> val containingClass: KtClassOrObject defined in org.jetbrains.kotlin.asJava.toAnnotationLightMethod[LocalVariableDescriptor]

'isAnnotation' @ [114:26] ==> public final fun isAnnotation(): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'LightClassUtil' @ [116:12] ==> public object LightClassUtil defined in org.jetbrains.kotlin.asJava in file LightClassUtil.kt[FakeCallableDescriptorForObject]

'getLightClassMethod' @ [116:27] ==> public final fun getLightClassMethod(parameter: KtParameter): PsiMethod? defined in org.jetbrains.kotlin.asJava.LightClassUtil[SimpleFunctionDescriptorImpl]

'this' @ [116:47] ==> <this> defined in org.jetbrains.kotlin.asJava.toAnnotationLightMethod[ReceiverParameterDescriptorImpl]

'getNonStrictParentOfType' @ [120:21] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtTypeParameterList? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeParameterList

'listOf' @ [120:79] ==> @InlineOnly public inline fun <T> listOf(): List<PsiTypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiTypeParameter

'paramList' @ [122:22] ==> val paramList: KtTypeParameterList defined in org.jetbrains.kotlin.asJava.toPsiTypeParameters[LocalVariableDescriptor]

'parameters' @ [122:32] ==> public final val KtTypeParameterList.parameters: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>)[MyPropertyDescriptor]

'indexOf' @ [122:43] ==> public abstract fun indexOf(element: (KtTypeParameter..KtTypeParameter?)): Int defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'this' @ [122:51] ==> <this> defined in org.jetbrains.kotlin.asJava.toPsiTypeParameters[ReceiverParameterDescriptorImpl]

'paramList' @ [123:25] ==> val paramList: KtTypeParameterList defined in org.jetbrains.kotlin.asJava.toPsiTypeParameters[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [123:35] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDeclaration

'listOf' @ [123:87] ==> @InlineOnly public inline fun <T> listOf(): List<PsiTypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiTypeParameter

'ktDeclaration' @ [124:23] ==> val ktDeclaration: KtDeclaration defined in org.jetbrains.kotlin.asJava.toPsiTypeParameters[LocalVariableDescriptor]

'toLightElements' @ [124:37] ==> public fun KtElement.toLightElements(): List<PsiNamedElement> defined in org.jetbrains.kotlin.asJava in file lightClassUtils.kt[SimpleFunctionDescriptorImpl]

'lightOwners' @ [126:12] ==> val lightOwners: List<PsiNamedElement> defined in org.jetbrains.kotlin.asJava.toPsiTypeParameters[LocalVariableDescriptor]

'mapNotNull' @ [126:24] ==> public inline fun <T, R : Any> Iterable<PsiNamedElement>.mapNotNull(transform: (PsiNamedElement) -> PsiTypeParameter?): List<PsiTypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiNamedElement
    <R : Any> -> PsiTypeParameter

'lightOwner' @ [127:10] ==> value-parameter lightOwner: PsiNamedElement defined in org.jetbrains.kotlin.asJava.toPsiTypeParameters.<anonymous>[ValueParameterDescriptorImpl]

'typeParameters' @ [127:53] ==> public final val PsiTypeParameterListOwner.typeParameters: (Array<(PsiTypeParameter..PsiTypeParameter?)>..Array<out (PsiTypeParameter..PsiTypeParameter?)>)[MyPropertyDescriptor]

'getOrNull' @ [127:69] ==> public fun <T> Array<out (PsiTypeParameter..PsiTypeParameter?)>.getOrNull(index: Int): PsiTypeParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiTypeParameter..com.intellij.psi.PsiTypeParameter?)

'paramIndex' @ [127:79] ==> val paramIndex: Int defined in org.jetbrains.kotlin.asJava.toPsiTypeParameters[LocalVariableDescriptor]

'when {
        this is KtLightElement<*, *> -> kotlinOrigin
        this is KtLightIdentifier -> origin
        this is KtLightAnnotationForSourceEntry.LightExpressionValue<*> -> originalExpression
        else -> this
    }' @ [133:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?, entry3: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'this' @ [134:9] ==> <this> defined in org.jetbrains.kotlin.asJava.unwrapped[ReceiverParameterDescriptorImpl]

'kotlinOrigin' @ [134:41] ==> public abstract val kotlinOrigin: KtElement? defined in org.jetbrains.kotlin.asJava.elements.KtLightElement[PropertyDescriptorImpl]

'this' @ [135:9] ==> <this> defined in org.jetbrains.kotlin.asJava.unwrapped[ReceiverParameterDescriptorImpl]

'origin' @ [135:38] ==> public final val origin: PsiElement? defined in org.jetbrains.kotlin.asJava.elements.KtLightIdentifier[PropertyDescriptorImpl]

'this' @ [136:9] ==> <this> defined in org.jetbrains.kotlin.asJava.unwrapped[ReceiverParameterDescriptorImpl]

'originalExpression' @ [136:76] ==> public final val originalExpression: PsiElement? defined in org.jetbrains.kotlin.asJava.elements.KtLightAnnotationForSourceEntry.LightExpressionValue[PropertyDescriptorImpl]

'this' @ [137:17] ==> <this> defined in org.jetbrains.kotlin.asJava.unwrapped[ReceiverParameterDescriptorImpl]

'unwrapped' @ [141:13] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava in file lightClassUtils.kt[PropertyDescriptorImpl]

'getNonStrictParentOfType' @ [141:24] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): PsiNamedElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> PsiNamedElement

'this' @ [145:13] ==> <this> defined in org.jetbrains.kotlin.asJava.hasInterfaceDefaultImpls[ReceiverParameterDescriptorImpl]

'isInterface' @ [145:32] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'hasNonAbstractMembers' @ [145:49] ==> private fun hasNonAbstractMembers(ktInterface: KtClass): Boolean defined in org.jetbrains.kotlin.asJava in file lightClassUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [145:71] ==> <this> defined in org.jetbrains.kotlin.asJava.hasInterfaceDefaultImpls[ReceiverParameterDescriptorImpl]

'ktInterface' @ [148:12] ==> value-parameter ktInterface: KtClass defined in org.jetbrains.kotlin.asJava.hasNonAbstractMembers[ValueParameterDescriptorImpl]

'declarations' @ [148:24] ==> public final val KtClass.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'any' @ [148:37] ==> public inline fun <T> Iterable<KtDeclaration>.any(predicate: (KtDeclaration) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'isNonAbstractMember' @ [148:43] ==> private fun isNonAbstractMember(member: KtDeclaration?): Boolean defined in org.jetbrains.kotlin.asJava in file lightClassUtils.kt[SimpleFunctionDescriptorImpl]

'member' @ [152:13] ==> value-parameter member: KtDeclaration? defined in org.jetbrains.kotlin.asJava.isNonAbstractMember[ValueParameterDescriptorImpl]

'member' @ [152:42] ==> value-parameter member: KtDeclaration? defined in org.jetbrains.kotlin.asJava.isNonAbstractMember[ValueParameterDescriptorImpl]

'hasBody' @ [152:49] ==> public open fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'member' @ [153:13] ==> value-parameter member: KtDeclaration? defined in org.jetbrains.kotlin.asJava.isNonAbstractMember[ValueParameterDescriptorImpl]

'member' @ [153:38] ==> value-parameter member: KtDeclaration? defined in org.jetbrains.kotlin.asJava.isNonAbstractMember[ValueParameterDescriptorImpl]

'hasDelegateExpressionOrInitializer' @ [153:45] ==> public open fun hasDelegateExpressionOrInitializer(): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'member' @ [153:85] ==> value-parameter member: KtDeclaration? defined in org.jetbrains.kotlin.asJava.isNonAbstractMember[ValueParameterDescriptorImpl]

'getter' @ [153:92] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'hasBody' @ [153:100] ==> public open fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtPropertyAccessor[JavaMethodDescriptor]

'member' @ [153:122] ==> value-parameter member: KtDeclaration? defined in org.jetbrains.kotlin.asJava.isNonAbstractMember[ValueParameterDescriptorImpl]

'setter' @ [153:129] ==> public final val KtProperty.setter: KtPropertyAccessor?[MyPropertyDescriptor]

'hasBody' @ [153:137] ==> public open fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtPropertyAccessor[JavaMethodDescriptor]

'identifier' @ [156:45] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'DEFAULT_IMPLS_CLASS_NAME' @ [156:63] ==> public const final val DEFAULT_IMPLS_CLASS_NAME: String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaPropertyDescriptor]

'child' @ [157:34] ==> @NotNull public open fun child(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'DEFAULT_IMPLS_CLASS_NAME' @ [157:40] ==> private val DEFAULT_IMPLS_CLASS_NAME: Name defined in org.jetbrains.kotlin.asJava in file lightClassUtils.kt[PropertyDescriptorImpl]

'Suppress' @ [159:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'getStrictParentOfType' @ [161:25] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtModifierList? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtModifierList

'parent' @ [161:66] ==> public final val KtModifierList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'ktDeclaration' @ [162:26] ==> val ktDeclaration: KtDeclaration defined in org.jetbrains.kotlin.asJava.toLightAnnotation[LocalVariableDescriptor]

'toLightElements' @ [162:40] ==> public fun KtElement.toLightElements(): List<PsiNamedElement> defined in org.jetbrains.kotlin.asJava in file lightClassUtils.kt[SimpleFunctionDescriptorImpl]

'lightElement' @ [163:13] ==> val lightElement: PsiNamedElement defined in org.jetbrains.kotlin.asJava.toLightAnnotation[LocalVariableDescriptor]

'lightElement' @ [164:9] ==> val lightElement: PsiNamedElement defined in org.jetbrains.kotlin.asJava.toLightAnnotation[LocalVariableDescriptor]

'modifierList' @ [164:22] ==> public final val PsiModifierListOwner.modifierList: PsiModifierList?[MyPropertyDescriptor]

'annotations' @ [164:36] ==> public final val PsiModifierList.annotations: (Array<(PsiAnnotation..PsiAnnotation?)>..Array<out (PsiAnnotation..PsiAnnotation?)>)[MyPropertyDescriptor]

'firstOrNull' @ [164:49] ==> public inline fun <T> Array<out (PsiAnnotation..PsiAnnotation?)>.firstOrNull(predicate: ((PsiAnnotation..PsiAnnotation?)) -> Boolean): PsiAnnotation? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiAnnotation..com.intellij.psi.PsiAnnotation?)

'it' @ [164:63] ==> value-parameter it: (PsiAnnotation..PsiAnnotation?) defined in org.jetbrains.kotlin.asJava.toLightAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [164:104] ==> value-parameter it: (PsiAnnotation..PsiAnnotation?) defined in org.jetbrains.kotlin.asJava.toLightAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [164:107] ==> public open val kotlinOrigin: KtCallElement defined in org.jetbrains.kotlin.asJava.elements.KtLightAnnotationForSourceEntry[PropertyDescriptorImpl]

'this' @ [164:123] ==> <this> defined in org.jetbrains.kotlin.asJava.toLightAnnotation[ReceiverParameterDescriptorImpl]

'let' @ [164:131] ==> @InlineOnly public inline fun <T, R> PsiAnnotation.let(block: (PsiAnnotation) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiAnnotation
    <R> -> Nothing

'it' @ [164:144] ==> value-parameter it: PsiAnnotation defined in org.jetbrains.kotlin.asJava.toLightAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'accessor' @ [170:20] ==> value-parameter accessor: KtLightMethod defined in org.jetbrains.kotlin.asJava.propertyNameByAccessor[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [170:29] ==> public abstract val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethod[PropertyDescriptorImpl]

'toRename' @ [171:9] ==> val toRename: KtDeclaration defined in org.jetbrains.kotlin.asJava.propertyNameByAccessor[LocalVariableDescriptor]

'toRename' @ [171:36] ==> val toRename: KtDeclaration defined in org.jetbrains.kotlin.asJava.propertyNameByAccessor[LocalVariableDescriptor]

'guessByFirstCharacter' @ [173:27] ==> @NotNull public open fun guessByFirstCharacter(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [173:49] ==> value-parameter name: String defined in org.jetbrains.kotlin.asJava.propertyNameByAccessor[ValueParameterDescriptorImpl]

'toRename' @ [174:24] ==> val toRename: KtDeclaration defined in org.jetbrains.kotlin.asJava.propertyNameByAccessor[LocalVariableDescriptor]

'name' @ [174:33] ==> public final val KtDeclaration.name: String?[MyPropertyDescriptor]

'when {
        JvmAbi.isGetterName(name) -> propertyNameByGetMethodName(methodName)
        JvmAbi.isSetterName(name) -> propertyNameBySetMethodName(methodName, propertyName.startsWith("is"))
        else -> methodName
    }' @ [175:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Name?, entry1: Name?, entry2: Name?): Name?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Name?

'isGetterName' @ [176:16] ==> public open fun isGetterName(@NotNull p0: String): Boolean defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'name' @ [176:29] ==> value-parameter name: String defined in org.jetbrains.kotlin.asJava.propertyNameByAccessor[ValueParameterDescriptorImpl]

'propertyNameByGetMethodName' @ [176:38] ==> public fun propertyNameByGetMethodName(methodName: Name): Name? defined in org.jetbrains.kotlin.load.java[DeserializedSimpleFunctionDescriptor]

'methodName' @ [176:66] ==> val methodName: Name defined in org.jetbrains.kotlin.asJava.propertyNameByAccessor[LocalVariableDescriptor]

'isSetterName' @ [177:16] ==> public open fun isSetterName(@NotNull p0: String): Boolean defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'name' @ [177:29] ==> value-parameter name: String defined in org.jetbrains.kotlin.asJava.propertyNameByAccessor[ValueParameterDescriptorImpl]

'propertyNameBySetMethodName' @ [177:38] ==> public fun propertyNameBySetMethodName(methodName: Name, withIsPrefix: Boolean): Name? defined in org.jetbrains.kotlin.load.java[DeserializedSimpleFunctionDescriptor]

'methodName' @ [177:66] ==> val methodName: Name defined in org.jetbrains.kotlin.asJava.propertyNameByAccessor[LocalVariableDescriptor]

'propertyName' @ [177:78] ==> val propertyName: String defined in org.jetbrains.kotlin.asJava.propertyNameByAccessor[LocalVariableDescriptor]

'startsWith' @ [177:91] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'methodName' @ [178:17] ==> val methodName: Name defined in org.jetbrains.kotlin.asJava.propertyNameByAccessor[LocalVariableDescriptor]

'asString' @ [179:8] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'accessor' @ [183:22] ==> value-parameter accessor: KtLightMethod defined in org.jetbrains.kotlin.asJava.accessorNameByPropertyName[ValueParameterDescriptorImpl]

'name' @ [183:31] ==> public final var KtLightMethod.name: String[MyPropertyDescriptor]

'when {
        JvmAbi.isGetterName(methodName) -> JvmAbi.getterName(name)
        JvmAbi.isSetterName(methodName) -> JvmAbi.setterName(name)
        else -> null
    }' @ [184:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'isGetterName' @ [185:16] ==> public open fun isGetterName(@NotNull p0: String): Boolean defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'methodName' @ [185:29] ==> val methodName: String defined in org.jetbrains.kotlin.asJava.accessorNameByPropertyName[LocalVariableDescriptor]

'getterName' @ [185:51] ==> @NotNull public open fun getterName(@NotNull p0: String): String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'name' @ [185:62] ==> value-parameter name: String defined in org.jetbrains.kotlin.asJava.accessorNameByPropertyName[ValueParameterDescriptorImpl]

'isSetterName' @ [186:16] ==> public open fun isSetterName(@NotNull p0: String): Boolean defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'methodName' @ [186:29] ==> val methodName: String defined in org.jetbrains.kotlin.asJava.accessorNameByPropertyName[LocalVariableDescriptor]

'setterName' @ [186:51] ==> @NotNull public open fun setterName(@NotNull p0: String): String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'name' @ [186:62] ==> value-parameter name: String defined in org.jetbrains.kotlin.asJava.accessorNameByPropertyName[ValueParameterDescriptorImpl]

'listOf' @ [192:12] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'setterName' @ [192:26] ==> @NotNull public open fun setterName(@NotNull p0: String): String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'name' @ [192:37] ==> value-parameter name: String defined in org.jetbrains.kotlin.asJava.getAccessorNamesCandidatesByPropertyName[ValueParameterDescriptorImpl]

'getterName' @ [192:51] ==> @NotNull public open fun getterName(@NotNull p0: String): String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'name' @ [192:62] ==> value-parameter name: String defined in org.jetbrains.kotlin.asJava.getAccessorNamesCandidatesByPropertyName[ValueParameterDescriptorImpl]

