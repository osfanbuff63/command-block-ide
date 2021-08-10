package arm32x.minecraft.commandblockide.mixin.client;

import java.util.function.BiFunction;
import java.util.function.Predicate;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.text.OrderedText;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(TextFieldWidget.class)
public interface TextFieldWidgetAccessor {
	@Accessor int getSelectionStart();
	@Accessor int getSelectionEnd();
	@Accessor String getText();
	@Accessor Predicate<String> getTextPredicate();
	@Accessor BiFunction<String, Integer, OrderedText> getRenderTextProvider();
	@Accessor boolean getDrawsBackground();
	@Accessor("editable") boolean isEditable();
	@Accessor int getEditableColor();
	@Accessor int getUneditableColor();
	@Accessor TextRenderer getTextRenderer();
	@Accessor int getFocusedTicks();

	@Invoker void invokeOnChanged(String newText);
	@Invoker int invokeGetMaxLength();
}