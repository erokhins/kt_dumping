'DeclarationsChecker' @ [54:13] ==> public constructor DeclarationsChecker(descriptorResolver: DescriptorResolver, modifiersChecker: ModifiersChecker, annotationChecker: AnnotationChecker, identifierChecker: IdentifierChecker, trace: BindingTrace, languageVersionSettings: LanguageVersionSettings, typeSpecificityComparator: TypeSpecificityComparator) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[ClassConstructorDescriptorImpl]

'descriptorResolver' @ [54:33] ==> private final val descriptorResolver: DescriptorResolver defined in org.jetbrains.kotlin.resolve.DeclarationsCheckerBuilder[PropertyDescriptorImpl]

'originalModifiersChecker' @ [54:53] ==> private final val originalModifiersChecker: ModifiersChecker defined in org.jetbrains.kotlin.resolve.DeclarationsCheckerBuilder[PropertyDescriptorImpl]

'annotationChecker' @ [54:79] ==> private final val annotationChecker: AnnotationChecker defined in org.jetbrains.kotlin.resolve.DeclarationsCheckerBuilder[PropertyDescriptorImpl]

'identifierChecker' @ [54:98] ==> private final val identifierChecker: IdentifierChecker defined in org.jetbrains.kotlin.resolve.DeclarationsCheckerBuilder[PropertyDescriptorImpl]

