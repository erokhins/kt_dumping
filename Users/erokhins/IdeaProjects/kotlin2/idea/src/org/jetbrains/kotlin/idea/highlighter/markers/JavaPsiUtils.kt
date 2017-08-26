'HashSet' @ [33:19] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiClass

'methods' @ [34:20] ==> value-parameter methods: Collection<PsiMethod> defined in org.jetbrains.kotlin.idea.highlighter.markers.collectContainingClasses[ValueParameterDescriptorImpl]

'checkCanceled' @ [35:25] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'method' @ [36:27] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.highlighter.markers.collectContainingClasses[LocalVariableDescriptor]

'containingClass' @ [36:34] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'parentClass' @ [37:13] ==> val parentClass: PsiClass? defined in org.jetbrains.kotlin.idea.highlighter.markers.collectContainingClasses[LocalVariableDescriptor]

'!=' @ [37:36] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'JAVA_LANG_OBJECT' @ [37:53] ==> @NonNls public const final val JAVA_LANG_OBJECT: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'parentClass' @ [37:73] ==> val parentClass: PsiClass? defined in org.jetbrains.kotlin.idea.highlighter.markers.collectContainingClasses[LocalVariableDescriptor]

'qualifiedName' @ [37:85] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'classes' @ [38:13] ==> val classes: HashSet<PsiClass> defined in org.jetbrains.kotlin.idea.highlighter.markers.collectContainingClasses[LocalVariableDescriptor]

'add' @ [38:21] ==> public open fun add(element: PsiClass): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'parentClass' @ [38:25] ==> val parentClass: PsiClass? defined in org.jetbrains.kotlin.idea.highlighter.markers.collectContainingClasses[LocalVariableDescriptor]

'classes' @ [42:12] ==> val classes: HashSet<PsiClass> defined in org.jetbrains.kotlin.idea.highlighter.markers.collectContainingClasses[LocalVariableDescriptor]

'when {
        element == null -> null
        element is PsiClass -> element
        element is KtClass -> element.toLightClass()
        element.parent is KtClass -> (element.parent as KtClass).toLightClass()
        else -> null
    }' @ [46:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiClass?, entry1: PsiClass?, entry2: PsiClass?, entry3: PsiClass?, entry4: PsiClass?): PsiClass?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiClass?

'element' @ [47:9] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.markers.getPsiClass[ValueParameterDescriptorImpl]

'element' @ [48:9] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.markers.getPsiClass[ValueParameterDescriptorImpl]

'element' @ [48:32] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.markers.getPsiClass[ValueParameterDescriptorImpl]

'element' @ [49:9] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.markers.getPsiClass[ValueParameterDescriptorImpl]

'element' @ [49:31] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.markers.getPsiClass[ValueParameterDescriptorImpl]

'toLightClass' @ [49:39] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'element' @ [50:9] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.markers.getPsiClass[ValueParameterDescriptorImpl]

'parent' @ [50:17] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [50:39] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.markers.getPsiClass[ValueParameterDescriptorImpl]

'parent' @ [50:47] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'toLightClass' @ [50:66] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'element' @ [56:18] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.markers.getPsiMethod[ValueParameterDescriptorImpl]

'parent' @ [56:27] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when {
        element == null -> null
        element is PsiMethod -> element
        parent is KtNamedFunction || parent is KtSecondaryConstructor -> LightClassUtil.getLightClassMethod(parent as KtFunction)
        else -> null
    }' @ [57:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiMethod?, entry1: PsiMethod?, entry2: PsiMethod?, entry3: PsiMethod?): PsiMethod?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiMethod?

'element' @ [58:9] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.markers.getPsiMethod[ValueParameterDescriptorImpl]

'element' @ [59:9] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.markers.getPsiMethod[ValueParameterDescriptorImpl]

'element' @ [59:33] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.markers.getPsiMethod[ValueParameterDescriptorImpl]

'parent' @ [60:9] ==> val parent: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.markers.getPsiMethod[LocalVariableDescriptor]

'parent' @ [60:38] ==> val parent: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.markers.getPsiMethod[LocalVariableDescriptor]

'getLightClassMethod' @ [60:89] ==> public final fun getLightClassMethod(function: KtFunction): PsiMethod? defined in org.jetbrains.kotlin.asJava.LightClassUtil[DeserializedSimpleFunctionDescriptor]

'parent' @ [60:109] ==> val parent: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.markers.getPsiMethod[LocalVariableDescriptor]

