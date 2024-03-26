package seedu.address.testutil;

import seedu.address.logic.commands.EditCommand;
import seedu.address.logic.commands.EditCommand.EditCourseMateDescriptor;
import seedu.address.model.coursemate.CourseMate;
import seedu.address.model.coursemate.Email;
import seedu.address.model.coursemate.Name;
import seedu.address.model.coursemate.Phone;

/**
 * A utility class to help with building EditCourseMateDescriptor objects.
 */
public class EditCourseMateDescriptorBuilder {

    private EditCommand.EditCourseMateDescriptor descriptor;

    public EditCourseMateDescriptorBuilder() {
        descriptor = new EditCourseMateDescriptor();
    }

    public EditCourseMateDescriptorBuilder(EditCommand.EditCourseMateDescriptor descriptor) {
        this.descriptor = new EditCommand.EditCourseMateDescriptor(descriptor);
    }

    /**
     * Returns an {@code EditCourseMateDescriptor} with fields containing {@code courseMate}'s details
     */
    public EditCourseMateDescriptorBuilder(CourseMate courseMate) {
        descriptor = new EditCommand.EditCourseMateDescriptor();
        descriptor.setName(courseMate.getName());
        descriptor.setPhone(courseMate.getPhone());
        descriptor.setEmail(courseMate.getEmail());
    }

    /**
     * Sets the {@code Name} of the {@code EditCourseMateDescriptor} that we are building.
     */
    public EditCourseMateDescriptorBuilder withName(String name) {
        descriptor.setName(new Name(name));
        return this;
    }

    /**
     * Sets the {@code Phone} of the {@code EditCourseMateDescriptor} that we are building.
     */
    public EditCourseMateDescriptorBuilder withPhone(String phone) {
        descriptor.setPhone(new Phone(phone));
        return this;
    }

    /**
     * Sets the {@code Email} of the {@code EditCourseMateDescriptor} that we are building.
     */
    public EditCourseMateDescriptorBuilder withEmail(String email) {
        descriptor.setEmail(new Email(email));
        return this;
    }

    public EditCommand.EditCourseMateDescriptor build() {
        return descriptor;
    }
}