'trace' @ [54:117] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsCheckerBuilder.withTrace[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [54:124] ==> private final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.DeclarationsCheckerBuilder[PropertyDescriptorImpl]

'typeSpecificityComparator' @ [54:149] ==> private final val typeSpecificityComparator: TypeSpecificityComparator defined in org.jetbrains.kotlin.resolve.DeclarationsCheckerBuilder[PropertyDescriptorImpl]

'modifiersChecker' @ [67:36] ==> value-parameter modifiersChecker: ModifiersChecker defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.<init>[ValueParameterDescriptorImpl]

'withTrace' @ [67:53] ==> @NotNull public open fun withTrace(@NotNull trace: BindingTrace): ModifiersChecker.ModifiersCheckingProcedure defined in org.jetbrains.kotlin.resolve.ModifiersChecker[JavaMethodDescriptor]

'trace' @ [67:63] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'ExposedVisibilityChecker' @ [69:34] ==> public constructor ExposedVisibilityChecker(trace: DiagnosticSink = ...) defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker[ClassConstructorDescriptorImpl]

'trace' @ [69:59] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'ShadowedExtensionChecker' @ [71:44] ==> public constructor ShadowedExtensionChecker(typeSpecificityComparator: TypeSpecificityComparator, trace: DiagnosticSink) defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker[ClassConstructorDescriptorImpl]

'typeSpecificityComparator' @ [71:69] ==> value-parameter typeSpecificityComparator: TypeSpecificityComparator defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.<init>[ValueParameterDescriptorImpl]

'trace' @ [71:96] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'bodiesResolveContext' @ [74:22] ==> value-parameter bodiesResolveContext: BodiesResolveContext defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[ValueParameterDescriptorImpl]

'files' @ [74:43] ==> public final val BodiesResolveContext.files: (Collection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>?)[MyPropertyDescriptor]

'checkModifiersAndAnnotationsInPackageDirective' @ [75:13] ==> private final fun checkModifiersAndAnnotationsInPackageDirective(file: KtFile): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'file' @ [75:60] ==> val file: (KtFile..KtFile?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'annotationChecker' @ [76:13] ==> private final val annotationChecker: AnnotationChecker defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'check' @ [76:31] ==> public final fun check(annotated: KtAnnotated, trace: BindingTrace, descriptor: DeclarationDescriptor? = ...): Unit defined in org.jetbrains.kotlin.resolve.AnnotationChecker[SimpleFunctionDescriptorImpl]

'file' @ [76:37] ==> val file: (KtFile..KtFile?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'trace' @ [76:43] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'component1' @ [79:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(KtClassOrObject..KtClassOrObject?), (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>.component1(): (KtClassOrObject..KtClassOrObject?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtClassOrObject..org.jetbrains.kotlin.psi.KtClassOrObject?)
    <V> -> (org.jetbrains.kotlin.descriptors.ClassDescriptorWithResolutionScopes..org.jetbrains.kotlin.descriptors.ClassDescriptorWithResolutionScopes?)

'component2' @ [79:30] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(KtClassOrObject..KtClassOrObject?), (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>.component2(): (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtClassOrObject..org.jetbrains.kotlin.psi.KtClassOrObject?)
    <V> -> (org.jetbrains.kotlin.descriptors.ClassDescriptorWithResolutionScopes..org.jetbrains.kotlin.descriptors.ClassDescriptorWithResolutionScopes?)

'bodiesResolveContext' @ [79:50] ==> value-parameter bodiesResolveContext: BodiesResolveContext defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[ValueParameterDescriptorImpl]

'declaredClasses' @ [79:71] ==> public final val BodiesResolveContext.declaredClasses: (MutableMap<(KtClassOrObject..KtClassOrObject?), (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>..MutableMap<(KtClassOrObject..KtClassOrObject?), (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>?)[MyPropertyDescriptor]

'entries' @ [79:87] ==> public abstract val entries: MutableSet<MutableMap.MutableEntry<(KtClassOrObject..KtClassOrObject?), (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'checkSupertypesForConsistency' @ [80:13] ==> private final fun checkSupertypesForConsistency(classifier: ClassifierDescriptor, sourceElement: PsiElement): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [80:43] ==> val classDescriptor: (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'classOrObject' @ [80:60] ==> val classOrObject: (KtClassOrObject..KtClassOrObject?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'checkTypesInClassHeader' @ [81:13] ==> private final fun checkTypesInClassHeader(classOrObject: KtClassOrObject): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'classOrObject' @ [81:37] ==> val classOrObject: (KtClassOrObject..KtClassOrObject?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'when (classOrObject) {
                is KtClass -> {
                    checkClassButNotObject(classOrObject, classDescriptor)
                    descriptorResolver.checkNamesInConstraints(
                            classOrObject, classDescriptor, classDescriptor.scopeForClassHeaderResolution, trace)
                }
                is KtObjectDeclaration -> {
                    checkObject(classOrObject, classDescriptor)
                }
            }' @ [83:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'classOrObject' @ [83:19] ==> val classOrObject: (KtClassOrObject..KtClassOrObject?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'checkClassButNotObject' @ [85:21] ==> private final fun checkClassButNotObject(aClass: KtClass, classDescriptor: ClassDescriptorWithResolutionScopes): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'classOrObject' @ [85:44] ==> val classOrObject: (KtClassOrObject..KtClassOrObject?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'classDescriptor' @ [85:59] ==> val classDescriptor: (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'descriptorResolver' @ [86:21] ==> private final val descriptorResolver: DescriptorResolver defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkNamesInConstraints' @ [86:40] ==> public open fun checkNamesInConstraints(@NotNull declaration: KtTypeParameterListOwner, @NotNull descriptor: DeclarationDescriptor, @NotNull scope: LexicalScope, @NotNull trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.DescriptorResolver[JavaMethodDescriptor]

'classOrObject' @ [87:29] ==> val classOrObject: (KtClassOrObject..KtClassOrObject?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'classDescriptor' @ [87:44] ==> val classDescriptor: (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'classDescriptor' @ [87:61] ==> val classDescriptor: (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'scopeForClassHeaderResolution' @ [87:77] ==> public final val ClassDescriptorWithResolutionScopes.scopeForClassHeaderResolution: LexicalScope[MyPropertyDescriptor]

'trace' @ [87:108] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkObject' @ [90:21] ==> private final fun checkObject(declaration: KtObjectDeclaration, classDescriptor: ClassDescriptorWithResolutionScopes): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'classOrObject' @ [90:33] ==> val classOrObject: (KtClassOrObject..KtClassOrObject?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'classDescriptor' @ [90:48] ==> val classDescriptor: (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'checkPrimaryConstructor' @ [94:13] ==> private final fun checkPrimaryConstructor(classOrObject: KtClassOrObject, classDescriptor: ClassDescriptor): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'classOrObject' @ [94:37] ==> val classOrObject: (KtClassOrObject..KtClassOrObject?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'classDescriptor' @ [94:52] ==> val classDescriptor: (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'modifiersChecker' @ [96:13] ==> private final val modifiersChecker: ModifiersChecker.ModifiersCheckingProcedure defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkModifiersForDeclaration' @ [96:30] ==> public open fun checkModifiersForDeclaration(@NotNull modifierListOwner: KtDeclaration, @NotNull descriptor: MemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.ModifiersChecker.ModifiersCheckingProcedure[JavaMethodDescriptor]

'classOrObject' @ [96:59] ==> val classOrObject: (KtClassOrObject..KtClassOrObject?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'classDescriptor' @ [96:74] ==> val classDescriptor: (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'identifierChecker' @ [97:13] ==> private final val identifierChecker: IdentifierChecker defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkDeclaration' @ [97:31] ==> public abstract fun checkDeclaration(declaration: KtDeclaration, diagnosticHolder: DiagnosticSink): Unit defined in org.jetbrains.kotlin.resolve.IdentifierChecker[SimpleFunctionDescriptorImpl]

'classOrObject' @ [97:48] ==> val classOrObject: (KtClassOrObject..KtClassOrObject?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'trace' @ [97:63] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'exposedChecker' @ [98:13] ==> private final val exposedChecker: ExposedVisibilityChecker defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkClassHeader' @ [98:28] ==> public final fun checkClassHeader(klass: KtClassOrObject, classDescriptor: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker[SimpleFunctionDescriptorImpl]

'classOrObject' @ [98:45] ==> val classOrObject: (KtClassOrObject..KtClassOrObject?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'classDescriptor' @ [98:60] ==> val classDescriptor: (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'component1' @ [101:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(KtNamedFunction..KtNamedFunction?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>.component1(): (KtNamedFunction..KtNamedFunction?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtNamedFunction..org.jetbrains.kotlin.psi.KtNamedFunction?)
    <V> -> (org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor..org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor?)

'component2' @ [101:25] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(KtNamedFunction..KtNamedFunction?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>.component2(): (SimpleFunctionDescriptor..SimpleFunctionDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtNamedFunction..org.jetbrains.kotlin.psi.KtNamedFunction?)
    <V> -> (org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor..org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor?)

'bodiesResolveContext' @ [101:48] ==> value-parameter bodiesResolveContext: BodiesResolveContext defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[ValueParameterDescriptorImpl]

'functions' @ [101:69] ==> public final val BodiesResolveContext.functions: (MutableMap<(KtNamedFunction..KtNamedFunction?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..MutableMap<(KtNamedFunction..KtNamedFunction?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?)[MyPropertyDescriptor]

'entries' @ [101:79] ==> public abstract val entries: MutableSet<MutableMap.MutableEntry<(KtNamedFunction..KtNamedFunction?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'checkFunction' @ [102:13] ==> public final fun checkFunction(function: KtNamedFunction, functionDescriptor: SimpleFunctionDescriptor): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'function' @ [102:27] ==> val function: (KtNamedFunction..KtNamedFunction?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'functionDescriptor' @ [102:37] ==> val functionDescriptor: (SimpleFunctionDescriptor..SimpleFunctionDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'modifiersChecker' @ [103:13] ==> private final val modifiersChecker: ModifiersChecker.ModifiersCheckingProcedure defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkModifiersForDeclaration' @ [103:30] ==> public open fun checkModifiersForDeclaration(@NotNull modifierListOwner: KtDeclaration, @NotNull descriptor: MemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.ModifiersChecker.ModifiersCheckingProcedure[JavaMethodDescriptor]

'function' @ [103:59] ==> val function: (KtNamedFunction..KtNamedFunction?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'functionDescriptor' @ [103:69] ==> val functionDescriptor: (SimpleFunctionDescriptor..SimpleFunctionDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'identifierChecker' @ [104:13] ==> private final val identifierChecker: IdentifierChecker defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkDeclaration' @ [104:31] ==> public abstract fun checkDeclaration(declaration: KtDeclaration, diagnosticHolder: DiagnosticSink): Unit defined in org.jetbrains.kotlin.resolve.IdentifierChecker[SimpleFunctionDescriptorImpl]

'function' @ [104:48] ==> val function: (KtNamedFunction..KtNamedFunction?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'trace' @ [104:58] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'component1' @ [107:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(KtProperty..KtProperty?), (PropertyDescriptor..PropertyDescriptor?)>.component1(): (KtProperty..KtProperty?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtProperty..org.jetbrains.kotlin.psi.KtProperty?)
    <V> -> (org.jetbrains.kotlin.descriptors.PropertyDescriptor..org.jetbrains.kotlin.descriptors.PropertyDescriptor?)

'component2' @ [107:25] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(KtProperty..KtProperty?), (PropertyDescriptor..PropertyDescriptor?)>.component2(): (PropertyDescriptor..PropertyDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtProperty..org.jetbrains.kotlin.psi.KtProperty?)
    <V> -> (org.jetbrains.kotlin.descriptors.PropertyDescriptor..org.jetbrains.kotlin.descriptors.PropertyDescriptor?)

'bodiesResolveContext' @ [107:48] ==> value-parameter bodiesResolveContext: BodiesResolveContext defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[ValueParameterDescriptorImpl]

'properties' @ [107:69] ==> public final val BodiesResolveContext.properties: (MutableMap<(KtProperty..KtProperty?), (PropertyDescriptor..PropertyDescriptor?)>..MutableMap<(KtProperty..KtProperty?), (PropertyDescriptor..PropertyDescriptor?)>?)[MyPropertyDescriptor]

'entries' @ [107:80] ==> public abstract val entries: MutableSet<MutableMap.MutableEntry<(KtProperty..KtProperty?), (PropertyDescriptor..PropertyDescriptor?)>> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'checkProperty' @ [108:13] ==> private final fun checkProperty(property: KtProperty, propertyDescriptor: PropertyDescriptor): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'property' @ [108:27] ==> val property: (KtProperty..KtProperty?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'propertyDescriptor' @ [108:37] ==> val propertyDescriptor: (PropertyDescriptor..PropertyDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'modifiersChecker' @ [109:13] ==> private final val modifiersChecker: ModifiersChecker.ModifiersCheckingProcedure defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkModifiersForDeclaration' @ [109:30] ==> public open fun checkModifiersForDeclaration(@NotNull modifierListOwner: KtDeclaration, @NotNull descriptor: MemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.ModifiersChecker.ModifiersCheckingProcedure[JavaMethodDescriptor]

'property' @ [109:59] ==> val property: (KtProperty..KtProperty?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'propertyDescriptor' @ [109:69] ==> val propertyDescriptor: (PropertyDescriptor..PropertyDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'identifierChecker' @ [110:13] ==> private final val identifierChecker: IdentifierChecker defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkDeclaration' @ [110:31] ==> public abstract fun checkDeclaration(declaration: KtDeclaration, diagnosticHolder: DiagnosticSink): Unit defined in org.jetbrains.kotlin.resolve.IdentifierChecker[SimpleFunctionDescriptorImpl]

'property' @ [110:48] ==> val property: (KtProperty..KtProperty?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'trace' @ [110:58] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'bodiesResolveContext' @ [113:41] ==> value-parameter bodiesResolveContext: BodiesResolveContext defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[ValueParameterDescriptorImpl]

'destructuringDeclarationEntries' @ [113:62] ==> public final val BodiesResolveContext.destructuringDeclarationEntries: (MutableMap<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (PropertyDescriptor..PropertyDescriptor?)>..MutableMap<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (PropertyDescriptor..PropertyDescriptor?)>?)[MyPropertyDescriptor]

'entries' @ [113:94] ==> public abstract val entries: MutableSet<MutableMap.MutableEntry<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (PropertyDescriptor..PropertyDescriptor?)>> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'map' @ [114:18] ==> public inline fun <T, R> Iterable<MutableMap.MutableEntry<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (PropertyDescriptor..PropertyDescriptor?)>>.map(transform: (MutableMap.MutableEntry<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (PropertyDescriptor..PropertyDescriptor?)>) -> (PsiElement..PsiElement?)): List<(PsiElement..PsiElement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableEntry<(org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry..org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry?), (org.jetbrains.kotlin.descriptors.PropertyDescriptor..org.jetbrains.kotlin.descriptors.PropertyDescriptor?)>
    <R> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'component1' @ [114:25] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (PropertyDescriptor..PropertyDescriptor?)>.component1(): (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry..org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry?)
    <V> -> (org.jetbrains.kotlin.descriptors.PropertyDescriptor..org.jetbrains.kotlin.descriptors.PropertyDescriptor?)

'component2' @ [114:32] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (PropertyDescriptor..PropertyDescriptor?)>.component2(): (PropertyDescriptor..PropertyDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry..org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry?)
    <V> -> (org.jetbrains.kotlin.descriptors.PropertyDescriptor..org.jetbrains.kotlin.descriptors.PropertyDescriptor?)

'entry' @ [114:38] ==> val entry: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process.<anonymous>[LocalVariableDescriptor]

'parent' @ [114:44] ==> public final val KtDestructuringDeclarationEntry.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'filterIsInstance' @ [115:18] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtDestructuringDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtDestructuringDeclaration

'distinct' @ [116:18] ==> public fun <T> Iterable<KtDestructuringDeclaration>.distinct(): List<KtDestructuringDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDestructuringDeclaration

'destructuringDeclarations' @ [118:34] ==> val destructuringDeclarations: List<KtDestructuringDeclaration> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'modifiersChecker' @ [119:13] ==> private final val modifiersChecker: ModifiersChecker.ModifiersCheckingProcedure defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkModifiersForDestructuringDeclaration' @ [119:30] ==> public open fun checkModifiersForDestructuringDeclaration(@NotNull multiDeclaration: KtDestructuringDeclaration): Unit defined in org.jetbrains.kotlin.resolve.ModifiersChecker.ModifiersCheckingProcedure[JavaMethodDescriptor]

'multiDeclaration' @ [119:72] ==> val multiDeclaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'identifierChecker' @ [120:13] ==> private final val identifierChecker: IdentifierChecker defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkDeclaration' @ [120:31] ==> public abstract fun checkDeclaration(declaration: KtDeclaration, diagnosticHolder: DiagnosticSink): Unit defined in org.jetbrains.kotlin.resolve.IdentifierChecker[SimpleFunctionDescriptorImpl]

'multiDeclaration' @ [120:48] ==> val multiDeclaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'trace' @ [120:66] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'component1' @ [123:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(KtSecondaryConstructor..KtSecondaryConstructor?), (ClassConstructorDescriptor..ClassConstructorDescriptor?)>.component1(): (KtSecondaryConstructor..KtSecondaryConstructor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtSecondaryConstructor..org.jetbrains.kotlin.psi.KtSecondaryConstructor?)
    <V> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'component2' @ [123:28] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(KtSecondaryConstructor..KtSecondaryConstructor?), (ClassConstructorDescriptor..ClassConstructorDescriptor?)>.component2(): (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtSecondaryConstructor..org.jetbrains.kotlin.psi.KtSecondaryConstructor?)
    <V> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'bodiesResolveContext' @ [123:54] ==> value-parameter bodiesResolveContext: BodiesResolveContext defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[ValueParameterDescriptorImpl]

'secondaryConstructors' @ [123:75] ==> public final val BodiesResolveContext.secondaryConstructors: (MutableMap<(KtSecondaryConstructor..KtSecondaryConstructor?), (ClassConstructorDescriptor..ClassConstructorDescriptor?)>..MutableMap<(KtSecondaryConstructor..KtSecondaryConstructor?), (ClassConstructorDescriptor..ClassConstructorDescriptor?)>?)[MyPropertyDescriptor]

'entries' @ [123:97] ==> public abstract val entries: MutableSet<MutableMap.MutableEntry<(KtSecondaryConstructor..KtSecondaryConstructor?), (ClassConstructorDescriptor..ClassConstructorDescriptor?)>> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'checkConstructorDeclaration' @ [124:13] ==> private final fun checkConstructorDeclaration(constructorDescriptor: ClassConstructorDescriptor, declaration: KtConstructor<*>): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'constructorDescriptor' @ [124:41] ==> val constructorDescriptor: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'declaration' @ [124:64] ==> val declaration: (KtSecondaryConstructor..KtSecondaryConstructor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'exposedChecker' @ [125:13] ==> private final val exposedChecker: ExposedVisibilityChecker defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkFunction' @ [125:28] ==> public final fun checkFunction(function: KtFunction, functionDescriptor: FunctionDescriptor, visibility: Visibility = ...): Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker[SimpleFunctionDescriptorImpl]

'declaration' @ [125:42] ==> val declaration: (KtSecondaryConstructor..KtSecondaryConstructor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'constructorDescriptor' @ [125:55] ==> val constructorDescriptor: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'component1' @ [128:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(KtTypeAlias..KtTypeAlias?), (TypeAliasDescriptor..TypeAliasDescriptor?)>.component1(): (KtTypeAlias..KtTypeAlias?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtTypeAlias..org.jetbrains.kotlin.psi.KtTypeAlias?)
    <V> -> (org.jetbrains.kotlin.descriptors.TypeAliasDescriptor..org.jetbrains.kotlin.descriptors.TypeAliasDescriptor?)

'component2' @ [128:28] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(KtTypeAlias..KtTypeAlias?), (TypeAliasDescriptor..TypeAliasDescriptor?)>.component2(): (TypeAliasDescriptor..TypeAliasDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtTypeAlias..org.jetbrains.kotlin.psi.KtTypeAlias?)
    <V> -> (org.jetbrains.kotlin.descriptors.TypeAliasDescriptor..org.jetbrains.kotlin.descriptors.TypeAliasDescriptor?)

'bodiesResolveContext' @ [128:52] ==> value-parameter bodiesResolveContext: BodiesResolveContext defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[ValueParameterDescriptorImpl]

'typeAliases' @ [128:73] ==> public final val BodiesResolveContext.typeAliases: (MutableMap<(KtTypeAlias..KtTypeAlias?), (TypeAliasDescriptor..TypeAliasDescriptor?)>..MutableMap<(KtTypeAlias..KtTypeAlias?), (TypeAliasDescriptor..TypeAliasDescriptor?)>?)[MyPropertyDescriptor]

'entries' @ [128:85] ==> public abstract val entries: MutableSet<MutableMap.MutableEntry<(KtTypeAlias..KtTypeAlias?), (TypeAliasDescriptor..TypeAliasDescriptor?)>> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'checkTypeAliasDeclaration' @ [129:13] ==> private final fun checkTypeAliasDeclaration(declaration: KtTypeAlias, typeAliasDescriptor: TypeAliasDescriptor): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'declaration' @ [129:39] ==> val declaration: (KtTypeAlias..KtTypeAlias?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'typeAliasDescriptor' @ [129:52] ==> val typeAliasDescriptor: (TypeAliasDescriptor..TypeAliasDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'modifiersChecker' @ [130:13] ==> private final val modifiersChecker: ModifiersChecker.ModifiersCheckingProcedure defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkModifiersForDeclaration' @ [130:30] ==> public open fun checkModifiersForDeclaration(@NotNull modifierListOwner: KtDeclaration, @NotNull descriptor: MemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.ModifiersChecker.ModifiersCheckingProcedure[JavaMethodDescriptor]

'declaration' @ [130:59] ==> val declaration: (KtTypeAlias..KtTypeAlias?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'typeAliasDescriptor' @ [130:72] ==> val typeAliasDescriptor: (TypeAliasDescriptor..TypeAliasDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'exposedChecker' @ [131:13] ==> private final val exposedChecker: ExposedVisibilityChecker defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkTypeAlias' @ [131:28] ==> public final fun checkTypeAlias(typeAlias: KtTypeAlias, typeAliasDescriptor: TypeAliasDescriptor): Unit defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker[SimpleFunctionDescriptorImpl]

'declaration' @ [131:43] ==> val declaration: (KtTypeAlias..KtTypeAlias?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'typeAliasDescriptor' @ [131:56] ==> val typeAliasDescriptor: (TypeAliasDescriptor..TypeAliasDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.process[LocalVariableDescriptor]

'checkTypeAliasDeclaration' @ [136:9] ==> private final fun checkTypeAliasDeclaration(declaration: KtTypeAlias, typeAliasDescriptor: TypeAliasDescriptor): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'declaration' @ [136:35] ==> value-parameter declaration: KtTypeAlias defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkLocalTypeAliasDeclaration[ValueParameterDescriptorImpl]

'typeAliasDescriptor' @ [136:48] ==> value-parameter typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkLocalTypeAliasDeclaration[ValueParameterDescriptorImpl]

'modifiersChecker' @ [137:9] ==> private final val modifiersChecker: ModifiersChecker.ModifiersCheckingProcedure defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkModifiersForDeclaration' @ [137:26] ==> public open fun checkModifiersForDeclaration(@NotNull modifierListOwner: KtDeclaration, @NotNull descriptor: MemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.ModifiersChecker.ModifiersCheckingProcedure[JavaMethodDescriptor]

'declaration' @ [137:55] ==> value-parameter declaration: KtTypeAlias defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkLocalTypeAliasDeclaration[ValueParameterDescriptorImpl]

'typeAliasDescriptor' @ [137:68] ==> value-parameter typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkLocalTypeAliasDeclaration[ValueParameterDescriptorImpl]

'exposedChecker' @ [138:9] ==> private final val exposedChecker: ExposedVisibilityChecker defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkTypeAlias' @ [138:24] ==> public final fun checkTypeAlias(typeAlias: KtTypeAlias, typeAliasDescriptor: TypeAliasDescriptor): Unit defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker[SimpleFunctionDescriptorImpl]

'declaration' @ [138:39] ==> value-parameter declaration: KtTypeAlias defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkLocalTypeAliasDeclaration[ValueParameterDescriptorImpl]

'typeAliasDescriptor' @ [138:52] ==> value-parameter typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkLocalTypeAliasDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [142:29] ==> value-parameter declaration: KtTypeAlias defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[ValueParameterDescriptorImpl]

'getTypeReference' @ [142:41] ==> @IfNotParsed public final fun getTypeReference(): KtTypeReference? defined in org.jetbrains.kotlin.psi.KtTypeAlias[SimpleFunctionDescriptorImpl]

'checkTypeAliasExpansion' @ [144:9] ==> private final fun checkTypeAliasExpansion(declaration: KtTypeAlias, typeAliasDescriptor: TypeAliasDescriptor): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'declaration' @ [144:33] ==> value-parameter declaration: KtTypeAlias defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[ValueParameterDescriptorImpl]

'typeAliasDescriptor' @ [144:46] ==> value-parameter typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[ValueParameterDescriptorImpl]

'typeAliasDescriptor' @ [146:28] ==> value-parameter typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[ValueParameterDescriptorImpl]

'expandedType' @ [146:48] ==> public abstract val expandedType: SimpleType defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'expandedType' @ [147:13] ==> val expandedType: SimpleType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[LocalVariableDescriptor]

'isError' @ [147:26] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'expandedType' @ [149:34] ==> val expandedType: SimpleType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[LocalVariableDescriptor]

'constructor' @ [149:47] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [149:59] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'expandedType' @ [151:13] ==> val expandedType: SimpleType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[LocalVariableDescriptor]

'isDynamic' @ [151:26] ==> public fun KotlinType.isDynamic(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'expandedClassifier' @ [151:41] ==> val expandedClassifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[LocalVariableDescriptor]

'trace' @ [152:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [152:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'TYPEALIAS_SHOULD_EXPAND_TO_CLASS' @ [152:26] ==> public final val TYPEALIAS_SHOULD_EXPAND_TO_CLASS: (DiagnosticFactory1<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [152:59] ==> @NotNull public open fun on(@NotNull element: KtTypeReference, @NotNull argument: KotlinType): ParametrizedDiagnostic<(KtTypeReference..KtTypeReference?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'typeReference' @ [152:62] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[LocalVariableDescriptor]

'expandedType' @ [152:77] ==> val expandedType: SimpleType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[LocalVariableDescriptor]

'contains' @ [155:23] ==> public open fun contains(@Nullable p0: KotlinType?, @NotNull p1: ((UnwrappedType..UnwrappedType?)) -> (Boolean..Boolean?)): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'expandedType' @ [155:32] ==> val expandedType: SimpleType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[LocalVariableDescriptor]

'it' @ [155:48] ==> value-parameter it: (UnwrappedType..UnwrappedType?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'isArrayOfNothing' @ [155:51] ==> public fun KotlinType?.isArrayOfNothing(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'trace' @ [156:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [156:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'TYPEALIAS_EXPANDED_TO_MALFORMED_TYPE' @ [156:26] ==> public final val TYPEALIAS_EXPANDED_TO_MALFORMED_TYPE: (DiagnosticFactory2<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?), (String..String?)>..DiagnosticFactory2<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [156:63] ==> @NotNull public open fun on(@NotNull element: KtTypeReference, @NotNull a: KotlinType, @NotNull b: String): ParametrizedDiagnostic<(KtTypeReference..KtTypeReference?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'typeReference' @ [156:66] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[LocalVariableDescriptor]

'expandedType' @ [156:81] ==> val expandedType: SimpleType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[LocalVariableDescriptor]

'getUsedTypeAliasParameters' @ [159:69] ==> private final fun getUsedTypeAliasParameters(type: KotlinType, typeAlias: TypeAliasDescriptor): Set<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'expandedType' @ [159:96] ==> val expandedType: SimpleType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[LocalVariableDescriptor]

'typeAliasDescriptor' @ [159:110] ==> value-parameter typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[ValueParameterDescriptorImpl]

'typeAliasDescriptor' @ [160:31] ==> value-parameter typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[ValueParameterDescriptorImpl]

'declaredTypeParameters' @ [160:51] ==> public final val TypeAliasDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'typeParameter' @ [161:17] ==> val typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[LocalVariableDescriptor]

'usedTypeAliasParameters' @ [161:35] ==> val usedTypeAliasParameters: Set<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[LocalVariableDescriptor]

'DescriptorToSourceUtils' @ [162:30] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [162:54] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'typeParameter' @ [162:78] ==> val typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[LocalVariableDescriptor]

'AssertionError' @ [163:39] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'typeParameter' @ [163:93] ==> val typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[LocalVariableDescriptor]

'typeAliasDescriptor' @ [163:111] ==> value-parameter typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[ValueParameterDescriptorImpl]

'trace' @ [164:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [164:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNUSED_TYPEALIAS_PARAMETER' @ [164:30] ==> public final val UNUSED_TYPEALIAS_PARAMETER: (DiagnosticFactory2<(KtTypeParameter..KtTypeParameter?), (TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>..DiagnosticFactory2<(KtTypeParameter..KtTypeParameter?), (TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [164:57] ==> @NotNull public open fun on(@NotNull element: KtTypeParameter, @NotNull a: TypeParameterDescriptor, @NotNull b: KotlinType): ParametrizedDiagnostic<(KtTypeParameter..KtTypeParameter?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'source' @ [164:60] ==> val source: KtTypeParameter defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[LocalVariableDescriptor]

'typeParameter' @ [164:68] ==> val typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[LocalVariableDescriptor]

'expandedType' @ [164:83] ==> val expandedType: SimpleType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[LocalVariableDescriptor]

'declaration' @ [168:13] ==> value-parameter declaration: KtTypeAlias defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[ValueParameterDescriptorImpl]

'hasModifier' @ [168:25] ==> @Override public open fun hasModifier(@NotNull modifier: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtTypeAlias[JavaMethodDescriptor]

'IMPL_KEYWORD' @ [168:46] ==> public final val IMPL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'checkImplTypeAlias' @ [169:13] ==> private final fun checkImplTypeAlias(declaration: KtTypeAlias, typeAliasDescriptor: TypeAliasDescriptor): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'declaration' @ [169:32] ==> value-parameter declaration: KtTypeAlias defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[ValueParameterDescriptorImpl]

'typeAliasDescriptor' @ [169:45] ==> value-parameter typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasDeclaration[ValueParameterDescriptorImpl]

'typeAliasDescriptor' @ [174:19] ==> value-parameter typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplTypeAlias[ValueParameterDescriptorImpl]

'underlyingType' @ [174:39] ==> public abstract val underlyingType: SimpleType defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'rhs' @ [175:31] ==> val rhs: SimpleType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplTypeAlias[LocalVariableDescriptor]

'constructor' @ [175:35] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [175:47] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'classDescriptor' @ [176:13] ==> val classDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplTypeAlias[LocalVariableDescriptor]

'trace' @ [177:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [177:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'IMPL_TYPE_ALIAS_NOT_TO_CLASS' @ [177:26] ==> public final val IMPL_TYPE_ALIAS_NOT_TO_CLASS: (DiagnosticFactory0<(KtTypeAlias..KtTypeAlias?)>..DiagnosticFactory0<(KtTypeAlias..KtTypeAlias?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [177:55] ==> @NotNull public open fun on(@NotNull element: KtTypeAlias): SimpleDiagnostic<(KtTypeAlias..KtTypeAlias?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'declaration' @ [177:58] ==> value-parameter declaration: KtTypeAlias defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplTypeAlias[ValueParameterDescriptorImpl]

'classDescriptor' @ [181:13] ==> val classDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplTypeAlias[LocalVariableDescriptor]

'declaredTypeParameters' @ [181:29] ==> public final val ClassDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'any' @ [181:52] ==> public inline fun <T> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.any(predicate: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'it' @ [181:58] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplTypeAlias.<anonymous>[ValueParameterDescriptorImpl]

'variance' @ [181:61] ==> public final val TypeParameterDescriptor.variance: Variance[MyPropertyDescriptor]

'INVARIANT' @ [181:82] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'trace' @ [182:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [182:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'IMPL_TYPE_ALIAS_TO_CLASS_WITH_DECLARATION_SITE_VARIANCE' @ [182:26] ==> public final val IMPL_TYPE_ALIAS_TO_CLASS_WITH_DECLARATION_SITE_VARIANCE: (DiagnosticFactory0<(KtTypeAlias..KtTypeAlias?)>..DiagnosticFactory0<(KtTypeAlias..KtTypeAlias?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [182:82] ==> @NotNull public open fun on(@NotNull element: KtTypeAlias): SimpleDiagnostic<(KtTypeAlias..KtTypeAlias?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'declaration' @ [182:85] ==> value-parameter declaration: KtTypeAlias defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplTypeAlias[ValueParameterDescriptorImpl]

'rhs' @ [186:13] ==> val rhs: SimpleType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplTypeAlias[LocalVariableDescriptor]

'arguments' @ [186:17] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'any' @ [186:27] ==> public inline fun <T> Iterable<TypeProjection>.any(predicate: (TypeProjection) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'it' @ [186:33] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplTypeAlias.<anonymous>[ValueParameterDescriptorImpl]

'projectionKind' @ [186:36] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'INVARIANT' @ [186:63] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'it' @ [186:76] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplTypeAlias.<anonymous>[ValueParameterDescriptorImpl]

'isStarProjection' @ [186:79] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'trace' @ [187:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [187:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'IMPL_TYPE_ALIAS_WITH_USE_SITE_VARIANCE' @ [187:26] ==> public final val IMPL_TYPE_ALIAS_WITH_USE_SITE_VARIANCE: (DiagnosticFactory0<(KtTypeAlias..KtTypeAlias?)>..DiagnosticFactory0<(KtTypeAlias..KtTypeAlias?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [187:65] ==> @NotNull public open fun on(@NotNull element: KtTypeAlias): SimpleDiagnostic<(KtTypeAlias..KtTypeAlias?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'declaration' @ [187:68] ==> value-parameter declaration: KtTypeAlias defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplTypeAlias[ValueParameterDescriptorImpl]

'rhs' @ [191:13] ==> val rhs: SimpleType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplTypeAlias[LocalVariableDescriptor]

'arguments' @ [191:17] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'map' @ [191:27] ==> public inline fun <T, R> Iterable<TypeProjection>.map(transform: (TypeProjection) -> TypeParameterDescriptor?): List<TypeParameterDescriptor?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R> -> TypeParameterDescriptor?

'it' @ [191:33] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplTypeAlias.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [191:36] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [191:41] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [191:53] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'typeAliasDescriptor' @ [192:17] ==> value-parameter typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplTypeAlias[ValueParameterDescriptorImpl]

'declaredTypeParameters' @ [192:37] ==> public final val TypeAliasDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'trace' @ [193:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [193:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'IMPL_TYPE_ALIAS_WITH_COMPLEX_SUBSTITUTION' @ [193:26] ==> public final val IMPL_TYPE_ALIAS_WITH_COMPLEX_SUBSTITUTION: (DiagnosticFactory0<(KtTypeAlias..KtTypeAlias?)>..DiagnosticFactory0<(KtTypeAlias..KtTypeAlias?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [193:68] ==> @NotNull public open fun on(@NotNull element: KtTypeAlias): SimpleDiagnostic<(KtTypeAlias..KtTypeAlias?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'declaration' @ [193:71] ==> value-parameter declaration: KtTypeAlias defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplTypeAlias[ValueParameterDescriptorImpl]

'type' @ [199:13] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.getUsedTypeAliasParameters[ValueParameterDescriptorImpl]

'constituentTypes' @ [199:18] ==> public fun KotlinType.constituentTypes(): Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'mapNotNullTo' @ [199:37] ==> public inline fun <T, R : Any, C : MutableCollection<in TypeParameterDescriptor>> Iterable<KotlinType>.mapNotNullTo(destination: HashSet<TypeParameterDescriptor>, transform: (KotlinType) -> TypeParameterDescriptor?): HashSet<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R : Any> -> TypeParameterDescriptor
    <C : MutableCollection<in R>> -> HashSet<TypeParameterDescriptor>

'HashSet' @ [199:50] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TypeParameterDescriptor

'it' @ [200:34] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.getUsedTypeAliasParameters.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [200:37] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [200:49] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'descriptor' @ [201:17] ==> val descriptor: TypeParameterDescriptor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.getUsedTypeAliasParameters.<anonymous>[LocalVariableDescriptor]

'takeIf' @ [201:29] ==> @InlineOnly @SinceKotlin public inline fun <T> TypeParameterDescriptor.takeIf(predicate: (TypeParameterDescriptor) -> Boolean): TypeParameterDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'it' @ [201:38] ==> value-parameter it: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.getUsedTypeAliasParameters.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [201:41] ==> public final val TypeParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'typeAlias' @ [201:66] ==> value-parameter typeAlias: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.getUsedTypeAliasParameters[ValueParameterDescriptorImpl]

'declaration' @ [209:37] ==> value-parameter declaration: KtTypeAlias defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.TypeAliasDeclarationCheckingReportStrategy.<init>[ValueParameterDescriptorImpl]

'getTypeReference' @ [209:49] ==> @IfNotParsed public final fun getTypeReference(): KtTypeReference? defined in org.jetbrains.kotlin.psi.KtTypeAlias[SimpleFunctionDescriptorImpl]

'AssertionError' @ [210:46] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'typeAliasDescriptor' @ [210:100] ==> value-parameter typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.TypeAliasDeclarationCheckingReportStrategy.<init>[ValueParameterDescriptorImpl]

'trace' @ [217:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.TypeAliasDeclarationCheckingReportStrategy[PropertyDescriptorImpl]

'report' @ [217:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'CONFLICTING_PROJECTION_IN_TYPEALIAS_EXPANSION' @ [217:26] ==> public final val CONFLICTING_PROJECTION_IN_TYPEALIAS_EXPANSION: (DiagnosticFactory1<(KtElement..KtElement?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(KtElement..KtElement?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [217:72] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull argument: KotlinType): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'typeReference' @ [217:75] ==> private final val typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.TypeAliasDeclarationCheckingReportStrategy[PropertyDescriptorImpl]

'substitutedArgument' @ [217:90] ==> value-parameter substitutedArgument: KotlinType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.TypeAliasDeclarationCheckingReportStrategy.conflictingProjection[ValueParameterDescriptorImpl]

'trace' @ [221:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.TypeAliasDeclarationCheckingReportStrategy[PropertyDescriptorImpl]

'report' @ [221:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'RECURSIVE_TYPEALIAS_EXPANSION' @ [221:26] ==> public final val RECURSIVE_TYPEALIAS_EXPANSION: (DiagnosticFactory1<(KtElement..KtElement?), (ClassifierDescriptor..ClassifierDescriptor?)>..DiagnosticFactory1<(KtElement..KtElement?), (ClassifierDescriptor..ClassifierDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [221:56] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull argument: ClassifierDescriptor): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'typeReference' @ [221:59] ==> private final val typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.TypeAliasDeclarationCheckingReportStrategy[PropertyDescriptorImpl]

'typeAlias' @ [221:74] ==> value-parameter typeAlias: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.TypeAliasDeclarationCheckingReportStrategy.recursiveTypeAlias[ValueParameterDescriptorImpl]

'!' @ [226:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'argument' @ [226:18] ==> value-parameter argument: KotlinType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.TypeAliasDeclarationCheckingReportStrategy.boundsViolationInSubstitution[ValueParameterDescriptorImpl]

'containsTypeAliasParameters' @ [226:27] ==> public fun KotlinType.containsTypeAliasParameters(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'!' @ [226:60] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'bound' @ [226:61] ==> value-parameter bound: KotlinType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.TypeAliasDeclarationCheckingReportStrategy.boundsViolationInSubstitution[ValueParameterDescriptorImpl]

'containsTypeAliasParameters' @ [226:67] ==> public fun KotlinType.containsTypeAliasParameters(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'trace' @ [227:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.TypeAliasDeclarationCheckingReportStrategy[PropertyDescriptorImpl]

'report' @ [227:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UPPER_BOUND_VIOLATED_IN_TYPEALIAS_EXPANSION' @ [227:30] ==> public final val UPPER_BOUND_VIOLATED_IN_TYPEALIAS_EXPANSION: (DiagnosticFactory3<(KtElement..KtElement?), (KotlinType..KotlinType?), (KotlinType..KotlinType?), (ClassifierDescriptor..ClassifierDescriptor?)>..DiagnosticFactory3<(KtElement..KtElement?), (KotlinType..KotlinType?), (KotlinType..KotlinType?), (ClassifierDescriptor..ClassifierDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [227:74] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull a: KotlinType, @NotNull b: KotlinType, @NotNull c: ClassifierDescriptor): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'typeReference' @ [227:77] ==> private final val typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.TypeAliasDeclarationCheckingReportStrategy[PropertyDescriptorImpl]

'bound' @ [227:92] ==> value-parameter bound: KotlinType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.TypeAliasDeclarationCheckingReportStrategy.boundsViolationInSubstitution[ValueParameterDescriptorImpl]

'argument' @ [227:99] ==> value-parameter argument: KotlinType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.TypeAliasDeclarationCheckingReportStrategy.boundsViolationInSubstitution[ValueParameterDescriptorImpl]

'typeParameter' @ [227:109] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.TypeAliasDeclarationCheckingReportStrategy.boundsViolationInSubstitution[ValueParameterDescriptorImpl]

'?:' @ [232:35] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtAnnotationEntry?, right: KtAnnotationEntry): KtAnnotationEntry[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtAnnotationEntry

'annotation' @ [232:36] ==> value-parameter annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.TypeAliasDeclarationCheckingReportStrategy.repeatedAnnotation[ValueParameterDescriptorImpl]

'source' @ [232:47] ==> public abstract val source: SourceElement defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'psi' @ [232:80] ==> public open val psi: KtElement defined in org.jetbrains.kotlin.resolve.source.KotlinSourceElement[PropertyDescriptorImpl]

'trace' @ [233:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.TypeAliasDeclarationCheckingReportStrategy[PropertyDescriptorImpl]

'report' @ [233:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'REPEATED_ANNOTATION' @ [233:26] ==> public final val REPEATED_ANNOTATION: (DiagnosticFactory0<(KtAnnotationEntry..KtAnnotationEntry?)>..DiagnosticFactory0<(KtAnnotationEntry..KtAnnotationEntry?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [233:46] ==> @NotNull public open fun on(@NotNull element: KtAnnotationEntry): SimpleDiagnostic<(KtAnnotationEntry..KtAnnotationEntry?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'annotationEntry' @ [233:49] ==> val annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.TypeAliasDeclarationCheckingReportStrategy.repeatedAnnotation[LocalVariableDescriptor]

'TypeAliasExpansion' @ [238:34] ==> public companion object defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion[FakeCallableDescriptorForObject]

'createWithFormalArguments' @ [238:53] ==> public final fun createWithFormalArguments(typeAliasDescriptor: TypeAliasDescriptor): TypeAliasExpansion defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion.Companion[SimpleFunctionDescriptorImpl]

'typeAliasDescriptor' @ [238:79] ==> value-parameter typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasExpansion[ValueParameterDescriptorImpl]

'TypeAliasDeclarationCheckingReportStrategy' @ [239:30] ==> public constructor TypeAliasDeclarationCheckingReportStrategy(trace: BindingTrace, typeAliasDescriptor: TypeAliasDescriptor, declaration: KtTypeAlias) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.TypeAliasDeclarationCheckingReportStrategy[ClassConstructorDescriptorImpl]

'trace' @ [239:73] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'typeAliasDescriptor' @ [239:80] ==> value-parameter typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasExpansion[ValueParameterDescriptorImpl]

'declaration' @ [239:101] ==> value-parameter declaration: KtTypeAlias defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasExpansion[ValueParameterDescriptorImpl]

'TypeAliasExpander' @ [240:9] ==> public constructor TypeAliasExpander(reportStrategy: TypeAliasExpansionReportStrategy, shouldCheckBounds: Boolean) defined in org.jetbrains.kotlin.resolve.TypeAliasExpander[ClassConstructorDescriptorImpl]

'reportStrategy' @ [240:27] ==> val reportStrategy: DeclarationsChecker.TypeAliasDeclarationCheckingReportStrategy defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasExpansion[LocalVariableDescriptor]

'expandWithoutAbbreviation' @ [240:49] ==> public final fun expandWithoutAbbreviation(typeAliasExpansion: TypeAliasExpansion, annotations: Annotations): SimpleType defined in org.jetbrains.kotlin.resolve.TypeAliasExpander[SimpleFunctionDescriptorImpl]

'typeAliasExpansion' @ [240:75] ==> val typeAliasExpansion: TypeAliasExpansion defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeAliasExpansion[LocalVariableDescriptor]

'Annotations' @ [240:95] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [240:107] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'modifiersChecker' @ [244:9] ==> private final val modifiersChecker: ModifiersChecker.ModifiersCheckingProcedure defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkModifiersForDeclaration' @ [244:26] ==> public open fun checkModifiersForDeclaration(@NotNull modifierListOwner: KtDeclaration, @NotNull descriptor: MemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.ModifiersChecker.ModifiersCheckingProcedure[JavaMethodDescriptor]

'declaration' @ [244:55] ==> value-parameter declaration: KtConstructor<*> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkConstructorDeclaration[ValueParameterDescriptorImpl]

'constructorDescriptor' @ [244:68] ==> value-parameter constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkConstructorDeclaration[ValueParameterDescriptorImpl]

'identifierChecker' @ [245:9] ==> private final val identifierChecker: IdentifierChecker defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkDeclaration' @ [245:27] ==> public abstract fun checkDeclaration(declaration: KtDeclaration, diagnosticHolder: DiagnosticSink): Unit defined in org.jetbrains.kotlin.resolve.IdentifierChecker[SimpleFunctionDescriptorImpl]

'declaration' @ [245:44] ==> value-parameter declaration: KtConstructor<*> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkConstructorDeclaration[ValueParameterDescriptorImpl]

'trace' @ [245:57] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkVarargParameters' @ [246:9] ==> private final fun checkVarargParameters(trace: BindingTrace, callableDescriptor: CallableDescriptor): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'trace' @ [246:31] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'constructorDescriptor' @ [246:38] ==> value-parameter constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkConstructorDeclaration[ValueParameterDescriptorImpl]

'checkConstructorVisibility' @ [247:9] ==> private final fun checkConstructorVisibility(constructorDescriptor: ClassConstructorDescriptor, declaration: KtDeclaration): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'constructorDescriptor' @ [247:36] ==> value-parameter constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkConstructorDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [247:59] ==> value-parameter declaration: KtConstructor<*> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkConstructorDeclaration[ValueParameterDescriptorImpl]

'checkHeaderClassConstructor' @ [248:9] ==> private final fun checkHeaderClassConstructor(constructorDescriptor: ClassConstructorDescriptor, declaration: KtConstructor<*>): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'constructorDescriptor' @ [248:37] ==> value-parameter constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkConstructorDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [248:60] ==> value-parameter declaration: KtConstructor<*> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkConstructorDeclaration[ValueParameterDescriptorImpl]

'!' @ [252:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'constructorDescriptor' @ [252:14] ==> value-parameter constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkHeaderClassConstructor[ValueParameterDescriptorImpl]

'isHeader' @ [252:36] ==> public final val ClassConstructorDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'declaration' @ [254:13] ==> value-parameter declaration: KtConstructor<*> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkHeaderClassConstructor[ValueParameterDescriptorImpl]

'hasBody' @ [254:25] ==> public open fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtConstructor[SimpleFunctionDescriptorImpl]

'trace' @ [255:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [255:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'HEADER_DECLARATION_WITH_BODY' @ [255:26] ==> public final val HEADER_DECLARATION_WITH_BODY: (DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>..DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [255:55] ==> @NotNull public open fun on(@NotNull element: KtDeclaration): SimpleDiagnostic<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'declaration' @ [255:58] ==> value-parameter declaration: KtConstructor<*> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkHeaderClassConstructor[ValueParameterDescriptorImpl]

'constructorDescriptor' @ [258:13] ==> value-parameter constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkHeaderClassConstructor[ValueParameterDescriptorImpl]

'containingDeclaration' @ [258:35] ==> public final val ClassConstructorDescriptor.containingDeclaration: ClassDescriptor[MyPropertyDescriptor]

'kind' @ [258:57] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_CLASS' @ [258:75] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'trace' @ [259:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [259:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'HEADER_ENUM_CONSTRUCTOR' @ [259:26] ==> public final val HEADER_ENUM_CONSTRUCTOR: (DiagnosticFactory0<(KtConstructor<*>..KtConstructor<*>?)>..DiagnosticFactory0<(KtConstructor<*>..KtConstructor<*>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [259:50] ==> @NotNull public open fun on(@NotNull element: KtConstructor<*>): SimpleDiagnostic<(KtConstructor<*>..KtConstructor<*>?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'declaration' @ [259:53] ==> value-parameter declaration: KtConstructor<*> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkHeaderClassConstructor[ValueParameterDescriptorImpl]

'declaration' @ [262:13] ==> value-parameter declaration: KtConstructor<*> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkHeaderClassConstructor[ValueParameterDescriptorImpl]

'!' @ [262:52] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAnnotationClass' @ [262:69] ==> public open fun isAnnotationClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'constructorDescriptor' @ [262:87] ==> value-parameter constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkHeaderClassConstructor[ValueParameterDescriptorImpl]

'constructedClass' @ [262:109] ==> public final val ClassConstructorDescriptor.constructedClass: ClassDescriptor[MyPropertyDescriptor]

'declaration' @ [263:31] ==> value-parameter declaration: KtConstructor<*> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkHeaderClassConstructor[ValueParameterDescriptorImpl]

'valueParameters' @ [263:43] ==> public final val KtPrimaryConstructor.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'parameter' @ [264:21] ==> val parameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkHeaderClassConstructor[LocalVariableDescriptor]

'hasValOrVar' @ [264:31] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'trace' @ [265:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [265:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'HEADER_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER' @ [265:34] ==> public final val HEADER_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER: (DiagnosticFactory0<(KtParameter..KtParameter?)>..DiagnosticFactory0<(KtParameter..KtParameter?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [265:78] ==> @NotNull public open fun on(@NotNull element: KtParameter): SimpleDiagnostic<(KtParameter..KtParameter?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'parameter' @ [265:81] ==> val parameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkHeaderClassConstructor[LocalVariableDescriptor]

'declaration' @ [270:13] ==> value-parameter declaration: KtConstructor<*> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkHeaderClassConstructor[ValueParameterDescriptorImpl]

'declaration' @ [271:34] ==> value-parameter declaration: KtConstructor<*> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkHeaderClassConstructor[ValueParameterDescriptorImpl]

'getDelegationCall' @ [271:46] ==> public final fun getDelegationCall(): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[SimpleFunctionDescriptorImpl]

'!' @ [272:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'delegationCall' @ [272:18] ==> val delegationCall: KtConstructorDelegationCall defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkHeaderClassConstructor[LocalVariableDescriptor]

'isImplicit' @ [272:33] ==> public final val KtConstructorDelegationCall.isImplicit: Boolean[MyPropertyDescriptor]

'trace' @ [273:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [273:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'HEADER_CLASS_CONSTRUCTOR_DELEGATION_CALL' @ [273:30] ==> public final val HEADER_CLASS_CONSTRUCTOR_DELEGATION_CALL: (DiagnosticFactory0<(KtConstructorDelegationCall..KtConstructorDelegationCall?)>..DiagnosticFactory0<(KtConstructorDelegationCall..KtConstructorDelegationCall?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [273:71] ==> @NotNull public open fun on(@NotNull element: KtConstructorDelegationCall): SimpleDiagnostic<(KtConstructorDelegationCall..KtConstructorDelegationCall?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'delegationCall' @ [273:74] ==> val delegationCall: KtConstructorDelegationCall defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkHeaderClassConstructor[LocalVariableDescriptor]

'declaration' @ [279:34] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkConstructorVisibility[ValueParameterDescriptorImpl]

'visibilityModifier' @ [279:46] ==> public fun KtDeclaration.visibilityModifier(): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]

'visibilityModifier' @ [280:13] ==> val visibilityModifier: PsiElement? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkConstructorVisibility[LocalVariableDescriptor]

'visibilityModifier' @ [280:43] ==> val visibilityModifier: PsiElement? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkConstructorVisibility[LocalVariableDescriptor]

'node' @ [280:62] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [280:68] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'PRIVATE_KEYWORD' @ [280:92] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'constructorDescriptor' @ [281:35] ==> value-parameter constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkConstructorVisibility[ValueParameterDescriptorImpl]

'containingDeclaration' @ [281:57] ==> public final val ClassConstructorDescriptor.containingDeclaration: ClassDescriptor[MyPropertyDescriptor]

'if (classDescriptor.kind == ClassKind.ENUM_CLASS) {
                trace.report(NON_PRIVATE_CONSTRUCTOR_IN_ENUM.on(visibilityModifier))
            }
            else if (classDescriptor.modality == Modality.SEALED) {
                trace.report(NON_PRIVATE_CONSTRUCTOR_IN_SEALED.on(visibilityModifier))
            }' @ [282:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'classDescriptor' @ [282:17] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkConstructorVisibility[LocalVariableDescriptor]

'kind' @ [282:33] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_CLASS' @ [282:51] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'trace' @ [283:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [283:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NON_PRIVATE_CONSTRUCTOR_IN_ENUM' @ [283:30] ==> public final val NON_PRIVATE_CONSTRUCTOR_IN_ENUM: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [283:62] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'visibilityModifier' @ [283:65] ==> val visibilityModifier: PsiElement? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkConstructorVisibility[LocalVariableDescriptor]

'classDescriptor' @ [285:22] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkConstructorVisibility[LocalVariableDescriptor]

'modality' @ [285:38] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [285:50] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'SEALED' @ [285:59] ==> enum entry SEALED defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'trace' @ [286:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [286:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NON_PRIVATE_CONSTRUCTOR_IN_SEALED' @ [286:30] ==> public final val NON_PRIVATE_CONSTRUCTOR_IN_SEALED: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [286:64] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'visibilityModifier' @ [286:67] ==> val visibilityModifier: PsiElement? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkConstructorVisibility[LocalVariableDescriptor]

'file' @ [292:32] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkModifiersAndAnnotationsInPackageDirective[ValueParameterDescriptorImpl]

'packageDirective' @ [292:37] ==> public final val KtFile.packageDirective: KtPackageDirective?[MyPropertyDescriptor]

'packageDirective' @ [293:28] ==> val packageDirective: KtPackageDirective defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkModifiersAndAnnotationsInPackageDirective[LocalVariableDescriptor]

'modifierList' @ [293:45] ==> public final val KtPackageDirective.modifierList: KtModifierList?[MyPropertyDescriptor]

'modifierList' @ [295:33] ==> val modifierList: KtModifierList defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkModifiersAndAnnotationsInPackageDirective[LocalVariableDescriptor]

'annotationEntries' @ [295:46] ==> public final val KtModifierList.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'annotationEntry' @ [296:36] ==> val annotationEntry: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkModifiersAndAnnotationsInPackageDirective[LocalVariableDescriptor]

'calleeExpression' @ [296:52] ==> public final val KtAnnotationEntry.calleeExpression: KtConstructorCalleeExpression?[MyPropertyDescriptor]

'calleeExpression' @ [297:17] ==> val calleeExpression: KtConstructorCalleeExpression? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkModifiersAndAnnotationsInPackageDirective[LocalVariableDescriptor]

'calleeExpression' @ [298:17] ==> val calleeExpression: KtConstructorCalleeExpression? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkModifiersAndAnnotationsInPackageDirective[LocalVariableDescriptor]

'constructorReferenceExpression' @ [298:34] ==> public final val KtConstructorCalleeExpression.constructorReferenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'let' @ [298:66] ==> @InlineOnly public inline fun <T, R> KtSimpleNameExpression.let(block: (KtSimpleNameExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSimpleNameExpression
    <R> -> Unit

'trace' @ [298:72] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [298:78] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNRESOLVED_REFERENCE' @ [298:85] ==> public final val UNRESOLVED_REFERENCE: (DiagnosticFactory1<(KtReferenceExpression..KtReferenceExpression?), (KtReferenceExpression..KtReferenceExpression?)>..DiagnosticFactory1<(KtReferenceExpression..KtReferenceExpression?), (KtReferenceExpression..KtReferenceExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [298:106] ==> @NotNull public open fun on(@NotNull element: KtReferenceExpression, @NotNull argument: KtReferenceExpression): ParametrizedDiagnostic<(KtReferenceExpression..KtReferenceExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'it' @ [298:109] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkModifiersAndAnnotationsInPackageDirective.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [298:113] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkModifiersAndAnnotationsInPackageDirective.<anonymous>[ValueParameterDescriptorImpl]

'annotationChecker' @ [301:9] ==> private final val annotationChecker: AnnotationChecker defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'check' @ [301:27] ==> public final fun check(annotated: KtAnnotated, trace: BindingTrace, descriptor: DeclarationDescriptor? = ...): Unit defined in org.jetbrains.kotlin.resolve.AnnotationChecker[SimpleFunctionDescriptorImpl]

'packageDirective' @ [301:33] ==> val packageDirective: KtPackageDirective defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkModifiersAndAnnotationsInPackageDirective[LocalVariableDescriptor]

'trace' @ [301:51] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'ModifierCheckerCore' @ [302:9] ==> public object ModifierCheckerCore defined in org.jetbrains.kotlin.resolve in file ModifiersChecker.kt[FakeCallableDescriptorForObject]

'check' @ [302:29] ==> public final fun check(listOwner: KtModifierListOwner, trace: BindingTrace, descriptor: DeclarationDescriptor?, languageVersionSettings: LanguageVersionSettings): Unit defined in org.jetbrains.kotlin.resolve.ModifierCheckerCore[SimpleFunctionDescriptorImpl]

'packageDirective' @ [302:35] ==> val packageDirective: KtPackageDirective defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkModifiersAndAnnotationsInPackageDirective[LocalVariableDescriptor]

'trace' @ [302:53] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'languageVersionSettings' @ [302:105] ==> private final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'trace' @ [306:51] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'bindingContext' @ [306:57] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'get' @ [306:72] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..ReadOnlySlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?), key: (KtTypeReference..KtTypeReference?)): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtTypeReference
    <V : (Any..Any?)> -> KotlinType

'TYPE' @ [306:76] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [306:82] ==> <this> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader.type[ReceiverParameterDescriptorImpl]

'classOrObject' @ [308:37] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[ValueParameterDescriptorImpl]

'superTypeListEntries' @ [308:51] ==> public final val KtClassOrObject.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'delegationSpecifier' @ [309:33] ==> val delegationSpecifier: KtSuperTypeListEntry defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[LocalVariableDescriptor]

'typeReference' @ [309:53] ==> public final val KtSuperTypeListEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeReference' @ [310:13] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[LocalVariableDescriptor]

'type' @ [310:27] ==> local final fun KtTypeReference.type(): KotlinType? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[SimpleFunctionDescriptorImpl]

'let' @ [310:35] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> Unit

'checkBounds' @ [310:60] ==> public open fun checkBounds(@NotNull typeReference: KtTypeReference, @NotNull type: KotlinType, @NotNull trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.DescriptorResolver[JavaMethodDescriptor]

'typeReference' @ [310:72] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[LocalVariableDescriptor]

'it' @ [310:87] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader.<anonymous>[ValueParameterDescriptorImpl]

'trace' @ [310:91] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'classOrObject' @ [313:13] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[ValueParameterDescriptorImpl]

'ArrayList' @ [315:39] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> UpperBoundCheckRequest

'classOrObject' @ [317:31] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[ValueParameterDescriptorImpl]

'typeParameters' @ [317:45] ==> public final val KtClass.typeParameters: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>)[MyPropertyDescriptor]

'typeParameter' @ [318:33] ==> val typeParameter: (KtTypeParameter..KtTypeParameter?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[LocalVariableDescriptor]

'extendsBound' @ [318:47] ==> public final var KtTypeParameter.extendsBound: KtTypeReference?[MyPropertyDescriptor]

'typeReference' @ [319:24] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[LocalVariableDescriptor]

'type' @ [319:38] ==> local final fun KtTypeReference.type(): KotlinType? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[SimpleFunctionDescriptorImpl]

'upperBoundCheckRequests' @ [320:13] ==> val upperBoundCheckRequests: ArrayList<DescriptorResolver.UpperBoundCheckRequest> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[LocalVariableDescriptor]

'add' @ [320:37] ==> public open fun add(element: DescriptorResolver.UpperBoundCheckRequest): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'UpperBoundCheckRequest' @ [320:60] ==> public/*package*/ constructor UpperBoundCheckRequest(typeParameterName: (Name..Name?), upperBound: (KtTypeReference..KtTypeReference?), upperBoundType: (KotlinType..KotlinType?)) defined in org.jetbrains.kotlin.resolve.DescriptorResolver.UpperBoundCheckRequest[JavaClassConstructorDescriptor]

'typeParameter' @ [320:83] ==> val typeParameter: (KtTypeParameter..KtTypeParameter?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[LocalVariableDescriptor]

'nameAsName' @ [320:97] ==> public final val KtTypeParameter.nameAsName: Name?[MyPropertyDescriptor]

'typeReference' @ [320:109] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[LocalVariableDescriptor]

'type' @ [320:124] ==> val type: KotlinType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[LocalVariableDescriptor]

'classOrObject' @ [323:28] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[ValueParameterDescriptorImpl]

'typeConstraints' @ [323:42] ==> public final val KtClass.typeConstraints: (MutableList<(KtTypeConstraint..KtTypeConstraint?)>..List<(KtTypeConstraint..KtTypeConstraint?)>)[MyPropertyDescriptor]

'constraint' @ [324:33] ==> val constraint: (KtTypeConstraint..KtTypeConstraint?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[LocalVariableDescriptor]

'boundTypeReference' @ [324:44] ==> public final val KtTypeConstraint.boundTypeReference: KtTypeReference?[MyPropertyDescriptor]

'typeReference' @ [325:24] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[LocalVariableDescriptor]

'type' @ [325:38] ==> local final fun KtTypeReference.type(): KotlinType? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[SimpleFunctionDescriptorImpl]

'constraint' @ [326:24] ==> val constraint: (KtTypeConstraint..KtTypeConstraint?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[LocalVariableDescriptor]

'subjectTypeParameterName' @ [326:35] ==> public final val KtTypeConstraint.subjectTypeParameterName: KtSimpleNameExpression?[MyPropertyDescriptor]

'getReferencedNameAsName' @ [326:61] ==> public abstract fun getReferencedNameAsName(): Name defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[SimpleFunctionDescriptorImpl]

'upperBoundCheckRequests' @ [327:13] ==> val upperBoundCheckRequests: ArrayList<DescriptorResolver.UpperBoundCheckRequest> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[LocalVariableDescriptor]

'add' @ [327:37] ==> public open fun add(element: DescriptorResolver.UpperBoundCheckRequest): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'UpperBoundCheckRequest' @ [327:60] ==> public/*package*/ constructor UpperBoundCheckRequest(typeParameterName: (Name..Name?), upperBound: (KtTypeReference..KtTypeReference?), upperBoundType: (KotlinType..KotlinType?)) defined in org.jetbrains.kotlin.resolve.DescriptorResolver.UpperBoundCheckRequest[JavaClassConstructorDescriptor]

'name' @ [327:83] ==> val name: Name defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[LocalVariableDescriptor]

'typeReference' @ [327:89] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[LocalVariableDescriptor]

'type' @ [327:104] ==> val type: KotlinType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[LocalVariableDescriptor]

'checkUpperBoundTypes' @ [330:28] ==> public open fun checkUpperBoundTypes(@NotNull trace: BindingTrace, @NotNull requests: (MutableList<(DescriptorResolver.UpperBoundCheckRequest..DescriptorResolver.UpperBoundCheckRequest?)>..List<(DescriptorResolver.UpperBoundCheckRequest..DescriptorResolver.UpperBoundCheckRequest?)>)): Unit defined in org.jetbrains.kotlin.resolve.DescriptorResolver[JavaMethodDescriptor]

'trace' @ [330:49] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'upperBoundCheckRequests' @ [330:56] ==> val upperBoundCheckRequests: ArrayList<DescriptorResolver.UpperBoundCheckRequest> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[LocalVariableDescriptor]

'upperBoundCheckRequests' @ [332:25] ==> val upperBoundCheckRequests: ArrayList<DescriptorResolver.UpperBoundCheckRequest> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[LocalVariableDescriptor]

'checkBounds' @ [333:32] ==> public open fun checkBounds(@NotNull typeReference: KtTypeReference, @NotNull type: KotlinType, @NotNull trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.DescriptorResolver[JavaMethodDescriptor]

'request' @ [333:44] ==> val request: DescriptorResolver.UpperBoundCheckRequest defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[LocalVariableDescriptor]

'upperBound' @ [333:52] ==> public final val upperBound: (KtTypeReference..KtTypeReference?) defined in org.jetbrains.kotlin.resolve.DescriptorResolver.UpperBoundCheckRequest[JavaPropertyDescriptor]

'request' @ [333:64] ==> val request: DescriptorResolver.UpperBoundCheckRequest defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypesInClassHeader[LocalVariableDescriptor]

'upperBoundType' @ [333:72] ==> public final val upperBoundType: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.DescriptorResolver.UpperBoundCheckRequest[JavaPropertyDescriptor]

'trace' @ [333:88] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'descriptor' @ [340:27] ==> value-parameter descriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOnlyOneTypeParameterBound[ValueParameterDescriptorImpl]

'upperBounds' @ [340:38] ==> public final val TypeParameterDescriptor.upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)[MyPropertyDescriptor]

'component1' @ [341:14] ==> public final operator fun component1(): Set<TypeConstructor> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [341:44] ==> public final operator fun component2(): Set<TypeConstructor> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'upperBounds' @ [341:59] ==> val upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOnlyOneTypeParameterBound[LocalVariableDescriptor]

'map' @ [342:18] ==> public inline fun <T, R> Iterable<(KotlinType..KotlinType?)>.map(transform: ((KotlinType..KotlinType?)) -> TypeConstructor): List<TypeConstructor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R> -> TypeConstructor

'KotlinType' @ [342:22] ==> private constructor KotlinType() defined in org.jetbrains.kotlin.types.KotlinType[DeserializedClassConstructorDescriptor]

'partition' @ [343:18] ==> public inline fun <T> Iterable<TypeConstructor>.partition(predicate: (TypeConstructor) -> Boolean): Pair<List<TypeConstructor>, List<TypeConstructor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeConstructor

'constructor' @ [343:45] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOnlyOneTypeParameterBound.<anonymous>[ValueParameterDescriptorImpl]

'declarationDescriptor' @ [343:57] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'let' @ [344:18] ==> @InlineOnly public inline fun <T, R> Pair<List<TypeConstructor>, List<TypeConstructor>>.let(block: (Pair<List<TypeConstructor>, List<TypeConstructor>>) -> Pair<Set<TypeConstructor>, Set<TypeConstructor>>): Pair<Set<TypeConstructor>, Set<TypeConstructor>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<List<TypeConstructor>, List<TypeConstructor>>
    <R> -> Pair<Set<TypeConstructor>, Set<TypeConstructor>>

'pair' @ [344:32] ==> value-parameter pair: Pair<List<TypeConstructor>, List<TypeConstructor>> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOnlyOneTypeParameterBound.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [344:37] ==> public final val first: List<TypeConstructor> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'toSet' @ [344:43] ==> public fun <T> Iterable<TypeConstructor>.toSet(): Set<TypeConstructor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeConstructor

'pair' @ [344:54] ==> value-parameter pair: Pair<List<TypeConstructor>, List<TypeConstructor>> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOnlyOneTypeParameterBound.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [344:59] ==> public final val second: List<TypeConstructor> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'toSet' @ [344:66] ==> public fun <T> Iterable<TypeConstructor>.toSet(): Set<TypeConstructor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeConstructor

'boundsWhichAreTypeParameters' @ [345:13] ==> val boundsWhichAreTypeParameters: Set<TypeConstructor> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOnlyOneTypeParameterBound[LocalVariableDescriptor]

'size' @ [345:42] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'boundsWhichAreTypeParameters' @ [345:55] ==> val boundsWhichAreTypeParameters: Set<TypeConstructor> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOnlyOneTypeParameterBound[LocalVariableDescriptor]

'size' @ [345:84] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'otherBounds' @ [345:97] ==> val otherBounds: Set<TypeConstructor> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOnlyOneTypeParameterBound[LocalVariableDescriptor]

'isNotEmpty' @ [345:109] ==> @InlineOnly public inline fun <T> Collection<TypeConstructor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeConstructor

'if (boundsWhichAreTypeParameters.size + otherBounds.size == 2) {
                // If there's only one problematic bound (either 2 type parameter bounds, or 1 type parameter bound + 1 other bound),
                // report the diagnostic on that bound

                val allBounds: List<Pair<KtTypeReference, KotlinType?>> =
                        owner.typeConstraints
                                .filter { constraint ->
                                    constraint.subjectTypeParameterName?.getReferencedNameAsName() == declaration.nameAsName
                                }
                                .mapNotNull { constraint -> constraint.boundTypeReference }
                                .map { typeReference -> typeReference to trace.bindingContext.get(TYPE, typeReference) }

                val problematicBound =
                        allBounds.firstOrNull { bound -> bound.second?.constructor != boundsWhichAreTypeParameters.first() }

                problematicBound?.first ?: declaration
            }
            else {
                // Otherwise report the diagnostic on the type parameter declaration
                declaration
            }' @ [346:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtModifierListOwnerStub<out (StubElement<out (KtModifierListOwnerStub<out (StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtModifierListOwnerStub<out (StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>..StubElement<out (KtModifierListOwnerStub<out (StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtModifierListOwnerStub<out (StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>?)>, elseBranch: KtModifierListOwnerStub<out (StubElement<out (KtModifierListOwnerStub<out (StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtModifierListOwnerStub<out (StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>..StubElement<out (KtModifierListOwnerStub<out (StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtModifierListOwnerStub<out (StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>?)>): KtModifierListOwnerStub<out (StubElement<out (KtModifierListOwnerStub<out (StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtModifierListOwnerStub<out (StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>..StubElement<out (KtModifierListOwnerStub<out (StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtModifierListOwnerStub<out (StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtModifierListOwnerStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtModifierListOwnerStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtModifierListOwnerStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtModifierListOwnerStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtModifierListOwnerStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtModifierListOwnerStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>?)>..org.jetbrains.kotlin.psi.KtModifierListOwnerStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtModifierListOwnerStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtModifierListOwnerStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtModifierListOwnerStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtModifierListOwnerStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtModifierListOwnerStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtModifierListOwnerStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtModifierListOwnerStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtModifierListOwnerStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtModifierListOwnerStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>?)>..org.jetbrains.kotlin.psi.KtModifierListOwnerStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtModifierListOwnerStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtModifierListOwnerStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtModifierListOwnerStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtModifierListOwnerStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>?)>?)>?)>

'boundsWhichAreTypeParameters' @ [346:32] ==> val boundsWhichAreTypeParameters: Set<TypeConstructor> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOnlyOneTypeParameterBound[LocalVariableDescriptor]

'size' @ [346:61] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'otherBounds' @ [346:68] ==> val otherBounds: Set<TypeConstructor> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOnlyOneTypeParameterBound[LocalVariableDescriptor]

'size' @ [346:80] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'owner' @ [351:25] ==> value-parameter owner: KtTypeParameterListOwner defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOnlyOneTypeParameterBound[ValueParameterDescriptorImpl]

'typeConstraints' @ [351:31] ==> public final val KtTypeParameterListOwner.typeConstraints: (MutableList<(KtTypeConstraint..KtTypeConstraint?)>..List<(KtTypeConstraint..KtTypeConstraint?)>)[MyPropertyDescriptor]

'filter' @ [352:34] ==> public inline fun <T> Iterable<(KtTypeConstraint..KtTypeConstraint?)>.filter(predicate: ((KtTypeConstraint..KtTypeConstraint?)) -> Boolean): List<(KtTypeConstraint..KtTypeConstraint?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeConstraint..org.jetbrains.kotlin.psi.KtTypeConstraint?)

'constraint' @ [353:37] ==> value-parameter constraint: (KtTypeConstraint..KtTypeConstraint?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOnlyOneTypeParameterBound.<anonymous>[ValueParameterDescriptorImpl]

'subjectTypeParameterName' @ [353:48] ==> public final val KtTypeConstraint.subjectTypeParameterName: KtSimpleNameExpression?[MyPropertyDescriptor]

'getReferencedNameAsName' @ [353:74] ==> public abstract fun getReferencedNameAsName(): Name defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[SimpleFunctionDescriptorImpl]

'declaration' @ [353:103] ==> value-parameter declaration: KtTypeParameter defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOnlyOneTypeParameterBound[ValueParameterDescriptorImpl]

'nameAsName' @ [353:115] ==> public final val KtTypeParameter.nameAsName: Name?[MyPropertyDescriptor]

'mapNotNull' @ [355:34] ==> public inline fun <T, R : Any> Iterable<(KtTypeConstraint..KtTypeConstraint?)>.mapNotNull(transform: ((KtTypeConstraint..KtTypeConstraint?)) -> KtTypeReference?): List<KtTypeReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeConstraint..org.jetbrains.kotlin.psi.KtTypeConstraint?)
    <R : Any> -> KtTypeReference

'constraint' @ [355:61] ==> value-parameter constraint: (KtTypeConstraint..KtTypeConstraint?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOnlyOneTypeParameterBound.<anonymous>[ValueParameterDescriptorImpl]

'boundTypeReference' @ [355:72] ==> public final val KtTypeConstraint.boundTypeReference: KtTypeReference?[MyPropertyDescriptor]

'map' @ [356:34] ==> public inline fun <T, R> Iterable<KtTypeReference>.map(transform: (KtTypeReference) -> Pair<KtTypeReference, KotlinType?>): List<Pair<KtTypeReference, KotlinType?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeReference
    <R> -> Pair<KtTypeReference, KotlinType?>

'typeReference' @ [356:57] ==> value-parameter typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOnlyOneTypeParameterBound.<anonymous>[ValueParameterDescriptorImpl]

'trace' @ [356:74] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'bindingContext' @ [356:80] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'get' @ [356:95] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..ReadOnlySlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?), key: (KtTypeReference..KtTypeReference?)): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtTypeReference
    <V : (Any..Any?)> -> KotlinType

'TYPE' @ [356:99] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'typeReference' @ [356:105] ==> value-parameter typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOnlyOneTypeParameterBound.<anonymous>[ValueParameterDescriptorImpl]

'allBounds' @ [359:25] ==> val allBounds: List<Pair<KtTypeReference, KotlinType?>> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOnlyOneTypeParameterBound[LocalVariableDescriptor]

'firstOrNull' @ [359:35] ==> public inline fun <T> Iterable<Pair<KtTypeReference, KotlinType?>>.firstOrNull(predicate: (Pair<KtTypeReference, KotlinType?>) -> Boolean): Pair<KtTypeReference, KotlinType?>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<KtTypeReference, KotlinType?>

'bound' @ [359:58] ==> value-parameter bound: Pair<KtTypeReference, KotlinType?> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOnlyOneTypeParameterBound.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [359:64] ==> public final val second: KotlinType? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'constructor' @ [359:72] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'boundsWhichAreTypeParameters' @ [359:87] ==> val boundsWhichAreTypeParameters: Set<TypeConstructor> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOnlyOneTypeParameterBound[LocalVariableDescriptor]

'first' @ [359:116] ==> public fun <T> Iterable<TypeConstructor>.first(): TypeConstructor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeConstructor

'problematicBound' @ [361:17] ==> val problematicBound: Pair<KtTypeReference, KotlinType?>? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOnlyOneTypeParameterBound[LocalVariableDescriptor]

'first' @ [361:35] ==> public final val first: KtTypeReference defined in kotlin.Pair[DeserializedPropertyDescriptor]

'declaration' @ [361:44] ==> value-parameter declaration: KtTypeParameter defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOnlyOneTypeParameterBound[ValueParameterDescriptorImpl]

'declaration' @ [365:17] ==> value-parameter declaration: KtTypeParameter defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOnlyOneTypeParameterBound[ValueParameterDescriptorImpl]

'trace' @ [368:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [368:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'BOUNDS_NOT_ALLOWED_IF_BOUNDED_BY_TYPE_PARAMETER' @ [368:26] ==> public final val BOUNDS_NOT_ALLOWED_IF_BOUNDED_BY_TYPE_PARAMETER: (DiagnosticFactory0<(KtElement..KtElement?)>..DiagnosticFactory0<(KtElement..KtElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [368:74] ==> @NotNull public open fun on(@NotNull element: KtElement): SimpleDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'reportOn' @ [368:77] ==> val reportOn: KtModifierListOwnerStub<out (StubElement<out (KtModifierListOwnerStub<out (StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtModifierListOwnerStub<out (StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>..StubElement<out (KtModifierListOwnerStub<out (StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtModifierListOwnerStub<out (StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>..KtModifierListOwnerStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>?)> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOnlyOneTypeParameterBound[LocalVariableDescriptor]

'classifier' @ [373:13] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkSupertypesForConsistency[ValueParameterDescriptorImpl]

'classifier' @ [374:40] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkSupertypesForConsistency[ValueParameterDescriptorImpl]

'upperBounds' @ [374:51] ==> public final val TypeParameterDescriptor.upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)[MyPropertyDescriptor]

'map' @ [374:63] ==> public inline fun <T, R> Iterable<(KotlinType..KotlinType?)>.map(transform: ((KotlinType..KotlinType?)) -> TypeConstructor): List<TypeConstructor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R> -> TypeConstructor

'it' @ [374:69] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkSupertypesForConsistency.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [374:72] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'immediateUpperBounds' @ [375:17] ==> val immediateUpperBounds: List<TypeConstructor> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkSupertypesForConsistency[LocalVariableDescriptor]

'size' @ [375:38] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'immediateUpperBounds' @ [375:46] ==> val immediateUpperBounds: List<TypeConstructor> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkSupertypesForConsistency[LocalVariableDescriptor]

'toSet' @ [375:67] ==> public fun <T> Iterable<TypeConstructor>.toSet(): Set<TypeConstructor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeConstructor

'size' @ [375:75] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'buildDeepSubstitutionMultimap' @ [382:42] ==> @NotNull public open fun buildDeepSubstitutionMultimap(@NotNull type: KotlinType): Multimap<(TypeParameterDescriptor..TypeParameterDescriptor?), (TypeProjection..TypeProjection?)> defined in org.jetbrains.kotlin.types.SubstitutionUtils[JavaMethodDescriptor]

'classifier' @ [382:72] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkSupertypesForConsistency[ValueParameterDescriptorImpl]

'defaultType' @ [382:83] ==> public final val ClassifierDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'component1' @ [383:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(TypeParameterDescriptor..TypeParameterDescriptor?), (MutableCollection<(TypeProjection..TypeProjection?)>..Collection<(TypeProjection..TypeProjection?)>?)>.component1(): (TypeParameterDescriptor..TypeParameterDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <V> -> (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.types.TypeProjection..org.jetbrains.kotlin.types.TypeProjection?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.types.TypeProjection..org.jetbrains.kotlin.types.TypeProjection?)>?)

'component2' @ [383:40] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(TypeParameterDescriptor..TypeParameterDescriptor?), (MutableCollection<(TypeProjection..TypeProjection?)>..Collection<(TypeProjection..TypeProjection?)>?)>.component2(): (MutableCollection<(TypeProjection..TypeProjection?)>..Collection<(TypeProjection..TypeProjection?)>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <V> -> (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.types.TypeProjection..org.jetbrains.kotlin.types.TypeProjection?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.types.TypeProjection..org.jetbrains.kotlin.types.TypeProjection?)>?)

'multiMap' @ [383:56] ==> val multiMap: Multimap<(TypeParameterDescriptor..TypeParameterDescriptor?), (TypeProjection..TypeProjection?)> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkSupertypesForConsistency[LocalVariableDescriptor]

'asMap' @ [383:65] ==> public abstract fun asMap(): (MutableMap<(TypeParameterDescriptor..TypeParameterDescriptor?), (MutableCollection<(TypeProjection..TypeProjection?)>..Collection<(TypeProjection..TypeProjection?)>?)>..Map<(TypeParameterDescriptor..TypeParameterDescriptor?), (MutableCollection<(TypeProjection..TypeProjection?)>..Collection<(TypeProjection..TypeProjection?)>?)>?) defined in com.google.common.collect.Multimap[JavaMethodDescriptor]

'projections' @ [384:17] ==> val projections: (MutableCollection<(TypeProjection..TypeProjection?)>..Collection<(TypeProjection..TypeProjection?)>?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkSupertypesForConsistency[LocalVariableDescriptor]

'size' @ [384:29] ==> public abstract val size: Int defined in kotlin.collections.MutableCollection[DeserializedPropertyDescriptor]

'projections' @ [387:36] ==> val projections: (MutableCollection<(TypeProjection..TypeProjection?)>..Collection<(TypeProjection..TypeProjection?)>?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkSupertypesForConsistency[LocalVariableDescriptor]

'map' @ [387:48] ==> public inline fun <T, R> Iterable<(TypeProjection..TypeProjection?)>.map(transform: ((TypeProjection..TypeProjection?)) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.TypeProjection..org.jetbrains.kotlin.types.TypeProjection?)
    <R> -> KotlinType

'it' @ [387:54] ==> value-parameter it: (TypeProjection..TypeProjection?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkSupertypesForConsistency.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [387:57] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'toMutableSet' @ [387:64] ==> public fun <T> Iterable<KotlinType>.toMutableSet(): MutableSet<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'removeDuplicateTypes' @ [388:13] ==> private final fun removeDuplicateTypes(conflictingTypes: MutableSet<KotlinType>): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion[SimpleFunctionDescriptorImpl]

'conflictingTypes' @ [388:34] ==> val conflictingTypes: MutableSet<KotlinType> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkSupertypesForConsistency[LocalVariableDescriptor]

'conflictingTypes' @ [389:17] ==> val conflictingTypes: MutableSet<KotlinType> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkSupertypesForConsistency[LocalVariableDescriptor]

'size' @ [389:34] ==> public abstract val size: Int defined in kotlin.collections.MutableSet[DeserializedPropertyDescriptor]

'typeParameterDescriptor' @ [391:41] ==> val typeParameterDescriptor: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkSupertypesForConsistency[LocalVariableDescriptor]

'containingDeclaration' @ [391:65] ==> public final val TypeParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'AssertionError' @ [392:50] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'+' @ [392:65] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'typeParameterDescriptor' @ [392:94] ==> val typeParameterDescriptor: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkSupertypesForConsistency[LocalVariableDescriptor]

'containingDeclaration' @ [392:118] ==> public final val TypeParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'if (sourceElement is KtClassOrObject) {
                val delegationSpecifierList = sourceElement.getSuperTypeList() ?: continue
                trace.report(INCONSISTENT_TYPE_PARAMETER_VALUES.on(
                        delegationSpecifierList, typeParameterDescriptor, containingDeclaration, conflictingTypes
                ))
            }
            else if (sourceElement is KtTypeParameter) {
                trace.report(INCONSISTENT_TYPE_PARAMETER_BOUNDS.on(
                        sourceElement, typeParameterDescriptor, containingDeclaration, conflictingTypes
                ))
            }' @ [393:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'sourceElement' @ [393:17] ==> value-parameter sourceElement: PsiElement defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkSupertypesForConsistency[ValueParameterDescriptorImpl]

'sourceElement' @ [394:47] ==> value-parameter sourceElement: PsiElement defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkSupertypesForConsistency[ValueParameterDescriptorImpl]

'getSuperTypeList' @ [394:61] ==> public final fun getSuperTypeList(): KtSuperTypeList? defined in org.jetbrains.kotlin.psi.KtClassOrObject[SimpleFunctionDescriptorImpl]

'trace' @ [395:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [395:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INCONSISTENT_TYPE_PARAMETER_VALUES' @ [395:30] ==> public final val INCONSISTENT_TYPE_PARAMETER_VALUES: (DiagnosticFactory3<(KtSuperTypeList..KtSuperTypeList?), (TypeParameterDescriptor..TypeParameterDescriptor?), (ClassDescriptor..ClassDescriptor?), (MutableCollection<(KotlinType..KotlinType?)>..Collection<(KotlinType..KotlinType?)>?)>..DiagnosticFactory3<(KtSuperTypeList..KtSuperTypeList?), (TypeParameterDescriptor..TypeParameterDescriptor?), (ClassDescriptor..ClassDescriptor?), (MutableCollection<(KotlinType..KotlinType?)>..Collection<(KotlinType..KotlinType?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [395:65] ==> @NotNull public open fun on(@NotNull element: KtSuperTypeList, @NotNull a: TypeParameterDescriptor, @NotNull b: ClassDescriptor, @NotNull c: (MutableCollection<(KotlinType..KotlinType?)>..Collection<(KotlinType..KotlinType?)>)): ParametrizedDiagnostic<(KtSuperTypeList..KtSuperTypeList?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'delegationSpecifierList' @ [396:25] ==> val delegationSpecifierList: KtSuperTypeList defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkSupertypesForConsistency[LocalVariableDescriptor]

'typeParameterDescriptor' @ [396:50] ==> val typeParameterDescriptor: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkSupertypesForConsistency[LocalVariableDescriptor]

'containingDeclaration' @ [396:75] ==> val containingDeclaration: ClassDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkSupertypesForConsistency[LocalVariableDescriptor]

'conflictingTypes' @ [396:98] ==> val conflictingTypes: MutableSet<KotlinType> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkSupertypesForConsistency[LocalVariableDescriptor]

'sourceElement' @ [399:22] ==> value-parameter sourceElement: PsiElement defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkSupertypesForConsistency[ValueParameterDescriptorImpl]

'trace' @ [400:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [400:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INCONSISTENT_TYPE_PARAMETER_BOUNDS' @ [400:30] ==> public final val INCONSISTENT_TYPE_PARAMETER_BOUNDS: (DiagnosticFactory3<(KtTypeParameter..KtTypeParameter?), (TypeParameterDescriptor..TypeParameterDescriptor?), (ClassDescriptor..ClassDescriptor?), (MutableCollection<(KotlinType..KotlinType?)>..Collection<(KotlinType..KotlinType?)>?)>..DiagnosticFactory3<(KtTypeParameter..KtTypeParameter?), (TypeParameterDescriptor..TypeParameterDescriptor?), (ClassDescriptor..ClassDescriptor?), (MutableCollection<(KotlinType..KotlinType?)>..Collection<(KotlinType..KotlinType?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [400:65] ==> @NotNull public open fun on(@NotNull element: KtTypeParameter, @NotNull a: TypeParameterDescriptor, @NotNull b: ClassDescriptor, @NotNull c: (MutableCollection<(KotlinType..KotlinType?)>..Collection<(KotlinType..KotlinType?)>)): ParametrizedDiagnostic<(KtTypeParameter..KtTypeParameter?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'sourceElement' @ [401:25] ==> value-parameter sourceElement: PsiElement defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkSupertypesForConsistency[ValueParameterDescriptorImpl]

'typeParameterDescriptor' @ [401:40] ==> val typeParameterDescriptor: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkSupertypesForConsistency[LocalVariableDescriptor]

'containingDeclaration' @ [401:65] ==> val containingDeclaration: ClassDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkSupertypesForConsistency[LocalVariableDescriptor]

'conflictingTypes' @ [401:88] ==> val conflictingTypes: MutableSet<KotlinType> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkSupertypesForConsistency[LocalVariableDescriptor]

'checkOpenMembers' @ [408:9] ==> private final fun checkOpenMembers(classDescriptor: ClassDescriptorWithResolutionScopes): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [408:26] ==> value-parameter classDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkObject[ValueParameterDescriptorImpl]

'declaration' @ [409:13] ==> value-parameter declaration: KtObjectDeclaration defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkObject[ValueParameterDescriptorImpl]

'isLocal' @ [409:25] ==> public final val KtObjectDeclaration.isLocal: Boolean[MyPropertyDescriptor]

'!' @ [409:36] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [409:37] ==> value-parameter declaration: KtObjectDeclaration defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkObject[ValueParameterDescriptorImpl]

'isCompanion' @ [409:49] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[SimpleFunctionDescriptorImpl]

'!' @ [409:66] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [409:67] ==> value-parameter declaration: KtObjectDeclaration defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkObject[ValueParameterDescriptorImpl]

'isObjectLiteral' @ [409:79] ==> public final fun isObjectLiteral(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[SimpleFunctionDescriptorImpl]

'trace' @ [410:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [410:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'LOCAL_OBJECT_NOT_ALLOWED' @ [410:26] ==> public final val LOCAL_OBJECT_NOT_ALLOWED: (DiagnosticFactory1<(KtObjectDeclaration..KtObjectDeclaration?), (ClassDescriptor..ClassDescriptor?)>..DiagnosticFactory1<(KtObjectDeclaration..KtObjectDeclaration?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [410:51] ==> @NotNull public open fun on(@NotNull element: KtObjectDeclaration, @NotNull argument: ClassDescriptor): ParametrizedDiagnostic<(KtObjectDeclaration..KtObjectDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'declaration' @ [410:54] ==> value-parameter declaration: KtObjectDeclaration defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkObject[ValueParameterDescriptorImpl]

'classDescriptor' @ [410:67] ==> value-parameter classDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkObject[ValueParameterDescriptorImpl]

'checkOpenMembers' @ [415:9] ==> private final fun checkOpenMembers(classDescriptor: ClassDescriptorWithResolutionScopes): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [415:26] ==> value-parameter classDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkClassButNotObject[ValueParameterDescriptorImpl]

'checkTypeParameters' @ [416:9] ==> private final fun checkTypeParameters(typeParameterListOwner: KtTypeParameterListOwner): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'aClass' @ [416:29] ==> value-parameter aClass: KtClass defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkClassButNotObject[ValueParameterDescriptorImpl]

'checkTypeParameterConstraints' @ [417:9] ==> private final fun checkTypeParameterConstraints(typeParameterListOwner: KtTypeParameterListOwner): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'aClass' @ [417:39] ==> value-parameter aClass: KtClass defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkClassButNotObject[ValueParameterDescriptorImpl]

'FiniteBoundRestrictionChecker' @ [418:9] ==> public object FiniteBoundRestrictionChecker defined in org.jetbrains.kotlin.resolve in file FiniteBoundRestrictionChecker.kt[FakeCallableDescriptorForObject]

'check' @ [418:39] ==> @JvmStatic public final fun check(declaration: KtClass, classDescriptor: ClassDescriptor, diagnosticHolder: DiagnosticSink): Unit defined in org.jetbrains.kotlin.resolve.FiniteBoundRestrictionChecker[SimpleFunctionDescriptorImpl]

'aClass' @ [418:45] ==> value-parameter aClass: KtClass defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkClassButNotObject[ValueParameterDescriptorImpl]

'classDescriptor' @ [418:53] ==> value-parameter classDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkClassButNotObject[ValueParameterDescriptorImpl]

'trace' @ [418:70] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'NonExpansiveInheritanceRestrictionChecker' @ [419:9] ==> public object NonExpansiveInheritanceRestrictionChecker defined in org.jetbrains.kotlin.resolve in file NonExpansiveInheritanceRestrictionChecker.kt[FakeCallableDescriptorForObject]

'check' @ [419:51] ==> @JvmStatic public final fun check(declaration: KtClass, classDescriptor: ClassDescriptor, diagnosticHolder: DiagnosticSink): Unit defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker[SimpleFunctionDescriptorImpl]

'aClass' @ [419:57] ==> value-parameter aClass: KtClass defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkClassButNotObject[ValueParameterDescriptorImpl]

'classDescriptor' @ [419:65] ==> value-parameter classDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkClassButNotObject[ValueParameterDescriptorImpl]

'trace' @ [419:82] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'when {
            aClass.isInterface() -> {
                checkConstructorInInterface(aClass)
                checkMethodsOfAnyInInterface(classDescriptor)
                if (aClass.isLocal && classDescriptor.containingDeclaration !is ClassDescriptor) {
                    trace.report(LOCAL_INTERFACE_NOT_ALLOWED.on(aClass, classDescriptor))
                }
            }
            classDescriptor.kind == ClassKind.ANNOTATION_CLASS -> {
                checkAnnotationClassWithBody(aClass)
                checkValOnAnnotationParameter(aClass)
            }
            aClass is KtEnumEntry -> checkEnumEntry(aClass, classDescriptor)
        }' @ [421:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'aClass' @ [422:13] ==> value-parameter aClass: KtClass defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkClassButNotObject[ValueParameterDescriptorImpl]

'isInterface' @ [422:20] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[SimpleFunctionDescriptorImpl]

'checkConstructorInInterface' @ [423:17] ==> private final fun checkConstructorInInterface(klass: KtClass): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'aClass' @ [423:45] ==> value-parameter aClass: KtClass defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkClassButNotObject[ValueParameterDescriptorImpl]

'checkMethodsOfAnyInInterface' @ [424:17] ==> private final fun checkMethodsOfAnyInInterface(classDescriptor: ClassDescriptorWithResolutionScopes): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [424:46] ==> value-parameter classDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkClassButNotObject[ValueParameterDescriptorImpl]

'aClass' @ [425:21] ==> value-parameter aClass: KtClass defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkClassButNotObject[ValueParameterDescriptorImpl]

'isLocal' @ [425:28] ==> public final val KtClass.isLocal: Boolean[MyPropertyDescriptor]

'classDescriptor' @ [425:39] ==> value-parameter classDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkClassButNotObject[ValueParameterDescriptorImpl]

'containingDeclaration' @ [425:55] ==> public final val ClassDescriptorWithResolutionScopes.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'trace' @ [426:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [426:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'LOCAL_INTERFACE_NOT_ALLOWED' @ [426:34] ==> public final val LOCAL_INTERFACE_NOT_ALLOWED: (DiagnosticFactory1<(KtClass..KtClass?), (ClassDescriptor..ClassDescriptor?)>..DiagnosticFactory1<(KtClass..KtClass?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [426:62] ==> @NotNull public open fun on(@NotNull element: KtClass, @NotNull argument: ClassDescriptor): ParametrizedDiagnostic<(KtClass..KtClass?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'aClass' @ [426:65] ==> value-parameter aClass: KtClass defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkClassButNotObject[ValueParameterDescriptorImpl]

'classDescriptor' @ [426:73] ==> value-parameter classDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkClassButNotObject[ValueParameterDescriptorImpl]

'classDescriptor' @ [429:13] ==> value-parameter classDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkClassButNotObject[ValueParameterDescriptorImpl]

'kind' @ [429:29] ==> public final val ClassDescriptorWithResolutionScopes.kind: ClassKind[MyPropertyDescriptor]

'ANNOTATION_CLASS' @ [429:47] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'checkAnnotationClassWithBody' @ [430:17] ==> private final fun checkAnnotationClassWithBody(classOrObject: KtClassOrObject): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'aClass' @ [430:46] ==> value-parameter aClass: KtClass defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkClassButNotObject[ValueParameterDescriptorImpl]

'checkValOnAnnotationParameter' @ [431:17] ==> private final fun checkValOnAnnotationParameter(aClass: KtClass): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'aClass' @ [431:47] ==> value-parameter aClass: KtClass defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkClassButNotObject[ValueParameterDescriptorImpl]

'aClass' @ [433:13] ==> value-parameter aClass: KtClass defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkClassButNotObject[ValueParameterDescriptorImpl]

'checkEnumEntry' @ [433:38] ==> private final fun checkEnumEntry(enumEntry: KtEnumEntry, enumEntryClass: ClassDescriptor): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'aClass' @ [433:53] ==> value-parameter aClass: KtClass defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkClassButNotObject[ValueParameterDescriptorImpl]

'classDescriptor' @ [433:61] ==> value-parameter classDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkClassButNotObject[ValueParameterDescriptorImpl]

'classDescriptor' @ [438:34] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPrimaryConstructor[ValueParameterDescriptorImpl]

'unsubstitutedPrimaryConstructor' @ [438:50] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'classOrObject' @ [439:27] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPrimaryConstructor[ValueParameterDescriptorImpl]

'primaryConstructor' @ [439:41] ==> public final val KtClassOrObject.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'declaration' @ [441:27] ==> val declaration: KtPrimaryConstructor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPrimaryConstructor[LocalVariableDescriptor]

'valueParameters' @ [441:39] ==> public final val KtPrimaryConstructor.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'trace' @ [442:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'get' @ [442:19] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(PsiElement..PsiElement?), (PropertyDescriptor..PropertyDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (PropertyDescriptor..PropertyDescriptor?)>?), key: (PsiElement..PsiElement?)): PropertyDescriptor? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> PropertyDescriptor

'PRIMARY_CONSTRUCTOR_PARAMETER' @ [442:38] ==> public final val PRIMARY_CONSTRUCTOR_PARAMETER: (WritableSlice<(PsiElement..PsiElement?), (PropertyDescriptor..PropertyDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (PropertyDescriptor..PropertyDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'parameter' @ [442:69] ==> val parameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPrimaryConstructor[LocalVariableDescriptor]

'let' @ [442:81] ==> @InlineOnly public inline fun <T, R> PropertyDescriptor.let(block: (PropertyDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor
    <R> -> Unit

'modifiersChecker' @ [443:17] ==> private final val modifiersChecker: ModifiersChecker.ModifiersCheckingProcedure defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkModifiersForDeclaration' @ [443:34] ==> public open fun checkModifiersForDeclaration(@NotNull modifierListOwner: KtDeclaration, @NotNull descriptor: MemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.ModifiersChecker.ModifiersCheckingProcedure[JavaMethodDescriptor]

'parameter' @ [443:63] ==> val parameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPrimaryConstructor[LocalVariableDescriptor]

'it' @ [443:74] ==> value-parameter it: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPrimaryConstructor.<anonymous>[ValueParameterDescriptorImpl]

'checkPropertyLateInit' @ [444:17] ==> private final fun checkPropertyLateInit(property: KtCallableDeclaration, propertyDescriptor: PropertyDescriptor): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'parameter' @ [444:39] ==> val parameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPrimaryConstructor[LocalVariableDescriptor]

'it' @ [444:50] ==> value-parameter it: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPrimaryConstructor.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [448:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [448:14] ==> val declaration: KtPrimaryConstructor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPrimaryConstructor[LocalVariableDescriptor]

'hasConstructorKeyword' @ [448:26] ==> public final fun hasConstructorKeyword(): Boolean defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[SimpleFunctionDescriptorImpl]

'declaration' @ [449:13] ==> val declaration: KtPrimaryConstructor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPrimaryConstructor[LocalVariableDescriptor]

'modifierList' @ [449:25] ==> public final val KtPrimaryConstructor.modifierList: KtModifierList?[MyPropertyDescriptor]

'let' @ [449:39] ==> @InlineOnly public inline fun <T, R> KtModifierList.let(block: (KtModifierList) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtModifierList
    <R> -> Unit

'trace' @ [449:45] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [449:51] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'MISSING_CONSTRUCTOR_KEYWORD' @ [449:58] ==> public final val MISSING_CONSTRUCTOR_KEYWORD: (DiagnosticFactory0<(KtElement..KtElement?)>..DiagnosticFactory0<(KtElement..KtElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [449:86] ==> @NotNull public open fun on(@NotNull element: KtElement): SimpleDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'it' @ [449:89] ==> value-parameter it: KtModifierList defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPrimaryConstructor.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [452:13] ==> val declaration: KtPrimaryConstructor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPrimaryConstructor[LocalVariableDescriptor]

'valueParameterList' @ [452:25] ==> public final val KtPrimaryConstructor.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'declaration' @ [453:13] ==> val declaration: KtPrimaryConstructor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPrimaryConstructor[LocalVariableDescriptor]

'getConstructorKeyword' @ [453:25] ==> public open fun getConstructorKeyword(): PsiElement? defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[SimpleFunctionDescriptorImpl]

'let' @ [453:50] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Unit

'trace' @ [453:56] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [453:62] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'MISSING_CONSTRUCTOR_BRACKETS' @ [453:69] ==> public final val MISSING_CONSTRUCTOR_BRACKETS: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [453:98] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'it' @ [453:101] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPrimaryConstructor.<anonymous>[ValueParameterDescriptorImpl]

'classOrObject' @ [456:13] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPrimaryConstructor[ValueParameterDescriptorImpl]

'trace' @ [457:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [457:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'CONSTRUCTOR_IN_OBJECT' @ [457:26] ==> public final val CONSTRUCTOR_IN_OBJECT: (DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>..DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [457:48] ==> @NotNull public open fun on(@NotNull element: KtDeclaration): SimpleDiagnostic<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'declaration' @ [457:51] ==> val declaration: KtPrimaryConstructor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPrimaryConstructor[LocalVariableDescriptor]

'checkConstructorDeclaration' @ [460:9] ==> private final fun checkConstructorDeclaration(constructorDescriptor: ClassConstructorDescriptor, declaration: KtConstructor<*>): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'primaryConstructor' @ [460:37] ==> val primaryConstructor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPrimaryConstructor[LocalVariableDescriptor]

'declaration' @ [460:57] ==> val declaration: KtPrimaryConstructor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPrimaryConstructor[LocalVariableDescriptor]

'typeParameterListOwner' @ [465:34] ==> value-parameter typeParameterListOwner: KtTypeParameterListOwner defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeParameters[ValueParameterDescriptorImpl]

'typeParameters' @ [465:57] ==> public final val KtTypeParameterListOwner.typeParameters: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>)[MyPropertyDescriptor]

'reportUnsupportedAnnotationForTypeParameter' @ [466:36] ==> public open fun reportUnsupportedAnnotationForTypeParameter(@NotNull jetTypeParameter: KtTypeParameter, @NotNull trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.AnnotationResolverImpl[JavaMethodDescriptor]

'jetTypeParameter' @ [466:80] ==> val jetTypeParameter: (KtTypeParameter..KtTypeParameter?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeParameters[LocalVariableDescriptor]

'trace' @ [466:98] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'trace' @ [468:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'get' @ [468:19] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtTypeParameter..KtTypeParameter?), (TypeParameterDescriptor..TypeParameterDescriptor?)>..ReadOnlySlice<(KtTypeParameter..KtTypeParameter?), (TypeParameterDescriptor..TypeParameterDescriptor?)>?), key: (KtTypeParameter..KtTypeParameter?)): TypeParameterDescriptor? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtTypeParameter
    <V : (Any..Any?)> -> TypeParameterDescriptor

'TYPE_PARAMETER' @ [468:23] ==> public final val TYPE_PARAMETER: (WritableSlice<(KtTypeParameter..KtTypeParameter?), (TypeParameterDescriptor..TypeParameterDescriptor?)>..WritableSlice<(KtTypeParameter..KtTypeParameter?), (TypeParameterDescriptor..TypeParameterDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'jetTypeParameter' @ [468:39] ==> val jetTypeParameter: (KtTypeParameter..KtTypeParameter?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeParameters[LocalVariableDescriptor]

'let' @ [468:58] ==> @InlineOnly public inline fun <T, R> TypeParameterDescriptor.let(block: (TypeParameterDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor
    <R> -> Unit

'checkConflictingUpperBounds' @ [468:83] ==> public open fun checkConflictingUpperBounds(@NotNull trace: BindingTrace, @NotNull parameter: TypeParameterDescriptor, @NotNull typeParameter: KtTypeParameter): Unit defined in org.jetbrains.kotlin.resolve.DescriptorResolver[JavaMethodDescriptor]

'trace' @ [468:111] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'it' @ [468:118] ==> value-parameter it: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeParameters.<anonymous>[ValueParameterDescriptorImpl]

'jetTypeParameter' @ [468:122] ==> val jetTypeParameter: (KtTypeParameter..KtTypeParameter?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeParameters[LocalVariableDescriptor]

'typeParameterListOwner' @ [473:27] ==> value-parameter typeParameterListOwner: KtTypeParameterListOwner defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeParameterConstraints[ValueParameterDescriptorImpl]

'typeConstraints' @ [473:50] ==> public final val KtTypeParameterListOwner.typeConstraints: (MutableList<(KtTypeConstraint..KtTypeConstraint?)>..List<(KtTypeConstraint..KtTypeConstraint?)>)[MyPropertyDescriptor]

'constraints' @ [474:13] ==> val constraints: (MutableList<(KtTypeConstraint..KtTypeConstraint?)>..List<(KtTypeConstraint..KtTypeConstraint?)>) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeParameterConstraints[LocalVariableDescriptor]

'isEmpty' @ [474:25] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'typeParameterListOwner' @ [476:31] ==> value-parameter typeParameterListOwner: KtTypeParameterListOwner defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeParameterConstraints[ValueParameterDescriptorImpl]

'typeParameters' @ [476:54] ==> public final val KtTypeParameterListOwner.typeParameters: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>)[MyPropertyDescriptor]

'typeParameter' @ [477:17] ==> val typeParameter: (KtTypeParameter..KtTypeParameter?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeParameterConstraints[LocalVariableDescriptor]

'extendsBound' @ [477:31] ==> public final var KtTypeParameter.extendsBound: KtTypeReference?[MyPropertyDescriptor]

'hasConstraints' @ [477:55] ==> private final fun hasConstraints(typeParameter: KtTypeParameter, constraints: List<KtTypeConstraint>): Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion[SimpleFunctionDescriptorImpl]

'typeParameter' @ [477:70] ==> val typeParameter: (KtTypeParameter..KtTypeParameter?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeParameterConstraints[LocalVariableDescriptor]

'constraints' @ [477:85] ==> val constraints: (MutableList<(KtTypeConstraint..KtTypeConstraint?)>..List<(KtTypeConstraint..KtTypeConstraint?)>) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeParameterConstraints[LocalVariableDescriptor]

'trace' @ [478:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [478:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'MISPLACED_TYPE_PARAMETER_CONSTRAINTS' @ [478:30] ==> public final val MISPLACED_TYPE_PARAMETER_CONSTRAINTS: (DiagnosticFactory0<(KtTypeParameter..KtTypeParameter?)>..DiagnosticFactory0<(KtTypeParameter..KtTypeParameter?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [478:67] ==> @NotNull public open fun on(@NotNull element: KtTypeParameter): SimpleDiagnostic<(KtTypeParameter..KtTypeParameter?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'typeParameter' @ [478:70] ==> val typeParameter: (KtTypeParameter..KtTypeParameter?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeParameterConstraints[LocalVariableDescriptor]

'trace' @ [480:43] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'get' @ [480:49] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtTypeParameter..KtTypeParameter?), (TypeParameterDescriptor..TypeParameterDescriptor?)>..ReadOnlySlice<(KtTypeParameter..KtTypeParameter?), (TypeParameterDescriptor..TypeParameterDescriptor?)>?), key: (KtTypeParameter..KtTypeParameter?)): TypeParameterDescriptor? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtTypeParameter
    <V : (Any..Any?)> -> TypeParameterDescriptor

'TYPE_PARAMETER' @ [480:53] ==> public final val TYPE_PARAMETER: (WritableSlice<(KtTypeParameter..KtTypeParameter?), (TypeParameterDescriptor..TypeParameterDescriptor?)>..WritableSlice<(KtTypeParameter..KtTypeParameter?), (TypeParameterDescriptor..TypeParameterDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'typeParameter' @ [480:69] ==> val typeParameter: (KtTypeParameter..KtTypeParameter?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeParameterConstraints[LocalVariableDescriptor]

'checkSupertypesForConsistency' @ [481:13] ==> private final fun checkSupertypesForConsistency(classifier: ClassifierDescriptor, sourceElement: PsiElement): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'typeParameterDescriptor' @ [481:43] ==> val typeParameterDescriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeParameterConstraints[LocalVariableDescriptor]

'typeParameter' @ [481:68] ==> val typeParameter: (KtTypeParameter..KtTypeParameter?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeParameterConstraints[LocalVariableDescriptor]

'checkOnlyOneTypeParameterBound' @ [482:13] ==> private final fun checkOnlyOneTypeParameterBound(descriptor: TypeParameterDescriptor, declaration: KtTypeParameter, owner: KtTypeParameterListOwner): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'typeParameterDescriptor' @ [482:44] ==> val typeParameterDescriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeParameterConstraints[LocalVariableDescriptor]

'typeParameter' @ [482:69] ==> val typeParameter: (KtTypeParameter..KtTypeParameter?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeParameterConstraints[LocalVariableDescriptor]

'typeParameterListOwner' @ [482:84] ==> value-parameter typeParameterListOwner: KtTypeParameterListOwner defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkTypeParameterConstraints[ValueParameterDescriptorImpl]

'klass' @ [487:9] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkConstructorInInterface[ValueParameterDescriptorImpl]

'primaryConstructor' @ [487:15] ==> public final val KtClass.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'let' @ [487:35] ==> @InlineOnly public inline fun <T, R> KtPrimaryConstructor.let(block: (KtPrimaryConstructor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtPrimaryConstructor
    <R> -> Unit

'trace' @ [487:41] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [487:47] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'CONSTRUCTOR_IN_INTERFACE' @ [487:54] ==> public final val CONSTRUCTOR_IN_INTERFACE: (DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>..DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [487:79] ==> @NotNull public open fun on(@NotNull element: KtDeclaration): SimpleDiagnostic<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'it' @ [487:82] ==> value-parameter it: KtPrimaryConstructor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkConstructorInInterface.<anonymous>[ValueParameterDescriptorImpl]

'classDescriptor' @ [491:40] ==> value-parameter classDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMethodsOfAnyInInterface[ValueParameterDescriptorImpl]

'declaredCallableMembers' @ [491:56] ==> public final val ClassDescriptorWithResolutionScopes.declaredCallableMembers: Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>[MyPropertyDescriptor]

'declaredCallableMember' @ [492:17] ==> val declaredCallableMember: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMethodsOfAnyInInterface[LocalVariableDescriptor]

'DescriptorToSourceUtils' @ [494:31] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [494:55] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'declaredCallableMember' @ [494:79] ==> val declaredCallableMember: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMethodsOfAnyInInterface[LocalVariableDescriptor]

'declaration' @ [495:17] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMethodsOfAnyInInterface[LocalVariableDescriptor]

'isHidingParentMemberIfPresent' @ [497:17] ==> private final fun isHidingParentMemberIfPresent(member: CallableMemberDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion[SimpleFunctionDescriptorImpl]

'declaredCallableMember' @ [497:47] ==> val declaredCallableMember: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMethodsOfAnyInInterface[LocalVariableDescriptor]

'isImplementingMethodOfAny' @ [499:17] ==> private final fun isImplementingMethodOfAny(member: CallableMemberDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion[SimpleFunctionDescriptorImpl]

'declaredCallableMember' @ [499:43] ==> val declaredCallableMember: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMethodsOfAnyInInterface[LocalVariableDescriptor]

'trace' @ [500:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [500:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'METHOD_OF_ANY_IMPLEMENTED_IN_INTERFACE' @ [500:30] ==> public final val METHOD_OF_ANY_IMPLEMENTED_IN_INTERFACE: (DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>..DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [500:69] ==> @NotNull public open fun on(@NotNull element: KtDeclaration): SimpleDiagnostic<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'declaration' @ [500:72] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMethodsOfAnyInInterface[LocalVariableDescriptor]

'classOrObject' @ [506:9] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAnnotationClassWithBody[ValueParameterDescriptorImpl]

'getBody' @ [506:23] ==> public final fun getBody(): KtClassBody? defined in org.jetbrains.kotlin.psi.KtClassOrObject[SimpleFunctionDescriptorImpl]

'let' @ [506:34] ==> @InlineOnly public inline fun <T, R> KtClassBody.let(block: (KtClassBody) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassBody
    <R> -> Unit

'trace' @ [506:40] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [506:46] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'ANNOTATION_CLASS_WITH_BODY' @ [506:53] ==> public final val ANNOTATION_CLASS_WITH_BODY: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [506:80] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'it' @ [506:83] ==> value-parameter it: KtClassBody defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAnnotationClassWithBody.<anonymous>[ValueParameterDescriptorImpl]

'aClass' @ [510:27] ==> value-parameter aClass: KtClass defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkValOnAnnotationParameter[ValueParameterDescriptorImpl]

'primaryConstructorParameters' @ [510:34] ==> public final val KtClass.primaryConstructorParameters: List<KtParameter>[MyPropertyDescriptor]

'if (!parameter.hasValOrVar()) {
                trace.report(MISSING_VAL_ON_ANNOTATION_PARAMETER.on(parameter))
            }
            else if (parameter.isMutable) {
                trace.report(VAR_ANNOTATION_PARAMETER.on(parameter))
            }' @ [511:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [511:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parameter' @ [511:18] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkValOnAnnotationParameter[LocalVariableDescriptor]

'hasValOrVar' @ [511:28] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'trace' @ [512:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [512:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'MISSING_VAL_ON_ANNOTATION_PARAMETER' @ [512:30] ==> public final val MISSING_VAL_ON_ANNOTATION_PARAMETER: (DiagnosticFactory0<(KtParameter..KtParameter?)>..DiagnosticFactory0<(KtParameter..KtParameter?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [512:66] ==> @NotNull public open fun on(@NotNull element: KtParameter): SimpleDiagnostic<(KtParameter..KtParameter?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'parameter' @ [512:69] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkValOnAnnotationParameter[LocalVariableDescriptor]

'parameter' @ [514:22] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkValOnAnnotationParameter[LocalVariableDescriptor]

'isMutable' @ [514:32] ==> public final val KtParameter.isMutable: Boolean[MyPropertyDescriptor]

'trace' @ [515:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [515:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'VAR_ANNOTATION_PARAMETER' @ [515:30] ==> public final val VAR_ANNOTATION_PARAMETER: (DiagnosticFactory0<(KtParameter..KtParameter?)>..DiagnosticFactory0<(KtParameter..KtParameter?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [515:55] ==> @NotNull public open fun on(@NotNull element: KtParameter): SimpleDiagnostic<(KtParameter..KtParameter?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'parameter' @ [515:58] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkValOnAnnotationParameter[LocalVariableDescriptor]

'classCanHaveOpenMembers' @ [521:13] ==> public open fun classCanHaveOpenMembers(@NotNull p0: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [521:37] ==> value-parameter classDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOpenMembers[ValueParameterDescriptorImpl]

'classDescriptor' @ [523:34] ==> value-parameter classDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOpenMembers[ValueParameterDescriptorImpl]

'declaredCallableMembers' @ [523:50] ==> public final val ClassDescriptorWithResolutionScopes.declaredCallableMembers: Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>[MyPropertyDescriptor]

'memberDescriptor' @ [524:17] ==> val memberDescriptor: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOpenMembers[LocalVariableDescriptor]

'kind' @ [524:34] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'DECLARATION' @ [524:72] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'DescriptorToSourceUtils' @ [525:26] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [525:50] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'memberDescriptor' @ [525:74] ==> val memberDescriptor: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOpenMembers[LocalVariableDescriptor]

'member' @ [526:17] ==> val member: KtNamedDeclaration? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOpenMembers[LocalVariableDescriptor]

'member' @ [526:35] ==> val member: KtNamedDeclaration? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOpenMembers[LocalVariableDescriptor]

'hasModifier' @ [526:42] ==> public abstract fun hasModifier(@NotNull modifier: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'OPEN_KEYWORD' @ [526:63] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (classDescriptor.kind == ClassKind.OBJECT) {
                    trace.report(NON_FINAL_MEMBER_IN_OBJECT.on(member))
                }
                else {
                    trace.report(NON_FINAL_MEMBER_IN_FINAL_CLASS.on(member))
                }' @ [527:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'classDescriptor' @ [527:21] ==> value-parameter classDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOpenMembers[ValueParameterDescriptorImpl]

'kind' @ [527:37] ==> public final val ClassDescriptorWithResolutionScopes.kind: ClassKind[MyPropertyDescriptor]

'OBJECT' @ [527:55] ==> enum entry OBJECT defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'trace' @ [528:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [528:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NON_FINAL_MEMBER_IN_OBJECT' @ [528:34] ==> public final val NON_FINAL_MEMBER_IN_OBJECT: (DiagnosticFactory0<(KtNamedDeclaration..KtNamedDeclaration?)>..DiagnosticFactory0<(KtNamedDeclaration..KtNamedDeclaration?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [528:61] ==> @NotNull public open fun on(@NotNull element: KtNamedDeclaration): SimpleDiagnostic<(KtNamedDeclaration..KtNamedDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'member' @ [528:64] ==> val member: KtNamedDeclaration? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOpenMembers[LocalVariableDescriptor]

'trace' @ [531:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [531:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NON_FINAL_MEMBER_IN_FINAL_CLASS' @ [531:34] ==> public final val NON_FINAL_MEMBER_IN_FINAL_CLASS: (DiagnosticFactory0<(KtNamedDeclaration..KtNamedDeclaration?)>..DiagnosticFactory0<(KtNamedDeclaration..KtNamedDeclaration?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [531:66] ==> @NotNull public open fun on(@NotNull element: KtNamedDeclaration): SimpleDiagnostic<(KtNamedDeclaration..KtNamedDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'member' @ [531:69] ==> val member: KtNamedDeclaration? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkOpenMembers[LocalVariableDescriptor]

'propertyDescriptor' @ [538:37] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkProperty[ValueParameterDescriptorImpl]

'containingDeclaration' @ [538:56] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'containingDeclaration' @ [539:13] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkProperty[LocalVariableDescriptor]

'checkMemberProperty' @ [540:13] ==> private final fun checkMemberProperty(property: KtProperty, propertyDescriptor: PropertyDescriptor, classDescriptor: ClassDescriptor): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'property' @ [540:33] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkProperty[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [540:43] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkProperty[ValueParameterDescriptorImpl]

'containingDeclaration' @ [540:63] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkProperty[LocalVariableDescriptor]

'checkPropertyLateInit' @ [542:9] ==> private final fun checkPropertyLateInit(property: KtCallableDeclaration, propertyDescriptor: PropertyDescriptor): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'property' @ [542:31] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkProperty[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [542:41] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkProperty[ValueParameterDescriptorImpl]

'checkPropertyInitializer' @ [543:9] ==> private final fun checkPropertyInitializer(property: KtProperty, propertyDescriptor: PropertyDescriptor): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'property' @ [543:34] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkProperty[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [543:44] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkProperty[ValueParameterDescriptorImpl]

'checkAccessors' @ [544:9] ==> private final fun checkAccessors(property: KtProperty, propertyDescriptor: PropertyDescriptor): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'property' @ [544:24] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkProperty[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [544:34] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkProperty[ValueParameterDescriptorImpl]

'checkTypeParameterConstraints' @ [545:9] ==> private final fun checkTypeParameterConstraints(typeParameterListOwner: KtTypeParameterListOwner): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'property' @ [545:39] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkProperty[ValueParameterDescriptorImpl]

'exposedChecker' @ [546:9] ==> private final val exposedChecker: ExposedVisibilityChecker defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkProperty' @ [546:24] ==> public final fun checkProperty(property: KtProperty, propertyDescriptor: PropertyDescriptor, visibility: Visibility = ...): Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker[SimpleFunctionDescriptorImpl]

'property' @ [546:38] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkProperty[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [546:48] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkProperty[ValueParameterDescriptorImpl]

'shadowedExtensionChecker' @ [547:9] ==> private final val shadowedExtensionChecker: ShadowedExtensionChecker defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkDeclaration' @ [547:34] ==> public final fun checkDeclaration(declaration: KtDeclaration, descriptor: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker[SimpleFunctionDescriptorImpl]

'property' @ [547:51] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkProperty[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [547:61] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkProperty[ValueParameterDescriptorImpl]

'checkPropertyTypeParametersAreUsedInReceiverType' @ [548:9] ==> private final fun checkPropertyTypeParametersAreUsedInReceiverType(descriptor: PropertyDescriptor): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'propertyDescriptor' @ [548:58] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkProperty[ValueParameterDescriptorImpl]

'checkImplicitCallableType' @ [549:9] ==> private final fun checkImplicitCallableType(declaration: KtCallableDeclaration, descriptor: CallableDescriptor): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'property' @ [549:35] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkProperty[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [549:45] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkProperty[ValueParameterDescriptorImpl]

'descriptor' @ [553:33] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyTypeParametersAreUsedInReceiverType[ValueParameterDescriptorImpl]

'typeParameters' @ [553:44] ==> public final val PropertyDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'toSet' @ [553:59] ==> public fun <T> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.toSet(): Set<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'HashSet' @ [554:43] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TypeParameterDescriptor

'contains' @ [557:23] ==> public open fun contains(@Nullable p0: KotlinType?, @NotNull p1: ((UnwrappedType..UnwrappedType?)) -> (Boolean..Boolean?)): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'type' @ [557:32] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyTypeParametersAreUsedInReceiverType.addAccessibleTypeParametersFromType[ValueParameterDescriptorImpl]

'it' @ [558:45] ==> value-parameter it: (UnwrappedType..UnwrappedType?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyTypeParametersAreUsedInReceiverType.addAccessibleTypeParametersFromType.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [558:48] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [558:60] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'declarationDescriptor' @ [559:21] ==> val declarationDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyTypeParametersAreUsedInReceiverType.addAccessibleTypeParametersFromType.<anonymous>[LocalVariableDescriptor]

'declarationDescriptor' @ [559:73] ==> val declarationDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyTypeParametersAreUsedInReceiverType.addAccessibleTypeParametersFromType.<anonymous>[LocalVariableDescriptor]

'allTypeParameters' @ [559:98] ==> val allTypeParameters: Set<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyTypeParametersAreUsedInReceiverType[LocalVariableDescriptor]

'allAccessibleTypeParameters' @ [560:25] ==> val allAccessibleTypeParameters: HashSet<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyTypeParametersAreUsedInReceiverType[LocalVariableDescriptor]

'add' @ [560:53] ==> public open fun add(element: TypeParameterDescriptor): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'declarationDescriptor' @ [560:57] ==> val declarationDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyTypeParametersAreUsedInReceiverType.addAccessibleTypeParametersFromType.<anonymous>[LocalVariableDescriptor]

'declarationDescriptor' @ [561:25] ==> val declarationDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyTypeParametersAreUsedInReceiverType.addAccessibleTypeParametersFromType.<anonymous>[LocalVariableDescriptor]

'upperBounds' @ [561:47] ==> public final val TypeParameterDescriptor.upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)[MyPropertyDescriptor]

'forEach' @ [561:59] ==> @HidesMembers public inline fun <T> Iterable<(KotlinType..KotlinType?)>.forEach(action: ((KotlinType..KotlinType?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'addAccessibleTypeParametersFromType' @ [567:9] ==> local final fun addAccessibleTypeParametersFromType(type: KotlinType?): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyTypeParametersAreUsedInReceiverType[SimpleFunctionDescriptorImpl]

'descriptor' @ [567:45] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyTypeParametersAreUsedInReceiverType[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [567:56] ==> public final val PropertyDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [567:84] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'allTypeParameters' @ [569:54] ==> val allTypeParameters: Set<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyTypeParametersAreUsedInReceiverType[LocalVariableDescriptor]

'allAccessibleTypeParameters' @ [569:74] ==> val allAccessibleTypeParameters: HashSet<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyTypeParametersAreUsedInReceiverType[LocalVariableDescriptor]

'typeParametersInaccessibleFromReceiver' @ [570:31] ==> val typeParametersInaccessibleFromReceiver: Set<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyTypeParametersAreUsedInReceiverType[LocalVariableDescriptor]

'DescriptorToSourceUtils' @ [571:36] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'getSourceFromDescriptor' @ [571:60] ==> @JvmStatic public final fun getSourceFromDescriptor(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'typeParameter' @ [571:84] ==> val typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyTypeParametersAreUsedInReceiverType[LocalVariableDescriptor]

'typeParameterPsi' @ [572:17] ==> val typeParameterPsi: PsiElement? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyTypeParametersAreUsedInReceiverType[LocalVariableDescriptor]

'trace' @ [573:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [573:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'TYPE_PARAMETER_OF_PROPERTY_NOT_USED_IN_RECEIVER' @ [573:30] ==> public final val TYPE_PARAMETER_OF_PROPERTY_NOT_USED_IN_RECEIVER: (DiagnosticFactory0<(KtTypeParameter..KtTypeParameter?)>..DiagnosticFactory0<(KtTypeParameter..KtTypeParameter?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [573:78] ==> @NotNull public open fun on(@NotNull element: KtTypeParameter): SimpleDiagnostic<(KtTypeParameter..KtTypeParameter?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'typeParameterPsi' @ [573:81] ==> val typeParameterPsi: PsiElement? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyTypeParametersAreUsedInReceiverType[LocalVariableDescriptor]

'property' @ [579:28] ==> value-parameter property: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[ValueParameterDescriptorImpl]

'modifierList' @ [579:37] ==> public final val KtCallableDeclaration.modifierList: KtModifierList?[MyPropertyDescriptor]

'modifierList' @ [580:24] ==> val modifierList: KtModifierList defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[LocalVariableDescriptor]

'getModifier' @ [580:37] ==> @Nullable public open fun getModifier(@NotNull tokenType: KtModifierKeywordToken): PsiElement? defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'LATEINIT_KEYWORD' @ [580:58] ==> public final val LATEINIT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'!' @ [582:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'propertyDescriptor' @ [582:14] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[ValueParameterDescriptorImpl]

'isVar' @ [582:33] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'trace' @ [583:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [583:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INAPPLICABLE_LATEINIT_MODIFIER' @ [583:26] ==> public final val INAPPLICABLE_LATEINIT_MODIFIER: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [583:57] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'modifier' @ [583:60] ==> val modifier: PsiElement defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[LocalVariableDescriptor]

'propertyDescriptor' @ [589:26] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[ValueParameterDescriptorImpl]

'returnType' @ [589:45] ==> public final val PropertyDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'returnType' @ [590:13] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[LocalVariableDescriptor]

'returnTypeIsNullable' @ [591:13] ==> var returnTypeIsNullable: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[LocalVariableDescriptor]

'isNullableType' @ [591:46] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'returnType' @ [591:61] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[LocalVariableDescriptor]

'returnTypeIsPrimitive' @ [592:13] ==> var returnTypeIsPrimitive: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[LocalVariableDescriptor]

'isPrimitiveType' @ [592:52] ==> public open fun isPrimitiveType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'returnType' @ [592:68] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[LocalVariableDescriptor]

'returnTypeIsNullable' @ [595:13] ==> var returnTypeIsNullable: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[LocalVariableDescriptor]

'trace' @ [596:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [596:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INAPPLICABLE_LATEINIT_MODIFIER' @ [596:26] ==> public final val INAPPLICABLE_LATEINIT_MODIFIER: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [596:57] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'modifier' @ [596:60] ==> val modifier: PsiElement defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[LocalVariableDescriptor]

'returnTypeIsPrimitive' @ [599:13] ==> var returnTypeIsPrimitive: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[LocalVariableDescriptor]

'trace' @ [600:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [600:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INAPPLICABLE_LATEINIT_MODIFIER' @ [600:26] ==> public final val INAPPLICABLE_LATEINIT_MODIFIER: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [600:57] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'modifier' @ [600:60] ==> val modifier: PsiElement defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[LocalVariableDescriptor]

'propertyDescriptor' @ [603:26] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[ValueParameterDescriptorImpl]

'modality' @ [603:45] ==> public final val PropertyDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [603:57] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [603:66] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'isAbstract' @ [604:13] ==> val isAbstract: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[LocalVariableDescriptor]

'trace' @ [605:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [605:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INAPPLICABLE_LATEINIT_MODIFIER' @ [605:26] ==> public final val INAPPLICABLE_LATEINIT_MODIFIER: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [605:57] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'modifier' @ [605:60] ==> val modifier: PsiElement defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[LocalVariableDescriptor]

'property' @ [608:13] ==> value-parameter property: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[ValueParameterDescriptorImpl]

'trace' @ [609:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [609:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INAPPLICABLE_LATEINIT_MODIFIER' @ [609:26] ==> public final val INAPPLICABLE_LATEINIT_MODIFIER: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [609:57] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'modifier' @ [609:60] ==> val modifier: PsiElement defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[LocalVariableDescriptor]

'property' @ [613:13] ==> value-parameter property: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[ValueParameterDescriptorImpl]

'property' @ [613:39] ==> value-parameter property: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[ValueParameterDescriptorImpl]

'hasDelegateExpressionOrInitializer' @ [613:48] ==> public open fun hasDelegateExpressionOrInitializer(): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'hasDelegateExpressionOrInitializer' @ [614:13] ==> var hasDelegateExpressionOrInitializer: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[LocalVariableDescriptor]

'trace' @ [615:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [615:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INAPPLICABLE_LATEINIT_MODIFIER' @ [615:26] ==> public final val INAPPLICABLE_LATEINIT_MODIFIER: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [615:57] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'modifier' @ [615:60] ==> val modifier: PsiElement defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[LocalVariableDescriptor]

'propertyDescriptor' @ [619:41] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[ValueParameterDescriptorImpl]

'hasAccessorImplementation' @ [619:60] ==> private final fun PropertyDescriptor.hasAccessorImplementation(): Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion[SimpleFunctionDescriptorImpl]

'!' @ [621:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasDelegateExpressionOrInitializer' @ [621:14] ==> var hasDelegateExpressionOrInitializer: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[LocalVariableDescriptor]

'hasAccessorImplementation' @ [621:52] ==> val hasAccessorImplementation: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[LocalVariableDescriptor]

'trace' @ [622:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [622:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INAPPLICABLE_LATEINIT_MODIFIER' @ [622:26] ==> public final val INAPPLICABLE_LATEINIT_MODIFIER: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [622:57] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'modifier' @ [622:60] ==> val modifier: PsiElement defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[LocalVariableDescriptor]

'trace' @ [625:31] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'bindingContext' @ [625:37] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'get' @ [625:52] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..ReadOnlySlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?), key: (PropertyDescriptor..PropertyDescriptor?)): Boolean? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PropertyDescriptor
    <V : (Any..Any?)> -> Boolean

'BACKING_FIELD_REQUIRED' @ [625:71] ==> public final val BACKING_FIELD_REQUIRED: (WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'propertyDescriptor' @ [625:95] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[ValueParameterDescriptorImpl]

'!' @ [627:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAbstract' @ [627:14] ==> val isAbstract: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[LocalVariableDescriptor]

'!' @ [627:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasAccessorImplementation' @ [627:29] ==> val hasAccessorImplementation: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[LocalVariableDescriptor]

'!' @ [627:58] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasDelegateExpressionOrInitializer' @ [627:59] ==> var hasDelegateExpressionOrInitializer: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[LocalVariableDescriptor]

'!' @ [627:97] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasBackingField' @ [627:98] ==> val hasBackingField: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[LocalVariableDescriptor]

'trace' @ [628:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [628:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INAPPLICABLE_LATEINIT_MODIFIER' @ [628:26] ==> public final val INAPPLICABLE_LATEINIT_MODIFIER: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [628:57] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'modifier' @ [628:60] ==> val modifier: PsiElement defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[LocalVariableDescriptor]

'propertyDescriptor' @ [631:13] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [631:32] ==> public final val PropertyDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'trace' @ [632:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [632:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INAPPLICABLE_LATEINIT_MODIFIER' @ [632:26] ==> public final val INAPPLICABLE_LATEINIT_MODIFIER: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [632:57] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'modifier' @ [632:60] ==> val modifier: PsiElement defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyLateInit[LocalVariableDescriptor]

'property' @ [640:28] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMemberProperty[ValueParameterDescriptorImpl]

'modifierList' @ [640:37] ==> public final val KtProperty.modifierList: KtModifierList?[MyPropertyDescriptor]

'modifierList' @ [642:13] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMemberProperty[LocalVariableDescriptor]

'if (modifierList.hasModifier(KtTokens.ABSTRACT_KEYWORD)) {
                //has abstract modifier
                if (!classCanHaveAbstractMembers(classDescriptor)) {
                    trace.report(ABSTRACT_PROPERTY_IN_NON_ABSTRACT_CLASS.on(property, property.name ?: "", classDescriptor))
                    return
                }
            }
            else if (classDescriptor.kind == ClassKind.INTERFACE &&
                modifierList.hasModifier(KtTokens.OPEN_KEYWORD) &&
                propertyDescriptor.modality == Modality.ABSTRACT) {
                trace.report(REDUNDANT_OPEN_IN_INTERFACE.on(property))
            }' @ [643:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'modifierList' @ [643:17] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMemberProperty[LocalVariableDescriptor]

'hasModifier' @ [643:30] ==> public open fun hasModifier(@NotNull tokenType: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'ABSTRACT_KEYWORD' @ [643:51] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'!' @ [645:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'classCanHaveAbstractMembers' @ [645:22] ==> public open fun classCanHaveAbstractMembers(@NotNull p0: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [645:50] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMemberProperty[ValueParameterDescriptorImpl]

'trace' @ [646:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [646:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'ABSTRACT_PROPERTY_IN_NON_ABSTRACT_CLASS' @ [646:34] ==> public final val ABSTRACT_PROPERTY_IN_NON_ABSTRACT_CLASS: (DiagnosticFactory2<(KtModifierListOwner..KtModifierListOwner?), (String..String?), (ClassDescriptor..ClassDescriptor?)>..DiagnosticFactory2<(KtModifierListOwner..KtModifierListOwner?), (String..String?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [646:74] ==> @NotNull public open fun on(@NotNull element: KtModifierListOwner, @NotNull a: String, @NotNull b: ClassDescriptor): ParametrizedDiagnostic<(KtModifierListOwner..KtModifierListOwner?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'property' @ [646:77] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMemberProperty[ValueParameterDescriptorImpl]

'property' @ [646:87] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMemberProperty[ValueParameterDescriptorImpl]

'name' @ [646:96] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'classDescriptor' @ [646:108] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMemberProperty[ValueParameterDescriptorImpl]

'classDescriptor' @ [650:22] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMemberProperty[ValueParameterDescriptorImpl]

'kind' @ [650:38] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [650:56] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'modifierList' @ [651:17] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMemberProperty[LocalVariableDescriptor]

'hasModifier' @ [651:30] ==> public open fun hasModifier(@NotNull tokenType: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'OPEN_KEYWORD' @ [651:51] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'propertyDescriptor' @ [652:17] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMemberProperty[ValueParameterDescriptorImpl]

'modality' @ [652:36] ==> public final val PropertyDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [652:48] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [652:57] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'trace' @ [653:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [653:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'REDUNDANT_OPEN_IN_INTERFACE' @ [653:30] ==> public final val REDUNDANT_OPEN_IN_INTERFACE: (DiagnosticFactory0<(KtModifierListOwner..KtModifierListOwner?)>..DiagnosticFactory0<(KtModifierListOwner..KtModifierListOwner?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [653:58] ==> @NotNull public open fun on(@NotNull element: KtModifierListOwner): SimpleDiagnostic<(KtModifierListOwner..KtModifierListOwner?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'property' @ [653:61] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMemberProperty[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [657:13] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMemberProperty[ValueParameterDescriptorImpl]

'modality' @ [657:32] ==> public final val PropertyDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [657:44] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [657:53] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'property' @ [658:13] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMemberProperty[ValueParameterDescriptorImpl]

'initializer' @ [658:22] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'let' @ [658:35] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Unit

'trace' @ [658:41] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [658:47] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'ABSTRACT_PROPERTY_WITH_INITIALIZER' @ [658:54] ==> public final val ABSTRACT_PROPERTY_WITH_INITIALIZER: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [658:89] ==> @NotNull public open fun on(@NotNull element: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'it' @ [658:92] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMemberProperty.<anonymous>[ValueParameterDescriptorImpl]

'property' @ [659:13] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMemberProperty[ValueParameterDescriptorImpl]

'delegate' @ [659:22] ==> public final val KtProperty.delegate: KtPropertyDelegate?[MyPropertyDescriptor]

'let' @ [659:32] ==> @InlineOnly public inline fun <T, R> KtPropertyDelegate.let(block: (KtPropertyDelegate) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtPropertyDelegate
    <R> -> Unit

'trace' @ [659:38] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [659:44] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'ABSTRACT_DELEGATED_PROPERTY' @ [659:51] ==> public final val ABSTRACT_DELEGATED_PROPERTY: (DiagnosticFactory0<(KtPropertyDelegate..KtPropertyDelegate?)>..DiagnosticFactory0<(KtPropertyDelegate..KtPropertyDelegate?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [659:79] ==> @NotNull public open fun on(@NotNull element: KtPropertyDelegate): SimpleDiagnostic<(KtPropertyDelegate..KtPropertyDelegate?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'it' @ [659:82] ==> value-parameter it: KtPropertyDelegate defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMemberProperty.<anonymous>[ValueParameterDescriptorImpl]

'property' @ [660:26] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMemberProperty[ValueParameterDescriptorImpl]

'getter' @ [660:35] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'getter' @ [661:17] ==> val getter: KtPropertyAccessor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMemberProperty[LocalVariableDescriptor]

'getter' @ [661:35] ==> val getter: KtPropertyAccessor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMemberProperty[LocalVariableDescriptor]

'hasBody' @ [661:42] ==> @Override public open fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtPropertyAccessor[JavaMethodDescriptor]

'trace' @ [662:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [662:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'ABSTRACT_PROPERTY_WITH_GETTER' @ [662:30] ==> public final val ABSTRACT_PROPERTY_WITH_GETTER: (DiagnosticFactory0<(KtPropertyAccessor..KtPropertyAccessor?)>..DiagnosticFactory0<(KtPropertyAccessor..KtPropertyAccessor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [662:60] ==> @NotNull public open fun on(@NotNull element: KtPropertyAccessor): SimpleDiagnostic<(KtPropertyAccessor..KtPropertyAccessor?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'getter' @ [662:63] ==> val getter: KtPropertyAccessor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMemberProperty[LocalVariableDescriptor]

'property' @ [664:26] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMemberProperty[ValueParameterDescriptorImpl]

'setter' @ [664:35] ==> public final val KtProperty.setter: KtPropertyAccessor?[MyPropertyDescriptor]

'setter' @ [665:17] ==> val setter: KtPropertyAccessor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMemberProperty[LocalVariableDescriptor]

'setter' @ [665:35] ==> val setter: KtPropertyAccessor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMemberProperty[LocalVariableDescriptor]

'hasBody' @ [665:42] ==> @Override public open fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtPropertyAccessor[JavaMethodDescriptor]

'trace' @ [666:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [666:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'ABSTRACT_PROPERTY_WITH_SETTER' @ [666:30] ==> public final val ABSTRACT_PROPERTY_WITH_SETTER: (DiagnosticFactory0<(KtPropertyAccessor..KtPropertyAccessor?)>..DiagnosticFactory0<(KtPropertyAccessor..KtPropertyAccessor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [666:60] ==> @NotNull public open fun on(@NotNull element: KtPropertyAccessor): SimpleDiagnostic<(KtPropertyAccessor..KtPropertyAccessor?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'setter' @ [666:63] ==> val setter: KtPropertyAccessor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkMemberProperty[LocalVariableDescriptor]

'propertyDescriptor' @ [672:41] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'hasAccessorImplementation' @ [672:60] ==> private final fun PropertyDescriptor.hasAccessorImplementation(): Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion[SimpleFunctionDescriptorImpl]

'propertyDescriptor' @ [674:37] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'containingDeclaration' @ [674:56] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'isInterface' @ [675:43] ==> public open fun isInterface(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'containingDeclaration' @ [675:55] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'propertyDescriptor' @ [676:13] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'modality' @ [676:32] ==> public final val PropertyDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [676:44] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [676:53] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'!' @ [677:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'property' @ [677:18] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'hasDelegateExpressionOrInitializer' @ [677:27] ==> public open fun hasDelegateExpressionOrInitializer(): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'property' @ [677:67] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'typeReference' @ [677:76] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'trace' @ [678:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [678:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'PROPERTY_WITH_NO_TYPE_NO_INITIALIZER' @ [678:30] ==> public final val PROPERTY_WITH_NO_TYPE_NO_INITIALIZER: (DiagnosticFactory0<(KtProperty..KtProperty?)>..DiagnosticFactory0<(KtProperty..KtProperty?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [678:67] ==> @NotNull public open fun on(@NotNull element: KtProperty): SimpleDiagnostic<(KtProperty..KtProperty?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'property' @ [678:70] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'inInterface' @ [680:17] ==> val inInterface: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'property' @ [680:32] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'hasModifier' @ [680:41] ==> @Override public open fun hasModifier(@NotNull modifier: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'PRIVATE_KEYWORD' @ [680:62] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'!' @ [680:82] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'property' @ [680:83] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'hasModifier' @ [680:92] ==> @Override public open fun hasModifier(@NotNull modifier: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'ABSTRACT_KEYWORD' @ [680:113] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'trace' @ [681:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [681:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'PRIVATE_PROPERTY_IN_INTERFACE' @ [681:30] ==> public final val PRIVATE_PROPERTY_IN_INTERFACE: (DiagnosticFactory0<(KtProperty..KtProperty?)>..DiagnosticFactory0<(KtProperty..KtProperty?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [681:60] ==> @NotNull public open fun on(@NotNull element: KtProperty): SimpleDiagnostic<(KtProperty..KtProperty?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'property' @ [681:63] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'trace' @ [686:36] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'bindingContext' @ [686:42] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'get' @ [686:57] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..ReadOnlySlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?), key: (PropertyDescriptor..PropertyDescriptor?)): Boolean? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PropertyDescriptor
    <V : (Any..Any?)> -> Boolean

'BACKING_FIELD_REQUIRED' @ [686:76] ==> public final val BACKING_FIELD_REQUIRED: (WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'propertyDescriptor' @ [686:100] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'inInterface' @ [687:13] ==> val inInterface: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'backingFieldRequired' @ [687:28] ==> val backingFieldRequired: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'hasAccessorImplementation' @ [687:52] ==> val hasAccessorImplementation: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'trace' @ [688:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [688:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'BACKING_FIELD_IN_INTERFACE' @ [688:26] ==> public final val BACKING_FIELD_IN_INTERFACE: (DiagnosticFactory0<(KtProperty..KtProperty?)>..DiagnosticFactory0<(KtProperty..KtProperty?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [688:53] ==> @NotNull public open fun on(@NotNull element: KtProperty): SimpleDiagnostic<(KtProperty..KtProperty?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'property' @ [688:56] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'property' @ [691:27] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'initializer' @ [691:36] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'property' @ [692:24] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'delegate' @ [692:33] ==> public final val KtProperty.delegate: KtPropertyDelegate?[MyPropertyDescriptor]

'propertyDescriptor' @ [693:24] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'isHeader' @ [693:43] ==> public final val PropertyDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'if (initializer != null) {
            when {
                inInterface -> trace.report(PROPERTY_INITIALIZER_IN_INTERFACE.on(initializer))
                isHeader -> trace.report(HEADER_PROPERTY_INITIALIZER.on(initializer))
                !backingFieldRequired -> trace.report(PROPERTY_INITIALIZER_NO_BACKING_FIELD.on(initializer))
                property.receiverTypeReference != null -> trace.report(EXTENSION_PROPERTY_WITH_BACKING_FIELD.on(initializer))
            }
        }
        else if (delegate != null) {
            if (inInterface) {
                trace.report(DELEGATED_PROPERTY_IN_INTERFACE.on(delegate))
            }
        }
        else {
            val isUninitialized = trace.bindingContext.get(BindingContext.IS_UNINITIALIZED, propertyDescriptor) ?: false
            val isExternal = propertyDescriptor.isEffectivelyExternal()
            if (backingFieldRequired && !inInterface && !propertyDescriptor.isLateInit && !isHeader && isUninitialized && !isExternal) {
                if (propertyDescriptor.extensionReceiverParameter != null && !hasAccessorImplementation) {
                    trace.report(EXTENSION_PROPERTY_MUST_HAVE_ACCESSORS_OR_BE_ABSTRACT.on(property))
                }
                else if (containingDeclaration !is ClassDescriptor || hasAccessorImplementation) {
                    trace.report(MUST_BE_INITIALIZED.on(property))
                }
                else {
                    trace.report(MUST_BE_INITIALIZED_OR_BE_ABSTRACT.on(property))
                }
            }
            else if (property.typeReference == null && !languageVersionSettings.supportsFeature(LanguageFeature.ShortSyntaxForPropertyGetters)) {
                trace.report(Errors.UNSUPPORTED_FEATURE.on(property, LanguageFeature.ShortSyntaxForPropertyGetters to languageVersionSettings))
            }
            else if (noExplicitTypeOrGetterType(property)) {
                trace.report(PROPERTY_WITH_NO_TYPE_NO_INITIALIZER.on(property))
            }
            if (backingFieldRequired && !inInterface && propertyDescriptor.isLateInit && !isUninitialized &&
                trace[MUST_BE_LATEINIT, propertyDescriptor] != true) {
                trace.report(UNNECESSARY_LATEINIT.on(property))
            }
        }' @ [694:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'initializer' @ [694:13] ==> val initializer: KtExpression? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'when {
                inInterface -> trace.report(PROPERTY_INITIALIZER_IN_INTERFACE.on(initializer))
                isHeader -> trace.report(HEADER_PROPERTY_INITIALIZER.on(initializer))
                !backingFieldRequired -> trace.report(PROPERTY_INITIALIZER_NO_BACKING_FIELD.on(initializer))
                property.receiverTypeReference != null -> trace.report(EXTENSION_PROPERTY_WITH_BACKING_FIELD.on(initializer))
            }' @ [695:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'inInterface' @ [696:17] ==> val inInterface: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'trace' @ [696:32] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [696:38] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'PROPERTY_INITIALIZER_IN_INTERFACE' @ [696:45] ==> public final val PROPERTY_INITIALIZER_IN_INTERFACE: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [696:79] ==> @NotNull public open fun on(@NotNull element: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'initializer' @ [696:82] ==> val initializer: KtExpression? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'isHeader' @ [697:17] ==> val isHeader: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'trace' @ [697:29] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [697:35] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'HEADER_PROPERTY_INITIALIZER' @ [697:42] ==> public final val HEADER_PROPERTY_INITIALIZER: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [697:70] ==> @NotNull public open fun on(@NotNull element: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'initializer' @ [697:73] ==> val initializer: KtExpression? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'!' @ [698:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'backingFieldRequired' @ [698:18] ==> val backingFieldRequired: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'trace' @ [698:42] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [698:48] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'PROPERTY_INITIALIZER_NO_BACKING_FIELD' @ [698:55] ==> public final val PROPERTY_INITIALIZER_NO_BACKING_FIELD: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [698:93] ==> @NotNull public open fun on(@NotNull element: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'initializer' @ [698:96] ==> val initializer: KtExpression? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'property' @ [699:17] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [699:26] ==> public final val KtProperty.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'trace' @ [699:59] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [699:65] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'EXTENSION_PROPERTY_WITH_BACKING_FIELD' @ [699:72] ==> public final val EXTENSION_PROPERTY_WITH_BACKING_FIELD: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [699:110] ==> @NotNull public open fun on(@NotNull element: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'initializer' @ [699:113] ==> val initializer: KtExpression? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'if (delegate != null) {
            if (inInterface) {
                trace.report(DELEGATED_PROPERTY_IN_INTERFACE.on(delegate))
            }
        }
        else {
            val isUninitialized = trace.bindingContext.get(BindingContext.IS_UNINITIALIZED, propertyDescriptor) ?: false
            val isExternal = propertyDescriptor.isEffectivelyExternal()
            if (backingFieldRequired && !inInterface && !propertyDescriptor.isLateInit && !isHeader && isUninitialized && !isExternal) {
                if (propertyDescriptor.extensionReceiverParameter != null && !hasAccessorImplementation) {
                    trace.report(EXTENSION_PROPERTY_MUST_HAVE_ACCESSORS_OR_BE_ABSTRACT.on(property))
                }
                else if (containingDeclaration !is ClassDescriptor || hasAccessorImplementation) {
                    trace.report(MUST_BE_INITIALIZED.on(property))
                }
                else {
                    trace.report(MUST_BE_INITIALIZED_OR_BE_ABSTRACT.on(property))
                }
            }
            else if (property.typeReference == null && !languageVersionSettings.supportsFeature(LanguageFeature.ShortSyntaxForPropertyGetters)) {
                trace.report(Errors.UNSUPPORTED_FEATURE.on(property, LanguageFeature.ShortSyntaxForPropertyGetters to languageVersionSettings))
            }
            else if (noExplicitTypeOrGetterType(property)) {
                trace.report(PROPERTY_WITH_NO_TYPE_NO_INITIALIZER.on(property))
            }
            if (backingFieldRequired && !inInterface && propertyDescriptor.isLateInit && !isUninitialized &&
                trace[MUST_BE_LATEINIT, propertyDescriptor] != true) {
                trace.report(UNNECESSARY_LATEINIT.on(property))
            }
        }' @ [702:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'delegate' @ [702:18] ==> val delegate: KtPropertyDelegate? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'inInterface' @ [703:17] ==> val inInterface: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'trace' @ [704:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [704:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'DELEGATED_PROPERTY_IN_INTERFACE' @ [704:30] ==> public final val DELEGATED_PROPERTY_IN_INTERFACE: (DiagnosticFactory0<(KtPropertyDelegate..KtPropertyDelegate?)>..DiagnosticFactory0<(KtPropertyDelegate..KtPropertyDelegate?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [704:62] ==> @NotNull public open fun on(@NotNull element: KtPropertyDelegate): SimpleDiagnostic<(KtPropertyDelegate..KtPropertyDelegate?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'delegate' @ [704:65] ==> val delegate: KtPropertyDelegate? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'trace' @ [708:35] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'bindingContext' @ [708:41] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'get' @ [708:56] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..ReadOnlySlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?), key: (PropertyDescriptor..PropertyDescriptor?)): Boolean? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PropertyDescriptor
    <V : (Any..Any?)> -> Boolean

'IS_UNINITIALIZED' @ [708:75] ==> public final val IS_UNINITIALIZED: (WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'propertyDescriptor' @ [708:93] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [709:30] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'isEffectivelyExternal' @ [709:49] ==> public fun MemberDescriptor.isEffectivelyExternal(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'if (backingFieldRequired && !inInterface && !propertyDescriptor.isLateInit && !isHeader && isUninitialized && !isExternal) {
                if (propertyDescriptor.extensionReceiverParameter != null && !hasAccessorImplementation) {
                    trace.report(EXTENSION_PROPERTY_MUST_HAVE_ACCESSORS_OR_BE_ABSTRACT.on(property))
                }
                else if (containingDeclaration !is ClassDescriptor || hasAccessorImplementation) {
                    trace.report(MUST_BE_INITIALIZED.on(property))
                }
                else {
                    trace.report(MUST_BE_INITIALIZED_OR_BE_ABSTRACT.on(property))
                }
            }
            else if (property.typeReference == null && !languageVersionSettings.supportsFeature(LanguageFeature.ShortSyntaxForPropertyGetters)) {
                trace.report(Errors.UNSUPPORTED_FEATURE.on(property, LanguageFeature.ShortSyntaxForPropertyGetters to languageVersionSettings))
            }
            else if (noExplicitTypeOrGetterType(property)) {
                trace.report(PROPERTY_WITH_NO_TYPE_NO_INITIALIZER.on(property))
            }' @ [710:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'backingFieldRequired' @ [710:17] ==> val backingFieldRequired: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'!' @ [710:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inInterface' @ [710:42] ==> val inInterface: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'!' @ [710:57] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'propertyDescriptor' @ [710:58] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'isLateInit' @ [710:77] ==> public final val PropertyDescriptor.isLateInit: Boolean[MyPropertyDescriptor]

'!' @ [710:91] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isHeader' @ [710:92] ==> val isHeader: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'isUninitialized' @ [710:104] ==> val isUninitialized: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'!' @ [710:123] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isExternal' @ [710:124] ==> val isExternal: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'if (propertyDescriptor.extensionReceiverParameter != null && !hasAccessorImplementation) {
                    trace.report(EXTENSION_PROPERTY_MUST_HAVE_ACCESSORS_OR_BE_ABSTRACT.on(property))
                }
                else if (containingDeclaration !is ClassDescriptor || hasAccessorImplementation) {
                    trace.report(MUST_BE_INITIALIZED.on(property))
                }
                else {
                    trace.report(MUST_BE_INITIALIZED_OR_BE_ABSTRACT.on(property))
                }' @ [711:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'propertyDescriptor' @ [711:21] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [711:40] ==> public final val PropertyDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'!' @ [711:78] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasAccessorImplementation' @ [711:79] ==> val hasAccessorImplementation: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'trace' @ [712:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [712:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'EXTENSION_PROPERTY_MUST_HAVE_ACCESSORS_OR_BE_ABSTRACT' @ [712:34] ==> public final val EXTENSION_PROPERTY_MUST_HAVE_ACCESSORS_OR_BE_ABSTRACT: (DiagnosticFactory0<(KtProperty..KtProperty?)>..DiagnosticFactory0<(KtProperty..KtProperty?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [712:88] ==> @NotNull public open fun on(@NotNull element: KtProperty): SimpleDiagnostic<(KtProperty..KtProperty?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'property' @ [712:91] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'if (containingDeclaration !is ClassDescriptor || hasAccessorImplementation) {
                    trace.report(MUST_BE_INITIALIZED.on(property))
                }
                else {
                    trace.report(MUST_BE_INITIALIZED_OR_BE_ABSTRACT.on(property))
                }' @ [714:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'containingDeclaration' @ [714:26] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'hasAccessorImplementation' @ [714:71] ==> val hasAccessorImplementation: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'trace' @ [715:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [715:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'MUST_BE_INITIALIZED' @ [715:34] ==> public final val MUST_BE_INITIALIZED: (DiagnosticFactory0<(KtProperty..KtProperty?)>..DiagnosticFactory0<(KtProperty..KtProperty?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [715:54] ==> @NotNull public open fun on(@NotNull element: KtProperty): SimpleDiagnostic<(KtProperty..KtProperty?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'property' @ [715:57] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'trace' @ [718:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [718:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'MUST_BE_INITIALIZED_OR_BE_ABSTRACT' @ [718:34] ==> public final val MUST_BE_INITIALIZED_OR_BE_ABSTRACT: (DiagnosticFactory0<(KtProperty..KtProperty?)>..DiagnosticFactory0<(KtProperty..KtProperty?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [718:69] ==> @NotNull public open fun on(@NotNull element: KtProperty): SimpleDiagnostic<(KtProperty..KtProperty?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'property' @ [718:72] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'if (property.typeReference == null && !languageVersionSettings.supportsFeature(LanguageFeature.ShortSyntaxForPropertyGetters)) {
                trace.report(Errors.UNSUPPORTED_FEATURE.on(property, LanguageFeature.ShortSyntaxForPropertyGetters to languageVersionSettings))
            }
            else if (noExplicitTypeOrGetterType(property)) {
                trace.report(PROPERTY_WITH_NO_TYPE_NO_INITIALIZER.on(property))
            }' @ [721:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'property' @ [721:22] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'typeReference' @ [721:31] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'!' @ [721:56] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'languageVersionSettings' @ [721:57] ==> private final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'supportsFeature' @ [721:81] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'LanguageFeature' @ [721:97] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'ShortSyntaxForPropertyGetters' @ [721:113] ==> enum entry ShortSyntaxForPropertyGetters defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'trace' @ [722:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [722:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNSUPPORTED_FEATURE' @ [722:37] ==> public final val UNSUPPORTED_FEATURE: (DiagnosticFactory1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [722:57] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'property' @ [722:60] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'LanguageFeature' @ [722:70] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'ShortSyntaxForPropertyGetters' @ [722:86] ==> enum entry ShortSyntaxForPropertyGetters defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'languageVersionSettings' @ [722:119] ==> private final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'noExplicitTypeOrGetterType' @ [724:22] ==> private final fun noExplicitTypeOrGetterType(property: KtProperty): Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'property' @ [724:49] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'trace' @ [725:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [725:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'PROPERTY_WITH_NO_TYPE_NO_INITIALIZER' @ [725:30] ==> public final val PROPERTY_WITH_NO_TYPE_NO_INITIALIZER: (DiagnosticFactory0<(KtProperty..KtProperty?)>..DiagnosticFactory0<(KtProperty..KtProperty?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [725:67] ==> @NotNull public open fun on(@NotNull element: KtProperty): SimpleDiagnostic<(KtProperty..KtProperty?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'property' @ [725:70] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'backingFieldRequired' @ [727:17] ==> val backingFieldRequired: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'!' @ [727:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inInterface' @ [727:42] ==> val inInterface: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'propertyDescriptor' @ [727:57] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'isLateInit' @ [727:76] ==> public final val PropertyDescriptor.isLateInit: Boolean[MyPropertyDescriptor]

'!' @ [727:90] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUninitialized' @ [727:91] ==> val isUninitialized: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[LocalVariableDescriptor]

'trace' @ [728:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'MUST_BE_LATEINIT' @ [728:23] ==> public final val MUST_BE_LATEINIT: (WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'propertyDescriptor' @ [728:41] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'trace' @ [729:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [729:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNNECESSARY_LATEINIT' @ [729:30] ==> public final val UNNECESSARY_LATEINIT: (DiagnosticFactory0<(KtProperty..KtProperty?)>..DiagnosticFactory0<(KtProperty..KtProperty?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [729:51] ==> @NotNull public open fun on(@NotNull element: KtProperty): SimpleDiagnostic<(KtProperty..KtProperty?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'property' @ [729:54] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkPropertyInitializer[ValueParameterDescriptorImpl]

'property' @ [735:13] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.noExplicitTypeOrGetterType[ValueParameterDescriptorImpl]

'typeReference' @ [735:22] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'property' @ [736:21] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.noExplicitTypeOrGetterType[ValueParameterDescriptorImpl]

'getter' @ [736:30] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'property' @ [736:49] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.noExplicitTypeOrGetterType[ValueParameterDescriptorImpl]

'getter' @ [736:58] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'hasBlockBody' @ [736:67] ==> @Override public open fun hasBlockBody(): Boolean defined in org.jetbrains.kotlin.psi.KtPropertyAccessor[JavaMethodDescriptor]

'property' @ [736:85] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.noExplicitTypeOrGetterType[ValueParameterDescriptorImpl]

'getter' @ [736:94] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'returnTypeReference' @ [736:103] ==> public final val KtPropertyAccessor.returnTypeReference: KtTypeReference?[MyPropertyDescriptor]

'function' @ [739:33] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'typeParameterList' @ [739:42] ==> public final val KtNamedFunction.typeParameterList: KtTypeParameterList?[MyPropertyDescriptor]

'function' @ [740:30] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'nameIdentifier' @ [740:39] ==> public final val KtNamedFunction.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'typeParameterList' @ [741:13] ==> val typeParameterList: KtTypeParameterList? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[LocalVariableDescriptor]

'nameIdentifier' @ [741:42] ==> val nameIdentifier: PsiElement? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[LocalVariableDescriptor]

'typeParameterList' @ [742:13] ==> val typeParameterList: KtTypeParameterList? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[LocalVariableDescriptor]

'textRange' @ [742:31] ==> public final val KtTypeParameterList.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [742:41] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'nameIdentifier' @ [742:55] ==> val nameIdentifier: PsiElement? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[LocalVariableDescriptor]

'textRange' @ [742:70] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [742:80] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'trace' @ [743:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [743:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'DEPRECATED_TYPE_PARAMETER_SYNTAX' @ [743:26] ==> public final val DEPRECATED_TYPE_PARAMETER_SYNTAX: (DiagnosticFactory0<(KtTypeParameterList..KtTypeParameterList?)>..DiagnosticFactory0<(KtTypeParameterList..KtTypeParameterList?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [743:59] ==> @NotNull public open fun on(@NotNull element: KtTypeParameterList): SimpleDiagnostic<(KtTypeParameterList..KtTypeParameterList?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'typeParameterList' @ [743:62] ==> val typeParameterList: KtTypeParameterList? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[LocalVariableDescriptor]

'checkTypeParameterConstraints' @ [745:9] ==> private final fun checkTypeParameterConstraints(typeParameterListOwner: KtTypeParameterListOwner): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'function' @ [745:39] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'checkImplicitCallableType' @ [746:9] ==> private final fun checkImplicitCallableType(declaration: KtCallableDeclaration, descriptor: CallableDescriptor): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'function' @ [746:35] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'functionDescriptor' @ [746:45] ==> value-parameter functionDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'exposedChecker' @ [747:9] ==> private final val exposedChecker: ExposedVisibilityChecker defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkFunction' @ [747:24] ==> public final fun checkFunction(function: KtFunction, functionDescriptor: FunctionDescriptor, visibility: Visibility = ...): Boolean defined in org.jetbrains.kotlin.resolve.ExposedVisibilityChecker[SimpleFunctionDescriptorImpl]

'function' @ [747:38] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'functionDescriptor' @ [747:48] ==> value-parameter functionDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'checkVarargParameters' @ [748:9] ==> private final fun checkVarargParameters(trace: BindingTrace, callableDescriptor: CallableDescriptor): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'trace' @ [748:31] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'functionDescriptor' @ [748:38] ==> value-parameter functionDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'functionDescriptor' @ [750:36] ==> value-parameter functionDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'containingDeclaration' @ [750:55] ==> public final val SimpleFunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'function' @ [751:35] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'hasModifier' @ [751:44] ==> @Override public open fun hasModifier(@NotNull modifier: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'ABSTRACT_KEYWORD' @ [751:65] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'functionDescriptor' @ [752:35] ==> value-parameter functionDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'isEffectivelyExternal' @ [752:54] ==> public fun MemberDescriptor.isEffectivelyExternal(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'if (containingDescriptor is ClassDescriptor) {
            val inInterface = containingDescriptor.kind == ClassKind.INTERFACE
            val isHeaderClass = containingDescriptor.isHeader
            if (hasAbstractModifier && !classCanHaveAbstractMembers(containingDescriptor)) {
                trace.report(ABSTRACT_FUNCTION_IN_NON_ABSTRACT_CLASS.on(function, functionDescriptor.name.asString(), containingDescriptor))
            }
            val hasBody = function.hasBody()
            if (hasBody && hasAbstractModifier) {
                trace.report(ABSTRACT_FUNCTION_WITH_BODY.on(function, functionDescriptor))
            }
            if (!hasBody && inInterface) {
                if (function.hasModifier(KtTokens.PRIVATE_KEYWORD)) {
                    trace.report(PRIVATE_FUNCTION_WITH_NO_BODY.on(function, functionDescriptor))
                }
                if (!hasAbstractModifier && function.hasModifier(KtTokens.OPEN_KEYWORD)) {
                    trace.report(REDUNDANT_OPEN_IN_INTERFACE.on(function))
                }
            }
            if (!hasBody && !hasAbstractModifier && !hasExternalModifier && !inInterface && !isHeaderClass) {
                trace.report(NON_ABSTRACT_FUNCTION_WITH_NO_BODY.on(function, functionDescriptor))
            }
        }
        else /* top-level only */ {
            if (!function.hasBody() && !hasAbstractModifier && !hasExternalModifier && !functionDescriptor.isHeader) {
                trace.report(NON_MEMBER_FUNCTION_NO_BODY.on(function, functionDescriptor))
            }
        }' @ [754:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'containingDescriptor' @ [754:13] ==> val containingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[LocalVariableDescriptor]

'containingDescriptor' @ [755:31] ==> val containingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[LocalVariableDescriptor]

'kind' @ [755:52] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [755:70] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'containingDescriptor' @ [756:33] ==> val containingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[LocalVariableDescriptor]

'isHeader' @ [756:54] ==> public final val ClassDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'hasAbstractModifier' @ [757:17] ==> val hasAbstractModifier: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[LocalVariableDescriptor]

'!' @ [757:40] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'classCanHaveAbstractMembers' @ [757:41] ==> public open fun classCanHaveAbstractMembers(@NotNull p0: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'containingDescriptor' @ [757:69] ==> val containingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[LocalVariableDescriptor]

'trace' @ [758:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [758:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'ABSTRACT_FUNCTION_IN_NON_ABSTRACT_CLASS' @ [758:30] ==> public final val ABSTRACT_FUNCTION_IN_NON_ABSTRACT_CLASS: (DiagnosticFactory2<(KtFunction..KtFunction?), (String..String?), (ClassDescriptor..ClassDescriptor?)>..DiagnosticFactory2<(KtFunction..KtFunction?), (String..String?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [758:70] ==> @NotNull public open fun on(@NotNull element: KtFunction, @NotNull a: String, @NotNull b: ClassDescriptor): ParametrizedDiagnostic<(KtFunction..KtFunction?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'function' @ [758:73] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'functionDescriptor' @ [758:83] ==> value-parameter functionDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'name' @ [758:102] ==> public final val SimpleFunctionDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [758:107] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'containingDescriptor' @ [758:119] ==> val containingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[LocalVariableDescriptor]

'function' @ [760:27] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'hasBody' @ [760:36] ==> @Override public open fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'hasBody' @ [761:17] ==> val hasBody: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[LocalVariableDescriptor]

'hasAbstractModifier' @ [761:28] ==> val hasAbstractModifier: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[LocalVariableDescriptor]

'trace' @ [762:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [762:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'ABSTRACT_FUNCTION_WITH_BODY' @ [762:30] ==> public final val ABSTRACT_FUNCTION_WITH_BODY: (DiagnosticFactory1<(KtFunction..KtFunction?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..DiagnosticFactory1<(KtFunction..KtFunction?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [762:58] ==> @NotNull public open fun on(@NotNull element: KtFunction, @NotNull argument: SimpleFunctionDescriptor): ParametrizedDiagnostic<(KtFunction..KtFunction?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'function' @ [762:61] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'functionDescriptor' @ [762:71] ==> value-parameter functionDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'!' @ [764:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasBody' @ [764:18] ==> val hasBody: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[LocalVariableDescriptor]

'inInterface' @ [764:29] ==> val inInterface: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[LocalVariableDescriptor]

'function' @ [765:21] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'hasModifier' @ [765:30] ==> @Override public open fun hasModifier(@NotNull modifier: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'PRIVATE_KEYWORD' @ [765:51] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'trace' @ [766:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [766:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'PRIVATE_FUNCTION_WITH_NO_BODY' @ [766:34] ==> public final val PRIVATE_FUNCTION_WITH_NO_BODY: (DiagnosticFactory1<(KtFunction..KtFunction?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..DiagnosticFactory1<(KtFunction..KtFunction?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [766:64] ==> @NotNull public open fun on(@NotNull element: KtFunction, @NotNull argument: SimpleFunctionDescriptor): ParametrizedDiagnostic<(KtFunction..KtFunction?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'function' @ [766:67] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'functionDescriptor' @ [766:77] ==> value-parameter functionDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'!' @ [768:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasAbstractModifier' @ [768:22] ==> val hasAbstractModifier: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[LocalVariableDescriptor]

'function' @ [768:45] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'hasModifier' @ [768:54] ==> @Override public open fun hasModifier(@NotNull modifier: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'OPEN_KEYWORD' @ [768:75] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'trace' @ [769:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [769:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'REDUNDANT_OPEN_IN_INTERFACE' @ [769:34] ==> public final val REDUNDANT_OPEN_IN_INTERFACE: (DiagnosticFactory0<(KtModifierListOwner..KtModifierListOwner?)>..DiagnosticFactory0<(KtModifierListOwner..KtModifierListOwner?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [769:62] ==> @NotNull public open fun on(@NotNull element: KtModifierListOwner): SimpleDiagnostic<(KtModifierListOwner..KtModifierListOwner?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'function' @ [769:65] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'!' @ [772:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasBody' @ [772:18] ==> val hasBody: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[LocalVariableDescriptor]

'!' @ [772:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasAbstractModifier' @ [772:30] ==> val hasAbstractModifier: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[LocalVariableDescriptor]

'!' @ [772:53] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasExternalModifier' @ [772:54] ==> val hasExternalModifier: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[LocalVariableDescriptor]

'!' @ [772:77] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inInterface' @ [772:78] ==> val inInterface: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[LocalVariableDescriptor]

'!' @ [772:93] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isHeaderClass' @ [772:94] ==> val isHeaderClass: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[LocalVariableDescriptor]

'trace' @ [773:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [773:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NON_ABSTRACT_FUNCTION_WITH_NO_BODY' @ [773:30] ==> public final val NON_ABSTRACT_FUNCTION_WITH_NO_BODY: (DiagnosticFactory1<(KtFunction..KtFunction?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..DiagnosticFactory1<(KtFunction..KtFunction?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [773:65] ==> @NotNull public open fun on(@NotNull element: KtFunction, @NotNull argument: SimpleFunctionDescriptor): ParametrizedDiagnostic<(KtFunction..KtFunction?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'function' @ [773:68] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'functionDescriptor' @ [773:78] ==> value-parameter functionDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'!' @ [777:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'function' @ [777:18] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'hasBody' @ [777:27] ==> @Override public open fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'!' @ [777:40] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasAbstractModifier' @ [777:41] ==> val hasAbstractModifier: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[LocalVariableDescriptor]

'!' @ [777:64] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasExternalModifier' @ [777:65] ==> val hasExternalModifier: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[LocalVariableDescriptor]

'!' @ [777:88] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'functionDescriptor' @ [777:89] ==> value-parameter functionDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'isHeader' @ [777:108] ==> public final val SimpleFunctionDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'trace' @ [778:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [778:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NON_MEMBER_FUNCTION_NO_BODY' @ [778:30] ==> public final val NON_MEMBER_FUNCTION_NO_BODY: (DiagnosticFactory1<(KtFunction..KtFunction?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..DiagnosticFactory1<(KtFunction..KtFunction?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [778:58] ==> @NotNull public open fun on(@NotNull element: KtFunction, @NotNull argument: SimpleFunctionDescriptor): ParametrizedDiagnostic<(KtFunction..KtFunction?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'function' @ [778:61] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'functionDescriptor' @ [778:71] ==> value-parameter functionDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'functionDescriptor' @ [782:13] ==> value-parameter functionDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'isHeader' @ [782:32] ==> public final val SimpleFunctionDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'checkHeaderFunction' @ [783:13] ==> private final fun checkHeaderFunction(function: KtNamedFunction): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'function' @ [783:33] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'shadowedExtensionChecker' @ [786:9] ==> private final val shadowedExtensionChecker: ShadowedExtensionChecker defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkDeclaration' @ [786:34] ==> public final fun checkDeclaration(declaration: KtDeclaration, descriptor: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.resolve.ShadowedExtensionChecker[SimpleFunctionDescriptorImpl]

'function' @ [786:51] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'functionDescriptor' @ [786:61] ==> value-parameter functionDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkFunction[ValueParameterDescriptorImpl]

'function' @ [790:13] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkHeaderFunction[ValueParameterDescriptorImpl]

'hasBody' @ [790:22] ==> @Override public open fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'trace' @ [791:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [791:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'HEADER_DECLARATION_WITH_BODY' @ [791:26] ==> public final val HEADER_DECLARATION_WITH_BODY: (DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>..DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [791:55] ==> @NotNull public open fun on(@NotNull element: KtDeclaration): SimpleDiagnostic<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'function' @ [791:58] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkHeaderFunction[ValueParameterDescriptorImpl]

'function' @ [794:27] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkHeaderFunction[ValueParameterDescriptorImpl]

'valueParameters' @ [794:36] ==> public final val KtNamedFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'parameter' @ [795:17] ==> val parameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkHeaderFunction[LocalVariableDescriptor]

'hasDefaultValue' @ [795:27] ==> public open fun hasDefaultValue(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'trace' @ [796:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [796:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'HEADER_DECLARATION_WITH_DEFAULT_PARAMETER' @ [796:30] ==> public final val HEADER_DECLARATION_WITH_DEFAULT_PARAMETER: (DiagnosticFactory0<(KtParameter..KtParameter?)>..DiagnosticFactory0<(KtParameter..KtParameter?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [796:72] ==> @NotNull public open fun on(@NotNull element: KtParameter): SimpleDiagnostic<(KtParameter..KtParameter?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'parameter' @ [796:75] ==> val parameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkHeaderFunction[LocalVariableDescriptor]

'descriptor' @ [802:9] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplicitCallableType[ValueParameterDescriptorImpl]

'returnType' @ [802:20] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'unwrap' @ [802:32] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'let' @ [802:42] ==> @InlineOnly public inline fun <T, R> UnwrappedType.let(block: (UnwrappedType) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType
    <R> -> Unit

'declaration' @ [803:26] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplicitCallableType[ValueParameterDescriptorImpl]

'nameIdentifier' @ [803:38] ==> public final val KtCallableDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'declaration' @ [803:56] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplicitCallableType[ValueParameterDescriptorImpl]

'if (declaration.typeReference == null) {
                if (it.isNothing() && !declaration.hasModifier(KtTokens.OVERRIDE_KEYWORD)) {
                    trace.report(
                            (if (declaration is KtProperty) IMPLICIT_NOTHING_PROPERTY_TYPE else IMPLICIT_NOTHING_RETURN_TYPE).on(target)
                    )
                }
                if (it.contains { type -> type.constructor is IntersectionTypeConstructor }) {
                    trace.report(IMPLICIT_INTERSECTION_TYPE.on(target, it))
                }
            }
            else if (it.isNothing() && it is AbbreviatedType) {
                trace.report(
                        (if (declaration is KtProperty) ABBREVIATED_NOTHING_PROPERTY_TYPE else ABBREVIATED_NOTHING_RETURN_TYPE).on(target)
                )
            }' @ [804:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'declaration' @ [804:17] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplicitCallableType[ValueParameterDescriptorImpl]

'typeReference' @ [804:29] ==> public final var KtCallableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'it' @ [805:21] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplicitCallableType.<anonymous>[ValueParameterDescriptorImpl]

'isNothing' @ [805:24] ==> public fun KotlinType.isNothing(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'!' @ [805:39] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [805:40] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplicitCallableType[ValueParameterDescriptorImpl]

'hasModifier' @ [805:52] ==> public abstract fun hasModifier(@NotNull modifier: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [805:73] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'trace' @ [806:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [806:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'if (declaration is KtProperty) IMPLICIT_NOTHING_PROPERTY_TYPE else IMPLICIT_NOTHING_RETURN_TYPE' @ [807:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?), elseBranch: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?)): (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.kotlin.diagnostics.DiagnosticFactory0<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>..org.jetbrains.kotlin.diagnostics.DiagnosticFactory0<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>?)

'declaration' @ [807:34] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplicitCallableType[ValueParameterDescriptorImpl]

'IMPLICIT_NOTHING_PROPERTY_TYPE' @ [807:61] ==> public final val IMPLICIT_NOTHING_PROPERTY_TYPE: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'IMPLICIT_NOTHING_RETURN_TYPE' @ [807:97] ==> public final val IMPLICIT_NOTHING_RETURN_TYPE: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [807:127] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'target' @ [807:130] ==> val target: PsiElement defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplicitCallableType.<anonymous>[LocalVariableDescriptor]

'it' @ [810:21] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplicitCallableType.<anonymous>[ValueParameterDescriptorImpl]

'contains' @ [810:24] ==> public fun KotlinType.contains(predicate: (UnwrappedType) -> Boolean): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'type' @ [810:43] ==> value-parameter type: UnwrappedType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplicitCallableType.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [810:48] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedPropertyDescriptor]

'trace' @ [811:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [811:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'IMPLICIT_INTERSECTION_TYPE' @ [811:34] ==> public final val IMPLICIT_INTERSECTION_TYPE: (DiagnosticFactory1<(PsiElement..PsiElement?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [811:61] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: KotlinType): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'target' @ [811:64] ==> val target: PsiElement defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplicitCallableType.<anonymous>[LocalVariableDescriptor]

'it' @ [811:72] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplicitCallableType.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [814:22] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplicitCallableType.<anonymous>[ValueParameterDescriptorImpl]

'isNothing' @ [814:25] ==> public fun KotlinType.isNothing(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [814:40] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplicitCallableType.<anonymous>[ValueParameterDescriptorImpl]

'trace' @ [815:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [815:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'if (declaration is KtProperty) ABBREVIATED_NOTHING_PROPERTY_TYPE else ABBREVIATED_NOTHING_RETURN_TYPE' @ [816:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?), elseBranch: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?)): (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.kotlin.diagnostics.DiagnosticFactory0<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>..org.jetbrains.kotlin.diagnostics.DiagnosticFactory0<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>?)

'declaration' @ [816:30] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplicitCallableType[ValueParameterDescriptorImpl]

'ABBREVIATED_NOTHING_PROPERTY_TYPE' @ [816:57] ==> public final val ABBREVIATED_NOTHING_PROPERTY_TYPE: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'ABBREVIATED_NOTHING_RETURN_TYPE' @ [816:96] ==> public final val ABBREVIATED_NOTHING_RETURN_TYPE: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [816:129] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'target' @ [816:132] ==> val target: PsiElement defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkImplicitCallableType.<anonymous>[LocalVariableDescriptor]

'propertyDescriptor' @ [823:36] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessors[ValueParameterDescriptorImpl]

'accessors' @ [823:55] ==> public final val PropertyDescriptor.accessors: (MutableList<(PropertyAccessorDescriptor..PropertyAccessorDescriptor?)>..List<(PropertyAccessorDescriptor..PropertyAccessorDescriptor?)>)[MyPropertyDescriptor]

'if (accessorDescriptor is PropertyGetterDescriptor) property.getter else property.setter' @ [824:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtPropertyAccessor?, elseBranch: KtPropertyAccessor?): KtPropertyAccessor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtPropertyAccessor?

'accessorDescriptor' @ [824:32] ==> val accessorDescriptor: (PropertyAccessorDescriptor..PropertyAccessorDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessors[LocalVariableDescriptor]

'property' @ [824:80] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessors[ValueParameterDescriptorImpl]

'getter' @ [824:89] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'property' @ [824:101] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessors[ValueParameterDescriptorImpl]

'setter' @ [824:110] ==> public final val KtProperty.setter: KtPropertyAccessor?[MyPropertyDescriptor]

'if (accessor != null) {
                modifiersChecker.checkModifiersForDeclaration(accessor, accessorDescriptor)
                identifierChecker.checkDeclaration(accessor, trace)
            }
            else {
                modifiersChecker.runDeclarationCheckers(property, accessorDescriptor)
            }' @ [825:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'accessor' @ [825:17] ==> val accessor: KtPropertyAccessor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessors[LocalVariableDescriptor]

'modifiersChecker' @ [826:17] ==> private final val modifiersChecker: ModifiersChecker.ModifiersCheckingProcedure defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkModifiersForDeclaration' @ [826:34] ==> public open fun checkModifiersForDeclaration(@NotNull modifierListOwner: KtDeclaration, @NotNull descriptor: MemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.ModifiersChecker.ModifiersCheckingProcedure[JavaMethodDescriptor]

'accessor' @ [826:63] ==> val accessor: KtPropertyAccessor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessors[LocalVariableDescriptor]

'accessorDescriptor' @ [826:73] ==> val accessorDescriptor: (PropertyAccessorDescriptor..PropertyAccessorDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessors[LocalVariableDescriptor]

'identifierChecker' @ [827:17] ==> private final val identifierChecker: IdentifierChecker defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'checkDeclaration' @ [827:35] ==> public abstract fun checkDeclaration(declaration: KtDeclaration, diagnosticHolder: DiagnosticSink): Unit defined in org.jetbrains.kotlin.resolve.IdentifierChecker[SimpleFunctionDescriptorImpl]

'accessor' @ [827:52] ==> val accessor: KtPropertyAccessor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessors[LocalVariableDescriptor]

'trace' @ [827:62] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'modifiersChecker' @ [830:17] ==> private final val modifiersChecker: ModifiersChecker.ModifiersCheckingProcedure defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'runDeclarationCheckers' @ [830:34] ==> public open fun runDeclarationCheckers(@NotNull declaration: KtDeclaration, @NotNull descriptor: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.resolve.ModifiersChecker.ModifiersCheckingProcedure[JavaMethodDescriptor]

'property' @ [830:57] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessors[ValueParameterDescriptorImpl]

'accessorDescriptor' @ [830:67] ==> val accessorDescriptor: (PropertyAccessorDescriptor..PropertyAccessorDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessors[LocalVariableDescriptor]

'checkAccessor' @ [833:9] ==> private final fun checkAccessor(propertyDescriptor: PropertyDescriptor, accessor: KtPropertyAccessor?, accessorDescriptor: PropertyAccessorDescriptor?): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'propertyDescriptor' @ [833:23] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessors[ValueParameterDescriptorImpl]

'property' @ [833:43] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessors[ValueParameterDescriptorImpl]

'getter' @ [833:52] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'propertyDescriptor' @ [833:60] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessors[ValueParameterDescriptorImpl]

'getter' @ [833:79] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'checkAccessor' @ [834:9] ==> private final fun checkAccessor(propertyDescriptor: PropertyDescriptor, accessor: KtPropertyAccessor?, accessorDescriptor: PropertyAccessorDescriptor?): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'propertyDescriptor' @ [834:23] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessors[ValueParameterDescriptorImpl]

'property' @ [834:43] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessors[ValueParameterDescriptorImpl]

'setter' @ [834:52] ==> public final val KtProperty.setter: KtPropertyAccessor?[MyPropertyDescriptor]

'propertyDescriptor' @ [834:60] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessors[ValueParameterDescriptorImpl]

'setter' @ [834:79] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'tokens' @ [838:23] ==> value-parameter tokens: Collection<PsiElement> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.reportVisibilityModifierDiagnostics[ValueParameterDescriptorImpl]

'trace' @ [839:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [839:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'diagnostic' @ [839:26] ==> value-parameter diagnostic: DiagnosticFactory0<PsiElement> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.reportVisibilityModifierDiagnostics[ValueParameterDescriptorImpl]

'on' @ [839:37] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'token' @ [839:40] ==> val token: PsiElement defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.reportVisibilityModifierDiagnostics[LocalVariableDescriptor]

'accessor' @ [848:13] ==> value-parameter accessor: KtPropertyAccessor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessor[ValueParameterDescriptorImpl]

'accessorDescriptor' @ [848:33] ==> value-parameter accessorDescriptor: PropertyAccessorDescriptor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessor[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [849:13] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessor[ValueParameterDescriptorImpl]

'isHeader' @ [849:32] ==> public final val PropertyDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'accessor' @ [849:44] ==> value-parameter accessor: KtPropertyAccessor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessor[ValueParameterDescriptorImpl]

'hasBody' @ [849:53] ==> @Override public open fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtPropertyAccessor[JavaMethodDescriptor]

'trace' @ [850:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [850:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'HEADER_DECLARATION_WITH_BODY' @ [850:26] ==> public final val HEADER_DECLARATION_WITH_BODY: (DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>..DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [850:55] ==> @NotNull public open fun on(@NotNull element: KtDeclaration): SimpleDiagnostic<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'accessor' @ [850:58] ==> value-parameter accessor: KtPropertyAccessor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessor[ValueParameterDescriptorImpl]

'accessor' @ [853:36] ==> value-parameter accessor: KtPropertyAccessor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessor[ValueParameterDescriptorImpl]

'modifierList' @ [853:45] ==> public final val KtPropertyAccessor.modifierList: KtModifierList?[MyPropertyDescriptor]

'modifiersChecker' @ [854:22] ==> private final val modifiersChecker: ModifiersChecker.ModifiersCheckingProcedure defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'getTokensCorrespondingToModifiers' @ [854:39] ==> @NotNull public open fun getTokensCorrespondingToModifiers(@NotNull modifierList: KtModifierList, @NotNull possibleModifiers: (MutableCollection<(KtModifierKeywordToken..KtModifierKeywordToken?)>..Collection<(KtModifierKeywordToken..KtModifierKeywordToken?)>)): (MutableMap<(KtModifierKeywordToken..KtModifierKeywordToken?), (PsiElement..PsiElement?)>..Map<(KtModifierKeywordToken..KtModifierKeywordToken?), (PsiElement..PsiElement?)>) defined in org.jetbrains.kotlin.resolve.ModifiersChecker.ModifiersCheckingProcedure[JavaMethodDescriptor]

'accessorModifierList' @ [855:17] ==> val accessorModifierList: KtModifierList defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessor[LocalVariableDescriptor]

'setOf' @ [856:17] ==> public fun <T> setOf(vararg elements: (KtModifierKeywordToken..KtModifierKeywordToken?)): Set<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'PUBLIC_KEYWORD' @ [856:32] ==> public final val PUBLIC_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PROTECTED_KEYWORD' @ [856:57] ==> public final val PROTECTED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PRIVATE_KEYWORD' @ [856:85] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'INTERNAL_KEYWORD' @ [856:111] ==> public final val INTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (accessor.isGetter) {
            if (accessorDescriptor.visibility != propertyDescriptor.visibility) {
                reportVisibilityModifierDiagnostics(tokens.values, Errors.GETTER_VISIBILITY_DIFFERS_FROM_PROPERTY_VISIBILITY)
            }
            else {
                reportVisibilityModifierDiagnostics(tokens.values, Errors.REDUNDANT_MODIFIER_IN_GETTER)
            }
        }
        else {
            if (propertyDescriptor.isOverridable
                && accessorDescriptor.visibility == Visibilities.PRIVATE
                && propertyDescriptor.visibility != Visibilities.PRIVATE) {
                if (propertyDescriptor.modality == Modality.ABSTRACT) {
                    reportVisibilityModifierDiagnostics(tokens.values, Errors.PRIVATE_SETTER_FOR_ABSTRACT_PROPERTY)
                }
                else {
                    reportVisibilityModifierDiagnostics(tokens.values, Errors.PRIVATE_SETTER_FOR_OPEN_PROPERTY)
                }
            }
            else {
                val compare = Visibilities.compare(accessorDescriptor.visibility, propertyDescriptor.visibility)
                if (compare == null || compare > 0) {
                    reportVisibilityModifierDiagnostics(tokens.values, Errors.SETTER_VISIBILITY_INCONSISTENT_WITH_PROPERTY_VISIBILITY)
                }
            }
        }' @ [858:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'accessor' @ [858:13] ==> value-parameter accessor: KtPropertyAccessor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessor[ValueParameterDescriptorImpl]

'isGetter' @ [858:22] ==> public final val KtPropertyAccessor.isGetter: Boolean[MyPropertyDescriptor]

'if (accessorDescriptor.visibility != propertyDescriptor.visibility) {
                reportVisibilityModifierDiagnostics(tokens.values, Errors.GETTER_VISIBILITY_DIFFERS_FROM_PROPERTY_VISIBILITY)
            }
            else {
                reportVisibilityModifierDiagnostics(tokens.values, Errors.REDUNDANT_MODIFIER_IN_GETTER)
            }' @ [859:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'accessorDescriptor' @ [859:17] ==> value-parameter accessorDescriptor: PropertyAccessorDescriptor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessor[ValueParameterDescriptorImpl]

'visibility' @ [859:36] ==> public final val PropertyAccessorDescriptor.visibility: Visibility[MyPropertyDescriptor]

'propertyDescriptor' @ [859:50] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessor[ValueParameterDescriptorImpl]

'visibility' @ [859:69] ==> public final val PropertyDescriptor.visibility: Visibility[MyPropertyDescriptor]

'reportVisibilityModifierDiagnostics' @ [860:17] ==> private final fun reportVisibilityModifierDiagnostics(tokens: Collection<PsiElement>, diagnostic: DiagnosticFactory0<PsiElement>): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'tokens' @ [860:53] ==> val tokens: (MutableMap<(KtModifierKeywordToken..KtModifierKeywordToken?), (PsiElement..PsiElement?)>..Map<(KtModifierKeywordToken..KtModifierKeywordToken?), (PsiElement..PsiElement?)>) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessor[LocalVariableDescriptor]

'values' @ [860:60] ==> public abstract val values: MutableCollection<(PsiElement..PsiElement?)> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'GETTER_VISIBILITY_DIFFERS_FROM_PROPERTY_VISIBILITY' @ [860:75] ==> public final val GETTER_VISIBILITY_DIFFERS_FROM_PROPERTY_VISIBILITY: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'reportVisibilityModifierDiagnostics' @ [863:17] ==> private final fun reportVisibilityModifierDiagnostics(tokens: Collection<PsiElement>, diagnostic: DiagnosticFactory0<PsiElement>): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'tokens' @ [863:53] ==> val tokens: (MutableMap<(KtModifierKeywordToken..KtModifierKeywordToken?), (PsiElement..PsiElement?)>..Map<(KtModifierKeywordToken..KtModifierKeywordToken?), (PsiElement..PsiElement?)>) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessor[LocalVariableDescriptor]

'values' @ [863:60] ==> public abstract val values: MutableCollection<(PsiElement..PsiElement?)> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'REDUNDANT_MODIFIER_IN_GETTER' @ [863:75] ==> public final val REDUNDANT_MODIFIER_IN_GETTER: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'if (propertyDescriptor.isOverridable
                && accessorDescriptor.visibility == Visibilities.PRIVATE
                && propertyDescriptor.visibility != Visibilities.PRIVATE) {
                if (propertyDescriptor.modality == Modality.ABSTRACT) {
                    reportVisibilityModifierDiagnostics(tokens.values, Errors.PRIVATE_SETTER_FOR_ABSTRACT_PROPERTY)
                }
                else {
                    reportVisibilityModifierDiagnostics(tokens.values, Errors.PRIVATE_SETTER_FOR_OPEN_PROPERTY)
                }
            }
            else {
                val compare = Visibilities.compare(accessorDescriptor.visibility, propertyDescriptor.visibility)
                if (compare == null || compare > 0) {
                    reportVisibilityModifierDiagnostics(tokens.values, Errors.SETTER_VISIBILITY_INCONSISTENT_WITH_PROPERTY_VISIBILITY)
                }
            }' @ [867:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'propertyDescriptor' @ [867:17] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessor[ValueParameterDescriptorImpl]

'isOverridable' @ [867:36] ==> public val CallableMemberDescriptor.isOverridable: Boolean defined in org.jetbrains.kotlin.descriptors[DeserializedPropertyDescriptor]

'accessorDescriptor' @ [868:20] ==> value-parameter accessorDescriptor: PropertyAccessorDescriptor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessor[ValueParameterDescriptorImpl]

'visibility' @ [868:39] ==> public final val PropertyAccessorDescriptor.visibility: Visibility[MyPropertyDescriptor]

'PRIVATE' @ [868:66] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'propertyDescriptor' @ [869:20] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessor[ValueParameterDescriptorImpl]

'visibility' @ [869:39] ==> public final val PropertyDescriptor.visibility: Visibility[MyPropertyDescriptor]

'PRIVATE' @ [869:66] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'if (propertyDescriptor.modality == Modality.ABSTRACT) {
                    reportVisibilityModifierDiagnostics(tokens.values, Errors.PRIVATE_SETTER_FOR_ABSTRACT_PROPERTY)
                }
                else {
                    reportVisibilityModifierDiagnostics(tokens.values, Errors.PRIVATE_SETTER_FOR_OPEN_PROPERTY)
                }' @ [870:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'propertyDescriptor' @ [870:21] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessor[ValueParameterDescriptorImpl]

'modality' @ [870:40] ==> public final val PropertyDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [870:52] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [870:61] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'reportVisibilityModifierDiagnostics' @ [871:21] ==> private final fun reportVisibilityModifierDiagnostics(tokens: Collection<PsiElement>, diagnostic: DiagnosticFactory0<PsiElement>): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'tokens' @ [871:57] ==> val tokens: (MutableMap<(KtModifierKeywordToken..KtModifierKeywordToken?), (PsiElement..PsiElement?)>..Map<(KtModifierKeywordToken..KtModifierKeywordToken?), (PsiElement..PsiElement?)>) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessor[LocalVariableDescriptor]

'values' @ [871:64] ==> public abstract val values: MutableCollection<(PsiElement..PsiElement?)> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'PRIVATE_SETTER_FOR_ABSTRACT_PROPERTY' @ [871:79] ==> public final val PRIVATE_SETTER_FOR_ABSTRACT_PROPERTY: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'reportVisibilityModifierDiagnostics' @ [874:21] ==> private final fun reportVisibilityModifierDiagnostics(tokens: Collection<PsiElement>, diagnostic: DiagnosticFactory0<PsiElement>): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'tokens' @ [874:57] ==> val tokens: (MutableMap<(KtModifierKeywordToken..KtModifierKeywordToken?), (PsiElement..PsiElement?)>..Map<(KtModifierKeywordToken..KtModifierKeywordToken?), (PsiElement..PsiElement?)>) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessor[LocalVariableDescriptor]

'values' @ [874:64] ==> public abstract val values: MutableCollection<(PsiElement..PsiElement?)> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'PRIVATE_SETTER_FOR_OPEN_PROPERTY' @ [874:79] ==> public final val PRIVATE_SETTER_FOR_OPEN_PROPERTY: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'compare' @ [878:44] ==> @Nullable public open fun compare(@NotNull p0: Visibility, @NotNull p1: Visibility): Int? defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'accessorDescriptor' @ [878:52] ==> value-parameter accessorDescriptor: PropertyAccessorDescriptor? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessor[ValueParameterDescriptorImpl]

'visibility' @ [878:71] ==> public final val PropertyAccessorDescriptor.visibility: Visibility[MyPropertyDescriptor]

'propertyDescriptor' @ [878:83] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessor[ValueParameterDescriptorImpl]

'visibility' @ [878:102] ==> public final val PropertyDescriptor.visibility: Visibility[MyPropertyDescriptor]

'compare' @ [879:21] ==> val compare: Int? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessor[LocalVariableDescriptor]

'compare' @ [879:40] ==> val compare: Int? defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessor[LocalVariableDescriptor]

'reportVisibilityModifierDiagnostics' @ [880:21] ==> private final fun reportVisibilityModifierDiagnostics(tokens: Collection<PsiElement>, diagnostic: DiagnosticFactory0<PsiElement>): Unit defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[SimpleFunctionDescriptorImpl]

'tokens' @ [880:57] ==> val tokens: (MutableMap<(KtModifierKeywordToken..KtModifierKeywordToken?), (PsiElement..PsiElement?)>..Map<(KtModifierKeywordToken..KtModifierKeywordToken?), (PsiElement..PsiElement?)>) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkAccessor[LocalVariableDescriptor]

'values' @ [880:64] ==> public abstract val values: MutableCollection<(PsiElement..PsiElement?)> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'SETTER_VISIBILITY_INCONSISTENT_WITH_PROPERTY_VISIBILITY' @ [880:79] ==> public final val SETTER_VISIBILITY_INCONSISTENT_WITH_PROPERTY_VISIBILITY: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'enumEntryClass' @ [887:25] ==> value-parameter enumEntryClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkEnumEntry[ValueParameterDescriptorImpl]

'containingDeclaration' @ [887:40] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'if (DescriptorUtils.isEnumClass(enumClass)) {
            if (enumClass.isHeader) {
                if (enumEntry.getBody() != null) {
                    trace.report(HEADER_ENUM_ENTRY_WITH_BODY.on(enumEntry))
                }
            }
        }
        else {
            assert(DescriptorUtils.isInterface(enumClass)) { "Enum entry should be declared in enum class: " + enumEntryClass }
        }' @ [888:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isEnumClass' @ [888:29] ==> public open fun isEnumClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'enumClass' @ [888:41] ==> val enumClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkEnumEntry[LocalVariableDescriptor]

'enumClass' @ [889:17] ==> val enumClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkEnumEntry[LocalVariableDescriptor]

'isHeader' @ [889:27] ==> public final val ClassDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'enumEntry' @ [890:21] ==> value-parameter enumEntry: KtEnumEntry defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkEnumEntry[ValueParameterDescriptorImpl]

'getBody' @ [890:31] ==> public final fun getBody(): KtClassBody? defined in org.jetbrains.kotlin.psi.KtEnumEntry[SimpleFunctionDescriptorImpl]

'trace' @ [891:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker[PropertyDescriptorImpl]

'report' @ [891:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'HEADER_ENUM_ENTRY_WITH_BODY' @ [891:34] ==> public final val HEADER_ENUM_ENTRY_WITH_BODY: (DiagnosticFactory0<(KtEnumEntry..KtEnumEntry?)>..DiagnosticFactory0<(KtEnumEntry..KtEnumEntry?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [891:62] ==> @NotNull public open fun on(@NotNull element: KtEnumEntry): SimpleDiagnostic<(KtEnumEntry..KtEnumEntry?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'enumEntry' @ [891:65] ==> value-parameter enumEntry: KtEnumEntry defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkEnumEntry[ValueParameterDescriptorImpl]

'assert' @ [896:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'isInterface' @ [896:36] ==> public open fun isInterface(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'enumClass' @ [896:48] ==> val enumClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkEnumEntry[LocalVariableDescriptor]

'+' @ [896:62] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'enumEntryClass' @ [896:112] ==> value-parameter enumEntryClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkEnumEntry[ValueParameterDescriptorImpl]

'callableDescriptor' @ [901:32] ==> value-parameter callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkVarargParameters[ValueParameterDescriptorImpl]

'valueParameters' @ [901:51] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'filter' @ [901:67] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.filter(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): List<(ValueParameterDescriptor..ValueParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [901:76] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkVarargParameters.<anonymous>[ValueParameterDescriptorImpl]

'varargElementType' @ [901:79] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'varargParameters' @ [903:13] ==> val varargParameters: List<(ValueParameterDescriptor..ValueParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkVarargParameters[LocalVariableDescriptor]

'size' @ [903:30] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'varargParameters' @ [904:31] ==> val varargParameters: List<(ValueParameterDescriptor..ValueParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkVarargParameters[LocalVariableDescriptor]

'DescriptorToSourceUtils' @ [905:44] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [905:68] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'parameter' @ [905:92] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkVarargParameters[LocalVariableDescriptor]

'trace' @ [906:17] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkVarargParameters[ValueParameterDescriptorImpl]

'report' @ [906:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'MULTIPLE_VARARG_PARAMETERS' @ [906:30] ==> public final val MULTIPLE_VARARG_PARAMETERS: (DiagnosticFactory0<(KtParameter..KtParameter?)>..DiagnosticFactory0<(KtParameter..KtParameter?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [906:57] ==> @NotNull public open fun on(@NotNull element: KtParameter): SimpleDiagnostic<(KtParameter..KtParameter?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'parameterDeclaration' @ [906:60] ==> val parameterDeclaration: KtParameter defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkVarargParameters[LocalVariableDescriptor]

'callableDescriptor' @ [910:31] ==> value-parameter callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkVarargParameters[ValueParameterDescriptorImpl]

'builtIns' @ [910:50] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'nullableNothingType' @ [910:59] ==> public final val KotlinBuiltIns.nullableNothingType: SimpleType[MyPropertyDescriptor]

'varargParameters' @ [911:27] ==> val varargParameters: List<(ValueParameterDescriptor..ValueParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkVarargParameters[LocalVariableDescriptor]

'parameter' @ [912:37] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkVarargParameters[LocalVariableDescriptor]

'varargElementType' @ [912:47] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'upperIfFlexible' @ [912:67] ==> public fun KotlinType.upperIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'DEFAULT' @ [913:35] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [913:43] ==> public abstract fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'varargElementType' @ [913:55] ==> val varargElementType: SimpleType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkVarargParameters[LocalVariableDescriptor]

'nullableNothing' @ [913:74] ==> val nullableNothing: SimpleType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkVarargParameters[LocalVariableDescriptor]

'DescriptorToSourceUtils' @ [914:44] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [914:68] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'parameter' @ [914:92] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkVarargParameters[LocalVariableDescriptor]

'trace' @ [915:17] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkVarargParameters[ValueParameterDescriptorImpl]

'report' @ [915:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'FORBIDDEN_VARARG_PARAMETER_TYPE' @ [915:30] ==> public final val FORBIDDEN_VARARG_PARAMETER_TYPE: (DiagnosticFactory1<(KtParameter..KtParameter?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(KtParameter..KtParameter?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [915:62] ==> @NotNull public open fun on(@NotNull element: KtParameter, @NotNull argument: KotlinType): ParametrizedDiagnostic<(KtParameter..KtParameter?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'parameterDeclaration' @ [915:65] ==> val parameterDeclaration: KtParameter defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkVarargParameters[LocalVariableDescriptor]

'varargElementType' @ [915:87] ==> val varargElementType: SimpleType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.checkVarargParameters[LocalVariableDescriptor]

'conflictingTypes' @ [923:28] ==> value-parameter conflictingTypes: MutableSet<KotlinType> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.removeDuplicateTypes[ValueParameterDescriptorImpl]

'iterator' @ [923:45] ==> public abstract fun iterator(): MutableIterator<KotlinType> defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'iterator' @ [924:20] ==> val iterator: MutableIterator<KotlinType> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.removeDuplicateTypes[LocalVariableDescriptor]

'hasNext' @ [924:29] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'iterator' @ [925:28] ==> val iterator: MutableIterator<KotlinType> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.removeDuplicateTypes[LocalVariableDescriptor]

'next' @ [925:37] ==> public abstract fun next(): KotlinType defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'conflictingTypes' @ [926:35] ==> value-parameter conflictingTypes: MutableSet<KotlinType> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.removeDuplicateTypes[ValueParameterDescriptorImpl]

'DEFAULT' @ [927:55] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'equalTypes' @ [927:63] ==> public abstract fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'type' @ [927:74] ==> val type: KotlinType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.removeDuplicateTypes[LocalVariableDescriptor]

'otherType' @ [927:80] ==> val otherType: KotlinType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.removeDuplicateTypes[LocalVariableDescriptor]

'type' @ [928:25] ==> val type: KotlinType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.removeDuplicateTypes[LocalVariableDescriptor]

'otherType' @ [928:34] ==> val otherType: KotlinType defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.removeDuplicateTypes[LocalVariableDescriptor]

'subtypeOf' @ [928:47] ==> val subtypeOf: Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.removeDuplicateTypes[LocalVariableDescriptor]

'iterator' @ [929:25] ==> val iterator: MutableIterator<KotlinType> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.removeDuplicateTypes[LocalVariableDescriptor]

'remove' @ [929:34] ==> public abstract fun remove(): Unit defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'typeParameter' @ [937:17] ==> value-parameter typeParameter: KtTypeParameter defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.hasConstraints[ValueParameterDescriptorImpl]

'name' @ [937:31] ==> public final val KtTypeParameter.name: String?[MyPropertyDescriptor]

'constraints' @ [938:20] ==> value-parameter constraints: List<KtTypeConstraint> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.hasConstraints[ValueParameterDescriptorImpl]

'any' @ [938:32] ==> public inline fun <T> Iterable<KtTypeConstraint>.any(predicate: (KtTypeConstraint) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeConstraint

'it' @ [938:38] ==> value-parameter it: KtTypeConstraint defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.hasConstraints.<anonymous>[ValueParameterDescriptorImpl]

'subjectTypeParameterName' @ [938:41] ==> public final val KtTypeConstraint.subjectTypeParameterName: KtSimpleNameExpression?[MyPropertyDescriptor]

'text' @ [938:67] ==> public final val KtSimpleNameExpression.text: (String..String?)[MyPropertyDescriptor]

'typeParameter' @ [938:75] ==> value-parameter typeParameter: KtTypeParameter defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.hasConstraints[ValueParameterDescriptorImpl]

'name' @ [938:89] ==> public final val KtTypeParameter.name: String?[MyPropertyDescriptor]

'of' @ [941:56] ==> public open fun <E : (Any..Any?)> of(p0: (String..String?), p1: (String..String?), p2: (String..String?)): (ImmutableSet<(String..String?)>..ImmutableSet<(String..String?)>?) defined in com.google.common.collect.ImmutableSet[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'!' @ [944:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'METHOD_OF_ANY_NAMES' @ [944:18] ==> private final val METHOD_OF_ANY_NAMES: (ImmutableSet<(String..String?)>..ImmutableSet<(String..String?)>?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion[PropertyDescriptorImpl]

'contains' @ [944:38] ==> public abstract fun contains(@Nullable element: String?): Boolean defined in com.google.common.collect.ImmutableSet[JavaMethodDescriptor]

'member' @ [944:47] ==> value-parameter member: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.isImplementingMethodOfAny[ValueParameterDescriptorImpl]

'name' @ [944:54] ==> public final val CallableMemberDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [944:59] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'member' @ [945:17] ==> value-parameter member: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.isImplementingMethodOfAny[ValueParameterDescriptorImpl]

'modality' @ [945:24] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [945:36] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [945:45] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'isImplementingMethodOfAnyInternal' @ [947:20] ==> private final fun isImplementingMethodOfAnyInternal(member: CallableMemberDescriptor, visitedClasses: MutableSet<ClassDescriptor>): Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion[SimpleFunctionDescriptorImpl]

'member' @ [947:54] ==> value-parameter member: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.isImplementingMethodOfAny[ValueParameterDescriptorImpl]

'HashSet' @ [947:62] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ClassDescriptor

'member' @ [951:32] ==> value-parameter member: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.isImplementingMethodOfAnyInternal[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [951:39] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'overridden' @ [952:45] ==> val overridden: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.isImplementingMethodOfAnyInternal[LocalVariableDescriptor]

'containingDeclaration' @ [952:56] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'containingDeclaration' @ [953:21] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.isImplementingMethodOfAnyInternal[LocalVariableDescriptor]

'visitedClasses' @ [954:21] ==> value-parameter visitedClasses: MutableSet<ClassDescriptor> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.isImplementingMethodOfAnyInternal[ValueParameterDescriptorImpl]

'contains' @ [954:36] ==> public abstract fun contains(element: ClassDescriptor): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'containingDeclaration' @ [954:45] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.isImplementingMethodOfAnyInternal[LocalVariableDescriptor]

'==' @ [956:21] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'getFqName' @ [956:37] ==> @NotNull public open fun getFqName(@NotNull p0: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'containingDeclaration' @ [956:47] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.isImplementingMethodOfAnyInternal[LocalVariableDescriptor]

'FQ_NAMES' @ [956:88] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'any' @ [956:97] ==> public final val any: (FqNameUnsafe..FqNameUnsafe?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'isHidingParentMemberIfPresent' @ [960:21] ==> private final fun isHidingParentMemberIfPresent(member: CallableMemberDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion[SimpleFunctionDescriptorImpl]

'overridden' @ [960:51] ==> val overridden: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.isImplementingMethodOfAnyInternal[LocalVariableDescriptor]

'visitedClasses' @ [962:17] ==> value-parameter visitedClasses: MutableSet<ClassDescriptor> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.isImplementingMethodOfAnyInternal[ValueParameterDescriptorImpl]

'add' @ [962:32] ==> public abstract fun add(element: ClassDescriptor): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'containingDeclaration' @ [962:36] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.isImplementingMethodOfAnyInternal[LocalVariableDescriptor]

'isImplementingMethodOfAnyInternal' @ [964:21] ==> private final fun isImplementingMethodOfAnyInternal(member: CallableMemberDescriptor, visitedClasses: MutableSet<ClassDescriptor>): Boolean defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion[SimpleFunctionDescriptorImpl]

'overridden' @ [964:55] ==> val overridden: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.isImplementingMethodOfAnyInternal[LocalVariableDescriptor]

'visitedClasses' @ [964:67] ==> value-parameter visitedClasses: MutableSet<ClassDescriptor> defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.isImplementingMethodOfAnyInternal[ValueParameterDescriptorImpl]

'DescriptorToSourceUtils' @ [973:31] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [973:55] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'member' @ [973:79] ==> value-parameter member: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.isHidingParentMemberIfPresent[ValueParameterDescriptorImpl]

'declaration' @ [974:32] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.isHidingParentMemberIfPresent[LocalVariableDescriptor]

'modifierList' @ [974:44] ==> public final val KtNamedDeclaration.modifierList: KtModifierList?[MyPropertyDescriptor]

'!' @ [975:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'modifierList' @ [975:21] ==> val modifierList: KtModifierList defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.isHidingParentMemberIfPresent[LocalVariableDescriptor]

'hasModifier' @ [975:34] ==> public open fun hasModifier(@NotNull tokenType: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [975:55] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'getter' @ [979:13] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'let' @ [979:21] ==> @InlineOnly public inline fun <T, R> PropertyGetterDescriptor.let(block: (PropertyGetterDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyGetterDescriptor
    <R> -> Unit

'it' @ [979:31] ==> value-parameter it: PropertyGetterDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.hasAccessorImplementation.<anonymous>[ValueParameterDescriptorImpl]

'hasBody' @ [979:34] ==> public fun PropertyAccessorDescriptor.hasBody(): Boolean defined in org.jetbrains.kotlin.descriptors in file descriptorPsiUtils.kt[SimpleFunctionDescriptorImpl]

'setter' @ [980:13] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'let' @ [980:21] ==> @InlineOnly public inline fun <T, R> PropertySetterDescriptor.let(block: (PropertySetterDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertySetterDescriptor
    <R> -> Unit

'it' @ [980:31] ==> value-parameter it: PropertySetterDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationsChecker.Companion.hasAccessorImplementation.<anonymous>[ValueParameterDescriptorImpl]

'hasBody' @ [980:34] ==> public fun PropertyAccessorDescriptor.hasBody(): Boolean defined in org.jetbrains.kotlin.descriptors in file descriptorPsiUtils.kt[SimpleFunctionDescriptorImpl]

